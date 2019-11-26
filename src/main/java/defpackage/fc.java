package defpackage;

import android.support.design.bottomsheet.BottomSheetBehavior;
import android.view.View;

/* renamed from: fc */
public final class fc implements Runnable {
    private final View a;
    private final int b;
    private final /* synthetic */ BottomSheetBehavior c;

    public fc(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.c = bottomSheetBehavior;
        this.a = view;
        this.b = i;
    }

    public final void run() {
        ado ado = this.c.l;
        if (ado == null || !ado.b()) {
            BottomSheetBehavior bottomSheetBehavior = this.c;
            if (bottomSheetBehavior.k == 2) {
                bottomSheetBehavior.c(this.b);
                return;
            }
            return;
        }
        abe.a(this.a, (Runnable) this);
    }
}
