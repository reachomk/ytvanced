package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;
import com.google.android.youtube.R;

/* renamed from: jjn */
public final class jjn implements eid {
    public final fos a;
    public final lvj b;
    public View c;
    public kye d;
    public eif e;
    public final Rect f = new Rect();
    public xof g;
    private AccessibilityLayerLayout h;

    public jjn(fos fos, lvj lvj) {
        this.a = fos;
        this.b = lvj;
    }

    public final void a(int i, int i2, int i3, int i4) {
        kye kye = this.d;
        if (!(kye == null || kye.j == null)) {
            int i5 = 0;
            if (!(kye.e.b() == null || kye.e.b().b() == 0)) {
                i5 = i2;
            }
            kye.j.setPadding(i, i5, i3, i4);
        }
        if (this.h == null) {
            View view = this.c;
            if (view != null) {
                this.h = (AccessibilityLayerLayout) view.findViewById(R.id.accessibility_layer_container);
            }
        }
        AccessibilityLayerLayout accessibilityLayerLayout = this.h;
        if (accessibilityLayerLayout != null) {
            LayoutParams layoutParams = (LayoutParams) accessibilityLayerLayout.getLayoutParams();
            layoutParams.leftMargin = i;
            layoutParams.topMargin = i2;
            layoutParams.rightMargin = i3;
            layoutParams.bottomMargin = i4;
            accessibilityLayerLayout.setLayoutParams(layoutParams);
        }
    }

    public final Rect a() {
        return this.f;
    }

    public final xof b() {
        return this.g;
    }
}
