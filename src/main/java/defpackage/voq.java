package defpackage;

import java.util.BitSet;

/* renamed from: voq */
public final class voq extends clz {
    public vor a;
    public final BitSet d = new BitSet(4);
    private final String[] e = new String[]{"activeViewDisplayContainerType", "activeViewDisplayMonitor", "child", "commandExtensionResolver"};

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final /* synthetic */ cma c() {
        clz.a(4, this.d, this.e);
        vor vor = this.a;
        super.e();
        this.a = null;
        return vor;
    }

    static /* synthetic */ void a(voq voq, cmg cmg, vor vor) {
        super.a(cmg, (cma) vor);
        voq.a = vor;
        voq.d.clear();
    }
}
