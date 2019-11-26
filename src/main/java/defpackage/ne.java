package defpackage;

import android.view.View;

/* renamed from: ne */
final class ne implements y {
    private final /* synthetic */ nf a;

    ne(nf nfVar) {
        this.a = nfVar;
    }

    public final void a(af afVar, aa aaVar) {
        if (aaVar == aa.ON_STOP) {
            View view = this.a.K;
            if (view != null) {
                view.cancelPendingInputEvents();
            }
        }
    }
}
