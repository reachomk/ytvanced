package defpackage;

import java.util.BitSet;

/* renamed from: tam */
public final class tam extends clz {
    public taj a;
    public final BitSet d = new BitSet(1);
    private final String[] e = new String[]{"componentCallable"};

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    /* renamed from: a */
    public final taj c() {
        clz.a(1, this.d, this.e);
        taj taj = this.a;
        super.e();
        this.a = null;
        return taj;
    }

    static /* synthetic */ void a(tam tam, cmg cmg, taj taj) {
        super.a(cmg, (cma) taj);
        tam.a = taj;
        tam.d.clear();
    }
}
