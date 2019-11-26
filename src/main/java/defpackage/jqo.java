package defpackage;

import android.support.design.appbar.AppBarLayout;

/* renamed from: jqo */
final /* synthetic */ class jqo implements Runnable {
    private final jqm a;
    private final AppBarLayout b;

    jqo(jqm jqm, AppBarLayout appBarLayout) {
        this.a = jqm;
        this.b = appBarLayout;
    }

    public final void run() {
        this.b.b(this.a);
    }
}
