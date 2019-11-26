package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: bpf */
public class bpf {
    private final bjj a;
    public final Object b;
    public Object c;
    public final Interpolator d;
    public final float e;
    public Float f;
    public float g;
    public float h;
    public int i;
    public int j;
    public PointF k;
    public PointF l;
    private float m;
    private float n;

    public bpf(bjj bjj, Object obj, Object obj2, Interpolator interpolator, float f, Float f2) {
        this.g = -3987645.8f;
        this.h = -3987645.8f;
        this.i = 784923401;
        this.j = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.k = null;
        this.l = null;
        this.a = bjj;
        this.b = obj;
        this.c = obj2;
        this.d = interpolator;
        this.e = f;
        this.f = f2;
    }

    public bpf(Object obj) {
        this.g = -3987645.8f;
        this.h = -3987645.8f;
        this.i = 784923401;
        this.j = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.k = null;
        this.l = null;
        this.a = null;
        this.b = obj;
        this.c = obj;
        this.d = null;
        this.e = Float.MIN_VALUE;
        this.f = Float.valueOf(Float.MAX_VALUE);
    }

    public final float b() {
        bjj bjj = this.a;
        if (bjj == null) {
            return 0.0f;
        }
        float f = this.m;
        if (f == Float.MIN_VALUE) {
            f = (this.e - bjj.i) / bjj.c();
            this.m = f;
        }
        return f;
    }

    public final float c() {
        if (this.a == null) {
            return 1.0f;
        }
        float f = this.n;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        if (this.f == null) {
            this.n = 1.0f;
            return 1.0f;
        }
        float floatValue = ((this.f.floatValue() - this.e) / this.a.c()) + b();
        this.n = floatValue;
        return floatValue;
    }

    public final boolean d() {
        return this.d == null;
    }

    public final boolean a(float f) {
        return f >= b() && f < c();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Keyframe{startValue=");
        stringBuilder.append(this.b);
        stringBuilder.append(", endValue=");
        stringBuilder.append(this.c);
        stringBuilder.append(", startFrame=");
        stringBuilder.append(this.e);
        stringBuilder.append(", endFrame=");
        stringBuilder.append(this.f);
        stringBuilder.append(", interpolator=");
        stringBuilder.append(this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
