package defpackage;

import java.util.Iterator;

/* renamed from: amvb */
final class amvb implements Iterator {
    private boolean a = true;
    private final /* synthetic */ Iterator b;

    amvb(Iterator it) {
        this.b = it;
    }

    public final boolean hasNext() {
        return this.b.hasNext();
    }

    public final Object next() {
        Object next = this.b.next();
        this.a = false;
        return next;
    }

    public final void remove() {
        amss.a(this.a ^ 1);
        this.b.remove();
    }
}
