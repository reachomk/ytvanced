package defpackage;

import android.support.design.bottomsheet.BottomSheetBehavior;
import android.view.View;

/* renamed from: ex */
public final class ex implements Runnable {
    private final /* synthetic */ View a;
    private final /* synthetic */ int b;
    private final /* synthetic */ BottomSheetBehavior c;

    public ex(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.c = bottomSheetBehavior;
        this.a = view;
        this.b = i;
    }

    public final void run() {
        this.c.b(this.a, this.b);
    }
}
