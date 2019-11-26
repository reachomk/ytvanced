package defpackage;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: afzs */
public final class afzs implements agvx {
    public static final long a = TimeUnit.HOURS.toMillis(1);
    public final Context b;
    public final xsc c;
    public final String d;
    public final bcaa e;
    public final xah f;
    public final bcaa g;
    public final bcaa h;
    public final agbg i;
    public final Executor j;
    public final bcaa k;
    public final bcaa l;
    public final bcaa m;
    public final bcaa n;
    public final bcaa o;
    public final bcaa p;
    public final bcaa q;
    public final bcaa r;
    public final agdr s;
    public final agag t;
    public final Map u;
    public final zyw v;
    public volatile long w = 0;
    private final Executor x;
    private final bcaa y;
    private final ahdm z;

    public afzs(Context context, xsc xsc, String str, bcaa bcaa, xah xah, bcaa bcaa2, bcaa bcaa3, agbg agbg, Executor executor, Executor executor2, agfu agfu, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, ahdm ahdm, bcaa bcaa11, bcaa bcaa12, zyw zyw) {
        this.b = context;
        this.c = xsc;
        this.d = str;
        this.e = bcaa;
        this.f = xah;
        this.g = bcaa2;
        this.h = bcaa3;
        this.i = agbg;
        this.x = executor;
        this.j = executor2;
        this.k = bcaa4;
        this.l = bcaa5;
        this.m = bcaa6;
        this.n = bcaa7;
        this.o = bcaa8;
        this.p = bcaa9;
        this.y = bcaa10;
        this.z = ahdm;
        this.q = bcaa11;
        this.r = bcaa12;
        this.s = new agdr();
        this.t = new agag(this);
        this.u = new HashMap();
        this.v = zyw;
        agfu agfu2 = agfu;
        agfu.a(new agad(this));
    }

    public final Collection a() {
        if (this.i.v()) {
            return c();
        }
        return amul.g();
    }

    public final anjv b() {
        return agbf.a(this.i.u(), new afzr(this), amul.g(), this.x);
    }

    public final Collection c() {
        LinkedList linkedList;
        agip e = ((agfi) this.k.get()).h.e();
        synchronized (e.l) {
            linkedList = new LinkedList();
            for (agib b : e.c.values()) {
                linkedList.add(b.b());
            }
        }
        return linkedList;
    }

    public final agqk a(String str) {
        return this.i.v() ? ((agfi) this.k.get()).l(str) : null;
    }

    public final List b(String str) {
        if (this.i.v()) {
            return d(str);
        }
        return amul.g();
    }

    public final anjv c(String str) {
        return agbf.a(this.i.u(), new afzy(this, str), amul.g(), this.x);
    }

