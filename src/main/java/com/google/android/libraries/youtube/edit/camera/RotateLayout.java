package com.google.android.libraries.youtube.edit.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class RotateLayout extends ViewGroup {
    public int a;
    private View b;

    public RotateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundResource(17170445);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        this.b = getChildAt(0);
        this.b.setPivotX(0.0f);
        this.b.setPivotY(0.0f);
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Missing block: B:7:0x0011, code skipped:
            if (r1 != 270) goto L_0x001f;
     */
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        /*
        r0 = this;
        r4 = r4 - r2;
        r5 = r5 - r3;
        r1 = r0.a;
        r2 = 0;
        if (r1 == 0) goto L_0x001a;
    L_0x0007:
        r3 = 90;
        if (r1 == r3) goto L_0x0014;
    L_0x000b:
        r3 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        if (r1 == r3) goto L_0x001a;
    L_0x000f:
        r3 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        if (r1 == r3) goto L_0x0014;
    L_0x0013:
        goto L_0x001f;
    L_0x0014:
        r1 = r0.b;
        r1.layout(r2, r2, r5, r4);
        return;
    L_0x001a:
        r1 = r0.b;
        r1.layout(r2, r2, r4, r5);
    L_0x001f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.edit.camera.RotateLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006a  */
    public final void onMeasure(int r6, int r7) {
        /*
        r5 = this;
        r0 = r5.a;
        r1 = 0;
        r2 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        r3 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        r4 = 90;
        if (r0 == 0) goto L_0x0025;
    L_0x000b:
        if (r0 == r4) goto L_0x0013;
    L_0x000d:
        if (r0 == r3) goto L_0x0025;
    L_0x000f:
        if (r0 == r2) goto L_0x0013;
    L_0x0011:
        r6 = 0;
        goto L_0x0036;
    L_0x0013:
        r0 = r5.b;
        r5.measureChild(r0, r7, r6);
        r6 = r5.b;
        r1 = r6.getMeasuredHeight();
        r6 = r5.b;
        r6 = r6.getMeasuredWidth();
        goto L_0x0036;
    L_0x0025:
        r0 = r5.b;
        r5.measureChild(r0, r6, r7);
        r6 = r5.b;
        r1 = r6.getMeasuredWidth();
        r6 = r5.b;
        r6 = r6.getMeasuredHeight();
    L_0x0036:
        r5.setMeasuredDimension(r1, r6);
        r7 = r5.a;
        r0 = 0;
        if (r7 == 0) goto L_0x006a;
    L_0x003e:
        if (r7 == r4) goto L_0x005e;
    L_0x0040:
        if (r7 == r3) goto L_0x0051;
    L_0x0042:
        if (r7 == r2) goto L_0x0045;
    L_0x0044:
        goto L_0x0074;
    L_0x0045:
        r6 = r5.b;
        r7 = (float) r1;
        r6.setTranslationX(r7);
        r6 = r5.b;
        r6.setTranslationY(r0);
        goto L_0x0074;
    L_0x0051:
        r7 = r5.b;
        r0 = (float) r1;
        r7.setTranslationX(r0);
        r7 = r5.b;
        r6 = (float) r6;
        r7.setTranslationY(r6);
        goto L_0x0074;
    L_0x005e:
        r7 = r5.b;
        r7.setTranslationX(r0);
        r7 = r5.b;
        r6 = (float) r6;
        r7.setTranslationY(r6);
        goto L_0x0074;
    L_0x006a:
        r6 = r5.b;
        r6.setTranslationX(r0);
        r6 = r5.b;
        r6.setTranslationY(r0);
    L_0x0074:
        r6 = r5.b;
        r7 = r5.a;
        r7 = -r7;
        r7 = (float) r7;
        r6.setRotation(r7);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.edit.camera.RotateLayout.onMeasure(int, int):void");
    }
}
