/*
 * RSGZipDecompressor.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: fc => java.lang.Object
public class RSGZipDecompressor extends RSClassWrapper {

    public RSGZipDecompressor(Object ref) {
        super(ref);
    }

    public java.util.zip.Inflater getInflator() {
        return (java.util.zip.Inflater)AppletLoader.getSingleton().getFieldValue("GZipDecompressor", "inflator", ref);
    }

}