    public final amul d(String str) {
        agqk a = a(str);
        if (a == null) {
            return amul.g();
        }
        Collection arrayList = new ArrayList();
        agci agci = (agci) this.p.get();
        for (String a2 : a.b) {
            agqy a3 = agci.a(a2);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        return amul.a(arrayList);
    }

    public final Set e(String str) {
        if (!this.i.v()) {
            return amwp.a;
        }
        HashSet hashSet;
        agip e = ((agif) this.y.get()).e();
        synchronized (e.l) {
            xvd.a(str);
            hashSet = new HashSet();
            Set<String> b = xsb.b(e.h, str);
            if (b != null) {
                if (!b.isEmpty()) {
                    for (String str2 : b) {
                        agiu agiu = (agiu) e.b.get(str2);
                        if (!(agiu == null || agiu.h() == null)) {
                            hashSet.add(agiu.h());
                        }
                    }
                }
            }
        }
        return hashSet;
    }

    public final agqh f(String str) {
        if (this.i.v()) {
            agdu a = this.s.a(str);
            if (a == null) {
                agqk l = ((agfi) this.k.get()).l(str);
                if (l != null) {
                    this.s.a(l.a, null);
                    a = this.s.a(str);
                }
            }
            if (a != null) {
                return a.c();
            }
        }
        return null;
    }

    public final int a(String str, String str2) {
        xvd.a(str);
        xvd.a(str2);
        int i = 2;
        if (!this.i.v()) {
            return 2;
        }
        xvd.a(str);
        xvd.a(str2);
        agfi agfi = (agfi) this.k.get();
        agqk l = agfi.l(str);
        if (l != null) {
            Set b;
            xvd.a(str2);
            xvd.a(str);
            agip e = agfi.h.e();
            synchronized (e.l) {
                b = xsb.b(e.h, str);
            }
            if (b.contains(str2)) {
                agci agci = (agci) this.p.get();
                agqy a = agci.a(str2);
                if (a == null || (a.v() && (!a.z() || a.w() || a.x() || a.s()))) {
                    this.i.a(new afzz(this, str2, str));
                    agdu a2 = this.s.a(str);
                    if (a2 == null) {
                        a2 = this.s.a(l.a, amul.a((Object) str2));
                    } else {
                        a2.a(str2);
                    }
                    a2.b();
                    a(a2.c());
                    agdz agdz = (agdz) this.r.get();
                    agdz.a(agci.a().size());
                    agdz.b().a(str2);
                    agci.a(agdz.b().a());
                    i = 0;
                } else {
                    i = 1;
                }
            }
        }
        return i;
    }

    public final int a(String str, avsi avsi, agqq agqq, byte[] bArr, int i, int i2) {
        xvd.a(str);
        if (!this.i.v()) {
            return 2;
        }
        xvd.a(str);
        this.z.a(true);
        String str2 = str;
        if (((agfi) this.k.get()).l(str) != null) {
            return 1;
        }
        this.i.a(new agac(this, str, avsi, agqq, bArr, i, i2));
        return 0;
    }

    public final void g(String str) {
        this.i.a(new agab(this, str));
    }

    public final boolean a(String str, long j) {
        if (!this.i.v()) {
            return false;
        }
        return a(Collections.singletonList(str), amur.a(str, Integer.valueOf(Integer.MAX_VALUE)), amur.a(str, Integer.valueOf(0)), 0, j);
    }

    public final boolean a(List list, Map map, Map map2, int i, long j) {
        if (!this.i.v()) {
            return false;
        }
        for (String f : list) {
            if (f(f) == null) {
                return false;
            }
        }
        this.i.a(new afzu(this, list, map, map2, i, j));
        return true;
    }

    public final void h(String str) {
        this.i.a(new afzt(this, str));
    }

    public final int i(String str) {
        return this.i.v() ? ((agfi) this.k.get()).c(str) : 0;
    }

    public final void j(String str) {
        if (this.i.v()) {
            this.i.a(new afzw(this, str));
        }
    }

    public final List d() {
        xak.b();
        if (this.i.v()) {
            return ((agfi) this.k.get()).b();
        }
        return amul.g();
    }

    public final Pair k(String str) {
        xvd.a(str);
        xak.b();
        return this.i.v() ? ((agfi) this.k.get()).b(str) : null;
    }

    public final void a(String str, wxg wxg) {
        xvd.a(str);
        this.j.execute(new afzx(this, wxg, str));
    }

    public final Set l(String str) {
        xvd.a(str);
        if (this.i.v()) {
            return ((agfi) this.k.get()).n(str);
        }
        return amwp.a;
    }

    public final void e() {
        this.j.execute(new agaa(this));
    }

    public final void m(String str) {
        String.valueOf(str).length();
        this.i.a(new agkx(str));
    }

    public final void n(String str) {
        String.valueOf(str).length();
        this.i.a(new aglg(str));
    }

    /* Access modifiers changed, original: final */
    public final void a(agqh agqh) {
        String.valueOf(agqh.a()).length();
        this.i.a(new aglb(agqh));
    }

    public final void o(String str) {
        String.valueOf(str).length();
        this.i.a(new agkz(str));
    }

    public final void p(String str) {
        String.valueOf(str).length();
        this.i.a(new aglc(str));
    }

    /* Access modifiers changed, original: final */
    public final void q(String str) {
        xak.b();
        p(str);
        if (((agfi) this.k.get()).t(str)) {
            o(str);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 39);
        stringBuilder.append("Failed removing playlist ");
        stringBuilder.append(str);
        stringBuilder.append(" from database");
        xtl.c(stringBuilder.toString());
    }

    public final agqq r(String str) {
        xvd.a(str);
        for (agqy agqy : e(str)) {
            if (agqy.m == agqq.DEFER_FOR_DISCOUNTED_DATA) {
                return agqq.DEFER_FOR_DISCOUNTED_DATA;
            }
        }
        return agqq.OFFLINE_IMMEDIATELY;
    }
}
