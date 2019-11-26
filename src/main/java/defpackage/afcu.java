package defpackage;

/* renamed from: afcu */
final /* synthetic */ class afcu implements Runnable {
    private final afcv a;

    afcu(afcv afcv) {
        this.a = afcv;
    }

    public final void run() {
        afcv afcv = this.a;
        afbo afbo = afcv.a;
        afdb afdb = afbo.t;
        afbo.t = null;
        if (afdb != null) {
            afcv.a.a(afdb.a, afdb.c, afdb.b, afdb.d);
        }
    }
}
