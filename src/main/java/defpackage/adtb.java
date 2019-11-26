package defpackage;

import java.util.Locale;

/* renamed from: adtb */
final /* synthetic */ class adtb implements addr {
    private final adsw a;
    private final adiq b;

    adtb(adsw adsw, adiq adiq) {
        this.a = adsw;
        this.b = adiq;
    }

    public final void a(adiq adiq) {
        adsw adsw = this.a;
        adiq adiq2 = this.b;
        xtl.c(adsw.e, String.format(Locale.US, "Trying to wake-up %s, found %s", new Object[]{adiq2.toString(), adiq.toString()}));
        if (adiq.d().equals(adiq2.d()) && !adsw.v.getAndSet(true)) {
            String str = adsw.e;
            String valueOf = String.valueOf(adiq.c());
            String str2 = "Successful wake-up of ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            xtl.c(str, valueOf);
            addv addv = adsw.t;
            if (addv != null) {
                addv.b();
                adsw.t = null;
            }
            adsw.s = adiq;
            adsw.u.a("d_lws");
            adsw.N();
        }
    }
}
