package defpackage;

import android.view.View;

/* renamed from: fml */
final /* synthetic */ class fml implements Runnable {
    private final fmf a;
    private final View b;

    fml(fmf fmf, View view) {
        this.a = fmf;
        this.b = view;
    }

    public final void run() {
        fmf fmf = this.a;
        fmf.c.removeView(this.b);
    }
}
