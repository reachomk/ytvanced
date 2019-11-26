package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

/* renamed from: ahoq */
public final class ahoq extends afju {
    public boolean h;
    private final ahnq i;
    private final View j;
    private boolean k;

    public ahoq(Context context, ahnq ahnq, boolean z) {
        ahni ahnl;
        int i;
        super(context);
        this.i = (ahnq) amqw.a((Object) ahnq);
        this.k = z;
        ahot ahot = new ahot(this);
        if ("com.google.android.apps.youtube.mango".equals(ahnq.a.getPackageName())) {
            ahnl = new ahnl(context);
        } else {
            ahnl = new ahno(context);
        }
        ahnq.i = ahnl;
        ahnq.i.a(false);
        ahnq.i.b(ahnq.o);
        ahnq.g.a(z);
        int i2 = 8;
        if (z && ahnq.g.b() == 1) {
            i2 = 10;
            i = 2;
        } else {
            i = 8;
        }
        ahnq.i.a(i2, i2, i2, i);
        ahnq.i.a(ahnq.g);
        ahmz ahmz = ahnq.j;
        if (ahmz != null) {
            ahmz.onRendererShutdown();
        }
        ahnq.j = (ahmz) ahnq.e.get();
        ahmz = ahnq.j;
        Object ahof = new ahof(ahnq);
        if (!ahmz.k) {
            ahmz.e = (ahnb) amqw.a((Object) ahnq);
            ahmz.d = (ahsp) amqw.a((Object) ahnq);
            ahmz.c = (bcaa) amqw.a(ahof);
        }
        ahnq.q = ahot;
        ahnq.i.a(ahnq.j);
        if (ahnq.s) {
            ahnq.h();
        }
        ViewGroup e = ahnq.i.e();
        this.j = e;
        addView(e);
        if (VERSION.SDK_INT >= 19) {
            setSystemUiVisibility(4096);
        }
    }

    public final void d() {
    }

    public final SurfaceHolder l() {
        return null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void s() {
        ahry ahry = this.i.k;
        if (ahry != null) {
            ahry.b.e = true;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void t() {
        if (this.b == null && this.c == null) {
            ahry ahry = this.i.k;
            if (ahry != null) {
                ahry.b.e = false;
            }
        }
    }

    public final void a(boolean z) {
        ahnq ahnq = this.i;
        ahry ahry = ahnq.k;
        if (ahry != null) {
            ahry.c(z);
        }
        ahnq.x = z;
    }

    public final void a(afkm afkm) {
        ahnq ahnq = this.i;
        ahqp ahqp = ahnq.l;
        if (ahqp != null) {
            ahqp.a(afkm);
        }
        ahnq.p = afkm;
    }

    public final void a(boolean z, byte[] bArr, long j) {
        ahqp ahqp = this.i.l;
        if (ahqp != null) {
            ahqp.k.a(z, bArr, j);
        }
    }

    public final Surface k() {
        return this.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        measureChild(this.j, MeasureSpec.makeMeasureSpec(this.d, 1073741824), MeasureSpec.makeMeasureSpec(this.e, 1073741824));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        a(i, i2, i3, i4);
        if (this.i.c()) {
            a(this.j, i3 - i, i4 - i2);
        } else {
            this.j.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public final void m() {
        ahnq ahnq = this.i;
        ahni ahni = ahnq.i;
        if (ahni != null) {
            ahni.a(false);
        }
        ahrt ahrt = ahnq.m;
        ahry ahry = ahnq.k;
        if (ahry != null) {
            ahry.b.b();
            ahnq.k = null;
            ahnq.m = null;
            ahnq.n = null;
        }
        ahqh ahqh = ahnq.h;
        if (ahqh != null) {
            ahqh.a();
            ahnq.h = null;
        }
        ahmz ahmz = ahnq.j;
        if (ahmz != null) {
            ahmz.a();
            ahnq.j = null;
        }
        ahni ahni2 = ahnq.i;
        if (ahni2 != null) {
            ahni2.c();
            ahnq.i.d();
            ahnq.i = null;
        }
        if (ahnq.t) {
            ahnq.b.b(false);
        }
        if (ahrt != null) {
            for (ahoj bz_ : ahnq.f) {
                bz_.bz_();
            }
        }
    }

    public final afkn o() {
        return afkn.GL_GVR;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean q() {
        return this.i.c();
    }

    public final void a(int i, int i2) {
        float f = ((float) i) / ((float) i2);
        double d;
        if (this.i.w == aaju.RECTANGULAR_3D && ahsl.a(f, 3.5555556f, 0.01f)) {
            d = (double) i;
            Double.isNaN(d);
            i2 = (int) Math.floor((d * 9.0d) / 16.0d);
        } else if (this.i.w == aaju.RECTANGULAR_3D && ahsl.a(f, 0.8888889f, 0.01f)) {
            d = (double) i2;
            Double.isNaN(d);
            i = (int) Math.floor((d * 16.0d) / 9.0d);
        }
        super.a(i, i2);
        ahnq ahnq = this.i;
        ahnq.u = i;
        ahnq.v = i2;
        ahnq.a(new ahoe(ahnq, ((float) i) / ((float) i2)));
        ahnq.a(ahnq.i());
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean r() {
        return this.h;
    }

    public final void a(boolean z, float f, float f2) {
        super.a(z, f, f2);
        if (VERSION.SDK_INT >= 26 && this.k != z) {
            this.k = z;
            ahnq ahnq = this.i;
            ahnq.g.a(z);
            ahqp ahqp = ahnq.l;
            if (ahqp != null) {
                ahqp.a(ahnq.g.b(), ahnq.g.a(), ahnq.g.a);
            }
            ahnq.f();
            ahnq.g();
        }
    }
}
