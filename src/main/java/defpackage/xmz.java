package defpackage;

import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;

/* renamed from: xmz */
public final class xmz implements OnHierarchyChangeListener {
    private final /* synthetic */ AccessibilityLayerLayout a;

    public final void onChildViewAdded(View view, View view2) {
        AccessibilityLayerLayout accessibilityLayerLayout = this.a;
        if (accessibilityLayerLayout.d == null) {
            accessibilityLayerLayout.d = accessibilityLayerLayout.findViewById(accessibilityLayerLayout.b);
        }
        accessibilityLayerLayout = this.a;
        if (accessibilityLayerLayout.e == null) {
            accessibilityLayerLayout.e = accessibilityLayerLayout.findViewById(accessibilityLayerLayout.c);
        }
        this.a.a();
    }

    public final void onChildViewRemoved(View view, View view2) {
        AccessibilityLayerLayout accessibilityLayerLayout = this.a;
        view2 = accessibilityLayerLayout.d;
        if (view2 != null && accessibilityLayerLayout.indexOfChild(view2) == -1) {
            this.a.d = null;
        }
        accessibilityLayerLayout = this.a;
        view2 = accessibilityLayerLayout.e;
        if (view2 != null && accessibilityLayerLayout.indexOfChild(view2) == -1) {
            this.a.e = null;
        }
        this.a.a();
    }

    public /* synthetic */ xmz(AccessibilityLayerLayout accessibilityLayerLayout) {
        this.a = accessibilityLayerLayout;
    }
}
