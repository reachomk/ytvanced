package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: abwh */
final class abwh extends apv {
    private final /* synthetic */ abwb a;

    public final void a(RecyclerView recyclerView, int i) {
        abwb abwb = this.a;
        if (recyclerView == abwb.a()) {
            abwb.e = i;
            if (i == 1) {
                abwb.d = false;
            } else if (!abwb.d || abwb.t()) {
                abwb.d = false;
            } else {
                abwb.e();
            }
            abwb.b(abwb.f() ^ 1);
        } else if (recyclerView == abwb.b()) {
            abwb.w();
            abwb.g = i;
            if (i == 1) {
                abwb.f = false;
            } else if (abwb.u()) {
                abwb.f = false;
            } else if (abwb.f) {
                abwb.h();
            } else {
                abwb.v();
            }
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        abwb abwb = this.a;
        if (recyclerView == abwb.a() && i2 < 0) {
            abwb.b(abwb.f() ^ 1);
        }
    }

    /* synthetic */ abwh(abwb abwb) {
        this.a = abwb;
    }
}
