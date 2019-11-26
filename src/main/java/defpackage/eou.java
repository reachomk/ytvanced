package defpackage;

import java.util.BitSet;

/* renamed from: eou */
public final class eou extends clz {
    private eov a;
    private final String[] d = new String[]{"viewPositionTrackerProvider"};
    private final BitSet e = new BitSet(1);

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final eou a(bcaa bcaa) {
        this.a.a = bcaa;
        this.e.set(0);
        return this;
    }

    /* renamed from: a */
    public final eov c() {
        clz.a(1, this.e, this.d);
        eov eov = this.a;
        super.e();
        this.a = null;
        return eov;
    }

    static /* synthetic */ void a(eou eou, cmg cmg, eov eov) {
        super.a(cmg, (cma) eov);
        eou.a = eov;
        eou.e.clear();
    }
}
