/*
 * RSNodeCache.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: ga => java.lang.Object
public class RSNodeCache extends RSClassWrapper {

    public RSNodeCache(Object ref) {
        super(ref);
    }

    public RSNode2LinkedList getList() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("NodeCache", "list", ref);
        RSNode2LinkedList wrappers = null;
        if(objects != null)
            wrappers = (RSNode2LinkedList)getWrapper(objects);
        return wrappers;
    }

    public int getRemainingCapacity() {
        return (int)AppletLoader.getSingleton().getFieldValue("NodeCache", "remainingCapacity", ref);
    }

    public RSHashTable getTable() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("NodeCache", "table", ref);
        RSHashTable wrappers = null;
        if(objects != null)
            wrappers = (RSHashTable)getWrapper(objects);
        return wrappers;
    }

    public int getCapacity() {
        return (int)AppletLoader.getSingleton().getFieldValue("NodeCache", "capacity", ref);
    }

}
