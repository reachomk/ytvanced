package defpackage;

/* renamed from: dtq */
final class dtq implements Runnable {
    private final /* synthetic */ dtl a;

    dtq(dtl dtl) {
        this.a = dtl;
    }

    public final void run() {
        aosh a = this.a.a();
        if (a.f && a.g.size() != 0) {
            xgm xgm = (xgm) this.a.i.get();
            for (String a2 : a.g) {
                xgm.a(a2);
            }
        }
    }
}
