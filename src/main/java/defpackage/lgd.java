package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: lgd */
public final class lgd implements lgm {
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final adqf e;
    private final lgf f;

    public lgd(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, adqf adqf, zyw zyw) {
        boolean g = foh.g(zyw);
        apxn a = zyw.a();
        boolean z = false;
        if (a != null) {
            aulu aulu = a.e;
            if (aulu == null) {
                aulu = aulu.bw;
            }
            if (aulu.bf) {
                z = true;
            }
        }
        lgc lgc = new lgc(bcaa, bcaa2, g, z);
        this.b = bcaa;
        this.c = bcaa2;
        this.d = bcaa3;
        this.e = adqf;
        this.f = lgc;
        bcaa3.get();
    }

    public final void a(Bundle bundle) {
        ((luy) this.d.get()).a();
        if (bundle != null) {
            this.f.a(bundle);
        }
    }

    public final void a(lgo lgo) {
        if (!this.f.a()) {
            aikf aikf = (aikf) this.c.get();
            aikf.b.a(aikf.b(), new aiks());
        }
        this.f.a(null);
    }

    public final void a(boolean z) {
        enm enm = (enm) ((aikf) this.c.get()).b();
        aizy aizy = (aizy) this.b.get();
        if (aizy.b(enm != null ? enm.e() : null)) {
            this.f.a(lgp.a(aizy, z));
        } else {
            this.f.a(null);
        }
    }

    public final void b(Bundle bundle) {
        this.f.b(bundle);
    }

    public final void a(aiqq aiqq, boolean z) {
        if (z) {
            String c = aiqq.c();
            enm enm = (enm) ((aikf) this.c.get()).b();
            CharSequence c2 = enm != null ? enm.e().c() : null;
            if (TextUtils.isEmpty(c) || !TextUtils.equals(c, c2)) {
                e();
            }
        }
    }

    public final void e() {
        if (this.e.c() == null) {
            ((aikf) this.c.get()).f.c();
        }
    }

    public final void f() {
        if (this.e.c() == null) {
            aikf aikf = (aikf) this.c.get();
            int a = aikf.a();
            if (a != -1) {
                xca a2 = aikf.a(0);
                aikf.a(1).clear();
                a2.a(a + 1, (a2.size() - a) - 1);
                a2.a(0, a);
            }
        }
    }
}
