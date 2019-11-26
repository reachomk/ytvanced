package defpackage;

import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: auz */
public final class auz implements OnHierarchyChangeListener {
    private final /* synthetic */ CoordinatorLayout a;

    public auz(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    public final void onChildViewAdded(View view, View view2) {
        OnHierarchyChangeListener onHierarchyChangeListener = this.a.e;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
        this.a.a(2);
        OnHierarchyChangeListener onHierarchyChangeListener = this.a.e;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
