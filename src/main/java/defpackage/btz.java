package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: btz */
final class btz extends WeakReference {
    public final bsm a;
    public final boolean b;
    public bvw c = null;

    btz(bsm bsm, bvl bvl, ReferenceQueue referenceQueue, boolean z) {
        super(bvl, referenceQueue);
        this.a = (bsm) chw.a((Object) bsm);
        boolean z2 = bvl.a;
        this.b = bvl.a;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.c = null;
        clear();
    }
}
