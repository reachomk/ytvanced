package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: bvs */
final class bvs {
    private final Map a = new HashMap();
    private final Map b = new HashMap();

    bvs() {
    }

    /* Access modifiers changed, original: final */
    public final void a(bsm bsm, bve bve) {
        Map a = a(bve.b);
        if (bve.equals(a.get(bsm))) {
            a.remove(bsm);
        }
    }

    public final Map a(boolean z) {
        return !z ? this.a : this.b;
    }
}
