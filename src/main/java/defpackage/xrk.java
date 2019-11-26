package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: xrk */
public final class xrk {
    public final OnLayoutChangeListener a = new xrj(this);
    public View b;
    public View c;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    private final int[] h = new int[2];

    public final xrk a() {
        View view = this.c;
        if (view != null) {
            TouchDelegate touchDelegate = view.getTouchDelegate();
            if (touchDelegate instanceof xrl) {
                ((xrl) touchDelegate).a(this.b);
            }
            this.c.removeOnLayoutChangeListener(this.a);
            this.b = null;
            this.c = null;
        }
        return this;
    }

    public final void b() {
        View view = this.c;
        if (view != null && this.b != null && abe.D(view)) {
            c();
        }
    }

    public final void c() {
        if (this.c != null) {
            View view = this.b;
            if (view != null) {
                view.getLocationOnScreen(this.h);
                int g = abe.g(this.c);
                int[] iArr = this.h;
                int i = iArr[0];
                int i2 = i - (g != 1 ? this.d : this.f);
                int i3 = iArr[1] - this.e;
                i += this.b.getWidth();
                if (g != 1) {
                    g = this.f;
                } else {
                    g = this.d;
                }
                int i4 = this.h[1];
                int height = this.b.getHeight();
                int i5 = this.g;
                this.c.getLocationOnScreen(this.h);
                int[] iArr2 = this.h;
                int i6 = iArr2[0];
                int i7 = iArr2[1];
                xrl.a(this.c, this.b, new xrm(new Rect(i2 - i6, i3 - i7, (i + g) - i6, ((i4 + height) + i5) - i7), this.b, this.c));
            }
        }
    }
}
