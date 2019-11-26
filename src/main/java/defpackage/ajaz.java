package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ajaz */
public final class ajaz implements baqa {
    private final bcaa a;
    private final bcaa b;

    private ajaz(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static ajaz a(bcaa bcaa, bcaa bcaa2) {
        return new ajaz(bcaa, bcaa2);
    }

    public static Set a(aisd aisd, abfg abfg) {
        HashSet hashSet = new HashSet();
        hashSet.add(aisd);
        if (abfg != null) {
            hashSet.add(abfg);
        }
        return (Set) baqd.a(Collections.unmodifiableSet(hashSet), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ajaz.a((aisd) this.a.get(), (abfg) this.b.get());
    }
}
