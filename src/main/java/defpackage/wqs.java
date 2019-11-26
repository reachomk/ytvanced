package defpackage;

import com.google.protos.youtube.api.innertube.YpcGetCartEndpoint$YPCGetCartEndpoint;
import java.util.Map;

/* renamed from: wqs */
public class wqs implements aaap {
    private final wph a;
    private final ablj b;
    private final aamj c;
    public wre s;

    public wqs(wph wph, ablj ablj, aamj aamj) {
        this.a = wph;
        this.b = ablj;
        this.c = aamj;
    }

    public void a(apxu apxu, Map map) {
        b(apxu, map);
        anxr access$000 = anxl.checkIsLite(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint);
        apxu.a(access$000);
        atqe atqe = null;
        if (apxu.h.a(access$000.d)) {
            Object obj;
            access$000 = anxl.checkIsLite(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint = (YpcGetCartEndpoint$YPCGetCartEndpoint) obj;
            azmo azmo = ypcGetCartEndpoint$YPCGetCartEndpoint.h;
            if (azmo == null) {
                azmo = azmo.c;
            }
            if (((azmo.a == 95698847 ? (azmq) azmo.b : azmq.c).a & 1) != 0) {
                azmq azmq;
                aamj aamj = this.c;
                azmo azmo2 = ypcGetCartEndpoint$YPCGetCartEndpoint.h;
                if (azmo2 == null) {
                    azmo2 = azmo.c;
                }
                if (azmo2.a == 95698847) {
                    azmq = (azmq) azmo2.b;
                } else {
                    azmq = azmq.c;
                }
                atqe = (atqe) aamj.a(azmq.b.d(), atqe.o);
            }
        }
        if (atqe != null) {
            a(atqe, apxu);
        } else {
            a(apxu);
        }
    }

    /* Access modifiers changed, original: protected */
    public void b(apxu apxu, Map map) {
        wpk wpk = (wpk) xsb.a(map, (Object) "OnYpcTransactionListener", wpk.class);
        if (wpk != null) {
            this.a.k = wpk;
        }
        this.s = (wre) xsb.a(map, (Object) "YpcTransactionListener", wre.class);
        wre wre = this.s;
        if (wre != null) {
            wph wph = this.a;
            wre.getClass();
            wph.l = new wqv(wre);
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(atqe atqe, apxu apxu) {
        this.a.a(atqe);
    }

    /* Access modifiers changed, original: protected */
    public void a(apxu apxu) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                Object obj;
                access$000 = anxl.checkIsLite(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(b);
                }
                YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint = (YpcGetCartEndpoint$YPCGetCartEndpoint) obj;
                wph wph;
                anvu anvu;
                String str;
                long j;
                apig apig;
                if (!ypcGetCartEndpoint$YPCGetCartEndpoint.b.isEmpty()) {
                    wph = this.a;
                    String str2 = ypcGetCartEndpoint$YPCGetCartEndpoint.b;
                    anvu = apxu.b;
                    abmd a = this.b.a();
                    a.a = aali.b(str2);
                    a.a(anvu);
                    wph.a(a);
                } else if ((ypcGetCartEndpoint$YPCGetCartEndpoint.a & 2) == 0 || ypcGetCartEndpoint$YPCGetCartEndpoint.c.b() <= 0) {
                    if (!ypcGetCartEndpoint$YPCGetCartEndpoint.i.isEmpty()) {
                        wph = this.a;
                        str = ypcGetCartEndpoint$YPCGetCartEndpoint.i;
                        j = ypcGetCartEndpoint$YPCGetCartEndpoint.j;
                        anvu = apxu.b;
                        abmd a2 = this.b.a();
                        a2.c(str);
                        a2.c = j;
                        a2.a(anvu);
                        wph.a(a2);
                    }
                } else if (ypcGetCartEndpoint$YPCGetCartEndpoint.d.isEmpty()) {
                    wph = this.a;
                    byte[] d = ypcGetCartEndpoint$YPCGetCartEndpoint.c.d();
                    j = ypcGetCartEndpoint$YPCGetCartEndpoint.e;
                    String str3 = ypcGetCartEndpoint$YPCGetCartEndpoint.f;
                    augl augl = ypcGetCartEndpoint$YPCGetCartEndpoint.g;
                    if (augl == null) {
                        augl = augl.d;
                    }
                    anvu = apxu.b;
                    abmd a3 = this.b.a();
                    a3.b(d);
                    if (a3.b == null) {
                        a3.b = (apig) apid.f.createBuilder();
                    }
                    apig apig2 = a3.b;
                    apig2.a(j);
                    apig2.build();
                    if (augl == null) {
                        if (a3.b == null) {
                            a3.b = (apig) apid.f.createBuilder();
                        }
                        apig = a3.b;
                        apig.a(str3);
                        apig.build();
                    } else {
                        if (a3.b == null) {
                            a3.b = (apig) apid.f.createBuilder();
                        }
                        apig2 = a3.b;
                        apig2.a(augl);
                        apig2.build();
                    }
                    a3.a(anvu);
                    wph.a(a3);
                } else {
                    wph = this.a;
                    str = ypcGetCartEndpoint$YPCGetCartEndpoint.d;
                    byte[] d2 = ypcGetCartEndpoint$YPCGetCartEndpoint.c.d();
                    anvu = apxu.b;
                    abmd a4 = this.b.a();
                    a4.b(d2);
                    if (a4.b == null) {
                        a4.b = (apig) apid.f.createBuilder();
                    }
                    apig = a4.b;
                    apig.copyOnWrite();
                    apid apid = (apid) apig.instance;
                    if (str != null) {
                        apid.b = 5;
                        apid.c = str;
                        apig.build();
                        a4.a(anvu);
                        wph.a(a4);
                        return;
                    }
                    throw new NullPointerException();
                }
            }
        }
    }
}
