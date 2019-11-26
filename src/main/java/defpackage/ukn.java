package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: ukn */
public final class ukn implements ukj {
    private final MediaCodec a;

    public ukn(MediaCodec mediaCodec) {
        uhy.b(true);
        this.a = (MediaCodec) uhy.a((Object) mediaCodec);
    }

    public final boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public final void a() {
        this.a.release();
    }

    public final void a(MediaFormat mediaFormat, Surface surface, int i) {
        this.a.configure(mediaFormat, surface, null, i);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void b() {
        this.a.start();
    }

    public final void c() {
        this.a.stop();
    }

    public final void d() {
        this.a.flush();
    }

    public final void a(int i, int i2, long j, int i3) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    public final String toString() {
        return this.a.toString();
    }

    public final int a(long j) {
        return this.a.dequeueInputBuffer(j);
    }

    public final int a(BufferInfo bufferInfo, long j) {
        return this.a.dequeueOutputBuffer(bufferInfo, j);
    }

    public final void a(int i, boolean z) {
        this.a.releaseOutputBuffer(i, z);
    }

    public final MediaFormat e() {
        return this.a.getOutputFormat();
    }

    public final ByteBuffer[] f() {
        return this.a.getInputBuffers();
    }

    public final ByteBuffer[] g() {
        return this.a.getOutputBuffers();
    }

    public final Surface h() {
        return this.a.createInputSurface();
    }

    public final void i() {
        this.a.signalEndOfInputStream();
    }
}
