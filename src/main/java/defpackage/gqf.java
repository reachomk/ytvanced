package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: gqf */
public final class gqf {
    private final Set a = Collections.newSetFromMap(new WeakHashMap());

    public final void a(gqi gqi) {
        synchronized (this) {
            this.a.add(gqi);
        }
    }

    public final void b(gqi gqi) {
        synchronized (this) {
            this.a.remove(gqi);
        }
    }

    public final ArrayList a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }
}
