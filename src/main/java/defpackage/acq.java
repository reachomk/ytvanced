package defpackage;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: acq */
public abstract class acq implements OnTouchListener {
    private static final int q = ViewConfiguration.getTapTimeout();
    public final act a = new act();
    public final View b;
    public boolean c;
    public boolean d;
    public boolean e;
    private final Interpolator f = new AccelerateInterpolator();
    private Runnable g;
    private final float[] h = new float[]{0.0f, 0.0f};
    private final float[] i = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    private final int j;
    private final int k;
    private final float[] l = new float[]{0.0f, 0.0f};
    private final float[] m = new float[]{0.0f, 0.0f};
    private final float[] n = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    private boolean o;
    private boolean p;

    public acq(View view) {
        this.b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float f = displayMetrics.density;
        float f2 = displayMetrics.density;
        float[] fArr = this.n;
        f = ((float) ((int) ((f * 1575.0f) + 0.5f))) / 1000.0f;
        fArr[0] = f;
        fArr[1] = f;
        float[] fArr2 = this.m;
        f2 = ((float) ((int) ((f2 * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f2;
        fArr2[1] = f2;
        this.j = 1;
        float[] fArr3 = this.i;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        fArr3 = this.h;
        fArr3[0] = 0.2f;
        fArr3[1] = 0.2f;
        fArr3 = this.l;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.k = q;
        act act = this.a;
        act.a = 500;
        act.b = 500;
    }

    static float a(float f, float f2, float f3) {
        return f <= f3 ? f >= f2 ? f : f2 : f3;
    }

    public abstract void a(int i);

    public abstract boolean b();

    public abstract boolean b(int i);

    public final acq a(boolean z) {
        if (this.p && !z) {
            c();
        }
        this.p = z;
        return this;
    }

    /* JADX WARNING: Missing block: B:8:0x0012, code skipped:
            if (r0 != 3) goto L_0x007c;
     */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
        r5 = this;
        r0 = r5.p;
        r1 = 0;
        if (r0 == 0) goto L_0x007c;
    L_0x0005:
        r0 = r7.getActionMasked();
        r2 = 1;
        if (r0 == 0) goto L_0x0019;
    L_0x000c:
        if (r0 == r2) goto L_0x0015;
    L_0x000e:
        r3 = 2;
        if (r0 == r3) goto L_0x001d;
    L_0x0011:
        r6 = 3;
        if (r0 == r6) goto L_0x0015;
    L_0x0014:
        goto L_0x007c;
    L_0x0015:
        r5.c();
        goto L_0x007c;
    L_0x0019:
        r5.d = r2;
        r5.o = r1;
    L_0x001d:
        r0 = r7.getX();
        r3 = r6.getWidth();
        r4 = r5.b;
        r4 = r4.getWidth();
        r3 = (float) r3;
        r4 = (float) r4;
        r0 = r5.a(r1, r0, r3, r4);
        r7 = r7.getY();
        r6 = r6.getHeight();
        r3 = r5.b;
        r3 = r3.getHeight();
        r6 = (float) r6;
        r3 = (float) r3;
        r6 = r5.a(r2, r7, r6, r3);
        r7 = r5.a;
        r7.c = r0;
        r7.d = r6;
        r6 = r5.e;
        if (r6 != 0) goto L_0x007c;
    L_0x004f:
        r6 = r5.a();
        if (r6 == 0) goto L_0x007c;
    L_0x0055:
        r6 = r5.g;
        if (r6 != 0) goto L_0x0060;
    L_0x0059:
        r6 = new acs;
        r6.<init>(r5);
        r5.g = r6;
    L_0x0060:
        r5.e = r2;
        r5.c = r2;
        r6 = r5.o;
        if (r6 != 0) goto L_0x0075;
    L_0x0068:
        r6 = r5.k;
        if (r6 <= 0) goto L_0x0075;
    L_0x006c:
        r7 = r5.b;
        r0 = r5.g;
        r3 = (long) r6;
        defpackage.abe.a(r7, r0, r3);
        goto L_0x007a;
    L_0x0075:
        r6 = r5.g;
        r6.run();
    L_0x007a:
        r5.o = r2;
    L_0x007c:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acq.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        act act = this.a;
        float f = act.d;
        int abs = (int) (f / Math.abs(f));
        float f2 = act.c;
        int abs2 = (int) (f2 / Math.abs(f2));
        boolean z = false;
        if (abs != 0 && b(abs)) {
            z = true;
        } else if (abs2 != 0) {
            b();
            return false;
        }
        return z;
    }

    private final void c() {
        int i = 0;
        if (this.c) {
            this.e = false;
            return;
        }
        act act = this.a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - act.e);
        int i3 = act.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        act.k = i;
        act.j = act.a(currentAnimationTimeMillis);
        act.i = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003e  */
    private final float a(int r4, float r5, float r6, float r7) {
        /*
        r3 = this;
        r0 = r3.h;
        r0 = r0[r4];
        r0 = r0 * r6;
        r1 = r3.i;
        r1 = r1[r4];
        r2 = 0;
        r0 = defpackage.acq.a(r0, r2, r1);
        r1 = r3.a(r5, r0);
        r6 = r6 - r5;
        r5 = r3.a(r6, r0);
        r5 = r5 - r1;
        r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r6 >= 0) goto L_0x0026;
    L_0x001d:
        r6 = r3.f;
        r5 = -r5;
        r5 = r6.getInterpolation(r5);
        r5 = -r5;
        goto L_0x0030;
    L_0x0026:
        r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r6 <= 0) goto L_0x0039;
    L_0x002a:
        r6 = r3.f;
        r5 = r6.getInterpolation(r5);
    L_0x0030:
        r6 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = defpackage.acq.a(r5, r6, r0);
        goto L_0x003a;
    L_0x0039:
        r5 = 0;
    L_0x003a:
        r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r6 == 0) goto L_0x0060;
    L_0x003e:
        r6 = r3.l;
        r6 = r6[r4];
        r0 = r3.m;
        r0 = r0[r4];
        r1 = r3.n;
        r4 = r1[r4];
        r6 = r6 * r7;
        r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r7 <= 0) goto L_0x0057;
    L_0x0050:
        r5 = r5 * r6;
        r4 = defpackage.acq.a(r5, r0, r4);
        return r4;
    L_0x0057:
        r5 = -r5;
        r5 = r5 * r6;
        r4 = defpackage.acq.a(r5, r0, r4);
        r4 = -r4;
        return r4;
    L_0x0060:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acq.a(int, float, float, float):float");
    }

    private final float a(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.j;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    return (this.e && i == 1) ? 1.0f : 0.0f;
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
    }
}
