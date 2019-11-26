package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: banh */
final class banh implements Iterator {
    private int a = 0;
    private final /* synthetic */ bane b;

    banh(bane bane) {
        this.b = bane;
    }

    public final boolean hasNext() {
        return this.a < this.b.a.size() || this.b.b.hasNext();
    }

    public final Object next() {
        if (this.a < this.b.a.size()) {
            List list = this.b.a;
            int i = this.a;
            this.a = i + 1;
            return list.get(i);
        }
        bane bane = this.b;
        bane.a.add(bane.b.next());
        return next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
