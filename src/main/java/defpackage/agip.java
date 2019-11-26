package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: agip */
public final class agip {
    private static final Object n = new Object();
    public final ConcurrentHashMap a;
    public final ConcurrentHashMap b;
    public final ConcurrentHashMap c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;
    public final xcb f;
    public final HashMap g;
    public final HashMap h;
    public final HashMap i;
    public final HashMap j;
    public final xsc k;
    public final Object l = new Object();
    public final zyw m;

    public agip(xsc xsc, zyw zyw) {
        this.k = xsc;
        this.m = zyw;
        this.b = new ConcurrentHashMap();
        this.a = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.f = new xcg(new agiw());
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = new HashMap();
        this.j = new HashMap();
    }

    public final void a(agqp agqp, avsi avsi, int i, byte[] bArr, agqf agqf, agqq agqq, long j) {
        synchronized (this.l) {
            amqw.a((Object) agqp);
            this.b.put(agqp.a(), new agiu(this, agqp, avsi, i, bArr, agqf, agqq, j));
        }
    }

    public final void a(agql agql) {
        synchronized (this.l) {
            if (this.a.get(agql.q()) != null) {
                ((agir) this.a.get(agql.q())).a(agql);
            }
        }
    }

    public final agie a(String str) {
        agie agie;
        synchronized (this.l) {
            xvd.a(str);
            agie = (agie) this.a.get(str);
        }
        return agie;
    }

    public final agid b(String str) {
        agid agid;
        synchronized (this.l) {
            xvd.a(str);
            agid = (agid) this.b.get(str);
        }
        return agid;
    }

    public final void a(agqi agqi, List list, avsi avsi, int i, long j, int i2) {
        synchronized (this.l) {
            amqw.a((Object) agqi);
            this.c.put(agqi.a, new agis(this, agqi, list, avsi, j));
        }
    }

    public final agib c(String str) {
        agib agib;
        synchronized (this.l) {
            xvd.a(str);
            agib = (agib) this.c.get(str);
        }
        return agib;
    }

    public final void a(agqr agqr, List list, List list2, int i) {
        synchronized (this.l) {
            amqw.a((Object) agqr);
            this.d.put(agqr.a, new agit(this, agqr, list, list2, i));
        }
    }

    public final void d(String str) {
        synchronized (this.l) {
            xvd.a(str);
            this.e.put(str, n);
            agiu agiu = (agiu) this.b.get(str);
            if (agiu != null) {
                agiu.i();
                this.f.a(Long.valueOf(agiu.a), agiu);
            }
        }
    }

    public final boolean e(String str) {
        boolean containsKey;
        synchronized (this.l) {
            xvd.a(str);
            containsKey = this.e.containsKey(str);
        }
        return containsKey;
    }

    public final void a(String str, String str2) {
        synchronized (this.l) {
            xsb.a(this.h, (Object) str, (Object) str2);
            xsb.a(this.g, (Object) str2, (Object) str);
        }
    }

    public final Set f(String str) {
        Set b;
        synchronized (this.l) {
            b = xsb.b(this.g, str);
        }
        return b;
    }

    public final void b(String str, String str2) {
        synchronized (this.l) {
            xsb.a(this.j, (Object) str, (Object) str2);
            xsb.a(this.i, (Object) str2, (Object) str);
        }
    }

    public final Collection a() {
        Collection values;
        synchronized (this.l) {
            values = this.b.values();
        }
        return values;
    }
}
