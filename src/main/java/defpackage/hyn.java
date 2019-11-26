package defpackage;

import android.os.Bundle;
import android.view.View;

/* renamed from: hyn */
public final class hyn extends ekk implements ajan, hyc, xcp {
    private final nn a;
    private final xci b;
    private final ajam c;
    private final zyw d;
    private final bdfu e = new bdfu();
    private final bcaa f;
    private final acya g;
    private final hyi h;
    private hyr i;

    public hyn(elm elm, nn nnVar, xci xci, ajam ajam, zyw zyw, bcaa bcaa, acya acya, hyi hyi) {
        super(elm);
        this.a = nnVar;
        this.b = xci;
        this.c = ajam;
        this.d = zyw;
        this.f = bcaa;
        this.g = acya;
        this.h = hyi;
    }

    public final long e() {
        return 1;
    }

    public final void A_() {
        if (foh.x(this.d)) {
            this.e.a(a(this.c));
        } else {
            this.b.a((Object) this);
        }
        this.h.a();
    }

    public final void ar_() {
        if (foh.x(this.d)) {
            this.e.a();
        } else {
            this.b.b(this);
        }
        this.h.b();
    }

    public final boolean c() {
        return this.h.a;
    }

    public final void a(hye hye) {
        this.h.a(hye);
    }

    public final void b(hye hye) {
        this.h.b(hye);
    }

    public final void onClick(View view) {
        xci xci = this.b;
        alhn.a(this.g);
        xci.d(new alhd());
        hyr hyr = this.i;
        if (hyr == null) {
            xtl.d("Share video without action target.");
            return;
        }
        aphg aphg = hyr.b;
        if (aphg != null) {
            int i = aphg.a;
            aaas aaas;
            apxu apxu;
            if ((i & 4096) != 0) {
                aaas = (aaas) this.f.get();
                apxu = aphg.m;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
                return;
            } else if ((i & 2048) != 0) {
                aaas = (aaas) this.f.get();
                apxu = aphg.l;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
                return;
            }
        }
        anze anze = hyr.a;
        if (anze != null) {
            jff jff = new jff();
            Bundle bundle = new Bundle();
            aobp.a(bundle, "share_panel", anze);
            jff.f(bundle);
            jff.a(this.a.f(), null);
        }
    }

    public final boolean onLongClick(View view) {
        onClick(view);
        return true;
    }

    /* Access modifiers changed, original: final */
    public final void a(ahkf ahkf) {
        Object obj;
        aafv aafv = ahkf.c;
        boolean z = false;
        Object obj2;
        if (aafv != null) {
            this.i = new hyr(aafv);
            hyr hyr = this.i;
            obj = hyr.b != null ? 1 : null;
            axip axip = hyr.a;
            obj2 = (axip == null || axip.k) ? null : 1;
        } else {
            this.i = null;
            obj2 = null;
            obj = null;
        }
        if (obj == null && obj2 == null) {
            this.h.d();
            return;
        }
        ajxs a = hyi.a(aafv);
        hyi hyi = this.h;
        boolean z2 = a != null && a.h;
        if (a != null && a.g) {
            z = true;
        }
        hyi.a(z2, z);
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.t().f().a(emg.a(this.d, 8796093022208L, 1)).a(new hyq(this), hyp.a)};
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
