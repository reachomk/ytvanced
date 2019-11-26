package defpackage;

/* renamed from: anki */
final class anki extends anhv implements Runnable {
    private final Runnable a;

    public anki(Runnable runnable) {
        this.a = (Runnable) amqw.a((Object) runnable);
    }

    public final void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            a(th);
            RuntimeException b = amrs.b(th);
        }
    }
}
