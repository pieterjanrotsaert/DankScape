/*
 * RSClass133.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: ex => java.lang.Object
public class RSClass133 extends RSClassWrapper {

    public RSClass133(Object ref) {
        super(ref);
    }

    public static int getViewport_mouseX() {
        return (int)AppletLoader.getSingleton().getFieldValue("class133", "Viewport_mouseX", null);
    }

    public static int getViewport_mouseY() {
        return (int)AppletLoader.getSingleton().getFieldValue("class133", "Viewport_mouseY", null);
    }

    public static boolean getViewport_false0() {
        return (boolean)AppletLoader.getSingleton().getFieldValue("class133", "Viewport_false0", null);
    }

    public static int getViewport_entityCountAtMouse() {
        return (int)AppletLoader.getSingleton().getFieldValue("class133", "Viewport_entityCountAtMouse", null);
    }

    public static boolean getViewport_containsMouse() {
        return (boolean)AppletLoader.getSingleton().getFieldValue("class133", "Viewport_containsMouse", null);
    }

    public static int[] getViewport_entityIdsAtMouse() {
        return (int[])AppletLoader.getSingleton().getFieldValue("class133", "Viewport_entityIdsAtMouse", null);
    }

}
