package defpackage;

import android.view.Choreographer;

/* renamed from: tsh */
final class tsh extends tsd {
    private final Choreographer a = Choreographer.getInstance();

    public final void a(tsf tsf) {
        this.a.postFrameCallback(tsf.a());
    }

    public final void b(tsf tsf) {
        this.a.removeFrameCallback(tsf.a());
    }
}
