package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import defpackage.amf;

public class ContentFrameLayout extends FrameLayout {
    public TypedValue a;
    public TypedValue b;
    public TypedValue c;
    public TypedValue d;
    public TypedValue e;
    public TypedValue f;
    public final Rect g;
    public amf h;

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new Rect();
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A:{SYNTHETIC, RETURN} */
    public final void onMeasure(int r17, int r18) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r16.getContext();
        r1 = r1.getResources();
        r1 = r1.getDisplayMetrics();
        r2 = r1.widthPixels;
        r3 = r1.heightPixels;
        r4 = android.view.View.MeasureSpec.getMode(r17);
        r5 = android.view.View.MeasureSpec.getMode(r18);
        r6 = 1;
        r7 = 6;
        r8 = 5;
        r9 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r11 = 0;
        if (r4 == r9) goto L_0x0028;
    L_0x0024:
        r12 = r17;
        r13 = 0;
        goto L_0x0068;
    L_0x0028:
        if (r2 < r3) goto L_0x002d;
    L_0x002a:
        r12 = r0.c;
        goto L_0x002f;
    L_0x002d:
        r12 = r0.d;
    L_0x002f:
        if (r12 == 0) goto L_0x0024;
    L_0x0031:
        r13 = r12.type;
        if (r13 == 0) goto L_0x0024;
    L_0x0035:
        r13 = r12.type;
        if (r13 != r8) goto L_0x003f;
    L_0x0039:
        r12 = r12.getDimension(r1);
    L_0x003d:
        r12 = (int) r12;
        goto L_0x004f;
    L_0x003f:
        r13 = r12.type;
        if (r13 != r7) goto L_0x004e;
    L_0x0043:
        r13 = r1.widthPixels;
        r13 = (float) r13;
        r14 = r1.widthPixels;
        r14 = (float) r14;
        r12 = r12.getFraction(r13, r14);
        goto L_0x003d;
    L_0x004e:
        r12 = 0;
    L_0x004f:
        if (r12 <= 0) goto L_0x0024;
    L_0x0051:
        r13 = r0.g;
        r13 = r13.left;
        r14 = r0.g;
        r14 = r14.right;
        r13 = r13 + r14;
        r12 = r12 - r13;
        r13 = android.view.View.MeasureSpec.getSize(r17);
        r12 = java.lang.Math.min(r12, r13);
        r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r10);
        r13 = 1;
    L_0x0068:
        if (r5 == r9) goto L_0x006b;
    L_0x006a:
        goto L_0x00ab;
    L_0x006b:
        if (r2 < r3) goto L_0x0070;
    L_0x006d:
        r5 = r0.f;
        goto L_0x0072;
    L_0x0070:
        r5 = r0.e;
    L_0x0072:
        if (r5 == 0) goto L_0x00ab;
    L_0x0074:
        r14 = r5.type;
        if (r14 == 0) goto L_0x00ab;
    L_0x0078:
        r14 = r5.type;
        if (r14 != r8) goto L_0x0082;
    L_0x007c:
        r5 = r5.getDimension(r1);
    L_0x0080:
        r5 = (int) r5;
        goto L_0x0092;
    L_0x0082:
        r14 = r5.type;
        if (r14 != r7) goto L_0x0091;
    L_0x0086:
        r14 = r1.heightPixels;
        r14 = (float) r14;
        r15 = r1.heightPixels;
        r15 = (float) r15;
        r5 = r5.getFraction(r14, r15);
        goto L_0x0080;
    L_0x0091:
        r5 = 0;
    L_0x0092:
        if (r5 <= 0) goto L_0x00ab;
    L_0x0094:
        r14 = r0.g;
        r14 = r14.top;
        r15 = r0.g;
        r15 = r15.bottom;
        r14 = r14 + r15;
        r5 = r5 - r14;
        r14 = android.view.View.MeasureSpec.getSize(r18);
        r5 = java.lang.Math.min(r5, r14);
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r10);
        goto L_0x00ad;
    L_0x00ab:
        r5 = r18;
    L_0x00ad:
        super.onMeasure(r12, r5);
        r12 = r16.getMeasuredWidth();
        r14 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r10);
        if (r13 == 0) goto L_0x00bb;
    L_0x00ba:
        goto L_0x00f7;
    L_0x00bb:
        if (r4 != r9) goto L_0x00f7;
    L_0x00bd:
        if (r2 < r3) goto L_0x00c2;
    L_0x00bf:
        r2 = r0.a;
        goto L_0x00c4;
    L_0x00c2:
        r2 = r0.b;
    L_0x00c4:
        if (r2 == 0) goto L_0x00f7;
    L_0x00c6:
        r3 = r2.type;
        if (r3 == 0) goto L_0x00f7;
    L_0x00ca:
        r3 = r2.type;
        if (r3 != r8) goto L_0x00d4;
    L_0x00ce:
        r1 = r2.getDimension(r1);
    L_0x00d2:
        r1 = (int) r1;
        goto L_0x00e4;
    L_0x00d4:
        r3 = r2.type;
        if (r3 != r7) goto L_0x00e3;
    L_0x00d8:
        r3 = r1.widthPixels;
        r3 = (float) r3;
        r1 = r1.widthPixels;
        r1 = (float) r1;
        r1 = r2.getFraction(r3, r1);
        goto L_0x00d2;
    L_0x00e3:
        r1 = 0;
    L_0x00e4:
        if (r1 <= 0) goto L_0x00f0;
    L_0x00e6:
        r2 = r0.g;
        r2 = r2.left;
        r3 = r0.g;
        r3 = r3.right;
        r2 = r2 + r3;
        r1 = r1 - r2;
    L_0x00f0:
        if (r12 >= r1) goto L_0x00f7;
    L_0x00f2:
        r14 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r10);
        r11 = 1;
    L_0x00f7:
        if (r11 == 0) goto L_0x00fc;
    L_0x00f9:
        super.onMeasure(r14, r5);
    L_0x00fc:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        amf amf = this.h;
        if (amf != null) {
            amf.a();
        }
    }
}
