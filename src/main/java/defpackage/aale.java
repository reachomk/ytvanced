package defpackage;

import java.util.Set;

/* renamed from: aale */
final class aale implements Runnable {
    private final /* synthetic */ aocf a;
    private final /* synthetic */ aald b;

    aale(aald aald, aocf aocf) {
        this.b = aald;
        this.a = aocf;
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
