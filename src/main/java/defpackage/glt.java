package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.support.design.bottomsheet.BottomSheetBehavior;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: glt */
final /* synthetic */ class glt implements OnShowListener {
    private final glu a;

    glt(glu glu) {
        this.a = glu;
    }

    public final void onShow(DialogInterface dialogInterface) {
        glu glu = this.a;
        Bundle bundle = glu.j;
        if (bundle != null) {
            CoordinatorLayout coordinatorLayout = glu.Z;
            if (coordinatorLayout == null || coordinatorLayout.getParent() == null || !abe.H((View) glu.Z.getParent())) {
                glu.onDismiss(dialogInterface);
            } else {
                BottomSheetBehavior.b((View) glu.Z.getParent()).a(bundle.getInt("COMMENT_HEIGHT_KEY"));
                glu.Z.getParent().requestLayout();
            }
        }
    }
}
