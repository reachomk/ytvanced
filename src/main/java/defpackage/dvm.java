package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: dvm */
public final class dvm implements baqa {
    public static Set a(Set set) {
        Object hashSet = new HashSet();
        for (amqp amqp : set) {
            if (amqp.a()) {
                hashSet.add(amqp.b());
            }
        }
        return (Set) baqd.a(hashSet, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* bridge */ /* synthetic */ Object get() {
        throw null;
    }
}
