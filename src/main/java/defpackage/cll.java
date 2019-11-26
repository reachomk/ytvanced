package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: cll */
public abstract class cll implements cnh {
    private static final Set a = new HashSet();
    private static final Set b = new HashSet();

    public final Map c() {
        return null;
    }

    public final Set a() {
        return Collections.unmodifiableSet(a);
    }

    public final Set b() {
        return Collections.unmodifiableSet(b);
    }

    static {
        a.add("Spec.java");
        a.add("Activity.java");
    }
}
