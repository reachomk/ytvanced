package defpackage;

import java.util.List;

/* renamed from: spu */
public final /* synthetic */ class spu implements sos {
    private final sxd a;
    private final swf b;

    public spu(sxd sxd, swf swf) {
        this.a = sxd;
        this.b = swf;
    }

    public final clz a(cmg cmg, swk swk, Object obj, bapc bapc, List list) {
        sxd sxd = this.a;
        swf swf = this.b;
        bapj bapj = (bapj) obj;
        spm spm = new spm();
        spm.a(spm, cmg, new spj());
        spm.a.e = snf.a(bapc);
        spm.d.set(3);
        spm.a.b = list;
        spm.d.set(0);
        spm.a.g = sxd;
        spm.d.set(4);
        spm.a.c = swf;
        spm.d.set(1);
        spm.a.u = bapj;
        spm.d.set(5);
        spm.a.d = swk;
        spm.d.set(2);
        return spm;
    }
}
