package defpackage;

import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

/* renamed from: aqc */
public abstract class aqc {
    private final aqf a = new aqf();
    public int b = -1;
    public RecyclerView c;
    public apn d;
    public boolean e;
    public boolean f;
    public View g;
    public boolean h;

    public abstract void a();

    public abstract void a(int i, int i2, aqf aqf);

    public abstract void a(View view, aqh aqh, aqf aqf);

    public abstract void b();

    public PointF c(int i) {
        apn apn = this.d;
        if (apn instanceof aqe) {
            return ((aqe) apn).d(i);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
        stringBuilder.append(aqe.class.getCanonicalName());
        Log.w("RecyclerView", stringBuilder.toString());
        return null;
    }

    public final void e() {
        if (this.f) {
            this.f = false;
            b();
            this.c.L.a = -1;
            this.g = null;
            this.b = -1;
            this.e = false;
            apn apn = this.d;
            if (apn.m == this) {
                apn.m = null;
            }
            this.d = null;
            this.c = null;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.c;
        if (this.b == -1 || recyclerView == null) {
            e();
        }
        if (this.e && this.g == null && this.d != null) {
            PointF c = c(this.b);
            if (!(c == null || (c.x == 0.0f && c.y == 0.0f))) {
                recyclerView.a((int) Math.signum(c.x), (int) Math.signum(c.y), null);
            }
        }
        this.e = false;
        View view = this.g;
        if (view != null) {
            if (a(view) == this.b) {
                a(this.g, recyclerView.L, this.a);
                this.a.a(recyclerView);
                e();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.g = null;
            }
        }
        if (this.f) {
            aqh aqh = recyclerView.L;
            a(i, i2, this.a);
            aqf aqf = this.a;
            i2 = aqf.d;
            aqf.a(recyclerView);
            if (i2 >= 0 && this.f) {
                this.e = true;
                recyclerView.I.a();
            }
        }
    }

    public int a(View view) {
        return RecyclerView.f(view);
    }

    public View d(int i) {
        return this.c.n.c(i);
    }

    /* Access modifiers changed, original: protected */
    public void b(View view) {
        if (a(view) == this.b) {
            this.g = view;
        }
    }
}
