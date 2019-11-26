package defpackage;

/* renamed from: dlc */
final class dlc implements bcaa {
    private final int a;
    private final /* synthetic */ dkv b;

    dlc(dkv dkv, int i) {
        this.b = dkv;
        this.a = i;
    }

    public final Object get() {
        int i = this.a;
        bcaa bcaa;
        if (i == 0) {
            dkv dkv = this.b;
            bcaa e = dkv.e.e();
            bcaa = dkv.b;
            if (bcaa == null) {
                bcaa = new dlc(dkv, 1);
                dkv.b = bcaa;
            }
            bcaa bcaa2 = bcaa;
            dkt dkt = dkv.e;
            bcaa = dkt.j;
            if (bcaa == null) {
                bcaa = new dlf(dkt, 9);
                dkt.j = bcaa;
            }
            bcaa bcaa3 = bcaa;
            dkt = dkv.e;
            bcaa = dkt.k;
            if (bcaa == null) {
                bcaa = new dlf(dkt, 10);
                dkt.k = bcaa;
            }
            return new grq(e, bcaa2, bcaa3, bcaa, dkv.e.l.as(), dkv.e.l.fI());
        } else if (i == 1) {
            dkt dkt2 = this.b.e;
            bcaa = dkt2.h;
            if (bcaa == null) {
                bcaa = new dlf(dkt2, 8);
                dkt2.h = bcaa;
            }
            return new akpe(bcaa);
        } else {
            throw new AssertionError(i);
        }
    }
}
