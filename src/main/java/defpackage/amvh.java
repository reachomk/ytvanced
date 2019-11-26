package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: amvh */
final class amvh implements Iterator {
    private Iterator a;
    private Iterator b = amvi.a;
    private Iterator c;
    private Deque d;

    amvh(Iterator it) {
        this.c = (Iterator) amqw.a((Object) it);
    }

    public final boolean hasNext() {
        while (!((Iterator) amqw.a(this.b)).hasNext()) {
            Iterator it;
            Iterator it2;
            while (true) {
                it = this.c;
                it2 = null;
                if (it != null && it.hasNext()) {
                    it2 = this.c;
                    break;
                }
                Deque deque = this.d;
                if (deque == null || deque.isEmpty()) {
                    break;
                }
                this.c = (Iterator) this.d.removeFirst();
            }
            this.c = it2;
            it = this.c;
            if (it == null) {
                return false;
            }
            this.b = (Iterator) it.next();
            it = this.b;
            if (it instanceof amvh) {
                amvh amvh = (amvh) it;
                this.b = amvh.b;
                if (this.d == null) {
                    this.d = new ArrayDeque();
                }
                this.d.addFirst(this.c);
                if (amvh.d != null) {
                    while (!amvh.d.isEmpty()) {
                        this.d.addFirst((Iterator) amvh.d.removeLast());
                    }
                }
                this.c = amvh.c;
            }
        }
        return true;
    }

    public final Object next() {
        if (hasNext()) {
            Iterator it = this.b;
            this.a = it;
            return it.next();
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        amss.a(this.a != null);
        this.a.remove();
        this.a = null;
    }
}
