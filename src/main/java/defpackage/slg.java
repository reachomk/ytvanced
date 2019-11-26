package defpackage;

import java.util.BitSet;

/* renamed from: slg */
public final class slg extends clz {
    public sld a;
    public final BitSet d = new BitSet(1);
    private final String[] e = new String[]{"type"};

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final /* synthetic */ cma c() {
        clz.a(1, this.d, this.e);
        sld sld = this.a;
        super.e();
        this.a = null;
        return sld;
    }

    static /* synthetic */ void a(slg slg, cmg cmg, sld sld) {
        super.a(cmg, (cma) sld);
        slg.a = sld;
        slg.d.clear();
    }
}
