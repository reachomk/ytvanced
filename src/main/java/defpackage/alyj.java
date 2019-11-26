package defpackage;

import java.util.List;

/* renamed from: alyj */
public final /* synthetic */ class alyj implements anij {
    private final alyf a;
    private final String b;
    private final String c;
    private final afpt d;
    private final int e;

    public alyj(alyf alyf, String str, String str2, afpt afpt, int i) {
        this.a = alyf;
        this.b = str;
        this.c = str2;
        this.d = afpt;
        this.e = i;
    }

    public final anjv a() {
        alyf alyf = this.a;
        String str = this.b;
        String str2 = this.c;
        afpt afpt = this.d;
        int i = this.e;
        boolean z = true;
        amqw.a(str.isEmpty() ^ 1);
        amqw.a(str2.isEmpty() ^ 1);
        amqw.a(afpt != afpt.g);
        for (amea amea : (List) alyf.a(afpt).get()) {
            if (str.equals(amea.G)) {
                break;
            }
        }
        amea amea2 = null;
        if (amea2 != null) {
            int a = amek.a(amea2.h);
            if (a != 0 && a == 4) {
                ambv a2 = alyf.f.a(amea2.g, new alyk(str2, i));
                amde amde = (amde) alyf.j.b(alyf.a);
                amea amea3 = a2.a;
                amea amea4 = a2.b;
                if (!(amea3 == null || amea4 == null)) {
                    Object obj = amea3.f;
                    if (obj == null) {
                        obj = ameo.g;
                    }
                    ameo ameo = amea4.f;
                    if (ameo == null) {
                        ameo = ameo.g;
                    }
                    if (!amqq.a(obj, ameo)) {
                        alyf.k.a(afpt.a(), amea2.g, ameo);
                    }
                }
                amde.a();
                if (a2.b == null) {
                    z = false;
                }
                return anjf.a(Boolean.valueOf(z));
            }
        }
        return anjf.a(Boolean.valueOf(false));
    }
}
