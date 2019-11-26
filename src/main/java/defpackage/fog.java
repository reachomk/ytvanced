package defpackage;

import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: fog */
public final class fog implements fpk {
    private final Set a = new CopyOnWriteArraySet();
    private final Set b = new CopyOnWriteArraySet();

    public final Object a() {
        boolean b = b();
        UUID randomUUID = UUID.randomUUID();
        this.a.add(randomUUID);
        if (b != b()) {
            c();
        }
        return randomUUID;
    }

    public final void a(Object obj) {
        boolean b = b();
        this.a.remove(obj);
        if (b != b()) {
            c();
        }
    }

    public final boolean b() {
        return this.a.isEmpty() ^ 1;
    }

    private final void c() {
        b();
        for (fpj a : this.b) {
            a.a();
        }
    }
}
