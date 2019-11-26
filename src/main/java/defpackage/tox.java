package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* renamed from: tox */
final class tox extends tpa {
    private final /* synthetic */ bclb a;
    private final /* synthetic */ tou b;

    tox(tou tou, bre bre, bclb bclb) {
        this.b = tou;
        this.a = bclb;
        super(bre);
    }

    public final void run() {
        tou tou = this.b;
        bclb bclb = this.a;
        toq toq = tou.f;
        toq.b = new RuntimeException();
        ArrayDeque arrayDeque = toq.a;
        toq.a = null;
        tor tor = new tor(arrayDeque);
        if (tor.b.compareAndSet(false, true)) {
            ByteBuffer allocateDirect;
            if (tor.a.size() == 0) {
                allocateDirect = ByteBuffer.allocateDirect(0);
            } else if (tor.a.size() == 1) {
                allocateDirect = (ByteBuffer) tor.a.remove();
            } else {
                int i = 0;
                for (ByteBuffer remaining : tor.a) {
                    i += remaining.remaining();
                }
                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i);
                while (!tor.a.isEmpty()) {
                    allocateDirect2.put((ByteBuffer) tor.a.remove());
                }
                allocateDirect2.flip();
                allocateDirect = allocateDirect2;
            }
            tou.a(bclb, null, false, allocateDirect);
            return;
        }
        throw new IllegalStateException("This BufferRope has already been consumed");
    }
}
