package defpackage;

import java.util.NoSuchElementException;

/* renamed from: rdf */
final class rdf implements rdm {
    private int a = 0;
    private final int b = this.c.a();
    private final /* synthetic */ rdg c;

    rdf(rdg rdg) {
        this.c = rdg;
    }

    public final boolean hasNext() {
        return this.a < this.b;
    }

    public final byte a() {
        try {
            rdg rdg = this.c;
            int i = this.a;
            this.a = i + 1;
            return rdg.a(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        return Byte.valueOf(a());
    }
}
