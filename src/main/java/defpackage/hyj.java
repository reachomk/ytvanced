package defpackage;

import android.view.View;

/* renamed from: hyj */
public final class hyj extends ekk implements ajan, hyc, xcp {
    private final xci a;
    private final ajam b;
    private final zyw c;
    private final bdfu d = new bdfu();
    private final bcaa e;
    private final bcaa f;
    private final xhv g;
    private final xpa h;
    private final hyi i;
    private hyo j;

    public hyj(elm elm, xci xci, ajam ajam, zyw zyw, bcaa bcaa, bcaa bcaa2, xhv xhv, xpa xpa, hyi hyi) {
        super(elm);
        this.a = xci;
        this.b = ajam;
        this.c = zyw;
        this.e = bcaa;
        this.f = bcaa2;
        this.g = xhv;
        this.h = xpa;
        this.i = hyi;
    }

    public final long e() {
        return 1;
    }

    public final void A_() {
        if (foh.x(this.c)) {
            this.d.a(a(this.b));
        } else {
            this.a.a((Object) this);
        }
        this.i.a();
    }

    public final void ar_() {
        if (foh.x(this.c)) {
            this.d.a();
        } else {
            this.a.b(this);
        }
        this.i.b();
    }

    public final boolean c() {
        return this.i.a;
    }

    public final void a(hye hye) {
        this.i.a(hye);
    }

    public final void b(hye hye) {
        this.i.b(hye);
    }

    public final void onClick(View view) {
        hyo hyo = this.j;
        if (hyo == null) {
            xtl.d("Add to without action target.");
            return;
        }
        aphg aphg = hyo.b;
        if (aphg != null) {
            int i = aphg.a;
            aaas aaas;
            apxu apxu;
            if ((i & 4096) != 0) {
                aaas = (aaas) this.e.get();
                apxu = aphg.m;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
                return;
            } else if ((i & 2048) != 0) {
                aaas = (aaas) this.e.get();
                apxu = aphg.l;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
                return;
            }
        }
        d();
    }

    public final boolean onLongClick(View view) {
        hyo hyo = this.j;
        if (hyo != null) {
            apxu apxu = hyo.c;
            if (apxu == null) {
                d();
            } else {
                ((aaas) this.e.get()).a(apxu, null);
            }
        }
        return true;
    }

    private final void d() {
        if (this.g.c()) {
            ((kzb) this.f.get()).a(this.j.a);
        } else {
            this.h.a();
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(ahkf ahkf) {
        aafv aafv = ahkf.c;
        if (aafv == null) {
            this.j = null;
            this.i.d();
            return;
        }
        this.j = new hyo(aafv);
        ajxs a = hyi.a(aafv);
        hyi hyi = this.i;
        boolean z = false;
        boolean z2 = a != null && a.j;
        if (a != null && a.i) {
            z = true;
        }
        hyi.a(z2, z);
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.t().f().a(emg.a(this.c, 4398046511104L, 1)).a(new hym(this), hyl.a)};
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkf.class};
        } else if (i == 0) {
            a((ahkf) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
