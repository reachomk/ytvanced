package defpackage;

import android.view.View;

/* renamed from: fmi */
final /* synthetic */ class fmi implements Runnable {
    private final fmf a;
    private final View b;
    private final int c;
    private final apn d;

    fmi(fmf fmf, View view, int i, apn apn) {
        this.a = fmf;
        this.b = view;
        this.c = i;
        this.d = apn;
    }

    public final void run() {
        fmf fmf = this.a;
        View view = this.b;
        int i = this.c;
        apn apn = this.d;
        fmf.k = false;
        if (fma.b(fmf.d.f())) {
            if (view != null) {
                fmf.c.removeView(view);
            }
            apa apa = fmf.b;
            aqj b = apa.b(fmf.c, apa.a(i));
            fmf.i = b.a;
            fmf.b.a(b, i);
            fmf.j = fmf.d.g();
            fmf.c.addView(fmf.i);
            if (view == null && fmf.d.g() != Long.MAX_VALUE) {
                view = apn.c(i);
                if (view != null) {
                    fmf.e.a(view, fmf.i);
                    return;
                }
                return;
            }
            return;
        }
        fmf.b();
    }
}
