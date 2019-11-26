package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbyq */
public enum bbyq implements bctr {
    ;

    public final void b(long j) {
    }

    public final void d() {
    }

    private bbyq(String str) {
    }

    public static boolean a(bctr bctr, bctr bctr2) {
        if (bctr2 == null) {
            bbzf.a(new NullPointerException("next is null"));
            return false;
        } else if (bctr == null) {
            return true;
        } else {
            bctr2.d();
            bbyq.a();
            return false;
        }
    }

    private static void a() {
        bbzf.a(new bbnn("Subscription already set!"));
    }

    public static boolean a(long j) {
        if (j > 0) {
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("n > 0 required but it was ");
        stringBuilder.append(j);
        bbzf.a(new IllegalArgumentException(stringBuilder.toString()));
        return false;
    }

    public static boolean a(AtomicReference atomicReference, bctr bctr) {
        bbow.a((Object) bctr, "s is null");
        if (atomicReference.compareAndSet(null, bctr)) {
            return true;
        }
        bctr.d();
        if (atomicReference.get() != a) {
            bbyq.a();
        }
        return false;
    }

    public static boolean a(AtomicReference atomicReference) {
        bctr bctr = (bctr) atomicReference.get();
        bctr bctr2 = a;
        if (bctr != bctr2) {
            bctr bctr3 = (bctr) atomicReference.getAndSet(bctr2);
            if (bctr3 != a) {
                if (bctr3 != null) {
                    bctr3.d();
                }
                return true;
            }
        }
        return false;
    }

    public static void a(AtomicReference atomicReference, AtomicLong atomicLong, long j) {
        bctr bctr = (bctr) atomicReference.get();
        if (bctr != null) {
            bctr.b(j);
        } else if (bbyq.a(j)) {
            bbyu.a(atomicLong, j);
            bctr bctr2 = (bctr) atomicReference.get();
            if (bctr2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    bctr2.b(andSet);
                }
            }
        }
    }
}
