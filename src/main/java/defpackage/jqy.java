package defpackage;

/* renamed from: jqy */
final /* synthetic */ class jqy implements bcvq {
    private final jqr a;
    private final int b;

    jqy(jqr jqr, int i) {
        this.a = jqr;
        this.b = i;
    }

    public final Object a(Object obj) {
        jqr jqr = this.a;
        int i = this.b;
        jqq jqq = (jqq) obj;
        boolean z = true;
        if ((!jqr.a(i) || (jqq.b().a() && (!jqq.c() || jqq.a().a()))) && !((jqq.b().a() && ((Integer) jqq.b().b()).intValue() == i) || (jqq.a().a() && ((Integer) jqq.a().b()).intValue() == i))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
