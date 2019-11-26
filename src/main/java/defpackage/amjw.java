package defpackage;

import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;

/* renamed from: amjw */
public final class amjw implements OnTouchListener {
    public final long a;
    public final View b;
    private final int c;
    private final int d;
    private final int e;
    private final amjz f;
    private int g = 1;
    private float h;
    private float i;
    private boolean j;
    private int k;
    private VelocityTracker l;
    private float m;

    public amjw(View view, amjz amjz) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.c = viewConfiguration.getScaledTouchSlop();
        this.d = viewConfiguration.getScaledMinimumFlingVelocity() << 4;
        this.e = viewConfiguration.getScaledMaximumFlingVelocity();
        this.a = (long) view.getContext().getResources().getInteger(17694720);
        this.b = view;
        this.f = amjz;
    }

    /* JADX WARNING: Missing block: B:54:0x0147, code skipped:
            if (r10.l.getXVelocity() > 0.0f) goto L_0x0156;
     */
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
        r10 = this;
        r11 = r10.m;
        r0 = 0;
        r12.offsetLocation(r11, r0);
        r11 = r10.g;
        r1 = 2;
        if (r11 >= r1) goto L_0x0013;
    L_0x000b:
        r11 = r10.b;
        r11 = r11.getWidth();
        r10.g = r11;
    L_0x0013:
        r11 = r12.getActionMasked();
        r2 = 0;
        if (r11 == 0) goto L_0x01ae;
    L_0x001a:
        r3 = 0;
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = 1;
        if (r11 == r5) goto L_0x00d8;
    L_0x0020:
        r6 = 3;
        if (r11 == r1) goto L_0x0053;
    L_0x0023:
        if (r11 == r6) goto L_0x0027;
    L_0x0025:
        goto L_0x01ad;
    L_0x0027:
        r11 = r10.l;
        if (r11 == 0) goto L_0x01ad;
    L_0x002b:
        r11 = r10.b;
        r11 = r11.animate();
        r11 = r11.translationX(r0);
        r11 = r11.alpha(r4);
        r4 = r10.a;
        r11 = r11.setDuration(r4);
        r11.setListener(r3);
        r11 = r10.l;
        r11.recycle();
        r10.l = r3;
        r10.m = r0;
        r10.h = r0;
        r10.i = r0;
        r10.j = r2;
        goto L_0x01ad;
    L_0x0053:
        r11 = r10.l;
        if (r11 == 0) goto L_0x01ad;
    L_0x0057:
        r11.addMovement(r12);
        r11 = r12.getRawX();
        r1 = r10.h;
        r11 = r11 - r1;
        r1 = r12.getRawY();
        r3 = r10.i;
        r1 = r1 - r3;
        r3 = java.lang.Math.abs(r11);
        r7 = r10.c;
        r7 = (float) r7;
        r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r3 <= 0) goto L_0x00af;
    L_0x0073:
        r1 = java.lang.Math.abs(r1);
        r3 = java.lang.Math.abs(r11);
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = r3 / r7;
        r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r1 >= 0) goto L_0x00af;
    L_0x0082:
        r10.j = r5;
        r1 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1));
        if (r1 > 0) goto L_0x008c;
    L_0x0088:
        r1 = r10.c;
        r1 = -r1;
        goto L_0x008e;
    L_0x008c:
        r1 = r10.c;
    L_0x008e:
        r10.k = r1;
        r1 = r10.b;
        r1 = r1.getParent();
        r1.requestDisallowInterceptTouchEvent(r5);
        r1 = android.view.MotionEvent.obtain(r12);
        r12 = r12.getActionIndex();
        r12 = r12 << 8;
        r12 = r12 | r6;
        r1.setAction(r12);
        r12 = r10.b;
        r12.onTouchEvent(r1);
        r1.recycle();
    L_0x00af:
        r12 = r10.j;
        if (r12 == 0) goto L_0x01ad;
    L_0x00b3:
        r10.m = r11;
        r12 = r10.b;
        r1 = r10.k;
        r1 = (float) r1;
        r1 = r11 - r1;
        r12.setTranslationX(r1);
        r12 = r10.b;
        r11 = java.lang.Math.abs(r11);
        r11 = r11 + r11;
        r1 = r10.g;
        r1 = (float) r1;
        r11 = r11 / r1;
        r11 = r4 - r11;
        r11 = java.lang.Math.min(r4, r11);
        r11 = java.lang.Math.max(r0, r11);
        r12.setAlpha(r11);
        return r5;
    L_0x00d8:
        r11 = r10.l;
        if (r11 == 0) goto L_0x01ad;
    L_0x00dc:
        r11 = r12.getRawX();
        r6 = r10.h;
        r11 = r11 - r6;
        r6 = r10.l;
        r6.addMovement(r12);
        r12 = r10.l;
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r12.computeCurrentVelocity(r6);
        r12 = r10.l;
        r12 = r12.getXVelocity();
        r6 = java.lang.Math.abs(r12);
        r7 = r10.l;
        r7 = r7.getYVelocity();
        r7 = java.lang.Math.abs(r7);
        r8 = java.lang.Math.abs(r11);
        r9 = r10.g;
        r9 = r9 / r1;
        r1 = (float) r9;
        r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1));
        if (r1 > 0) goto L_0x014d;
    L_0x010f:
        r1 = r10.d;
        r1 = (float) r1;
        r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));
        if (r1 > 0) goto L_0x014a;
    L_0x0116:
        r1 = r10.e;
        r1 = (float) r1;
        r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
        if (r1 <= 0) goto L_0x011e;
    L_0x011d:
        goto L_0x014a;
    L_0x011e:
        r1 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1));
        if (r1 >= 0) goto L_0x014a;
    L_0x0122:
        r1 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1));
        if (r1 < 0) goto L_0x0127;
    L_0x0126:
        goto L_0x014a;
    L_0x0127:
        r1 = r10.j;
        if (r1 != 0) goto L_0x012c;
    L_0x012b:
        goto L_0x014a;
    L_0x012c:
        r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1));
        if (r12 < 0) goto L_0x0132;
    L_0x0130:
        r12 = 0;
        goto L_0x0133;
    L_0x0132:
        r12 = 1;
    L_0x0133:
        r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1));
        if (r11 < 0) goto L_0x0139;
    L_0x0137:
        r11 = 0;
        goto L_0x013a;
    L_0x0139:
        r11 = 1;
    L_0x013a:
        if (r12 != r11) goto L_0x013e;
    L_0x013c:
        r11 = 1;
        goto L_0x013f;
    L_0x013e:
        r11 = 0;
    L_0x013f:
        r12 = r10.l;
        r12 = r12.getXVelocity();
        r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1));
        if (r12 <= 0) goto L_0x014b;
    L_0x0149:
        goto L_0x0156;
    L_0x014a:
        r11 = 0;
    L_0x014b:
        r5 = 0;
        goto L_0x0156;
    L_0x014d:
        r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1));
        if (r11 <= 0) goto L_0x0153;
    L_0x0151:
        r11 = 1;
        goto L_0x0154;
    L_0x0153:
        r11 = 0;
    L_0x0154:
        r5 = r11;
        r11 = 1;
    L_0x0156:
        if (r11 == 0) goto L_0x0183;
    L_0x0158:
        r11 = r10.f;
        r11.b();
        r11 = r10.b;
        r11 = r11.animate();
        if (r5 != 0) goto L_0x0169;
    L_0x0165:
        r12 = r10.g;
        r12 = -r12;
        goto L_0x016b;
    L_0x0169:
        r12 = r10.g;
    L_0x016b:
        r12 = (float) r12;
        r11 = r11.translationX(r12);
        r11 = r11.alpha(r0);
        r4 = r10.a;
        r11 = r11.setDuration(r4);
        r12 = new amjv;
        r12.<init>(r10);
        r11.setListener(r12);
        goto L_0x019e;
    L_0x0183:
        r11 = r10.j;
        if (r11 == 0) goto L_0x019e;
    L_0x0187:
        r11 = r10.b;
        r11 = r11.animate();
        r11 = r11.translationX(r0);
        r11 = r11.alpha(r4);
        r4 = r10.a;
        r11 = r11.setDuration(r4);
        r11.setListener(r3);
    L_0x019e:
        r11 = r10.l;
        r11.recycle();
        r10.l = r3;
        r10.m = r0;
        r10.h = r0;
        r10.i = r0;
        r10.j = r2;
    L_0x01ad:
        return r2;
    L_0x01ae:
        r11 = r12.getRawX();
        r10.h = r11;
        r11 = r12.getRawY();
        r10.i = r11;
        r11 = r10.f;
        r11.a();
        r11 = android.view.VelocityTracker.obtain();
        r10.l = r11;
        r11 = r10.l;
        r11.addMovement(r12);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amjw.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
