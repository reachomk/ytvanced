package defpackage;

/* renamed from: jha */
final class jha extends jgy {
    private final Runnable b;
    private final /* synthetic */ jgv c;

    jha(jgv jgv, Runnable runnable) {
        this.c = jgv;
        super(jgv);
        this.b = runnable;
    }

    public final void a(aaxw aaxw) {
        this.c.c.l();
        super.a(aaxw);
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
