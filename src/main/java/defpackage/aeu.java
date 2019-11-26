package defpackage;

import android.view.Menu;
import android.view.MenuItem;

/* renamed from: aeu */
final class aeu implements ahu {
    public final /* synthetic */ aek a;
    private final ahu b;

    public aeu(aek aek, ahu ahu) {
        this.a = aek;
        this.b = ahu;
    }

    public final boolean a(ahv ahv, Menu menu) {
        return this.b.a(ahv, menu);
    }

    public final boolean b(ahv ahv, Menu menu) {
        return this.b.b(ahv, menu);
    }

    public final boolean a(ahv ahv, MenuItem menuItem) {
        return this.b.a(ahv, menuItem);
    }

    public final void a(ahv ahv) {
        this.b.a(ahv);
        aek aek = this.a;
        if (aek.g != null) {
            aek.b.getDecorView().removeCallbacks(this.a.h);
        }
        aek = this.a;
        if (aek.f != null) {
            aek.o();
            aek = this.a;
            abr p = abe.p(aek.f);
            p.a(0.0f);
            aek.i = p;
            this.a.i.a(new aex(this));
        }
        aek = this.a;
        aei aei = aek.c;
        if (aei != null) {
            ahv = aek.e;
            aei.c_();
        }
        this.a.e = null;
    }
}
