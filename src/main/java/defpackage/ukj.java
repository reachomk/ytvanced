package defpackage;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: ukj */
public interface ukj {
    int a(long j);

    int a(BufferInfo bufferInfo, long j);

    void a();

    void a(int i, int i2, long j, int i3);

    void a(int i, boolean z);

    void a(MediaFormat mediaFormat, Surface surface, int i);

    void b();

    void c();

    void d();

    MediaFormat e();

    ByteBuffer[] f();

    ByteBuffer[] g();

    Surface h();

    void i();
}
