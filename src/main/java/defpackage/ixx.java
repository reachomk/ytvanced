package defpackage;

/* renamed from: ixx */
final /* synthetic */ class ixx implements Runnable {
    private final ixp a;
    private final Throwable b;

    ixx(ixp ixp, Throwable th) {
        this.a = ixp;
        this.b = th;
    }

    public final void run() {
        ixp ixp = this.a;
        ixp.e.a(this.b);
    }
}
