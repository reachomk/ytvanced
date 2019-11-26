package defpackage;

import java.util.Set;

/* renamed from: aalh */
public final class aalh implements Runnable {
    private final /* synthetic */ anze a;
    private final /* synthetic */ aald b;

    public aalh(aald aald, anze anze) {
        this.b = aald;
        this.a = anze;
    }

    public final void run() {
        Set<aala> set = (Set) this.b.c.get();
        if (set != null && !set.isEmpty()) {
            for (Object next : this.b.b.a(this.a)) {
                for (aala a : set) {
                    a.a(next);
                }
            }
        }
    }
}
