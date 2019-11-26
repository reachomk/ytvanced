package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: abr */
public final class abr {
    public final WeakReference a;

    abr(View view) {
        this.a = new WeakReference(view);
    }

    public final abr a(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public final abr a(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public final abr b(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationX(f);
        }
        return this;
    }

    public final abr c(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public final abr a(Runnable runnable) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().withEndAction(runnable);
        }
        return this;
    }

    public final abr a(Interpolator interpolator) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public final abr b(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public final void a() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void b() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public final abr c() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().withLayer();
        }
        return this;
    }

    public final abr a(abs abs) {
        View view = (View) this.a.get();
        if (view != null) {
            if (abs != null) {
                view.animate().setListener(new abq(abs, view));
            } else {
                view.animate().setListener(null);
            }
        }
        return this;
    }

    public final abr a(abu abu) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setUpdateListener(abu != null ? new abt(abu) : null);
        }
        return this;
    }
}
