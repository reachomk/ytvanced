package defpackage;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: xce */
public class xce extends AbstractList implements xca {
    public final List b;
    public final xcd c;

    protected xce(List list, xcd xcd) {
        this.b = (List) amqw.a((Object) list);
        this.c = (xcd) amqw.a((Object) xcd);
    }

    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    public final int size() {
        return this.b.size();
    }

    public final boolean contains(Object obj) {
        return this.b.indexOf(obj) >= 0;
    }

    public final List subList(int i, int i2) {
        return this.b.subList(i, i2);
    }

    public final Object get(int i) {
        return this.b.get(i);
    }

    public final Object set(int i, Object obj) {
        obj = this.b.set(i, obj);
        this.c.a(i, 1);
        return obj;
    }

    public void add(int i, Object obj) {
        this.b.add(i, obj);
        Iterator it = this.c.a.iterator();
        while (it.hasNext()) {
            ((xbz) it.next()).e_(i, 1);
        }
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public boolean addAll(int i, Collection collection) {
        amqw.a((Object) collection);
        boolean addAll = this.b.addAll(i, collection);
        if (addAll) {
            this.c.b(i, collection.size());
        }
        return addAll;
    }

    public Object remove(int i) {
        Object remove = this.b.remove(i);
        this.c.a(i);
        return remove;
    }

    public void a(int i, int i2) {
        xru.a(i, size() - 1);
        xru.a(i + i2, size());
        for (int i3 = 0; i3 < i2; i3++) {
            this.b.remove(i);
        }
        this.c.c(i, i2);
    }

    public void clear() {
        if (!this.b.isEmpty()) {
            int size = this.b.size();
            this.b.clear();
            this.c.c(0, size);
        }
    }

    public final void a(xbz xbz) {
        this.c.a(xbz);
    }

    public final void b(xbz xbz) {
        this.c.b(xbz);
    }
}
