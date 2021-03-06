/*
 * RSKeyFocusListener.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: ap => java.lang.Object
public class RSKeyFocusListener extends RSClassWrapper {

    public RSKeyFocusListener(Object ref) {
        super(ref);
    }

    public static RSKeyFocusListener getKeyboard() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("KeyFocusListener", "keyboard", null);
        RSKeyFocusListener wrappers = null;
        if(objects != null)
            wrappers = (RSKeyFocusListener)getWrapper(objects);
        return wrappers;
    }

    public static boolean[] getKeyPressed() {
        return (boolean[])AppletLoader.getSingleton().getFieldValue("KeyFocusListener", "keyPressed", null);
    }

    public static int[] getKeyHandler_keyCodes() {
        return (int[])AppletLoader.getSingleton().getFieldValue("KeyFocusListener", "KeyHandler_keyCodes", null);
    }

    public static int getKeyboardIdleTicks() {
        return (int)AppletLoader.getSingleton().getFieldValue("KeyFocusListener", "keyboardIdleTicks", null);
    }

}
