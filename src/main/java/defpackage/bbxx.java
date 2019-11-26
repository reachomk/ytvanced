package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: bbxx */
public final class bbxx extends AtomicReferenceArray implements bbnc, Runnable, Callable {
    private static final Object b = new Object();
    private static final Object c = new Object();
    private static final Object d = new Object();
    private static final Object e = new Object();
    public static final long serialVersionUID = -6120223772001106981L;
    private final Runnable a;

    public bbxx(Runnable runnable, bboa bboa) {
        super(3);
        this.a = runnable;
        lazySet(0, bboa);
    }

    public final Object call() {
        run();
        return null;
    }

    public final void run() {
        Object obj;
        lazySet(2, Thread.currentThread());
        try {
            this.a.run();
        } catch (Throwable th) {
            lazySet(2, null);
            obj = get(0);
            if (!(obj == b || !compareAndSet(0, obj, e) || obj == null)) {
                ((bboa) obj).c(this);
            }
            while (true) {
                obj = get(1);
                if (obj == c || obj == d || compareAndSet(1, obj, e)) {
                }
            }
        }
        lazySet(2, null);
        obj = get(0);
        if (!(obj == b || !compareAndSet(0, obj, e) || obj == null)) {
            ((bboa) obj).c(this);
        }
        do {
            obj = get(1);
            if (obj == c || obj == d) {
                return;
            }
        } while (!compareAndSet(1, obj, e));
    }

    public final void a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == e) {
                break;
            } else if (obj == c) {
                future.cancel(false);
                return;
            } else if (obj == d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    public final void bK_() {
        Object obj;
        boolean z;
        Object obj2;
        Object obj3;
        do {
            obj = get(1);
            if (obj == e || obj == c || obj == d) {
                break;
            }
            z = get(2) != Thread.currentThread();
            if (z) {
                obj3 = d;
            } else {
                obj3 = c;
            }
        } while (!compareAndSet(1, obj, obj3));
        if (obj != null) {
            ((Future) obj).cancel(z);
        }
        do {
            obj2 = get(0);
            if (obj2 != e) {
                obj = b;
                if (obj2 == obj || obj2 == null) {
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(0, obj2, obj));
        ((bboa) obj2).c(this);
    }

    public final boolean c() {
        Object obj = get(0);
        if (obj == b || obj == e) {
            return true;
        }
        return false;
    }
}
