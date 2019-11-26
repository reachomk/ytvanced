package defpackage;

import java.util.BitSet;

/* renamed from: sll */
public final class sll extends clz {
    public slm a;
    public final BitSet d = new BitSet(4);
    private final String[] e = new String[]{"children", "collectionType", "commandResolver", "conversionContext"};

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final /* synthetic */ cma c() {
        clz.a(4, this.d, this.e);
        slm slm = this.a;
        super.e();
        this.a = null;
        return slm;
    }

    static /* synthetic */ void a(sll sll, cmg cmg, slm slm) {
        super.a(cmg, (cma) slm);
        sll.a = slm;
        sll.d.clear();
    }
}
