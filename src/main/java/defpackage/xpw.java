package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.ref.WeakReference;

/* renamed from: xpw */
public final class xpw {
    public View a;
    public xpy b;
    public xqb c;
    public xpu d = new xpu();
    private final OnPreDrawListener e = new xpz(this);
    private WeakReference f;
    private xpu g = new xpu();
    private boolean h = false;

    public xpw(View view) {
        this.a = (View) amqw.a((Object) view);
    }

    public final void a(View view) {
        a(view, true);
    }

    public final void a(View view, boolean z) {
        if (view == b()) {
            c();
            return;
        }
        this.f = new WeakReference(view);
        xpy xpy = this.b;
        if (xpy != null) {
            xpy.a(view);
        }
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        if (!(view == null || this.h)) {
            viewTreeObserver.addOnPreDrawListener(this.e);
            this.h = true;
        }
        if (view == null && this.h) {
            viewTreeObserver.removeOnPreDrawListener(this.e);
            this.h = false;
        }
        if (view != null) {
            if (z) {
                c();
            }
        } else if (this.d.b()) {
            this.d.a();
            xqb xqb = this.c;
            if (xqb != null) {
                xqb.a(this.d);
            }
        }
    }

    public final void a() {
        a(null);
    }

    public final View b() {
        WeakReference weakReference = this.f;
        return weakReference != null ? (View) weakReference.get() : null;
    }

    public final void c() {
        View b = b();
        if (b != null) {
            xpu xpu = this.g;
            this.g = this.d;
            xpu.a(xpu, b, this.a);
            this.d = xpu;
            if (this.c != null) {
                xpu xpu2 = this.d;
                xpu = this.g;
                boolean b2 = xpu2.b();
                boolean b3 = xpu.b();
                if ((b2 || b3) && !xpu2.equals(xpu)) {
                    this.c.a(this.d);
                }
            }
        }
    }
}
