package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: llr */
final class llr {
    static aol a(RecyclerView recyclerView) {
        aol aol = (aol) recyclerView.getTag(R.id.orientation_helper);
        if (aol != null) {
            return aol;
        }
        aol = aol.a(recyclerView.n);
        recyclerView.setTag(R.id.orientation_helper, aol);
        return aol;
    }

    static int[] a(RecyclerView recyclerView, View view) {
        int a;
        int[] iArr = new int[2];
        if (recyclerView.n.k()) {
            aol a2 = llr.a(recyclerView);
            a = (a2.a(view) + (a2.e(view) / 2)) - llr.b(recyclerView);
        } else {
            a = 0;
        }
        iArr[0] = a;
        return iArr;
    }

    static int b(RecyclerView recyclerView) {
        apn apn = recyclerView.n;
        aol a = llr.a(recyclerView);
        if (apn.u()) {
            return a.b() + (a.e() / 2);
        }
        return a.d() / 2;
    }
}
