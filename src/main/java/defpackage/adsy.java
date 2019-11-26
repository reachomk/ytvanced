package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: adsy */
final /* synthetic */ class adsy implements Runnable {
    private final adsw a;

    adsy(adsw adsw) {
        this.a = adsw;
    }

    public final void run() {
        adsw adsw = this.a;
        Uri a = adsw.s.a();
        if (a != null) {
            adsw.s = adsw.s.a(adsw.h.a(a));
        }
        boolean e = adsw.e();
        if (adsw.R()) {
            adsw.u.a("d_lar");
            if (e || adsw.p.g() == 1) {
                adio adio = null;
                if (adsw.R()) {
                    adjb adjb;
                    adiq adiq = adsw.s;
                    if (adiq.k.g() == null) {
                        if (!adir.a(adsw.q)) {
                            String string = adsw.f.getString(adiq.d().a, null);
                            if (string != null) {
                                adjb = new adjb(string);
                            }
                        }
                        adjb = null;
                    } else {
                        adjb = adiq.k.g();
                    }
                    if (adjb != null) {
                        adim adim = (adim) adsw.i.a(Arrays.asList(new adjb[]{adjb})).get(adjb);
                        if (adim != null) {
                            adix adix = !adiq.k.d() ? adix.DIAL : adix.IN_APP_DIAL;
                            adin a2 = adio.h().a(adjb).a(adiq.c());
                            a2.a = adim;
                            for (adio br_ : adsw.j.a(Arrays.asList(new adio[]{a2.a(adix).b()}))) {
                                if (adjb.equals(br_.br_())) {
                                    adio = r3;
                                    break;
                                }
                            }
                        }
                        String str = adsw.e;
                        String valueOf = String.valueOf(adjb);
                        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 45);
                        stringBuilder.append("Unable to retrieve lounge token for screenId ");
                        stringBuilder.append(valueOf);
                        xtl.a(str, stringBuilder.toString());
                    }
                }
                if (adio != null) {
                    adsw.a(adio);
                    return;
                } else if (e) {
                    adsw.b(9);
                    return;
                }
            }
            xtl.c(adsw.e, "Multi user session is not enabled. Will stop the app first.");
            adsw.O();
        } else if (e) {
            adsw.b(7);
            return;
        }
        adsw.N();
    }
}
