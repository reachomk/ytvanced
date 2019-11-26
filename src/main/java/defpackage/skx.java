package defpackage;

import android.os.Looper;
import android.view.View;

/* renamed from: skx */
public final class skx implements swd {
    public final sko a;

    public skx(sko sko) {
        this.a = sko;
    }

    public final anwy a() {
        return awme.d;
    }

    public final /* synthetic */ bblt a(Object obj, swg swg) {
        awme awme = (awme) obj;
        if ((awme.a & 1) == 0 || !swg.a().a()) {
            return bblt.a();
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return bblt.a(new sla(this, awme, swg)).b(bbmt.a());
        }
        sko sko = this.a;
        azuj azuj = awme.b;
        if (azuj == null) {
            azuj = azuj.c;
        }
        sko.a(azuj, (View) swg.a().b());
        return bblt.a();
    }
}
