package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;

/* renamed from: me */
final class me extends md {
    public final Matrix a = new Matrix();
    public final ArrayList b = new ArrayList();
    public float c = 0.0f;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 1.0f;
    public float g = 1.0f;
    public float h = 0.0f;
    public float i = 0.0f;
    public final Matrix j = new Matrix();
    public int k;
    public int[] l;
    public String m = null;

    public me(me meVar, zj zjVar) {
        int i = 0;
        super();
        this.c = meVar.c;
        this.d = meVar.d;
        this.e = meVar.e;
        this.f = meVar.f;
        this.g = meVar.g;
        this.h = meVar.h;
        this.i = meVar.i;
        this.l = meVar.l;
        this.m = meVar.m;
        this.k = meVar.k;
        String str = this.m;
        if (str != null) {
            zjVar.put(str, this);
        }
        this.j.set(meVar.j);
        ArrayList arrayList = meVar.b;
        while (i < arrayList.size()) {
            Object obj = arrayList.get(i);
            if (obj instanceof me) {
                this.b.add(new me((me) obj, zjVar));
            } else {
                Object mbVar;
                if (obj instanceof mb) {
                    mbVar = new mb((mb) obj);
                } else if (obj instanceof mc) {
                    mbVar = new mc((mc) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(mbVar);
                str = mbVar.n;
                if (str != null) {
                    zjVar.put(str, mbVar);
                }
            }
            i++;
        }
    }

    public me() {
        super();
    }

    public final String getGroupName() {
        return this.m;
    }

    public final Matrix getLocalMatrix() {
        return this.j;
    }

    public final void b() {
        this.j.reset();
        this.j.postTranslate(-this.d, -this.e);
        this.j.postScale(this.f, this.g);
        this.j.postRotate(this.c, 0.0f, 0.0f);
        this.j.postTranslate(this.h + this.d, this.i + this.e);
    }

    public final float getRotation() {
        return this.c;
    }

    public final void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            b();
        }
    }

    public final float getPivotX() {
        return this.d;
    }

    public final void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            b();
        }
    }

    public final float getPivotY() {
        return this.e;
    }

    public final void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            b();
        }
    }

    public final float getScaleX() {
        return this.f;
    }

    public final void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            b();
        }
    }

    public final float getScaleY() {
        return this.g;
    }

    public final void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            b();
        }
    }

    public final float getTranslateX() {
        return this.h;
    }

    public final void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            b();
        }
    }

    public final float getTranslateY() {
        return this.i;
    }

    public final void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            b();
        }
    }

    public final boolean a() {
        for (int i = 0; i < this.b.size(); i++) {
            if (((md) this.b.get(i)).a()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            i |= ((md) this.b.get(i2)).a(iArr);
        }
        if (i == 0) {
            return false;
        }
        return true;
    }
}
