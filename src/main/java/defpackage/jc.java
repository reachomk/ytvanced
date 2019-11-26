package defpackage;

import android.support.design.snackbar.BaseTransientBottomBar;

/* renamed from: jc */
final class jc implements jh {
    private final /* synthetic */ BaseTransientBottomBar a;

    jc(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    public final void a() {
        BaseTransientBottomBar baseTransientBottomBar = this.a;
        baseTransientBottomBar.e.a = null;
        if (baseTransientBottomBar.i()) {
            this.a.e();
        } else {
            this.a.g();
        }
    }
}
