package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: zvt */
final class zvt extends apv {
    private final /* synthetic */ zvs a;

    zvt(zvs zvs) {
        this.a = zvs;
    }

    public final void a(RecyclerView recyclerView, int i) {
        a();
        zwj zwj = this.a.j;
        if (zwj != null) {
            zwj.d();
        }
        if (i == 0) {
            int p;
            zvs zvs = this.a;
            zwj zwj2 = zvs.j;
            if (zvs.e != null) {
                p = zvs.f.p();
                View childAt = zvs.e.getChildAt(0);
                if (childAt != null && ((float) childAt.getTop()) < ((float) childAt.getHeight()) * -0.3f) {
                    p++;
                }
            } else {
                p = -1;
            }
            zwj2.a(p);
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        a();
        zwj zwj = this.a.j;
        if (zwj != null) {
            zwj.d();
        }
    }

    private final void a() {
        int p = this.a.f.p();
        int i = 0;
        View childAt = this.a.e.getChildAt(0);
        Object obj = 1;
        if (p <= 0 && (childAt == null || childAt.getTop() >= 0)) {
            obj = null;
        }
        View view = this.a.h;
        if (obj == null) {
            i = 4;
        }
        view.setVisibility(i);
    }
}
