package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: fmp */
final class fmp extends apv {
    private final /* synthetic */ fmf a;

    fmp(fmf fmf) {
        this.a = fmf;
    }

    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            fmf fmf = this.a;
            if (fma.a(fmf.d.d(), 32)) {
                fmr fmr = fmf.h;
                if (!fmr.e && !fmr.f) {
                    View a = fmf.a(fmf.a.n);
                    if (a != null) {
                        float a2 = fmf.a(a, fmf.g);
                        if (a2 > 0.0f && a2 < 1.0f) {
                            fmf.h.b = fmf.d.c();
                            aqc aqc = fmf.h;
                            aqc.i = a2 < 0.5f ? (int) fmf.g : 0;
                            fmf.a.n.a(aqc);
                        }
                    }
                }
            }
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        this.a.b();
    }
}
