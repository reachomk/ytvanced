package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: slx */
public final class slx implements soq {
    public final swm a;
    public final svb b;
    private final sxd c;
    private final syg d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final int h;
    private final boolean i;
    private final boolean j;

    public slx(syg syg, swm swm, svb svb, sxd sxd, amqp amqp, amqp amqp2, amqp amqp3, amqp amqp4, amqp amqp5, amqp amqp6) {
        this.d = syg;
        this.a = swm;
        this.b = svb;
        this.c = sxd;
        Object valueOf = Boolean.valueOf(false);
        this.e = ((Boolean) amqp.a(valueOf)).booleanValue();
        this.f = ((Boolean) amqp2.a(valueOf)).booleanValue();
        this.g = ((Boolean) amqp3.a(valueOf)).booleanValue();
        this.h = ((Integer) amqp4.a(Integer.valueOf(0))).intValue();
        this.i = ((Boolean) amqp5.a(valueOf)).booleanValue();
        this.j = ((Boolean) amqp6.a(valueOf)).booleanValue();
    }

    public final /* synthetic */ clz a(cmg cmg, swk swk, Object obj, String str, bdho bdho, List list) {
        bdgm bdgm = (bdgm) obj;
        if (bdgm.b != null) {
            syb syb = syb.a;
            if (!(swk == null || swk.d() == null)) {
                syb = swk.d();
            }
            bdhv bdhv = bdgm.b;
            Iterable arrayList = new ArrayList();
            bdhy bdhy = (bdhy) szb.a(bdhv, bdhy.a);
            if (bdhy != null) {
                arrayList.add(bdhy.b);
            }
            bdgz bdgz = (bdgz) szb.a(bdhv, bdgz.a);
            if (bdgz != null) {
                bdhy bdhy2 = (bdhy) bdgz.b.getExtension(bdhy.a);
                if (bdhy2 != null) {
                    arrayList.add(bdhy2.b);
                }
            }
            syc a = syb.a(arrayList);
            try {
                bbmi b;
                swm swm = this.a;
                syg syg = this.d;
                if (arrayList.isEmpty()) {
                    b = bbmi.b(new sme(a, syg, bdgm, bdho));
                } else {
                    b = bbmi.a(bbmi.a(arrayList).c(new smd(swm))).c(new smg(a, syg, bdgm, bdho));
                }
                b = b.e(new sma(this, bdgm, swk, a)).b(new slz(a)).a(szg.a(new smc(a)));
                a.getClass();
                b = b.a(new smb(a));
                clz slt = new slt();
                slt.a(slt, cmg, new slu());
                slt.a.b = swk;
                slt.d.set(1);
                slt.a.f = b;
                slt.d.set(4);
                slt.a.e = this.e;
                slt.d.set(3);
                boolean z = this.j;
                slu slu = slt.a;
                slu.d = z;
                slu.g = this.c;
                slt.d.set(5);
                slt.a.u = a;
                slt.d.set(6);
                slt.a.c = this.f;
                slt.d.set(2);
                slt.a.a = new sly(this.g, this.h, this.i);
                slt.d.set(0);
                return slt;
            } catch (sxf e) {
                sxd sxd = this.c;
                String a2 = szb.a(bdho);
                String aocf = bdgm.b.toString();
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(a2).length() + 26) + String.valueOf(aocf).length());
                stringBuilder.append(a2);
                stringBuilder.append(" Error resolving template ");
                stringBuilder.append(aocf);
                sxd.b(4, stringBuilder.toString(), e);
                return cza.a(cmg);
            }
        }
        throw new sxf("Invalid ComponentType: null templateConfig");
    }
}
