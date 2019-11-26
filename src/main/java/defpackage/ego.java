package defpackage;

import android.view.View;

/* renamed from: ego */
final class ego implements Runnable {
    private final /* synthetic */ View a;
    private final /* synthetic */ egl b;

    ego(egl egl, View view) {
        this.b = egl;
        this.a = view;
    }

    public final void run() {
        this.b.Z = this.a.getMeasuredWidth();
        this.b.aa = this.a.getMeasuredHeight();
        this.b.W();
    }
}
