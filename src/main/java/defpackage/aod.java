package defpackage;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

/* renamed from: aod */
final class aod implements OnScrollListener {
    private final /* synthetic */ aoa a;

    aod(aoa aoa) {
        this.a = aoa;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1 && !this.a.k() && this.a.r.getContentView() != null) {
            aoa aoa = this.a;
            aoa.p.removeCallbacks(aoa.o);
            this.a.o.run();
        }
    }
}
