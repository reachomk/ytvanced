package defpackage;

import java.util.BitSet;

/* renamed from: spx */
public final class spx extends clz {
    private spy a;
    private final String[] d = new String[]{"commandResolver", "logger", "textType", "typefaceProvider"};
    private final BitSet e = new BitSet(4);

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final spx a(swf swf) {
        this.a.a = swf;
        this.e.set(0);
        return this;
    }

    public final spx a(sxd sxd) {
        this.a.b = sxd;
        this.e.set(1);
        return this;
    }

    public final spx a(bapq bapq) {
        this.a.c = bapq;
        this.e.set(2);
        return this;
    }

    public final spx a(syl syl) {
        this.a.d = syl;
        this.e.set(3);
        return this;
    }

    /* renamed from: a */
    public final spy c() {
        clz.a(4, this.e, this.d);
        spy spy = this.a;
        super.e();
        this.a = null;
        return spy;
    }

    static /* synthetic */ void a(spx spx, cmg cmg, spy spy) {
        super.a(cmg, (cma) spy);
        spx.a = spy;
        spx.e.clear();
    }
}
