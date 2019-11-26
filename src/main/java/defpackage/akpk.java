package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: akpk */
public class akpk extends xce implements aknh {
    private final akmy a = new akmy();

    public akpk() {
        super(new ArrayList(), new aknj());
    }

    public long a(int i) {
        return (long) i;
    }

    public final void a(akoq akoq) {
        this.a.a(akoq);
    }

    public final void a(akor akor, int i) {
        this.a.a(akor, this, i);
    }

    public final int d() {
        return size();
    }

    public final Object c(int i) {
        return get(i);
    }

    public final void add(int i, Object obj) {
        xak.a();
        super.add(i, obj);
    }

    public final boolean addAll(int i, Collection collection) {
        xak.a();
        return super.addAll(i, collection);
    }

    public final Object remove(int i) {
        xak.a();
        return super.remove(i);
    }

    public final void a(int i, int i2) {
        xak.a();
        super.a(i, i2);
    }

    public final void b(int i, int i2) {
        xak.a();
        xru.a(i, size() - 1);
        xru.a(i2, size() - 1);
        if (i2 != i) {
            this.b.add(i2, this.b.remove(i));
            Iterator it = this.c.a.iterator();
            while (it.hasNext()) {
                ((xbz) it.next()).f_(i, i2);
            }
        }
    }

    public final void clear() {
        xak.a();
        super.clear();
    }

    public final void a(int i, Object obj) {
        xak.a();
        amqw.a(i < size());
        amqw.a(obj);
        this.b.set(i, obj);
        this.c.a(i, 1);
    }

    public final void a(Object obj, Object obj2) {
        xak.a();
        amqw.a(obj);
        amqw.a(obj2);
        int indexOf = this.b.indexOf(obj);
        if (indexOf >= 0) {
            a(indexOf, obj2);
        }
    }

    public final void a(Collection collection) {
        xak.a();
        this.b.clear();
        this.b.addAll(collection);
        a();
    }

    public final void a(amqv amqv) {
        xak.a();
        amqw.a((Object) amqv);
        int size = this.b.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (amqv.a(this.b.get(size))) {
                this.b.remove(size);
                this.c.a(size);
            }
        }
    }

    public final void b(Collection collection) {
        collection.addAll(this.b);
    }

    public final void a() {
        ((aknj) this.c).a();
    }
}
