package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: cpp */
final class cpp extends aby {
    private final WeakReference a;

    public final void a(boolean z) {
        clj.a();
        cpq cpq = (cpq) this.a.get();
        if (cpq != null) {
            cpq.b(z);
            cpq.x = true;
            cpq.requestLayout();
        }
    }

    /* synthetic */ cpp(cpq cpq) {
        this.a = new WeakReference(cpq);
    }
}
