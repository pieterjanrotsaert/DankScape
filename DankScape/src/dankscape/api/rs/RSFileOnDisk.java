/*
 * RSFileOnDisk.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: dg => java.lang.Object
public class RSFileOnDisk extends RSClassWrapper {

    public RSFileOnDisk(Object ref) {
        super(ref);
    }

    public java.io.RandomAccessFile getFile() {
        return (java.io.RandomAccessFile)AppletLoader.getSingleton().getFieldValue("FileOnDisk", "file", ref);
    }

    public long getLength() {
        return (long)AppletLoader.getSingleton().getFieldValue("FileOnDisk", "length", ref);
    }

    public static int getScriptStringStackSize() {
        return (int)AppletLoader.getSingleton().getFieldValue("FileOnDisk", "scriptStringStackSize", null);
    }

    public long getPosition() {
        return (long)AppletLoader.getSingleton().getFieldValue("FileOnDisk", "position", ref);
    }

}
