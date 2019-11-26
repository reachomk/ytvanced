package defpackage;

import java.util.BitSet;

/* renamed from: ctb */
public final class ctb extends clz {
    private static final String[] a = new String[]{"delegate"};
    private final BitSet d = new BitSet(1);
    private ctc e;

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final ctb a(cma cma) {
        this.d.set(0);
        this.e.a = cma;
        return this;
    }

    /* renamed from: a */
    public final ctc c() {
        clz.a(1, this.d, a);
        ctc ctc = this.e;
        super.e();
        this.d.clear();
        this.e = null;
        ctc.b.a(this);
        return ctc;
    }

    static /* synthetic */ void a(ctb ctb, cmg cmg, ctc ctc) {
        super.a(cmg, (cma) ctc);
        ctb.e = ctc;
    }
}
