/*
 * RSClass44.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;

// Original name: aq => az (WorldMapData) => java.lang.Object
public class RSClass44 extends RSWorldMapData {

    public RSClass44(Object ref) {
        super(ref);
    }

    public static RSSpritePixels[] getHeadIconsPk() {
        Object[] objects = (Object[])AppletLoader.getSingleton().getFieldValue("class44", "headIconsPk", null);
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

    public static Object[] getRSRef_HeadIconsPk() {
        return (Object[])AppletLoader.getSingleton().getFieldValue("class44", "headIconsPk", null);
    }

    public static RSIndexFile getIndexStore255() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("class44", "indexStore255", null);
        RSIndexFile wrappers = null;
        if(objects != null)
            wrappers = (RSIndexFile)getWrapper(objects);
        return wrappers;
    }

    public static RSIndexData getVorbisIndex() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("class44", "vorbisIndex", null);
        RSIndexData wrappers = null;
        if(objects != null)
            wrappers = (RSIndexData)getWrapper(objects);
        return wrappers;
    }

}
