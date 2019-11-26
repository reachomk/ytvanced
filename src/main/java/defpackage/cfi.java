package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: cfi */
public final class cfi implements cev {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    public final void a() {
        for (cgu a : chv.a(this.a)) {
            a.a();
        }
    }

    public final void b() {
        for (cgu b : chv.a(this.a)) {
            b.b();
        }
    }

    public final void c() {
        for (cgu c : chv.a(this.a)) {
            c.c();
        }
    }
}
