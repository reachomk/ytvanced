package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;

/* renamed from: jvm */
public class jvm extends ans implements env {
    private static final float a = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    private final double b;
    private final Context w;
    private final any x = ((any) amqw.a(F()));

    public jvm(Context context) {
        this.w = context;
        double d = (double) ((context.getResources().getDisplayMetrics().density * 386.0878f) * 160.0f);
        Double.isNaN(d);
        this.b = d * 0.84d;
    }

    /* Access modifiers changed, original: protected */
    public any F() {
        return new jvp(this.w, this);
    }

    public final int a(int i, int i2) {
        if (w() == 0) {
            return 0;
        }
        int left;
        int width;
        int i3;
        View i4 = i(0);
        if (this.c != 1) {
            left = i4.getLeft();
            width = i4.getWidth();
            i3 = left;
            left = i;
        } else {
            left = i4.getTop();
            width = i4.getHeight();
            i3 = left;
            left = i2;
        }
        int c = apn.c(i4);
        double abs = Math.abs((double) Math.abs(left));
        float scrollFriction = ViewConfiguration.getScrollFriction();
        double d = this.b;
        abs *= 0.3499999940395355d;
        double d2 = (double) scrollFriction;
        Double.isNaN(d2);
        abs = Math.log(abs / (d2 * d));
        scrollFriction = a;
        d = (double) ViewConfiguration.getScrollFriction();
        d2 = this.b;
        Double.isNaN(d);
        d *= d2;
        d2 = (double) a;
        double d3 = (double) scrollFriction;
        Double.isNaN(d3);
        d3 -= 4.0d;
        Double.isNaN(d2);
        d *= Math.exp((d2 / d3) * abs);
        abs = (double) i3;
        if (left > 0) {
            d = -d;
        }
        Double.isNaN(abs);
        abs += d;
        if (this.c == 0 && m()) {
            if (abs >= ((double) (width / 2))) {
                return c + 1;
            }
        } else if (abs <= ((double) ((-width) / 2))) {
            c++;
        }
        return c;
    }

    public final void a(RecyclerView recyclerView, int i) {
        aqc aqc = this.x;
        aqc.b = i;
        a(aqc);
    }

    public final int a() {
        if (w() == 0) {
            return 0;
        }
        int left;
        int measuredWidth;
        View i = i(0);
        int c = apn.c(i);
        if (this.c != 1) {
            left = i.getLeft();
            measuredWidth = i.getMeasuredWidth();
        } else {
            left = i.getTop();
            measuredWidth = i.getMeasuredHeight();
        }
        return Math.abs(left) > measuredWidth / 2 ? c + 1 : c;
    }

    public final int q() {
        return p();
    }

    public final void e(View view) {
        int a;
        int makeMeasureSpec;
        apr apr = (apr) view.getLayoutParams();
        if (this.c == 1) {
            a = apn.a(this.u, ((x() + z()) + apr.leftMargin) + apr.rightMargin, apr.width, k());
            makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.v, 1073741824);
        } else {
            makeMeasureSpec = apn.a(this.v, ((y() + A()) + apr.topMargin) + apr.bottomMargin, apr.height, l());
            a = MeasureSpec.makeMeasureSpec(this.u, 1073741824);
        }
        view.measure(a, makeMeasureSpec);
    }
}
