package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.PlaybackParams;
import android.os.Handler;
import java.nio.ByteBuffer;

/* renamed from: baer */
public class baer extends nmi implements nma {
    private final bael a;

    public baer(nne nne, Handler handler, baes baes, baee baee) {
        super(nne, nmg.a, null, true, handler, (nml) baes);
        this.a = new bael(handler, baes, baee);
    }

    /* Access modifiers changed, original: protected|final */
    public final nma h() {
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(nmg nmg, nmx nmx) {
        String str = nmx.b;
        boolean z = false;
        if (nwt.a(str)) {
            if ("audio/x-unknown".equals(str)) {
                z = true;
            } else if (!(nmg == null || nmg.a(str, false) == null)) {
                return true;
            }
        }
        return z;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(MediaCodec mediaCodec, boolean z, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        mediaCodec.configure(mediaFormat, null, mediaCrypto, 0);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(nmz nmz) {
        super.a(nmz);
        this.a.b(nmz.a);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.a.a(mediaFormat.getInteger("sample-rate"), mediaFormat.getInteger("channel-count"));
    }

    /* Access modifiers changed, original: protected|final */
    public final void i() {
        this.a.d();
    }

    /* Access modifiers changed, original: protected|final */
    public final void j() {
        this.a.e();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean c() {
        return this.g && !this.a.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean d() {
        return this.a.a();
    }

    public final long k() {
        return this.a.b();
    }

    /* Access modifiers changed, original: protected|final */
    public final void l() {
        try {
            this.a.f();
        } finally {
            super.l();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(long j) {
        super.b(j);
        this.a.a(j);
    }

    public final void a(int i, Object obj) {
        bael bael = this.a;
        if (i == 1) {
            bael.a(((Float) obj).floatValue());
        } else if (i == 2) {
            bael.b.a((PlaybackParams) obj);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(long j, long j2, boolean z) {
        super.a(j, j2, z);
        this.a.g();
        if (c()) {
            this.a.c();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, BufferInfo bufferInfo, int i, boolean z) {
        nlk nlk;
        if (z) {
            nlk = this.b;
            nlk.g++;
        }
        boolean a = this.a.a(byteBuffer, bufferInfo.offset, bufferInfo.size, z);
        if (a) {
            mediaCodec.releaseOutputBuffer(i, false);
            if (!z) {
                nlk = this.b;
                nlk.f++;
                return true;
            }
        }
        return a;
    }
}
