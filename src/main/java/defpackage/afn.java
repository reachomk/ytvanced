package defpackage;

import android.view.Menu;

/* renamed from: afn */
final class afn implements Runnable {
    private final /* synthetic */ afk a;

    afn(afk afk) {
        this.a = afk;
    }

    public final void run() {
        afk afk = this.a;
        Menu p = afk.p();
        aiw aiw = p instanceof aiw ? (aiw) p : null;
        if (aiw != null) {
            aiw.f();
        }
        try {
            p.clear();
            if (!(afk.c.onCreatePanelMenu(0, p) && afk.c.onPreparePanel(0, null, p))) {
                p.clear();
            }
            if (aiw != null) {
                aiw.g();
            }
        } catch (Throwable th) {
            if (aiw != null) {
                aiw.g();
            }
        }
    }
}
