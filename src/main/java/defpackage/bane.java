package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: bane */
public final class bane extends AbstractList {
    private static final bang c = bang.a(bane.class);
    public final List a;
    public final Iterator b;

    public bane(List list, Iterator it) {
        this.a = list;
        this.b = it;
    }

    public final Object get(int i) {
        if (this.a.size() > i) {
            return this.a.get(i);
        }
        if (this.b.hasNext()) {
            this.a.add(this.b.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    public final Iterator iterator() {
        return new banh(this);
    }

    public final int size() {
        c.a("potentially expensive size() call");
        c.a("blowup running");
        while (this.b.hasNext()) {
            this.a.add(this.b.next());
        }
        return this.a.size();
    }
}
