package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: algp */
public final class algp extends aktw implements algm, aloa {
    public final akpk a = new akpk();
    private final Context b;
    private final aaas c;
    private final aymc d;
    private final List e = new ArrayList();

    public algp(aymc aymc, Context context, aaas aaas) {
        this.b = (Context) amqw.a((Object) context);
        this.c = (aaas) amqw.a((Object) aaas);
        this.d = (aymc) amqw.a((Object) aymc);
        this.a.add(aymc);
    }

    public final void a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj instanceof almu) {
                almu almu = (almu) obj;
                this.e.add(almu);
                apfo a = algp.a(this.d);
                boolean z = a != null && a.c;
                almu.a(z);
            }
        }
    }

    public final aknh a() {
        return this.a;
    }

    public final void a(akpb akpb) {
        akpb.a(aymc.class, new alob(this.b, this));
    }

    public final void a(boolean z) {
        apfo a = algp.a(this.d);
        if (a != null) {
            apxu apxu;
            if (z) {
                apxu = a.e;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            } else {
                apxu = a.f;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            }
            this.c.a(apxu, null);
        }
        for (almu a2 : this.e) {
            a2.a(z);
        }
    }

    private static apfo a(aymc aymc) {
        apfm apfm = aymc.c;
        if (apfm == null) {
            apfm = apfm.d;
        }
        if ((apfm.a & 2) == 0) {
            return null;
        }
        apfm apfm2 = aymc.c;
        if (apfm2 == null) {
            apfm2 = apfm.d;
        }
        apfo apfo = apfm2.c;
        if (apfo == null) {
            apfo = apfo.i;
        }
        return apfo;
    }
}
