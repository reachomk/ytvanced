package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: ekn */
public final class ekn implements aixl, aiyh {
    public aizy a;
    public final Map b;
    public eko c = eko.WATCH_WHILE;
    private final Map d;
    private final Map e;

    public ekn(bcaa bcaa, bcaa bcaa2, aixl aixl, aixl aixl2) {
        this.d = amur.e().b(eko.WATCH_WHILE, bcaa).b(eko.REEL, bcaa2).b();
        this.e = amur.e().b(eko.WATCH_WHILE, aixl).b(eko.REEL, aixl2).b();
        this.b = new HashMap();
        for (Object put : eko.values()) {
            this.b.put(put, Collections.newSetFromMap(new WeakHashMap()));
        }
    }

    public final void a(eko eko) {
        eko eko2 = this.c;
        if (eko2 != eko) {
            for (ekq a : (Set) this.b.get(eko2)) {
                a.a(eko2);
            }
            this.c = eko;
            this.a.i();
            for (ekq a2 : (Set) this.b.get(eko)) {
                a2.a();
            }
        }
    }

    public final aixk a(aizx aizx) {
        aiyh aiyh = (aiyh) ((bcaa) this.d.get(this.c)).get();
        return aiyh != null ? aiyh.a(aizx) : null;
    }

    public final aixk a(aiqq aiqq) {
        aiyh aiyh = (aiyh) ((bcaa) this.d.get(this.c)).get();
        return aiyh != null ? aiyh.a(aiqq) : null;
    }

    public final aixi b(aiqq aiqq) {
        aixl aixl = (aixl) this.e.get(this.c);
        return aixl != null ? aixl.b(aiqq) : null;
    }

    public final aixi b(aizx aizx) {
        aixl aixl = (aixl) this.e.get(this.c);
        return aixl != null ? aixl.b(aizx) : null;
    }
}
