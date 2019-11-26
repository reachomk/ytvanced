package defpackage;

import android.os.Handler;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.ext.opus.OpusDecoder;
import com.google.android.exoplayer2.ext.opus.OpusLibrary;

/* renamed from: oev */
public final class oev extends ocx {
    private OpusDecoder h;

    public oev() {
        this(null, null, new obq[0]);
    }

    public oev(Handler handler, obs obs, obq... obqArr) {
        super(handler, obs, obqArr);
    }

    /* Access modifiers changed, original: protected|final */
    public final int b(nzw nzw) {
        if (OpusLibrary.a()) {
            if ("audio/opus".equalsIgnoreCase(nzw.i)) {
                if (!this.f.a(nzw.v, 2)) {
                    return 1;
                }
                if (nys.a(null, nzw.l)) {
                    return 4;
                }
                return 2;
            }
        }
        return 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final nzw w() {
        return nzw.a(null, "audio/raw", -1, -1, this.h.a, 48000, 2, null, null, 0, null);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ odl a(nzw nzw, ExoMediaCrypto exoMediaCrypto) {
        int i = nzw.j;
        if (i == -1) {
            i = 5760;
        }
        this.h = new OpusDecoder(i, nzw.k, exoMediaCrypto);
        return this.h;
    }
}
