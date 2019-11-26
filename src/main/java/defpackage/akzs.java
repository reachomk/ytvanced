package defpackage;

import java.util.BitSet;

/* renamed from: akzs */
public final class akzs extends clz {
    private akzt a;
    private final String[] d = new String[]{"componentCallable"};
    private final BitSet e = new BitSet(1);

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final akzs a(akzz akzz) {
        this.a.a = akzz;
        this.e.set(0);
        return this;
    }

    /* renamed from: a */
    public final akzt c() {
        clz.a(1, this.e, this.d);
        akzt akzt = this.a;
        super.e();
        this.a = null;
        return akzt;
    }

    static /* synthetic */ void a(akzs akzs, cmg cmg, akzt akzt) {
        super.a(cmg, (cma) akzt);
        akzs.a = akzt;
        akzs.e.clear();
    }
}
