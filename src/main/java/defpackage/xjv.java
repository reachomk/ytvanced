package defpackage;

/* renamed from: xjv */
final /* synthetic */ class xjv implements Runnable {
    private final xjt a;
    private final bqd b;
    private final bcjd c;

    xjv(xjt xjt, bqd bqd, bcjd bcjd) {
        this.a = xjt;
        this.b = bqd;
        this.c = bcjd;
    }

    public final void run() {
        xjt xjt = this.a;
        xjt.b.a(this.b, this.c);
    }
}
