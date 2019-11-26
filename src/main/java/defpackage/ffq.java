package defpackage;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;

/* renamed from: ffq */
final /* synthetic */ class ffq implements FrameCallback {
    public static final FrameCallback a = new ffq();

    private ffq() {
    }

    public final void doFrame(long j) {
        fft fft = ffr.a;
        fft.a++;
        if (ffr.b.get()) {
            Choreographer.getInstance().postFrameCallback(ffr.c);
        }
    }
}
