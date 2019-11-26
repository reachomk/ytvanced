package defpackage;

import android.media.MediaCodec.CryptoException;
import android.text.TextUtils;
import android.view.Surface;

/* renamed from: afdh */
final class afdh implements aewc, aeww {
    private final afiz a = new afiz();
    private final long b = this.c.o.a();
    private final /* synthetic */ afbo c;

    afdh(afbo afbo) {
        this.c = afbo;
    }

    public final void a(Surface surface) {
        afkh afkh = this.c.p;
        if (afkh != null) {
            afkh.c(0);
            this.c.p.a(surface);
        }
    }

    public final void a(int i, int i2) {
        b(i, i2);
    }

    public final void b(int i, int i2) {
        afbo afbo = this.c;
        afbo.u = i;
        afbo.v = i2;
        afkh afkh = afbo.p;
        if (afkh != null && afkh.n()) {
            afbo afbo2 = this.c;
            afbo2.p.a(afbo2.u, afbo2.v);
        }
    }

    public final void a(nmm nmm) {
        xtl.a("Error with ExoPlayer video decoder initialization.", (Throwable) nmm);
    }

    public final void a(CryptoException cryptoException) {
        xtl.a("Video CryptoError with ExoPlayer.", (Throwable) cryptoException);
    }

    public final void a(int i, long j) {
        long a = this.c.o.a();
        afgv afgv = this.c.E;
        if (afgv != null) {
            aahr[] aahrArr = afgv.a;
            int length = aahrArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (!aahrArr[i2].A()) {
                    i2++;
                } else if (this.c.y.ax() > 0 && !this.c.s.m()) {
                    afbo afbo = this.c;
                    if (!afbo.x && a - this.b > 3000) {
                        int j2 = afbo.j();
                        int ax = this.c.y.ax();
                        this.a.a(this.c.o.a(), (long) j2);
                        if (this.a.a((double) ax)) {
                            this.a.a();
                            a = ((long) (i * 1000)) / j;
                            StringBuilder stringBuilder = new StringBuilder(29);
                            stringBuilder.append("droprate.");
                            stringBuilder.append(a);
                            String str = "android.hfrdroppedframes";
                            afif afif = new afif(8, str, this.c.o(), stringBuilder.toString());
                            this.c.p();
                            this.c.a(afif);
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public final void a(aewy aewy) {
        xtl.a("VpxDecoderException in ExoPlayer", (Throwable) aewy);
    }

    public final void a(String str, long j, long j2) {
        this.c.e.a(j, j2);
        if (this.c.y.ag() && !TextUtils.isEmpty(str)) {
            this.c.i.a("dec", (aevf) new aetw(str));
        }
    }

    public final void a(nmx nmx) {
        if (nmx != null) {
            afbo afbo = this.c;
            if (afbo.p != null) {
                afkm a = afbo.n.a(nmx.o);
                if (a != null) {
                    a.d = nmx.n;
                }
                this.c.p.a(a);
            }
        }
    }
}
