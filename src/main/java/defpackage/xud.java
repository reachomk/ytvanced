package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: xud */
final class xud extends AbstractSet {
    private final /* synthetic */ xuc a;

    xud(xuc xuc) {
        this.a = xuc;
    }

    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    public final int size() {
        return this.a.size();
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean remove(Object obj) {
        if (!this.a.containsKey(obj)) {
            return false;
        }
        this.a.remove(obj);
        return true;
    }

    public final Iterator iterator() {
        return new xuj(this.a, new xug());
    }
}
