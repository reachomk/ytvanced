package defpackage;

import java.util.BitSet;

/* renamed from: skb */
public final class skb extends clz {
    public skc a;
    public final BitSet d = new BitSet(4);
    private final String[] e = new String[]{"componentElementSubscription", "delegate", "elementConverterFlat", "templateLoggerFactory"};

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    /* renamed from: a */
    public final skc c() {
        clz.a(4, this.d, this.e);
        skc skc = this.a;
        super.e();
        this.a = null;
        return skc;
    }

    static /* synthetic */ void a(skb skb, cmg cmg, skc skc) {
        super.a(cmg, (cma) skc);
        skb.a = skc;
        skb.d.clear();
    }
}
