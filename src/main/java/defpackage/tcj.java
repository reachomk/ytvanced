package defpackage;

import java.util.Iterator;

/* renamed from: tcj */
final class tcj implements ple {
    private final /* synthetic */ tck a;

    tcj(tck tck) {
        this.a = tck;
    }

    public final /* synthetic */ void d(pla pla, int i) {
        pkq pkq = (pkq) pla;
        Iterator it = this.a.b.iterator();
        while (it.hasNext()) {
            tch tch = (tch) it.next();
            this.a.a(pkq);
            tch.f();
        }
    }

    public final /* synthetic */ void c(pla pla, int i) {
        pkq pkq = (pkq) pla;
        Iterator it = this.a.b.iterator();
        while (it.hasNext()) {
            tch tch = (tch) it.next();
            this.a.a(pkq);
            tch.e();
        }
    }

    public final /* synthetic */ void d(pla pla) {
        pkq pkq = (pkq) pla;
        Iterator it = this.a.b.iterator();
        while (it.hasNext()) {
            tch tch = (tch) it.next();
            this.a.a(pkq);
            tch.c();
        }
    }

    public final /* synthetic */ void b(pla pla, int i) {
        pkq pkq = (pkq) pla;
        Iterator it = this.a.b.iterator();
        while (it.hasNext()) {
            tch tch = (tch) it.next();
            this.a.a(pkq);
            tch.b();
        }
    }

    public final /* synthetic */ void c(pla pla) {
        pkq pkq = (pkq) pla;
        Iterator it = this.a.b.iterator();
        while (it.hasNext()) {
            tch tch = (tch) it.next();
            this.a.a(pkq);
            tch.a();
        }
    }

    public final /* synthetic */ void b(pla pla) {
        pkq pkq = (pkq) pla;
        Iterator it = this.a.b.iterator();
        while (it.hasNext()) {
            ((tch) it.next()).b(this.a.a(pkq));
        }
    }

    public final /* synthetic */ void a(pla pla) {
        pkq pkq = (pkq) pla;
        Iterator it = this.a.b.iterator();
        while (it.hasNext()) {
            ((tch) it.next()).a(this.a.a(pkq));
        }
    }
}
