package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bdbr */
public final class bdbr extends AtomicReference implements bcuo {
    public static final long serialVersionUID = 995205034283130269L;

    public final bcuo a() {
        bcuo bcuo = (bcuo) super.get();
        return bcuo == bdbq.a ? bdfz.a : bcuo;
    }

    public final void b() {
        if (((bcuo) get()) != bdbq.a) {
            bcuo bcuo = (bcuo) getAndSet(bdbq.a);
            if (bcuo != null && bcuo != bdbq.a) {
                bcuo.b();
            }
        }
    }

    public final boolean c() {
        return get() == bdbq.a;
    }
}
