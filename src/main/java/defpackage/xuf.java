package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: xuf */
final class xuf extends AbstractCollection {
    private final /* synthetic */ xuc a;

    xuf(xuc xuc) {
        this.a = xuc;
    }

    public final int size() {
        return this.a.size();
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    public final Iterator iterator() {
        return new xuj(this.a, new xui());
    }
}
