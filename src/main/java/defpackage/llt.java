package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: llt */
public final class llt implements jfj, lml {
    private final lqt a;
    private final jfk b;
    private RecyclerView c;

    public llt(bcaa bcaa, jfk jfk) {
        this.a = ((lum) bcaa.get()).f();
        this.b = jfk;
    }

    public final void a(RecyclerView recyclerView) {
        this.c = recyclerView;
        this.b.a.add(this);
    }

    public final void a() {
        this.b.a.remove(this);
        this.c = null;
    }

    private final void b(int i) {
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            recyclerView.e(i);
        }
    }

    public final void a(int i) {
        int c = this.a.c();
        int d = this.a.d();
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 != 1) {
            if (i2 == 4 && c < d - 1) {
                b(c + 1);
            }
        } else if (c > 0) {
            b(c - 1);
        }
    }
}
