package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: wnx */
public final class wnx implements aaas {
    private final HashSet a;
    private final aaas b;

    public wnx(aaas aaas) {
        this.a = new HashSet(1);
        this.b = aaas;
    }

    public final void a(List list, Object obj) {
        aaav.a((aaas) this, list, obj);
    }

    public final void a(List list, Map map) {
        aaav.a((aaas) this, list, map);
    }

    public final void a(apxu[] apxuArr, Object obj) {
        aaav.a((aaas) this, apxuArr, obj);
    }

    public final void a(apxu[] apxuArr, Map map) {
        aaav.a((aaas) this, apxuArr, map);
    }

    public wnx(aaas aaas, wnz wnz) {
        this(aaas);
        a(wnz);
    }

    public final void a(wnz wnz) {
        this.a.add(wnz);
    }

    public final void a(apxu apxu, Map map) {
        this.b.a(apxu, map);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((wnz) it.next()).a(apxu);
        }
    }
}
