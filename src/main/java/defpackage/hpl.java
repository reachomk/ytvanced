package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: hpl */
public final /* synthetic */ class hpl implements Runnable {
    private final hpd a;
    private final String b;
    private final wxg c;

    public hpl(hpd hpd, String str, wxg wxg) {
        this.a = hpd;
        this.b = str;
        this.c = wxg;
    }

    public final void run() {
        List b;
        hpd hpd = this.a;
        String str = this.b;
        wxg wxg = this.c;
        if (hpd.a.d()) {
            b = hpd.a().b(str);
        } else {
            b = Collections.emptyList();
        }
        hpd.c.execute(new hpf(wxg, str, b));
    }
}
