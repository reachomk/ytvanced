package defpackage;

import java.util.Collection;
import java.util.Collections;

/* renamed from: hpj */
public final /* synthetic */ class hpj implements Runnable {
    private final hpd a;
    private final wxg b;

    public hpj(hpd hpd, wxg wxg) {
        this.a = hpd;
        this.b = wxg;
    }

    public final void run() {
        Collection a;
        hpd hpd = this.a;
        wxg wxg = this.b;
        if (hpd.a.d()) {
            a = hpd.a().a();
        } else {
            a = Collections.emptyList();
        }
        hpd.c.execute(new hph(wxg, a));
    }
}
