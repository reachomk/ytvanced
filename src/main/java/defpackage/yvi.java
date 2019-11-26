package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: yvi */
public final class yvi implements afxc {
    private final /* synthetic */ String a;
    private final /* synthetic */ yvg b;

    public yvi(yvg yvg, String str) {
        this.b = yvg;
        this.a = str;
    }

    public final void a(atun atun) {
    }

    public final void a(atun atun, atur atur) {
        if (atur != null) {
            atut atut = atur.a == 110577257 ? (atut) atur.b : atut.c;
            if (!((atut.a & 1) == 0 || atut.b.b() == 0)) {
                aqoo aqoo = (aqoo) aqop.g.createBuilder();
                try {
                    aqoo.mergeFrom(atut.b, anxa.c());
                    yvh yvh = this.b.f;
                    String str = this.a;
                    aqop aqop = (aqop) ((anxl) aqoo.build());
                    yvl b = yvh.b(str, aqop.f);
                    ykt ykt = b.a;
                    if (ykt != null) {
                        Collection arrayList = new ArrayList(ykt.e);
                        if (aqop.c) {
                            ykr ykr = b.c;
                            if (ykr != null) {
                                arrayList.set(b.b, ykr.d().a(true).a(yvh.c.a()).b());
                            } else {
                                int size = b.a.e.size();
                                aprm aprm = ((yjf) yvh.b.get()).b().c;
                                if (aprm == null) {
                                    aprm = aprm.f;
                                }
                                if (size >= aprm.d) {
                                    amqw.a(b.d);
                                    yvh.a(str, b.d.a());
                                    arrayList.remove(b.d);
                                }
                                yjz yjz = new yjz();
                                String str2 = aqop.f;
                                if (str2 != null) {
                                    yjz.a = str2;
                                    yjz.a(true);
                                    yjz.a(yvh.c.a());
                                    arrayList.add(yjz.b());
                                } else {
                                    throw new NullPointerException("Null contactEntityKey");
                                }
                            }
                            yvh.a(str, aqop.f, 1);
                        } else {
                            ykr ykr2 = b.c;
                            if (ykr2 != null) {
                                yvh.a(str, ykr2.a());
                                arrayList.remove(b.c);
                            }
                        }
                        aaea b2 = yvh.a.b();
                        ykw h = b.a.h();
                        h.c = amul.a(arrayList);
                        b2.a(h.a()).a();
                    }
                } catch (anyg e) {
                    ankx.a(e);
                }
            }
        }
    }
}
