package defpackage;

import java.util.BitSet;

/* renamed from: cxb */
public final class cxb extends cwk {
    private cxc b;
    private final String[] c = new String[]{"component"};
    private final BitSet d = new BitSet(1);

    public final void a(cwj cwj, cxc cxc) {
        super.a(cwj, cxc);
        this.b = cxc;
        this.d.clear();
    }

    public final cxb a(cma cma) {
        this.b.k = cma != null ? cma.g() : null;
        this.d.set(0);
        return this;
    }

    public final cxb a(String str) {
        this.a.j = str;
        return this;
    }

    public final cxc b() {
        cwk.a(1, this.d, this.c);
        cxc cxc = this.b;
        super.a();
        this.b = null;
        return cxc;
    }
}
