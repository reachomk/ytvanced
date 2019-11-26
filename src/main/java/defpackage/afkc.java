package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;

/* renamed from: afkc */
public class afkc extends afjz implements Callback {
    public final SurfaceView a;
    public volatile boolean b;
    private final View c;
    private int h;

    public afkc(Context context) {
        super(context);
        this.a = new SurfaceView(context);
        this.a.getHolder().addCallback(this);
        this.c = new View(context);
        this.c.setBackgroundColor(-16777216);
        addView(this.a);
        addView(this.c);
    }

    public final void a(int i, int i2) {
        if (afkh.g) {
            this.a.getHolder().setFixedSize(i, i2);
        }
        super.a(i, i2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void s() {
        this.c.setVisibility(8);
    }

    /* Access modifiers changed, original: protected|final */
    public final void t() {
        this.c.setVisibility(0);
    }

    public final Surface k() {
        return this.a.getHolder().getSurface();
    }

    public final SurfaceHolder l() {
        return this.a.getHolder();
    }

    public final boolean n() {
        return this.b;
    }

    public final void d() {
        this.b = false;
        post(new afkf(this));
    }

    public final void m() {
        Surface surface = this.a.getHolder().getSurface();
        if (surface != null) {
            surface.release();
        }
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        afkj afkj = this.f;
        if (afkj != null) {
            afkj.b();
        }
        this.h = i;
    }

    public final void i() {
        if (this.h == 842094169) {
            d();
            this.h = 0;
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.b = true;
        afkj afkj = this.f;
        if (afkj != null) {
            afkj.a();
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.b = false;
        afkj afkj = this.f;
        if (afkj != null) {
            afkj.c();
        }
        c();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        a(i, i2, i3, i4);
        i3 -= i;
        i4 -= i2;
        a(this.a, i3, i4);
        if (this.c.getVisibility() != 8) {
            a(this.c, i3, i4);
        }
    }

    public afkn o() {
        return afkn.SURFACE;
    }

    public final void setVisibility(int i) {
        if (VERSION.SDK_INT > 19) {
            this.a.setVisibility(i);
            this.c.setVisibility(i);
        }
        super.setVisibility(i);
    }
}
