package defpackage;

/* renamed from: aduk */
final /* synthetic */ class aduk implements Runnable {
    private final adui a;
    private final wxg b;

    aduk(adui adui, wxg wxg) {
        this.a = adui;
        this.b = wxg;
    }

    public final void run() {
        adui adui = this.a;
        wxg wxg = this.b;
        Object a = adui.e.a();
        if (wxg != null) {
            wxg.a(null, a);
        }
    }
}
