package defpackage;

import java.util.Collections;
import java.util.PriorityQueue;

/* renamed from: ozb */
public final class ozb {
    private final Object a = new Object();
    private final PriorityQueue b = new PriorityQueue(10, Collections.reverseOrder());
    private int c = aocf.UNSET_ENUM_VALUE;

    public final void a(int i) {
        synchronized (this.a) {
            this.b.add(Integer.valueOf(i));
            this.c = Math.max(this.c, i);
        }
    }

    public final void b(int i) {
        synchronized (this.a) {
            while (this.c != i) {
                this.a.wait();
            }
        }
    }

    public final void c(int i) {
        synchronized (this.a) {
            int i2 = this.c;
            if (i2 == i) {
            } else {
                throw new oze(i, i2);
            }
        }
    }

    public final void d(int i) {
        synchronized (this.a) {
            this.b.remove(Integer.valueOf(i));
            this.c = !this.b.isEmpty() ? ((Integer) ozp.a((Integer) this.b.peek())).intValue() : aocf.UNSET_ENUM_VALUE;
            this.a.notifyAll();
        }
    }
}
