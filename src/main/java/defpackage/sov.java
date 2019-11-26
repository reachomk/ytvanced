package defpackage;

import java.util.BitSet;

/* renamed from: sov */
public final class sov extends clz {
    public sow a;
    public final BitSet d = new BitSet(4);
    private final String[] e = new String[]{"commandResolver", "expandableTextType", "logger", "typefaceProvider"};

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final /* synthetic */ cma c() {
        clz.a(4, this.d, this.e);
        sow sow = this.a;
        super.e();
        this.a = null;
        return sow;
    }

    static /* synthetic */ void a(sov sov, cmg cmg, sow sow) {
        super.a(cmg, (cma) sow);
        sov.a = sow;
        sov.d.clear();
    }
}
