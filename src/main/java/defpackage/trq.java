package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: trq */
public final class trq {
    private static final AtomicLong a = new AtomicLong();
    private static final AtomicInteger b = new AtomicInteger();

    public static angm a() {
        long max;
        angl angl = (angl) angm.d.createBuilder();
        int andIncrement = b.getAndIncrement();
        angl.copyOnWrite();
        angm angm = (angm) angl.instance;
        angm.a |= 2;
        angm.c = (long) andIncrement;
        angn angn = (angn) ango.e.createBuilder();
        angn.copyOnWrite();
        ango ango = (ango) angn.instance;
        ango.a |= 2;
        ango.c = 0;
        angn.copyOnWrite();
        ango = (ango) angn.instance;
        ango.a |= 4;
        ango.d = 0;
        long currentTimeMillis = System.currentTimeMillis() * 1000;
        long j;
        do {
            j = a.get();
            max = Math.max(1 + j, currentTimeMillis);
        } while (!a.compareAndSet(j, max));
        angn.copyOnWrite();
        ango = (ango) angn.instance;
        ango.a |= 1;
        ango.b = max;
        ango ango2 = (ango) ((anxl) angn.build());
        angl.copyOnWrite();
        angm = (angm) angl.instance;
        if (ango2 != null) {
            angm.b = ango2;
            angm.a |= 1;
            return (angm) ((anxl) angl.build());
        }
        throw new NullPointerException();
    }
}
