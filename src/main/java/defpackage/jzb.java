package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: jzb */
final class jzb extends apv implements jue {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public int b = 0;
    private final /* synthetic */ jyi c;

    public final void a(juh juh) {
        this.a.add(juh);
    }

    public final void b(juh juh) {
        this.a.remove(juh);
    }

    public final int a() {
        return this.b;
    }

    public final void a(RecyclerView recyclerView, int i) {
        jyi jyi;
        this.b = i;
        if (i == 0) {
            if (this.c.r.p() != -1) {
                jyi = this.c;
                jyi.k = jyi.r.p();
            }
            this.c.f();
            jyi = this.c;
            if (!(jyi.l == null || jyi.j == null || !jyi.n)) {
                i = jyi.m;
                if (i != jyi.k) {
                    Object obj = jyi.e.get(i);
                    if (obj instanceof aqto) {
                        aqto aqto = (aqto) obj;
                        if ((aqto.a & 131072) != 0) {
                            jyi.j.a(65, new acvs(aqto.u.d()), null);
                        }
                    }
                }
            }
            jyi = this.c;
            jyi.n = false;
            jyi.g();
            this.c.e();
        } else if (i == 1) {
            jyi jyi2 = this.c;
            if (!jyi2.n) {
                jyi2.n = true;
                jyi2.c();
                jyi = this.c;
                jyi.m = jyi.r.p();
            }
        }
        jyi = this.c;
        Object obj2 = jyi.e.get(jyi.k);
        for (juh a : this.a) {
            a.a(obj2, this.b);
        }
    }

    /* synthetic */ jzb(jyi jyi) {
        this.c = jyi;
    }
}
