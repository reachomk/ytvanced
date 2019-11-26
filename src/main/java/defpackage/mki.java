package defpackage;

/* renamed from: mki */
final /* synthetic */ class mki implements Runnable {
    private final mkj a;
    private final boolean b;
    private final apxu c;

    mki(mkj mkj, boolean z, apxu apxu) {
        this.a = mkj;
        this.b = z;
        this.c = apxu;
    }

    public final void run() {
        this.a.b(this.b, this.c);
    }
}
