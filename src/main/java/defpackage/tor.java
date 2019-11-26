package defpackage;

import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: tor */
final class tor {
    public final Queue a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    /* synthetic */ tor(Queue queue) {
        this.a = queue;
        for (ByteBuffer flip : this.a) {
            flip.flip();
        }
    }
}
