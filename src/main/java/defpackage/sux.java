package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: sux */
final /* synthetic */ class sux implements bbnt {
    private final suv a;
    private final OnLayoutChangeListener b;
    private final suq c;
    private final sup d;

    sux(suv suv, OnLayoutChangeListener onLayoutChangeListener, suq suq, sup sup) {
        this.a = suv;
        this.b = onLayoutChangeListener;
        this.c = suq;
        this.d = sup;
    }

    public final void a() {
        suv suv = this.a;
        OnLayoutChangeListener onLayoutChangeListener = this.b;
        suq suq = this.c;
        sup sup = this.d;
        View view = suv.b;
        if (view != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        suq.b(sup);
    }
}
