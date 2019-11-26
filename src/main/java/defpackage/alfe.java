package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: alfe */
public final class alfe implements alig, allj, almv, alnc {
    public final aatd a;
    public final aaas b;
    public final Context c;
    public final akkq d;
    public final alfg e;
    public final akoh f = new akoh();
    public final Map g = new HashMap();
    public final List h = new ArrayList();
    public final allh i;
    public final alfk j;
    public final acvx k;
    public final bcaa l;
    public final akpe m;
    private final xci n;
    private final alez o = new alez();

    public alfe(aaas aaas, Context context, akkq akkq, xci xci, allh allh, alfk alfk, bcaa bcaa, akpe akpe, acvx acvx, aatd aatd, alfg alfg) {
        this.a = (aatd) amqw.a((Object) aatd);
        this.b = (aaas) amqw.a((Object) aaas);
        this.c = (Context) amqw.a((Object) context);
        this.d = (akkq) amqw.a((Object) akkq);
        this.n = (xci) amqw.a((Object) xci);
        this.e = (alfg) amqw.a((Object) alfg);
        this.i = (allh) amqw.a((Object) allh);
        this.j = (alfk) amqw.a((Object) alfk);
        this.k = (acvx) amqw.a((Object) acvx);
        this.l = (bcaa) amqw.a((Object) bcaa);
        this.m = (akpe) amqw.a((Object) akpe);
        this.o.b = aatd.b;
    }

    public final void b(boolean z) {
    }

    public final void b() {
        apxu apxu = this.i.j;
        Map hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        alez alez = this.o;
        boolean z = true;
        if (this.i.e().size() <= 1) {
            z = false;
        }
        alez.a = z;
        if (this.o.a()) {
            aley.b(this.c, this.o.b, this.b, this.k, new alfh(this, apxu, hashMap), hashMap);
        } else {
            this.b.a(apxu, hashMap);
        }
    }

    public final void a(allh allh) {
        if (f() && this.i.b()) {
            this.e.a(this.a.c(), alll.a(this.i.g(), this.i.h()));
            return;
        }
        this.e.a(this.i.b());
        this.e.a(null, null);
        e();
    }

    public final void bG_() {
        this.e.a(false);
        this.e.b(true);
        this.e.b();
    }

    public final void c() {
        this.e.a(f() ^ 1);
        this.e.b(false);
        e();
    }

    public final void d() {
        this.i.c(null);
        this.e.a(f() ^ 1);
        this.e.b(false);
        this.e.b();
        this.e.c();
        this.n.d(new alhc());
    }

    public final void a(aylg aylg) {
        String a = alps.a(aylg);
        allh allh = this.i;
        allh.a(a, allh.b(a) ^ 1);
    }

    public final void b(aylg aylg) {
        aqkg aqkg = (aqkg) alps.b(aylg);
        if (aqkg != null) {
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", new alml(this.f, aylg));
            allh allh = this.i;
            String a = alps.a(aylg);
            xak.a();
            amqw.a(TextUtils.isEmpty(a) ^ 1);
            allh.d.remove(a);
            allh.c.remove(a);
            allh.j();
            aaas aaas = this.b;
            apxu apxu = aqkg.e;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, hashMap);
        }
    }

    public final void a(String str) {
        this.i.c(str);
    }

    public final void e() {
        CharSequence g = this.i.g();
        if (!f()) {
            if (TextUtils.isEmpty(g)) {
                this.e.b();
            } else {
                this.e.a(g);
            }
        }
    }

    private final boolean f() {
        return this.a.c() != null;
    }
}
