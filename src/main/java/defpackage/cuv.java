package defpackage;

import java.util.ArrayList;

/* renamed from: cuv */
public final class cuv {
    public final cuu a;
    public final cuy b = new cuy();
    public final ArrayList c = new ArrayList();
    public cuq d;
    public boolean e = false;
    public boolean f = false;

    public cuv(cuu cuu) {
        this.a = cuu;
    }

    public final void a(cvd cvd, cvd cvd2, String str) {
        if (this.f) {
            throw new RuntimeException("Trying to add binding after DataFlowGraph has already been activated.");
        }
        cuy cuy = this.b;
        cuy.a.add(cvd);
        cuy.b.add(cvd2);
        cuy.c.add(str);
        this.c.add(cvd);
        this.c.add(cvd2);
    }

    public final void a() {
        if (this.e) {
            int i = 0;
            this.e = false;
            this.a.b(this);
            cuy cuy = this.b;
            while (i < cuy.a.size()) {
                cvd cvd = (cvd) cuy.a.get(i);
                cvd cvd2 = (cvd) cuy.b.get(i);
                String str = (String) cuy.c.get(i);
                if (cvd2.b(str) == cvd) {
                    cuy.a(cvd, cvd2, str);
                }
                i++;
            }
        }
    }
}
