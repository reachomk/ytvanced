package defpackage;

import java.util.BitSet;

/* renamed from: spk */
public final class spk extends clz {
    public sph a;
    public final BitSet d = new BitSet(6);
    private final String[] e = new String[]{"children", "commandResolver", "conversionContext", "flexDirection", "logger", "scrollableContainerType"};

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final /* synthetic */ cma c() {
        clz.a(6, this.d, this.e);
        sph sph = this.a;
        super.e();
        this.a = null;
        return sph;
    }

    static /* synthetic */ void a(spk spk, cmg cmg, sph sph) {
        super.a(cmg, (cma) sph);
        spk.a = sph;
        spk.d.clear();
    }
}
