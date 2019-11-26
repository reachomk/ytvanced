package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: akzl */
final /* synthetic */ class akzl implements Runnable {
    private final RecyclerView a;

    public akzl(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void run() {
        this.a.requestLayout();
    }
}
