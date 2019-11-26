package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bczm */
final class bczm implements bcuc {
    private final AtomicLong a = new AtomicLong(0);
    private final /* synthetic */ bcuc b;
    private final /* synthetic */ bczn c;

    bczm(bczn bczn, bcuc bcuc) {
        this.c = bczn;
        this.b = bcuc;
    }

    public final void a(long j) {
        if (j > 0 && !this.c.a) {
            long min;
            long j2;
            do {
                j2 = this.a.get();
                min = Math.min(j, ((long) this.c.b.a) - j2);
                if (min == 0) {
                    return;
                }
            } while (!this.a.compareAndSet(j2, j2 + min));
            this.b.a(min);
        }
    }
}
