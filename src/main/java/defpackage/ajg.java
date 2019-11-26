package defpackage;

import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;

/* renamed from: ajg */
final class ajg implements OnActionExpandListener {
    private final OnActionExpandListener a;
    private final /* synthetic */ ajc b;

    ajg(ajc ajc, OnActionExpandListener onActionExpandListener) {
        this.b = ajc;
        this.a = onActionExpandListener;
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.a.onMenuItemActionExpand(this.b.a(menuItem));
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.a.onMenuItemActionCollapse(this.b.a(menuItem));
    }
}
