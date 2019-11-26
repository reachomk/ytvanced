package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: alfi */
public final class alfi {
    private final Set a = Collections.newSetFromMap(new WeakHashMap());

    public final void a(alfl alfl) {
        xak.a();
        this.a.add(alfl);
    }

    public final void b(alfl alfl) {
        xak.a();
        this.a.remove(alfl);
    }

    public final void a() {
        xak.a();
        for (alfl aa : this.a) {
            aa.aa();
        }
    }
}
