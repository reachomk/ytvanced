package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: gul */
final class gul implements apq {
    private final /* synthetic */ RecyclerView a;
    private final /* synthetic */ gub b;

    gul(gub gub, RecyclerView recyclerView) {
        this.b = gub;
        this.a = recyclerView;
    }

    public final void a(View view) {
    }

    public final void a() {
        zyw zyw = this.b.bk;
        apxn a = zyw.a();
        if (foh.h(zyw) && foh.i(zyw) && a != null) {
            aulu aulu = a.e;
            if (aulu == null) {
                aulu = aulu.bw;
            }
            if (aulu.n) {
                kyp kyp = this.b.aV;
                RecyclerView recyclerView = this.a;
                if (kyp.b()) {
                    View c = recyclerView.n.c(2);
                    if (c != null && (((akpd) recyclerView.m).getItem(2) instanceof azem)) {
                        azem azem = (azem) ((akpd) recyclerView.m).getItem(2);
                        if (azem != null) {
                            azeq azeq = azem.p;
                            if (azeq == null) {
                                azeq = azeq.c;
                            }
                            avdd avdd = azeq.b;
                            if (avdd == null) {
                                avdd = avdd.d;
                            }
                            if ((avdd.a & 1) != 0) {
                                kyp.j.a(c);
                                kyp.b.a(kyp.j);
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                this.a.b((apq) this);
            }
        }
    }
}
