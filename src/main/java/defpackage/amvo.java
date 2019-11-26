package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: amvo */
final class amvo implements ListIterator {
    private boolean a;
    private final /* synthetic */ ListIterator b;
    private final /* synthetic */ amvl c;

    amvo(amvl amvl, ListIterator listIterator) {
        this.c = amvl;
        this.b = listIterator;
    }

    public final void add(Object obj) {
        this.b.add(obj);
        this.b.previous();
        this.a = false;
    }

    public final boolean hasNext() {
        return this.b.hasPrevious();
    }

    public final boolean hasPrevious() {
        return this.b.hasNext();
    }

    public final Object next() {
        if (hasNext()) {
            this.a = true;
            return this.b.previous();
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.c.a(this.b.nextIndex());
    }

    public final Object previous() {
        if (hasPrevious()) {
            this.a = true;
            return this.b.next();
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return nextIndex() - 1;
    }

    public final void remove() {
        amss.a(this.a);
        this.b.remove();
        this.a = false;
    }

    public final void set(Object obj) {
        amqw.b(this.a);
        this.b.set(obj);
    }
}
