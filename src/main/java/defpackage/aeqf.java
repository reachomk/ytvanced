package defpackage;

/* renamed from: aeqf */
final /* synthetic */ class aeqf implements Runnable {
    private final aepu a;
    private final long b;

    aeqf(aepu aepu, long j) {
        this.a = aepu;
        this.b = j;
    }

    public final void run() {
        this.a.b(this.b);
    }
}
