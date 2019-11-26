package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: any */
public class any extends aqc {
    public final DecelerateInterpolator a = new DecelerateInterpolator();
    private final LinearInterpolator i = new LinearInterpolator();
    private PointF j;
    private final DisplayMetrics k;
    private boolean l = false;
    private float m;
    private int n = 0;
    private int o = 0;

    public any(Context context) {
        this.k = context.getResources().getDisplayMetrics();
    }

    private static int b(int i, int i2) {
        i2 = i - i2;
        return i * i2 > 0 ? i2 : 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
    }

    /* Access modifiers changed, original: protected */
    public void a(View view, aqh aqh, aqf aqf) {
        int b = b(view, c());
        int a = a(view, d());
        int a2 = a((int) Math.sqrt((double) ((b * b) + (a * a))));
        if (a2 > 0) {
            aqf.a(-b, -a, a2, this.a);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, int i2, aqf aqf) {
        if (this.c.n.w() != 0) {
            this.n = any.b(this.n, i);
            i = any.b(this.o, i2);
            this.o = i;
            if (this.n == 0 && i == 0) {
                PointF c = c(this.b);
                if (c == null || (c.x == 0.0f && c.y == 0.0f)) {
                    aqf.d = this.b;
                    e();
                } else {
                    float sqrt = (float) Math.sqrt((double) ((c.x * c.x) + (c.y * c.y)));
                    c.x /= sqrt;
                    c.y /= sqrt;
                    this.j = c;
                    this.n = (int) (c.x * 10000.0f);
                    this.o = (int) (c.y * 10000.0f);
                    aqf.a((int) (((float) this.n) * 1.2f), (int) (((float) this.o) * 1.2f), (int) (((float) b(10000)) * 1.2f), this.i);
                    return;
                }
            }
            return;
        }
        e();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        this.o = 0;
        this.n = 0;
        this.j = null;
    }

    /* Access modifiers changed, original: protected */
    public float a(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* Access modifiers changed, original: protected */
    public int a(int i) {
        double b = (double) b(i);
        Double.isNaN(b);
        return (int) Math.ceil(b / 0.3356d);
    }

    /* Access modifiers changed, original: protected */
    public int b(int i) {
        float abs = (float) Math.abs(i);
        if (!this.l) {
            this.m = a(this.k);
            this.l = true;
        }
        return (int) Math.ceil((double) (abs * this.m));
    }

    /* Access modifiers changed, original: protected */
    public int c() {
        PointF pointF = this.j;
        int i = 0;
        if (!(pointF == null || pointF.x == 0.0f)) {
            if (this.j.x > 0.0f) {
                return 1;
            }
            i = -1;
        }
        return i;
    }

    /* Access modifiers changed, original: protected */
    public int d() {
        PointF pointF = this.j;
        int i = 0;
        if (!(pointF == null || pointF.y == 0.0f)) {
            if (this.j.y > 0.0f) {
                return 1;
            }
            i = -1;
        }
        return i;
    }

    public int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            i3 -= i;
            if (i3 > 0) {
                return i3;
            }
            i4 -= i2;
            return i4 >= 0 ? 0 : i4;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public int a(View view, int i) {
        apn apn = this.d;
        if (apn == null || !apn.l()) {
            return 0;
        }
        apr apr = (apr) view.getLayoutParams();
        return a(apn.i(view) - apr.topMargin, apn.k(view) + apr.bottomMargin, apn.y(), apn.v - apn.A(), i);
    }

    public int b(View view, int i) {
        apn apn = this.d;
        if (apn == null || !apn.k()) {
            return 0;
        }
        apr apr = (apr) view.getLayoutParams();
        return a(apn.h(view) - apr.leftMargin, apn.j(view) + apr.rightMargin, apn.x(), apn.u - apn.z(), i);
    }
}
