package defpackage;

import android.view.Choreographer.FrameCallback;

/* renamed from: cuf */
final class cuf implements FrameCallback {
    private final /* synthetic */ cug a;

    cuf(cug cug) {
        this.a = cug;
    }

    public final void doFrame(long j) {
        this.a.a(j);
    }
}
