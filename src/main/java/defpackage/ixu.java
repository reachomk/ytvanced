package defpackage;

/* renamed from: ixu */
final /* synthetic */ class ixu implements Runnable {
    private final ixp a;
    private final Throwable b;

    ixu(ixp ixp, Throwable th) {
        this.a = ixp;
        this.b = th;
    }

    public final void run() {
        ixp ixp = this.a;
        ixp.e.a(this.b);
    }
}
