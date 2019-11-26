package defpackage;

import android.graphics.PointF;
import android.view.View;

/* renamed from: anx */
public final class anx extends arm {
    private aol c;
    private aol d;

    public final int[] a(apn apn, View view) {
        int[] iArr = new int[2];
        if (apn.k()) {
            iArr[0] = anx.a(apn, view, d(apn));
        } else {
            iArr[0] = 0;
        }
        if (apn.l()) {
            iArr[1] = anx.a(apn, view, c(apn));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final int a(apn apn, int i, int i2) {
        if (apn instanceof aqe) {
            int C = apn.C();
            if (C != 0) {
                View a = a(apn);
                if (a != null) {
                    int c = apn.c(a);
                    if (c != -1) {
                        int i3 = C - 1;
                        PointF d = ((aqe) apn).d(i3);
                        if (d != null) {
                            if (apn.k()) {
                                i = a(apn, d(apn), i, 0);
                                if (d.x < 0.0f) {
                                    i = -i;
                                }
                            } else {
                                i = 0;
                            }
                            if (apn.l()) {
                                i2 = a(apn, c(apn), 0, i2);
                                if (d.y < 0.0f) {
                                    i2 = -i2;
                                }
                            } else {
                                i2 = 0;
                            }
                            if (apn.l()) {
                                i = i2;
                            }
                            if (i != 0) {
                                int i4 = c + i;
                                if (i4 < 0) {
                                    i4 = 0;
                                }
                                return i4 < C ? i4 : i3;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    public final View a(apn apn) {
        if (apn.l()) {
            return anx.a(apn, c(apn));
        }
        return apn.k() ? anx.a(apn, d(apn)) : null;
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

    private final int a(apn apn, aol aol, int i, int i2) {
        r0 = new int[2];
        this.b.fling(0, 0, i, i2, aocf.UNSET_ENUM_VALUE, Integer.MAX_VALUE, aocf.UNSET_ENUM_VALUE, Integer.MAX_VALUE);
        r0[0] = this.b.getFinalX();
        r0[1] = this.b.getFinalY();
        i = apn.w();
        float f = 1.0f;
        if (i != 0) {
            View view = null;
            View view2 = null;
            int i3 = Integer.MAX_VALUE;
            int i4 = aocf.UNSET_ENUM_VALUE;
            for (int i5 = 0; i5 < i; i5++) {
                View i6 = apn.i(i5);
                int c = apn.c(i6);
                if (c != -1) {
                    int i7 = c < i3 ? c : i3;
                    if (c < i3) {
                        view = i6;
                    }
                    if (c > i4) {
                        view2 = i6;
                        i4 = c;
                    }
                    i3 = i7;
                }
            }
            if (!(view == null || view2 == null)) {
                int max = Math.max(aol.b(view), aol.b(view2)) - Math.min(aol.a(view), aol.a(view2));
                if (max != 0) {
                    f = ((float) max) / ((float) ((i4 - i3) + 1));
                }
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        int i8;
        if (Math.abs(r0[0]) <= Math.abs(r0[1])) {
            i8 = r0[1];
        } else {
            i8 = r0[0];
        }
        return Math.round(((float) i8) / f);
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
