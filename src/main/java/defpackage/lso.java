package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: lso */
final class lso extends apv {
    private final /* synthetic */ lsl a;

    lso(lsl lsl) {
        this.a = lsl;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        apn apn = recyclerView.n;
        if ((apn instanceof ans) && apn != null) {
            ans ans = (ans) apn;
            i = ans.w();
            if (ans.p() + i >= ans.C()) {
                int a = this.a.a.a();
                lsl lsl = this.a;
                if (a != lsl.d) {
                    lsl.d = a;
                    lsl.c.a(ajti.NEXT);
                }
            }
        }
    }
}
