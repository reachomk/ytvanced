package defpackage;

/* renamed from: xyh */
final /* synthetic */ class xyh implements Runnable {
    private final xyf a;
    private final ycw b;

    xyh(xyf xyf, ycw ycw) {
        this.a = xyf;
        this.b = ycw;
    }

    public final void run() {
        xyf xyf = this.a;
        for (aqoz aqoz : this.b.b) {
            if ((aqoz.a & 8) != 0) {
                xxl xxl = xyf.c;
                apxu apxu = aqoz.f;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                xxl.a(apxu);
            }
        }
    }
}
