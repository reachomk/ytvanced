package defpackage;

/* renamed from: ztf */
final /* synthetic */ class ztf implements Runnable {
    private final zte a;
    private final int b;

    ztf(zte zte, int i) {
        this.a = zte;
        this.b = i;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
