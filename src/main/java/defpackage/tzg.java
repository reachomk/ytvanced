package defpackage;

/* renamed from: tzg */
final class tzg implements Runnable {
    private final /* synthetic */ Runnable a;
    private final /* synthetic */ tzd b;

    tzg(tzd tzd, Runnable runnable) {
        this.b = tzd;
        this.a = runnable;
    }

    public final void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            this.b.a.a(th);
        }
    }
}
