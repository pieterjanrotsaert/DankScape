/*
 * RSIndexData.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;

// Original name: if => il (IndexDataBase) => java.lang.Object
public class RSIndexData extends RSIndexDataBase {

    public RSIndexData(Object ref) {
        super(ref);
    }

    public RSIndexFile getIndexStore() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("IndexData", "indexStore", ref);
        RSIndexFile wrappers = null;
        if(objects != null)
            wrappers = (RSIndexFile)getWrapper(objects);
        return wrappers;
    }

    public RSIndexFile getReferenceStore() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("IndexData", "referenceStore", ref);
        RSIndexFile wrappers = null;
        if(objects != null)
            wrappers = (RSIndexFile)getWrapper(objects);
        return wrappers;
    }

    public int getIndexReferenceVersion() {
        return (int)AppletLoader.getSingleton().getFieldValue("IndexData", "indexReferenceVersion", ref);
    }

    public boolean[] getValidArchives() {
        return (boolean[])AppletLoader.getSingleton().getFieldValue("IndexData", "validArchives", ref);
    }

    public int getCrcValue() {
        return (int)AppletLoader.getSingleton().getFieldValue("IndexData", "crcValue", ref);
    }

    public int getIndex() {
        return (int)AppletLoader.getSingleton().getFieldValue("IndexData", "index", ref);
    }

    public static java.util.zip.CRC32 getCrc32() {
        return (java.util.zip.CRC32)AppletLoader.getSingleton().getFieldValue("IndexData", "crc32", null);
    }

}
