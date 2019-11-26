package defpackage;

/* renamed from: uea */
final /* synthetic */ class uea implements udy {
    private final ueb a;
    private final String b;

    uea(ueb ueb, String str) {
        this.a = ueb;
        this.b = str;
    }

    public final Object a() {
        ueb ueb = this.a;
        return rzt.a(ueb.a.getContentResolver(), this.b, null);
    }
}
