package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;

/* renamed from: hjf */
final /* synthetic */ class hjf implements Runnable {
    private final hja a;
    private final ViewGroup b;
    private final SlimStatusBar c;

    hjf(hja hja, ViewGroup viewGroup, SlimStatusBar slimStatusBar) {
        this.a = hja;
        this.b = viewGroup;
        this.c = slimStatusBar;
    }

    public final void run() {
        hja hja = this.a;
        ViewGroup viewGroup = this.b;
        SlimStatusBar slimStatusBar = this.c;
        hja.b(viewGroup, slimStatusBar);
        viewGroup.removeView(slimStatusBar);
        viewGroup.setTouchDelegate(null);
        hja.j = 0;
    }
}
