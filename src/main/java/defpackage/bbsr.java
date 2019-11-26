package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: bbsr */
final class bbsr extends AtomicReference implements bbmo, bbnc, Iterator {
    public static final long serialVersionUID = 6695226475494099826L;
    private final bbxb a;
    private final Lock b = new ReentrantLock();
    private final Condition c = this.b.newCondition();
    private volatile boolean d;
    private Throwable e;

    bbsr(int i) {
        this.a = new bbxb(i);
    }

    public final boolean hasNext() {
        Throwable e;
        while (true) {
            boolean z = this.d;
            boolean b = this.a.b();
            if (!z) {
                if (!b) {
                    break;
                }
                this.b.lock();
                while (!this.d && this.a.b()) {
                    try {
                        this.c.await();
                    } catch (InterruptedException e2) {
                        bbnz.a((AtomicReference) this);
                        b();
                        throw bbyw.a(e2);
                    } catch (Throwable th) {
                        this.b.unlock();
                    }
                }
                this.b.unlock();
            } else {
                e2 = this.e;
                if (e2 != null) {
                    throw bbyw.a(e2);
                } else if (b) {
                    return false;
                }
            }
        }
        return true;
    }

    public final Object next() {
        if (hasNext()) {
            return this.a.bI_();
        }
        throw new NoSuchElementException();
    }

    public final void a(bbnc bbnc) {
        bbnz.b(this, bbnc);
    }

    public final void b_(Object obj) {
        this.a.a(obj);
        b();
    }

    public final void a(Throwable th) {
        this.e = th;
        this.d = true;
        b();
    }

    public final void a() {
        this.d = true;
        b();
    }

    private final void b() {
        this.b.lock();
        try {
            this.c.signalAll();
        } finally {
            this.b.unlock();
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }

    public final void bK_() {
        bbnz.a((AtomicReference) this);
    }

    public final boolean c() {
        return bbnz.a((bbnc) get());
    }
}
