package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: pbk */
public class pbk extends ViewGroup {
    public final rnd a = new rnd(this);

    public pbk(Context context) {
        super(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            i3 = ((i3 - i) - measuredWidth) / 2;
            i4 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i3, i4, measuredWidth + i3, measuredHeight + i4);
        }
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    public final void onMeasure(int r8, int r9) {
        /*
        r7 = this;
        r0 = 0;
        r1 = r7.getChildAt(r0);
        if (r1 == 0) goto L_0x001c;
    L_0x0007:
        r2 = r1.getVisibility();
        r3 = 8;
        if (r2 == r3) goto L_0x001c;
    L_0x000f:
        r7.measureChild(r1, r8, r9);
        r0 = r1.getMeasuredWidth();
        r1 = r1.getMeasuredHeight();
        goto L_0x009c;
    L_0x001c:
        r1 = 0;
        r2 = r7.a;	 Catch:{ NullPointerException -> 0x0042 }
        r3 = r2.g;	 Catch:{ RemoteException -> 0x0035 }
        if (r3 == 0) goto L_0x003b;
    L_0x0023:
        r3 = r3.i();	 Catch:{ RemoteException -> 0x0035 }
        if (r3 != 0) goto L_0x002a;
    L_0x0029:
        goto L_0x003b;
    L_0x002a:
        r4 = r3.c;	 Catch:{ RemoteException -> 0x0035 }
        r5 = r3.b;	 Catch:{ RemoteException -> 0x0035 }
        r3 = r3.a;	 Catch:{ RemoteException -> 0x0035 }
        r1 = defpackage.peg.a(r4, r5, r3);	 Catch:{ RemoteException -> 0x0035 }
        goto L_0x0048;
    L_0x0035:
        r3 = move-exception;
        r4 = "#007 Could not call remote method.";
        defpackage.qml.c(r4, r3);	 Catch:{ NullPointerException -> 0x0042 }
    L_0x003b:
        r2 = r2.e;	 Catch:{ NullPointerException -> 0x0042 }
        if (r2 == 0) goto L_0x0048;
    L_0x003f:
        r1 = r2[r0];	 Catch:{ NullPointerException -> 0x0042 }
        goto L_0x0048;
    L_0x0042:
        r2 = move-exception;
        r3 = "Unable to retrieve ad size.";
        defpackage.qml.a(r3, r2);
    L_0x0048:
        if (r1 == 0) goto L_0x009b;
    L_0x004a:
        r0 = r7.getContext();
        r2 = r1.b;
        r3 = -3;
        r4 = -4;
        r5 = -1;
        if (r2 == r4) goto L_0x0070;
    L_0x0055:
        if (r2 == r3) goto L_0x0070;
    L_0x0057:
        if (r2 == r5) goto L_0x0063;
    L_0x0059:
        defpackage.rlj.a();
        r2 = r1.b;
        r2 = defpackage.qmh.a(r0, r2);
        goto L_0x0071;
    L_0x0063:
        r2 = r0.getResources();
        r2 = r2.getDisplayMetrics();
        r2 = defpackage.rkz.a(r2);
        goto L_0x0071;
    L_0x0070:
        r2 = -1;
    L_0x0071:
        r6 = r1.c;
        if (r6 == r4) goto L_0x0097;
    L_0x0075:
        if (r6 == r3) goto L_0x0097;
    L_0x0077:
        r3 = -2;
        if (r6 == r3) goto L_0x0084;
    L_0x007a:
        defpackage.rlj.a();
        r1 = r1.c;
        r0 = defpackage.qmh.a(r0, r1);
        goto L_0x0098;
    L_0x0084:
        r0 = r0.getResources();
        r0 = r0.getDisplayMetrics();
        r1 = defpackage.rkz.b(r0);
        r1 = (float) r1;
        r0 = r0.density;
        r1 = r1 * r0;
        r0 = (int) r1;
        goto L_0x0098;
    L_0x0097:
        r0 = -1;
    L_0x0098:
        r1 = r0;
        r0 = r2;
        goto L_0x009c;
    L_0x009b:
        r1 = 0;
    L_0x009c:
        r2 = r7.getSuggestedMinimumWidth();
        r0 = java.lang.Math.max(r0, r2);
        r2 = r7.getSuggestedMinimumHeight();
        r1 = java.lang.Math.max(r1, r2);
        r8 = android.view.View.resolveSize(r0, r8);
        r9 = android.view.View.resolveSize(r1, r9);
        r7.setMeasuredDimension(r8, r9);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pbk.onMeasure(int, int):void");
    }
}
