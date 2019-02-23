/*
 * RSSoundEffect3.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: di => java.lang.Object
public class RSSoundEffect3 extends RSClassWrapper {

    public RSSoundEffect3(Object ref) {
        super(ref);
    }

    public int[] getUnity() {
        return (int[])AppletLoader.getSingleton().getFieldValue("SoundEffect3", "unity", ref);
    }

    public static float getFowardMinimisedCoefficientMultiplier() {
        return (float)AppletLoader.getSingleton().getFieldValue("SoundEffect3", "fowardMinimisedCoefficientMultiplier", null);
    }

    public static int[][] getCoefficients() {
        return (int[][])AppletLoader.getSingleton().getFieldValue("SoundEffect3", "coefficients", null);
    }

    public static float[][] getMinimisedCoefficients() {
        return (float[][])AppletLoader.getSingleton().getFieldValue("SoundEffect3", "minimisedCoefficients", null);
    }

    public int[][][] getMagnitudes() {
        return (int[][][])AppletLoader.getSingleton().getFieldValue("SoundEffect3", "magnitudes", ref);
    }

    public static int getFowardMultiplier() {
        return (int)AppletLoader.getSingleton().getFieldValue("SoundEffect3", "fowardMultiplier", null);
    }

    public int[][][] getPhases() {
        return (int[][][])AppletLoader.getSingleton().getFieldValue("SoundEffect3", "phases", ref);
    }

    public int[] getPairs() {
        return (int[])AppletLoader.getSingleton().getFieldValue("SoundEffect3", "pairs", ref);
    }

}