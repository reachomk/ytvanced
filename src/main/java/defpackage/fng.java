package defpackage;

import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fng */
public final class fng implements ewm {
    public final ewi a;
    public ajwn b;
    private final fni c;
    private final eig d;
    private final acwa e;
    private final aaas f;

    public fng(ewi ewi, fni fni, eig eig, acwa acwa, aaas aaas, lci lci) {
        this.a = ewi;
        this.c = fni;
        this.d = eig;
        this.e = acwa;
        this.f = aaas;
        fni.b = lci;
    }

    public final int a() {
        return 6000;
    }

    public final void a(ajwn ajwn) {
        this.b = ajwn;
        if (ajwn == null) {
            this.c.a();
        }
    }

    public final boolean e() {
        return this.c.c();
    }

    public final boolean b() {
        return this.d.e() ^ 1;
    }

    public final void c() {
        if (!(e() || f())) {
            this.c.a(this.b, new Pair("overlay_controller_param", new fnj(this)));
        }
        if (f()) {
            aphg aphg;
            aphg aphg2;
            if (!(this.b.hasExtension(ajwq.a) && ((Boolean) this.b.getExtension(ajwq.a)).booleanValue())) {
                this.b.setExtension(ajwq.a, Boolean.valueOf(true));
                apxu[] apxuArr = this.b.h;
                if (apxuArr != null) {
                    for (apxu apxu : apxuArr) {
                        if (apxu != null) {
                            Map hashMap = new HashMap();
                            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.b);
                            this.f.a(apxu, hashMap);
                        }
                    }
                }
            }
            acvx t = this.e.t();
            t.a(this.b.f, null);
            aphj aphj = this.b.c;
            if (aphj == null || (aphj.a & 1) == 0) {
                aphg = null;
            } else {
                aphg = aphj.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
            }
            aphj aphj2 = this.b.g;
            if (aphj2 == null || (1 & aphj2.a) == 0) {
                aphg2 = null;
            } else {
                aphg2 = aphj2.b;
                if (aphg2 == null) {
                    aphg2 = aphg.s;
                }
            }
            if (!(aphg == null || (aphg.a & 262144) == 0)) {
                t.a(aphg.r.d(), null);
            }
            if (!(aphg2 == null || (aphg2.a & 262144) == 0)) {
                t.a(aphg2.r.d(), null);
            }
            this.b = null;
        }
    }

    public final void d() {
        a(null);
    }

    private final boolean f() {
        ajwn ajwn = this.b;
        return (ajwn == null || ajwn.i) ? false : true;
    }
}
