package defpackage;

import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;
import com.google.android.youtube.R;

/* renamed from: acwo */
public final class acwo implements OnHierarchyChangeListener {
    private final acvx a;

    public acwo(acvx acvx) {
        this.a = acvx;
    }

    public final void onChildViewAdded(View view, View view2) {
        if (this.a.c() != null) {
            Object tag = view2.getTag(R.id.logging_directable_supplier_tag);
            if (tag instanceof acwn) {
                acwn acwn = (acwn) tag;
                this.a.a(acwn.a, acwn.b);
            }
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
        if (this.a.c() != null) {
            Object tag = view2.getTag(R.id.logging_directable_supplier_tag);
            if (tag instanceof acwn) {
                this.a.a(((acwn) tag).a);
            }
        }
    }
}
