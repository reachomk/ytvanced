package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;

/* renamed from: lmx */
public final /* synthetic */ class lmx implements lnj {
    private final lmv a;
    private final lna b;

    public lmx(lmv lmv, lna lna) {
        this.a = lmv;
        this.b = lna;
    }

    public final void a(lmk lmk) {
        NextGenWatchLayout nextGenWatchLayout;
        lui lui;
        lmv lmv = this.a;
        lna lna = this.b;
        lqz lqz = null;
        if (lmk != null) {
            View view = lmk.a;
            nextGenWatchLayout = view instanceof NextGenWatchLayout ? (NextGenWatchLayout) view : null;
            lui = lmk.p;
        } else {
            lui = null;
            nextGenWatchLayout = lui;
        }
        llc llc = nextGenWatchLayout != null ? nextGenWatchLayout.d : null;
        for (int i = 0; i < lmv.s.size(); i++) {
            ((llh) lmv.s.get(i)).a = llc;
        }
        lna.a(nextGenWatchLayout);
        lmv.q.a(lui);
        if (lui != null) {
            lqz = lui.l();
        }
        lqt f = ((lum) lmv.d.get()).f();
        if (lqz != null && !f.isEmpty()) {
            int a = f.a(lqz);
            int c = f.c();
            if (a >= 0 && a != c) {
                f.b(a);
            }
        }
    }
}
