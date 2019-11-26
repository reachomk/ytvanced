package defpackage;

import java.util.ArrayList;
import java.util.BitSet;

/* renamed from: cxo */
public final class cxo extends clz {
    private cxm a;
    private final String[] d = new String[]{"section"};
    private final BitSet e = new BitSet(1);

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final cxo u(float f) {
        this.a.a = this.c.a(f);
        return this;
    }

    public final cxo a() {
        this.a.b = false;
        return this;
    }

    public final cxo b() {
        this.a.c = false;
        return this;
    }

    public final cxo g() {
        this.a.d = true;
        return this;
    }

    public final cxo v(float f) {
        this.a.e = this.c.a(f);
        return this;
    }

    public final cxo a(apv apv) {
        cxm cxm = this.a;
        if (cxm.f == null) {
            cxm.f = new ArrayList();
        }
        this.a.f.add(apv);
        return this;
    }

    public final cxo a(cxv cxv) {
        this.a.g = cxv;
        return this;
    }

    public final cxo w(float f) {
        this.a.u = this.c.a(f);
        return this;
    }

    public final cxo a(cwh cwh) {
        this.a.v = cwh;
        this.e.set(0);
        return this;
    }

    public final cxo x(float f) {
        this.a.w = this.c.a(f);
        return this;
    }

    /* renamed from: h */
    public final cxm c() {
        clz.a(1, this.e, this.d);
        cxm cxm = this.a;
        super.e();
        this.a = null;
        return cxm;
    }

    static /* synthetic */ void a(cxo cxo, cmg cmg, cxm cxm) {
        super.a(cmg, (cma) cxm);
        cxo.a = cxm;
        cxo.e.clear();
    }
}
