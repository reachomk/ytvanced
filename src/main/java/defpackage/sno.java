package defpackage;

import java.util.BitSet;

/* renamed from: sno */
public final class sno extends clz {
    public snl a;
    public final BitSet d = new BitSet(4);
    private final String[] e = new String[]{"commandResolver", "editableTextType", "logger", "typefaceProvider"};

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final /* synthetic */ cma c() {
        clz.a(4, this.d, this.e);
        snl snl = this.a;
        super.e();
        this.a = null;
        return snl;
    }

    static /* synthetic */ void a(sno sno, cmg cmg, snl snl) {
        super.a(cmg, (cma) snl);
        sno.a = snl;
        sno.d.clear();
    }
}
