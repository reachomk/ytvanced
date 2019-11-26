package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: ate */
final class ate implements Runnable {
    private final /* synthetic */ atk a;
    private final /* synthetic */ ata b;

    ate(ata ata, atk atk) {
        this.b = ata;
        this.a = atk;
    }

    public final void run() {
        RecyclerView recyclerView = this.b.p;
        if (recyclerView != null && recyclerView.q) {
            atk atk = this.a;
            if (!atk.k && atk.e.d() != -1) {
                aph aph = this.b.p.D;
                if (aph == null || !aph.a(null)) {
                    ata ata = this.b;
                    int size = ata.n.size();
                    int i = 0;
                    while (i < size) {
                        if (((atk) ata.n.get(i)).l) {
                            i++;
                        }
                    }
                    this.b.l.c();
                    return;
                }
                this.b.p.post(this);
            }
        }
    }
}
