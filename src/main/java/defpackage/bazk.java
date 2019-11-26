package defpackage;

/* renamed from: bazk */
final class bazk extends bbaa {
    private final /* synthetic */ bazg a;

    bazk(bazg bazg) {
        this.a = bazg;
        super(bazg.c.e);
    }

    public final void a() {
        bbia bbia = this.a.c.b;
        bbhx.a();
        try {
            this.a.a.a();
        } catch (Throwable th) {
            bavx a = bavx.c.b(th).a("Failed to call onReady.");
            this.a.c.f.b(a);
            this.a.a(a, new baum());
        } finally {
            bbia bbia2 = this.a.c.b;
            bbhx.b();
        }
    }
}
