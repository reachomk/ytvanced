package defpackage;

/* renamed from: cxi */
public final class cxi {
    public static final cxk a = cxk.a().a();
    public static final cxg b = new cxh();
    public int c = 1;
    public int d = aocf.UNSET_ENUM_VALUE;
    public cxk e = a;
    private final cxg f = b;

    cxi() {
    }

    public final cxf a() {
        cxf cxf = new cxf(this.c, this.d, this.e, this.f);
        int i = cxf.b;
        if (cxf.a != 1 || i == aocf.UNSET_ENUM_VALUE || i == -1) {
            return cxf;
        }
        throw new UnsupportedOperationException("Only snap to start is implemented for vertical lists");
    }
}
