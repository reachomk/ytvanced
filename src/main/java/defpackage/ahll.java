package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: ahll */
public final class ahll {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    private boolean b = false;

    ahll() {
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        if (this.b != z) {
            this.b = z;
            for (ahli a : this.a) {
                a.a(this.b);
            }
        }
    }
}
