package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: zws */
public final class zws implements baqa {
    private final bcaa a;

    public zws(bcaa bcaa) {
        this.a = bcaa;
    }

    public static Set a(afsa afsa) {
        Object hashSet = new HashSet();
        if (afsa != null) {
            hashSet.add(afsa);
        }
        return (Set) baqd.a(hashSet, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zws.a((afsa) this.a.get());
    }
}
