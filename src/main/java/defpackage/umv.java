package defpackage;

import android.view.Surface;

/* renamed from: umv */
final class umv implements umx {
    private final /* synthetic */ umw a;

    umv(umw umw) {
        this.a = umw;
    }

    public final void a(umz umz) {
        uhy.b(this.a.i == null);
        this.a.i = (umz) uhy.a((Object) umz);
        this.a.d();
    }

    public final void a(Surface surface) {
        umw umw = this.a;
        if (umw.g != surface) {
            umw.g = surface;
            umw.j = true;
            umw.d();
        }
    }

    public final boolean a() {
        return this.a.c();
    }

    public final void b() {
        this.a.d();
    }

    public final void c() {
        umw umw = this.a;
        umw.c.c(umw);
        this.a.d();
    }

    public final void d() {
        umw umw = this.a;
        umw.j = false;
        umw.e();
    }

    public final void e() {
        this.a.e();
    }
}
