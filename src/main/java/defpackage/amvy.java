package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: amvy */
class amvy extends amwr {
    public final Map b;

    amvy(Map map) {
        this.b = (Map) amqw.a((Object) map);
    }

    public Iterator iterator() {
        return new amvu(this.b.entrySet().iterator());
    }

    public final int size() {
        return this.b.size();
    }

    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    public final boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.b.remove(obj);
        return true;
    }

    public void clear() {
        this.b.clear();
    }
}
