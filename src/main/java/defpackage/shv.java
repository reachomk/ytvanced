package defpackage;

/* renamed from: shv */
final /* synthetic */ class shv implements Runnable {
    private final shr a;

    shv(shr shr) {
        this.a = shr;
    }

    public final void run() {
        shr shr = this.a;
        boolean z = true;
        if (!(shr.m.a() || shr.n)) {
            z = false;
        }
        shr.a(z);
        shr.q = null;
    }
}
