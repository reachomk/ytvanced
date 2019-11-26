package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: gmf */
final class gmf extends apv {
    private int a = -1;
    private final /* synthetic */ ans b;
    private final /* synthetic */ gmd c;

    gmf(gmd gmd, ans ans) {
        this.c = gmd;
        this.b = ans;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
    }

    public final void a(RecyclerView recyclerView, int i) {
        if (i != 0) {
            this.a = this.c.i;
            return;
        }
        int q = this.b.q();
        if (q != -1) {
            gmd gmd = this.c;
            gmd.i = q;
            q = this.a;
            if (q != -1) {
                gmm gmm = ((gmj) gmd.f.c.get(q)).c;
                if (gmm != null) {
                    goe goe = gmm.p.e;
                    if (goe != null) {
                        goe.b(this.a == this.c.i);
                    }
                }
                this.a = -1;
            }
            this.c.b();
        }
    }
}
