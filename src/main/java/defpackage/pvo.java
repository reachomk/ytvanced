package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: pvo */
final class pvo extends pwf {
    private final WeakReference a;

    pvo(pvk pvk) {
        this.a = new WeakReference(pvk);
    }

    public final void a() {
        pvk pvk = (pvk) this.a.get();
        if (pvk != null) {
            pvk.i();
        }
    }
}
