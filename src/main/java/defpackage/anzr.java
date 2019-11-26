package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: anzr */
final class anzr extends anvj {
    public static final anzr b;
    private final List c;

    anzr() {
        this(new ArrayList(10));
    }

    private anzr(List list) {
        this.c = list;
    }

    public final void add(int i, Object obj) {
        c();
        this.c.add(i, obj);
        this.modCount++;
    }

    public final Object get(int i) {
        return this.c.get(i);
    }

    public final Object remove(int i) {
        c();
        Object remove = this.c.remove(i);
        this.modCount++;
        return remove;
    }

    public final Object set(int i, Object obj) {
        c();
        Object obj2 = this.c.set(i, obj);
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.c.size();
    }

    public final /* synthetic */ anyd a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.c);
            return new anzr(arrayList);
        }
        throw new IllegalArgumentException();
    }

    static {
        anzr anzr = new anzr(new ArrayList(0));
        b = anzr;
        anzr.b();
    }
}
