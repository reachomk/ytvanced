package defpackage;

import android.support.design.bottomsheet.BottomSheetBehavior;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: ey */
public final class ey extends adt {
    private final /* synthetic */ BottomSheetBehavior a;

    public ey(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    public final boolean a(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        int i2 = bottomSheetBehavior.k;
        if (!(i2 == 1 || bottomSheetBehavior.r)) {
            WeakReference weakReference;
            if (i2 == 3 && bottomSheetBehavior.q == i) {
                weakReference = bottomSheetBehavior.o;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            weakReference = this.a.n;
            return weakReference != null && weakReference.get() == view;
        }
    }

    public final void a(View view, int i, int i2, int i3) {
        this.a.d(i2);
    }

    public final void a(int i) {
        if (i == 1) {
            this.a.c(1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010e  */
    public final void a(android.view.View r7, float r8, float r9) {
        /*
        r6 = this;
        r0 = 0;
        r1 = 4;
        r2 = 6;
        r3 = 3;
        r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r4 < 0) goto L_0x00cb;
    L_0x0008:
        r4 = r6.a;
        r5 = r4.i;
        if (r5 == 0) goto L_0x0031;
    L_0x000e:
        r4 = r4.b(r7, r9);
        if (r4 == 0) goto L_0x0031;
    L_0x0014:
        r4 = r7.getTop();
        r5 = r6.a;
        r5 = r5.h;
        if (r4 > r5) goto L_0x002a;
    L_0x001e:
        r4 = java.lang.Math.abs(r8);
        r5 = java.lang.Math.abs(r9);
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r4 >= 0) goto L_0x0031;
    L_0x002a:
        r8 = r6.a;
        r8 = r8.m;
        r1 = 5;
        goto L_0x00e4;
    L_0x0031:
        r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r0 == 0) goto L_0x0071;
    L_0x0035:
        r8 = java.lang.Math.abs(r8);
        r9 = java.lang.Math.abs(r9);
        r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1));
        if (r8 <= 0) goto L_0x0042;
    L_0x0041:
        goto L_0x0071;
    L_0x0042:
        r8 = r6.a;
        r9 = r8.a;
        if (r9 == 0) goto L_0x004c;
    L_0x0048:
        r8 = r8.h;
        goto L_0x00e4;
    L_0x004c:
        r8 = r7.getTop();
        r9 = r6.a;
        r9 = r9.g;
        r9 = r8 - r9;
        r9 = java.lang.Math.abs(r9);
        r0 = r6.a;
        r0 = r0.h;
        r8 = r8 - r0;
        r8 = java.lang.Math.abs(r8);
        if (r9 >= r8) goto L_0x006b;
    L_0x0065:
        r8 = r6.a;
        r8 = r8.g;
        goto L_0x00e3;
    L_0x006b:
        r8 = r6.a;
        r8 = r8.h;
        goto L_0x00e4;
    L_0x0071:
        r8 = r7.getTop();
        r9 = r6.a;
        r0 = r9.a;
        if (r0 == 0) goto L_0x0098;
    L_0x007b:
        r9 = r9.f;
        r9 = r8 - r9;
        r9 = java.lang.Math.abs(r9);
        r0 = r6.a;
        r0 = r0.h;
        r8 = r8 - r0;
        r8 = java.lang.Math.abs(r8);
        if (r9 >= r8) goto L_0x0093;
    L_0x008e:
        r8 = r6.a;
        r8 = r8.f;
        goto L_0x00d3;
    L_0x0093:
        r8 = r6.a;
        r8 = r8.h;
        goto L_0x00e4;
    L_0x0098:
        r0 = r9.g;
        if (r8 >= r0) goto L_0x00b0;
    L_0x009c:
        r9 = r9.h;
        r9 = r8 - r9;
        r9 = java.lang.Math.abs(r9);
        if (r8 >= r9) goto L_0x00ab;
    L_0x00a6:
        r8 = r6.a;
        r8 = r8.e;
        goto L_0x00d3;
    L_0x00ab:
        r8 = r6.a;
        r8 = r8.g;
        goto L_0x00e3;
    L_0x00b0:
        r9 = r8 - r0;
        r9 = java.lang.Math.abs(r9);
        r0 = r6.a;
        r0 = r0.h;
        r8 = r8 - r0;
        r8 = java.lang.Math.abs(r8);
        if (r9 >= r8) goto L_0x00c6;
    L_0x00c1:
        r8 = r6.a;
        r8 = r8.g;
        goto L_0x00e3;
    L_0x00c6:
        r8 = r6.a;
        r8 = r8.h;
        goto L_0x00e4;
    L_0x00cb:
        r8 = r6.a;
        r9 = r8.a;
        if (r9 == 0) goto L_0x00d5;
    L_0x00d1:
        r8 = r8.f;
    L_0x00d3:
        r1 = 3;
        goto L_0x00e4;
    L_0x00d5:
        r8 = r7.getTop();
        r9 = r6.a;
        r0 = r9.g;
        if (r8 > r0) goto L_0x00e2;
    L_0x00df:
        r8 = r9.e;
        goto L_0x00d3;
    L_0x00e2:
        r8 = r0;
    L_0x00e3:
        r1 = 6;
    L_0x00e4:
        r9 = r6.a;
        r9 = r9.l;
        r0 = r7.getLeft();
        r8 = r9.a(r0, r8);
        if (r8 == 0) goto L_0x010e;
    L_0x00f2:
        r8 = r6.a;
        r9 = 2;
        r8.c(r9);
        if (r1 != r3) goto L_0x0103;
    L_0x00fa:
        r8 = r6.a;
        r8 = r8.d;
        if (r8 == 0) goto L_0x0103;
    L_0x0100:
        r8.reverse();
    L_0x0103:
        r8 = new fc;
        r9 = r6.a;
        r8.<init>(r9, r7, r1);
        defpackage.abe.a(r7, r8);
        return;
    L_0x010e:
        if (r1 != r3) goto L_0x0119;
    L_0x0110:
        r7 = r6.a;
        r7 = r7.d;
        if (r7 == 0) goto L_0x0119;
    L_0x0116:
        r7.reverse();
    L_0x0119:
        r7 = r6.a;
        r7.c(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ey.a(android.view.View, float, float):void");
    }

    public final int d(View view, int i) {
        int i2;
        int b = this.a.b();
        BottomSheetBehavior bottomSheetBehavior = this.a;
        if (bottomSheetBehavior.i) {
            i2 = bottomSheetBehavior.m;
        } else {
            i2 = bottomSheetBehavior.h;
        }
        return th.a(i, b, i2);
    }

    public final int c(View view, int i) {
        return view.getLeft();
    }

    public final int a() {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        if (bottomSheetBehavior.i) {
            return bottomSheetBehavior.m;
        }
        return bottomSheetBehavior.h;
    }
}
