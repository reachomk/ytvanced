package defpackage;

/* renamed from: zvx */
final class zvx implements zvw {
    private final /* synthetic */ zvv a;

    public final void a() {
        zvv zvv = this.a;
        if (zvv.e) {
            zwj zwj = zvv.b;
            zud a = zwj.a();
            if (a == null) {
                zwj.b();
                return;
            } else if (zwj.a(a)) {
                arxr a2 = a.a();
                zwj.b.a(a2.d);
                zwj.b(a2.g.d());
                zwj.a(zwj.c.a().indexOf(a), true);
                return;
            } else {
                xtl.d("Teaser clicked for a card that is not in the current InfoCardCollection.");
                return;
            }
        }
        zvv.b.b();
    }

    public final void b() {
        zwj zwj = this.a.b;
        zud a = zwj.a();
        if (a != null && zwj.a(a)) {
            zwj.b.a(a.a().f);
        }
    }

    public final void c() {
        zvv zvv = this.a;
        zvv.f = false;
        zvv.b.c();
        this.a.b.g();
    }

    public final void d() {
        this.a.a(true);
    }

    public final void e() {
        zvv zvv = this.a;
        zvv.e = false;
        zvv.b();
    }

    /* synthetic */ zvx(zvv zvv) {
        this.a = zvv;
    }
}
