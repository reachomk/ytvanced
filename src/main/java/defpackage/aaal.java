package defpackage;

import java.util.Set;

/* renamed from: aaal */
public final class aaal {
    private final Set a;

    public aaal(Set set) {
        this.a = (Set) amqw.a((Object) set);
    }

    public final boolean a(apxu apxu, apxu apxu2) {
        if (amqq.a(apxu, apxu2)) {
            return true;
        }
        if (!(apxu == null || apxu2 == null)) {
            for (aaai a : this.a) {
                if (a.a(apxu, apxu2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
