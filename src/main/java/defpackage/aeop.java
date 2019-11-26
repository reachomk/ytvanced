package defpackage;

/* renamed from: aeop */
final class aeop implements Runnable {
    private final /* synthetic */ aeoq a;

    aeop(aeoq aeoq) {
        this.a = aeoq;
    }

    public final void run() {
        synchronized (this.a) {
            aeoq aeoq = this.a;
            if (aeoq.a) {
                return;
            }
            aeoq.a = true;
            aeoq.b("Onesie player service response timeout.");
        }
    }
}
