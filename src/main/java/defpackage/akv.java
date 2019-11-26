package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: akv */
public final class akv {
    private final View a;
    private final aky b;
    private int c = -1;
    private ary d;
    private ary e;
    private ary f;

    public akv(View view) {
        this.a = view;
        this.b = aky.b();
    }

    public final void a(AttributeSet attributeSet, int i) {
        arz a = arz.a(this.a.getContext(), attributeSet, afy.dq, i, 0);
        try {
            if (a.h(0)) {
                this.c = a.f(0, -1);
                ColorStateList c = this.b.c(this.a.getContext(), this.c);
                if (c != null) {
                    b(c);
                }
            }
            if (a.h(1)) {
                abe.a(this.a, a.f(1));
            }
            if (a.h(2)) {
                abe.a(this.a, amu.a(a.a(2, -1), null));
            }
            a.a();
        } catch (Throwable th) {
            a.a();
        }
    }

    public final void a(int i) {
        this.c = i;
        aky aky = this.b;
        b(aky != null ? aky.c(this.a.getContext(), i) : null);
        d();
    }

    public final void a() {
        this.c = -1;
        b(null);
        d();
    }

    public final void a(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new ary();
        }
        ary ary = this.e;
        ary.a = colorStateList;
        ary.d = true;
        d();
    }

    public final ColorStateList b() {
        ary ary = this.e;
        return ary != null ? ary.a : null;
    }

    public final void a(Mode mode) {
        if (this.e == null) {
            this.e = new ary();
        }
        ary ary = this.e;
        ary.b = mode;
        ary.c = true;
        d();
    }

    public final Mode c() {
        ary ary = this.e;
        return ary != null ? ary.b : null;
    }

    public final void d() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            ary ary;
            int i = VERSION.SDK_INT;
            if (i <= 21 ? i != 21 : this.d == null) {
                if (this.f == null) {
                    this.f = new ary();
                }
                ary = this.f;
                ary.a();
                ColorStateList y = abe.y(this.a);
                if (y != null) {
                    ary.d = true;
                    ary.a = y;
                }
                Mode z = abe.z(this.a);
                if (z != null) {
                    ary.c = true;
                    ary.b = z;
                }
                if (ary.d || ary.c) {
                    aky.a(background, ary, this.a.getDrawableState());
                    return;
                }
            }
            ary = this.e;
            if (ary != null) {
                aky.a(background, ary, this.a.getDrawableState());
            } else {
                ary = this.d;
                if (ary != null) {
                    aky.a(background, ary, this.a.getDrawableState());
                }
            }
        }
    }

    private final void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new ary();
            }
            ary ary = this.d;
            ary.a = colorStateList;
            ary.d = true;
        } else {
            this.d = null;
        }
        d();
    }
}
