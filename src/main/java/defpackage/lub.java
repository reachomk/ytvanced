package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: lub */
public final class lub {
    public boolean a;
    private final Set b = Collections.newSetFromMap(new WeakHashMap());

    public final void a(lue lue) {
        amqw.a((Object) lue);
        this.b.add(lue);
    }

    public final void a() {
        a(false);
    }

    public final void a(boolean z) {
        if (this.a != z) {
            this.a = z;
            for (lue a : this.b) {
                a.a(z);
            }
        }
    }
}
