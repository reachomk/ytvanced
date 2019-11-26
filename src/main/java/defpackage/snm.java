package defpackage;

import java.util.List;

/* renamed from: snm */
public final /* synthetic */ class snm implements sos {
    private final swf a;
    private final syl b;
    private final sxd c;

    public snm(swf swf, syl syl, sxd sxd) {
        this.a = swf;
        this.b = syl;
        this.c = sxd;
    }

    public final clz a(cmg cmg, swk swk, Object obj, bapc bapc, List list) {
        swf swf = this.a;
        syl syl = this.b;
        sxd sxd = this.c;
        baow baow = (baow) obj;
        sno sno = new sno();
        sno.a(sno, cmg, new snl());
        sno.a.a = swf;
        sno.d.set(0);
        sno.a.b = baow;
        sno.d.set(1);
        sno.a.d = syl;
        sno.d.set(3);
        sno.a.c = sxd;
        sno.d.set(2);
        return sno;
    }
}
