/*
 * RSClass214.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: hz => java.lang.Object
public class RSClass214 extends RSClassWrapper {

    public RSClass214(Object ref) {
        super(ref);
    }

    public static int[] getMapRegions() {
        return (int[])AppletLoader.getSingleton().getFieldValue("class214", "mapRegions", null);
    }

}