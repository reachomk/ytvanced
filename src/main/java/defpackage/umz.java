package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;

/* renamed from: umz */
public final class umz extends nmu {
    public boolean j = false;
    private final umx k;

    public umz(umw umw, Context context, nne nne) {
        Handler handler = new Handler(Looper.getMainLooper());
        Object unc = new unc(umw.a);
        super(context, nne, nmg.a, handler, unc);
        this.k = (umx) uhy.a(umw.a);
        uhy.a(unc);
        this.k.a(this);
    }

    public final void a(int i, Object obj) {
        super.a(i, obj);
        if (i == 1) {
            this.k.a((Surface) obj);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean p() {
        return super.p() && this.k.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(MediaCodec mediaCodec, boolean z, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        uhy.b(this.k.a());
        super.a(mediaCodec, z, mediaFormat, mediaCrypto);
    }

    public final void l() {
        super.l();
        this.k.c();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, long j, boolean z) {
        uhy.a(i == 0);
        super.a(i, j, z);
        this.j = true;
        this.k.b();
    }
}
