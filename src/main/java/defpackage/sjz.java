package defpackage;

import java.util.BitSet;

/* renamed from: sjz */
public final class sjz extends clz {
    public ska a;
    public final BitSet d = new BitSet(4);
    private final String[] e = new String[]{"componentElementSubscription", "delegate", "elementConverter", "templateLoggerFactory"};

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    /* renamed from: a */
    public final ska c() {
        clz.a(4, this.d, this.e);
        ska ska = this.a;
        super.e();
        this.a = null;
        return ska;
    }

    static /* synthetic */ void a(sjz sjz, cmg cmg, ska ska) {
        super.a(cmg, (cma) ska);
        sjz.a = ska;
        sjz.d.clear();
    }
}
