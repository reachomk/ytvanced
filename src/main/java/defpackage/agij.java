package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: agij */
final class agij implements agft {
    private final /* synthetic */ agif a;

    public final void a(agqi agqi) {
        int size = this.a.c().size();
        this.a.f(agqi.a);
        if (size > 0 && this.a.c().size() == 0) {
            for (agih c : this.a.h) {
                c.c();
            }
        }
    }

    public final void a(Collection collection) {
    }

    public final void a(agqi agqi, Collection collection, HashSet hashSet, avsi avsi, int i, byte[] bArr, Set set, agqq agqq) {
        String str = agqi.a;
        ArrayList arrayList = new ArrayList();
        for (agqp a : collection) {
            arrayList.add(a.a());
        }
        int h = this.a.c.h(str);
        long g = this.a.c.g(str);
        this.a.f(str);
        this.a.a(agqi, arrayList, avsi, i, g, h);
        for (agqp agqp : collection) {
            String a2 = agqp.a();
            if (hashSet.contains(a2)) {
                agqf agqf;
                agif agif = this.a;
                if (set.contains(a2)) {
                    agqf = agqf.ACTIVE;
                } else {
                    agqf = agqf.STREAM_DOWNLOAD_PENDING;
                }
                agif.a(agqp, avsi, i, bArr, agqf, agqq, str, this.a.e.e(a2));
            } else {
                Set set2 = set;
            }
            this.a.e().a(str, a2);
        }
    }

    /* synthetic */ agij(agif agif) {
        this.a = agif;
    }
}
