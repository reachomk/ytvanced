package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: amxa */
final class amxa extends amxc {
    public static final long serialVersionUID = 0;

    amxa(Collection collection, Object obj) {
        super(collection, obj);
    }

    public final Iterator iterator() {
        return new amwz(this, super.iterator());
    }
}
