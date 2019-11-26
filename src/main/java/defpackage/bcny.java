package defpackage;

/* renamed from: bcny */
final class bcny implements Runnable {
    public Thread a;
    public bcjq b;
    private final Runnable c;

    public final void run() {
        if (Thread.currentThread() == this.a) {
            this.b = new bcjq();
        } else {
            this.c.run();
        }
    }

    /* synthetic */ bcny(Runnable runnable, Thread thread) {
        this.c = runnable;
        this.a = thread;
    }
}
