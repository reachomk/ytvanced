package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: bbxc */
public final class bbxc extends AtomicReferenceArray implements bbpd {
    private static final Integer a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    public static final long serialVersionUID = -1296597691183856449L;
    private final int b = (length() - 1);
    private final AtomicLong c = new AtomicLong();
    private long d;
    private final AtomicLong e = new AtomicLong();
    private final int f;

    public bbxc(int i) {
        super(bbzc.a(i));
        this.f = Math.min(i / 4, a.intValue());
    }

    public final boolean a(Object obj) {
        if (obj != null) {
            int i = this.b;
            long j = this.c.get();
            int i2 = ((int) j) & i;
            if (j >= this.d) {
                long j2 = ((long) this.f) + j;
                if (get(i & ((int) j2)) == null) {
                    this.d = j2;
                } else if (get(i2) != null) {
                    return false;
                }
            }
            lazySet(i2, obj);
            this.c.lazySet(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public final Object bI_() {
        long j = this.e.get();
        int i = ((int) j) & this.b;
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        this.e.lazySet(j + 1);
        lazySet(i, null);
        return obj;
    }

    public final boolean b() {
        return this.c.get() == this.e.get();
    }

    public final void e() {
        while (true) {
            if (bI_() == null && b()) {
                return;
            }
        }
    }
}
