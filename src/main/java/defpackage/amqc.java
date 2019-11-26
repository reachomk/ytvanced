package defpackage;

import java.util.Iterator;

/* renamed from: amqc */
final class amqc implements Iterator {
    private final Iterator a = this.b.a.iterator();
    private final /* synthetic */ ampz b;

    amqc(ampz ampz) {
        this.b = ampz;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final Object next() {
        return this.b.b.d(this.a.next());
    }

    public final void remove() {
        this.a.remove();
    }
}
