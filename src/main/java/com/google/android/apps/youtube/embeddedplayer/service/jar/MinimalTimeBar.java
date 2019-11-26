package com.google.android.apps.youtube.embeddedplayer.service.jar;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.aicd;
import defpackage.mue;
import defpackage.mvk;

public class MinimalTimeBar extends View {
    private final mue a = new mue(getResources());

    public MinimalTimeBar(Context context) {
        super(context);
    }

    public MinimalTimeBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(aicd aicd) {
        int[] iArr;
        if (aicd == aicd.i) {
            iArr = mvk.b;
        } else if (aicd == aicd.k) {
            iArr = mvk.c;
        } else {
            iArr = mvk.a;
        }
        this.a.setState(iArr);
        invalidate();
    }

    public final void a(long j, long j2, long j3) {
        int i = 0;
        int i2 = j2 > 0 ? (int) ((j * 100) / j2) : 0;
        if (j2 > 0) {
            i = (int) ((j3 * 100) / j2);
        }
        this.a.setLevel((i * 1000) + i2);
        invalidate();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(getDefaultSize(0, i), resolveSize(this.a.getIntrinsicHeight(), i2));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.setBounds(0, 0, i, i2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.draw(canvas);
    }
}
