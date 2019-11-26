package defpackage;

import android.view.View;
import android.view.ViewConfiguration;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: hze */
public final class hze extends xqo implements aimg {
    private final Set a = Collections.newSetFromMap(new WeakHashMap());
    private final int b;
    private boolean d;
    private boolean e = true;
    private float f;
    private float g;

    public hze(ViewConfiguration viewConfiguration) {
        this.b = viewConfiguration.getScaledTouchSlop();
    }

    public final void a(aimf aimf) {
        this.a.add(aimf);
    }

    public final void a() {
        a(null, false);
        this.e = true;
    }

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (r3 != 3) goto L_0x008a;
     */
    public final boolean a(android.view.View r7, android.view.MotionEvent r8) {
        /*
        r6 = this;
        r0 = r8.getX();
        r1 = r6.f;
        r0 = r0 - r1;
        r0 = java.lang.Math.abs(r0);
        r1 = r8.getY();
        r2 = r6.g;
        r1 = r1 - r2;
        r2 = java.lang.Math.abs(r1);
        r3 = r8.getPointerCount();
        r4 = 0;
        r5 = 1;
        if (r3 <= r5) goto L_0x0022;
    L_0x001e:
        r6.a(r7, r1);
        return r4;
    L_0x0022:
        r3 = r8.getAction();
        if (r3 == 0) goto L_0x007e;
    L_0x0028:
        if (r3 == r5) goto L_0x007a;
    L_0x002a:
        r8 = 2;
        if (r3 == r8) goto L_0x0031;
    L_0x002d:
        r8 = 3;
        if (r3 == r8) goto L_0x007a;
    L_0x0030:
        goto L_0x008a;
    L_0x0031:
        r8 = r6.d;
        if (r8 != 0) goto L_0x0043;
    L_0x0035:
        r8 = r6.b;
        r8 = (float) r8;
        r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r0 > 0) goto L_0x0043;
    L_0x003c:
        r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r8 < 0) goto L_0x0043;
    L_0x0040:
        r6.a(r7, r5);
    L_0x0043:
        r7 = r6.d;
        if (r7 == 0) goto L_0x008a;
    L_0x0047:
        r7 = r6.e;
        if (r7 == 0) goto L_0x0061;
    L_0x004b:
        r7 = r6.a;
        r7 = r7.iterator();
    L_0x0051:
        r8 = r7.hasNext();
        if (r8 == 0) goto L_0x0077;
    L_0x0057:
        r8 = r7.next();
        r8 = (defpackage.aimf) r8;
        r8.b(r1);
        goto L_0x0051;
    L_0x0061:
        r7 = r6.a;
        r7 = r7.iterator();
    L_0x0067:
        r8 = r7.hasNext();
        if (r8 == 0) goto L_0x0077;
    L_0x006d:
        r8 = r7.next();
        r8 = (defpackage.aimf) r8;
        r8.c(r1);
        goto L_0x0067;
    L_0x0077:
        r6.e = r4;
        goto L_0x008a;
    L_0x007a:
        r6.a(r7, r1);
        goto L_0x008a;
    L_0x007e:
        r7 = r8.getX();
        r6.f = r7;
        r7 = r8.getY();
        r6.g = r7;
    L_0x008a:
        r7 = r6.d;
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hze.a(android.view.View, android.view.MotionEvent):boolean");
    }

    private final void a(View view, boolean z) {
        if (this.d != z) {
            this.d = z;
            if (view != null && view.getParent() != null) {
                view.getParent().requestDisallowInterceptTouchEvent(this.d);
            }
        }
    }

    private final void a(View view, float f) {
        if (this.d) {
            for (aimf d : this.a) {
                d.d(f);
            }
        }
        a(view, false);
        this.e = true;
    }
}
