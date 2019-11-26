package defpackage;

/* renamed from: lmz */
public final /* synthetic */ class lmz implements llz {
    private final lmv a;
    private final int b;

    public lmz(lmv lmv, int i) {
        this.a = lmv;
        this.b = i;
    }

    public final void a(int i, int i2) {
        lmv lmv = this.a;
        int i3 = this.b;
        boolean z = false;
        if (i == 0 && Math.abs(i2) < i3) {
            z = true;
        }
        lgq lgq = (lgq) lmv.r.get();
        if (lgq.b != z) {
            lgq.b = z;
            if (z) {
                aafv aafv = lgq.c;
                if (aafv != null) {
                    lgq.a(aafv, lgq.d);
                    lgq.b(null);
                }
            }
        }
    }
}
