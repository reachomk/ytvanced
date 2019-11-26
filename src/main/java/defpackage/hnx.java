package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: hnx */
public final class hnx extends hnn {
    private final bcaa a;

    public hnx(bcaa bcaa) {
        super(agqk.class, aqfs.class);
        this.a = bcaa;
    }

    public final /* synthetic */ Object a(Object obj, amur amur) {
        aqfs aqfs;
        aqfs aqfs2;
        agqk agqk = (agqk) obj;
        agqi agqi = agqk.a;
        boolean z = false;
        hnw hnw = new hnw();
        hnw.a = ajqy.a(agqi.b);
        hnw.c = ajqy.a(Integer.toString(agqi.e));
        hnw.d = agqi.d.d();
        hnw.e = ekc.a(agqi.a);
        auvp a = ((hoc) this.a.get()).a(agqk);
        if (hnw.f == null) {
            hnw.f = new ArrayList();
        }
        List list = hnw.f;
        auvm auvm = (auvm) auvj.j.createBuilder();
        auvm.a(a);
        list.add((auvj) ((anxl) auvm.build()));
        awhg awhg = (awhg) awhh.c.createBuilder();
        awhg.a(agqi.a);
        hnw.g = (awhh) ((anxl) awhg.build());
        ayft ayft = (ayft) ayfu.q.createBuilder();
        ayft.a(ayfo.a);
        hnw.h = (ayfu) ((anxl) ayft.build());
        if (agqi.c != null) {
            hnw.b = ajqy.a(agqi.c.b);
        }
        aqfr aqfr = (aqfr) aqfs.v.createBuilder();
        arml arml = hnw.a;
        if (arml != null) {
            aqfr.copyOnWrite();
            aqfs = (aqfs) aqfr.instance;
            aqfs.f = arml;
            aqfs.a |= 8;
        }
        arml = hnw.b;
        if (arml != null) {
            aqfr.copyOnWrite();
            aqfs = (aqfs) aqfr.instance;
            aqfs.g = arml;
            aqfs.a |= 16;
        }
        arml = hnw.c;
        if (arml != null) {
            aqfr.copyOnWrite();
            aqfs = (aqfs) aqfr.instance;
            aqfs.k = arml;
            aqfs.a |= 128;
        }
        aygk aygk = hnw.d;
        if (aygk != null) {
            aqfr.copyOnWrite();
            aqfs = (aqfs) aqfr.instance;
            aqfs.e = aygk;
            aqfs.a |= 4;
        }
        apxu apxu = hnw.e;
        if (apxu != null) {
            aqfr.copyOnWrite();
            aqfs = (aqfs) aqfr.instance;
            aqfs.l = apxu;
            aqfs.a |= 256;
        }
        List list2 = hnw.f;
        if (!(list2 == null || list2.isEmpty())) {
            auvu auvu = (auvu) auvr.c.createBuilder();
            list = hnw.f;
            if (!(list == null || list.isEmpty())) {
                z = true;
            }
            amqw.b(z);
            auvq auvq = (auvq) auvn.l.createBuilder();
            auvq.a(hnw.f);
            auvu.a((auvn) ((anxl) auvq.build()));
            aqfr.copyOnWrite();
            aqfs2 = (aqfs) aqfr.instance;
            aqfs2.q = (auvr) ((anxl) auvu.build());
            aqfs2.a |= 131072;
        }
        awhh awhh = hnw.g;
        if (awhh != null) {
            aqfr.copyOnWrite();
            aqfs2 = (aqfs) aqfr.instance;
            aqfs2.u = awhh;
            aqfs2.a |= 2097152;
        }
        ayfu ayfu = hnw.h;
        if (ayfu != null) {
            aqfr.copyOnWrite();
            aqfs aqfs3 = (aqfs) aqfr.instance;
            if (!aqfs3.d.a()) {
                aqfs3.d = anxl.mutableCopy(aqfs3.d);
            }
            aqfs3.d.add(ayfu);
        }
        return (aqfs) ((anxl) aqfr.build());
    }
}
