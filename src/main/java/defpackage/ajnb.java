package defpackage;

import java.util.Iterator;
import java.util.TreeSet;

/* renamed from: ajnb */
public final class ajnb implements Iterable {
    public final TreeSet a;
    public final TreeSet b;

    public ajnb() {
        ajmz ajmz = new ajmz();
        this.b = new TreeSet(ajmz.a);
        this.a = new TreeSet(ajmz);
    }

    public final void a(ajmx... ajmxArr) {
        Object obj = ajmxArr[0];
        this.a.add(obj);
        this.b.add(obj.l);
        this.b.add(obj.m);
    }

    public final Iterator a(long j) {
        return this.b.tailSet(ajmx.b(j)).iterator();
    }

    public final Iterator iterator() {
        return this.a.iterator();
    }
}
