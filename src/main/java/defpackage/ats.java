package defpackage;

import android.view.View;
import android.view.Window;

/* renamed from: ats */
final class ats implements y {
    private final /* synthetic */ atq a;

    ats(atq atq) {
        this.a = atq;
    }

    public final void a(af afVar, aa aaVar) {
        if (aaVar == aa.ON_STOP) {
            Window window = this.a.getWindow();
            View peekDecorView = window != null ? window.peekDecorView() : null;
            if (peekDecorView != null) {
                peekDecorView.cancelPendingInputEvents();
            }
        }
    }
}
