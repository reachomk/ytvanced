package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: amte */
final class amte extends AbstractCollection {
    private final /* synthetic */ amsw a;

    amte(amsw amsw) {
        this.a = amsw;
    }

    public final int size() {
        return this.a.d;
    }

    public final void clear() {
        this.a.clear();
    }

    public final Iterator iterator() {
        return new amsx(this.a);
    }
}
