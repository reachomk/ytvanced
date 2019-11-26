package defpackage;

/* renamed from: afzx */
final /* synthetic */ class afzx implements Runnable {
    private final afzs a;
    private final wxg b;
    private final String c;

    afzx(afzs afzs, wxg wxg, String str) {
        this.a = afzs;
        this.b = wxg;
        this.c = str;
    }

    public final void run() {
        afzs afzs = this.a;
        wxg wxg = this.b;
        String str = this.c;
        if (afzs.i.v()) {
            wxg.a(null, afzs.k(str));
        }
    }
}
