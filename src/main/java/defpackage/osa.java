package defpackage;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: osa */
abstract class osa implements orj {
    private final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public long c;
    private final PriorityQueue d;
    private orz e;
    private long f;

    public osa() {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            this.a.add(new orz());
        }
        this.b = new ArrayDeque();
        while (i < 2) {
            this.b.add(new osc(this));
            i++;
        }
        this.d = new PriorityQueue();
    }

    public void a(long j) {
        throw null;
    }

    public abstract void a(orn orn);

    public void e() {
    }

    public abstract boolean f();

    public abstract ork g();

    /* renamed from: i */
    public orn b() {
        oxz.b(this.e == null);
        if (this.a.isEmpty()) {
            return null;
        }
        this.e = (orz) this.a.pollFirst();
        return this.e;
    }

    /* renamed from: b */
    public void a(orn orn) {
        oxz.a(orn == this.e);
        if (orn.isDecodeOnly()) {
            a(this.e);
        } else {
            orz orz = this.e;
            long j = this.f;
            this.f = 1 + j;
            orz.e = j;
            this.d.add(orz);
        }
        this.e = null;
    }

    /* renamed from: h */
    public orq c() {
        if (!this.b.isEmpty()) {
            while (!this.d.isEmpty() && ((orz) this.d.peek()).c <= this.c) {
                orz orz = (orz) this.d.poll();
                orq orq;
                if (orz.isEndOfStream()) {
                    orq = (orq) this.b.pollFirst();
                    orq.addFlag(4);
                    a(orz);
                    return orq;
                }
                a((orn) orz);
                if (f()) {
                    ork g = g();
                    if (!orz.isDecodeOnly()) {
                        orq = (orq) this.b.pollFirst();
                        orq.a(orz.c, g, Long.MAX_VALUE);
                        a(orz);
                        return orq;
                    }
                }
                a(orz);
            }
        }
        return null;
    }

    private final void a(orz orz) {
        orz.clear();
        this.a.add(orz);
    }

    public void d() {
        this.f = 0;
        this.c = 0;
        while (!this.d.isEmpty()) {
            a((orz) this.d.poll());
        }
        orz orz = this.e;
        if (orz != null) {
            a(orz);
            this.e = null;
        }
    }
}
