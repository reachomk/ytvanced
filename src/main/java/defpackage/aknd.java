package defpackage;

import java.util.Map;

/* renamed from: aknd */
final class aknd {
    public final Map a;
    public final aac b = new aac();
    private final Map c;

    public aknd(Map map, Map map2) {
        this.c = map;
        this.a = map2;
    }

    public final akox a(Class cls) {
        int a = this.b.a((Object) cls);
        if (a >= 0) {
            return (akox) this.b.c(a);
        }
        if (!this.c.containsKey(cls)) {
            return null;
        }
        akox akox = (akox) ((bcaa) this.c.get(cls)).get();
        this.b.put(cls, akox);
        return akox;
    }
}
