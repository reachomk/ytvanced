package defpackage;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

/* renamed from: irh */
final class irh implements OnScrollListener {
    private final /* synthetic */ iqu a;

    irh(iqu iqu) {
        this.a = iqu;
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            xpr.a(this.a.aF);
        }
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        iqu iqu = this.a;
        iqu.aJ = Math.max(iqu.aJ, iqu.aH.getLastVisiblePosition());
    }
}
