package defpackage;

import android.view.View;

/* renamed from: suy */
final /* synthetic */ class suy implements bbmk {
    private final suv a;
    private final suq b;

    suy(suv suv, suq suq) {
        this.a = suv;
        this.b = suq;
    }

    public final void a(bbmh bbmh) {
        suv suv = this.a;
        suq suq = this.b;
        sva sva = new sva(suv, bbmh);
        sup suz = new suz(suv, bbmh);
        View view = suv.b;
        if (view != null) {
            view.addOnLayoutChangeListener(sva);
        }
        suq.a(suz);
        bbmh.a(new sux(suv, sva, suq, suz));
    }
}
