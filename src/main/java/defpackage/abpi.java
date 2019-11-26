package defpackage;

/* renamed from: abpi */
final class abpi implements akoq {
    private final /* synthetic */ abpe a;

    public final void a(akor akor, aknh aknh, int i) {
        Object c = aknh.c(i);
        if (c instanceof augz) {
            c = ((augz) c).b;
        } else if (c instanceof auhb) {
            c = ((auhb) c).b;
        } else if (c instanceof augv) {
            c = ((augv) c).b;
        } else {
            c = null;
        }
        abpj abpj = (abpj) this.a.c.get((String) amqw.a(c));
        akor.a("ticker_start_timestamp_ms", Long.valueOf(abpj.c));
        akor.a("ticker_applied_action", abpj.d);
    }

    /* synthetic */ abpi(abpe abpe) {
        this.a = abpe;
    }
}
