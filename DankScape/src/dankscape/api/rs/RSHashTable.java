/*
 * RSHashTable.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: gl => java.lang.Object
public class RSHashTable extends RSClassWrapper {

    public RSHashTable(Object ref) {
        super(ref);
    }

    public RSNode getCurrent() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("HashTable", "current", ref);
        RSNode wrappers = null;
        if(objects != null)
            wrappers = (RSNode)getWrapper(objects);
        return wrappers;
    }

    public int getSize() {
        return (int)AppletLoader.getSingleton().getFieldValue("HashTable", "size", ref);
    }

    public RSNode[] getBuckets() {
        Object[] objects = (Object[])AppletLoader.getSingleton().getFieldValue("HashTable", "buckets", ref);
        RSNode[] wrappers = null;
        if(objects == null)
            return null;
        wrappers = new RSNode[objects.length];
        for(int i = 0;i < objects.length;i++) {
            if(objects[i] != null)
                wrappers[i] = (RSNode)getWrapper(objects[i]);
        }
        return wrappers;
    }

    public Object[] getRSRef_Buckets() {
        return (Object[])AppletLoader.getSingleton().getFieldValue("HashTable", "buckets", ref);
    }

    public int getIndex() {
        return (int)AppletLoader.getSingleton().getFieldValue("HashTable", "index", ref);
    }

    public RSNode getCurrentGet() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("HashTable", "currentGet", ref);
        RSNode wrappers = null;
        if(objects != null)
            wrappers = (RSNode)getWrapper(objects);
        return wrappers;
    }

}
