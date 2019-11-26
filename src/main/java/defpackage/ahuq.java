package defpackage;

import android.content.Context;
import android.opengl.Matrix;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;

/* renamed from: ahuq */
public final class ahuq extends ahqm implements ahpv, ahsc, ahsd {
    public final Handler i;
    public final ViewGroup j;
    public ahva k;
    public boolean o;
    private final float p;
    private final ahry q;
    private final ahrt r;
    private ahqn s;

    public ahuq(ViewGroup viewGroup, Context context, Handler handler, ahpn ahpn, float f, float f2, ahry ahry, ahrt ahrt) {
        ViewGroup viewGroup2 = viewGroup;
        Handler handler2 = handler;
        float f3 = f;
        float f4 = f2;
        ahry ahry2 = ahry;
        super(f3 * context.getResources().getDisplayMetrics().scaledDensity, f4 * context.getResources().getDisplayMetrics().scaledDensity, ahsm.a(1.0f, 1.0f, ahqm.m), ahpn, ahry2.a.e());
        this.i = handler2;
        this.j = viewGroup2;
        this.q = ahry2;
        this.r = ahrt;
        a(f3, f4, 1.0f);
        float f5 = context.getResources().getDisplayMetrics().scaledDensity;
        this.p = f5;
        Context context2 = context;
        handler2.post(new ahut(this, context, new LayoutParams(ahqm.b(f5 * f3), ahqm.b(this.p * f4)), viewGroup));
        this.s = ahry2.i;
        j();
        ahry2.a((ahsd) this);
        ahry2.a((ahsc) this);
        i();
    }

    public final boolean a(ahnj ahnj) {
        return false;
    }

    public final boolean b(ahnj ahnj) {
        return true;
    }

    public final boolean c(ahnj ahnj) {
        return false;
    }

    public final void e(ahnj ahnj) {
    }

    public final void h() {
        boolean z = true;
        if (this.r.g && this.o) {
            z = false;
        }
        this.l = z;
    }

    public final void i() {
        this.i.post(new ahuu(this));
        this.o = false;
        h();
    }

    private final void j() {
        this.a.a(this.s != ahqn.FULL_SPHERICAL);
        if (this.s == ahqn.FULL_SPHERICAL) {
            c(true);
        } else {
            d(true);
        }
    }

    private final void c(boolean z) {
        float a = ahsl.a(-100.0f);
        if (z) {
            b(56.0f, 31.5f);
            b(0.0f, a, 0.0f);
            return;
        }
        b(0.0f, -a, 0.0f);
    }

    private final void d(boolean z) {
        if (z) {
            ahry ahry = this.q;
            b(ahry.j, ahry.k);
            this.a.a(0.0f);
        }
    }

    private final void b(float f, float f2) {
        a(f, f2, 1.0f);
        float f3 = this.p;
        a_(f * f3, f3 * f2);
        this.i.post(new ahuy(this, new LayoutParams(ahqm.b(f * this.p), ahqm.b(f2 * this.p))));
    }

    public final void bd_() {
        super.bd_();
        this.i.post(new ahvb(this));
        this.q.b((ahsd) this);
        this.q.b((ahsc) this);
    }

    public final void d(ahnj ahnj) {
        super.d(ahnj);
        if (this.s == ahqn.FULL_SPHERICAL) {
            float[] fArr = ahnj.a;
            float f = fArr[2];
            float length = Matrix.length(fArr[0], fArr[1], f);
            float f2 = fArr[10];
            float toDegrees = (float) Math.toDegrees(Math.atan2((double) (f / length), (double) (f2 / Matrix.length(fArr[8], fArr[9], f2))));
            if (Float.isNaN(toDegrees)) {
                toDegrees = 0.0f;
            }
            this.a.a(toDegrees);
        }
    }

    public final void a(float f, float f2) {
        if (this.s != ahqn.FULL_SPHERICAL) {
            b(f, f2);
        }
    }

    public final void a(ahqn ahqn) {
        ahqn ahqn2 = this.s;
        if (ahqn2 != ahqn) {
            if (ahqn2 == ahqn.FULL_SPHERICAL) {
                c(false);
            } else {
                d(false);
            }
            this.s = ahqn;
            j();
        }
    }
}
