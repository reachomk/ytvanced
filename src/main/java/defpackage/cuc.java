package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: cuc */
public abstract class cuc extends cts {
    private final cuv a;

    public cuc() {
        if (cuu.a == null) {
            cup cup = new cup();
            cuu.a = new cuu(cup);
            cup.a = cuu.a;
        }
        this.a = new cuv(cuu.a);
        cuv cuv = this.a;
        cub cub = new cub(this);
        if (cuv.d == null) {
            cuv.d = cub;
            return;
        }
        throw new RuntimeException("Overriding existing listener!");
    }

    public abstract void b(cty cty);

    public final void a(cvd cvd, cvd cvd2, String str) {
        this.a.a(cvd, cvd2, str);
    }

    public final void a(cvd cvd, cvd cvd2) {
        this.a.a(cvd, cvd2, "default_input");
    }

    public final void a(cty cty) {
        if (c()) {
            e();
            b(cty);
            cuv cuv = this.a;
            cuy cuy = cuv.b;
            for (int i = 0; i < cuy.a.size(); i++) {
                cvd cvd = (cvd) cuy.a.get(i);
                cvd cvd2 = (cvd) cuy.b.get(i);
                String str = (String) cuy.c.get(i);
                cvd b = cvd2.b(str);
                if (b != null) {
                    cuy.a(b, cvd2, str);
                }
                if (cvd.b == null) {
                    cvd.b = new ArrayList();
                }
                cvd.b.add(cvd2);
                if (cvd2.a == null) {
                    cvd2.a = new LinkedHashMap();
                }
                cvd2.a.put(str, cvd);
            }
            cuv.f = true;
            cuv.e = true;
            cuv.a.a(cuv);
            return;
        }
        d();
    }

    public final void a() {
        if (b()) {
            this.a.a();
        }
    }

    public final boolean b() {
        return this.a.e;
    }
}
