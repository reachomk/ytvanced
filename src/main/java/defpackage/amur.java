package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;

/* renamed from: amur */
public abstract class amur implements Serializable, Map {
    private transient amuw a;
    private transient amuw b;
    private transient amuh c;

    public static amur a(Object obj, Object obj2) {
        amss.a(obj, obj2);
        return amwm.a(1, new Object[]{obj, obj2});
    }

    public abstract amuh c();

    public abstract amuw g();

    public abstract Object get(Object obj);

    public abstract amuw i();

    public abstract boolean j();

    public static amur a(Object obj, Object obj2, Object obj3, Object obj4) {
        amss.a(obj, obj2);
        amss.a(obj3, obj4);
        return amwm.a(2, new Object[]{obj, obj2, obj3, obj4});
    }

    public static amur a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        amss.a(obj, obj2);
        amss.a(obj3, obj4);
        amss.a(obj5, obj6);
        return amwm.a(3, new Object[]{obj, obj2, obj3, obj4, obj5, obj6});
    }

    public static amur a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        amss.a(obj, obj2);
        amss.a(obj3, obj4);
        amss.a(obj5, obj6);
        amss.a(obj7, obj8);
        amss.a(obj9, obj10);
        return amwm.a(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    public static amuu e() {
        return new amuu();
    }

    public static amuu a(int i) {
        amss.a(i, "expectedSize");
        return new amuu(i);
    }

    public static amur a(Map map) {
        if (!(map instanceof amur) || (map instanceof SortedMap)) {
            Iterable entrySet = map.entrySet();
            amuu amuu = new amuu(entrySet instanceof Collection ? entrySet.size() : 4);
            amuu.a(entrySet);
            return amuu.b();
        }
        amur amur = (amur) map;
        amur.j();
        return amur;
    }

    amur() {
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        return ((amuh) values()).contains(obj);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        obj = get(obj);
        return obj != null ? obj : obj2;
    }

    /* renamed from: f */
    public final amuw entrySet() {
        amuw amuw = this.a;
        if (amuw != null) {
            return amuw;
        }
        amuw = g();
        this.a = amuw;
        return amuw;
    }

    /* renamed from: h */
    public final amuw keySet() {
        amuw amuw = this.b;
        if (amuw != null) {
            return amuw;
        }
        amuw = i();
        this.b = amuw;
        return amuw;
    }

    /* renamed from: d */
    public amuh values() {
        amuh amuh = this.c;
        if (amuh != null) {
            return amuh;
        }
        amuh = c();
        this.c = amuh;
        return amuh;
    }

    public final boolean equals(Object obj) {
        return amvr.b(this, obj);
    }

    public final int hashCode() {
        return amws.a((amuw) entrySet());
    }

    public final String toString() {
        int size = size();
        amss.a(size, "size");
        StringBuilder stringBuilder = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824));
        stringBuilder.append('{');
        Object obj = 1;
        for (Entry entry : entrySet()) {
            if (obj == null) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(entry.getKey());
            stringBuilder.append('=');
            stringBuilder.append(entry.getValue());
            obj = null;
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: 0000 */
    public Object writeReplace() {
        return new amut(this);
    }
}
