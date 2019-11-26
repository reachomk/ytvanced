package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: anzx */
final class anzx implements Iterator {
    private final ArrayDeque a;
    private anwb b;

    private final anwb a(anvu anvu) {
        while (anvu instanceof anzw) {
            anzw anzw = (anzw) anvu;
            this.a.push(anzw);
            anvu = anzw.e;
        }
        return (anwb) anvu;
    }

    public final boolean hasNext() {
        return this.b != null;
    }

    /* renamed from: a */
    public final anwb next() {
        anwb anwb = this.b;
        if (anwb != null) {
            anwb anwb2;
            do {
                ArrayDeque arrayDeque = this.a;
                anwb2 = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    this.b = anwb2;
                } else {
                    anwb2 = a(((anzw) this.a.pop()).f);
                }
            } while (anwb2.c());
            this.b = anwb2;
            return anwb;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ anzx(anvu anvu) {
        if (anvu instanceof anzw) {
            anzw anzw = (anzw) anvu;
            this.a = new ArrayDeque(anzw.g);
            this.a.push(anzw);
            this.b = a(anzw.e);
            return;
        }
        this.a = null;
        this.b = (anwb) anvu;
    }
}
