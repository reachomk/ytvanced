package defpackage;

import java.util.BitSet;

/* renamed from: spm */
public final class spm extends clz {
    public spj a;
    public final BitSet d = new BitSet(6);
    private final String[] e = new String[]{"children", "commandResolver", "conversionContext", "flexDirection", "logger", "scrollableContainerType"};

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final /* synthetic */ cma c() {
        clz.a(6, this.d, this.e);
        spj spj = this.a;
        super.e();
        this.a = null;
        return spj;
    }

    static /* synthetic */ void a(spm spm, cmg cmg, spj spj) {
        super.a(cmg, (cma) spj);
        spm.a = spj;
        spm.d.clear();
    }
}
