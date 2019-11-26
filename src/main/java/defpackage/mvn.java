package defpackage;

import android.content.Context;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.MeasureSpec;

/* renamed from: mvn */
public final class mvn extends msi implements nex {
    public final View a;
    private final msl b;
    private SurfaceView c;
    private final Runnable d = new mvm(this);

    public mvn(Context context, msl msl) {
        super(context);
        this.b = (msl) amqw.a((Object) msl);
        this.a = new View(context);
        this.a.setBackgroundColor(-16777216);
        addView(this.a);
    }

    public final View b() {
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        i2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        SurfaceView surfaceView = this.c;
        if (surfaceView != null) {
            surfaceView.measure(i, i2);
        }
        if (this.a.getVisibility() != 8) {
            this.a.measure(i, i2);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SurfaceView surfaceView = this.c;
        if (surfaceView != null) {
            surfaceView.layout(0, 0, surfaceView.getMeasuredWidth(), this.c.getMeasuredHeight());
        }
        if (this.a.getVisibility() != 8) {
            View view = this.a;
            view.layout(0, 0, view.getMeasuredWidth(), this.a.getMeasuredHeight());
        }
    }

    public final void a(SurfaceView surfaceView) {
        this.c = surfaceView;
        addView(surfaceView, 0);
    }

    public final void f() {
        SurfaceView surfaceView = this.c;
        if (surfaceView != null) {
            removeView(surfaceView);
        }
        this.c = null;
    }

    public final void g() {
        this.b.a();
    }

    public final void h() {
        this.b.b();
    }

    public final void c() {
        SurfaceView surfaceView = this.c;
        if (surfaceView != null) {
            removeView(surfaceView);
            addView(this.c, 0);
        }
    }

    public final void d() {
        postDelayed(this.d, 0);
    }

    public final void e() {
        removeCallbacks(this.d);
        this.a.setVisibility(0);
    }
}
