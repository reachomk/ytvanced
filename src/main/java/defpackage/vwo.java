package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: vwo */
public final class vwo implements vvd {
    private final Set a = Collections.newSetFromMap(new WeakHashMap());

    public final void a(vvd vvd) {
        this.a.add(vvd);
    }

    public final void a(wae wae) {
        for (vvd a : this.a) {
            a.a(wae);
        }
    }

    public final void a(vxc vxc) {
        for (vvd a : this.a) {
            a.a(vxc);
        }
    }
}
