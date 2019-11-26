package defpackage;

import android.content.Context;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

/* renamed from: ajb */
class ajb extends aal {
    public final ActionProvider b;
    private final /* synthetic */ ajc c;

    ajb(ajc ajc, Context context, ActionProvider actionProvider) {
        this.c = ajc;
        this.b = actionProvider;
    }

    public final View a() {
        return this.b.onCreateActionView();
    }

    public final boolean d() {
        return this.b.onPerformDefaultAction();
    }

    public final boolean e() {
        return this.b.hasSubMenu();
    }

    public final void a(SubMenu subMenu) {
        this.b.onPrepareSubMenu(this.c.a(subMenu));
    }
}
