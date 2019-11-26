package defpackage;

import java.util.Collection;
import java.util.Collections;

/* renamed from: hpc */
final /* synthetic */ class hpc implements Runnable {
    private final hpd a;
    private final wxg b;

    hpc(hpd hpd, wxg wxg) {
        this.a = hpd;
        this.b = wxg;
    }

    public final void run() {
        Collection a;
        hpd hpd = this.a;
        wxg wxg = this.b;
        if (hpd.a.b()) {
            a = ((agwc) hpd.b.get()).b().k().a();
        } else {
            a = Collections.emptyList();
        }
        hpd.c.execute(new hpg(wxg, a));
    }
}
