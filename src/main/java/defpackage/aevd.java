package defpackage;

/* renamed from: aevd */
public final class aevd extends aetz {
    private boolean a;

    public aevd(aeuy aeuy) {
        super(aeuy);
    }

    public final void a() {
        if (!this.a) {
            super.a();
        }
    }

    public final void b() {
        if (!this.a) {
            super.b();
        }
    }

    public final void c() {
        if (this.a) {
            this.a = false;
        }
        super.c();
    }

    public final void d() {
        if (!this.a) {
            super.d();
        }
    }

    public final void e() {
        if (!this.a) {
            super.e();
        }
    }

    public final void f() {
        if (!this.a) {
            super.f();
        }
    }

    public final void a(long j) {
        if (!this.a) {
            super.a(j);
        }
    }

    public final void b(long j) {
        if (!this.a) {
            super.b(j);
        }
    }

    public final void j() {
        super.j();
        this.a = false;
    }

    public final void k() {
        super.k();
        this.a = true;
    }
}
