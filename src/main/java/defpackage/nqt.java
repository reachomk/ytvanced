package defpackage;

/* renamed from: nqt */
final class nqt implements Runnable {
    private final /* synthetic */ nqw a;
    private final /* synthetic */ nqs b;

    nqt(nqs nqs, nqw nqw) {
        this.b = nqs;
        this.a = nqw;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
