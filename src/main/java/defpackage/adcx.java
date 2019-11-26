package defpackage;

/* renamed from: adcx */
final class adcx implements addr {
    private final /* synthetic */ adcy a;

    public final void a(adiq adiq) {
        String str = this.a.a.e() ? this.a.a.h()[2] : "";
        if (!str.isEmpty() && !str.equals("<unknown ssid>")) {
            adjg d = adiq.d();
            if (d != null) {
                adda a = adda.a(this.a.b.a(), adiq.c(), adiq.h(), adiq.i(), str, adiq.n());
                adda a2 = this.a.d.a(d, a);
                if (a2 != null && a2.a == a.a && (a2.b() != null || a.b() == null)) {
                    String.format("%s, Already cached.", new Object[]{a.a()});
                } else {
                    this.a.a();
                }
            }
        }
    }

    /* synthetic */ adcx(adcy adcy) {
        this.a = adcy;
    }
}
