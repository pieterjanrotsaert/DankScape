/*
 * RSClass150.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: eb => java.lang.Object
public class RSClass150 extends RSClassWrapper {

    public RSClass150(Object ref) {
        super(ref);
    }

    public static int getPort2() {
        return (int)AppletLoader.getSingleton().getFieldValue("class150", "port2", null);
    }

}
