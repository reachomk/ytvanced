package defpackage;

import android.view.View;

/* renamed from: fmk */
final /* synthetic */ class fmk implements Runnable {
    private final fmf a;
    private final View b;

    fmk(fmf fmf, View view) {
        this.a = fmf;
        this.b = view;
    }

    public final void run() {
        fmf fmf = this.a;
        View view = this.b;
        if (fmf.l == null || view != fmf.m) {
            fmf.c();
            fmf.l = new fmo(fmf, view, view.getHeight());
            fmf.a.a(fmf.l);
            fmf.m = view;
            return;
        }
        fmf.a.p();
    }
}
