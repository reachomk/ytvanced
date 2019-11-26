package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: apb */
public final class apb implements akt {
    private final /* synthetic */ RecyclerView a;

    public apb(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final aqj a(int i) {
        aqj a = this.a.a(i, true);
        if (a == null || this.a.g.d(a.a)) {
            return null;
        }
        return a;
    }

    public final void a(int i, int i2) {
        this.a.a(i, i2, true);
        RecyclerView recyclerView = this.a;
        recyclerView.N = true;
        aqh aqh = recyclerView.L;
        aqh.c += i2;
    }

    public final void b(int i, int i2) {
        this.a.a(i, i2, false);
        this.a.N = true;
    }

    public final void a(int i, int i2, Object obj) {
        int i3;
        RecyclerView recyclerView = this.a;
        int b = recyclerView.g.b();
        i2 += i;
        for (i3 = 0; i3 < b; i3++) {
            View c = recyclerView.g.c(i3);
            aqj d = RecyclerView.d(c);
            if (!(d == null || d.b())) {
                int i4 = d.c;
                if (i4 >= i && i4 < i2) {
                    d.b(2);
                    d.a(obj);
                    ((apr) c.getLayoutParams()).e = true;
                }
            }
        }
        apw apw = recyclerView.e;
        int size = apw.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                aqj aqj = (aqj) apw.c.get(size);
                if (aqj != null) {
                    i3 = aqj.c;
                    if (i3 >= i && i3 < i2) {
                        aqj.b(2);
                        apw.b(size);
                    }
                }
            } else {
                this.a.O = true;
                return;
            }
        }
    }

    public final void a(aks aks) {
        c(aks);
    }

    private final void c(aks aks) {
        int i = aks.a;
        if (i == 1) {
            this.a.n.b();
        } else if (i == 2) {
            this.a.n.d();
        } else if (i == 4) {
            this.a.n.e();
        } else if (i == 8) {
            this.a.n.f();
        }
    }

    public final void b(aks aks) {
        c(aks);
    }

    public final void c(int i, int i2) {
        int i3;
        aqj d;
        RecyclerView recyclerView = this.a;
        int b = recyclerView.g.b();
        int i4 = 0;
        for (i3 = 0; i3 < b; i3++) {
            d = RecyclerView.d(recyclerView.g.c(i3));
            if (!(d == null || d.b() || d.c < i)) {
                d.a(i2, false);
                recyclerView.L.f = true;
            }
        }
        apw apw = recyclerView.e;
        i3 = apw.c.size();
        while (i4 < i3) {
            d = (aqj) apw.c.get(i4);
            if (d != null && d.c >= i) {
                d.a(i2, true);
            }
            i4++;
        }
        recyclerView.requestLayout();
        this.a.N = true;
    }

    public final void d(int i, int i2) {
        int i3;
        RecyclerView recyclerView = this.a;
        int b = recyclerView.g.b();
        int i4 = i < i2 ? -1 : 1;
        int i5 = i < i2 ? i2 : i;
        int i6 = i < i2 ? i : i2;
        for (i3 = 0; i3 < b; i3++) {
            aqj d = RecyclerView.d(recyclerView.g.c(i3));
            if (d != null) {
                int i7 = d.c;
                if (i7 >= i6 && i7 <= i5) {
                    if (i7 == i) {
                        d.a(i2 - i, false);
                    } else {
                        d.a(i4, false);
                    }
                    recyclerView.L.f = true;
                }
            }
        }
        apw apw = recyclerView.e;
        i3 = apw.c.size();
        for (int i8 = 0; i8 < i3; i8++) {
            aqj aqj = (aqj) apw.c.get(i8);
            if (aqj != null) {
                int i9 = aqj.c;
                if (i9 >= i6 && i9 <= i5) {
                    if (i9 == i) {
                        aqj.a(i2 - i, false);
                    } else {
                        aqj.a(i4, false);
                    }
                }
            }
        }
        recyclerView.requestLayout();
        this.a.N = true;
    }
}
