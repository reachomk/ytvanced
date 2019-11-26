package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.youtube.R;

/* renamed from: glu */
public final class glu extends fi {
    public CoordinatorLayout Z;
    public goq aa;

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((glw) xse.a(p())).a(this);
        a(0, (int) R.style.ReelBottomSheetDialogTheme);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aa.a();
        this.c.setOnShowListener(new glt(this));
        return this.Z;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        CoordinatorLayout coordinatorLayout = this.Z;
        if (!(coordinatorLayout == null || coordinatorLayout.getParent() == null)) {
            ((ViewGroup) this.Z.getParent()).removeView(this.Z);
            this.Z = null;
        }
        this.aa.b();
        super.onDismiss(dialogInterface);
    }
}
