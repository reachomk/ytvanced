package defpackage;

/* renamed from: cgk */
public final class cgk implements cfz, cgc {
    public cfz a;
    public cfz b;
    private final cgc c;
    private boolean d;

    cgk() {
        this(null);
    }

    public cgk(cgc cgc) {
        this.c = cgc;
    }

    public final boolean b(cfz cfz) {
        cgc cgc = this.c;
        boolean z = false;
        if (cgc == null || cgc.b(this)) {
            if (cfz.equals(this.a)) {
                z = true;
            } else if (this.a.e()) {
                return z;
            } else {
                return true;
            }
        }
        return z;
    }

    public final boolean c(cfz cfz) {
        cgc cgc = this.c;
        return (cgc == null || cgc.c(this)) && cfz.equals(this.a) && !i();
    }

    public final boolean d(cfz cfz) {
        cgc cgc = this.c;
        return (cgc == null || cgc.d(this)) && cfz.equals(this.a);
    }

    public final boolean i() {
        cgc cgc = this.c;
        return (cgc != null && cgc.i()) || e();
    }

    public final void e(cfz cfz) {
        if (!cfz.equals(this.b)) {
            cgc cgc = this.c;
            if (cgc != null) {
                cgc.e(this);
            }
            if (!this.b.d()) {
                this.b.b();
            }
        }
    }

    public final void f(cfz cfz) {
        if (cfz.equals(this.a)) {
            cgc cgc = this.c;
            if (cgc != null) {
                cgc.f(this);
            }
        }
    }

    public final void a() {
        this.d = true;
        if (!(this.a.d() || this.b.c())) {
            this.b.a();
        }
        if (this.d && !this.a.c()) {
            this.a.a();
        }
    }

    public final void b() {
        this.d = false;
        this.b.b();
        this.a.b();
    }

    public final boolean c() {
        return this.a.c();
    }

    public final boolean d() {
        return this.a.d() || this.b.d();
    }

    public final boolean e() {
        return this.a.e() || this.b.e();
    }

    public final boolean f() {
        return this.a.f();
    }

    public final boolean g() {
        return this.a.g();
    }

    public final void h() {
        this.a.h();
        this.b.h();
    }

    public final boolean a(cfz cfz) {
        if (cfz instanceof cgk) {
            cgk cgk = (cgk) cfz;
            cfz cfz2 = this.a;
            if (cfz2 == null ? cgk.a != null : !cfz2.a(cgk.a)) {
                cfz2 = this.b;
                if (cfz2 == null ? cgk.b == null : cfz2.a(cgk.b)) {
                    return true;
                }
            }
        }
        return false;
    }
}
