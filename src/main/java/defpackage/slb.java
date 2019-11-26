package defpackage;

import android.os.Looper;
import android.view.View;

/* renamed from: slb */
public final class slb implements swd {
    public final sko a;

    public slb(sko sko) {
        this.a = sko;
    }

    public final anwy a() {
        return axlj.d;
    }

    public final /* synthetic */ bblt a(Object obj, swg swg) {
        axlj axlj = (axlj) obj;
        if ((axlj.a & 1) == 0 || !swg.a().a()) {
            return bblt.a();
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return bblt.a(new sle(this, axlj, swg)).b(bbmt.a());
        }
        sko sko = this.a;
        azuj azuj = axlj.b;
        if (azuj == null) {
            azuj = azuj.c;
        }
        sko.a(azuj, (View) swg.a().b());
        return bblt.a();
    }
}
