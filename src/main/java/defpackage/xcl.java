package defpackage;

import android.util.Pair;
import java.util.Set;

/* renamed from: xcl */
final class xcl implements xum {
    private final /* synthetic */ xci a;

    public final void a(Set set) {
        this.a.c.writeLock().lock();
        try {
            for (Pair pair : set) {
                Set<xcq> set2 = (Set) pair.second;
                if (!(set2 == null || set2.isEmpty())) {
                    for (xcq a : set2) {
                        this.a.a(a);
                    }
                }
            }
        } finally {
            this.a.c.writeLock().unlock();
        }
    }

    /* synthetic */ xcl(xci xci) {
        this.a = xci;
    }
}
