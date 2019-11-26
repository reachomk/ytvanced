package defpackage;

import android.graphics.PointF;
import android.view.View;

/* renamed from: aoq */
public class aoq extends arm {
    private aol c;
    private aol d;

    public int[] a(apn apn, View view) {
        int[] iArr = new int[2];
        if (apn.k()) {
            iArr[0] = aoq.a(apn, view, d(apn));
        } else {
            iArr[0] = 0;
        }
        if (apn.l()) {
            iArr[1] = aoq.a(apn, view, c(apn));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public View a(apn apn) {
        if (apn.l()) {
            return aoq.a(apn, c(apn));
        }
        return apn.k() ? aoq.a(apn, d(apn)) : null;
    }

    public int a(apn apn, int i, int i2) {
        int C = apn.C();
        if (C != 0) {
            aol c;
            if (apn.l()) {
                c = c(apn);
            } else if (apn.k()) {
                c = d(apn);
            } else {
                c = null;
            }
            if (c != null) {
                int i3;
                int w = apn.w();
                int i4 = aocf.UNSET_ENUM_VALUE;
                Object obj = null;
                View view = null;
                View view2 = view;
                int i5 = Integer.MAX_VALUE;
                for (i3 = 0; i3 < w; i3++) {
                    View i6 = apn.i(i3);
                    if (i6 != null) {
                        int a = aoq.a(apn, i6, c);
                        if (a <= 0 && a > i4) {
                            view2 = i6;
                            i4 = a;
                        }
                        if (a >= 0 && a < i5) {
                            view = i6;
                            i5 = a;
                        }
                    }
                }
                i3 = 1;
                Object obj2 = (apn.k() ? i <= 0 : i2 <= 0) ? null : 1;
                if (obj2 != null && view != null) {
                    return apn.c(view);
                }
                if (obj2 == null && view2 != null) {
                    return apn.c(view2);
                }
                if (obj2 != null) {
                    view = view2;
                }
                if (view != null) {
                    i2 = apn.c(view);
                    int C2 = apn.C();
                    if (apn instanceof aqe) {
                        PointF d = ((aqe) apn).d(C2 - 1);
                        if (d != null && (d.x < 0.0f || d.y < 0.0f)) {
                            obj = 1;
                        }
                    }
                    if (obj == obj2) {
                        i3 = -1;
                    }
                    i2 += i3;
                    if (i2 < 0 || i2 >= C) {
                        return -1;
                    }
                    return i2;
                }
            }
        }
        return -1;
    }

    /* Access modifiers changed, original: protected */
    public any b(apn apn) {
        return apn instanceof aqe ? new aop(this, this.a.getContext()) : null;
    }

    private static int a(apn apn, View view, aol aol) {
        int b;
        int a = aol.a(view) + (aol.e(view) / 2);
        if (apn.u()) {
            b = aol.b() + (aol.e() / 2);
        } else {
            b = aol.d() / 2;
        }
        return a - b;
    }

    private static View a(apn apn, aol aol) {
        int w = apn.w();
        View view = null;
        if (w != 0) {
            int b;
            if (apn.u()) {
                b = aol.b() + (aol.e() / 2);
            } else {
                b = aol.d() / 2;
            }
            int i = Integer.MAX_VALUE;
            int i2 = 0;
            while (i2 < w) {
                View i3 = apn.i(i2);
                int abs = Math.abs((aol.a(i3) + (aol.e(i3) / 2)) - b);
                int i4 = abs < i ? abs : i;
                if (abs < i) {
                    view = i3;
                }
                i2++;
                i = i4;
            }
        }
        return view;
    }

    private final aol c(apn apn) {
        aol aol = this.c;
        if (aol == null || aol.a != apn) {
            this.c = aol.b(apn);
        }
        return this.c;
    }

    private final aol d(apn apn) {
        aol aol = this.d;
        if (aol == null || aol.a != apn) {
            this.d = aol.a(apn);
        }
        return this.d;
    }
}
