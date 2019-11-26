package defpackage;

/* renamed from: adua */
public final class adua {
    private final bbb a;
    private final baz b;
    private final adgw c;
    private final xhv d;
    private final adcu e;
    private final xci f;
    private final adhn g;

    public adua(bbb bbb, baz baz, adgw adgw, xhv xhv, adcu adcu, xci xci, adhn adhn) {
        this.a = bbb;
        this.b = baz;
        this.c = adgw;
        this.d = xhv;
        this.e = adcu;
        this.f = xci;
        this.g = adhn;
    }

    public final adty a(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            return new adrg(this.a, this.b, this.c, this.d, this.f, this.g);
        } else {
            if (i2 != 2) {
                return i2 != 3 ? null : new adrx(this.a, this.b, this.c, this.d, this.f);
            } else {
                return new adtf(this.a, this.b, this.c, this.d, this.e, this.f);
            }
        }
    }
}
