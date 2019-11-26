package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: lnq */
final class lnq {
    public final acvz a;
    public WeakReference b;

    lnq(acvz acvz) {
        this.a = acvz;
    }

    public final acvx a() {
        WeakReference weakReference = this.b;
        return weakReference != null ? (acvx) weakReference.get() : null;
    }
}
