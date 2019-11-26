package defpackage;

/* renamed from: bawf */
public final class bawf implements Runnable {
    private final /* synthetic */ bawi a;
    private final /* synthetic */ Runnable b;
    private final /* synthetic */ bawg c;

    public bawf(bawg bawg, bawi bawi, Runnable runnable) {
        this.c = bawg;
        this.a = bawi;
        this.b = runnable;
    }

    public final void run() {
        this.c.execute(this.a);
    }

    public final String toString() {
        return String.valueOf(this.b.toString()).concat("(scheduled in SynchronizationContext)");
    }
}
