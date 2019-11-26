package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: xub */
final class xub extends AbstractSet {
    private final /* synthetic */ xuc a;

    xub(xuc xuc) {
        this.a = xuc;
    }

    public final int size() {
        return this.a.size();
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.a.remove(((Entry) obj).getKey());
        return true;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Entry) {
            xuh a = this.a.a(((Entry) obj).getKey());
            if (a != null && (a.get() != null || a.b)) {
                return obj.equals(a);
            }
        }
        return false;
    }

    public final Iterator iterator() {
        return new xuj(this.a, new xue());
    }
}
