package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: anyj */
final class anyj implements Iterator {
    private final Iterator a;

    public anyj(Iterator it) {
        this.a = it;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final void remove() {
        this.a.remove();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.a.next();
        return entry.getValue() instanceof anyh ? new anyk(entry) : entry;
    }
}
