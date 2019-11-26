package defpackage;

import android.view.View;

/* renamed from: bgb */
final class bgb {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;

    bgb(View view) {
        this.a = view.getTranslationX();
        this.b = view.getTranslationY();
        this.c = abe.r(view);
        this.d = view.getScaleX();
        this.e = view.getScaleY();
        this.f = view.getRotationX();
        this.g = view.getRotationY();
        this.h = view.getRotation();
    }

    public final void a(View view) {
        bfv.a(view, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bgb) {
            bgb bgb = (bgb) obj;
            if (bgb.a == this.a && bgb.b == this.b && bgb.c == this.c && bgb.d == this.d && bgb.e == this.e && bgb.f == this.f && bgb.g == this.g && bgb.h == this.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        float f = this.a;
        int i = 0;
        int floatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
        float f2 = this.b;
        floatToIntBits = (floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        f2 = this.c;
        floatToIntBits = (floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        f2 = this.d;
        floatToIntBits = (floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        f2 = this.e;
        floatToIntBits = (floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        f2 = this.f;
        floatToIntBits = (floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        f2 = this.g;
        floatToIntBits = (floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        f2 = this.h;
        if (f2 != 0.0f) {
            i = Float.floatToIntBits(f2);
        }
        return floatToIntBits + i;
    }
}
