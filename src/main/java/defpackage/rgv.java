package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: rgv */
final class rgv extends rcw {
    public static final rgv b;
    private final List c;

    rgv() {
        this(new ArrayList(10));
    }

    private rgv(List list) {
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

    public final /* synthetic */ rfi a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.c);
            return new rgv(arrayList);
        }
        throw new IllegalArgumentException();
    }

    static {
        rgv rgv = new rgv();
        b = rgv;
        rgv.b();
    }
}
