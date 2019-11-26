package defpackage;

import java.util.List;

/* renamed from: spr */
public final /* synthetic */ class spr implements soq {
    private final swf a;
    private final sxd b;

    public spr(swf swf, sxd sxd) {
        this.a = swf;
        this.b = sxd;
    }

    public final clz a(cmg cmg, swk swk, Object obj, String str, bdho bdho, List list) {
        swf swf = this.a;
        sxd sxd = this.b;
        bdhr bdhr = (bdhr) obj;
        bdhp bdhp = bdho != null ? (bdhp) szb.a(bdho, bdhp.a) : null;
        int i = bdhp != null ? bdhp.k : 0;
        spk spk = new spk();
        spk.a(spk, cmg, new sph());
        spk.a.e = sng.a(i);
        spk.d.set(3);
        spk.a.b = list;
        spk.d.set(0);
        spk.a.c = swf;
        spk.d.set(1);
        spk.a.u = bdhr;
        spk.d.set(5);
        spk.a.g = sxd;
        spk.d.set(4);
        spk.a.d = swk;
        spk.d.set(2);
        return spk;
    }
}
