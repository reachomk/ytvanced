package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: xnu */
public class xnu implements xol {
    public final Rect a;
    public final Set b;
    public final Window c;
    public final xok d;
    public int e;
    public boolean f;
    public xnw g;
    public xnx h;
    private final bdfp i;
    private final aba j;
    private final xon k;
    private xnx l;
    private View m;

    public xnu(Activity activity) {
        this(activity.getWindow());
    }

    xnu(Window window) {
        this.j = new xnt(this);
        this.a = new Rect();
        this.k = new xnv(this);
        this.l = xnx.DEFAULT;
        this.c = (Window) amqw.a((Object) window);
        this.i = bdfi.h();
        this.d = new xok(window, this.k);
        this.b = Collections.newSetFromMap(new WeakHashMap());
        a(this.l);
    }

    public final bctz a() {
        return this.i;
    }

    public final void a(View view, int i) {
        View view2 = this.m;
        if (view2 != view) {
            xnx xnx;
            if (view2 != null) {
                abe.a(view2, null);
            }
            this.m = (View) amqw.a((Object) view);
            this.e = i;
            xok xok = this.d;
            Object obj = this.m;
            boolean z = (i & 4) == 4;
            View view3 = xok.a;
            if (view3 != obj) {
                if (view3 != null) {
                    view3.setOnSystemUiVisibilityChangeListener(null);
                }
                xok.a = (View) amqw.a(obj);
                xok.d = z;
                xok.a.setOnSystemUiVisibilityChangeListener(xok);
                xok.b = xok.a.getSystemUiVisibility();
            }
            abe.a(this.m, this.j);
            if ((i & 2) == 2) {
                xnx = xnx.LAYOUT_FULLSCREEN;
            } else {
                xnx = xnx.DEFAULT;
            }
            this.l = xnx;
            a(this.l);
        }
    }

    public final void a(xpe xpe) {
        amqw.a((Object) xpe);
        this.b.add(xpe);
    }

    public final void b() {
        a(this.l);
    }

    public final void a(Rect rect) {
        if (VERSION.SDK_INT < 21 && rect != null) {
            this.a.set(rect);
            d();
        }
    }

    public final xof c() {
        if (VERSION.SDK_INT < 28) {
            return xof.a();
        }
        View view = this.m;
        xof a = (view == null || view.getRootWindowInsets() == null || this.m.getRootWindowInsets().getDisplayCutout() == null) ? xof.a() : new xof(new Rect(this.m.getRootWindowInsets().getDisplayCutout().getSafeInsetLeft(), this.m.getRootWindowInsets().getDisplayCutout().getSafeInsetTop(), this.m.getRootWindowInsets().getDisplayCutout().getSafeInsetRight(), this.m.getRootWindowInsets().getDisplayCutout().getSafeInsetBottom()), this.m.getRootWindowInsets().getDisplayCutout().getBoundingRects());
        return a;
    }

    public final void d() {
        Rect rect = new Rect(this.a);
        xnw xnw = this.g;
        if (xnw != null) {
            Rect a = xnw.a(new Rect(this.a));
            if (a != null) {
                rect.set(a);
            }
        }
        this.i.e_(new xqg(new xpb(rect, c())));
    }

    public final void b(boolean z) {
        this.f = z;
        h();
    }

    public final void a(boolean z) {
        if (z) {
            a(this.h);
        }
    }

    public final void a(int i) {
        if (this.h != xnx.IMMERSIVE && this.h != xnx.VR) {
            this.d.a(i);
        }
    }

    public final void e() {
        xok xok = this.d;
        xok.removeMessages(0);
        xok.h = true;
    }

    public final boolean f() {
        xnx xnx = this.h;
        return xnx.f == 2 && !xnx.g;
    }

    public final boolean g() {
        return this.h.f == 2;
    }

    private final void a(xnx xnx) {
        this.h = xnx;
        xok xok = this.d;
        int i = xnx.f;
        if (xok.c != i) {
            xok.c = i;
            xok.a();
        }
        xok = this.d;
        boolean z = xnx.g;
        if (xok.e != z) {
            xok.e = z;
            xok.a();
        }
        this.d.a(xnx.h);
        h();
    }

    private final void h() {
        xok xok = this.d;
        boolean z = false;
        if (f() && this.f) {
            z = true;
        }
        if (xok.g != z) {
            xok.g = z;
            xok.a();
        }
    }

    public final void b(int i) {
        xnx xnx;
        i--;
        if (i == 1) {
            xnx = xnx.IMMERSIVE;
        } else if (i != 2) {
            xnx = xnx.VR;
        } else {
            xnx = xnx.IMMERSIVE_FLEX;
        }
        a(xnx);
    }
}
