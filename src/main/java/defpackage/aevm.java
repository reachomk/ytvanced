package defpackage;

import java.util.ArrayList;

/* renamed from: aevm */
public final class aevm implements aevh {
    private final nwn a;
    private String b;
    private npf c;
    private ofj d;

    public aevm(nwn nwn) {
        this.a = nwn;
    }

    public final ofj a(String str) {
        amqw.a((Object) str);
        npf npf = (npf) this.a.l;
        if (npf == null) {
            return null;
        }
        int i;
        String str2 = this.b;
        if (str2 != null && str2.equals(str)) {
            npf npf2 = this.c;
            if (npf2 != null && npf2.equals(npf)) {
                ofj ofj = this.d;
                if (ofj != null) {
                    return ofj;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (i = 0; i < npf.b(); i++) {
            long b = npf.b(i) * 1000;
            for (npe npe : npf.a(i).b) {
                for (npm npm : npe.b) {
                    nom nom = npm.b;
                    if (nom != null && str.equals(nom.a)) {
                        npa d = npm.d();
                        for (int a = d.a(); a <= d.a(b); a++) {
                            npj b2 = d.b(a);
                            if (b2 != null) {
                                aevi aevi = new aevi();
                                aevi.b((int) b2.b);
                                aevi.a(d.a(a, b));
                                aevi.b(d.a(a));
                                aevi.a(arrayList.size());
                                arrayList.add(aevi.a());
                                arrayList2.add(Long.valueOf(b2.a));
                            }
                        }
                    }
                }
            }
        }
        amqw.a(arrayList.size() == arrayList2.size());
        i = arrayList.size();
        amqw.a(i >= 0);
        ofj ofj2 = new ofj(new int[i], new long[i], new long[i], new long[i]);
        for (i = 0; i < ofj2.a; i++) {
            aevj aevj = (aevj) arrayList.get(i);
            boolean z = aevj.a >= 0 && aevj.b >= 0 && aevj.c >= 0 && aevj.d >= 0;
            amqw.a(z);
            int i2 = aevj.a;
            boolean z2 = i2 >= 0 && i2 < ofj2.a;
            amqw.a(z2);
            ofj2.b[i2] = aevj.d;
            ofj2.d[i2] = aevj.c;
            ofj2.e[i2] = aevj.b;
            ofj2.c[i] = ((Long) arrayList2.get(i)).longValue();
        }
        this.b = str;
        this.c = npf;
        this.d = ofj2;
        return ofj2;
    }
}
