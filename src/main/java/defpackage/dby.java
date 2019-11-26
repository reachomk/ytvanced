package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import java.util.List;

/* renamed from: dby */
final class dby {
    public static final aph a = new dca();

    static void a(cmg cmg, int i, int i2, crd crd, cyf cyf) {
        coj a;
        if (cyf.c() || cyf.b()) {
            a = czz.a(cmg);
        } else {
            a = null;
        }
        cyf.a(crd, i, i2, a);
    }

    static void a(cmn cmn, cyf cyf) {
        cyf.c(cmn.a(), cmn.b());
    }

    static dcb a(Context context) {
        return new dcb(context, new czr(context));
    }

    static void a(coj coj, cqp cqp) {
        if (coj != null) {
            cqp.a = new dbx(coj);
        }
    }

    static void a(dcb dcb, cyf cyf, boolean z, boolean z2, int i, int i2, int i3, int i4, Integer num, int i5, boolean z3, boolean z4, int i6, apk apk, boolean z5, boolean z6, int i7, int i8, int i9, CharSequence charSequence) {
        boolean z7 = z2;
        boolean z8 = z3;
        boolean z9 = z4;
        RecyclerView recyclerView = dcb.m;
        if (recyclerView != null) {
            recyclerView.setContentDescription(charSequence);
            recyclerView.r = z;
            recyclerView.setClipToPadding(z2);
            dcb.setClipToPadding(z2);
            int i10 = i;
            int i11 = i2;
            int i12 = i3;
            int i13 = i4;
            recyclerView.setPadding(i, i3, i2, i4);
            recyclerView.setClipChildren(z8);
            dcb.setClipChildren(z8);
            recyclerView.setNestedScrollingEnabled(z9);
            dcb.setNestedScrollingEnabled(z9);
            recyclerView.setScrollBarStyle(0);
            recyclerView.setHorizontalFadingEdgeEnabled(false);
            recyclerView.setVerticalFadingEdgeEnabled(false);
            recyclerView.setFadingEdgeLength(i7);
            recyclerView.setId(i8);
            recyclerView.setOverScrollMode(0);
            dcb.a(i5);
            cyf cyf2 = cyf;
            cyf.b(recyclerView);
            return;
        }
        throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout");
    }

    protected static void a(dcb dcb, cyf cyf, aph aph, dbp dbp, List list, arm arm, boolean z, czu czu, bfd bfd, cqp cqp) {
        dcb.setContentDescription(null);
        z = z && bfd != null;
        dcb.setEnabled(z);
        dcb.a = bfd;
        RecyclerView recyclerView = (czr) dcb.m;
        if (recyclerView != null) {
            cqp.a = recyclerView.D;
            if (aph != a) {
                recyclerView.a(aph);
            } else {
                recyclerView.a(new dca());
            }
            if (list != null) {
                for (apv a : list) {
                    recyclerView.a(a);
                }
            }
            if (arm != null && recyclerView.F == null) {
                arm.a(recyclerView);
            }
            cyf.e();
            if (dbp != null) {
                dbp.a = dcb;
            }
            if (dcb.n) {
                recyclerView.requestLayout();
                dcb.n = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout before unmounting");
    }

    static void a(dcb dcb, cyf cyf, dbp dbp, List list, aph aph) {
        czr czr = (czr) dcb.m;
        if (czr != null) {
            czr.a(aph);
            cyf.j_();
            if (dbp != null) {
                dbp.a = null;
            }
            if (list != null) {
                for (apv b : list) {
                    czr.b(b);
                }
            }
            czr.T = null;
            dcb.a = null;
            return;
        }
        throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout before unmounting");
    }

    static void a(dcb dcb, cyf cyf, apk apk, Integer num, arm arm) {
        RecyclerView recyclerView = dcb.m;
        if (recyclerView != null) {
            recyclerView.setId(-1);
            cyf.a(recyclerView);
            if (arm != null) {
                arm.a(null);
                return;
            }
            return;
        }
        throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout before unmounting");
    }

    protected static boolean a(coa coa, coa coa2, coa coa3, coa coa4, coa coa5, coa coa6, coa coa7, coa coa8, coa coa9, coa coa10, coa coa11, coa coa12, coa coa13, coa coa14, coa coa15, coa coa16) {
        coa coa17 = coa;
        coa coa18 = coa2;
        coa coa19 = coa3;
        coa coa20 = coa4;
        coa coa21 = coa5;
        coa coa22 = coa6;
        coa coa23 = coa7;
        coa coa24 = coa8;
        coa coa25 = coa9;
        coa coa26 = coa10;
        coa coa27 = coa11;
        coa coa28 = coa12;
        coa coa29 = coa13;
        coa coa30 = coa14;
        coa coa31 = coa15;
        coa coa32 = coa16;
        if (((Integer) coa32.a).intValue() == ((Integer) coa32.b).intValue() && coa17.a == coa17.b && ((Boolean) coa18.a).equals(coa18.b) && ((Boolean) coa19.a).equals(coa19.b) && ((Integer) coa20.a).equals(coa20.b) && ((Integer) coa21.a).equals(coa21.b) && ((Integer) coa22.a).equals(coa22.b) && ((Integer) coa23.a).equals(coa23.b) && ((Boolean) coa26.a).equals(coa26.b) && ((Integer) coa27.a).equals(coa27.b) && ((Boolean) coa29.a).equals(coa29.b) && ((Boolean) coa30.a).equals(coa30.b) && ((Integer) coa31.a).equals(coa31.b)) {
            Integer num = (Integer) coa24.a;
            Integer num2 = (Integer) coa24.b;
            if (!num == null ? num.equals(num2) : num2 == null) {
                return true;
            }
            if (((Integer) coa25.a).equals(coa25.b)) {
                coa17 = coa12;
                apk apk = (apk) coa17.a;
                apk apk2 = (apk) coa17.b;
                int equals = apk != null ? apk.equals(apk2) : apk2 != null ? 0 : 1;
                return equals ^ 1;
            }
        }
        return true;
    }

    protected static void a(cmg cmg, int i) {
        czz.a(cmg, i + 1);
    }

    protected static void a(cri cri) {
        cri.a = Integer.valueOf(0);
    }

    protected static void a(int i, cri cri) {
        cri.a = Integer.valueOf(i);
    }

    protected static boolean a(cyf cyf) {
        return cyf.b();
    }
}
