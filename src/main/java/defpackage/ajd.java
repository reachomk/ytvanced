package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: ajd */
final class ajd extends FrameLayout implements ahx {
    public final CollapsibleActionView a;

    ajd(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }

    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }
}
