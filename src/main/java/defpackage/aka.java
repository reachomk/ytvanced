package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;

/* renamed from: aka */
public final class aka implements Runnable {
    private final /* synthetic */ ActionBarOverlayLayout a;

    public aka(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    public final void run() {
        this.a.a();
        ActionBarOverlayLayout actionBarOverlayLayout = this.a;
        actionBarOverlayLayout.h = actionBarOverlayLayout.b.animate().translationY((float) (-this.a.b.getHeight())).setListener(this.a.i);
    }
}
