/*
 * RSDirectByteBuffer.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;

// Original name: gk => gj (AbstractByteBuffer) => java.lang.Object
public class RSDirectByteBuffer extends RSAbstractByteBuffer {

    public RSDirectByteBuffer(Object ref) {
        super(ref);
    }

    public java.nio.ByteBuffer getBuffer() {
        return (java.nio.ByteBuffer)AppletLoader.getSingleton().getFieldValue("DirectByteBuffer", "buffer", ref);
    }

}
