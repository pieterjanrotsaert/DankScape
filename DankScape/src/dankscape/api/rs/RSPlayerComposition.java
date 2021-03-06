/*
 * RSPlayerComposition.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: hl => java.lang.Object
public class RSPlayerComposition extends RSClassWrapper {

    public RSPlayerComposition(Object ref) {
        super(ref);
    }

    public int[] getEquipmentIds() {
        return (int[])AppletLoader.getSingleton().getFieldValue("PlayerComposition", "equipmentIds", ref);
    }

    public int getTransformedNpcId() {
        return (int)AppletLoader.getSingleton().getFieldValue("PlayerComposition", "transformedNpcId", ref);
    }

    public boolean getIsFemale() {
        return (boolean)AppletLoader.getSingleton().getFieldValue("PlayerComposition", "isFemale", ref);
    }

    public long getHash() {
        return (long)AppletLoader.getSingleton().getFieldValue("PlayerComposition", "hash", ref);
    }

    public int[] getBodyPartColours() {
        return (int[])AppletLoader.getSingleton().getFieldValue("PlayerComposition", "bodyPartColours", ref);
    }

}
