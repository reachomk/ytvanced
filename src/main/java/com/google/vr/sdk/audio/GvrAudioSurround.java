package com.google.vr.sdk.audio;

import android.util.Log;
import java.nio.ByteBuffer;

public class GvrAudioSurround {
    public static UnsatisfiedLinkError nativeLibraryLoadException;
    public final int numFramesPerOutputBuffer;
    public final int numInputChannels;
    public long vrAudioSystemRef = 0;

    public GvrAudioSurround(int i, int i2, int i3, int i4) {
        UnsatisfiedLinkError unsatisfiedLinkError = nativeLibraryLoadException;
        if (unsatisfiedLinkError == null) {
            this.vrAudioSystemRef = nativeInitialize(i, i2, i3, 1024);
            this.numFramesPerOutputBuffer = 1024;
            this.numInputChannels = i3;
            return;
        }
        throw unsatisfiedLinkError;
    }

    private native int nativeAddInput(long j, ByteBuffer byteBuffer, int i, int i2);

    private native void nativeFlush(long j);

    private native int nativeGetAvailableInputSize(long j);

    private native int nativeGetAvailableOutputSize(long j);

    private native int nativeGetOutput(long j, ByteBuffer byteBuffer, int i, int i2);

    private native long nativeInitialize(int i, int i2, int i3, int i4);

    private native void nativeRelease(long j);

    private native void nativeSetOrientationQuaternion(long j, float f, float f2, float f3, float f4);

    private native boolean nativeTriggerProcessing(long j);

    /* Access modifiers changed, original: protected */
    public void finalize() {
        try {
            if (this.vrAudioSystemRef != 0) {
                Log.w("GvrAudioSurround", "GvrAudioSurround not correctly released");
                release();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public void release() {
        nativeRelease(this.vrAudioSystemRef);
        this.vrAudioSystemRef = 0;
    }

    public int addInput(ByteBuffer byteBuffer, int i, int i2) {
        return nativeAddInput(this.vrAudioSystemRef, byteBuffer, i, i2);
    }

    public int getOutput(ByteBuffer byteBuffer, int i, int i2) {
        return nativeGetOutput(this.vrAudioSystemRef, byteBuffer, i, i2);
    }

    public void flush() {
        nativeFlush(this.vrAudioSystemRef);
    }

    public void updateNativeOrientation(float f, float f2, float f3, float f4) {
        nativeSetOrientationQuaternion(this.vrAudioSystemRef, f, f2, f3, f4);
    }

    static {
        try {
            System.loadLibrary("gvr_audio");
        } catch (UnsatisfiedLinkError e) {
            nativeLibraryLoadException = e;
        }
    }
}
