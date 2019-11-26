package defpackage;

import android.view.MenuItem;

/* renamed from: afo */
final class afo implements aiv {
    private final /* synthetic */ afk a;

    afo(afk afk) {
        this.a = afk;
    }

    public final boolean a(aiw aiw, MenuItem menuItem) {
        return false;
    }

    public final void a(aiw aiw) {
        afk afk = this.a;
        if (afk.c == null) {
            return;
        }
        if (afk.a.h()) {
            this.a.c.onPanelClosed(108, aiw);
        } else if (this.a.c.onPreparePanel(0, null, aiw)) {
            this.a.c.onMenuOpened(108, aiw);
        }
    }
}
