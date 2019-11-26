package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: akna */
public abstract class akna implements akpb {
    public final List a;
    private final Map b;
    private final aknd c;

    public akna() {
        this(amwm.a, amwm.a);
    }

    public abstract akot a(int i);

    public akna(Map map, Map map2) {
        if (!(map.isEmpty() || map2.isEmpty())) {
            Collection keySet;
            Collection keySet2;
            if (map.size() < map2.size()) {
                keySet = map.keySet();
            } else {
                keySet = map2.keySet();
            }
            if (map.size() >= map2.size()) {
                keySet2 = map.keySet();
            } else {
                keySet2 = map2.keySet();
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(keySet);
            linkedHashSet.retainAll(keySet2);
            if (!linkedHashSet.isEmpty()) {
                String valueOf = String.valueOf(linkedHashSet.toString());
                String str = "Duplicate keys are not allowed in the maps provided to BasePresenterViewPool.Repeated entries: ";
                throw new IllegalStateException(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            }
        }
        this.c = new aknd(map, map2);
        int max = Math.max(map2.size() + map.size(), 16);
        this.b = new HashMap(max);
        this.a = new ArrayList(max);
        for (Class b : map2.keySet()) {
            b(b);
        }
        for (Class b2 : map.keySet()) {
            b(b2);
        }
    }

    private final void b(Class cls) {
        amqw.b(this.b.containsKey(cls) ^ 1);
        this.b.put(cls, Integer.valueOf(a()));
        this.a.add(cls);
    }

    public final void a(Class cls, akox akox) {
        amqw.a((Object) cls);
        amqw.a((Object) akox);
        if (this.b.containsKey(cls)) {
            akox a = this.c.a(cls);
            Object obj = (a == null || !a.getClass().isInstance(akox)) ? null : 1;
            Class cls2 = a.getClass();
            Class cls3 = akox.getClass();
            if (obj == null) {
                throw new IllegalStateException(amrl.a("Attempted to register a presenter factory with the same model type twice.model=%s  registered=%s  new=%s", cls, cls2, cls3));
            }
            return;
        }
        b(cls);
        this.c.b.put(cls, akox);
    }

    public final int a(Object obj) {
        return obj != null ? a(obj.getClass()) : -1;
    }

    public final int a(Class cls) {
        Integer num = (Integer) this.b.get(cls);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int a() {
        return this.a.size();
    }

    public final akot a(int i, ViewGroup viewGroup) {
        akot akot = null;
        if (!b(i)) {
            return null;
        }
        akot a = a(i);
        if (a != null) {
            return a;
        }
        aknd aknd = this.c;
        Class cls = (Class) this.a.get(i);
        if (aknd.a.containsKey(cls)) {
            akot = (akot) ((bcaa) aknd.a.get(cls)).get();
        } else {
            akox a2 = aknd.a(cls);
            if (a2 != null) {
                return a2.a(viewGroup);
            }
        }
        return akot;
    }

    public final boolean b(int i) {
        return i >= 0 && i <= a();
    }
}
