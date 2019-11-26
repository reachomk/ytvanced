package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: clq */
public final class clq {
    /* JADX WARNING: Missing block: B:7:0x0020, code skipped:
            if (r8 == false) goto L_0x0022;
     */
    public static void a(android.view.View r3, int r4, int r5, int r6, int r7, boolean r8) {
        /*
        r0 = r6 - r4;
        r1 = r7 - r5;
        if (r8 == 0) goto L_0x0007;
    L_0x0006:
        goto L_0x0013;
    L_0x0007:
        r2 = r3.getMeasuredHeight();
        if (r2 != r1) goto L_0x0013;
    L_0x000d:
        r2 = r3.getMeasuredWidth();
        if (r2 == r0) goto L_0x0022;
    L_0x0013:
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2);
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2);
        r3.measure(r0, r1);
        if (r8 != 0) goto L_0x003a;
    L_0x0022:
        r8 = r3.getLeft();
        if (r8 != r4) goto L_0x003a;
    L_0x0028:
        r8 = r3.getTop();
        if (r8 != r5) goto L_0x003a;
    L_0x002e:
        r8 = r3.getRight();
        if (r8 != r6) goto L_0x003a;
    L_0x0034:
        r8 = r3.getBottom();
        if (r8 == r7) goto L_0x003d;
    L_0x003a:
        r3.layout(r4, r5, r6, r7);
    L_0x003d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clq.a(android.view.View, int, int, int, int, boolean):void");
    }

    public static void a(Drawable drawable, int i, int i2) {
        Rect bounds = drawable.getBounds();
        drawable.setBounds(bounds.left, bounds.top, bounds.left + i, bounds.top + i2);
        if (drawable instanceof cpw) {
            ((cpw) drawable).a(i, i2);
        }
    }

    public static void b(Drawable drawable, int i, int i2) {
        Rect bounds = drawable.getBounds();
        drawable.setBounds(i, i2, bounds.width() + i, bounds.height() + i2);
    }
}
