package defpackage;

import android.graphics.Rect;

/* renamed from: cpd */
public final class cpd implements clm, Cloneable {
    public cqi a;
    public css b;
    public long c;
    public cma d;
    public final Rect e = new Rect();
    public int f;
    public int g;
    public int h;
    public long i = -1;
    public int j;
    public int k = 0;
    public int l = 0;
    public int m;
    public csd n;

    cpd() {
    }

    /* Access modifiers changed, original: final */
    public final void a(Rect rect) {
        rect.left = this.e.left - this.f;
        rect.top = this.e.top - this.g;
        rect.right = this.e.right - this.f;
        rect.bottom = this.e.bottom - this.g;
    }

    public final Rect a() {
        return this.e;
    }

    public final float b() {
        cqi cqi = this.a;
        if (cqi == null) {
            return 1.0f;
        }
        return cqi.h;
    }

    public final float c() {
        cqi cqi = this.a;
        if (cqi == null) {
            return 1.0f;
        }
        return cqi.i;
    }

    public final float d() {
        cqi cqi = this.a;
        if (cqi == null) {
            return 0.0f;
        }
        return cqi.j;
    }

    public final boolean e() {
        cqi cqi = this.a;
        return cqi != null && cqi.d();
    }

    public final boolean f() {
        cqi cqi = this.a;
        return cqi != null && cqi.e();
    }

    public final boolean g() {
        cqi cqi = this.a;
        return cqi != null && cqi.f();
    }

    /* Access modifiers changed, original: final */
    public final boolean h() {
        return this.b != null;
    }
}
