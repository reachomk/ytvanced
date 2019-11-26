package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.support.design.bottomsheet.BottomSheetBehavior;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* renamed from: absq */
public final class absq extends fi implements OnDismissListener, OnShowListener {
    public boolean Z;
    public View aa;

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.aa;
    }

    public final Dialog a(Bundle bundle) {
        Dialog a = super.a(bundle);
        a.setOnShowListener(this);
        a.setOnDismissListener(this);
        return a;
    }

    public final void N_() {
        this.Z = false;
        super.N_();
    }

    public final void onShow(DialogInterface dialogInterface) {
        if (dialogInterface instanceof ff) {
            BottomSheetBehavior.b((FrameLayout) ((ff) dialogInterface).findViewById(R.id.design_bottom_sheet)).b(3);
            this.Z = true;
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.Z = false;
    }
}
