package defpackage;

import java.util.BitSet;

/* renamed from: sog */
public final class sog extends clz {
    public sod a;
    public final BitSet d = new BitSet(1);
    private final String[] e = new String[]{"child"};

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final /* synthetic */ cma c() {
        clz.a(1, this.d, this.e);
        sod sod = this.a;
        super.e();
        this.a = null;
        return sod;
    }

    static /* synthetic */ void a(sog sog, cmg cmg, sod sod) {
        super.a(cmg, (cma) sod);
        sog.a = sod;
        sog.d.clear();
    }
}
