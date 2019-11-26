package defpackage;

import android.view.View;

/* renamed from: fqr */
final /* synthetic */ class fqr implements ejc {
    private final fqo a;

    fqr(fqo fqo) {
        this.a = fqo;
    }

    public final void a(ejd ejd, ejd ejd2) {
        fqo fqo = this.a;
        if (ejd == ejd.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED && ejd2 == ejd.WATCH_WHILE_MAXIMIZED) {
            fqo.av.b();
        }
        View view = fqo.a;
        boolean z = false;
        if (view != null) {
            view.setVisibility(ejd2 == ejd.INLINE_FULLSCREEN ? 8 : 0);
        }
        zcq zcq = fqo.az;
        if (ejd2 == ejd.INLINE_FULLSCREEN) {
            z = true;
        }
        if (zcq.e != z) {
            zcq.e = z;
            zcq.a();
        }
    }
}
