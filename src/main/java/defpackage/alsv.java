package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: alsv */
public final class alsv extends ajps {
    private final alss a;
    private final AtomicBoolean b = new AtomicBoolean();

    public alsv(alss alss) {
        this.a = alss;
    }

    public final void a(ahkn ahkn) {
        if (ahkn.a == airi.VIDEO_PLAYING && this.b.compareAndSet(false, true)) {
            this.a.a();
        }
    }
}
