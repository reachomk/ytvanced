package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: loa */
public final class loa extends apv implements lod {
    private final lnr a;
    private int b = 0;

    public loa(lob lob, lnr lnr) {
        lob.a((lod) this);
        this.a = lnr;
    }

    public final void c(int i) {
        this.b = i;
    }

    public final void a(RecyclerView recyclerView, int i) {
        if (i == 2 && this.b == 1 && Math.abs(this.a.c - 4.0f) < 0.01f) {
            this.a.b.start();
        }
    }
}
