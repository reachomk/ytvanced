package defpackage;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ffr */
public final class ffr {
    public static final fft a = new fft();
    public static final AtomicBoolean b = new AtomicBoolean();
    public static final FrameCallback c = ffq.a;

    public static void a() {
        xak.a();
        if (b.compareAndSet(false, true)) {
            Choreographer.getInstance().postFrameCallback(c);
        }
    }

    public static void b() {
        xak.a();
        if (b.compareAndSet(true, false)) {
            Choreographer.getInstance().removeFrameCallback(c);
        }
    }
}
