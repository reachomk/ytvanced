package defpackage;

import java.util.NoSuchElementException;

/* renamed from: amvf */
final class amvf extends amxo {
    private boolean a;
    private final /* synthetic */ Object b;

    amvf(Object obj) {
        this.b = obj;
    }

    public final boolean hasNext() {
        return this.a ^ 1;
    }

    public final Object next() {
        if (this.a) {
            throw new NoSuchElementException();
        }
        this.a = true;
        return this.b;
    }
}
