package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;

/* renamed from: akb */
public final class akb implements Runnable {
    private final /* synthetic */ ActionBarOverlayLayout a;

    public akb(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    public final void run() {
        this.a.a();
        ActionBarOverlayLayout actionBarOverlayLayout = this.a;
        actionBarOverlayLayout.h = actionBarOverlayLayout.b.animate().translationY(0.0f).setListener(this.a.i);
    }
}
