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
import android.view.Display;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.youtube.R;

/* renamed from: albr */
public final class albr extends ViewGroup {
    public PopupWindow a;
    public boolean b;
    public View c;
    public int d;
    public View e;
    public Rect f;
    public int g;
    public float h = 1.0f;
    private final int[] i;
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
    private boolean t;

    public albr(Context context) {
        super(context);
        setWillNotDraw(false);
        this.i = new int[2];
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
        a(color);
        this.b = true;
    }

    public final void a() {
        int height;
        int[] iArr = this.i;
        View view = this.e;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        view.measure(makeMeasureSpec, makeMeasureSpec);
        view.getLocationInWindow(iArr);
        if (view.getWidth() != 0) {
            makeMeasureSpec = view.getWidth();
        } else {
            makeMeasureSpec = view.getMeasuredWidth();
        }
        if (view.getHeight() != 0) {
            height = view.getHeight();
        } else {
            height = view.getMeasuredHeight();
        }
        int i = iArr[0];
        int i2 = iArr[1];
        this.f = new Rect(i, i2, makeMeasureSpec + i, height + i2);
    }

    public final void a(int i) {
        this.l.setColor(i);
        setLayerType(1, this.l);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int i3;
        if (!this.t) {
            i3 = this.d;
            if (i3 != 0) {
                this.d = albo.a(i3, this);
                this.t = true;
            }
        }
        i = MeasureSpec.getSize(i);
        i2 = MeasureSpec.getSize(i2);
        i3 = this.m;
        i3 += i3;
        int i4 = this.o;
        i = (i - i3) - i4;
        i2 = (i2 - i3) - i4;
        if (albo.a(this.d)) {
            i2 -= this.p;
        } else {
            i3 = this.d;
            if (i3 == 5 || i3 == 6) {
                i -= this.p;
            }
        }
        int i5 = 0;
        this.c.measure(MeasureSpec.makeMeasureSpec(Math.min((int) (((float) b().x) * this.h), i), aocf.UNSET_ENUM_VALUE), MeasureSpec.makeMeasureSpec(i2, 0));
        if (this.c.getMeasuredHeight() > i2) {
            this.c.measure(MeasureSpec.makeMeasureSpec(i, aocf.UNSET_ENUM_VALUE), MeasureSpec.makeMeasureSpec(i2, aocf.UNSET_ENUM_VALUE));
        }
        i = this.c.getMeasuredWidth();
        i2 = this.m;
        i += i2 + i2;
        i2 = this.c.getMeasuredHeight();
        i3 = this.m;
        i2 += i3 + i3;
        RectF rectF = this.k;
        int i6 = this.d;
        float f = 0.0f;
        float f2 = i6 == 6 ? (float) this.p : 0.0f;
        if (i6 == 2) {
            f = (float) this.p;
        }
        float f3 = (float) (i + (i6 == 6 ? this.p : 0));
        if (i6 == 2) {
            i5 = this.p;
        }
        rectF.set(f2, f, f3, (float) (i2 + i5));
        i = ((int) this.k.width()) + this.o;
        i2 = ((int) this.k.height()) + this.o;
        if (albo.a(this.d)) {
            i2 += this.p;
        } else {
            i3 = this.d;
            if (i3 == 5 || i3 == 6) {
                i += this.p;
            }
        }
        setMeasuredDimension(i, i2);
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ce  */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
        r18 = this;
        r0 = r18;
        r1 = r0.c;
        r2 = r0.m;
        r3 = r0.d;
        r4 = 6;
        r5 = 0;
        if (r3 != r4) goto L_0x000f;
    L_0x000c:
        r6 = r0.p;
        goto L_0x0010;
    L_0x000f:
        r6 = 0;
    L_0x0010:
        r6 = r6 + r2;
        r7 = 2;
        if (r3 != r7) goto L_0x0017;
    L_0x0014:
        r8 = r0.p;
        goto L_0x0018;
    L_0x0017:
        r8 = 0;
    L_0x0018:
        r8 = r8 + r2;
        r9 = r22 - r20;
        r9 = r9 - r2;
        r10 = 5;
        if (r3 != r10) goto L_0x0022;
    L_0x001f:
        r11 = r0.p;
        goto L_0x0023;
    L_0x0022:
        r11 = 0;
    L_0x0023:
        r9 = r9 - r11;
        r11 = r23 - r21;
        r11 = r11 - r2;
        r2 = 1;
        if (r3 != r2) goto L_0x002d;
    L_0x002a:
        r3 = r0.p;
        goto L_0x002e;
    L_0x002d:
        r3 = 0;
    L_0x002e:
        r11 = r11 - r3;
        r1.layout(r6, r8, r9, r11);
        r1 = r18.b();
        r3 = r1.x;
        r1 = r1.y;
        r6 = r0.d;
        if (r6 == r2) goto L_0x007e;
    L_0x003e:
        if (r6 == r7) goto L_0x0069;
    L_0x0040:
        if (r6 == r10) goto L_0x005e;
    L_0x0042:
        if (r6 != r4) goto L_0x0058;
    L_0x0044:
        r6 = r0.f;
        r6 = r6.left;
        r8 = r0.f;
        r8 = r8.width();
        r9 = r0.n;
        r6 = r3 - r6;
        r6 = r6 - r8;
        r6 = r6 - r9;
        r9 = r9 + r9;
        r8 = r1 - r9;
        goto L_0x008a;
    L_0x0058:
        r1 = new java.lang.IllegalStateException;
        r1.<init>();
        throw r1;
    L_0x005e:
        r6 = r0.f;
        r6 = r6.left;
        r8 = r0.n;
        r6 = r6 - r8;
        r8 = r8 + r8;
        r8 = r1 - r8;
        goto L_0x008a;
    L_0x0069:
        r6 = r0.n;
        r6 = r6 + r6;
        r6 = r3 - r6;
        r8 = r0.f;
        r8 = r8.top;
        r8 = r1 - r8;
        r9 = r0.f;
        r9 = r9.height();
        r8 = r8 - r9;
        r9 = r0.n;
        goto L_0x0089;
    L_0x007e:
        r6 = r0.n;
        r6 = r6 + r6;
        r6 = r3 - r6;
        r8 = r0.f;
        r8 = r8.top;
        r9 = r0.n;
    L_0x0089:
        r8 = r8 - r9;
    L_0x008a:
        r9 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9);
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9);
        r0.measure(r6, r8);
        r6 = new albq;
        r8 = r0.f;
        r8 = r8.left;
        r9 = r0.f;
        r9 = r9.top;
        r6.<init>(r8, r9, r3, r1);
        r14 = r18.getMeasuredWidth();
        r15 = r18.getMeasuredHeight();
        r1 = r0.d;
        if (r1 != r2) goto L_0x00b4;
    L_0x00b0:
        r1 = -r15;
    L_0x00b1:
        r3 = r1;
        r1 = 0;
        goto L_0x00dc;
    L_0x00b4:
        if (r1 != r7) goto L_0x00bd;
    L_0x00b6:
        r1 = r0.f;
        r1 = r1.height();
        goto L_0x00b1;
    L_0x00bd:
        if (r1 != r10) goto L_0x00c9;
    L_0x00bf:
        r1 = -r14;
        r3 = r0.f;
        r3 = r3.height();
        r3 = r3 - r15;
        r3 = r3 / r7;
        goto L_0x00dc;
    L_0x00c9:
        if (r1 != r4) goto L_0x00da;
    L_0x00cb:
        r1 = r0.f;
        r1 = r1.width();
        r3 = r0.f;
        r3 = r3.height();
        r3 = r3 - r15;
        r3 = r3 / r7;
        goto L_0x00dc;
    L_0x00da:
        r1 = 0;
        r3 = 0;
    L_0x00dc:
        r8 = defpackage.abe.g(r18);
        r9 = r0.d;
        r9 = defpackage.albo.a(r9);
        r13 = 3;
        if (r9 == 0) goto L_0x0124;
    L_0x00e9:
        r1 = r6.b;
        r1 = r1 + r3;
        r3 = r0.g;
        if (r3 == r2) goto L_0x0114;
    L_0x00f0:
        if (r3 == r7) goto L_0x0108;
    L_0x00f2:
        if (r3 != r13) goto L_0x0102;
    L_0x00f4:
        if (r8 == r2) goto L_0x00ff;
    L_0x00f6:
        r3 = r6.a;
        r8 = r0.f;
        r8 = r8.width();
        goto L_0x0121;
    L_0x00ff:
        r3 = r6.a;
        goto L_0x012f;
    L_0x0102:
        r1 = new java.lang.IllegalStateException;
        r1.<init>();
        throw r1;
    L_0x0108:
        r3 = r6.a;
        r8 = r0.f;
        r8 = r8.width();
        r8 = r8 - r14;
        r8 = r8 / r7;
        r3 = r3 + r8;
        goto L_0x012f;
    L_0x0114:
        if (r8 == r2) goto L_0x0119;
    L_0x0116:
        r3 = r6.a;
        goto L_0x012f;
    L_0x0119:
        r3 = r6.a;
        r8 = r0.f;
        r8 = r8.width();
    L_0x0121:
        r3 = r3 + r8;
        r3 = r3 - r14;
        goto L_0x012f;
    L_0x0124:
        r8 = r6.a;
        r1 = r1 + r8;
        r8 = r6.b;
        r3 = r3 + r8;
        r17 = r3;
        r3 = r1;
        r1 = r17;
    L_0x012f:
        r8 = r0.n;
        r9 = r6.c;
        r9 = r9 - r8;
        r9 = r9 - r14;
        r12 = defpackage.albr.a(r3, r8, r9);
        r3 = r0.n;
        r6 = r6.d;
        r6 = r6 - r3;
        r6 = r6 - r15;
        r1 = defpackage.albr.a(r1, r3, r6);
        r11 = r0.a;
        r16 = 1;
        r3 = 3;
        r13 = r1;
        r11.update(r12, r13, r14, r15, r16);
        r1 = r0.g;
        if (r1 == r2) goto L_0x016e;
    L_0x0150:
        if (r1 == r7) goto L_0x0165;
    L_0x0152:
        if (r1 == r3) goto L_0x0155;
    L_0x0154:
        goto L_0x0176;
    L_0x0155:
        r1 = r0.f;
        r1 = r1.width();
        r3 = r0.q;
        r5 = r0.n;
        r3 = r3 / r7;
        r1 = r1 - r3;
        r5 = r5 + r5;
        r5 = r1 - r5;
        goto L_0x0176;
    L_0x0165:
        r1 = r0.f;
        r1 = r1.width();
        r5 = r1 / 2;
        goto L_0x0176;
    L_0x016e:
        r1 = r0.q;
        r3 = r0.n;
        r1 = r1 / r7;
        r3 = r3 + r3;
        r5 = r1 + r3;
    L_0x0176:
        r1 = defpackage.abe.g(r18);
        if (r1 != r2) goto L_0x0184;
    L_0x017c:
        r1 = r0.f;
        r1 = r1.width();
        r5 = r1 - r5;
    L_0x0184:
        r1 = r0.f;
        r1 = r1.left;
        r5 = r5 + r1;
        r1 = r0.j;
        r1.reset();
        r1 = r0.d;
        r3 = 0;
        if (r1 != r2) goto L_0x01ce;
    L_0x0193:
        r1 = r0.j;
        r2 = r0.n;
        r5 = r5 - r2;
        r2 = r0.q;
        r2 = r2 / r7;
        r5 = r5 - r2;
        r2 = (float) r5;
        r4 = r0.k;
        r4 = r4.bottom;
        r1.moveTo(r2, r4);
        r1 = r0.j;
        r2 = r0.q;
        r2 = (float) r2;
        r1.rLineTo(r2, r3);
        r1 = r0.j;
        r2 = r0.q;
        r2 = -r2;
        r2 = r2 / r7;
        r2 = (float) r2;
        r3 = r0.p;
        r3 = (float) r3;
        r1.rLineTo(r2, r3);
        r1 = r0.j;
        r2 = r0.q;
        r2 = -r2;
        r2 = r2 / r7;
        r2 = (float) r2;
        r3 = r0.p;
        r3 = -r3;
        r3 = (float) r3;
        r1.rLineTo(r2, r3);
        r1 = r0.j;
        r1.close();
        goto L_0x028b;
    L_0x01ce:
        if (r1 != r7) goto L_0x0209;
    L_0x01d0:
        r1 = r0.j;
        r2 = r0.n;
        r5 = r5 - r2;
        r2 = r0.q;
        r2 = r2 / r7;
        r5 = r5 + r2;
        r2 = (float) r5;
        r4 = r0.k;
        r4 = r4.top;
        r1.moveTo(r2, r4);
        r1 = r0.j;
        r2 = r0.q;
        r2 = -r2;
        r2 = (float) r2;
        r1.rLineTo(r2, r3);
        r1 = r0.j;
        r2 = r0.q;
        r2 = r2 / r7;
        r2 = (float) r2;
        r3 = r0.p;
        r3 = -r3;
        r3 = (float) r3;
        r1.rLineTo(r2, r3);
        r1 = r0.j;
        r2 = r0.q;
        r2 = r2 / r7;
        r2 = (float) r2;
        r3 = r0.p;
        r3 = (float) r3;
        r1.rLineTo(r2, r3);
        r1 = r0.j;
        r1.close();
        return;
    L_0x0209:
        if (r1 != r10) goto L_0x024a;
    L_0x020b:
        r1 = r0.j;
        r2 = r0.k;
        r2 = r2.right;
        r4 = r0.f;
        r4 = r4.centerY();
        r5 = r0.q;
        r4 = r4 - r5;
        r5 = r0.n;
        r5 = r5 / r7;
        r4 = r4 + r5;
        r4 = (float) r4;
        r1.moveTo(r2, r4);
        r1 = r0.j;
        r2 = r0.p;
        r2 = (float) r2;
        r4 = r0.q;
        r4 = r4 / r7;
        r4 = (float) r4;
        r1.rLineTo(r2, r4);
        r1 = r0.j;
        r2 = r0.p;
        r2 = -r2;
        r2 = (float) r2;
        r4 = r0.q;
        r4 = r4 / r7;
        r4 = (float) r4;
        r1.rLineTo(r2, r4);
        r1 = r0.j;
        r2 = r0.q;
        r2 = -r2;
        r2 = (float) r2;
        r1.rLineTo(r3, r2);
        r1 = r0.j;
        r1.close();
        return;
    L_0x024a:
        if (r1 != r4) goto L_0x028b;
    L_0x024c:
        r1 = r0.j;
        r2 = r0.k;
        r2 = r2.left;
        r4 = r0.f;
        r4 = r4.centerY();
        r5 = r0.q;
        r4 = r4 - r5;
        r5 = r0.n;
        r5 = r5 / r7;
        r4 = r4 + r5;
        r4 = (float) r4;
        r1.moveTo(r2, r4);
        r1 = r0.j;
        r2 = r0.q;
        r2 = (float) r2;
        r1.rLineTo(r3, r2);
        r1 = r0.j;
        r2 = r0.p;
        r2 = -r2;
        r2 = (float) r2;
        r3 = r0.q;
        r3 = -r3;
        r3 = r3 / r7;
        r3 = (float) r3;
        r1.rLineTo(r2, r3);
        r1 = r0.j;
        r2 = r0.p;
        r2 = (float) r2;
        r3 = r0.q;
        r3 = -r3;
        r3 = r3 / r7;
        r3 = (float) r3;
        r1.rLineTo(r2, r3);
        r1 = r0.j;
        r1.close();
    L_0x028b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.albr.onLayout(boolean, int, int, int, int):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int i = this.d;
        if (i == 2 || i == 6) {
            a(canvas);
        }
        float f = (float) this.r;
        canvas.drawRoundRect(this.k, f, f, this.l);
        i = this.d;
        if (i == 1 || i == 5) {
            a(canvas);
        }
        canvas.restore();
    }

    private final Point b() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    private final void a(Canvas canvas) {
        int[] iArr = this.i;
        getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        this.e.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        this.e.getLocationInWindow(iArr);
        int i5 = iArr[0];
        int i6 = iArr[1];
        iArr[0] = (i - i3) + i5;
        iArr[1] = (i2 - i4) + i6;
        canvas.save();
        if (albo.a(this.d)) {
            canvas.translate((float) (this.n - this.i[0]), 0.0f);
        } else {
            int i7 = this.d;
            if (i7 == 5 || i7 == 6) {
                canvas.translate(0.0f, (float) (this.n - this.i[1]));
            }
        }
        canvas.drawPath(this.j, this.l);
        canvas.restore();
    }

    private static int a(int i, int i2, int i3) {
        return Math.min(i3, Math.max(i2, i));
    }
}
