package defpackage;

/* renamed from: abpy */
final /* synthetic */ class abpy implements Runnable {
    private final abpz a;
    private final aaml b;
    private final ajti c;
    private final Runnable d;

    abpy(abpz abpz, aaml aaml, ajti ajti, Runnable runnable) {
        this.a = abpz;
        this.b = aaml;
        this.c = ajti;
        this.d = runnable;
    }

    public final void run() {
        abpz abpz = this.a;
        abpz.a.a(this.b, this.c, this.d);
    }
}
