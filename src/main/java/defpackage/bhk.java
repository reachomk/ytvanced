package defpackage;

import android.os.Build.VERSION;

/* renamed from: bhk */
final class bhk {
    private static final boolean a = true;
    private static final boolean b = true;
    private static final boolean c = (VERSION.SDK_INT >= 28);

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0108  */
    static android.view.View a(android.view.ViewGroup r16, android.view.View r17, android.view.View r18) {
        /*
        r0 = r16;
        r1 = r17;
        r2 = new android.graphics.Matrix;
        r2.<init>();
        r3 = r18.getScrollX();
        r3 = -r3;
        r3 = (float) r3;
        r4 = r18.getScrollY();
        r4 = -r4;
        r4 = (float) r4;
        r2.setTranslate(r3, r4);
        defpackage.bht.a(r1, r2);
        defpackage.bht.b(r0, r2);
        r3 = new android.graphics.RectF;
        r4 = r17.getWidth();
        r4 = (float) r4;
        r5 = r17.getHeight();
        r5 = (float) r5;
        r6 = 0;
        r3.<init>(r6, r6, r4, r5);
        r2.mapRect(r3);
        r4 = r3.left;
        r4 = java.lang.Math.round(r4);
        r5 = r3.top;
        r5 = java.lang.Math.round(r5);
        r6 = r3.right;
        r6 = java.lang.Math.round(r6);
        r7 = r3.bottom;
        r7 = java.lang.Math.round(r7);
        r8 = new android.widget.ImageView;
        r9 = r17.getContext();
        r8.<init>(r9);
        r9 = android.widget.ImageView.ScaleType.CENTER_CROP;
        r8.setScaleType(r9);
        r9 = a;
        r10 = 0;
        if (r9 == 0) goto L_0x0069;
    L_0x005c:
        r9 = r17.isAttachedToWindow();
        r9 = r9 ^ 1;
        if (r0 == 0) goto L_0x006a;
    L_0x0064:
        r11 = r16.isAttachedToWindow();
        goto L_0x006b;
    L_0x0069:
        r9 = 0;
    L_0x006a:
        r11 = 0;
    L_0x006b:
        r12 = b;
        r13 = 0;
        if (r12 != 0) goto L_0x0073;
    L_0x0070:
        r10 = r13;
        r11 = 0;
        goto L_0x008a;
    L_0x0073:
        if (r9 == 0) goto L_0x0070;
    L_0x0075:
        if (r11 != 0) goto L_0x0079;
    L_0x0077:
        goto L_0x0105;
    L_0x0079:
        r10 = r17.getParent();
        r10 = (android.view.ViewGroup) r10;
        r11 = r10.indexOfChild(r1);
        r12 = r16.getOverlay();
        r12.add(r1);
    L_0x008a:
        r12 = r3.width();
        r12 = java.lang.Math.round(r12);
        r14 = r3.height();
        r14 = java.lang.Math.round(r14);
        if (r12 > 0) goto L_0x009d;
    L_0x009c:
        goto L_0x00f3;
    L_0x009d:
        if (r14 <= 0) goto L_0x00f3;
    L_0x009f:
        r15 = 1233125376; // 0x49800000 float:1048576.0 double:6.092448853E-315;
        r13 = r12 * r14;
        r13 = (float) r13;
        r15 = r15 / r13;
        r13 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r13 = java.lang.Math.min(r13, r15);
        r12 = (float) r12;
        r12 = r12 * r13;
        r12 = java.lang.Math.round(r12);
        r14 = (float) r14;
        r14 = r14 * r13;
        r14 = java.lang.Math.round(r14);
        r15 = r3.left;
        r15 = -r15;
        r3 = r3.top;
        r3 = -r3;
        r2.postTranslate(r15, r3);
        r2.postScale(r13, r13);
        r3 = c;
        if (r3 == 0) goto L_0x00e1;
    L_0x00c9:
        r3 = new android.graphics.Picture;
        r3.<init>();
        r12 = r3.beginRecording(r12, r14);
        r12.concat(r2);
        r1.draw(r12);
        r3.endRecording();
        r2 = android.graphics.Bitmap.createBitmap(r3);
        r13 = r2;
        goto L_0x00f3;
    L_0x00e1:
        r3 = android.graphics.Bitmap.Config.ARGB_8888;
        r3 = android.graphics.Bitmap.createBitmap(r12, r14, r3);
        r12 = new android.graphics.Canvas;
        r12.<init>(r3);
        r12.concat(r2);
        r1.draw(r12);
        r13 = r3;
    L_0x00f3:
        r2 = b;
        if (r2 != 0) goto L_0x00f8;
    L_0x00f7:
        goto L_0x0105;
    L_0x00f8:
        if (r9 != 0) goto L_0x00fb;
    L_0x00fa:
        goto L_0x0105;
    L_0x00fb:
        r0 = r16.getOverlay();
        r0.remove(r1);
        r10.addView(r1, r11);
    L_0x0105:
        if (r13 != 0) goto L_0x0108;
    L_0x0107:
        goto L_0x010b;
    L_0x0108:
        r8.setImageBitmap(r13);
    L_0x010b:
        r0 = r6 - r4;
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1);
        r2 = r7 - r5;
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1);
        r8.measure(r0, r1);
        r8.layout(r4, r5, r6, r7);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhk.a(android.view.ViewGroup, android.view.View, android.view.View):android.view.View");
    }
}
