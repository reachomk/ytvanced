package defpackage;

/* renamed from: bazg */
final class bazg implements bazn {
    public final basc a;
    public boolean b;
    public final /* synthetic */ baze c;

    public bazg(baze baze, basc basc) {
        this.c = baze;
        this.a = (basc) amqw.a((Object) basc, (Object) "observer");
    }

    public final void a(baum baum) {
        this.c.c.execute(new bazf(this, baum));
    }

    public final void a(bbhp bbhp) {
        this.c.c.execute(new bazi(this, bbhp));
    }

    public final void a(bavx bavx, baum baum) {
        this.b = true;
        this.c.g = true;
        try {
            this.a.a(bavx, baum);
        } finally {
            this.c.b();
            this.c.d.a(bavx.a());
        }
    }

    public final void b(bavx bavx, baum baum) {
        a(bavx, 1, baum);
    }

    public final void a() {
        this.c.c.execute(new bazk(this));
    }

    public final void a(bavx bavx, int i, baum baum) {
        basy c = this.c.c();
        if (bavx.m == bawa.CANCELLED && c != null && c.a()) {
            bavx = bavx.e;
            baum = new baum();
        }
        this.c.c.execute(new bazh(this, bavx, baum));
    }
}
