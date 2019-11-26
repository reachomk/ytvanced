package defpackage;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;

/* renamed from: wcl */
public final class wcl implements ahoj, vvd, vzk {
    public wae a;
    private final wad b;
    private wci c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private final Resources h;

    public wcl(Resources resources, acvx acvx, vrk vrk) {
        this.h = resources;
        this.b = new wad(acvx, vrk);
        this.b.a(this);
    }

    public final void a() {
    }

    public final void a(float f) {
    }

    public final void a(float f, int i) {
    }

    public final void a(aoiy aoiy) {
    }

    public final void a(axoq axoq) {
    }

    public final void a(vrd vrd) {
    }

    public final void a(vsm vsm) {
    }

    public final void a(vzc vzc, boolean z, int i) {
    }

    public final void a(boolean z, int i) {
    }

    public final void a(boolean z, boolean z2, boolean z3, boolean z4) {
    }

    public final void b(int i) {
    }

    private final void a(wci wci) {
        this.c = wci;
        if (wci != null) {
            b();
            this.c.a(this.d);
            this.c.a(this.e);
            this.c.b(this.f);
            boolean z = true;
            if (this.g == 1) {
                this.c.a();
            }
            int i = this.g;
            if (!(i == 0 || i == 1)) {
                z = false;
            }
            a(z);
        }
    }

    public final void a(wae wae) {
        this.a = wae;
        b();
    }

    private final void b() {
        wci wci = this.c;
        if (wci != null && this.a != null) {
            wci.b = new wco(this);
        }
    }

    public final void a(int i, boolean z) {
        this.g = i;
        if (z) {
            a(false);
            return;
        }
        wci wci;
        if (i == 0) {
            a(true);
            wci = this.c;
            if (wci != null) {
                wci.a(this.e);
            }
        } else if (i == 1) {
            a(true);
            wci = this.c;
            if (wci != null) {
                wci.a();
            }
        } else if (i == 2 || i == 3) {
            wci = this.c;
            if (wci != null) {
                wci.a(false);
                wci.a.a(0);
                wcm wcm = wci.a;
                wcm.l = true;
                wcm.n_(false);
            }
            this.d = false;
            this.e = 0;
            a(false);
        }
    }

    public final void a(int i) {
        wci wci = this.c;
        if (wci != null) {
            wci.a(i);
        }
        this.e = i;
    }

    private final void a(boolean z) {
        wci wci = this.c;
        if (wci != null) {
            wci.a.l = z ^ 1;
        }
    }

    public final void a(ahry ahry, ahrt ahrt) {
        a(new wci(this.h, new Handler(Looper.getMainLooper()), ahrt.d(), ahry, ahrt));
        ahrt.a(this.c);
    }

    public final void bz_() {
        a(null);
    }

    public final void a(vxc vxc) {
        boolean b = vxc.b();
        wci wci = this.c;
        if (wci != null) {
            wci.a(b);
        }
        this.d = b;
        int c = vxc.i().c();
        if (this.f != c) {
            wci = this.c;
            if (wci != null) {
                wci.b(c);
            }
            this.f = c;
        }
        this.b.b(vxc.g(), vxc.b());
    }
}
