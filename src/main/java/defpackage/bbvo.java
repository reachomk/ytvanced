package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbvo */
final class bbvo implements bbmo, bbnc {
    public static final bbvl[] a = new bbvl[0];
    private static final bbvl[] e = new bbvl[0];
    public final AtomicReference b = new AtomicReference(e);
    public final AtomicBoolean c;
    private final AtomicReference d;
    private final AtomicReference f = new AtomicReference();

    bbvo(AtomicReference atomicReference) {
        this.d = atomicReference;
        this.c = new AtomicBoolean();
    }

    public final void bK_() {
        if (((bbvl[]) this.b.getAndSet(a)) != a) {
            this.d.compareAndSet(this, null);
            bbnz.a(this.f);
        }
    }

    public final boolean c() {
        return this.b.get() == a;
    }

    public final void a(bbnc bbnc) {
        bbnz.b(this.f, bbnc);
    }

    public final void b_(Object obj) {
        for (bbvl bbvl : (bbvl[]) this.b.get()) {
            bbvl.a.b_(obj);
        }
    }

    public final void a(Throwable th) {
        this.d.compareAndSet(this, null);
        if (r1 == 0) {
            bbzf.a(th);
            return;
        }
        for (bbvl bbvl : (bbvl[]) this.b.getAndSet(a)) {
            bbvl.a.a(th);
        }
    }

    public final void a() {
        this.d.compareAndSet(this, null);
        for (bbvl bbvl : (bbvl[]) this.b.getAndSet(a)) {
            bbvl.a.a();
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(bbvl bbvl) {
        bbvl[] bbvlArr;
        Object obj;
        do {
            bbvlArr = (bbvl[]) this.b.get();
            int length = bbvlArr.length;
            if (length != 0) {
                int i = 0;
                while (i < length) {
                    if (bbvlArr[i].equals(bbvl)) {
                        break;
                    }
                    i++;
                }
                i = -1;
                if (i < 0) {
                    return;
                }
                if (length != 1) {
                    obj = new bbvl[(length - 1)];
                    System.arraycopy(bbvlArr, 0, obj, 0, i);
                    System.arraycopy(bbvlArr, i + 1, obj, i, (length - i) - 1);
                } else {
                    obj = e;
                }
            } else {
                return;
            }
        } while (!this.b.compareAndSet(bbvlArr, obj));
    }
}
