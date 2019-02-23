/*
 * RSTexture.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;

// Original name: dz => gw (Node) => java.lang.Object
public class RSTexture extends RSNode {

    public RSTexture(Object ref) {
        super(ref);
    }

    public boolean getLoaded() {
        return (boolean)AppletLoader.getSingleton().getFieldValue("Texture", "loaded", ref);
    }

    public int[] getPixels() {
        return (int[])AppletLoader.getSingleton().getFieldValue("Texture", "pixels", ref);
    }

    public int[] getFileIds() {
        return (int[])AppletLoader.getSingleton().getFieldValue("Texture", "fileIds", ref);
    }

}
