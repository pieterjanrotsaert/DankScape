/*
 * RSIntegerNode.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;

// Original name: hc => gw (Node) => java.lang.Object
public class RSIntegerNode extends RSNode {

    public RSIntegerNode(Object ref) {
        super(ref);
    }

    public int getValue() {
        return (int)AppletLoader.getSingleton().getFieldValue("IntegerNode", "value", ref);
    }

}
