package com.google.mediapipe.framework;

public class GraphTextureFrame implements TextureFrame {
    private long a;
    private int b;
    private int c;
    private int d;
    private long e = Long.MIN_VALUE;

    GraphTextureFrame(long j, long j2) {
        this.a = j;
        this.b = nativeGetTextureName(j);
        this.c = nativeGetWidth(this.a);
        this.d = nativeGetHeight(this.a);
        this.e = j2;
    }

    private native int nativeGetHeight(long j);

    private native int nativeGetTextureName(long j);

    private native int nativeGetWidth(long j);

    private native void nativeReleaseBuffer(long j);

    public final int getTextureName() {
        return this.b;
    }

    public final int getWidth() {
        return this.c;
    }

    public final int getHeight() {
        return this.d;
    }

    public final long getTimestamp() {
        return this.e;
    }

    public final void release() {
        long j = this.a;
        if (j != 0) {
            nativeReleaseBuffer(j);
            this.a = 0;
        }
    }

    public final void release(GlSyncToken glSyncToken) {
        glSyncToken.release();
        release();
    }
}
