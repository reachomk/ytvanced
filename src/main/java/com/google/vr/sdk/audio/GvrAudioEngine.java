package com.google.vr.sdk.audio;

import android.content.Context;

public class GvrAudioEngine {
    public static UnsatisfiedLinkError nativeLibraryLoadException;

    private native int nativeCreateSoundObject(long j, String str);

    private native int nativeCreateSoundfield(long j, String str);

    private native int nativeCreateStereoSound(long j, String str);

    private native void nativeEnableRoom(long j, boolean z);

    private native void nativeEnableStereoSpeakerMode(long j, boolean z);

    private native long nativeInitialize(ClassLoader classLoader, Context context, int i);

    private native boolean nativeIsSoundPlaying(long j, int i);

    private native boolean nativeIsSourceIdValid(long j, int i);

    private native void nativePause(long j);

    private native void nativePauseSound(long j, int i);

    private native void nativePlaySound(long j, int i, boolean z);

    private native boolean nativePreloadSoundFile(long j, String str);

    private native void nativeRelease(long j);

    private native void nativeResume(long j);

    private native void nativeResumeSound(long j, int i);

    private native void nativeSetHeadPosition(long j, float f, float f2, float f3);

    private native void nativeSetHeadRotation(long j, float f, float f2, float f3, float f4);

    private native void nativeSetRoomProperties(long j, float f, float f2, float f3, int i, int i2, int i3);

    private native void nativeSetRoomReverbAdjustments(long j, float f, float f2, float f3);

    private native void nativeSetSoundObjectDistanceRolloffModel(long j, int i, int i2, float f, float f2);

    private native void nativeSetSoundObjectPosition(long j, int i, float f, float f2, float f3);

    private native void nativeSetSoundVolume(long j, int i, float f);

    private native void nativeSetSoundfieldRotation(long j, int i, float f, float f2, float f3, float f4);

    private native void nativeStopSound(long j, int i);

    private native void nativeUnloadSoundFile(long j, String str);

    private native void nativeUpdate(long j);

    /* Access modifiers changed, original: protected */
    public void finalize() {
        throw null;
    }

    static {
        try {
            System.loadLibrary("gvr_audio");
        } catch (UnsatisfiedLinkError e) {
            nativeLibraryLoadException = e;
        }
    }
}
