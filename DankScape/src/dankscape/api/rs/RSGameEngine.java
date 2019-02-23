/*
 * RSGameEngine.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: bd => java.applet.Applet
public class RSGameEngine extends RSClassWrapper {

    public RSGameEngine(Object ref) {
        super(ref);
    }

    public static long getGarbageCollectorLastCheckTimeMs() {
        return (long)AppletLoader.getSingleton().getFieldValue("GameEngine", "garbageCollectorLastCheckTimeMs", null);
    }

    public static RSSpritePixels[] getHeadIconsHint() {
        Object[] objects = (Object[])AppletLoader.getSingleton().getFieldValue("GameEngine", "headIconsHint", null);
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

    public static Object[] getRSRef_HeadIconsHint() {
        return (Object[])AppletLoader.getSingleton().getFieldValue("GameEngine", "headIconsHint", null);
    }

    public static RSIndexDataBase getVarplayer_ref() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("GameEngine", "varplayer_ref", null);
        RSIndexDataBase wrappers = null;
        if(objects != null)
            wrappers = (RSIndexDataBase)getWrapper(objects);
        return wrappers;
    }

    public java.awt.Canvas getCanvas() {
        return (java.awt.Canvas)AppletLoader.getSingleton().getFieldValue("GameEngine", "canvas", ref);
    }

    public RSMouseWheelHandler getMouseWheelHandler() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("GameEngine", "mouseWheelHandler", ref);
        RSMouseWheelHandler wrappers = null;
        if(objects != null)
            wrappers = (RSMouseWheelHandler)getWrapper(objects);
        return wrappers;
    }

    public static RSIndexedSprite[] getScrollbarSprites() {
        Object[] objects = (Object[])AppletLoader.getSingleton().getFieldValue("GameEngine", "scrollbarSprites", null);
        RSIndexedSprite[] wrappers = null;
        if(objects == null)
            return null;
        wrappers = new RSIndexedSprite[objects.length];
        for(int i = 0;i < objects.length;i++) {
            if(objects[i] != null)
                wrappers[i] = (RSIndexedSprite)getWrapper(objects[i]);
        }
        return wrappers;
    }

    public static Object[] getRSRef_ScrollbarSprites() {
        return (Object[])AppletLoader.getSingleton().getFieldValue("GameEngine", "scrollbarSprites", null);
    }

    public static int getFPS() {
        return (int)AppletLoader.getSingleton().getFieldValue("GameEngine", "FPS", null);
    }

    public static int getShellCount() {
        return (int)AppletLoader.getSingleton().getFieldValue("GameEngine", "shellCount", null);
    }

    public java.awt.datatransfer.Clipboard getClipboard() {
        return (java.awt.datatransfer.Clipboard)AppletLoader.getSingleton().getFieldValue("GameEngine", "clipboard", ref);
    }

    public static long getGarbageCollectorLastCollectionTime() {
        return (long)AppletLoader.getSingleton().getFieldValue("GameEngine", "garbageCollectorLastCollectionTime", null);
    }

    public java.awt.EventQueue getEventQueue() {
        return (java.awt.EventQueue)AppletLoader.getSingleton().getFieldValue("GameEngine", "eventQueue", ref);
    }

    public boolean getHasErrored() {
        return (boolean)AppletLoader.getSingleton().getFieldValue("GameEngine", "hasErrored", ref);
    }

    public static RSGameEngine getShell() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("GameEngine", "shell", null);
        RSGameEngine wrappers = null;
        if(objects != null)
            wrappers = (RSGameEngine)getWrapper(objects);
        return wrappers;
    }

    public static boolean getFocused() {
        return (boolean)AppletLoader.getSingleton().getFieldValue("GameEngine", "focused", null);
    }

    public java.awt.Frame getFrame() {
        return (java.awt.Frame)AppletLoader.getSingleton().getFieldValue("GameEngine", "frame", ref);
    }

}
