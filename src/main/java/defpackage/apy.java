package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: apy */
public final class apy extends apc {
    private final /* synthetic */ RecyclerView a;

    public apy(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a() {
        this.a.a(null);
        RecyclerView recyclerView = this.a;
        recyclerView.L.f = true;
        recyclerView.c(true);
        if (!this.a.f.d()) {
            this.a.requestLayout();
        }
    }

    public final void a(int i, int i2, Object obj) {
        this.a.a(null);
        akr akr = this.a.f;
        if (i2 > 0) {
            akr.a.add(akr.a(4, i, i2, obj));
            akr.c |= 4;
            if (akr.a.size() == 1) {
                b();
            }
        }
    }

    public final void b(int i, int i2) {
        this.a.a(null);
        akr akr = this.a.f;
        if (i2 > 0) {
            akr.a.add(akr.a(1, i, i2, null));
            akr.c |= 1;
            if (akr.a.size() == 1) {
                b();
            }
        }
    }

    public final void c(int i, int i2) {
        this.a.a(null);
        akr akr = this.a.f;
        if (i2 > 0) {
            akr.a.add(akr.a(2, i, i2, null));
            akr.c |= 2;
            if (akr.a.size() == 1) {
                b();
            }
        }
    }

    public final void d(int i, int i2) {
        this.a.a(null);
        akr akr = this.a.f;
        if (i != i2) {
            akr.a.add(akr.a(8, i, i2, null));
            akr.c |= 8;
            if (akr.a.size() == 1) {
                b();
            }
        }
    }

    private final void b() {
        if (RecyclerView.c) {
            View view = this.a;
            if (view.r && view.q) {
                abe.a(view, view.j);
                return;
            }
        }
        RecyclerView recyclerView = this.a;
        recyclerView.v = true;
        recyclerView.requestLayout();
    }
}
