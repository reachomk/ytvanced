package defpackage;

import java.util.Iterator;

/* renamed from: bbss */
public final class bbss implements Iterable {
    private final bbmm a;
    private final int b;

    public bbss(bbmm bbmm, int i) {
        this.a = bbmm;
        this.b = i;
    }

    public final Iterator iterator() {
        bbsr bbsr = new bbsr(this.b);
        this.a.b(bbsr);
        return bbsr;
    }
}
