package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: alk */
final class alk extends alh {
    public final SeekBar b;
    public Drawable c;
    private ColorStateList d = null;
    private Mode e = null;
    private boolean f = false;
    private boolean g = false;

    alk(SeekBar seekBar) {
        super(seekBar);
        this.b = seekBar;
    }

    /* Access modifiers changed, original: final */
    public final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        arz a = arz.a(this.b.getContext(), attributeSet, afy.N, i, 0);
        Drawable b = a.b(afy.O);
        if (b != null) {
            this.b.setThumb(b);
        }
        b = a.a(afy.P);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.c = b;
        if (b != null) {
            b.setCallback(this.b);
            st.b(b, abe.g(this.b));
            if (b.isStateful()) {
                b.setState(this.b.getDrawableState());
            }
            a();
        }
        this.b.invalidate();
        if (a.h(afy.R)) {
            this.e = amu.a(a.a(afy.R, -1), this.e);
            this.g = true;
        }
        if (a.h(afy.Q)) {
            this.d = a.f(afy.Q);
            this.f = true;
        }
        a.a();
        a();
    }

    private final void a() {
        Drawable drawable = this.c;
        if (drawable == null) {
            return;
        }
        if (this.f || this.g) {
            this.c = st.d(drawable.mutate());
            if (this.f) {
                st.a(this.c, this.d);
            }
            if (this.g) {
                st.a(this.c, this.e);
            }
            if (this.c.isStateful()) {
                this.c.setState(this.b.getDrawableState());
            }
        }
    }
}
