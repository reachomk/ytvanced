package defpackage;

import com.youtube.android.libraries.elements.templates.UnifiedTemplateResolver;
import java.util.ArrayList;
import java.util.List;

/* renamed from: smh */
public final class smh implements sos {
    public final swm a;
    public final svb b;
    public final sxz c;
    public final UnifiedTemplateResolver d;
    public final boolean e;
    private final sxd f;
    private final syi g;
    private final boolean h;
    private final boolean i;
    private final int j;
    private final boolean k;
    private final boolean l;

    public smh(syi syi, swm swm, svb svb, sxd sxd, sxz sxz, amqp amqp, amqp amqp2, amqp amqp3, amqp amqp4, amqp amqp5, amqp amqp6) {
        this.g = syi;
        this.a = swm;
        this.b = svb;
        this.f = sxd;
        this.c = sxz;
        Object valueOf = Boolean.valueOf(false);
        this.e = ((Boolean) amqp.a(valueOf)).booleanValue();
        this.h = ((Boolean) amqp2.a(valueOf)).booleanValue();
        this.i = ((Boolean) amqp3.a(valueOf)).booleanValue();
        this.j = ((Integer) amqp4.a(Integer.valueOf(0))).intValue();
        this.k = ((Boolean) amqp5.a(valueOf)).booleanValue();
        this.l = ((Boolean) amqp6.a(valueOf)).booleanValue();
        this.d = this.e ? new UnifiedTemplateResolver() : null;
    }

    public final /* synthetic */ clz a(cmg cmg, swk swk, Object obj, bapc bapc, List list) {
        Throwable e;
        swk swk2 = swk;
        baos baos = (baos) obj;
        if (baos.a() != null) {
            int a = baos.a(6);
            byte[] bArr = new byte[(a != 0 ? baos.d(a) : 0)];
            baos.a().get(bArr);
            syb syb = syb.a;
            if (!(swk2 == null || swk.d() == null)) {
                syb = swk.d();
            }
            try {
                Object obj2;
                azvv azvv = (azvv) anxl.parseFrom(azvv.a, bArr, anxa.c());
                Iterable arrayList = new ArrayList();
                anxr access$000 = anxl.checkIsLite(azwr.d);
                azvv.a(access$000);
                Object b = azvv.h.b(access$000.d);
                if (b == null) {
                    obj2 = access$000.b;
                } else {
                    obj2 = access$000.a(b);
                }
                String str = ((azwr) obj2).b;
                if (!str.isEmpty()) {
                    arrayList.add(str);
                }
                access$000 = anxl.checkIsLite(aztq.d);
                azvv.a(access$000);
                Object b2 = azvv.h.b(access$000.d);
                if (b2 == null) {
                    b2 = access$000.b;
                } else {
                    b2 = access$000.a(b2);
                }
                anxp anxp = ((aztq) b2).b;
                if (anxp == null) {
                    anxp = azvv.a;
                }
                access$000 = anxl.checkIsLite(azwr.d);
                anxp.a(access$000);
                b2 = anxp.h.b(access$000.d);
                if (b2 == null) {
                    b2 = access$000.b;
                } else {
                    b2 = access$000.a(b2);
                }
                String str2 = ((azwr) b2).b;
                if (!str2.isEmpty()) {
                    arrayList.add(str2);
                }
                syc a2 = syb.a(arrayList);
                try {
                    bbmi b3;
                    syi syi = this.g;
                    if (arrayList.isEmpty()) {
                        b3 = bbmi.b(new smo(a2, syi, bArr, bapc));
                    } else {
                        bapc bapc2 = bapc;
                        b3 = bbmi.a(bbmi.a(arrayList).c(new smn(this))).c(new smq(this, arrayList, a2, syi, bArr, bapc));
                    }
                    b3 = b3.e(new smk(this, baos, swk2, a2)).b(new smj(a2)).a(szg.a(new smm(a2)));
                    a2.getClass();
                    b3 = b3.a(new sml(a2));
                    clz smr = new smr();
                    try {
                        smr.a(smr, cmg, new sms());
                        smr.a.b = swk2;
                        smr.d.set(1);
                        smr.a.f = b3;
                        smr.d.set(4);
                        smr.a.e = this.e;
                        smr.d.set(3);
                        boolean z = this.l;
                        sms sms = smr.a;
                        sms.d = z;
                        sms.g = this.f;
                        smr.d.set(5);
                        smr.a.u = a2;
                        smr.d.set(6);
                        smr.a.c = this.h;
                        smr.d.set(2);
                        smr.a.a = new sly(this.i, this.j, this.k);
                        smr.d.set(0);
                        return smr;
                    } catch (sxf e2) {
                        e = e2;
                    }
                } catch (sxf e3) {
                    e = e3;
                    cmg cmg2 = cmg;
                    this.f.b(4, "Error resolving template", e);
                    return cza.a(cmg);
                }
            } catch (anyg e4) {
                throw new sxf("Failed to parse a TemplateConfig", e4);
            }
        }
        throw new sxf("Invalid ComponentType: null templateConfig");
    }
}
