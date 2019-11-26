package defpackage;

import android.view.MenuItem;
import android.widget.ImageButton;
import com.google.android.youtube.R;

/* renamed from: isa */
final class isa implements ezu, ezx {
    public MenuItem a;
    public final /* synthetic */ irr b;

    isa(irr irr) {
        this.b = irr;
    }

    public final int a() {
        return R.id.menu_filter_results;
    }

    public final boolean b() {
        return false;
    }

    public final boolean b(MenuItem menuItem) {
        return true;
    }

    public final int c() {
        return R.menu.search_results_menu;
    }

    public final ezx d() {
        return this;
    }

    public final void a(xoe xoe, int i) {
        if (xoe != null) {
            ImageButton e = e();
            if (e != null) {
                e.setImageDrawable(xoe.a(e.getContext().getResources().getDrawable(R.drawable.ic_menu_filter_mtrl_alpha).mutate(), i));
            }
        }
    }

    public final void a(MenuItem menuItem) {
        this.a = menuItem;
        a(this.b.at.c());
        if (this.b.at.g() == null) {
            a(false);
        }
        ImageButton e = e();
        if (e != null) {
            e.setOnClickListener(new isd(this));
        }
    }

    public final void a(boolean z) {
        MenuItem menuItem = this.a;
        if (menuItem != null) {
            menuItem.setEnabled(z);
        }
    }

    private final ImageButton e() {
        MenuItem menuItem = this.a;
        return menuItem != null ? (ImageButton) menuItem.getActionView() : null;
    }
}
