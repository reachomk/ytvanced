package defpackage;

import android.support.design.appbar.AppBarLayout;
import android.support.v7.widget.RecyclerView;

/* renamed from: jqm */
final class jqm extends apv implements ef {
    public boolean a = false;
    private boolean b = false;
    private boolean c = false;
    private final /* synthetic */ jpz d;

    public final void a(RecyclerView recyclerView, int i) {
        if (!this.a && !this.b && i == 1) {
            this.b = true;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (!this.a && this.d.c.a == 5 && this.b && this.c) {
            a();
        }
    }

    public final void a(AppBarLayout appBarLayout, int i) {
        if (!this.a) {
            if (Math.abs(i) == appBarLayout.a() && this.b) {
                this.c = true;
                this.d.c();
            } else if (i == 0 && this.c) {
                a();
            }
        }
    }

    private final void a() {
        this.d.b(0);
        this.d.b();
    }

    /* synthetic */ jqm(jpz jpz) {
        this.d = jpz;
    }
}
