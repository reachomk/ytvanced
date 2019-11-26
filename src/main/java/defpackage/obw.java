package defpackage;

/* renamed from: obw */
final /* synthetic */ class obw implements Runnable {
    private final obr a;
    private final nzw b;

    obw(obr obr, nzw nzw) {
        this.a = obr;
        this.b = nzw;
    }

    public final void run() {
        obr obr = this.a;
        obr.a.b(this.b);
    }
}
