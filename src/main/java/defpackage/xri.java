package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;

/* renamed from: xri */
final class xri extends apv {
    private final /* synthetic */ xrg a;

    xri(xrg xrg) {
        this.a = xrg;
    }

    public final void a(RecyclerView recyclerView, int i) {
        xrg xrg = this.a;
        if (recyclerView == xrg.b) {
            for (SwipeLayout swipeLayout : xrg.a) {
                if (abe.H(swipeLayout) && swipeLayout.a()) {
                    swipeLayout.b();
                }
            }
        }
    }
}
