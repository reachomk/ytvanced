package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: apr */
public class apr extends MarginLayoutParams {
    public aqj c;
    public final Rect d = new Rect();
    public boolean e = true;
    public boolean f = false;

    public apr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public apr(int i, int i2) {
        super(i, i2);
    }

    public apr(MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public apr(LayoutParams layoutParams) {
        super(layoutParams);
    }

    public apr(apr apr) {
        super(apr);
    }

    public final boolean l_() {
        return this.c.m();
    }

    public final boolean m_() {
        return this.c.t();
    }

    public final int c() {
        return this.c.c();
    }
}
