package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: mi */
final class mi extends ConstantState {
    public int a;
    public mf b;
    public ColorStateList c;
    public Mode d;
    public boolean e;
    public Bitmap f;
    public ColorStateList g;
    public Mode h;
    public int i;
    public boolean j;
    public boolean k;
    public Paint l;

    public mi(mi miVar) {
        this.c = null;
        this.d = lz.a;
        if (miVar != null) {
            this.a = miVar.a;
            this.b = new mf(miVar.b);
            Paint paint = miVar.b.c;
            if (paint != null) {
                this.b.c = new Paint(paint);
            }
            paint = miVar.b.b;
            if (paint != null) {
                this.b.b = new Paint(paint);
            }
            this.c = miVar.c;
            this.d = miVar.d;
            this.e = miVar.e;
        }
    }

    public final void a(int i, int i2) {
        this.f.eraseColor(0);
        Canvas canvas = new Canvas(this.f);
        mf mfVar = this.b;
        mfVar.a(mfVar.d, mf.a, canvas, i, i2);
    }

    public mi() {
        this.c = null;
        this.d = lz.a;
        this.b = new mf();
    }

    public final Drawable newDrawable() {
        return new lz(this);
    }

    public final Drawable newDrawable(Resources resources) {
        return new lz(this);
    }

    public final int getChangingConfigurations() {
        return this.a;
    }

    public final boolean a() {
        mf mfVar = this.b;
        if (mfVar.j == null) {
            mfVar.j = Boolean.valueOf(mfVar.d.a());
        }
        return mfVar.j.booleanValue();
    }
}
