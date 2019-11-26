package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;

/* renamed from: xmx */
public final class xmx extends aaj {
    private final /* synthetic */ AccessibilityLayerLayout b;

    public final void a(View view, aca aca) {
        this.b.a();
        super.a(view, aca);
    }

    public final boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        boolean z = false;
        if (!this.b.a(view)) {
            return false;
        }
        LayoutParams layoutParams = viewGroup.getLayoutParams();
        LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams.width == layoutParams2.width && layoutParams.height == layoutParams2.height) {
            z = true;
        }
        accessibilityEvent.setFullScreen(z);
        return super.a(viewGroup, view, accessibilityEvent);
    }

    public /* synthetic */ xmx(AccessibilityLayerLayout accessibilityLayerLayout) {
        this.b = accessibilityLayerLayout;
        Rect rect = new Rect();
    }
}
