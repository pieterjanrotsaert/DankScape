/*
 * RSMapping.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: du => java.lang.Object
public class RSMapping extends RSClassWrapper {

    public RSMapping(Object ref) {
        super(ref);
    }

    public int getMux() {
        return (int)AppletLoader.getSingleton().getFieldValue("Mapping", "mux", ref);
    }

    public int[] getSubmapFloors() {
        return (int[])AppletLoader.getSingleton().getFieldValue("Mapping", "submapFloors", ref);
    }

}