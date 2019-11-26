package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: adiz */
final class adiz implements Iterator {
    private final Iterator a = this.b.a.entrySet().iterator();
    private final /* synthetic */ adja b;

    adiz(adja adja) {
        this.b = adja;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final void remove() {
        this.a.remove();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.a.next();
        return new adjc((String) entry.getKey(), (String) entry.getValue());
    }
}
