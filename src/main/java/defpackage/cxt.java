package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: cxt */
final class cxt extends apv {
    public final void a(RecyclerView recyclerView, int i, int i2) {
        apn apn = recyclerView.n;
        boolean z = apn instanceof arr;
        i2 = 0;
        if (z) {
            if (dcg.a == null) {
                dcg.a = new int[0];
            }
            int[] iArr = dcg.a;
            if (iArr == null) {
                iArr = new int[0];
            }
            for (int i3 = 0; i3 < iArr.length; i3++) {
            }
        } else {
            ((ans) apn).q();
        }
        if (z) {
            if (dcg.a == null) {
                dcg.a = new int[0];
            }
            int[] iArr2 = dcg.a;
            if (iArr2 == null) {
                iArr2 = new int[0];
            }
            while (i2 < iArr2.length) {
                i2++;
            }
            return;
        }
        ((ans) apn).s();
    }

    /* synthetic */ cxt() {
    }
}
