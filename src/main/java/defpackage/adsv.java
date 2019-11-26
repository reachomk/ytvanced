package defpackage;

/* renamed from: adsv */
final /* synthetic */ class adsv implements Runnable {
    private final adsw a;

    adsv(adsw adsw) {
        this.a = adsw;
    }

    public final void run() {
        adsw adsw = this.a;
        adiq adiq = adsw.s;
        if (!adsw.v.get() && adsw.w > 0) {
            adsw.k.a(new adtb(adsw, adiq), false);
            adsw.w--;
            adsw.b((long) adsw.x);
        } else if (!adsw.v.get() && adsw.w == 0) {
            adpr adpr = adpr.LAUNCH_FAIL_TIMEOUT;
            String str = adsw.e;
            String valueOf = String.valueOf(adiq);
            String valueOf2 = String.valueOf(adpr);
            StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 32) + valueOf2.length());
            stringBuilder.append("Could not wake up DIAL device  ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" ");
            stringBuilder.append(valueOf2);
            xtl.a(str, stringBuilder.toString());
            adsw.u.a("d_lwf");
            adsw.a(adpr, 12);
        }
    }
}
