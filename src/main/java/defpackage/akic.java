package defpackage;

import java.util.BitSet;

/* renamed from: akic */
public final class akic extends clz {
    public akhz a;
    public final BitSet d = new BitSet(5);
    private final String[] e = new String[]{"image", "imageManager", "imagePrefetchRangeRatio", "imageTransitionType", "logger"};

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final /* synthetic */ cma c() {
        clz.a(5, this.d, this.e);
        akhz akhz = this.a;
        super.e();
        this.a = null;
        return akhz;
    }

    static /* synthetic */ void a(akic akic, cmg cmg, akhz akhz) {
        super.a(cmg, (cma) akhz);
        akic.a = akhz;
        akic.d.clear();
    }
}
