package defpackage;

import android.view.View;

/* renamed from: hyf */
public final class hyf extends ekk implements fgt, hyc {
    private final bcaa a;
    private final bcaa b;
    private final hyd c;
    private apxu d;

    public hyf(elm elm, bcaa bcaa, bcaa bcaa2) {
        hyd hyd = new hyd();
        super(elm);
        this.a = bcaa;
        this.b = bcaa2;
        this.c = hyd;
    }

    public final void A_() {
        ((fgc) this.a.get()).a((fgt) this);
    }

    public final void ar_() {
        ((fgc) this.a.get()).b((fgt) this);
    }

    public final boolean c() {
        return this.c.c();
    }

    public final void a(hye hye) {
        this.c.a(hye);
    }

    public final void b(hye hye) {
        this.c.b(hye);
    }

    public final void a(ffu ffu, int i, int i2) {
        apxu apxu = null;
        if (i2 == 0) {
            this.d = null;
        } else {
            fob fob = ffu.b;
            if (fob instanceof foq) {
                aryi aryi = ((foq) fob).b;
                if (aryi != null) {
                    aryg aryg = aryi.f;
                    if (aryg == null) {
                        aryg = aryg.c;
                    }
                    arye arye = aryg.b;
                    if (arye == null) {
                        arye = arye.u;
                    }
                    aphr aphr = arye.h;
                    if (aphr == null) {
                        aphr = aphr.c;
                    }
                    aphg aphg = aphr.b;
                    if (aphg == null) {
                        aphg = aphg.s;
                    }
                    if ((aphg.a & 4096) != 0) {
                        aphg aphg2 = aphr.b;
                        if (aphg2 == null) {
                            aphg2 = aphg.s;
                        }
                        apxu = aphg2.m;
                        if (apxu == null) {
                            apxu = apxu.d;
                        }
                    }
                }
                this.d = apxu;
            }
        }
        this.c.a(this.d != null);
    }

    public final void onClick(View view) {
        if (this.d != null) {
            ((aaas) this.b.get()).a(this.d, null);
        }
    }

    public final boolean onLongClick(View view) {
        onClick(view);
        return true;
    }
}
