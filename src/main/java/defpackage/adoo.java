package defpackage;

import java.util.Locale;

/* renamed from: adoo */
final /* synthetic */ class adoo implements Runnable {
    private final adoj a;
    private final adoi b;

    adoo(adoj adoj, adoi adoi) {
        this.a = adoj;
        this.b = adoi;
    }

    public final void run() {
        adoj adoj = this.a;
        adoi adoi = this.b;
        synchronized (adoj.k) {
            adoi adoi2 = adoj.j;
            if (adoi2 == adoi) {
                adoj.j = null;
            } else if (adoi2 != null) {
                xtl.a(adoj.a, String.format(Locale.US, "Current promotion : %s doesn't match the hidden promotion: %s", new Object[]{adoj.j.a(), adoi.a()}));
            }
            for (adoh b : adoj.i) {
                b.b(adoi);
            }
        }
    }
}
