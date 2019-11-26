package defpackage;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: amvp */
final class amvp extends AbstractSequentialList implements Serializable {
    public static final long serialVersionUID = 0;
    public final amqd a;
    private final List b;

    amvp(List list, amqd amqd) {
        this.b = (List) amqw.a((Object) list);
        this.a = (amqd) amqw.a((Object) amqd);
    }

    public final void clear() {
        this.b.clear();
    }

    public final int size() {
        return this.b.size();
    }

    public final ListIterator listIterator(int i) {
        return new amvs(this, this.b.listIterator(i));
    }
}
