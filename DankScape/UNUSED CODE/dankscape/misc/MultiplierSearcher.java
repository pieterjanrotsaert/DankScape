package dankscape.misc;

import dankscape.analysis.Analysis;
import dankscape.misc.Searcher;
import dankscape.misc.Misc;
import jdk.internal.org.objectweb.asm.Opcodes;
import jdk.internal.org.objectweb.asm.tree.*;

import java.util.Arrays;
import java.util.List;


/**
 * Created by Kyle on 11/5/2015.
 */
public class MultiplierSearcher {

    public static int get(String field, String Owner, boolean Static) {
        int L;
        int[] aR = new int[100];
        int Count = 0;
        for (ClassNode classNode : Analysis.getSingleton().getClassList().values()) {
            if (classNode.name.equals("client"))
                continue;
            List<MethodNode> methodList = classNode.methods;
            for (MethodNode Method : methodList) {
                Searcher search = new Searcher(Method);
                AbstractInsnNode[] instruction = Method.instructions.toArray();
                try {
                    if (!Static) {
                        for (int I = 0; I < 100; ++I) {
                            L = search.find(new int[]{Opcodes.GETFIELD, Opcodes.LDC, Opcodes.IMUL}, I);
                            if (L == -1) {
                                break;
                            }
                            if (((FieldInsnNode) instruction[L]).name.equals(field) && ((FieldInsnNode) instruction[L]).owner.equals(Owner)) {
                                aR[Count] = (int) ((LdcInsnNode) instruction[L + 1]).cst;
                                ++Count;
                            }

                        }
                    } else {
                        for (int I = 0; I < 100; ++I) {
                            L = search.find(new int[]{Opcodes.GETSTATIC, Opcodes.LDC, Opcodes.IMUL}, I);
                            if (L == -1) {
                                break;
                            }
                            if (((FieldInsnNode) instruction[L]).name.equals(field) && ((FieldInsnNode) instruction[L]).owner.equals(Owner)) {
                                aR[Count] = (int) ((LdcInsnNode) instruction[L + 1]).cst;
                                ++Count;
                            }

                        }

                    }

                } catch (Exception e) {
                }
            }


        }
        int[] b = Arrays.copyOf(aR, Count);
        int finalMult = Misc.mode(b);
        return finalMult;
    }
}
