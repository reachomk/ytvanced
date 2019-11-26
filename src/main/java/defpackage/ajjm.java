package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.Editable.Factory;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.youtube.R;

/* renamed from: ajjm */
public final class ajjm extends View {
    public Alignment a;
    private final TextPaint b = new TextPaint();
    private final TextPaint c;
    private final TextPaint d;
    private final Path e;
    private StaticLayout f;
    private StaticLayout g;
    private final Editable h;
    private int i;
    private int j;
    private float k;

    public ajjm(Context context) {
        super(context);
        setLayerType(1, null);
        this.b.setAntiAlias(true);
        this.b.setStyle(Style.FILL);
        this.c = new TextPaint();
        this.c.setAntiAlias(true);
        this.c.setColor(0);
        this.c.setStyle(Style.STROKE);
        this.d = new TextPaint();
        this.d.setAntiAlias(true);
        this.e = new Path();
        this.h = Factory.getInstance().newEditable("");
        this.a = Alignment.ALIGN_CENTER;
        this.k = this.b.getTextSize() * 0.0625f;
        setId(R.id.subtitle_window_identifier);
    }

    public final void setBackgroundColor(int i) {
        this.j = i;
        this.d.setColor(i);
        invalidate();
    }

    public final void a(CharSequence charSequence) {
        this.h.clear();
        this.h.append(charSequence);
        setContentDescription(charSequence);
        this.f = null;
        this.g = null;
        requestLayout();
        invalidate();
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.h);
    }

    public final void a(int i) {
        this.b.setColor(i);
        invalidate();
    }

    public final void a(float f) {
        f = TypedValue.applyDimension(2, f, getResources().getDisplayMetrics());
        this.b.setTextSize(f);
        this.k = 0.0625f * f;
        this.c.setTextSize(f);
        this.c.setStrokeWidth(this.k);
        c(this.i);
        this.g = null;
        this.f = null;
        requestLayout();
        invalidate();
    }

    public final void a(Typeface typeface) {
        this.b.setTypeface(typeface);
        this.c.setTypeface(typeface);
        this.d.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public final void b(int i) {
        this.c.setColor(i);
        invalidate();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Missing block: B:4:0x000c, code skipped:
            if (r0 != 5) goto L_0x001b;
     */
    public final void c(int r9) {
        /*
        r8 = this;
        r0 = r8.i;
        r1 = 5;
        r2 = 4;
        r3 = 2;
        r4 = 3;
        if (r0 == r3) goto L_0x0016;
    L_0x0008:
        if (r0 == r4) goto L_0x000f;
    L_0x000a:
        if (r0 == r2) goto L_0x000f;
    L_0x000c:
        if (r0 == r1) goto L_0x0016;
    L_0x000e:
        goto L_0x001b;
    L_0x000f:
        r0 = r8.b;
        r5 = 0;
        r0.setMaskFilter(r5);
        goto L_0x001b;
    L_0x0016:
        r0 = r8.b;
        r0.clearShadowLayer();
    L_0x001b:
        r0 = 0;
        if (r9 == 0) goto L_0x0085;
    L_0x001e:
        r5 = 1;
        if (r9 == r5) goto L_0x0085;
    L_0x0021:
        if (r9 == r3) goto L_0x0078;
    L_0x0023:
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r6 = 1091567616; // 0x41100000 float:9.0 double:5.39306059E-315;
        r7 = 0;
        if (r9 == r4) goto L_0x0068;
    L_0x002a:
        if (r9 == r2) goto L_0x0058;
    L_0x002c:
        if (r9 == r1) goto L_0x0038;
    L_0x002e:
        r1 = new java.lang.Object[r5];
        r9 = java.lang.Integer.valueOf(r9);
        r1[r0] = r9;
        r9 = 0;
        goto L_0x0085;
    L_0x0038:
        r0 = r8.getResources();
        r1 = r8.b;
        r2 = 2131626874; // 0x7f0e0b7a float:1.8880997E38 double:1.053163608E-314;
        r2 = r0.getDimensionPixelSize(r2);
        r2 = (float) r2;
        r3 = 2131626875; // 0x7f0e0b7b float:1.8880999E38 double:1.0531636087E-314;
        r0 = r0.getDimensionPixelSize(r3);
        r0 = (float) r0;
        r3 = r8.c;
        r3 = r3.getColor();
        r1.setShadowLayer(r2, r7, r0, r3);
        goto L_0x0085;
    L_0x0058:
        r0 = r8.b;
        r1 = new android.graphics.EmbossMaskFilter;
        r2 = new float[r4];
        r2 = {-1082130432, -1082130432, 1065353216};
        r1.<init>(r2, r7, r6, r3);
        r0.setMaskFilter(r1);
        goto L_0x0085;
    L_0x0068:
        r0 = r8.b;
        r1 = new android.graphics.EmbossMaskFilter;
        r2 = new float[r4];
        r2 = {1065353216, 1065353216, 1065353216};
        r1.<init>(r2, r7, r6, r3);
        r0.setMaskFilter(r1);
        goto L_0x0085;
    L_0x0078:
        r0 = r8.b;
        r1 = r8.k;
        r2 = r8.c;
        r2 = r2.getColor();
        r0.setShadowLayer(r1, r1, r1, r2);
    L_0x0085:
        r8.i = r9;
        r8.requestLayout();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajjm.c(int):void");
    }

    public final void a() {
        this.g = null;
        this.f = null;
        requestLayout();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        this.f = d(i);
        this.g = e(i);
        i = MeasureSpec.getMode(i);
        if (i == aocf.UNSET_ENUM_VALUE) {
            size = Math.min(size, b());
        } else if (i != 1073741824) {
            size = b();
        }
        i = MeasureSpec.getMode(i2);
        if (i == aocf.UNSET_ENUM_VALUE) {
            size2 = Math.min(size2, c());
        } else if (i != 1073741824) {
            size2 = c();
        }
        setMeasuredDimension(size, size2);
    }

    private final StaticLayout d(int i) {
        StaticLayout staticLayout = this.f;
        int a = a(this.h, i);
        if (staticLayout == null || a != staticLayout.getWidth()) {
            return new StaticLayout(this.h, this.b, a, this.a, 1.0f, 0.0f, true);
        }
        return staticLayout;
    }

    private final StaticLayout e(int i) {
        StaticLayout staticLayout = this.g;
        int a = a(this.h, i);
        if (staticLayout != null && a == staticLayout.getWidth()) {
            return staticLayout;
        }
        SpannableString spannableString = new SpannableString(this.h);
        int i2 = 0;
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableString.getSpans(0, spannableString.length(), ForegroundColorSpan.class);
        int length = foregroundColorSpanArr.length;
        while (i2 < length) {
            spannableString.removeSpan(foregroundColorSpanArr[i2]);
            i2++;
        }
        return new StaticLayout(spannableString, this.c, a, this.a, 1.0f, 0.0f, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    private final int a(java.lang.CharSequence r6, int r7) {
        /*
        r5 = this;
        r0 = android.view.View.MeasureSpec.getMode(r7);
        r7 = android.view.View.MeasureSpec.getSize(r7);
        r1 = r5.getPaddingLeft();
        r2 = r5.getPaddingRight();
        r1 = r1 + r2;
        r2 = r5.i;
        if (r2 == 0) goto L_0x0041;
    L_0x0015:
        r3 = 1;
        if (r2 == r3) goto L_0x003a;
    L_0x0018:
        r4 = 2;
        if (r2 == r4) goto L_0x0041;
    L_0x001b:
        r4 = 3;
        if (r2 == r4) goto L_0x0041;
    L_0x001e:
        r4 = 4;
        if (r2 == r4) goto L_0x0041;
    L_0x0021:
        r4 = 5;
        if (r2 != r4) goto L_0x0025;
    L_0x0024:
        goto L_0x0041;
    L_0x0025:
        r6 = new java.lang.IllegalStateException;
        r7 = new java.lang.Object[r3];
        r0 = 0;
        r1 = java.lang.Integer.valueOf(r2);
        r7[r0] = r1;
        r0 = "Edge type %d is not supported.";
        r7 = java.lang.String.format(r0, r7);
        r6.<init>(r7);
        throw r6;
    L_0x003a:
        r2 = r5.c;
        r6 = android.text.Layout.getDesiredWidth(r6, r2);
        goto L_0x0047;
    L_0x0041:
        r2 = r5.b;
        r6 = android.text.Layout.getDesiredWidth(r6, r2);
    L_0x0047:
        r6 = (int) r6;
        r6 = r6 + r1;
        if (r0 == 0) goto L_0x0055;
    L_0x004b:
        r1 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r0 != r1) goto L_0x0054;
    L_0x004f:
        r6 = java.lang.Math.min(r6, r7);
        return r6;
    L_0x0054:
        return r7;
    L_0x0055:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajjm.a(java.lang.CharSequence, int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e A:{LOOP_END, LOOP:0: B:17:0x003c->B:18:0x003e} */
    private final int b() {
        /*
        r6 = this;
        r0 = r6.getPaddingRight();
        r1 = r6.getPaddingLeft();
        r0 = r0 + r1;
        r1 = r6.i;
        r2 = 0;
        if (r1 == 0) goto L_0x0035;
    L_0x000e:
        r3 = 1;
        if (r1 == r3) goto L_0x0032;
    L_0x0011:
        r4 = 2;
        if (r1 == r4) goto L_0x0035;
    L_0x0014:
        r4 = 3;
        if (r1 == r4) goto L_0x0035;
    L_0x0017:
        r4 = 4;
        if (r1 == r4) goto L_0x0035;
    L_0x001a:
        r4 = 5;
        if (r1 != r4) goto L_0x001e;
    L_0x001d:
        goto L_0x0035;
    L_0x001e:
        r0 = new java.lang.IllegalStateException;
        r3 = new java.lang.Object[r3];
        r1 = java.lang.Integer.valueOf(r1);
        r3[r2] = r1;
        r1 = "Edge type %d is not supported.";
        r1 = java.lang.String.format(r1, r3);
        r0.<init>(r1);
        throw r0;
    L_0x0032:
        r1 = r6.g;
        goto L_0x0037;
    L_0x0035:
        r1 = r6.f;
    L_0x0037:
        r3 = r1.getLineCount();
        r4 = 0;
    L_0x003c:
        if (r2 >= r3) goto L_0x004a;
    L_0x003e:
        r5 = r1.getLineMax(r2);
        r5 = (int) r5;
        r4 = java.lang.Math.max(r5, r4);
        r2 = r2 + 1;
        goto L_0x003c;
    L_0x004a:
        r4 = r4 + r0;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajjm.b():int");
    }

    private final int c() {
        int i = this.i;
        if (i != 0) {
            if (i == 1) {
                amqw.a(this.g);
                return this.g.getHeight();
            } else if (!(i == 2 || i == 3 || i == 4 || i == 5)) {
                throw new IllegalStateException(String.format("Edge type %d is not supported.", new Object[]{Integer.valueOf(i)}));
            }
        }
        amqw.a(this.f);
        return this.f.getHeight();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i3 - i, 1073741824);
        this.f = d(makeMeasureSpec);
        this.g = e(makeMeasureSpec);
        StaticLayout staticLayout = this.f;
        i = staticLayout.getLineCount();
        RectF rectF = new RectF();
        this.e.reset();
        for (i3 = 0; i3 < i; i3++) {
            i4 = staticLayout.getLineBottom(i3);
            int lineTop = staticLayout.getLineTop(i3);
            rectF.set(staticLayout.getLineLeft(i3) - ((float) getPaddingLeft()), (float) lineTop, staticLayout.getLineRight(i3) + ((float) getPaddingRight()), (float) i4);
            this.e.addRect(rectF, Direction.CCW);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        if (!TextUtils.isEmpty(this.h) && this.g != null && this.f != null) {
            if (Color.alpha(this.j) != 0) {
                canvas.drawPath(this.e, this.d);
            }
            if (this.i == 1) {
                this.g.draw(canvas);
            }
            this.f.draw(canvas);
        }
    }
}
