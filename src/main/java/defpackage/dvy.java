package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dvy */
public final class dvy implements lky, t, xcp {
    public final List a;
    public float b = 1.0f;
    public float c = 0.0f;
    public float d = 0.0f;
    private final xci e;
    private final bcaa f;
    private ValueAnimator g;
    private final Rect h;

    public dvy(xci xci, bcaa bcaa) {
        this.e = xci;
        this.f = bcaa;
        this.a = new ArrayList();
        this.h = new Rect();
    }

    public final void B_() {
    }

    public final void C_() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void aw_() {
        this.e.a((Object) this);
    }

    public final void a(af afVar) {
        this.e.b(this);
    }

    public final Rect a(Rect rect) {
        if (g() != ejd.WATCH_WHILE_FULLSCREEN) {
            return rect;
        }
        int width = rect.width();
        float f = this.b;
        int height = rect.height();
        int width2 = (int) (((float) rect.width()) * this.d);
        int height2 = (int) (((float) rect.height()) * this.c);
        this.h.set(new Rect(width2, height2, ((int) (((float) width) * f)) + width2, ((int) (((float) height) * this.b)) + height2));
        return this.h;
    }

    public final void a(lkx lkx) {
        f();
        this.a.add(lkx);
    }

    public final void b(lkx lkx) {
        this.a.remove(lkx);
        f();
    }

    private final void f() {
        this.h.setEmpty();
        this.b = 1.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }

    private final ejd g() {
        return ((eif) this.f.get()).c();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{vqh.class};
        } else if (i == 0) {
            vqh vqh = (vqh) obj;
            if (g() == ejd.WATCH_WHILE_FULLSCREEN && (((double) Math.abs(this.b - vqh.a)) >= 0.001d || ((double) Math.abs(this.c - vqh.b)) >= 0.001d || ((double) Math.abs(this.d - vqh.c)) >= 0.001d)) {
                this.g = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                this.g.setDuration((long) vqh.d);
                this.g.addUpdateListener(new dvx(this, vqh));
                this.g.start();
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
