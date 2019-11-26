package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: fim */
public class fim implements ListIterator {
    public final Deque a = new ArrayDeque();
    public final Deque b = new ArrayDeque();
    public Object c;

    public fim() {
        b();
    }

    public final boolean a() {
        return this.c == null;
    }

    public final boolean hasPrevious() {
        return (a() || this.a.isEmpty()) ? false : true;
    }

    public final int previousIndex() {
        if (a()) {
            return -1;
        }
        return this.a.size() - 1;
    }

    public final Object previous() {
        if (hasPrevious()) {
            this.b.offerFirst(this.c);
            this.c = this.a.pollFirst();
            return this.c;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return (a() || this.b.isEmpty()) ? false : true;
    }

    public final int nextIndex() {
        return !a() ? this.a.size() + 1 : -1;
    }

    public final Object next() {
        if (hasNext()) {
            this.a.offerFirst(this.c);
            this.c = this.b.pollFirst();
            return this.c;
        }
        throw new NoSuchElementException();
    }

    public final void set(Object obj) {
        if (a() || obj == null) {
            throw new IllegalStateException();
        }
        this.c = obj;
    }

    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final void b() {
        c();
        d();
        this.c = null;
    }

    public final void c() {
        this.a.clear();
    }

    public final void d() {
        this.b.clear();
    }
}
