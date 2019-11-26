package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;
import java.util.HashSet;
import java.util.Set;

/* renamed from: fga */
public final class fga implements adqi, AccessibilityStateChangeListener, exv, exw, xcp {
    public final Context a;
    public final exu b;
    public final fnw c;
    public final Set d = new HashSet();
    public boolean e;
    private final xci f;
    private final ffw g;
    private final adqf h;
    private final Set i = new HashSet();
    private boolean j;
    private Boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;

    public fga(Context context, adqf adqf, fnw fnw, exu exu, xci xci, ffw ffw) {
        this.a = context;
        this.b = exu;
        this.f = xci;
        this.g = ffw;
        this.h = adqf;
        this.c = fnw;
    }

    public final void b(adqe adqe) {
    }

    public final void a(boolean z) {
        if (z != this.j) {
            this.j = z;
            d();
        }
    }

    public final void a() {
        boolean z = true;
        this.l = true;
        this.h.a((adqi) this);
        if (this.h.c() == null) {
            z = false;
        }
        this.m = z;
        d();
        a(this.a.getResources().getConfiguration());
        this.f.a((Object) this);
    }

    public final void b() {
        this.l = false;
        this.h.b((adqi) this);
        d();
        this.f.b(this);
    }

    public final void a(Configuration configuration) {
        boolean z = true;
        if (configuration.orientation != 1) {
            z = false;
        }
        if (this.e != z) {
            this.e = z;
            d();
        }
    }

    public final boolean c() {
        Boolean bool = this.k;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        if (this.l && !this.m && !this.n && this.i.isEmpty() && (!this.j || (this.e && this.g.a()))) {
            z = true;
        }
        this.k = Boolean.valueOf(z);
        return this.k.booleanValue();
    }

    public final void a(adqe adqe) {
        b(true);
    }

    public final void c(adqe adqe) {
        b(false);
    }

    public final void onAccessibilityStateChanged(boolean z) {
        if (this.n != z) {
            this.n = z;
            d();
        }
    }

    public final void a(int i) {
        this.i.add(Integer.valueOf(i));
        d();
    }

    public final void b(int i) {
        this.i.remove(Integer.valueOf(i));
        d();
    }

    private final void d() {
        xak.a();
        this.k = null;
        boolean c = c();
        if (this.o != c) {
            this.o = c;
            for (fgd a : this.d) {
                a.a(c);
            }
        }
    }

    private final void b(boolean z) {
        if (this.m != z) {
            this.m = z;
            d();
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ffz.class};
        } else if (i == 0) {
            d();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
