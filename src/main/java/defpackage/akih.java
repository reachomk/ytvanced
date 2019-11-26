package defpackage;

import java.util.BitSet;

/* renamed from: akih */
public final class akih extends clz {
    public akii a;
    public final BitSet d = new BitSet(5);
    private final String[] e = new String[]{"image", "imageManager", "imagePrefetchRangeRatio", "imageTransitionType", "logger"};

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final /* synthetic */ cma c() {
        clz.a(5, this.d, this.e);
        akii akii = this.a;
        super.e();
        this.a = null;
        return akii;
    }

    static /* synthetic */ void a(akih akih, cmg cmg, akii akii) {
        super.a(cmg, (cma) akii);
        akih.a = akii;
        akih.d.clear();
    }
}
