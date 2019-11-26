package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: agil */
final class agil implements aghy {
    private final /* synthetic */ agif a;

    public final void a(agqr agqr, Collection collection, HashSet hashSet, avsi avsi, int i, byte[] bArr, agqf agqf, agqq agqq) {
        agqr agqr2 = agqr;
        String str = agqr2.a;
        ArrayList arrayList = new ArrayList();
        for (agqp a : collection) {
            arrayList.add(a.a());
        }
        agig g = this.a.g(str);
        List a2 = g != null ? g.a() : null;
        agip e = this.a.e();
        synchronized (e.l) {
            xvd.a(str);
            e.d.remove(str);
            Set<String> set = (Set) e.j.remove(str);
            if (set != null) {
                for (String b : set) {
                    xsb.b(e.i, b, str);
                }
            }
        }
        this.a.a(agqr2, arrayList, a2, this.a.d.g(str));
        for (agqp agqp : collection) {
            String a3 = agqp.a();
            if (hashSet.contains(a3)) {
                agif agif = this.a;
                agif.a(agqp, avsi, i, bArr, agqf, agqq, str, agif.e.e(a3));
            }
            this.a.e().b(str, a3);
        }
    }

    public final void a(Collection collection) {
    }

    public final void a(agqr agqr, List list) {
        Object g = this.a.g(agqr.a);
        amqw.a(g);
        g.a(list);
    }

    /* synthetic */ agil(agif agif) {
        this.a = agif;
    }
}
