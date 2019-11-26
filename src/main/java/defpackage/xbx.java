package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: xbx */
final class xbx extends WeakReference {
    private final int a;

    public xbx(Object obj, ReferenceQueue referenceQueue) {
        super(amqw.a(obj), referenceQueue);
        this.a = System.identityHashCode(obj);
    }

    public final int hashCode() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof xbx)) {
                z = false;
            } else if (get() == ((xbx) obj).get()) {
                return z;
            } else {
                return false;
            }
        }
        return z;
    }
}
