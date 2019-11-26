package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: tgq */
public final class tgq implements tgk {
    private final sap a;
    private final Map b;

    public final boolean a() {
        return this.a.h();
    }

    public final void a(tgl tgl) {
        this.a.a(c(tgl));
    }

    public final void b(tgl tgl) {
        this.a.b(c(tgl));
    }

    public final void b() {
        this.a.e();
    }

    public final void c() {
        this.a.f();
    }

    public final void a(String str, tbs tbs) {
        pjr pjr = new pjr();
        pjr.b = tbs.b();
        pjr.a = tbs.a();
        this.a.a(str, pjr);
    }

    public final void a(boolean z, boolean z2) {
        this.a.a(z, z2, true);
    }

    public final void d() {
        this.a.E();
    }

    public final void e() {
        this.a.F();
    }

    public final void a(double d) {
        this.a.a(d);
    }

    public final void a(String str) {
        sap sap = this.a;
        if (TextUtils.isEmpty(sap.G)) {
            throw new IllegalStateException("No Data Namespace is configured");
        }
        sap.m();
        pje.b.a(sap.m, sap.G, str).a(new sbd(sap));
    }

    public final int f() {
        return this.a.k;
    }

    private final sbo c(tgl tgl) {
        if (!this.b.containsKey(tgl)) {
            this.b.put(tgl, new tgs(tgl));
        }
        return (sbo) this.b.get(tgl);
    }

    /* synthetic */ tgq(Context context, tgg tgg) {
        sak sak = new sak(tgg.a());
        for (String a : tgg.c()) {
            sak.g.add(sdh.a(a, "namespace"));
        }
        if (tgg.e()) {
            sak.d = true;
        }
        if (tgg.d()) {
            sak.c = true;
        }
        if (tgg.b()) {
            sak.j = true;
        }
        if (!sak.a.isEmpty()) {
            throw new IllegalArgumentException("Notification was not enabled but some notification actions were configured");
        } else if (sak.a.size() > 5) {
            throw new IllegalArgumentException("You cannot add more than 5 notification actions for the expanded view");
        } else if (sak.b.size() <= 3) {
            this.a = sap.a(context, new sal(sak));
            this.b = new HashMap();
        } else {
            throw new IllegalArgumentException("You cannot add more than 3 compact notification actions for the compact view");
        }
    }
}
