package defpackage;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: hw */
public final class hw extends ConstantState {
    public ia a;
    public fs b;
    public ColorFilter c;
    public ColorStateList d = null;
    public ColorStateList e = null;
    public ColorStateList f = null;
    public ColorStateList g = null;
    public Mode h = Mode.SRC_IN;
    public Rect i = null;
    public float j = 1.0f;
    public float k = 1.0f;
    public float l;
    public int m = 255;
    public float n = 0.0f;
    public float o = 0.0f;
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public int s = 0;
    public boolean t = false;
    public Style u = Style.FILL_AND_STROKE;

    public hw(ia iaVar) {
        this.a = iaVar;
        this.b = null;
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public hw(hw hwVar) {
        this.a = hwVar.a;
        this.b = hwVar.b;
        this.l = hwVar.l;
        this.c = hwVar.c;
        this.d = hwVar.d;
        this.e = hwVar.e;
        this.h = hwVar.h;
        this.g = hwVar.g;
        this.m = hwVar.m;
        this.j = hwVar.j;
        this.r = hwVar.r;
        this.p = hwVar.p;
        this.t = hwVar.t;
        this.k = hwVar.k;
        this.n = hwVar.n;
        this.o = hwVar.o;
        this.q = hwVar.q;
        this.s = hwVar.s;
        this.f = hwVar.f;
        this.u = hwVar.u;
        Rect rect = hwVar.i;
        if (rect != null) {
            this.i = new Rect(rect);
        }
    }

    public final Drawable newDrawable() {
        return new hu(this, (byte) 0);
    }
}
