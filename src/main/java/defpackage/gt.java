package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.Gravity;
import android.view.View;

/* renamed from: gt */
public final class gt {
    private CharSequence A;
    private boolean B;
    private boolean C;
    private float D;
    private float E;
    private int[] F;
    private boolean G;
    private final TextPaint H;
    private TimeInterpolator I;
    private float J;
    private float K;
    private float L;
    private ColorStateList M;
    private float N;
    private float O;
    private float P;
    private ColorStateList Q;
    public float a;
    public final Rect b;
    public float c = 15.0f;
    public ColorStateList d;
    public Typeface e;
    public CharSequence f;
    public final TextPaint g;
    public TimeInterpolator h;
    private final View i;
    private boolean j;
    private final Rect k;
    private final RectF l;
    private int m = 16;
    private int n = 16;
    private float o = 15.0f;
    private ColorStateList p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private Typeface w;
    private Typeface x;
    private hg y;
    private hg z;

    public gt(View view) {
        this.i = view;
        this.H = new TextPaint(129);
        this.g = new TextPaint(this.H);
        this.b = new Rect();
        this.k = new Rect();
        this.l = new RectF();
    }

    private final void g() {
    }

    public final void a(TimeInterpolator timeInterpolator) {
        this.I = timeInterpolator;
        c();
    }

    public final void a(ColorStateList colorStateList) {
        if (this.d != colorStateList) {
            this.d = colorStateList;
            c();
        }
    }

