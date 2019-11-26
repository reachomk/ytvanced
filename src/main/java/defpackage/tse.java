package defpackage;

import android.view.Choreographer.FrameCallback;

/* renamed from: tse */
final class tse implements FrameCallback {
    private final /* synthetic */ tsf a;

    tse(tsf tsf) {
        this.a = tsf;
    }

    public final void doFrame(long j) {
        this.a.a(j);
    }
}
