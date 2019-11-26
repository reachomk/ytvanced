package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: anif */
class anif {
    public static final anii a;
    private static final Logger b;
    public volatile int remaining;
    public volatile Set seenExceptions = null;

    anif(int i) {
        this.remaining = i;
    }

    static {
        anii anih;
        Throwable th;
        Class cls = anif.class;
        b = Logger.getLogger(cls.getName());
        try {
            anih = new anih(AtomicReferenceFieldUpdater.newUpdater(cls, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(cls, "remaining"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            anih = new anik();
        }
        Throwable th3 = th;
        a = anih;
        if (th3 != null) {
            b.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }
}
