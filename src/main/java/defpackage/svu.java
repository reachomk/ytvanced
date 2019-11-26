package defpackage;

import java.util.BitSet;

/* renamed from: svu */
public final class svu extends clz {
    public svr a;
    public final BitSet d = new BitSet(3);
    private final String[] e = new String[]{"image", "imageTransitionType", "logger"};

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final /* synthetic */ cma c() {
        clz.a(3, this.d, this.e);
        svr svr = this.a;
        super.e();
        this.a = null;
        return svr;
    }

    static /* synthetic */ void a(svu svu, cmg cmg, svr svr) {
        super.a(cmg, (cma) svr);
        svu.a = svr;
        svu.d.clear();
    }
}
