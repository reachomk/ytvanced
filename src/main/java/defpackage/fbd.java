package defpackage;

import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;

/* renamed from: fbd */
public final /* synthetic */ class fbd implements Runnable {
    private final BottomUiContainer a;

    public fbd(BottomUiContainer bottomUiContainer) {
        this.a = bottomUiContainer;
    }

    public final void run() {
        BottomUiContainer bottomUiContainer = this.a;
        View view = bottomUiContainer.d;
        if (view != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
            bottomUiContainer.c(BottomUiContainer.a(bottomUiContainer.d, marginLayoutParams.bottomMargin + marginLayoutParams.topMargin));
        }
    }
}
