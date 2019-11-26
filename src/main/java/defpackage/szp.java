package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: szp */
public final class szp implements syc {
    public final int a;
    public final szy b;
    public final szy c;
    public final szy d;
    public final List e = new ArrayList();
    public final szx f;
    public final amuw g;

    public szp(int i, szn szn, szx szx, Collection collection) {
        this.b = new szy(szn);
        this.c = new szy(szn);
        this.d = new szy(szn);
        this.a = i;
        this.f = szx;
        this.g = amuw.a(collection);
    }

    public final synchronized void g() {
    }

    public final void a() {
        this.b.a();
    }

    public final void b() {
        this.b.b();
    }

    public final void c() {
        this.c.a();
    }

    public final void d() {
        this.c.b();
    }

    public final void e() {
        this.d.a();
    }

    public final void f() {
        this.d.b();
    }

    public final void a(long j) {
        this.e.add(Long.valueOf(j));
    }

    public final synchronized void a(boolean z) {
        if (!z) {
            bblt.a(new szs(this)).b(bbzi.b).c();
        }
    }

    public final void a(int i, List list, int i2) {
        for (szu szu : list) {
            szu.a(Integer.valueOf(i2));
            amuw amuw = this.g;
            if (!(amuw == null || amuw.isEmpty())) {
                szu.a(szt.b().a(this.g).a());
            }
            this.f.a(i, szu.a());
        }
    }
}
