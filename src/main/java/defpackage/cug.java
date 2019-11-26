package defpackage;

import android.view.Choreographer.FrameCallback;

/* renamed from: cug */
public abstract class cug {
    private Runnable a;
    private FrameCallback b;

    public abstract void a(long j);

    /* Access modifiers changed, original: final */
    public final FrameCallback a() {
        if (this.b == null) {
            this.b = new cuf(this);
        }
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final Runnable b() {
        if (this.a == null) {
            this.a = new cui(this);
        }
        return this.a;
    }
}
