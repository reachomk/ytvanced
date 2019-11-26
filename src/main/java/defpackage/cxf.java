package defpackage;

/* renamed from: cxf */
public final class cxf implements cxv {
    public final int a;
    public final int b;
    private final boolean c;
    private final cxk d;
    private final cxg e;

    public static cxi a() {
        return new cxi();
    }

    @Deprecated
    public cxf() {
        this(1, aocf.UNSET_ENUM_VALUE, cxi.a, cxi.b);
    }

    @Deprecated
    public cxf(int i, int i2, cxk cxk, cxg cxg) {
        if (i != 1 || i2 == aocf.UNSET_ENUM_VALUE || i2 == -1) {
            this.a = i;
            this.c = false;
            this.b = i2;
            if (cxk == null) {
                cxk = cxi.a;
            }
            this.d = cxk;
            if (cxg == null) {
                cxg = cxi.b;
            }
            this.e = cxg;
            return;
        }
        throw new UnsupportedOperationException("Only snap to start is implemented for vertical lists");
    }

    public final arm b() {
        int i = this.b;
        if (i == -1) {
            return new dcf();
        }
        switch (i) {
            case 2147483646:
                return new anx();
            case Integer.MAX_VALUE:
                return new aoq();
            default:
                return null;
        }
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }

    public final czo a(cmg cmg) {
        return this.e.a(cmg.b, this.a, false);
    }

    public final cxk e() {
        return this.d;
    }
}
