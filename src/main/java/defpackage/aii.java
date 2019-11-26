package defpackage;

import android.support.v7.view.menu.ActionMenuItemView;

/* renamed from: aii */
public final class aii extends and {
    private final /* synthetic */ ActionMenuItemView c;

    public aii(ActionMenuItemView actionMenuItemView) {
        this.c = actionMenuItemView;
        super(actionMenuItemView);
    }

    public final ajq a() {
        aik aik = this.c.c;
        return aik != null ? aik.a() : null;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b() {
        ActionMenuItemView actionMenuItemView = this.c;
        aiy aiy = actionMenuItemView.b;
        if (aiy != null && aiy.a(actionMenuItemView.a)) {
            ajq a = a();
            if (a != null && a.e()) {
                return true;
            }
        }
        return false;
    }
}
