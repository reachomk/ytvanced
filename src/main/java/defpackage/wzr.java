package defpackage;

/* renamed from: wzr */
final /* synthetic */ class wzr implements Runnable {
    private final Throwable a;

    wzr(Throwable th) {
        this.a = th;
    }

    public final void run() {
        throw new RuntimeException("Crashing on uncaught exception", this.a);
    }
}
