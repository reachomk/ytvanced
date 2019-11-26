package defpackage;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: afia */
public final class afia implements oxb {
    public final Set a = new CopyOnWriteArraySet();

    public final void a(afid afid) {
        this.a.add(afid);
    }

    public final void b(afid afid) {
        this.a.remove(afid);
    }

    public final void a(int i) {
        for (afid a : this.a) {
            a.a(i);
        }
    }

    @Deprecated
    public final void a(long j, long j2) {
        for (afid a : this.a) {
            a.a(j, j2);
        }
    }
}
