package defpackage;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* renamed from: zii */
final class zii {
    public ukj a;
    public zil b;
    public ByteBuffer[] c;
    public int d = 1;
    private ByteBuffer[] e;

    public zii(ukj ukj, MediaFormat mediaFormat) {
        this.a = ukj;
        this.a.a(mediaFormat, null, 1);
    }

    public final void a() {
        this.d = 2;
        this.a.b();
        this.c = this.a.f();
        this.e = this.a.g();
    }

    public final void b() {
        this.d = 4;
        this.a.c();
    }

    public final void c() {
        this.a.a();
        this.a = null;
    }

    public final void a(long j) {
        if (this.d == 2) {
            BufferInfo bufferInfo = new BufferInfo();
            while (true) {
                int a = this.a.a(bufferInfo, j);
                if (a == -1) {
                    return;
                }
                if (a == -3) {
                    this.e = this.a.g();
                } else if (a == -2) {
                    this.b.a(this, this.a.e());
                } else if (a < 0) {
                    StringBuilder stringBuilder = new StringBuilder(55);
                    stringBuilder.append("Unexpected result from dequeueOutputBuffer: ");
                    stringBuilder.append(a);
                    xtl.c(stringBuilder.toString());
                } else {
                    this.b.a(this, this.e[a], bufferInfo);
                    this.a.a(a, false);
                    if ((bufferInfo.flags & 4) != 0) {
                        this.d = 3;
                        return;
                    }
                }
            }
        }
    }
}
