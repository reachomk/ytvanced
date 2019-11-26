package defpackage;

/* renamed from: cfx */
public final class cfx implements cfz, cgc {
    public cfz a;
    public cfz b;
    private final cgc c;

    public cfx(cgc cgc) {
        this.c = cgc;
    }

    public final void a() {
        if (!this.a.c()) {
            this.a.a();
        }
    }

    public final void b() {
        this.a.b();
        if (this.b.c()) {
            this.b.b();
        }
    }

    public final boolean c() {
        return (!this.a.g() ? this.a : this.b).c();
    }

    public final boolean d() {
        return (!this.a.g() ? this.a : this.b).d();
    }

    public final boolean e() {
        return (!this.a.g() ? this.a : this.b).e();
    }

    public final boolean f() {
        return (!this.a.g() ? this.a : this.b).f();
    }

    public final boolean g() {
        return this.a.g() && this.b.g();
    }

    public final void h() {
        this.a.h();
        this.b.h();
    }

    public final boolean a(cfz cfz) {
        if (cfz instanceof cfx) {
            cfx cfx = (cfx) cfz;
            if (this.a.a(cfx.a) && this.b.a(cfx.b)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(cfz cfz) {
        cgc cgc = this.c;
        return (cgc == null || cgc.b(this)) && g(cfz);
    }

    public final boolean c(cfz cfz) {
        cgc cgc = this.c;
        return (cgc == null || cgc.c(this)) && g(cfz);
    }

    public final boolean d(cfz cfz) {
        cgc cgc = this.c;
        return (cgc == null || cgc.d(this)) && g(cfz);
    }

    private final boolean g(cfz cfz) {
        boolean z = true;
        if (!cfz.equals(this.a)) {
            if (this.a.g()) {
                return cfz.equals(this.b) ? z : false;
            } else {
                z = false;
            }
        }
    }

    public final boolean i() {
        cgc cgc = this.c;
        return (cgc != null && cgc.i()) || e();
    }

    public final void e(cfz cfz) {
        cgc cgc = this.c;
        if (cgc != null) {
            cgc.e(this);
        }
    }

    public final void f(cfz cfz) {
        if (cfz.equals(this.b)) {
            cgc cgc = this.c;
            if (cgc != null) {
                cgc.f(this);
            }
            return;
        }
        if (!this.b.c()) {
            this.b.a();
        }
    }
}
