package defpackage;

/* renamed from: xyi */
final /* synthetic */ class xyi implements akoq {
    private final xyf a;

    xyi(xyf xyf) {
        this.a = xyf;
    }

    public final void a(akor akor, aknh aknh, int i) {
        akor.a("sectionController", this.a);
        boolean z = true;
        akor.a("ConnectionShelfIsFirstItem", Boolean.valueOf(i == 0));
        if (i != aknh.d() - 1) {
            z = false;
        }
        akor.a("ConnectionShelfIsLastItem", Boolean.valueOf(z));
    }
}
