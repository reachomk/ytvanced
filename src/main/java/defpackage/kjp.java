package defpackage;

/* renamed from: kjp */
final /* synthetic */ class kjp implements akoq {
    private final kjm a;

    kjp(kjm kjm) {
        this.a = kjm;
    }

    public final void a(akor akor, aknh aknh, int i) {
        kjm kjm = this.a;
        epx.a(akor, new kjo(kjm, i));
        akor.a(amur.a("chipSelected", aknh.c(i)));
        aktq aktq = kjm.b;
        if (aktq != null) {
            akor.a(amur.a("sectionListController", aktq));
        }
        lsv lsv = kjm.c;
        if (lsv != null) {
            akor.a(amur.a("sectionController", lsv));
        }
    }
}
