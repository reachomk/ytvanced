package defpackage;

import android.content.Context;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

/* renamed from: aje */
final class aje extends ajb implements VisibilityListener {
    private aak c;

    aje(ajc ajc, Context context, ActionProvider actionProvider) {
        super(ajc, context, actionProvider);
    }

    public final View a(MenuItem menuItem) {
        return this.b.onCreateActionView(menuItem);
    }

    public final boolean b() {
        return this.b.overridesItemVisibility();
    }

    public final boolean c() {
        return this.b.isVisible();
    }

    public final void a(aak aak) {
        this.c = aak;
        this.b.setVisibilityListener(this);
    }

    public final void onActionProviderVisibilityChanged(boolean z) {
        aak aak = this.c;
        if (aak != null) {
            aak.a();
        }
    }
}
