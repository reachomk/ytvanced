package defpackage;

/* renamed from: amkp */
final class amkp implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ amkc b;

    amkp(amkc amkc, long j) {
        this.b = amkc;
        this.a = j;
    }

    public final void run() {
        this.b.a.E = this.a;
    }
}
