package defpackage;

import java.util.BitSet;

/* renamed from: snk */
public final class snk extends clz {
    public snh a;
    public final BitSet d = new BitSet(4);
    private final String[] e = new String[]{"commandResolver", "editableTextType", "logger", "typefaceProvider"};

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final /* synthetic */ cma c() {
        clz.a(4, this.d, this.e);
        snh snh = this.a;
        super.e();
        this.a = null;
        return snh;
    }

    static /* synthetic */ void a(snk snk, cmg cmg, snh snh) {
        super.a(cmg, (cma) snh);
        snk.a = snh;
        snk.d.clear();
    }
}
