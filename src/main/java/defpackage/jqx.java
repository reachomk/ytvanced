package defpackage;

/* renamed from: jqx */
final /* synthetic */ class jqx implements bcvq {
    private final jqr a;
    private final int b;

    jqx(jqr jqr, int i) {
        this.a = jqr;
        this.b = i;
    }

    public final Object a(Object obj) {
        jqr jqr = this.a;
        int i = this.b;
        jqq jqq = (jqq) obj;
        boolean z = false;
        if (jqr.a(i)) {
            z = jqq.b().a() ^ 1;
        } else if (jqq.b().a() && ((Integer) jqq.b().b()).intValue() == i) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
