package defpackage;

import java.util.BitSet;

/* renamed from: svl */
public final class svl extends clz {
    public svm a;
    public final BitSet d = new BitSet(3);
    private final String[] e = new String[]{"image", "imageTransitionType", "logger"};

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final /* synthetic */ cma c() {
        clz.a(3, this.d, this.e);
        svm svm = this.a;
        super.e();
        this.a = null;
        return svm;
    }

    static /* synthetic */ void a(svl svl, cmg cmg, svm svm) {
        super.a(cmg, (cma) svm);
        svl.a = svm;
        svl.d.clear();
    }
}
