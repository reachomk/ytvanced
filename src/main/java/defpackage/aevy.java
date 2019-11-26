package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Process;
import java.nio.ByteBuffer;

/* renamed from: aevy */
public final class aevy extends nlz {
    private final aewi h;
    private final aewb j;
    private final odc k;
    private long l;
    private long m;
    private boolean n;
    private long o;
    private boolean p;
    private float q;
    private boolean r;
    private ByteBuffer s;
    private int t;

    public aevy(nne nne, nmg nmg, npz npz, Handler handler, aewb aewb, aewi aewi, boolean z) {
        super(nne, nmg, npz, handler, aewb);
        this.j = aewb;
        this.h = aewi;
        if (z) {
            this.k = new odc();
            this.m = -1;
            this.p = true;
            a(1.0f);
            this.n = false;
            this.r = true;
            this.s = null;
            this.t = -1;
            return;
        }
        this.k = null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, long j, boolean z) {
        super.a(i, j, z);
        a(1.0f);
        if (Process.getThreadPriority(Process.myTid()) != -16) {
            Process.setThreadPriority(-16);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void i() {
        super.i();
        this.h.b();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean d() {
        if (!super.d()) {
            return false;
        }
        this.h.a();
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final long g() {
        long g = super.g();
        this.h.a(g);
        return g;
    }

    private final void a(float f) {
        if (this.k != null) {
            boolean z = false;
            if (f >= 0.25f && f <= 2.0f) {
                z = true;
            }
            amqw.a(z, (Object) "Playback rate must be in the interval [0.25, 2.0]");
            if (this.q != f) {
                this.q = f;
                this.k.a(f);
            }
        }
    }

    public final long k() {
        if (this.k == null) {
            return super.k();
        }
        if (this.n) {
            this.n = false;
            try {
                a(this.l);
            } catch (nlq unused) {
            }
            return k();
        }
        long k = super.k();
        long j = this.m;
        if (j == -1) {
            this.m = k;
            this.l = k;
        } else {
            this.m = k;
            k = (((k - j) * ((long) ((int) (this.q * 100.0f)))) / 100) + this.l;
            this.l = k;
        }
        return k;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, BufferInfo bufferInfo, int i, boolean z) {
        ByteBuffer byteBuffer2;
        BufferInfo bufferInfo2 = bufferInfo;
        if (j - bufferInfo2.presentationTimeUs > 5000000) {
            Object[] objArr = new Object[]{Long.valueOf(j / 1000), Long.valueOf(bufferInfo2.presentationTimeUs / 1000), Long.valueOf((j - bufferInfo2.presentationTimeUs) / 1000)};
        }
        odc odc = this.k;
        if (odc == null) {
            byteBuffer2 = byteBuffer;
        } else {
            ByteBuffer f;
            if (!z && this.r) {
                if (this.q != 1.0f) {
                    odc.a(byteBuffer);
                    f = this.k.f();
                    bufferInfo2.size = f.limit();
                } else {
                    f = byteBuffer;
                }
                this.s = f;
                if (this.p) {
                    this.p = false;
                    this.o = bufferInfo2.presentationTimeUs;
                } else {
                    long j3 = this.o;
                    int i2 = bufferInfo2.size;
                    int i3 = this.k.b;
                    j3 += (((long) i2) * 1000000) / ((long) ((i3 + i3) * this.t));
                    this.o = j3;
                    bufferInfo2.presentationTimeUs = (j3 / 1000) * 1000;
                }
            } else {
                f = this.s;
            }
            byteBuffer2 = f;
        }
        boolean a = super.a(j, j2, mediaCodec, byteBuffer2, bufferInfo, i, z);
        this.r = a;
        return a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        if (this.k != null) {
            this.t = mediaFormat.getInteger("sample-rate");
            try {
                if (this.k.a(this.t, mediaFormat.getInteger("channel-count"), 2)) {
                    this.k.h();
                }
            } catch (obp e) {
                xtl.b("SonicAudioProcessor doesn't support ENCODING_PCM_16BIT!?", e);
            }
        }
        super.a(mediaCodec, mediaFormat);
    }

    public final void a(int i, Object obj) {
        if (i == 100) {
            a(((Float) obj).floatValue());
        } else {
            super.a(i, obj);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void n() {
        this.n = true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(long j) {
        super.b(j);
        this.m = -1;
        this.p = true;
        odc odc = this.k;
        if (!(odc == null || odc.b == -1)) {
            odc.h();
        }
        this.r = true;
        this.s = null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(int i) {
        this.j.a(i);
    }

    public final void l() {
        this.j.a();
        super.l();
    }
}
