package defpackage;

import android.net.Uri;
import java.util.Locale;

/* renamed from: dpa */
final class dpa implements Runnable {
    private final /* synthetic */ dtg a;
    private final /* synthetic */ dos b;

    dpa(dos dos, dtg dtg) {
        this.b = dos;
        this.a = dtg;
    }

    public final void run() {
        if (!((zzf) this.b.ah.get()).f().h) {
            xgr xgr = (xgr) this.a.d().get();
            if (xgr.a()) {
                afrm afrm = (afrm) this.b.B.get();
                for (Uri uri : xgr.b) {
                    xak.b();
                    if (((xhv) afrm.a.get()).c()) {
                        long a = ((xsc) afrm.c.get()).a();
                        String.format(Locale.US, "Prewarm %s", new Object[]{uri});
                        afro afro = new afro(afrm, uri.toString(), new afrp(), a);
                        afro.i = false;
                        afro.i();
                        ((xhf) afrm.b.get()).b(afro);
                    }
                }
            }
        }
    }
}
