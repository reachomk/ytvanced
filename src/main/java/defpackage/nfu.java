package defpackage;

/* renamed from: nfu */
final /* synthetic */ class nfu implements Runnable {
    private final nfs a;
    private final int b;
    private final boolean c;

    nfu(nfs nfs, int i, boolean z) {
        this.a = nfs;
        this.b = i;
        this.c = z;
    }

    public final void run() {
        nfs nfs = this.a;
        nfs.a.a(this.b, this.c);
    }
}
