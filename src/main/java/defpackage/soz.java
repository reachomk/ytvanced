package defpackage;

import java.util.BitSet;

/* renamed from: soz */
public final class soz extends clz {
    public spa a;
    public final BitSet d = new BitSet(4);
    private final String[] e = new String[]{"commandResolver", "expandableTextType", "logger", "typefaceProvider"};

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final /* synthetic */ cma c() {
        clz.a(4, this.d, this.e);
        spa spa = this.a;
        super.e();
        this.a = null;
        return spa;
    }

    static /* synthetic */ void a(soz soz, cmg cmg, spa spa) {
        super.a(cmg, (cma) spa);
        soz.a = spa;
        soz.d.clear();
    }
}
