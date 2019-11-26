package defpackage;

import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;

/* renamed from: hjd */
final /* synthetic */ class hjd implements Runnable {
    private final hja a;
    private final SlimStatusBar b;

    hjd(hja hja, SlimStatusBar slimStatusBar) {
        this.a = hja;
        this.b = slimStatusBar;
    }

    public final void run() {
        hja hja = this.a;
        hja.k = hja.i.a(this.b, hja.b, hja.c);
        hja.k.start();
    }
}
