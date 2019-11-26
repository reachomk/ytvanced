package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: rbt */
final class rbt extends WeakReference {
    private final int a;

    public rbt(Throwable th, ReferenceQueue referenceQueue) {
        super(th, referenceQueue);
        this.a = System.identityHashCode(th);
    }

    public final int hashCode() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        rbt rbt = (rbt) obj;
        return this.a == rbt.a && get() == rbt.get();
    }
}
