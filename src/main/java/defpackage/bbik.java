package defpackage;

/* renamed from: bbik */
final class bbik extends basc {
    private final bbio a;
    private final bbii b;
    private final boolean c = true;
    private boolean d;

    bbik(bbio bbio, bbii bbii) {
        this.a = bbio;
        this.b = bbii;
        if (bbio instanceof bbil) {
            ((bbil) bbio).b();
        }
    }

    public final void a() {
    }

    public final void a(baum baum) {
    }

    public final void a(Object obj) {
        if (!this.d || this.c) {
            this.d = true;
            this.a.a(obj);
            if (this.c) {
                bbii bbii = this.b;
                if (bbii.b) {
                    bbii.a.a(1);
                    return;
                }
                return;
            }
            return;
        }
        throw bavx.i.a("More than one responses received for unary or client-streaming call").b();
    }

    public final void a(bavx bavx, baum baum) {
        if (bavx.a()) {
            this.a.a();
        } else {
            this.a.a(bavx.a(baum));
        }
    }
}
