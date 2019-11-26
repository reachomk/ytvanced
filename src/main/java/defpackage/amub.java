package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: amub */
abstract class amub extends AbstractSet {
    public final amtt a;

    amub(amtt amtt) {
        this.a = amtt;
    }

    public abstract Object a(int i);

    public final Iterator iterator() {
        return new amue(this);
    }

    public final int size() {
        return this.a.c;
    }

    public final void clear() {
        this.a.clear();
    }
}
