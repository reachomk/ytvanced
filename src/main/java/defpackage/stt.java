package defpackage;

/* renamed from: stt */
final /* synthetic */ class stt implements syf {
    private final stu a;
    private final sxx b;
    private final bdhv c;
    private final bdho d;
    private final bdhv e;

    stt(stu stu, sxx sxx, bdhv bdhv, bdho bdho, bdhv bdhv2) {
        this.a = stu;
        this.b = sxx;
        this.c = bdhv;
        this.d = bdho;
        this.e = bdhv2;
    }

    public final bdhc a(sxq sxq) {
        stu stu = this.a;
        sxx sxx = this.b;
        bdhv bdhv = this.c;
        bdho bdho = this.d;
        bdhv bdhv2 = this.e;
        try {
            return sxx.a((aocf) szb.a(bdhv, sxx.a()), bdho, sxq);
        } catch (sxf e) {
            String a = szb.a(bdho);
            String a2 = stu.a(bdhv2);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + 27) + String.valueOf(a2).length());
            stringBuilder.append(a);
            stringBuilder.append(" Error executing template: ");
            stringBuilder.append(a2);
            a = stringBuilder.toString();
            stu.a.b(4, a, e);
            throw new sxf(a, e);
        }
    }
}
