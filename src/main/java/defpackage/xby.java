package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: xby */
public final class xby implements Map {
    private final Map a = new HashMap();
    private final ReferenceQueue b = new ReferenceQueue();

    public final int size() {
        a();
        return this.a.size();
    }

    public final boolean isEmpty() {
        a();
        return this.a.isEmpty();
    }

    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        a();
        return this.a.containsKey(new xbx(obj, this.b));
    }

    public final boolean containsValue(Object obj) {
        a();
        return this.a.containsValue(obj);
    }

    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        a();
        return this.a.get(new xbx(obj, this.b));
    }

    public final Object put(Object obj, Object obj2) {
        amqw.a(obj);
        a();
        xbx xbx = new xbx(obj, this.b);
        obj = this.a.get(xbx);
        this.a.put(xbx, obj2);
        return obj;
    }

    public final Object remove(Object obj) {
        return obj != null ? this.a.remove(new xbx(obj, this.b)) : null;
    }

    public final void putAll(Map map) {
        a();
        for (Entry entry : map.entrySet()) {
            this.a.put(new xbx(entry.getKey(), this.b), entry.getValue());
        }
    }

    public final void clear() {
        this.a.clear();
    }

    public final Set keySet() {
        throw new UnsupportedOperationException("keySet() not supported because keys may have the same equality/hash code.");
    }

    public final Collection values() {
        a();
        return this.a.values();
    }

    public final Set entrySet() {
        throw new UnsupportedOperationException("entrySet() not supported because keys may have the same equality/hash code.");
    }

    private final void a() {
        Object poll = this.b.poll();
        while (poll != null) {
            if (poll instanceof xbx) {
                this.a.remove(poll);
            }
            poll = this.b.poll();
        }
    }
}
