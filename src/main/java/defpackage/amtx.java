package defpackage;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: amtx */
final class amtx extends AbstractMap implements amsp, Serializable {
    private final amtt a;
    private transient Set b;

    amtx(amtt amtt) {
        this.a = amtt;
    }

    public final int size() {
        return this.a.c;
    }

    public final boolean containsKey(Object obj) {
        return this.a.containsValue(obj);
    }

    public final Object get(Object obj) {
        amtt amtt = this.a;
        int b = amtt.b(obj);
        return b != -1 ? amtt.a[b] : null;
    }

    public final boolean containsValue(Object obj) {
        return this.a.containsKey(obj);
    }

    public final Object put(Object obj, Object obj2) {
        return this.a.a(obj, obj2);
    }

    public final amsp a() {
        return this.a;
    }

    public final Object remove(Object obj) {
        amtt amtt = this.a;
        int a = amud.a(obj);
        int b = amtt.b(obj, a);
        if (b == -1) {
            return null;
        }
        Object obj2 = amtt.a[b];
        amtt.b(b, a);
        return obj2;
    }

    public final void clear() {
        this.a.clear();
    }

    public final Set keySet() {
        return (Set) this.a.values();
    }

    public final Set entrySet() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        amua amua = new amua(this.a);
        this.b = amua;
        return amua;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a.g = this;
    }

    public final /* synthetic */ Collection values() {
        return this.a.keySet();
    }
}
