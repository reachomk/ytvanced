package defpackage;

import java.util.BitSet;

/* renamed from: spw */
public final class spw extends clz {
    private spt a;
    private final String[] d = new String[]{"commandResolver", "logger", "textType", "typefaceProvider"};
    private final BitSet e = new BitSet(4);

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final spw a(swf swf) {
        this.a.a = swf;
        this.e.set(0);
        return this;
    }

    public final spw a(sxd sxd) {
        this.a.b = sxd;
        this.e.set(1);
        return this;
    }

    public final spw a(bdhu bdhu) {
        this.a.c = bdhu;
        this.e.set(2);
        return this;
    }

    public final spw a(syl syl) {
        this.a.d = syl;
        this.e.set(3);
        return this;
    }

    /* renamed from: a */
    public final spt c() {
        clz.a(4, this.e, this.d);
        spt spt = this.a;
        super.e();
        this.a = null;
        return spt;
    }

    static /* synthetic */ void a(spw spw, cmg cmg, spt spt) {
        super.a(cmg, (cma) spt);
        spw.a = spt;
        spw.e.clear();
    }
}
