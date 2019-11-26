package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: baqc */
public final class baqc extends bapt {
    public static final bcaa b = bapz.a(Collections.emptyMap());

    public static baqb a() {
        return new baqb();
    }

    public final /* synthetic */ Object get() {
        LinkedHashMap b = bapv.b(this.a.size());
        for (Entry entry : this.a.entrySet()) {
            b.put(entry.getKey(), ((bcaa) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(b);
    }

    /* synthetic */ baqc(Map map) {
        super(map);
    }
}
