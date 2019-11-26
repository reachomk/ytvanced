package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: akdt */
public final class akdt {
    public final AtomicReference a = new AtomicReference();

    public final bblw a() {
        bblw bblw = (bblw) this.a.getAndSet(null);
        if (bblw != null) {
            return bblw;
        }
        throw new sxf("ElementCallback was already consumed");
    }

    /* synthetic */ akdt(bblw bblw) {
        this.a.set(bblw);
    }
}
