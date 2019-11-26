package defpackage;

import android.media.session.MediaController.TransportControls;

/* renamed from: wo */
final class wo extends wp {
    private final TransportControls a;

    wo(TransportControls transportControls) {
        this.a = transportControls;
    }

    public final void a() {
        this.a.play();
    }

    public final void b() {
        this.a.pause();
    }

    public final void c() {
        this.a.stop();
    }
}
