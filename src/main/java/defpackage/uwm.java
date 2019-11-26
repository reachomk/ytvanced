package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: uwm */
public final class uwm {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    public final void a(boolean z, boolean z2) {
        if (z) {
            for (uwl a : this.a) {
                a.a(z2);
            }
            return;
        }
        for (uwl a2 : this.a) {
            a2.a();
        }
    }
}
