package defpackage;

import java.util.BitSet;

/* renamed from: slh */
public final class slh extends clz {
    public sli a;
    public final BitSet d = new BitSet(4);
    private final String[] e = new String[]{"children", "collectionType", "commandResolver", "conversionContext"};

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final /* synthetic */ cma c() {
        clz.a(4, this.d, this.e);
        sli sli = this.a;
        super.e();
        this.a = null;
        return sli;
    }

    static /* synthetic */ void a(slh slh, cmg cmg, sli sli) {
        super.a(cmg, (cma) sli);
        slh.a = sli;
        slh.d.clear();
    }
}
