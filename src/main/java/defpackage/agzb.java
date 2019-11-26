package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: agzb */
final class agzb {
    private final Map a = new LinkedHashMap();
    private final xcb b = new xcg(new agze());

    agzb() {
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized boolean a(String str) {
        return this.a.containsKey(str);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(agxh agxh) {
        this.a.put(agxh.a, agxh);
        if (this.b.a(agxh.a)) {
            this.b.b(agxh.a);
        }
        this.b.a(new Pair(Integer.valueOf(agxh.i), Long.valueOf(agxj.t(agxh.f))), agxh.a);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized agxh b(String str) {
        this.b.b(str);
        return (agxh) this.a.remove(str);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized agxh c(String str) {
        return (agxh) this.a.get(str);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized Map a() {
        HashMap hashMap;
        hashMap = new HashMap(this.a.size());
        for (agxh agxh : this.a.values()) {
            hashMap.put(agxh.a, agxh.a());
        }
        return hashMap;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b() {
        this.a.clear();
        this.b.a();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized List c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.b) {
            arrayList.add((agxh) this.a.get(str));
        }
        return arrayList;
    }
}
