package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: apl */
public final class apl implements apj {
    private final /* synthetic */ RecyclerView a;

    public apl(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a(aqj aqj) {
        int i = 1;
        aqj.a(true);
        if (aqj.h != null && aqj.i == null) {
            aqj.h = null;
        }
        aqj.i = null;
        if ((aqj.j & 16) == 0) {
            RecyclerView recyclerView = this.a;
            View view = aqj.a;
            recyclerView.f();
            amc amc = recyclerView.g;
            int a = amc.a.a(view);
            if (a == -1) {
                amc.b(view);
            } else if (amc.b.c(a)) {
                amc.b.d(a);
                amc.b(view);
                amc.a.a(a);
            } else {
                i = 0;
            }
            if (i != 0) {
                aqj d = RecyclerView.d(view);
                recyclerView.e.b(d);
                recyclerView.e.a(d);
            }
            recyclerView.a(i ^ 1);
            if (i == 0 && aqj.n()) {
                this.a.removeDetachedView(aqj.a, false);
            }
        }
    }
}
