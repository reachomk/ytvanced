package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: cdp */
final class cdp {
    private final Queue a = chv.a(0);

    cdp() {
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized bsd a(ByteBuffer byteBuffer) {
        bsd bsd;
        bsd = (bsd) this.a.poll();
        if (bsd == null) {
            bsd = new bsd();
        }
        bsd.b = null;
        Arrays.fill(bsd.a, (byte) 0);
        bsd.c = new bse();
        bsd.d = 0;
        bsd.b = byteBuffer.asReadOnlyBuffer();
        bsd.b.position(0);
        bsd.b.order(ByteOrder.LITTLE_ENDIAN);
        return bsd;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(bsd bsd) {
        bsd.b = null;
        bsd.c = null;
        this.a.offer(bsd);
    }
}
