package defpackage;

/* renamed from: xzq */
public final /* synthetic */ class xzq implements Runnable {
    private final xzn a;
    private final aqop b;

    public xzq(xzn xzn, aqop aqop) {
        this.a = xzn;
        this.b = aqop;
    }

    public final void run() {
        xzn xzn = this.a;
        aqop aqop = this.b;
        String str = aqop.b;
        long j = aqop.d;
        ycz ycz = (ycz) xzn.h.a.get(str);
        if (ycz != null && ycz.a.d <= j) {
            ycz.b = false;
            xzn.a();
        }
    }
}
