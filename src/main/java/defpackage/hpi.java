package defpackage;

/* renamed from: hpi */
final /* synthetic */ class hpi implements Runnable {
    private final hpd a;
    private final String b;
    private final wxg c;

    hpi(hpd hpd, String str, wxg wxg) {
        this.a = hpd;
        this.b = str;
        this.c = wxg;
    }

    public final void run() {
        hpd hpd = this.a;
        String str = this.b;
        hpd.c.execute(new hpe(this.c, str, hpd.a.d() ? hpd.a().a(str) : null));
    }
}
