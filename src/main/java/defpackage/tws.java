package defpackage;

/* renamed from: tws */
final /* synthetic */ class tws implements Runnable {
    private final twn a;
    private final twm[] b;

    tws(twn twn, twm[] twmArr) {
        this.a = twn;
        this.b = twmArr;
    }

    public final void run() {
        twn twn = this.a;
        twn.a(twn.f.a(this.b));
    }
}
