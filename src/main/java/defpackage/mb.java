package defpackage;

import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;

/* renamed from: mb */
final class mb extends mg {
    public int[] a;
    public ro b;
    public float c = 0.0f;
    public ro d;
    public float e = 1.0f;
    public float f = 1.0f;
    public float g = 0.0f;
    public float h = 1.0f;
    public float i = 0.0f;
    public Cap j = Cap.BUTT;
    public Join k = Join.MITER;
    public float l = 4.0f;

    mb() {
    }

    mb(mb mbVar) {
        super(mbVar);
        this.a = mbVar.a;
        this.b = mbVar.b;
        this.c = mbVar.c;
        this.e = mbVar.e;
        this.d = mbVar.d;
        this.o = mbVar.o;
        this.f = mbVar.f;
        this.g = mbVar.g;
        this.h = mbVar.h;
        this.i = mbVar.i;
        this.j = mbVar.j;
        this.k = mbVar.k;
        this.l = mbVar.l;
    }

    public final boolean a() {
        return this.d.b() || this.b.b();
    }

    public final boolean a(int[] iArr) {
        return this.b.a(iArr) | this.d.a(iArr);
    }

    /* Access modifiers changed, original: final */
    public final int getStrokeColor() {
        return this.b.b;
    }

    /* Access modifiers changed, original: final */
    public final void setStrokeColor(int i) {
        this.b.b = i;
    }

    /* Access modifiers changed, original: final */
    public final float getStrokeWidth() {
        return this.c;
    }

    /* Access modifiers changed, original: final */
    public final void setStrokeWidth(float f) {
        this.c = f;
    }

    /* Access modifiers changed, original: final */
    public final float getStrokeAlpha() {
        return this.e;
    }

    /* Access modifiers changed, original: final */
    public final void setStrokeAlpha(float f) {
        this.e = f;
    }

    /* Access modifiers changed, original: final */
    public final int getFillColor() {
        return this.d.b;
    }

    /* Access modifiers changed, original: final */
    public final void setFillColor(int i) {
        this.d.b = i;
    }

    /* Access modifiers changed, original: final */
    public final float getFillAlpha() {
        return this.f;
    }

    /* Access modifiers changed, original: final */
    public final void setFillAlpha(float f) {
        this.f = f;
    }

    /* Access modifiers changed, original: final */
    public final float getTrimPathStart() {
        return this.g;
    }

    /* Access modifiers changed, original: final */
    public final void setTrimPathStart(float f) {
        this.g = f;
    }

    /* Access modifiers changed, original: final */
    public final float getTrimPathEnd() {
        return this.h;
    }

    /* Access modifiers changed, original: final */
    public final void setTrimPathEnd(float f) {
        this.h = f;
    }

    /* Access modifiers changed, original: final */
    public final float getTrimPathOffset() {
        return this.i;
    }

    /* Access modifiers changed, original: final */
    public final void setTrimPathOffset(float f) {
        this.i = f;
    }
}
