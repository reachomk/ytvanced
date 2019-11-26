package defpackage;

import java.util.ArrayList;

/* renamed from: alyl */
final /* synthetic */ class alyl implements anij {
    private final alyf a;
    private final afpt b;

    alyl(alyf alyf, afpt afpt) {
        this.a = alyf;
        this.b = afpt;
    }

    public final anjv a() {
        alyf alyf = this.a;
        afpt afpt = this.b;
        amqw.a(afpt != afpt.g);
        String a = afpt.a();
        Object arrayList = new ArrayList();
        for (amea amea : alyf.f.b().values()) {
            String str = amea.c;
            if (!str.isEmpty() && str.equals(a)) {
                amdz amdz = (amdz) ((anxo) amea.toBuilder());
                boolean f = alyf.g.f();
                boolean g = alyf.g.g();
                if (f || g) {
                    if (!amdz.d()) {
                        amdz.c(amec.g);
                    }
                    ameb ameb = (ameb) amec.g.createBuilder();
                    if (f) {
                        ameb.c(8);
                    } else {
                        ameb.c(9);
                    }
                    amdz.a(ameb);
                }
                str = String.valueOf(amdz.a());
                String str2 = "Pending Upload frontendUploadId: ";
                if (str.length() == 0) {
                    str = new String(str2);
                } else {
                    str2.concat(str);
                }
                arrayList.add((amea) ((anxl) amdz.build()));
            }
        }
        return anjf.a(arrayList);
    }
}
