package defpackage;

/* renamed from: bazh */
final class bazh extends bbaa {
    private final /* synthetic */ bavx a;
    private final /* synthetic */ baum b;
    private final /* synthetic */ bazg c;

    bazh(bazg bazg, bavx bavx, baum baum) {
        this.c = bazg;
        this.a = bavx;
        this.b = baum;
        super(bazg.c.e);
    }

    public final void a() {
        bazg bazg = this.c;
        if (!bazg.b) {
            bbia bbia = bazg.c.b;
            bbhx.a();
            try {
                this.c.a(this.a, this.b);
            } finally {
                bbia bbia2 = this.c.c.b;
                bbhx.b();
            }
        }
    }
}
