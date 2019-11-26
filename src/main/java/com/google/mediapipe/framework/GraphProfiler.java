package com.google.mediapipe.framework;

public class GraphProfiler {
    private native byte[][] nativeGetCalculatorProfiles(long j);

    private native void nativePause(long j);

    private native void nativeReset(long j);

    private native void nativeResume(long j);
}
