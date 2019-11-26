package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: cel */
final class cel implements cew {
    private final Set a = Collections.newSetFromMap(new WeakHashMap());
    private boolean b;
    private boolean c;

    cel() {
    }

    public final void a(cev cev) {
        this.a.add(cev);
        if (this.c) {
            cev.c();
        } else if (this.b) {
            cev.a();
        } else {
            cev.b();
        }
    }

    public final void b(cev cev) {
        this.a.remove(cev);
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.b = true;
        for (cev a : chv.a(this.a)) {
            a.a();
        }
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        this.b = false;
        for (cev b : chv.a(this.a)) {
            b.b();
        }
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        this.c = true;
        for (cev c : chv.a(this.a)) {
            c.c();
        }
    }
}
