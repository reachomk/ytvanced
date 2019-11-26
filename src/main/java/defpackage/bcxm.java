package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bcxm */
final class bcxm extends bcup {
    public final bcup a;
    public final int b;
    public final int c;
    public final ArrayDeque d = new ArrayDeque();
    public final AtomicLong e = new AtomicLong();
    private long f;
    private long g;

    public bcxm(bcup bcup, int i, int i2) {
        this.a = bcup;
        this.b = i;
        this.c = i2;
        a(0);
    }

    public final void e_(Object obj) {
        long j = this.f;
        if (j == 0) {
            this.d.offer(new ArrayList(this.b));
        }
        j++;
        if (j == ((long) this.c)) {
            this.f = 0;
        } else {
            this.f = j;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((List) it.next()).add(obj);
        }
        List list = (List) this.d.peek();
        if (list != null && list.size() == this.b) {
            this.d.poll();
            this.g++;
            this.a.e_(list);
        }
    }

    public final void a(Throwable th) {
        this.d.clear();
        this.a.a(th);
    }

    public final void bM_() {
        long j;
        long j2 = this.g;
        if (j2 != 0) {
            if (j2 > this.e.get()) {
                bcup bcup = this.a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("More produced than requested? ");
                stringBuilder.append(j2);
                bcup.a(new bcvd(stringBuilder.toString()));
                return;
            }
            this.e.addAndGet(-j2);
        }
        AtomicLong atomicLong = this.e;
        ArrayDeque arrayDeque = this.d;
        bcup bcup2 = this.a;
        do {
            j = atomicLong.get();
            if ((j & Long.MIN_VALUE) != 0) {
                break;
            }
        } while (!atomicLong.compareAndSet(j, Long.MIN_VALUE | j));
        if (j != 0) {
            bcvu.a(atomicLong, arrayDeque, bcup2);
        }
    }
}
