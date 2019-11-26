package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: amst */
public final class amst extends AbstractCollection {
    private final Collection a;
    private final amqd b;

    public amst(Collection collection, amqd amqd) {
        this.a = (Collection) amqw.a((Object) collection);
        this.b = (amqd) amqw.a((Object) amqd);
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        return amve.a(this.a.iterator(), this.b);
    }

    public final int size() {
        return this.a.size();
    }
}
