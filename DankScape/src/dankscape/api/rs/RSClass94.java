/*
 * RSClass94.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: cp => java.lang.Object
public class RSClass94 extends RSClassWrapper {

    public RSClass94(Object ref) {
        super(ref);
    }

    public static int[] getPlayerIndices() {
        return (int[])AppletLoader.getSingleton().getFieldValue("class94", "playerIndices", null);
    }

    public static int getPlayerIndexesCount() {
        return (int)AppletLoader.getSingleton().getFieldValue("class94", "playerIndexesCount", null);
    }

    public static int[] getPlayers_orientations() {
        return (int[])AppletLoader.getSingleton().getFieldValue("class94", "Players_orientations", null);
    }

    public static int[] getPlayers_regions() {
        return (int[])AppletLoader.getSingleton().getFieldValue("class94", "Players_regions", null);
    }

    public static int[] getPlayers_targetIndices() {
        return (int[])AppletLoader.getSingleton().getFieldValue("class94", "Players_targetIndices", null);
    }

}
