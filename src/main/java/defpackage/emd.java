package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;

/* renamed from: emd */
public final class emd implements ahlk {
    private final Set a = Collections.newSetFromMap(new WeakHashMap());
    private final Set b = new HashSet();

    public final void a(ahln ahln) {
        this.a.add(ahln);
    }

    public final boolean a() {
        return this.b.isEmpty() ^ 1;
    }

    public final String b() {
        boolean a = a();
        String uuid = UUID.randomUUID().toString();
        this.b.add(uuid);
        if (!a) {
            c();
        }
        return uuid;
    }

    public final void a(String str) {
        boolean a = a();
        this.b.remove(str);
        if (a() != a) {
            c();
        }
    }

    private final void c() {
        a();
        for (ahln b : this.a) {
            b.b();
        }
    }
}
