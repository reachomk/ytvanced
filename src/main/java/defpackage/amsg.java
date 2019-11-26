package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: amsg */
final class amsg implements Iterator {
    private Entry a;
    private final /* synthetic */ Iterator b;
    private final /* synthetic */ amsd c;

    amsg(amsd amsd, Iterator it) {
        this.c = amsd;
        this.b = it;
    }

    public final boolean hasNext() {
        return this.b.hasNext();
    }

    public final Object next() {
        this.a = (Entry) this.b.next();
        return this.a.getKey();
    }

    public final void remove() {
        amss.a(this.a != null);
        Collection collection = (Collection) this.a.getValue();
        this.b.remove();
        amrz.b(this.c.a, collection.size());
        collection.clear();
        this.a = null;
    }
}
