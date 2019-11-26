package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: bvz */
final class bvz implements bsy, buf, bug {
    private final bui a;
    private final buf b;
    private int c;
    private bub d;
    private Object e;
    private volatile bzp f;
    private bue g;

    bvz(bui bui, buf buf) {
        this.a = bui;
        this.b = buf;
    }

    public final boolean a() {
        Object obj = this.e;
        bub bub = null;
        if (obj != null) {
            this.e = null;
            chs.a();
            try {
                bsh a = this.a.c.c.b.a(obj.getClass());
                if (a != null) {
                    bud bud = new bud(a, obj, this.a.i);
                    this.g = new bue(this.f.a, this.a.n);
                    this.a.a().a(this.g, bud);
                    this.d = new bub(Collections.singletonList(this.f.a), this.a, this);
                } else {
                    throw new brk(obj.getClass());
                }
            } finally {
                bub = this.f.c;
                bub.a();
            }
        }
        bub bub2 = this.d;
        if (bub2 != null && bub2.a()) {
            return true;
        }
        this.d = bub;
        this.f = bub;
        boolean z = false;
        while (!z && this.c < this.a.c().size()) {
            List c = this.a.c();
            int i = this.c;
            this.c = i + 1;
            this.f = (bzp) c.get(i);
            if (this.f != null && (this.a.p.a(this.f.c.c()) || this.a.a(this.f.c.d()))) {
                this.f.c.a(this.a.o, this);
                z = true;
            }
        }
        return z;
    }

    public final void b() {
        bzp bzp = this.f;
        if (bzp != null) {
            bzp.c.b();
        }
    }

    public final void a(Object obj) {
        bup bup = this.a.p;
        if (obj == null || !bup.a(this.f.c.c())) {
            this.b.a(this.f.a, obj, this.f.c, this.f.c.c(), this.g);
            return;
        }
        this.e = obj;
        this.b.c();
    }

    public final void a(Exception exception) {
        this.b.a(this.g, exception, this.f.c, this.f.c.c());
    }

    public final void c() {
        throw new UnsupportedOperationException();
    }

    public final void a(bsm bsm, Object obj, bsv bsv, int i, bsm bsm2) {
        this.b.a(bsm, obj, bsv, this.f.c.c(), bsm);
    }

    public final void a(bsm bsm, Exception exception, bsv bsv, int i) {
        this.b.a(bsm, exception, bsv, this.f.c.c());
    }
}
