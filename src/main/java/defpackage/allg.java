package defpackage;

/* renamed from: allg */
public final class allg {
    public final String a;
    public final boolean b;

    public allg(Object obj) {
        xvd.a(alpt.a(obj));
        String str = null;
        if (obj instanceof aqju) {
            str = ((aqju) obj).e;
        } else if (obj instanceof aqkc) {
            aqkc aqkc = (aqkc) obj;
            if ((aqkc.a & 16) != 0) {
                str = aqkc.f;
            }
        }
        this.a = xvd.a(str);
        this.b = obj instanceof aqkc;
    }
}
