package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: anof */
final class anof implements annp {
    private final Set a;
    private final annp b;

    anof(annn annn, annp annp) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (annr annr : annn.b) {
            hashSet.add(annr.a);
        }
        if (!annn.e.isEmpty()) {
            hashSet.add(anoj.class);
        }
        this.a = Collections.unmodifiableSet(hashSet);
        Collections.unmodifiableSet(hashSet2);
        this.b = annp;
    }

    public final Object a(Class cls) {
        if (this.a.contains(cls)) {
            return cls.equals(anoj.class) ? new anoi() : this.b.a(cls);
        } else {
            throw new IllegalArgumentException(String.format("Requesting %s is not allowed.", new Object[]{cls}));
        }
    }
}
