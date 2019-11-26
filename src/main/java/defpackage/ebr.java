package defpackage;

import android.support.v7.widget.RecyclerView;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

/* renamed from: ebr */
final class ebr extends apv implements OnScrollListener {
    private final /* synthetic */ ebs a;

    ebr(ebs ebs) {
        this.a = ebs;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i != 0) {
            this.a.a(new eex(), true);
        }
    }

    public final void a(RecyclerView recyclerView, int i) {
        if (i != 0) {
            this.a.a(new eex(), true);
        }
    }
}
