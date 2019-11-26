package defpackage;

/* renamed from: aelu */
final class aelu extends xto {
    private final /* synthetic */ aelr a;

    aelu(aelr aelr, String str) {
        this.a = aelr;
        super(str);
    }

    public final /* synthetic */ Object a() {
        aell aell = this.a.a;
        Object valueOf = Integer.valueOf(-1);
        if (aell == null) {
            return valueOf;
        }
        aepg a = aell.a();
        if (a == null || a.a == null) {
            return valueOf;
        }
        int i = a.b;
        return i > 0 ? Integer.valueOf(i) : valueOf;
    }
}
