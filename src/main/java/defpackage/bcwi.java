package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bcwi */
final class bcwi extends bcup {
    private final bcwl a;
    private final int b;
    private boolean c;

    public bcwi(bcwl bcwl, int i) {
        this.a = bcwl;
        this.b = i;
        a((long) bcwl.c);
    }

    public final void e_(Object obj) {
        if (!this.c) {
            this.a.a(bcwf.a(obj), this.b);
        }
    }

    public final void a(Throwable th) {
        if (this.c) {
            bdeh.a(th);
            return;
        }
        AtomicReference atomicReference = this.a.e;
        Throwable th2;
        Object obj;
        do {
            th2 = (Throwable) atomicReference.get();
            if (th2 == null) {
                obj = th;
            } else if (th2 instanceof bcux) {
                Collection arrayList = new ArrayList(((bcux) th2).a);
                arrayList.add(th);
                obj = new bcux(arrayList);
            } else {
                obj = new bcux(Arrays.asList(new Throwable[]{th2, th}));
            }
        } while (!atomicReference.compareAndSet(th2, obj));
        this.c = true;
        this.a.a(null, this.b);
    }

    public final void bM_() {
        if (!this.c) {
            this.c = true;
            this.a.a(null, this.b);
        }
    }

    public final void e() {
        a(1);
    }
}
