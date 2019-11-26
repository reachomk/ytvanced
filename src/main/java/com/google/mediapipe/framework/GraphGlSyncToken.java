package com.google.mediapipe.framework;

final class GraphGlSyncToken implements GlSyncToken {
    private long a;

    private static native void nativeRelease(long j);

    private static native void nativeWaitOnCpu(long j);

    private static native void nativeWaitOnGpu(long j);

    public final void waitOnCpu() {
        long j = this.a;
        if (j != 0) {
            nativeWaitOnCpu(j);
        }
    }

    public final void waitOnGpu() {
        long j = this.a;
        if (j != 0) {
            nativeWaitOnGpu(j);
        }
    }

    public final void release() {
        long j = this.a;
        if (j != 0) {
            nativeRelease(j);
            this.a = 0;
        }
    }

    GraphGlSyncToken(long j) {
        this.a = j;
    }
}
