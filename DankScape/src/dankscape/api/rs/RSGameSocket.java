/*
 * RSGameSocket.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: fp => java.lang.Object
public class RSGameSocket extends RSClassWrapper {

    public RSGameSocket(Object ref) {
        super(ref);
    }

    public static RSMachineInfo getPlatformInfo() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("GameSocket", "platformInfo", null);
        RSMachineInfo wrappers = null;
        if(objects != null)
            wrappers = (RSMachineInfo)getWrapper(objects);
        return wrappers;
    }

}
