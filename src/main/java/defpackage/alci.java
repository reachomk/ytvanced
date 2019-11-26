package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.youtube.R;

/* renamed from: alci */
final class alci extends ViewGroup {
    private int A = 0;
    private int B = 0;
    public final Context a;
    public View b;
    public PopupWindow c;
    public alcj d;
    public boolean e;
    public View f;
    public View g;
    public int h;
    public float i = 1.0f;
    private final Path j;
    private final RectF k;
    private final Paint l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final Rect t = new Rect();
    private final int[] u = new int[2];
    private final Point v = new Point();
    private boolean w;
    private int x;
    private int y = 0;
    private int z;

    alci(Context context) {
        super(context);
        this.a = context;
        setWillNotDraw(false);
        this.j = new Path();
        this.k = new RectF();
        this.l = new Paint();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(albp.a);
        this.m = obtainStyledAttributes.getDimensionPixelSize(albp.f, xss.a(displayMetrics, 16));
        this.n = obtainStyledAttributes.getDimensionPixelSize(albp.e, xss.a(displayMetrics, 8));
        this.o = obtainStyledAttributes.getDimensionPixelSize(albp.g, xss.a(displayMetrics, 1));
        this.s = obtainStyledAttributes.getDimensionPixelSize(albp.h, xss.a(displayMetrics, 1));
        this.p = obtainStyledAttributes.getDimensionPixelSize(albp.c, xss.a(displayMetrics, 10));
        this.q = obtainStyledAttributes.getDimensionPixelSize(albp.b, xss.a(displayMetrics, 24));
        this.r = obtainStyledAttributes.getDimensionPixelSize(albp.d, xss.a(displayMetrics, 4));
        int color = obtainStyledAttributes.getColor(0, xwe.a(context, R.attr.ytThemedBlue));
        int color2 = obtainStyledAttributes.getColor(1, 1073741824);
        obtainStyledAttributes.recycle();
        this.l.setStyle(Style.FILL);
        float f = (float) this.o;
        this.l.setShadowLayer((float) this.s, f, f, color2);
        this.l.setColor(color);
        setLayerType(1, this.l);
        this.e = true;
    }

    private static boolean b(int i) {
        return i == 1 || i == 2;
    }

    public final void a(View view, Rect rect, int i, int i2, int i3) {
        this.g = view;
        a(rect);
        this.x = i;
        this.y = 0;
        this.z = i2;
        this.h = i3;
        this.w = true;
    }

    public final void a(Rect rect) {
        this.t.set(rect);
    }

