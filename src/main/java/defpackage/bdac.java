package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bdac */
final class bdac extends bcum {
    private final /* synthetic */ Object[] a;
    private final /* synthetic */ int b;
    private final /* synthetic */ AtomicInteger c;
    private final /* synthetic */ bcum d;
    private final /* synthetic */ AtomicBoolean e;
    private final /* synthetic */ bdad f;

    bdac(bdad bdad, Object[] objArr, int i, AtomicInteger atomicInteger, bcum bcum, AtomicBoolean atomicBoolean) {
        this.f = bdad;
        this.a = objArr;
        this.b = i;
        this.c = atomicInteger;
        this.d = bcum;
        this.e = atomicBoolean;
    }

    public final void a(Object obj) {
        this.a[this.b] = obj;
        if (this.c.decrementAndGet() == 0) {
            try {
                this.d.a(this.f.a.a(this.a));
            } catch (Throwable th) {
                bcva.b(th);
                a(th);
            }
        }
    }

    public final void a(Throwable th) {
        if (this.e.compareAndSet(false, true)) {
            this.d.a(th);
        } else {
            bdeh.a(th);
        }
    }
}
