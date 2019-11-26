package defpackage;

import android.view.Choreographer.FrameCallback;

/* renamed from: tsf */
public abstract class tsf {
    private FrameCallback a;

    public abstract void a(long j);

    /* Access modifiers changed, original: final */
    public final FrameCallback a() {
        if (this.a == null) {
            this.a = new tse(this);
        }
        return this.a;
    }
}
