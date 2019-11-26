package defpackage;

import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

/* renamed from: asb */
public final class asb implements akp {
    private final /* synthetic */ Toolbar a;

    public asb(Toolbar toolbar) {
        this.a = toolbar;
    }

    public final boolean a(MenuItem menuItem) {
        ase ase = this.a.q;
        if (ase == null) {
            return false;
        }
        return ase.a(menuItem);
    }
}
