package defpackage;

import java.util.BitSet;

/* renamed from: slq */
public final class slq extends cwk {
    public sln b;
    public final BitSet c = new BitSet(6);
    private final String[] d = new String[]{"children", "componentElementSubscription", "conversionContext", "decorator", "elementConverter", "sections"};

    public final void a(cwj cwj, sln sln) {
        super.a(cwj, sln);
        this.b = sln;
        this.c.clear();
    }

    public final sln b() {
        cwk.a(6, this.c, this.d);
        sln sln = this.b;
        super.a();
        this.b = null;
        return sln;
    }
}
