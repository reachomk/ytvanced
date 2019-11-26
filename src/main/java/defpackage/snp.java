package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: snp */
final class snp implements swn {
    private static final boolean n = Boolean.getBoolean("force_elements_view_materialization");
    private final Object a = new Object();
    private final clz b;
    private List c;
    private List d;
    private List e;
    private List f;
    private List g;
    private List h;
    private List i;
    private List j;
    private List k;
    private boolean l = false;
    private boolean m = false;

    snp(clz clz) {
        this.b = clz;
    }

    public final clz a() {
        return this.b;
    }

    public final cma a(cmg cmg) {
        cma c;
        synchronized (this.a) {
            clz clz;
            b();
            this.l = true;
            if (this.m) {
                clz sog = new sog();
                sog.a(sog, cmg, new sod());
                clz = this.b;
                sog.a.a = clz != null ? clz.c() : null;
                sog.d.set(0);
                List list = this.c;
                sod sod = sog.a;
                sod.f = list;
                sod.e = this.d;
                sod.b = this.e;
                sod.w = this.f;
                sod.d = this.g;
                sod.v = this.i;
                sod.u = this.j;
                sod.g = this.k;
                sod.c = this.h;
                clz = sog;
            } else {
                clz = this.b;
            }
            if (n) {
                clz = clz.f();
            }
            c = clz.c();
        }
        return c;
    }

    public final swn a(swu swu) {
        synchronized (this.a) {
            b();
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add(swu);
            this.m = true;
        }
        return this;
    }

    public final swn a(swr swr) {
        synchronized (this.a) {
            b();
            if (this.d == null) {
                this.d = new ArrayList();
            }
            this.d.add(swr);
            this.m = true;
        }
        return this;
    }

    public final swn a(swy swy) {
        synchronized (this.a) {
            b();
            if (this.f == null) {
                this.f = new ArrayList();
            }
            this.f.add(swy);
            this.m = true;
        }
        return this;
    }

    public final swn b(swy swy) {
        synchronized (this.a) {
            b();
            if (this.g == null) {
                this.g = new ArrayList();
            }
            this.g.add(swy);
            this.m = true;
        }
        return this;
    }

    public final swn c(swy swy) {
        synchronized (this.a) {
            b();
            if (this.e == null) {
                this.e = new ArrayList();
            }
            this.e.add(swy);
            this.m = true;
        }
        return this;
    }

    public final swn a(sws sws) {
        synchronized (this.a) {
            b();
            if (this.h == null) {
                this.h = new ArrayList();
            }
            this.h.add(sws);
            this.m = true;
        }
        return this;
    }

    public final swn a(swv swv) {
        synchronized (this.a) {
            b();
            if (this.i == null) {
                this.i = new ArrayList();
            }
            this.i.add(swv);
            this.m = true;
        }
        return this;
    }

    public final swn a(sww sww) {
        synchronized (this.a) {
            b();
            if (this.j == null) {
                this.j = new ArrayList();
            }
            this.j.add(sww);
            this.m = true;
        }
        return this;
    }

    public final swn a(swt swt) {
        synchronized (this.a) {
            b();
            if (this.k == null) {
                this.k = new ArrayList();
            }
            this.k.add(swt);
            this.m = true;
        }
        return this;
    }

    private final void b() {
        if (this.l) {
            throw new IllegalStateException("Element already built!");
        }
    }
}
