/*
 * RSAudioEnvelope.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: do => java.lang.Object
public class RSAudioEnvelope extends RSClassWrapper {

    public RSAudioEnvelope(Object ref) {
        super(ref);
    }

    public int getAmplitude() {
        return (int)AppletLoader.getSingleton().getFieldValue("AudioEnvelope", "amplitude", ref);
    }

    public int getForm() {
        return (int)AppletLoader.getSingleton().getFieldValue("AudioEnvelope", "form", ref);
    }

    public int getTicks() {
        return (int)AppletLoader.getSingleton().getFieldValue("AudioEnvelope", "ticks", ref);
    }

    public int getMax() {
        return (int)AppletLoader.getSingleton().getFieldValue("AudioEnvelope", "max", ref);
    }

    public int getStart() {
        return (int)AppletLoader.getSingleton().getFieldValue("AudioEnvelope", "start", ref);
    }

    public int getPhaseIndex() {
        return (int)AppletLoader.getSingleton().getFieldValue("AudioEnvelope", "phaseIndex", ref);
    }

    public int getEnd() {
        return (int)AppletLoader.getSingleton().getFieldValue("AudioEnvelope", "end", ref);
    }

    public int[] getDurations() {
        return (int[])AppletLoader.getSingleton().getFieldValue("AudioEnvelope", "durations", ref);
    }

    public int getStep() {
        return (int)AppletLoader.getSingleton().getFieldValue("AudioEnvelope", "step", ref);
    }

    public int[] getPhases() {
        return (int[])AppletLoader.getSingleton().getFieldValue("AudioEnvelope", "phases", ref);
    }

    public int getSegments() {
        return (int)AppletLoader.getSingleton().getFieldValue("AudioEnvelope", "segments", ref);
    }

}