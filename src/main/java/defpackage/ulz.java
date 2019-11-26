package defpackage;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;

/* renamed from: ulz */
public final class ulz implements umc {
    private final MediaMuxer a;

    public ulz(String str) {
        this.a = new MediaMuxer(str, 0);
    }

    public final void a(int i) {
        this.a.setOrientationHint(i);
    }

    public final void a() {
        this.a.start();
    }

    public final void b() {
        this.a.stop();
    }

    public final int a(MediaFormat mediaFormat) {
        return this.a.addTrack(mediaFormat);
    }

    public final void a(int i, ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        this.a.writeSampleData(i, byteBuffer, bufferInfo);
    }

    public final void c() {
        this.a.release();
    }
}
