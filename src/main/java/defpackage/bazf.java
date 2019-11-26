package defpackage;

/* renamed from: bazf */
final class bazf extends bbaa {
    private final /* synthetic */ baum a;
    private final /* synthetic */ bazg b;

    bazf(bazg bazg, baum baum) {
        this.b = bazg;
        this.a = baum;
        super(bazg.c.e);
    }

    public final void a() {
        bazg bazg = this.b;
        if (!bazg.b) {
            bbia bbia = bazg.c.b;
            bbhx.a();
            try {
                this.b.a.a(this.a);
            } catch (Throwable th) {
                bavx a = bavx.c.b(th).a("Failed to read headers");
                this.b.c.f.b(a);
                this.b.a(a, new baum());
            } finally {
                bbia bbia2 = this.b.c.b;
                bbhx.b();
            }
        }
    }
}
