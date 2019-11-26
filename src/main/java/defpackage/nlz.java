package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;

/* renamed from: nlz */
public class nlz extends nmi implements nma {
    public final nmd a;
    private final nnn h;
    private boolean j;
    private MediaFormat k;
    private int l;
    private int m;
    private long n;
    private boolean o;
    private boolean p;
    private long q;

    public nlz(nne nne, nmg nmg) {
        this(nne, nmg, null, null, null);
    }

    /* Access modifiers changed, original: protected */
    public void b(int i) {
    }

    /* Access modifiers changed, original: protected */
    public nma h() {
        return this;
    }

    /* Access modifiers changed, original: protected */
    public void n() {
    }

    public nlz(nne nne, nmg nmg, npz npz, Handler handler, nmd nmd) {
        super(new nne[]{nne}, nmg, npz, true, handler, (nml) nmd);
        this.a = nmd;
        this.m = 0;
        this.h = new nnn((byte) 0);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(nmg nmg, nmx nmx) {
        String str = nmx.b;
        boolean z = false;
        if (nwt.a(str)) {
            if ("audio/x-unknown".equals(str)) {
                z = true;
            } else if (nmg.a(str, false) == null) {
                return z;
            } else {
                return true;
            }
        }
        return z;
    }

    /* Access modifiers changed, original: protected|final */
    public final nlo a(nmg nmg, String str, boolean z) {
        this.j = false;
        return super.a(nmg, str, z);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(MediaCodec mediaCodec, boolean z, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        String str = "mime";
        String string = mediaFormat.getString(str);
        if (this.j) {
            mediaFormat.setString(str, "audio/raw");
            mediaCodec.configure(mediaFormat, null, mediaCrypto, 0);
            mediaFormat.setString(str, string);
            this.k = mediaFormat;
            return;
        }
        mediaCodec.configure(mediaFormat, null, mediaCrypto, 0);
        this.k = null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(nmz nmz) {
        super.a(nmz);
        this.l = "audio/raw".equals(nmz.a.b) ? nmz.a.s : 2;
    }

    /* Access modifiers changed, original: protected */
    public void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        MediaFormat mediaFormat2 = this.k;
        Object obj = mediaFormat2 == null ? null : 1;
        String string = obj != null ? mediaFormat2.getString("mime") : "audio/raw";
        if (obj != null) {
            mediaFormat = this.k;
        }
        this.h.a(string, mediaFormat.getInteger("channel-count"), mediaFormat.getInteger("sample-rate"), this.l, 0);
    }

    /* Access modifiers changed, original: protected */
    public void i() {
        this.h.c();
    }

    /* Access modifiers changed, original: protected|final */
    public final void j() {
        this.h.g();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean c() {
        return this.g && !this.h.f();
    }

    /* Access modifiers changed, original: protected */
    public boolean d() {
        return this.h.f() || super.d();
    }

    public long k() {
        long a = this.h.a(c());
        if (a != Long.MIN_VALUE) {
            if (!this.o) {
                a = Math.max(this.n, a);
            }
            this.n = a;
            this.o = false;
        }
        return this.n;
    }

    /* Access modifiers changed, original: protected */
    public void l() {
        this.m = 0;
        try {
            this.h.i();
        } finally {
            super.l();
        }
    }

    /* Access modifiers changed, original: protected */
    public void b(long j) {
        super.b(j);
        this.h.h();
        this.n = j;
        this.o = true;
    }

    /* Access modifiers changed, original: protected */
    public boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, BufferInfo bufferInfo, int i, boolean z) {
        Handler handler;
        MediaCodec mediaCodec2 = mediaCodec;
        BufferInfo bufferInfo2 = bufferInfo;
        int i2 = i;
        nlk nlk;
        if (this.j && (bufferInfo2.flags & 2) != 0) {
            mediaCodec2.releaseOutputBuffer(i2, false);
            return true;
        } else if (z) {
            mediaCodec2.releaseOutputBuffer(i2, false);
            nlk = this.b;
            nlk.g++;
            this.h.d();
            return true;
        } else {
            int i3;
            if (this.h.a()) {
                boolean z2 = this.p;
                boolean f = this.h.f();
                this.p = f;
                if (z2 && !f && this.i == 3) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - this.q;
                    long j3 = this.h.d;
                    long j4 = -1;
                    if (j3 != -1) {
                        j4 = j3 / 1000;
                    }
                    Handler handler2 = this.d;
                    if (!(handler2 == null || this.a == null)) {
                        handler2.post(new nme(this, j4, elapsedRealtime));
                    }
                }
            } else {
                try {
                    i3 = this.m;
                    if (i3 != 0) {
                        this.h.a(i3);
                    } else {
                        i3 = this.h.b();
                        this.m = i3;
                        b(i3);
                    }
                    this.p = false;
                    if (this.i == 3) {
                        this.h.c();
                    }
                } catch (nnu e) {
                    handler = this.d;
                    if (!(handler == null || this.a == null)) {
                        handler.post(new nmc(this, e));
                    }
                    throw new nlq(e);
                }
            }
            try {
                i3 = this.h.a(byteBuffer, bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs);
                this.q = SystemClock.elapsedRealtime();
                if ((i3 & 1) != 0) {
                    n();
                    this.o = true;
                }
                if ((i3 & 2) == 0) {
                    return false;
                }
                mediaCodec2.releaseOutputBuffer(i2, false);
                nlk = this.b;
                nlk.f++;
                return true;
            } catch (nnt e2) {
                handler = this.d;
                if (!(handler == null || this.a == null)) {
                    handler.post(new nmb(this, e2));
                }
                throw new nlq(e2);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void m() {
        this.h.e();
    }

    public void a(int i, Object obj) {
        if (i == 1) {
            this.h.a(((Float) obj).floatValue());
        } else if (i != 2) {
            if (i == 3) {
                i = ((Integer) obj).intValue();
                nnn nnn = this.h;
                if (nnn.b != i) {
                    nnn.b = i;
                    nnn.h();
                    this.m = 0;
                }
            }
        } else {
            this.h.a((PlaybackParams) obj);
        }
    }
}
