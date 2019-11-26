package defpackage;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

/* renamed from: ajf */
final class ajf implements OnMenuItemClickListener {
    private final OnMenuItemClickListener a;
    private final /* synthetic */ ajc b;

    ajf(ajc ajc, OnMenuItemClickListener onMenuItemClickListener) {
        this.b = ajc;
        this.a = onMenuItemClickListener;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.a.onMenuItemClick(this.b.a(menuItem));
    }
}
