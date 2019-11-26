package defpackage;

/* renamed from: zwm */
public final class zwm implements afqd {
    private final /* synthetic */ Runnable b;
    private final /* synthetic */ zwj c;

    public zwm(zwj zwj, Runnable runnable) {
        this.c = zwj;
        this.b = runnable;
    }

    public final void b() {
    }

    public final void a() {
        this.b.run();
    }

    public final void a(Exception exception) {
        this.c.o.c(exception);
    }
}
