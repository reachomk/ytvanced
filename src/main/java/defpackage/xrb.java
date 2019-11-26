package defpackage;

import android.view.VelocityTracker;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;

/* renamed from: xrb */
public final class xrb extends adt {
    private boolean a = false;
    private int b = 0;
    private final /* synthetic */ SwipeLayout c;

    public xrb(SwipeLayout swipeLayout) {
        this.c = swipeLayout;
    }

    public final boolean a(View view, int i) {
        return view == this.c.c;
    }

    public final int c(View view, int i) {
        boolean d;
        int i2 = 0;
        if (view.getLeft() == 0) {
            VelocityTracker velocityTracker = this.c.d;
            if (velocityTracker != null && Math.abs(velocityTracker.getXVelocity()) < ((float) this.c.b)) {
                return 0;
            }
        }
        boolean j = this.c.j();
        if (j) {
            d = this.c.d();
        } else {
            d = this.c.e();
        }
        if (j) {
            j = this.c.e();
        } else {
            j = this.c.d();
        }
        int width = this.c.c.getWidth();
        int i3 = !j ? 0 : width;
        if (d) {
            i2 = -width;
        }
        if (i <= i3) {
            return i >= i2 ? i : i2;
        } else {
            return i3;
        }
    }

    public final int a(View view) {
        return this.c.c.getWidth();
    }

    public final void b(View view, int i) {
        this.a = true;
        this.b = view.getLeft();
        this.c.k().a();
    }

    public final void a(View view, float f, float f2) {
        this.a = false;
        int left = this.c.c.getLeft();
        SwipeLayout swipeLayout = this.c;
        if (left >= swipeLayout.a && f >= 0.0f) {
            swipeLayout.b(f);
        } else if (swipeLayout.c.getLeft() >= 0 && f < 0.0f) {
            this.c.a(f);
        } else {
            left = this.c.c.getLeft();
            swipeLayout = this.c;
            if (left >= (-swipeLayout.a) || f > 0.0f) {
                swipeLayout.a(f);
            } else {
                swipeLayout.c(f);
            }
        }
    }

    public final void a(View view, int i, int i2, int i3) {
        if (this.a) {
            this.b += i3;
            int h = this.c.h();
            i = this.c.i();
            i2 = this.b;
            if (i2 <= 0) {
                i2 = Math.max(-i, i2);
            } else {
                i2 = Math.min(h, i2);
            }
            i3 = this.b;
            if (i3 > 0) {
                h = Math.max(0, i3 - h);
            } else {
                h = Math.min(0, i3 + i);
            }
            i2 += (int) (((float) h) * 0.3f);
            if (this.c.j()) {
                i2 = -i2;
            }
            this.c.a(i2);
            this.c.l();
        }
    }
}
