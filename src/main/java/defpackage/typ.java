package defpackage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* renamed from: typ */
final class typ implements tym, udc {
    private final tzu b;
    private final BlockingQueue c;

    typ(tzu tzu) {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(5);
        this.b = tzu;
        this.c = arrayBlockingQueue;
    }

    public final void a(bcfe bcfe) {
        if ((bcfe.a & 8388608) == 0) {
            tzu tzu = (tzu) this.c.poll();
            if (tzu != null) {
                bcfd bcfd = (bcfd) ((anxo) bcfe.toBuilder());
                bcem bcem = (bcem) tzu.a();
                if (bcem != null) {
                    bcfd.copyOnWrite();
                    bcfe bcfe2 = (bcfe) bcfd.instance;
                    bcfe2.v = bcem;
                    bcfe2.a |= 8388608;
                }
                bcfe = (bcfe) ((anxl) bcfd.build());
            }
        }
        ((udc) uhy.a((udc) this.b.a())).a(bcfe);
    }

    public final void a(tzu tzu) {
        if (!this.c.offer(tzu)) {
            tyv.d("PrimesForPrimes", "Queue overflow", new Object[0]);
        }
    }
}
