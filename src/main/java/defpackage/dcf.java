package defpackage;

import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: dcf */
public final class dcf extends arm {
    public RecyclerView a;
    private aol c;
    private aol d;
    private apn e;
    private apn f;

    public final int[] a(apn apn, View view) {
        int[] iArr = new int[2];
        if (apn.k()) {
            iArr[0] = dcf.a(view, d(apn));
        } else {
            iArr[0] = 0;
        }
        if (apn.l()) {
            iArr[1] = dcf.a(view, c(apn));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final void a(RecyclerView recyclerView) {
        this.a = recyclerView;
        super.a(recyclerView);
    }

    public final View a(apn apn) {
        if (apn.l()) {
            return dcf.a(apn, c(apn));
        }
        return apn.k() ? dcf.a(apn, d(apn)) : null;
    }

    public final int a(apn apn, int i, int i2) {
        apn apn2 = apn;
        int C = apn.C();
        if (C != 0) {
            aol d;
            boolean k = apn.k();
            if (k) {
                d = d(apn);
            } else {
                d = c(apn);
            }
            int w = apn.w();
            View view = null;
            Object obj = null;
            if (w != 0) {
                int b = d.b();
                View view2 = null;
                int i3 = Integer.MAX_VALUE;
                for (int i4 = 0; i4 < w; i4++) {
                    View i5 = apn.i(i4);
                    int a = d.a(i5);
                    int abs = Math.abs(a - b);
                    if (a < b && abs < i3) {
                        view2 = i5;
                        i3 = abs;
                    }
                }
                view = view2;
            }
            if (view != null) {
                int c = apn.c(view);
                if (c != -1) {
                    if (k ? i > 0 : i2 > 0) {
                        obj = 1;
                    }
                    if (apn2 instanceof aqe) {
                        PointF d2 = ((aqe) apn2).d(C - 1);
                        if (d2 != null && (d2.x < 0.0f || d2.y < 0.0f)) {
                            if (obj != null) {
                                return c - 1;
                            }
                            return c;
                        }
                    }
                    if (obj != null) {
                        c++;
                    }
                    return c;
                }
            }
        }
        return -1;
    }

    /* Access modifiers changed, original: protected|final */
    public final any b(apn apn) {
        return apn instanceof aqe ? new dci(this, this.a.getContext()) : null;
    }

    private static int a(View view, aol aol) {
        return aol.a(view) - aol.b();
    }

    private static View a(apn apn, aol aol) {
        int w = apn.w();
        View view = null;
        if (w != 0) {
            int b = aol.b();
            int i = Integer.MAX_VALUE;
            int i2 = 0;
            while (i2 < w) {
                View i3 = apn.i(i2);
                int abs = Math.abs(aol.a(i3) - b);
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
        if (this.c == null || this.e != apn) {
            this.c = aol.b(apn);
            this.e = apn;
        }
        return this.c;
    }

    private final aol d(apn apn) {
        if (this.d == null || this.f != apn) {
            this.d = aol.a(apn);
            this.f = apn;
        }
        return this.d;
    }
}
