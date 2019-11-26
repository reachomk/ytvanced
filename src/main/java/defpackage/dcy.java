package defpackage;

import java.util.BitSet;

/* renamed from: dcy */
public final class dcy extends clz {
    private dcv a;
    private final String[] d = new String[]{"childComponent"};
    private final BitSet e = new BitSet(1);

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final dcy a(clz clz) {
        this.a.a = clz != null ? (sne) clz.c() : null;
        this.e.set(0);
        return this;
    }

    public final dcy a() {
        this.a.b = true;
        return this;
    }

    public final dcy b() {
        this.a.c = true;
        return this;
    }

    public final dcy b(boolean z) {
        this.a.d = z;
        return this;
    }

    public final dcy a(Integer num) {
        this.a.e = num;
        return this;
    }

    public final dcy g() {
        this.a.f = true;
        return this;
    }

    public final dcy a(adh adh) {
        this.a.g = adh;
        return this;
    }

    public final dcy c(boolean z) {
        this.a.u = z;
        return this;
    }

    public final /* synthetic */ cma c() {
        clz.a(1, this.e, this.d);
        dcv dcv = this.a;
        super.e();
        this.a = null;
        return dcv;
    }

    static /* synthetic */ void a(dcy dcy, cmg cmg, dcv dcv) {
        super.a(cmg, (cma) dcv);
        dcy.a = dcv;
        dcy.e.clear();
    }
}
