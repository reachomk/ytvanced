package defpackage;

/* renamed from: iya */
final /* synthetic */ class iya implements Runnable {
    private final ixw a;
    private final Throwable b;

    iya(ixw ixw, Throwable th) {
        this.a = ixw;
        this.b = th;
    }

    public final void run() {
        ixw ixw = this.a;
        ixw.a.e.a(this.b);
    }
}
