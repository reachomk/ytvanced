package defpackage;

/* renamed from: ryu */
final class ryu implements Runnable {
    private final /* synthetic */ ryv a;

    ryu(ryv ryv) {
        this.a = ryv;
    }

    public final void run() {
        synchronized (this.a.a) {
            ryf ryf = this.a.b;
            if (ryf != null) {
                ryf.a();
            }
        }
    }
}
