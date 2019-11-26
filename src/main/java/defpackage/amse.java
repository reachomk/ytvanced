package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: amse */
final class amse implements Iterator {
    private final Iterator a = this.c.a.entrySet().iterator();
    private Collection b;
    private final /* synthetic */ amsc c;

    amse(amsc amsc) {
        this.c = amsc;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final void remove() {
        amss.a(this.b != null);
        this.a.remove();
        amrz.b(this.c.b, this.b.size());
        this.b.clear();
        this.b = null;
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.a.next();
        this.b = (Collection) entry.getValue();
        amsc amsc = this.c;
        Object key = entry.getKey();
        return amvr.a(key, amsc.b.a(key, (Collection) entry.getValue()));
    }
}
