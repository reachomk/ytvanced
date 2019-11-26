package defpackage;

import android.text.Spanned;

/* renamed from: ljm */
final class ljm implements ajan, xcp {
    private final /* synthetic */ lja a;

    ljm(lja lja) {
        this.a = lja;
    }

    public final long e() {
        return 1;
    }

    public final void a(ahkf ahkf) {
        if (!this.a.k.b(ahkf) && airg.a(ahkf.e, 4)) {
            aakj aakj = ahkf.b;
            if (aakj != null) {
                this.a.n = aakj.c();
                this.a.o = ahkf.b.f();
                this.a.h.e_(Boolean.valueOf(ahkf.b.d()));
                this.a.c();
            }
        }
    }

    public final void a(ahkn ahkn) {
        lja lja = this.a;
        int ordinal = ahkn.a.ordinal();
        if (ordinal == 0) {
            lja.m = false;
        } else if (ordinal == 8) {
            aakj aakj = ahkn.b;
            if (aakj != null) {
                ajxu ajxu = aakj.a;
                if (ajxu != null) {
                    atdn atdn = ajxu.w;
                    if (!(atdn == null || lja.m)) {
                        arml arml;
                        avuv avuv = atdn.a == 130741768 ? (avuv) atdn.b : avuv.d;
                        lja.m = true;
                        ljp ljp = lja.e;
                        if ((avuv.a & 1) != 0) {
                            arml = avuv.b;
                            if (arml == null) {
                                arml = arml.f;
                            }
                        } else {
                            arml = null;
                        }
                        Spanned a = ajqy.a(arml);
                        long j = avuv.c;
                        ljp.c = true;
                        ljp.a.setText(a);
                        ljp.a.postDelayed(ljp.b, j);
                    }
                }
            }
            this.a.i.e_(ahkn.a);
        }
        lja.e.a();
        this.a.i.e_(ahkn.a);
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.t().f().a(emg.a(this.a.c, 524288, 1)).a(new ljl(this), ljo.a), ajam.Q().a.f().a(emg.a(this.a.c, 524288, 1)).a(new ljn(this), ljq.a)};
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkf.class, ahkn.class};
        } else if (i == 0) {
            a((ahkf) obj);
            return null;
        } else if (i == 1) {
            a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
