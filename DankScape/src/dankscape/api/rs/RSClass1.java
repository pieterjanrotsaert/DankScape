/*
 * RSClass1.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: v => java.lang.Object
public class RSClass1 extends RSClassWrapper {

    public RSClass1(Object ref) {
        super(ref);
    }

    public static RSSoundTask getTask() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("class1", "task", null);
        RSSoundTask wrappers = null;
        if(objects != null)
            wrappers = (RSSoundTask)getWrapper(objects);
        return wrappers;
    }

}
