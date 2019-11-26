package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: dau */
final class dau implements Runnable {
    private final /* synthetic */ dad a;

    dau(dad dad) {
        this.a = dad;
    }

    public final void run() {
        RecyclerView recyclerView = this.a.u;
        if (recyclerView == null || !recyclerView.q()) {
            if (this.a.A.a()) {
                this.a.A.a(1);
            }
            this.a.B = 0;
            return;
        }
        recyclerView = this.a.u;
        if (recyclerView.q && recyclerView.getVisibility() != 8) {
            dad dad = this.a;
            int i = dad.B;
            if (i >= 3) {
                dad.B = 0;
                if (this.a.A.a()) {
                    this.a.A.a(1);
                }
                return;
            }
            dad.B = i + 1;
            abe.a(dad.u, dad.D);
            return;
        }
        this.a.B = 0;
    }
}
