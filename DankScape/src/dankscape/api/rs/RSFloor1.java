/*
 * RSFloor1.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: dn => java.lang.Object
public class RSFloor1 extends RSClassWrapper {

    public RSFloor1(Object ref) {
        super(ref);
    }

    public int[][] getSubclassBooks() {
        return (int[][])AppletLoader.getSingleton().getFieldValue("Floor1", "subclassBooks", ref);
    }

    public static int[] getRANGES() {
        return (int[])AppletLoader.getSingleton().getFieldValue("Floor1", "RANGES", null);
    }

    public int[] getClassSubClasses() {
        return (int[])AppletLoader.getSingleton().getFieldValue("Floor1", "classSubClasses", ref);
    }

    public int getMultiplier() {
        return (int)AppletLoader.getSingleton().getFieldValue("Floor1", "multiplier", ref);
    }

    public int[] getClassMasterbooks() {
        return (int[])AppletLoader.getSingleton().getFieldValue("Floor1", "classMasterbooks", ref);
    }

    public static int[] getXList() {
        return (int[])AppletLoader.getSingleton().getFieldValue("Floor1", "xList", null);
    }

    public static int[] getYList() {
        return (int[])AppletLoader.getSingleton().getFieldValue("Floor1", "yList", null);
    }

    public int[] getParitionClassList() {
        return (int[])AppletLoader.getSingleton().getFieldValue("Floor1", "paritionClassList", ref);
    }

    public int[] getClassDimensions() {
        return (int[])AppletLoader.getSingleton().getFieldValue("Floor1", "classDimensions", ref);
    }

}