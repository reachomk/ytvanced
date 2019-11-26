package defpackage;

/* renamed from: amkn */
final class amkn implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ amkc b;

    amkn(amkc amkc, long j) {
        this.b = amkc;
        this.a = j;
    }

    public final void run() {
        this.b.a.E = this.a;
    }
}