    public final void b(ColorStateList colorStateList) {
        if (this.p != colorStateList) {
            this.p = colorStateList;
            c();
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        if (!gt.a(this.k, i, i2, i3, i4)) {
            this.k.set(i, i2, i3, i4);
            this.G = true;
            d();
        }
    }

    public final void b(int i, int i2, int i3, int i4) {
        if (!gt.a(this.b, i, i2, i3, i4)) {
            this.b.set(i, i2, i3, i4);
            this.G = true;
            d();
        }
    }

    public final float a() {
        if (this.f == null) {
            return 0.0f;
        }
        a(this.g);
        TextPaint textPaint = this.g;
        CharSequence charSequence = this.f;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final float b() {
        a(this.g);
        return -this.g.ascent();
    }

    private final void a(TextPaint textPaint) {
        textPaint.setTextSize(this.o);
        textPaint.setTypeface(this.w);
    }

    private final void d() {
        boolean z = false;
        if (this.b.width() > 0 && this.b.height() > 0 && this.k.width() > 0 && this.k.height() > 0) {
            z = true;
        }
        this.j = z;
    }

    public final void a(int i) {
        if (this.m != i) {
            this.m = i;
            c();
        }
    }

    public final void b(int i) {
        if (this.n != i) {
            this.n = i;
            c();
        }
    }

    public final void c(int i) {
        hn hnVar = new hn(this.i.getContext(), i);
        ColorStateList colorStateList = hnVar.b;
        if (colorStateList != null) {
            this.d = colorStateList;
        }
        float f = hnVar.a;
        if (f != 0.0f) {
            this.o = f;
        }
        colorStateList = hnVar.d;
        if (colorStateList != null) {
            this.M = colorStateList;
        }
        this.K = hnVar.e;
        this.L = hnVar.f;
        this.J = hnVar.g;
        hg hgVar = this.z;
        if (hgVar != null) {
            hgVar.b();
        }
        this.z = new hg(new gs(this), hnVar.a());
        hnVar.a(this.i.getContext(), this.z);
        c();
    }

    public final void d(int i) {
        hn hnVar = new hn(this.i.getContext(), i);
        ColorStateList colorStateList = hnVar.b;
        if (colorStateList != null) {
            this.p = colorStateList;
        }
        float f = hnVar.a;
        if (f != 0.0f) {
            this.c = f;
        }
        colorStateList = hnVar.d;
        if (colorStateList != null) {
            this.Q = colorStateList;
        }
        this.O = hnVar.e;
        this.P = hnVar.f;
        this.N = hnVar.g;
        hg hgVar = this.y;
        if (hgVar != null) {
            hgVar.b();
        }
        this.y = new hg(new gv(this), hnVar.a());
        hnVar.a(this.i.getContext(), this.y);
        c();
    }

    public final boolean a(Typeface typeface) {
        hg hgVar = this.z;
        if (hgVar != null) {
            hgVar.b();
        }
        if (this.w == typeface) {
            return false;
        }
        this.w = typeface;
        return true;
    }

    public final boolean b(Typeface typeface) {
        hg hgVar = this.y;
        if (hgVar != null) {
            hgVar.b();
        }
        if (this.e == typeface) {
            return false;
        }
        this.e = typeface;
        return true;
    }

    public final void a(float f) {
        f = th.a(f);
        if (f != this.a) {
            this.a = f;
            e();
        }
    }

    public final boolean a(int[] iArr) {
        this.F = iArr;
        ColorStateList colorStateList = this.d;
        if (colorStateList == null || !colorStateList.isStateful()) {
            colorStateList = this.p;
            if (colorStateList == null || !colorStateList.isStateful()) {
                return false;
            }
        }
        c();
        return true;
    }

    private final void e() {
        float f = this.a;
        this.l.left = gt.a((float) this.k.left, (float) this.b.left, f, this.h);
        this.l.top = gt.a(this.q, this.r, f, this.h);
        this.l.right = gt.a((float) this.k.right, (float) this.b.right, f, this.h);
        this.l.bottom = gt.a((float) this.k.bottom, (float) this.b.bottom, f, this.h);
        this.u = gt.a(this.s, this.t, f, this.h);
        this.v = gt.a(this.q, this.r, f, this.h);
        b(gt.a(this.c, this.o, f, this.I));
        ColorStateList colorStateList = this.d;
        ColorStateList colorStateList2 = this.p;
        if (colorStateList != colorStateList2) {
            this.H.setColor(gt.a(c(colorStateList2), f(), f));
        } else {
            this.H.setColor(f());
        }
        this.H.setShadowLayer(gt.a(this.N, this.J, f, null), gt.a(this.O, this.K, f, null), gt.a(this.P, this.L, f, null), gt.a(c(this.Q), c(this.M), f));
        abe.e(this.i);
    }

    private final int f() {
        return c(this.d);
    }

    private final int c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.F;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void a(Canvas canvas) {
        int save = canvas.save();
        if (this.A != null && this.j) {
            float f = this.u;
            float f2 = this.v;
            this.H.ascent();
            this.H.descent();
            float f3 = this.D;
            if (f3 != 1.0f) {
                canvas.scale(f3, f3, f, f2);
            }
            CharSequence charSequence = this.A;
            canvas.drawText(charSequence, 0, charSequence.length(), f, f2, this.H);
        }
        canvas.restoreToCount(save);
    }

    public final boolean a(CharSequence charSequence) {
        yy yyVar;
        if (abe.g(this.i) == 1) {
            yyVar = zb.d;
        } else {
            yyVar = zb.c;
        }
        return yyVar.a(charSequence, charSequence.length());
    }

    private final void b(float f) {
        c(f);
        this.C = false;
        abe.e(this.i);
    }

    private final void c(float f) {
        if (this.f != null) {
            float f2;
            Object obj;
            float width = (float) this.b.width();
            float width2 = (float) this.k.width();
            boolean z = false;
            if (gt.a(f, this.o)) {
                Object obj2;
                f = this.o;
                this.D = 1.0f;
                Typeface typeface = this.x;
                Typeface typeface2 = this.w;
                if (typeface != typeface2) {
                    this.x = typeface2;
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                f2 = f;
                obj = obj2;
            } else {
                f2 = this.c;
                Typeface typeface3 = this.x;
                Typeface typeface4 = this.e;
                if (typeface3 != typeface4) {
                    this.x = typeface4;
                    obj = 1;
                } else {
                    obj = null;
                }
                if (gt.a(f, f2)) {
                    this.D = 1.0f;
                } else {
                    this.D = f / this.c;
                }
                f = this.o / this.c;
                if (width2 * f > width) {
                    width = Math.min(width / f, width2);
                } else {
                    width = width2;
                }
            }
            if (width > 0.0f) {
                obj = (this.E == f2 && !this.G && obj == null) ? null : 1;
                this.E = f2;
                this.G = false;
            }
            if (this.A == null || r6 != null) {
                this.H.setTextSize(this.E);
                this.H.setTypeface(this.x);
                TextPaint textPaint = this.H;
                if (this.D != 1.0f) {
                    z = true;
                }
                textPaint.setLinearText(z);
                CharSequence ellipsize = TextUtils.ellipsize(this.f, this.H, width, TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.A)) {
                    this.A = ellipsize;
                    this.B = a(this.A);
                }
            }
        }
    }

    public final void c() {
        if (this.i.getHeight() > 0 && this.i.getWidth() > 0) {
            float f = this.E;
            c(this.o);
            CharSequence charSequence = this.A;
            float f2 = 0.0f;
            float measureText = charSequence != null ? this.H.measureText(charSequence, 0, charSequence.length()) : 0.0f;
            int absoluteGravity = Gravity.getAbsoluteGravity(this.n, this.B);
            int i = absoluteGravity & 112;
            if (i == 48) {
                this.r = ((float) this.b.top) - this.H.ascent();
            } else if (i != 80) {
                this.r = ((float) this.b.centerY()) + (((this.H.descent() - this.H.ascent()) / 2.0f) - this.H.descent());
            } else {
                this.r = (float) this.b.bottom;
            }
            absoluteGravity &= 8388615;
            if (absoluteGravity == 1) {
                this.t = ((float) this.b.centerX()) - (measureText / 2.0f);
            } else if (absoluteGravity != 5) {
                this.t = (float) this.b.left;
            } else {
                this.t = ((float) this.b.right) - measureText;
            }
            c(this.c);
            charSequence = this.A;
            if (charSequence != null) {
                f2 = this.H.measureText(charSequence, 0, charSequence.length());
            }
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.m, this.B);
            int i2 = absoluteGravity2 & 112;
            if (i2 == 48) {
                this.q = ((float) this.k.top) - this.H.ascent();
            } else if (i2 != 80) {
                this.q = ((float) this.k.centerY()) + (((this.H.descent() - this.H.ascent()) / 2.0f) - this.H.descent());
            } else {
                this.q = (float) this.k.bottom;
            }
            absoluteGravity2 &= 8388615;
            if (absoluteGravity2 == 1) {
                this.s = ((float) this.k.centerX()) - (f2 / 2.0f);
            } else if (absoluteGravity2 != 5) {
                this.s = (float) this.k.left;
            } else {
                this.s = ((float) this.k.right) - f2;
            }
            g();
            b(f);
            e();
        }
    }

    public final void b(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f, charSequence)) {
            this.f = charSequence;
            this.A = null;
            g();
            c();
        }
    }

    private static boolean a(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    private static int a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    private static float a(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return dq.a(f, f2, f3);
    }

    private static boolean a(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }
}
