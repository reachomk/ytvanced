package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: algn */
public final class algn extends aktw implements algm {
    public final akoh a = new akoh();
    private final List b = new ArrayList();

    public algn(aylu aylu, Context context, akkq akkq, aaas aaas) {
        aymc aymc;
        ayme ayme = aylu.c;
        if (ayme == null) {
            ayme = ayme.c;
        }
        ayky ayky = null;
        if (ayme.a != 92759253) {
            aymc = null;
        } else {
            ayme = aylu.c;
            if (ayme == null) {
                ayme = ayme.c;
            }
            if (ayme.a == 92759253) {
                aymc = (aymc) ayme.b;
            } else {
                aymc = aymc.d;
            }
        }
        if (aymc != null) {
            algp algp = new algp(aymc, context, aaas);
            this.b.add(algp);
            this.a.a(algp.a);
        }
        aylc aylc = aylu.d;
        if (aylc == null) {
            aylc = aylc.c;
        }
        if (aylc.a == 87535215) {
            aylc aylc2 = aylu.d;
            if (aylc2 == null) {
                aylc2 = aylc.c;
            }
            if (aylc2.a == 87535215) {
                ayky = (ayky) aylc2.b;
            } else {
                ayky = ayky.f;
            }
        }
        if (ayky != null) {
            alft alft = new alft(ayky, context, akkq);
            this.b.add(alft);
            this.a.a(alft.a);
        }
    }

    public final aknh a() {
        return this.a;
    }

    public final void a(List list) {
        List arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(this.b);
        for (algm a : this.b) {
            a.a(arrayList);
        }
    }

    public final void a(akpb akpb) {
        for (algm a : this.b) {
            a.a(akpb);
        }
    }
}
