/*
 * RSHuffman.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: fa => java.lang.Object
public class RSHuffman extends RSClassWrapper {

    public RSHuffman(Object ref) {
        super(ref);
    }

    public int[] getKeys() {
        return (int[])AppletLoader.getSingleton().getFieldValue("Huffman", "keys", ref);
    }

    public static int[] getLandRegionFileIds() {
        return (int[])AppletLoader.getSingleton().getFieldValue("Huffman", "landRegionFileIds", null);
    }

    public byte[] getBits() {
        return (byte[])AppletLoader.getSingleton().getFieldValue("Huffman", "bits", ref);
    }

    public int[] getMasks() {
        return (int[])AppletLoader.getSingleton().getFieldValue("Huffman", "masks", ref);
    }

    public static short[][] getColorsToReplace() {
        return (short[][])AppletLoader.getSingleton().getFieldValue("Huffman", "colorsToReplace", null);
    }

}