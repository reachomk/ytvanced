package defpackage;

import java.util.BitSet;

/* renamed from: sls */
public final class sls extends cwk {
    public slp b;
    public final BitSet c = new BitSet(6);
    private final String[] d = new String[]{"children", "collectionType", "componentElementSubscription", "conversionContext", "decorator", "elementConverterFlat"};

    public final void a(cwj cwj, slp slp) {
        super.a(cwj, slp);
        this.b = slp;
        this.c.clear();
    }

    public final slp b() {
        cwk.a(6, this.c, this.d);
        slp slp = this.b;
        super.a();
        this.b = null;
        return slp;
    }
}
