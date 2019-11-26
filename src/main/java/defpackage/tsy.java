package defpackage;

/* renamed from: tsy */
final class tsy implements Runnable {
    private final /* synthetic */ tst a;

    tsy(tst tst) {
        this.a = tst;
    }

    public final void run() {
        this.a.d();
        tst tst = this.a;
        tst.d = 0.0f;
        tst.c = (tst.c + 216.0f) % 360.0f;
        tst.e = tst.b();
        tst = this.a;
        tst.f = tst.g[tst.e];
        tst.b.setIntValues(new int[]{r2, r1[tst.b()]});
    }
}
