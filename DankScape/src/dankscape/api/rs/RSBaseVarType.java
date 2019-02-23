/*
 * RSBaseVarType.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: h => java.lang.Object
public class RSBaseVarType extends RSClassWrapper {

    public RSBaseVarType(Object ref) {
        super(ref);
    }

    public int getId2() {
        return (int)AppletLoader.getSingleton().getFieldValue("BaseVarType", "id2", ref);
    }

    public static RSSpritePixels[] getMapMarkers() {
        Object[] objects = (Object[])AppletLoader.getSingleton().getFieldValue("BaseVarType", "mapMarkers", null);
        RSSpritePixels[] wrappers = null;
        if(objects == null)
            return null;
        wrappers = new RSSpritePixels[objects.length];
        for(int i = 0;i < objects.length;i++) {
            if(objects[i] != null)
                wrappers[i] = (RSSpritePixels)getWrapper(objects[i]);
        }
        return wrappers;
    }

    public static Object[] getRSRef_MapMarkers() {
        return (Object[])AppletLoader.getSingleton().getFieldValue("BaseVarType", "mapMarkers", null);
    }

    public static RSBaseVarType getSTRING() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("BaseVarType", "STRING", null);
        RSBaseVarType wrappers = null;
        if(objects != null)
            wrappers = (RSBaseVarType)getWrapper(objects);
        return wrappers;
    }

    public int getId() {
        return (int)AppletLoader.getSingleton().getFieldValue("BaseVarType", "id", ref);
    }

    public static RSBaseVarType getINTEGER() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("BaseVarType", "INTEGER", null);
        RSBaseVarType wrappers = null;
        if(objects != null)
            wrappers = (RSBaseVarType)getWrapper(objects);
        return wrappers;
    }

    public static RSBaseVarType getLONG() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("BaseVarType", "LONG", null);
        RSBaseVarType wrappers = null;
        if(objects != null)
            wrappers = (RSBaseVarType)getWrapper(objects);
        return wrappers;
    }

}
