package defpackage;

/* renamed from: jqt */
final /* synthetic */ class jqt implements akoq {
    private final jqr a;

    jqt(jqr jqr) {
        this.a = jqr;
    }

    public final void a(akor akor, aknh aknh, int i) {
        Object jqw;
        jqr jqr = this.a;
        if (jqr.a(i)) {
            jqw = new jqw(jqr);
            amqw.a(jqw);
            akor.a("CHIP_CLOUD_CHIP_ON_CLICK_LISTENER", jqw);
        } else {
            epx.a(akor, new jqv(jqr, i));
        }
        jqw = jqr.d.a(new jqy(jqr, i)).b(new jqx(jqr, i));
        amqw.a(jqw);
        akor.a("CHIP_CLOUD_CHIP_SELECTION_CHANGED_OBSERVABLE_KEY", jqw);
        akor.a(amur.a("position", Integer.valueOf(i)));
        akor.a(amur.a("sectionListController", jqr.e));
        akor.a(jqr.c);
    }
}
