package defpackage;

/* renamed from: ydr */
final /* synthetic */ class ydr implements Runnable {
    private final ydq a;

    ydr(ydq ydq) {
        this.a = ydq;
    }

    public final void run() {
        ydq ydq = this.a;
        aqin aqin = ydq.d;
        if (aqin != null) {
            ydu ydu = ydq.e;
            if (ydu != null) {
                ydq.a(ydu.a((aqin.a & 1) != 0 ? aqin.b : null) ^ 1);
            }
        }
    }
}
