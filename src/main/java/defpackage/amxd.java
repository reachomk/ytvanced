package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: amxd */
class amxd extends amxf implements Map {
    public static final long serialVersionUID = 0;
    private transient Set c;
    private transient Collection d;
    private transient Set e;

    amxd(Map map, Object obj) {
        super(map, obj);
    }

    /* Access modifiers changed, original: final */
    public final Map a() {
        return (Map) this.a;
    }

    public final void clear() {
        synchronized (this.b) {
            a().clear();
        }
    }

    public final boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.b) {
            containsKey = a().containsKey(obj);
        }
        return containsKey;
    }

    public boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.b) {
            containsValue = a().containsValue(obj);
        }
        return containsValue;
    }

    public Set entrySet() {
        Set set;
        synchronized (this.b) {
            if (this.e == null) {
                this.e = amwt.a(a().entrySet(), this.b);
            }
            set = this.e;
        }
        return set;
    }

    public Object get(Object obj) {
        synchronized (this.b) {
            obj = a().get(obj);
        }
        return obj;
    }

    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.b) {
            isEmpty = a().isEmpty();
        }
        return isEmpty;
    }

    public final Set keySet() {
        Set set;
        synchronized (this.b) {
            if (this.c == null) {
                this.c = amwt.a(a().keySet(), this.b);
            }
            set = this.c;
        }
        return set;
    }

    public final Object put(Object obj, Object obj2) {
        synchronized (this.b) {
            obj = a().put(obj, obj2);
        }
        return obj;
    }

    public final void putAll(Map map) {
        synchronized (this.b) {
            a().putAll(map);
        }
    }

    public final Object remove(Object obj) {
        synchronized (this.b) {
            obj = a().remove(obj);
        }
        return obj;
    }

    public final int size() {
        int size;
        synchronized (this.b) {
            size = a().size();
        }
        return size;
    }

    public Collection values() {
        Collection collection;
        synchronized (this.b) {
            if (this.d == null) {
                this.d = amwt.a(a().values(), this.b);
            }
            collection = this.d;
        }
        return collection;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        boolean equals;
        synchronized (this.b) {
            equals = a().equals(obj);
        }
        return equals;
    }

    public final int hashCode() {
        int hashCode;
        synchronized (this.b) {
            hashCode = a().hashCode();
        }
        return hashCode;
    }
}
