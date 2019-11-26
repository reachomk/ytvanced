package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: lud */
public final class lud {
    public lui a;
    private final Set b = Collections.newSetFromMap(new WeakHashMap());

    public final void a(lui lui) {
        if (this.a != lui) {
            this.a = lui;
            for (lug a : this.b) {
                a.a();
            }
        }
    }
}
