package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Objects;

/* renamed from: auv */
public final class auv implements aba {
    private final /* synthetic */ CoordinatorLayout a;

    public auv(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    public final abx a(View view, abx abx) {
        CoordinatorLayout coordinatorLayout = this.a;
        if (!Objects.equals(coordinatorLayout.c, abx)) {
            coordinatorLayout.c = abx;
            boolean z = true;
            boolean z2 = abx != null && abx.b() > 0;
            coordinatorLayout.d = z2;
            if (z2 || coordinatorLayout.getBackground() != null) {
                z = false;
            }
            coordinatorLayout.setWillNotDraw(z);
            if (!abx.e()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (abe.v(childAt) && ((auy) childAt.getLayoutParams()).a != null && abx.e()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return abx;
    }
}
