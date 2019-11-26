package defpackage;

import java.util.BitSet;

/* renamed from: dac */
public final class dac extends clz {
    public czz a;
    public final BitSet d = new BitSet(1);
    private final String[] e = new String[]{"binder"};

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final /* bridge */ /* synthetic */ clz a(CharSequence charSequence) {
        super.a(charSequence);
        this.a.f = charSequence;
        return this;
    }

    public final /* synthetic */ cma c() {
        clz.a(1, this.d, this.e);
        czz czz = this.a;
        super.e();
        this.a = null;
        return czz;
    }

    static /* synthetic */ void a(dac dac, cmg cmg, czz czz) {
        super.a(cmg, (cma) czz);
        dac.a = czz;
        dac.d.clear();
    }
}
