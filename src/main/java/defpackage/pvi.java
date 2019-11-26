package defpackage;

/* renamed from: pvi */
abstract class pvi implements Runnable {
    private final /* synthetic */ puy a;

    public abstract void a();

    public final void run() {
        this.a.b.lock();
        try {
            if (!Thread.interrupted()) {
                a();
                this.a.b.unlock();
            }
        } catch (RuntimeException e) {
            pvq pvq = this.a.a;
            pvq.e.sendMessage(pvq.e.obtainMessage(2, e));
        } finally {
            this.a.b.unlock();
        }
    }

    /* synthetic */ pvi(puy puy) {
        this.a = puy;
    }
}
