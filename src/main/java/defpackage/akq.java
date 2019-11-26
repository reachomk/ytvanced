package defpackage;

import android.support.v7.widget.ActionMenuView;
import android.view.MenuItem;

/* renamed from: akq */
public final class akq implements aiv {
    private final /* synthetic */ ActionMenuView a;

    public akq(ActionMenuView actionMenuView) {
        this.a = actionMenuView;
    }

    public final boolean a(aiw aiw, MenuItem menuItem) {
        akp akp = this.a.e;
        return akp != null && akp.a(menuItem);
    }

    public final void a(aiw aiw) {
        aiv aiv = this.a.d;
        if (aiv != null) {
            aiv.a(aiw);
        }
    }
}
