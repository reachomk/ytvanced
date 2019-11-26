package defpackage;

import android.view.View;

/* renamed from: anz */
final class anz implements Runnable {
    private final /* synthetic */ aoa a;

    anz(aoa aoa) {
        this.a = aoa;
    }

    public final void run() {
        View view = this.a.m;
        if (view != null && view.getWindowToken() != null) {
            this.a.f_();
        }
    }
}
