package defpackage;

/* renamed from: adsn */
final class adsn implements Runnable {
    private final /* synthetic */ adso a;

    adsn(adso adso) {
        this.a = adso;
    }

    public final void run() {
        adty adty = this.a.e;
        if (adty != null) {
            adty.a();
            this.a.d();
        }
    }
}
