package defpackage;

import android.app.Dialog;

/* renamed from: pxi */
final class pxi extends pwf {
    private final /* synthetic */ Dialog a;
    private final /* synthetic */ pxj b;

    pxi(pxj pxj, Dialog dialog) {
        this.b = pxj;
        this.a = dialog;
    }

    public final void a() {
        this.b.a.f();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
