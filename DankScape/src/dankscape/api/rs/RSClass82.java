/*
 * RSClass82.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: cd => java.lang.Object
public class RSClass82 extends RSClassWrapper {

    public RSClass82(Object ref) {
        super(ref);
    }

    public static int getScriptStackCount() {
        return (int)AppletLoader.getSingleton().getFieldValue("class82", "scriptStackCount", null);
    }

    public static int getIntStackSize() {
        return (int)AppletLoader.getSingleton().getFieldValue("class82", "intStackSize", null);
    }

    public static RSScriptState[] getScriptStack() {
        Object[] objects = (Object[])AppletLoader.getSingleton().getFieldValue("class82", "scriptStack", null);
        RSScriptState[] wrappers = null;
        if(objects == null)
            return null;
        wrappers = new RSScriptState[objects.length];
        for(int i = 0;i < objects.length;i++) {
            if(objects[i] != null)
                wrappers[i] = (RSScriptState)getWrapper(objects[i]);
        }
        return wrappers;
    }

    public static Object[] getRSRef_ScriptStack() {
        return (Object[])AppletLoader.getSingleton().getFieldValue("class82", "scriptStack", null);
    }

    public static int[] getIntStack() {
        return (int[])AppletLoader.getSingleton().getFieldValue("class82", "intStack", null);
    }

    public static int[] getScriptLocalInts() {
        return (int[])AppletLoader.getSingleton().getFieldValue("class82", "scriptLocalInts", null);
    }

    public static java.lang.String[] getScriptStringStack() {
        return (java.lang.String[])AppletLoader.getSingleton().getFieldValue("class82", "scriptStringStack", null);
    }

    public static int[][] getSHAPE_VERTICES() {
        return (int[][])AppletLoader.getSingleton().getFieldValue("class82", "SHAPE_VERTICES", null);
    }

    public static java.lang.String[] getScriptLocalStrings() {
        return (java.lang.String[])AppletLoader.getSingleton().getFieldValue("class82", "scriptLocalStrings", null);
    }

}
