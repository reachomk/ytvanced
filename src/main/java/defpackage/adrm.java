package defpackage;

/* renamed from: adrm */
final class adrm implements tex {
    private final Runnable a;

    adrm(Runnable runnable) {
        this.a = runnable;
    }

    public final /* synthetic */ void a(teu teu) {
        if (!((tbw) teu).a().b()) {
            xtl.c(adrf.e, "Command fallback to using cloud channel.");
            this.a.run();
        }
    }
}
