package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: jql */
final /* synthetic */ class jql implements Runnable {
    private final jqm a;
    private final RecyclerView b;

    jql(jqm jqm, RecyclerView recyclerView) {
        this.a = jqm;
        this.b = recyclerView;
    }

    public final void run() {
        this.b.b(this.a);
    }
}
