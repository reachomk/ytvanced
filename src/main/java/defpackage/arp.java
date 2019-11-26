package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: arp */
final class arp extends apv {
    private boolean a = false;
    private final /* synthetic */ arm b;

    arp(arm arm) {
        this.b = arm;
    }

    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.a();
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (i != 0 || i2 != 0) {
            this.a = true;
        }
    }
}
