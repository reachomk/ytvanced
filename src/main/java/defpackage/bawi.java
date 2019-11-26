package defpackage;

/* renamed from: bawi */
public final class bawi implements Runnable {
    public boolean a;
    public boolean b;
    private final Runnable c;

    public bawi(Runnable runnable) {
        this.c = (Runnable) amqw.a((Object) runnable, (Object) "task");
    }

    public final void run() {
        if (!this.a) {
            this.b = true;
            this.c.run();
        }
    }
}
