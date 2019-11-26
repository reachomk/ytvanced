package defpackage;

import android.view.MotionEvent;

/* renamed from: ugh */
public final class ugh {
    public MotionEvent a;
    private final ugy b;

    public ugh(ugy ugy) {
        this.b = ugy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    public final boolean a(android.view.MotionEvent r9) {
        /*
        r8 = this;
        r0 = r9.getActionMasked();
        r1 = 3;
        r2 = 1;
        if (r0 == r1) goto L_0x005c;
    L_0x0008:
        r3 = r9.getPointerCount();
        r4 = 5;
        if (r0 != r4) goto L_0x0010;
    L_0x000f:
        goto L_0x0013;
    L_0x0010:
        if (r0 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r3 = r3 + -1;
    L_0x0015:
        r0 = r8.a;
        r5 = 6;
        r6 = 0;
        if (r0 == 0) goto L_0x0030;
    L_0x001b:
        r0 = r0.getActionMasked();
        if (r0 == r1) goto L_0x0030;
    L_0x0021:
        r7 = r8.a;
        r7 = r7.getPointerCount();
        if (r0 != r5) goto L_0x002a;
    L_0x0029:
        goto L_0x002d;
    L_0x002a:
        if (r0 == r2) goto L_0x002d;
    L_0x002c:
        goto L_0x0031;
    L_0x002d:
        r7 = r7 + -1;
        goto L_0x0031;
    L_0x0030:
        r7 = 0;
    L_0x0031:
        if (r7 >= r3) goto L_0x0044;
    L_0x0033:
        if (r7 != 0) goto L_0x0039;
    L_0x0035:
        r8.a(r9, r6);
        r7 = 1;
    L_0x0039:
        if (r7 >= r3) goto L_0x005c;
    L_0x003b:
        r0 = r7 << 8;
        r0 = r0 | r4;
        r8.a(r9, r0);
        r7 = r7 + 1;
        goto L_0x0039;
    L_0x0044:
        if (r7 <= r3) goto L_0x005c;
    L_0x0046:
        r0 = r8.a;
        r4 = java.lang.Math.max(r3, r2);
    L_0x004c:
        if (r7 <= r4) goto L_0x0057;
    L_0x004e:
        r7 = r7 + -1;
        r6 = r7 << 8;
        r6 = r6 | r5;
        r8.a(r0, r6);
        goto L_0x004c;
    L_0x0057:
        if (r3 != 0) goto L_0x005c;
    L_0x0059:
        r8.a(r0, r2);
    L_0x005c:
        r0 = r9.getActionMasked();
        if (r0 == r2) goto L_0x006b;
    L_0x0062:
        if (r0 == r1) goto L_0x006b;
    L_0x0064:
        r0 = android.view.MotionEvent.obtain(r9);
        r8.a = r0;
        goto L_0x006e;
    L_0x006b:
        r8.b();
    L_0x006e:
        r0 = r8.b;
        r9 = r0.a(r9);
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ugh.a(android.view.MotionEvent):boolean");
    }

    private final void a(MotionEvent motionEvent, int i) {
        motionEvent = MotionEvent.obtainNoHistory(motionEvent);
        motionEvent.setAction(i);
        this.b.a(motionEvent);
        motionEvent.recycle();
    }

    public final void a() {
        MotionEvent motionEvent = this.a;
        if (motionEvent != null) {
            motionEvent.setAction(3);
            this.b.a(this.a);
            this.a.recycle();
            this.a = null;
        }
    }

    public final void b() {
        MotionEvent motionEvent = this.a;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.a = null;
        }
    }
}
