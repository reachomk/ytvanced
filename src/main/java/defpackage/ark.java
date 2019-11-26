package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: ark */
public final class ark extends TouchDelegate {
    private final View a;
    private final Rect b = new Rect();
    private final Rect c = new Rect();
    private final Rect d = new Rect();
    private final int e;
    private boolean f;

    public ark(Rect rect, Rect rect2, View view) {
        super(rect, view);
        this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        a(rect, rect2);
        this.a = view;
    }

    public final void a(Rect rect, Rect rect2) {
        this.b.set(rect);
        this.d.set(rect);
        int i = -this.e;
        this.d.inset(i, i);
        this.c.set(rect2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A:{SYNTHETIC, RETURN} */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
        r7 = this;
        r0 = r8.getX();
        r0 = (int) r0;
        r1 = r8.getY();
        r1 = (int) r1;
        r2 = r8.getAction();
        r3 = 2;
        r4 = 0;
        r5 = 1;
        if (r2 == 0) goto L_0x0030;
    L_0x0013:
        if (r2 == r5) goto L_0x0021;
    L_0x0015:
        if (r2 == r3) goto L_0x0021;
    L_0x0017:
        r6 = 3;
        if (r2 == r6) goto L_0x001c;
    L_0x001a:
        r2 = 0;
        goto L_0x003b;
    L_0x001c:
        r2 = r7.f;
        r7.f = r4;
        goto L_0x003b;
    L_0x0021:
        r2 = r7.f;
        if (r2 == 0) goto L_0x003b;
    L_0x0025:
        r6 = r7.d;
        r6 = r6.contains(r0, r1);
        if (r6 == 0) goto L_0x002e;
    L_0x002d:
        goto L_0x003b;
    L_0x002e:
        r5 = 0;
        goto L_0x003b;
    L_0x0030:
        r2 = r7.b;
        r2 = r2.contains(r0, r1);
        if (r2 == 0) goto L_0x001a;
    L_0x0038:
        r7.f = r5;
        r2 = 1;
    L_0x003b:
        if (r2 != 0) goto L_0x003e;
    L_0x003d:
        goto L_0x0071;
    L_0x003e:
        if (r5 == 0) goto L_0x005c;
    L_0x0040:
        r2 = r7.c;
        r2 = r2.contains(r0, r1);
        if (r2 != 0) goto L_0x005c;
    L_0x0048:
        r0 = r7.a;
        r0 = r0.getWidth();
        r0 = r0 / r3;
        r0 = (float) r0;
        r1 = r7.a;
        r1 = r1.getHeight();
        r1 = r1 / r3;
        r1 = (float) r1;
        r8.setLocation(r0, r1);
        goto L_0x006b;
    L_0x005c:
        r2 = r7.c;
        r2 = r2.left;
        r0 = r0 - r2;
        r0 = (float) r0;
        r2 = r7.c;
        r2 = r2.top;
        r1 = r1 - r2;
        r1 = (float) r1;
        r8.setLocation(r0, r1);
    L_0x006b:
        r0 = r7.a;
        r4 = r0.dispatchTouchEvent(r8);
    L_0x0071:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ark.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
