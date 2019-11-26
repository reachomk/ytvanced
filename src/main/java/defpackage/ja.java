package defpackage;

import android.support.design.snackbar.BaseTransientBottomBar;

/* renamed from: ja */
final class ja implements je {
    public final /* synthetic */ BaseTransientBottomBar a;

    ja(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    public final void a() {
        Object obj;
        BaseTransientBottomBar baseTransientBottomBar = this.a;
        jm a = jm.a();
        jn jnVar = baseTransientBottomBar.i;
        synchronized (a.a) {
            obj = 1;
            if (!a.c(jnVar)) {
                if (!a.d(jnVar)) {
                    obj = null;
                }
            }
        }
        if (obj != null) {
            BaseTransientBottomBar.a.post(new iz(this));
        }
    }
}
