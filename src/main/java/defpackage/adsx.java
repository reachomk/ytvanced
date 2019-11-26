package defpackage;

import android.net.Uri;

/* renamed from: adsx */
final /* synthetic */ class adsx implements Runnable {
    private final adsw a;

    adsx(adsw adsw) {
        this.a = adsw;
    }

    public final void run() {
        adsw adsw = this.a;
        Uri a = adsw.s.a();
        if (a == null) {
            String str = adsw.e;
            String valueOf = String.valueOf(adsw.s);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 49);
            stringBuilder.append("Missing app URL to launch YouTube on DIAL device ");
            stringBuilder.append(valueOf);
            xtl.a(str, stringBuilder.toString());
            adsw.a(adpr.UNKNOWN, 11);
            return;
        }
        adsw.g.a(a, adsw.n, adsw.q, adsw.s.c(), new adte(adsw));
    }
}
