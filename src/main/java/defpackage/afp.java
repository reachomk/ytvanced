package defpackage;

import android.view.Window.Callback;

/* renamed from: afp */
final class afp implements ajm {
    private boolean a;
    private final /* synthetic */ afk b;

    afp(afk afk) {
        this.b = afk;
    }

    public final boolean a(aiw aiw) {
        Callback callback = this.b.c;
        if (callback == null) {
            return false;
        }
        callback.onMenuOpened(108, aiw);
        return true;
    }

    public final void a(aiw aiw, boolean z) {
        if (!this.a) {
            this.a = true;
            this.b.a.m();
            Callback callback = this.b.c;
            if (callback != null) {
                callback.onPanelClosed(108, aiw);
            }
            this.a = false;
        }
    }
}
