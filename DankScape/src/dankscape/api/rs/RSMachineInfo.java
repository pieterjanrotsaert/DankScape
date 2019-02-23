/*
 * RSMachineInfo.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;

// Original name: ky => gw (Node) => java.lang.Object
public class RSMachineInfo extends RSNode {

    public RSMachineInfo(Object ref) {
        super(ref);
    }

    public int getJavaVersionMajor() {
        return (int)AppletLoader.getSingleton().getFieldValue("MachineInfo", "javaVersionMajor", ref);
    }

    public int getMaxMemoryMB() {
        return (int)AppletLoader.getSingleton().getFieldValue("MachineInfo", "maxMemoryMB", ref);
    }

    public int getOsVersionType() {
        return (int)AppletLoader.getSingleton().getFieldValue("MachineInfo", "osVersionType", ref);
    }

    public int getOsType() {
        return (int)AppletLoader.getSingleton().getFieldValue("MachineInfo", "osType", ref);
    }

    public boolean getOs64Bit() {
        return (boolean)AppletLoader.getSingleton().getFieldValue("MachineInfo", "os64Bit", ref);
    }

    public int getJavaVersionMinor() {
        return (int)AppletLoader.getSingleton().getFieldValue("MachineInfo", "javaVersionMinor", ref);
    }

    public int getJavaVendorType() {
        return (int)AppletLoader.getSingleton().getFieldValue("MachineInfo", "javaVendorType", ref);
    }

    public int getJavaVersionPatch() {
        return (int)AppletLoader.getSingleton().getFieldValue("MachineInfo", "javaVersionPatch", ref);
    }

}
