package defpackage;

import java.util.List;

/* renamed from: spg */
public final /* synthetic */ class spg implements soq {
    private final swf a;
    private final syl b;
    private final sxd c;

    public spg(swf swf, syl syl, sxd sxd) {
        this.a = swf;
        this.b = syl;
        this.c = sxd;
    }

    public final clz a(cmg cmg, swk swk, Object obj, String str, bdho bdho, List list) {
        swf swf = this.a;
        syl syl = this.b;
        sxd sxd = this.c;
        bdhe bdhe = (bdhe) obj;
        sov sov = new sov();
        sov.a(sov, cmg, new sow());
        sov.a.a = swf;
        sov.d.set(0);
        sov.a.b = bdhe;
        sov.d.set(1);
        sov.a.d = syl;
        sov.d.set(3);
        sov.a.c = sxd;
        sov.d.set(2);
        return sov;
    }
}
