package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import com.facebook.litho.ComponentHost;

/* renamed from: crq */
public final class crq extends TouchDelegate {
    public static final aab a = new aab(4);
    private static final Rect d = new Rect();
    public final aaf b = new aaf();
    public aaf c;

    public crq(ComponentHost componentHost) {
        super(d, componentHost);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
        r9 = this;
        r0 = r9.b;
        r0 = r0.c();
    L_0x0006:
        r0 = r0 + -1;
        r1 = 0;
        if (r0 < 0) goto L_0x0081;
    L_0x000b:
        r2 = r9.b;
        r2 = r2.e(r0);
        r2 = (defpackage.crp) r2;
        r3 = r10.getX();
        r3 = (int) r3;
        r4 = r10.getY();
        r4 = (int) r4;
        r5 = r10.getAction();
        r6 = 2;
        r7 = 1;
        if (r5 == 0) goto L_0x004e;
    L_0x0025:
        if (r5 == r7) goto L_0x0034;
    L_0x0027:
        if (r5 == r6) goto L_0x0034;
    L_0x0029:
        r3 = 3;
        if (r5 == r3) goto L_0x002e;
    L_0x002c:
        r3 = 1;
        goto L_0x0057;
    L_0x002e:
        r3 = r2.c;
        r2.c = r1;
        r1 = r3;
        goto L_0x002c;
    L_0x0034:
        r5 = r2.c;
        if (r5 == 0) goto L_0x0043;
    L_0x0038:
        r8 = r2.f;
        r3 = r8.contains(r3, r4);
        if (r3 == 0) goto L_0x0041;
    L_0x0040:
        goto L_0x0043;
    L_0x0041:
        r3 = 0;
        goto L_0x0044;
    L_0x0043:
        r3 = 1;
    L_0x0044:
        r4 = r10.getAction();
        if (r4 != r7) goto L_0x004c;
    L_0x004a:
        r2.c = r1;
    L_0x004c:
        r1 = r5;
        goto L_0x0057;
    L_0x004e:
        r1 = r2.e;
        r1 = r1.contains(r3, r4);
        r2.c = r1;
        goto L_0x002c;
    L_0x0057:
        if (r1 != 0) goto L_0x005a;
    L_0x0059:
        goto L_0x0006;
    L_0x005a:
        if (r3 == 0) goto L_0x0070;
    L_0x005c:
        r1 = r2.b;
        r1 = r1.getWidth();
        r1 = r1 / r6;
        r1 = (float) r1;
        r3 = r2.b;
        r3 = r3.getHeight();
        r3 = r3 / r6;
        r3 = (float) r3;
        r10.setLocation(r1, r3);
        goto L_0x0078;
    L_0x0070:
        r1 = r2.d;
        r1 = r1 + r1;
        r1 = -r1;
        r1 = (float) r1;
        r10.setLocation(r1, r1);
    L_0x0078:
        r1 = r2.b;
        r1 = r1.dispatchTouchEvent(r10);
        if (r1 == 0) goto L_0x0006;
    L_0x0080:
        return r7;
    L_0x0081:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crq.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