    public final void a(int i) {
        if (this.c != null) {
            View view = this.b;
            if (view != null && (view.getParent() instanceof ViewGroup)) {
                ((ViewGroup) this.b.getParent()).removeView(this.b);
                this.b = null;
            }
            this.c.setOnDismissListener(null);
            this.c.dismiss();
            alcj alcj = this.d;
            if (alcj != null) {
                alcj.a(i);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0120  */
    public final void onMeasure(int r10, int r11) {
        /*
        r9 = this;
        r10 = r9.y;
        if (r10 != 0) goto L_0x0010;
    L_0x0004:
        r10 = r9.w;
        if (r10 == 0) goto L_0x0010;
    L_0x0008:
        r10 = r9.x;
        r10 = defpackage.alcg.a(r10, r9);
        r9.y = r10;
    L_0x0010:
        r10 = r9.u;
        r11 = r9.v;
        r9.a(r11);
        r11 = r9.v;
        r11 = r11.x;
        r0 = r9.v;
        r0 = r0.y;
        r1 = r9.y;
        r2 = 3;
        r3 = 2;
        r4 = 1;
        r5 = 4;
        if (r1 == r4) goto L_0x0061;
    L_0x0027:
        if (r1 == r3) goto L_0x004e;
    L_0x0029:
        if (r1 == r2) goto L_0x0045;
    L_0x002b:
        if (r1 != r5) goto L_0x003f;
    L_0x002d:
        r1 = r9.t;
        r1 = r1.left;
        r6 = r9.t;
        r6 = r6.width();
        r7 = r9.n;
        r11 = r11 - r1;
        r11 = r11 - r6;
        r11 = r11 - r7;
        r7 = r7 + r7;
        r0 = r0 - r7;
        goto L_0x006c;
    L_0x003f:
        r10 = new java.lang.IllegalStateException;
        r10.<init>();
        throw r10;
    L_0x0045:
        r11 = r9.t;
        r11 = r11.left;
        r1 = r9.n;
        r11 = r11 - r1;
        r1 = r1 + r1;
        goto L_0x006b;
    L_0x004e:
        r1 = r9.n;
        r1 = r1 + r1;
        r11 = r11 - r1;
        r1 = r9.t;
        r1 = r1.top;
        r0 = r0 - r1;
        r1 = r9.t;
        r1 = r1.height();
        r0 = r0 - r1;
        r1 = r9.n;
        goto L_0x006b;
    L_0x0061:
        r0 = r9.n;
        r0 = r0 + r0;
        r11 = r11 - r0;
        r0 = r9.t;
        r0 = r0.top;
        r1 = r9.n;
    L_0x006b:
        r0 = r0 - r1;
    L_0x006c:
        r1 = 0;
        r10[r1] = r11;
        r10[r4] = r0;
        r10 = r9.u;
        r11 = r10[r1];
        r10 = r10[r4];
        r0 = r9.m;
        r0 = r0 + r0;
        r4 = r9.o;
        r11 = r11 - r0;
        r11 = r11 - r4;
        r10 = r10 - r0;
        r10 = r10 - r4;
        r0 = r9.y;
        r0 = defpackage.alci.b(r0);
        if (r0 == 0) goto L_0x008c;
    L_0x0088:
        r0 = r9.p;
        r10 = r10 - r0;
        goto L_0x0097;
    L_0x008c:
        r0 = r9.y;
        if (r0 != r2) goto L_0x0091;
    L_0x0090:
        goto L_0x0094;
    L_0x0091:
        if (r0 == r5) goto L_0x0094;
    L_0x0093:
        goto L_0x0097;
    L_0x0094:
        r0 = r9.p;
        r11 = r11 - r0;
    L_0x0097:
        r0 = r9.v;
        r9.a(r0);
        r0 = r9.v;
        r0 = r0.x;
        r4 = r9.i;
        r0 = (float) r0;
        r0 = r0 * r4;
        r0 = (int) r0;
        r0 = java.lang.Math.min(r0, r11);
        r4 = r9.f;
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r6);
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r1);
        r4.measure(r0, r7);
        r0 = r9.f;
        r0 = r0.getMeasuredHeight();
        if (r0 <= r10) goto L_0x00ce;
    L_0x00c1:
        r0 = r9.f;
        r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r6);
        r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r6);
        r0.measure(r11, r10);
    L_0x00ce:
        r10 = r9.f;
        r10 = r10.getMeasuredWidth();
        r11 = r9.m;
        r11 = r11 + r11;
        r10 = r10 + r11;
        r11 = r9.f;
        r11 = r11.getMeasuredHeight();
        r0 = r9.m;
        r0 = r0 + r0;
        r11 = r11 + r0;
        r0 = r9.k;
        r4 = r9.y;
        r6 = 0;
        if (r4 != r5) goto L_0x00ed;
    L_0x00e9:
        r7 = r9.p;
        r7 = (float) r7;
        goto L_0x00ee;
    L_0x00ed:
        r7 = 0;
    L_0x00ee:
        if (r4 != r3) goto L_0x00f3;
    L_0x00f0:
        r6 = r9.p;
        r6 = (float) r6;
    L_0x00f3:
        if (r4 != r5) goto L_0x00f8;
    L_0x00f5:
        r8 = r9.p;
        goto L_0x00f9;
    L_0x00f8:
        r8 = 0;
    L_0x00f9:
        r10 = r10 + r8;
        r10 = (float) r10;
        if (r4 != r3) goto L_0x00ff;
    L_0x00fd:
        r1 = r9.p;
    L_0x00ff:
        r11 = r11 + r1;
        r11 = (float) r11;
        r0.set(r7, r6, r10, r11);
        r10 = r9.k;
        r10 = r10.width();
        r10 = (int) r10;
        r11 = r9.o;
        r10 = r10 + r11;
        r11 = r9.k;
        r11 = r11.height();
        r11 = (int) r11;
        r0 = r9.o;
        r11 = r11 + r0;
        r0 = r9.y;
        r0 = defpackage.alci.b(r0);
        if (r0 == 0) goto L_0x0124;
    L_0x0120:
        r0 = r9.p;
        r11 = r11 + r0;
        goto L_0x012f;
    L_0x0124:
        r0 = r9.y;
        if (r0 != r2) goto L_0x0129;
    L_0x0128:
        goto L_0x012c;
    L_0x0129:
        if (r0 == r5) goto L_0x012c;
    L_0x012b:
        goto L_0x012f;
    L_0x012c:
        r0 = r9.p;
        r10 = r10 + r0;
    L_0x012f:
        r9.setMeasuredDimension(r10, r11);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alci.onMeasure(int, int):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.f;
        int i5 = this.m;
        int i6 = this.y;
        int i7 = 0;
        view.layout((i6 == 4 ? this.p : 0) + i5, (i6 == 2 ? this.p : 0) + i5, ((i3 - i) - i5) - (i6 == 3 ? this.p : 0), ((i4 - i2) - i5) - (i6 == 1 ? this.p : 0));
        view = this.b;
        if (view != null) {
            view.postInvalidate();
        }
        a(this.v);
        int i8 = this.v.x;
        i6 = this.v.y;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i9 = this.y;
        if (i9 == 1) {
            i9 = -measuredHeight;
        } else if (i9 == 2) {
            i9 = this.t.height();
        } else if (i9 == 3) {
            i7 = -measuredWidth;
            i9 = (this.t.height() - measuredHeight) / 2;
        } else if (i9 == 4) {
            i7 = this.t.width();
            i9 = (this.t.height() - measuredHeight) / 2;
        } else {
            i9 = 0;
        }
        int g = abe.g(this);
        if (alci.b(this.y)) {
            i7 = this.t.top + i9;
            i9 = this.z;
            if (i9 != 1) {
                if (i9 == 2) {
                    i9 = this.t.left + ((this.t.width() - measuredWidth) / 2);
                } else if (i9 != 3) {
                    throw new IllegalStateException();
                } else if (g != 1) {
                    i9 = this.t.left;
                    g = this.t.width();
                } else {
                    i9 = this.t.left;
                }
            } else if (g != 1) {
                i9 = this.t.left;
            } else {
                i9 = this.t.left;
                g = this.t.width();
            }
            i9 = (i9 + g) - measuredWidth;
        } else {
            int i10 = i9 + this.t.top;
            i9 = i7 + this.t.left;
            i7 = i10;
        }
        g = this.n;
        this.A = alci.a(i9, g, (i8 - g) - measuredWidth);
        i8 = this.n;
        int a = alci.a(i7, i8, (i6 - i8) - measuredHeight);
        this.B = a;
        this.c.update(this.A, a, measuredWidth, measuredHeight, true);
        i8 = this.z;
        if (i8 == 1) {
            i8 = this.q;
            i6 = this.n;
            i8 = (i8 / 2) + (i6 + i6);
        } else if (i8 == 2) {
            i8 = this.t.width() / 2;
        } else if (i8 == 3) {
            i8 = this.t.width();
            i6 = this.q;
            i7 = this.n;
            i8 = (i8 - (i6 / 2)) - (i7 + i7);
        } else {
            throw new IllegalStateException();
        }
        if (abe.g(this) == 1) {
            i8 = this.t.width() - i8;
        }
        i8 += this.t.left;
        this.j.reset();
        i6 = this.y;
        if (i6 == 1) {
            this.j.moveTo((float) ((i8 - this.n) - (this.q / 2)), this.k.bottom);
            this.j.rLineTo((float) this.q, 0.0f);
            this.j.rLineTo((float) ((-this.q) / 2), (float) this.p);
            this.j.rLineTo((float) ((-this.q) / 2), (float) (-this.p));
            this.j.close();
        } else if (i6 == 2) {
            this.j.moveTo((float) ((i8 - this.n) + (this.q / 2)), this.k.top);
            this.j.rLineTo((float) (-this.q), 0.0f);
            this.j.rLineTo((float) (this.q / 2), (float) (-this.p));
            this.j.rLineTo((float) (this.q / 2), (float) this.p);
            this.j.close();
        } else if (i6 == 3) {
            this.j.moveTo(this.k.right, (float) ((this.t.centerY() - this.q) + (this.n / 2)));
            this.j.rLineTo((float) this.p, (float) (this.q / 2));
            this.j.rLineTo((float) (-this.p), (float) (this.q / 2));
            this.j.rLineTo(0.0f, (float) (-this.q));
            this.j.close();
        } else if (i6 == 4) {
            this.j.moveTo(this.k.left, (float) ((this.t.centerY() - this.q) + (this.n / 2)));
            this.j.rLineTo(0.0f, (float) this.q);
            this.j.rLineTo((float) (-this.p), (float) ((-this.q) / 2));
            this.j.rLineTo((float) this.p, (float) ((-this.q) / 2));
            this.j.close();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int i = this.y;
        if (i == 2 || i == 4) {
            a(canvas);
        }
        float f = (float) this.r;
        canvas.drawRoundRect(this.k, f, f, this.l);
        i = this.y;
        if (i == 1 || i == 3) {
            a(canvas);
        }
        canvas.restore();
    }

    private final void a(Point point) {
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getSize(point);
    }

    private final void a(Canvas canvas) {
        canvas.save();
        if (alci.b(this.y)) {
            canvas.translate((float) (this.n - this.A), 0.0f);
        } else {
            int i = this.y;
            if (i == 3 || i == 4) {
                canvas.translate(0.0f, (float) (this.n - this.B));
            }
        }
        canvas.drawPath(this.j, this.l);
        canvas.restore();
    }

    private static int a(int i, int i2, int i3) {
        return Math.min(i3, Math.max(i2, i));
    }
}
