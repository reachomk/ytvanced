package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: amwl */
final class amwl extends amuw {
    public final transient Object[] a;
    public final transient int b;
    public final transient int c;
    private final transient amur d;

    amwl(amur amur, Object[] objArr, int i, int i2) {
        this.d = amur;
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    /* Access modifiers changed, original: final */
    public final boolean f() {
        return true;
    }

    public final amxo a() {
        return (amxn) e().listIterator();
    }

    /* Access modifiers changed, original: final */
    public final int a(Object[] objArr, int i) {
        return e().a(objArr, i);
    }

    /* Access modifiers changed, original: final */
    public final amul h() {
        return new amwo(this);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Entry) {
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            obj = entry.getValue();
            if (obj != null && obj.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    public final int size() {
        return this.c;
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
