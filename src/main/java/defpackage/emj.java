package defpackage;

import android.graphics.Point;
import com.google.android.apps.youtube.app.common.player.overlay.InlineTimeBar;

/* renamed from: emj */
public final class emj implements Runnable {
    private final /* synthetic */ InlineTimeBar a;

    public emj(InlineTimeBar inlineTimeBar) {
        this.a = inlineTimeBar;
    }

    public final void run() {
        InlineTimeBar inlineTimeBar = this.a;
        inlineTimeBar.a.removeCallbacks(inlineTimeBar.d);
        inlineTimeBar = this.a;
        Point point = inlineTimeBar.j;
        if (point != null) {
            inlineTimeBar.b(point.x);
        }
    }
}
