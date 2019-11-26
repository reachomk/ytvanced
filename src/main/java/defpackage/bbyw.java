package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbyw */
public final class bbyw {
    public static final Throwable a = new bbyv();

    public static RuntimeException a(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }

    public static boolean a(AtomicReference atomicReference, Throwable th) {
        Throwable th2;
        Object bbnf;
        do {
            th2 = (Throwable) atomicReference.get();
            if (th2 == a) {
                return false;
            }
            if (th2 != null) {
                bbnf = new bbnf(th2, th);
            } else {
                bbnf = th;
            }
        } while (!atomicReference.compareAndSet(th2, bbnf));
        return true;
    }

    public static Throwable a(AtomicReference atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        Throwable th2 = a;
        return th != th2 ? (Throwable) atomicReference.getAndSet(th2) : th;
    }
}
