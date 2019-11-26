package defpackage;

/* renamed from: ajko */
public final class ajko {
    public final bcaa a;
    public final xpt b;
    public final aiqf c;
    public final bcud d;
    public ajlc e;
    public ajkz f;
    public ajla g;
    private ajkn h;

    public ajko(bcaa bcaa, xpt xpt, aiqf aiqf, bcud bcud) {
        this.a = (bcaa) amqw.a((Object) bcaa);
        this.b = (xpt) amqw.a((Object) xpt);
        this.c = (aiqf) amqw.a((Object) aiqf);
        this.d = bcud;
    }

    public final wv a() {
        if (this.h == null) {
            this.h = new ajkn(this);
        }
        return this.h;
    }

    public final void b() {
        this.b.a();
        ((ajkl) this.a.get()).a();
    }

    public final void c() {
        this.b.a();
        ((ajkl) this.a.get()).b();
    }

    public final void a(long j) {
        this.b.a();
        ((ajkl) this.a.get()).a(j);
    }

    public final void d() {
        this.b.a();
        ajlc ajlc = this.e;
        if (ajlc != null) {
            ajlc.b();
            return;
        }
        ((ajkl) this.a.get()).t();
        if (((ajkl) this.a.get()).a(aizl.b)) {
            ((ajkl) this.a.get()).b(aizl.b);
        } else {
            ((ajkl) this.a.get()).a(0);
        }
    }

    public final void e() {
        this.b.a();
        ajkz ajkz = this.f;
        if (ajkz != null) {
            ajkz.d();
        } else {
            ((ajkl) this.a.get()).b(aizl.a);
        }
    }

    public final void a(int i) {
        this.b.a();
        ((ajkl) this.a.get()).b((long) i);
    }

    public final void f() {
        this.b.a();
        ((ajkl) this.a.get()).d();
    }

    public final void g() {
        this.b.a();
        ((ajkl) this.a.get()).u();
    }

    static {
        xtl.b("player.ui.PlayerControlsListener");
    }
}
