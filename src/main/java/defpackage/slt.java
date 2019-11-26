package defpackage;

import java.util.BitSet;

/* renamed from: slt */
public final class slt extends clz {
    public slu a;
    public final BitSet d = new BitSet(7);
    private final String[] e = new String[]{"componentElementCleanupOptions", "conversionContext", "crashOnTemplateResolutionError", "devServerEnabled", "elementSource", "logger", "templatePerformanceLogger"};

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final /* synthetic */ cma c() {
        clz.a(7, this.d, this.e);
        slu slu = this.a;
        super.e();
        this.a = null;
        return slu;
    }

    static /* synthetic */ void a(slt slt, cmg cmg, slu slu) {
        super.a(cmg, (cma) slu);
        slt.a = slu;
        slt.d.clear();
    }
}
