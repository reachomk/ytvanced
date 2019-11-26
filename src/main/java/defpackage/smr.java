package defpackage;

import java.util.BitSet;

/* renamed from: smr */
public final class smr extends clz {
    public sms a;
    public final BitSet d = new BitSet(7);
    private final String[] e = new String[]{"componentElementCleanupOptions", "conversionContext", "crashOnTemplateResolutionError", "devServerEnabled", "elementSource", "logger", "templatePerformanceLogger"};

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final /* synthetic */ cma c() {
        clz.a(7, this.d, this.e);
        sms sms = this.a;
        super.e();
        this.a = null;
        return sms;
    }

    static /* synthetic */ void a(smr smr, cmg cmg, sms sms) {
        super.a(cmg, (cma) sms);
        smr.a = sms;
        smr.d.clear();
    }
}
