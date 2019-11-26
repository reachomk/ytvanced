package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: lsu */
public final class lsu {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public boolean b;

    public final void a(boolean z) {
        if (this.b != z) {
            this.b = z;
            for (lst a : this.a) {
                a.a(this.b ^ 1);
            }
        }
    }
}
