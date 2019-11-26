package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: jhg */
public final class jhg implements jhj, jhk, jhm {
    public final void a(akot akot, akpk akpk, int i) {
        View K_ = akot.K_();
        xrn.a(K_.getContext(), K_, K_.getContext().getResources().getString(R.string.accessibility_list_item_drag_start, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(akpk.size())}));
    }

    public final void a(akot akot, int i) {
        View K_ = akot.K_();
        String string = K_.getContext().getResources().getString(R.string.accessibility_list_item_drag_over, new Object[]{Integer.valueOf(i + 1)});
        Context context = K_.getContext();
        if (xrn.c(context)) {
            xrn.a(context).interrupt();
        }
        xrn.a(context, K_, string);
    }

    public final void a(akot akot, akpk akpk, int i, int i2) {
        View K_ = akot.K_();
        xrn.a(K_.getContext(), K_, K_.getContext().getResources().getString(R.string.accessibility_list_item_drag_end, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(i2 + 1), Integer.valueOf(akpk.size())}));
    }
}
