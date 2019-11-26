package defpackage;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;

/* renamed from: avr */
final class avr extends avo {
    private final Choreographer b = Choreographer.getInstance();
    private final FrameCallback c = new avq(this);

    avr(avm avm) {
        super(avm);
    }

    public final void a() {
        this.b.postFrameCallback(this.c);
    }
}
