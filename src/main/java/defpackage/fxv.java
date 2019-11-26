package defpackage;

/* renamed from: fxv */
final /* synthetic */ class fxv implements wef {
    private final Runnable a;
    private final wef b;

    fxv(Runnable runnable, wef wef) {
        this.a = runnable;
        this.b = wef;
    }

    public final void a(ajst ajst, boolean z) {
        Runnable runnable = this.a;
        wef wef = this.b;
        if (runnable != null) {
            runnable.run();
        }
        if (wef != null) {
            wef.a(ajst, z);
        }
    }
}
