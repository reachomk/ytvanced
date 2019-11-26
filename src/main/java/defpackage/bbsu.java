package defpackage;

import java.util.Iterator;

/* renamed from: bbsu */
public final class bbsu implements Iterable {
    private final bbmm a;
    private final Object b;

    public bbsu(bbmm bbmm, Object obj) {
        this.a = bbmm;
        this.b = obj;
    }

    public final Iterator iterator() {
        bbst bbst = new bbst(this.b);
        this.a.b(bbst);
        return new bbsw(bbst);
    }
}
