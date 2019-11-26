package defpackage;

import java.util.BitSet;

/* renamed from: akzx */
public final class akzx extends clz {
    public akzu a;
    public final BitSet d = new BitSet(1);
    private final String[] e = new String[]{"componentCallable"};

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    /* renamed from: a */
    public final akzu c() {
        clz.a(1, this.d, this.e);
        akzu akzu = this.a;
        super.e();
        this.a = null;
        return akzu;
    }

    static /* synthetic */ void a(akzx akzx, cmg cmg, akzu akzu) {
        super.a(cmg, (cma) akzu);
        akzx.a = akzu;
        akzx.d.clear();
    }
}
