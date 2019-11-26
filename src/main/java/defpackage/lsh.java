package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: lsh */
final class lsh extends apv implements ltr {
    private final /* synthetic */ lru a;

    public final void a(Object obj) {
        akoh akoh = this.a.h.d;
        if (akoh != null && akoh.c(0) == obj) {
            View c = this.a.g.c(0);
            if (c != null) {
                this.a.f.a(0, Math.max(c.getHeight() - this.a.f.computeVerticalScrollOffset(), 0));
            }
        }
    }

    public final void a(RecyclerView recyclerView, int i) {
        if (i == 1) {
            this.a.i.g = true;
        } else if (i == 0) {
            lru lru = this.a;
            lru.b.a(lru.c);
        }
    }

    /* synthetic */ lsh(lru lru) {
        this.a = lru;
    }
}
