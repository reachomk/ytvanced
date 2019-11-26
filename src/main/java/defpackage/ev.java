package defpackage;

import android.support.design.behavior.SwipeDismissBehavior;
import android.view.View;
import android.view.ViewParent;

/* renamed from: ev */
public final class ev extends adt {
    private int a;
    private int b = -1;
    private final /* synthetic */ SwipeDismissBehavior c;

    public ev(SwipeDismissBehavior swipeDismissBehavior) {
        this.c = swipeDismissBehavior;
    }

    public final boolean a(View view, int i) {
        return this.b == -1 && this.c.b(view);
    }

    public final void b(View view, int i) {
        this.b = i;
        this.a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final void a(int i) {
        eu euVar = this.c.b;
        if (euVar != null) {
            euVar.a(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARNING: Missing block: B:17:0x004e, code skipped:
            if (java.lang.Math.abs(r6.getLeft() - r5.a) >= java.lang.Math.round(((float) r6.getWidth()) * r5.c.d)) goto L_0x0050;
     */
    public final void a(android.view.View r6, float r7, float r8) {
        /*
        r5 = this;
        r8 = -1;
        r5.b = r8;
        r8 = r6.getWidth();
        r0 = 1;
        r1 = 0;
        r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1));
        if (r2 == 0) goto L_0x0034;
    L_0x000d:
        r2 = defpackage.abe.g(r6);
        r3 = r5.c;
        r3 = r3.c;
        r4 = 2;
        if (r3 == r4) goto L_0x0050;
    L_0x0018:
        if (r3 != 0) goto L_0x0026;
    L_0x001a:
        if (r2 != r0) goto L_0x0021;
    L_0x001c:
        r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1));
        if (r7 < 0) goto L_0x0050;
    L_0x0020:
        goto L_0x005c;
    L_0x0021:
        r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1));
        if (r7 <= 0) goto L_0x005c;
    L_0x0025:
        goto L_0x0050;
    L_0x0026:
        if (r3 != r0) goto L_0x005c;
    L_0x0028:
        if (r2 == r0) goto L_0x002f;
    L_0x002a:
        r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1));
        if (r7 >= 0) goto L_0x005c;
    L_0x002e:
        goto L_0x0050;
    L_0x002f:
        r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1));
        if (r7 <= 0) goto L_0x005c;
    L_0x0033:
        goto L_0x0050;
    L_0x0034:
        r7 = r6.getLeft();
        r1 = r5.a;
        r2 = r6.getWidth();
        r3 = r5.c;
        r3 = r3.d;
        r2 = (float) r2;
        r2 = r2 * r3;
        r2 = java.lang.Math.round(r2);
        r7 = r7 - r1;
        r7 = java.lang.Math.abs(r7);
        if (r7 < r2) goto L_0x005c;
    L_0x0050:
        r7 = r6.getLeft();
        r1 = r5.a;
        if (r7 >= r1) goto L_0x005a;
    L_0x0058:
        r1 = r1 - r8;
        goto L_0x005f;
    L_0x005a:
        r1 = r1 + r8;
        goto L_0x005f;
    L_0x005c:
        r1 = r5.a;
        r0 = 0;
    L_0x005f:
        r7 = r5.c;
        r7 = r7.a;
        r8 = r6.getTop();
        r7 = r7.a(r1, r8);
        if (r7 == 0) goto L_0x0078;
    L_0x006d:
        r7 = new ew;
        r8 = r5.c;
        r7.<init>(r8, r6, r0);
        defpackage.abe.a(r6, r7);
        goto L_0x0083;
    L_0x0078:
        if (r0 == 0) goto L_0x0083;
    L_0x007a:
        r7 = r5.c;
        r7 = r7.b;
        if (r7 == 0) goto L_0x0083;
    L_0x0080:
        r7.a(r6);
    L_0x0083:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ev.a(android.view.View, float, float):void");
    }

    public final int a(View view) {
        return view.getWidth();
    }

    public final int c(View view, int i) {
        int width;
        int g = abe.g(view);
        int i2 = this.c.c;
        if (i2 != 0) {
            if (i2 != 1) {
                g = this.a - view.getWidth();
                width = view.getWidth() + this.a;
            } else if (g != 1) {
                g = this.a - view.getWidth();
                width = this.a;
            } else {
                g = this.a;
                width = view.getWidth();
            }
            return Math.min(Math.max(g, i), width);
        } else if (g == 1) {
            g = this.a - view.getWidth();
            width = this.a;
            return Math.min(Math.max(g, i), width);
        } else {
            g = this.a;
            width = view.getWidth();
        }
        width += g;
        return Math.min(Math.max(g, i), width);
    }

    public final int d(View view, int i) {
        return view.getTop();
    }

    public final void a(View view, int i, int i2, int i3) {
        float width = ((float) this.a) + (((float) view.getWidth()) * this.c.e);
        float width2 = ((float) this.a) + (((float) view.getWidth()) * this.c.f);
        float f = (float) i;
        if (f <= width) {
            view.setAlpha(1.0f);
        } else if (f < width2) {
            view.setAlpha(SwipeDismissBehavior.a(1.0f - ((f - width) / (width2 - width))));
        } else {
            view.setAlpha(0.0f);
        }
    }
}
