package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: acxe */
public abstract class acxe {
    public static final acxe m = new acxd();
    private final Set a = Collections.newSetFromMap(new WeakHashMap());

    public abstract boolean a();

    public final void a(acxg acxg) {
        this.a.add(acxg);
    }

    public final void e() {
        for (acxg a : this.a) {
            a.a();
        }
    }
}
