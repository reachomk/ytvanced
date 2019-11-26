package com.google.mediapipe.framework;

public class Packet {
    public long a;

    public static Packet create(long j) {
        return new Packet(j);
    }

    private native long nativeCopyPacket(long j);

    private native long nativeGetTimestamp(long j);

    private native void nativeReleasePacket(long j);

    public final long a() {
        return nativeGetTimestamp(this.a);
    }

    public final Packet b() {
        return new Packet(nativeCopyPacket(this.a));
    }

    public final void c() {
        long j = this.a;
        if (j != 0) {
            nativeReleasePacket(j);
            this.a = 0;
        }
    }

    private Packet(long j) {
        this.a = j;
    }
}
