package com.google.android.apps.youtube.app.extensions.reel.watch.overlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import defpackage.gpm;
import defpackage.gpn;

public class ReelPlayerProgressPresenter extends View {
    public int a;
    public int b;
    public int c;
    public volatile long d;
    public volatile float e;
    public volatile float f;
    public volatile long g;
    public volatile long h;
    public long i;
    public int j;
    public float k;
    public final float[] l;
    public final float[] m;
    public final float[] n;
    public final float[] o;
    public final float[] p;
    public final float[] q;
    public boolean r;
    public final Paint s;
    public final Paint t;
    public final Paint u;
    public final RectF v;
    private volatile boolean w;
    private long x;
    private final Runnable y;
    private RectF z;

    public ReelPlayerProgressPresenter(Context context) {
        super(context);
        this.d = 0;
        this.w = true;
        this.x = -1;
        this.l = new float[14];
        this.m = new float[14];
        this.n = new float[14];
        this.o = new float[14];
        this.p = new float[14];
        this.q = new float[14];
        this.r = true;
        this.s = new Paint(1);
        this.t = new Paint(1);
        this.u = new Paint(1);
        this.v = new RectF();
        this.y = new gpn(this);
    }

    public ReelPlayerProgressPresenter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        this.w = true;
        this.x = -1;
        this.l = new float[14];
        this.m = new float[14];
        this.n = new float[14];
        this.o = new float[14];
        this.p = new float[14];
        this.q = new float[14];
        this.r = true;
        this.s = new Paint(1);
        this.t = new Paint(1);
        this.u = new Paint(1);
        this.v = new RectF();
        this.y = new gpm(this);
    }

    public final void a(boolean z) {
        if (this.w && !z) {
            this.h = SystemClock.elapsedRealtime();
        }
        this.w = z;
        a();
    }

    public static float a(DisplayMetrics displayMetrics, float f) {
        return TypedValue.applyDimension(1, f, displayMetrics);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007a  */
    public final void a() {
        /*
        r10 = this;
        r0 = defpackage.abe.H(r10);
        if (r0 == 0) goto L_0x007f;
    L_0x0006:
        r0 = r10.getVisibility();
        if (r0 != 0) goto L_0x007f;
    L_0x000c:
        r0 = r10.g;
        r2 = 1;
        r3 = 0;
        r4 = 0;
        r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r6 <= 0) goto L_0x0045;
    L_0x0016:
        r0 = r10.h;
        r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r6 <= 0) goto L_0x0045;
    L_0x001c:
        r0 = r10.w;
        if (r0 != 0) goto L_0x0045;
    L_0x0020:
        r0 = r10.h;
        r6 = android.os.SystemClock.elapsedRealtime();
        r10.h = r6;
        r6 = r10.h;
        r8 = r10.i;
        r6 = r6 - r0;
        r8 = r8 + r6;
        r10.i = r8;
        r0 = r10.g;
        r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
        if (r6 > 0) goto L_0x0041;
    L_0x0036:
        r0 = r10.i;
        r0 = (float) r0;
        r6 = r10.g;
        r1 = (float) r6;
        r0 = r0 / r1;
        r10.f = r0;
        r3 = 1;
        goto L_0x0045;
    L_0x0041:
        r10.g = r4;
        r10.w = r2;
    L_0x0045:
        r0 = r10.d;
        r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r2 > 0) goto L_0x004c;
    L_0x004b:
        goto L_0x006f;
    L_0x004c:
        r0 = android.os.SystemClock.elapsedRealtime();
        r6 = r10.d;
        r0 = r0 - r6;
        r6 = r10.x;
        r2 = 0;
        r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r8 != 0) goto L_0x005d;
    L_0x005a:
        r10.e = r2;
        goto L_0x0065;
    L_0x005d:
        r8 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = (float) r0;
        r1 = (float) r6;
        r0 = r0 / r1;
        r8 = r8 - r0;
        r10.e = r8;
    L_0x0065:
        r0 = r10.e;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x0071;
    L_0x006b:
        r10.e = r2;
        r10.d = r4;
    L_0x006f:
        if (r3 == 0) goto L_0x007f;
    L_0x0071:
        r10.postInvalidateOnAnimation();
        r0 = r10.x;
        r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r2 == 0) goto L_0x007f;
    L_0x007a:
        r0 = r10.y;
        r10.postOnAnimation(r0);
    L_0x007f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.extensions.reel.watch.overlay.ReelPlayerProgressPresenter.a():void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.a > 0) {
            float f = this.v.top;
            float f2 = this.v.bottom;
            int i = 0;
            while (true) {
                float[] fArr = this.l;
                if (i < fArr.length) {
                    float f3 = fArr[i];
                    float f4 = this.m[i];
                    if (f4 > f3) {
                        Paint paint;
                        if (this.e > 0.0f) {
                            f3 -= this.e * this.p[i];
                            f4 -= this.e * this.q[i];
                        }
                        float f5 = f3;
                        float f6 = f4;
                        int i2 = this.c;
                        if (i < i2) {
                            paint = this.u;
                        } else if (i != i2) {
                            paint = this.s;
                        } else {
                            paint = this.t;
                        }
                        a(canvas, f5, f, f6, f2, paint);
                        if (i == this.c && this.f > 0.0f) {
                            try {
                                canvas.save();
                                float f7 = f5 + (this.f * (f6 - f5));
                                canvas.clipRect(f5, f, f7, f2);
                                a(canvas, f5, f, f7, f2, this.u);
                            } finally {
                                canvas.restore();
                            }
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void b() {
        if (this.x < 0) {
            try {
                this.x = (long) (System.getFloat(getContext().getContentResolver(), "animator_duration_scale") * 500.0f);
            } catch (SettingNotFoundException unused) {
                this.x = 500;
            }
        }
    }

    private final void a(Canvas canvas, float f, float f2, float f3, float f4, Paint paint) {
        if (VERSION.SDK_INT >= 21) {
            float f5 = this.k;
            canvas.drawRoundRect(f, f2, f3, f4, f5, f5, paint);
            return;
        }
        if (this.z == null) {
            this.z = new RectF();
        }
        RectF rectF = this.z;
        rectF.left = f;
        rectF.top = f2;
        rectF.right = f3;
        rectF.bottom = f4;
        float f6 = this.k;
        Canvas canvas2 = canvas;
        canvas.drawRoundRect(rectF, f6, f6, paint);
    }
}
