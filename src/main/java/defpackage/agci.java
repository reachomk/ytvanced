package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: agci */
public final class agci implements agwh {
    public final xsc a;
    public final String b;
    public final agej c;
    public final bcaa d;
    public final bcaa e;
    public final bcaa f;
    public final bcaa g;
    public final xah h;
    public final bcaa i;
    public final agbg j;
    public final Executor k;
    public final bcaa l;
    public final bcaa m;
    public final bcaa n;
    public final bcaa o;
    public final bcaa p;
    public final bcaa q;
    public final bcaa r;
    public final agoz s;
    public final agdb t = new agdb(this);
    private final Executor u;
    private final ahdm v;

    public agci(xsc xsc, String str, agej agej, bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, xah xah, bcaa bcaa5, agbg agbg, Executor executor, Executor executor2, bcaa bcaa6, agio agio, agex agex, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, ahdm ahdm, bcaa bcaa11, bcaa bcaa12, agoz agoz) {
        this.a = xsc;
        this.b = str;
        this.c = agej;
        this.d = bcaa;
        this.e = bcaa2;
        this.f = bcaa3;
        this.g = bcaa4;
        this.h = xah;
        this.i = bcaa5;
        this.j = agbg;
        this.k = executor;
        this.u = executor2;
        this.l = bcaa6;
        this.m = bcaa7;
        this.n = bcaa8;
        this.o = bcaa9;
        this.p = bcaa10;
        this.v = ahdm;
        this.q = bcaa11;
        this.r = bcaa12;
        this.s = agoz;
        agio.a(new agdc(this));
        agex.a(new agcz(this));
    }

    public final agqy a(String str) {
        return this.j.v() ? ((agfi) this.m.get()).j(str) : null;
    }

    public final anjv b(String str) {
        return anja.c(this.j.u()).a(new agch(this, str), this.u).a(agmd.class, agck.a, aniv.a);
    }

    public final Collection a() {
        if (this.j.v()) {
            return ((agfi) this.m.get()).c();
        }
        return amul.g();
    }

    public final anjv b() {
        return anja.c(this.j.u()).a(new agcp(this), this.u).a(agmd.class, agcw.a, aniv.a);
    }

    public final List c() {
        if (this.j.v()) {
            return ((agfi) this.m.get()).d();
        }
        return amul.g();
    }

    public final anjv d() {
        return anja.c(this.j.u()).a(new agcv(this), this.u).a(agmd.class, agda.a, aniv.a);
    }

    public final int a(String str, avsi avsi, agqq agqq, byte[] bArr, int i) {
        String str2 = str;
        if (!this.j.v()) {
            return 2;
        }
        agqy a = a(str);
        agqf agqf = agqf.ACTIVE;
        int i2 = 0;
        boolean z = a != null && a.i();
        xvd.a(str);
        this.v.a(true);
        a = a(str);
        if (a == null || a.i()) {
            agqq agqq2 = agqq;
            this.j.a(new agcl(this, str, avsi, agqq, bArr, i, agqf, z));
        } else if (a.v() && (!a.z() || a.w() || a.x() || a.s())) {
            this.j.a(new agcj(this, str, agqq, agqf));
        } else if (a.e) {
            i2 = 1;
        } else {
            this.j.a(new agcm(this, str));
            return 0;
        }
        return i2;
    }

    public final int c(String str) {
        xvd.a(str);
        if (!this.j.v()) {
            return 2;
        }
        byte[] bArr;
        agqy a = a(str);
        avsi g = ((agvs) this.f.get()).g();
        agqq agqq = agqq.OFFLINE_IMMEDIATELY;
        if (a == null) {
            bArr = zzp.b;
        } else {
            bArr = a.d;
        }
        return a(str, g, agqq, bArr, a != null ? a.c : -1);
    }

    public final void a(String str, String str2, agqq agqq) {
        this.j.a(new agco(this, str2, str, agqq));
    }

    public final void d(String str) {
        this.j.a(new agcn(this, str));
    }

    public final void e(String str) {
        this.j.a(new agcq(this, str));
    }

    public final void f(String str) {
        this.j.a(new agcs(this, str));
    }

    public final void g(String str) {
        this.j.a(new agcr(this, str));
    }

    public final List e() {
        return ((agfi) this.m.get()).d.a();
    }

    public final agqp h(String str) {
        return ((agfi) this.m.get()).a(str);
    }

    public final void a(String str, long j) {
        amqw.a((Object) str);
        this.k.execute(new agcu(this, str, j));
    }

    public final void b(String str, long j) {
        amqw.a((Object) str);
        this.k.execute(new agct(this, str, j));
    }

    public final agqm f() {
        return this.j.v() ? ((agdt) this.q.get()).b().b() : null;
    }

    public final agqx g() {
        return this.j.v() ? ((agdz) this.r.get()).b().a() : null;
    }

    /* Access modifiers changed, original: final */
    public final void a(agqy agqy) {
        agqw agqw = agqy.j;
        if (agqw != null) {
            long max = Math.max(agqw.f() - this.a.a(), 0);
            this.j.a(new agcx(this, agqw.a), max + 500);
        }
    }

    public final void i(String str) {
        agdt agdt = (agdt) this.q.get();
        agdt.a(c().size());
        agdw b = agdt.b();
        b.a(str);
        a(b.b());
    }

    public final void j(String str) {
        agdz agdz = (agdz) this.r.get();
        agdz.a(a().size());
        agec b = agdz.b();
        b.a(str);
        a(b.a());
    }

    public final void k(String str) {
        agqy a = a(str);
        if (a == null) {
            String.valueOf(str).length();
            return;
        }
        String valueOf = String.valueOf(a.l);
        String.valueOf(str).length();
        valueOf.length();
        a(a);
        this.j.a(new aglk(a));
    }

    public final void a(String str, int i) {
        String.valueOf(str).length();
        this.j.a(new aglj(str, i));
    }

    /* Access modifiers changed, original: final */
    public final void l(String str) {
        agqy a = a(str);
        if (a != null) {
            String valueOf = String.valueOf(a.l);
            String.valueOf(str).length();
            valueOf.length();
            this.j.a(new agls(a));
        }
    }

    /* Access modifiers changed, original: final */
    public final void m(String str) {
        agqy a = a(str);
        if (a != null) {
            String valueOf = String.valueOf(a(str).l);
            String.valueOf(str).length();
            valueOf.length();
            this.j.a(new aglm(a));
        }
    }

    /* Access modifiers changed, original: final */
    public final void n(String str) {
        String.valueOf(str).length();
        this.j.a(new agll(str));
        ((agdt) this.q.get()).a(c().size());
        ((agdz) this.r.get()).a(a().size());
    }

    public final void h() {
        this.j.a(new agli());
    }

    /* Access modifiers changed, original: final */
    public final void a(agqm agqm) {
        this.j.a(new aglf(agqm));
    }

    /* Access modifiers changed, original: final */
    public final void a(agqx agqx) {
        this.j.a(new aglu(agqx));
    }

    public final boolean o(String str) {
        xak.b();
        if (this.j.v()) {
            agfi agfi = (agfi) this.m.get();
            if (agfi.a(str) != null) {
                try {
                    agqp a = ((agul) this.i.get()).a(str);
                    if (agfi.a(a)) {
                        ((afzq) this.o.get()).a(a);
                        k(str);
                        h();
                        return true;
                    }
                } catch (ExecutionException e) {
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 36);
                    stringBuilder.append("Failed requesting video ");
                    stringBuilder.append(str);
                    stringBuilder.append(" for offline");
                    xtl.a(stringBuilder.toString(), e);
                }
            }
        }
        return false;
    }

    public final void b(String str, String str2, agqq agqq) {
        String str3 = str;
        xak.b();
        agfi agfi = (agfi) this.m.get();
        avsi e = agfi.e(str3);
        xvd.a(str);
        SQLiteDatabase a = agfi.c.a.a();
        int i = 1;
        Cursor query = a.query("videosV2", new String[]{"offline_audio_quality"}, "id = ?", new String[]{str3}, null, null, null, null);
        try {
            int i2;
            if (query.moveToNext()) {
                int a2 = avmm.a(query.getInt(0));
                if (a2 != 0) {
                    i = a2;
                }
                query.close();
                i2 = i;
            } else {
                query.close();
                i2 = 1;
            }
            ((agdo) this.n.get()).a(str2, str, null, e, i2, false, 0, agqq, false, 0, false);
        } catch (Throwable th) {
            query.close();
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, String str2, agqq agqq, agqf agqf) {
        xak.b();
        agfi agfi = (agfi) this.m.get();
        if (agfi.a(str) != null) {
            agqy j = agfi.j(str);
            if (!(j == null || j.z()) || (j != null && j.l == agqf.STREAM_CORRUPT)) {
                agbo agbo = (agbo) this.p.get();
                if (((agbg) agbo.d.get()).v()) {
                    ((agfi) agbo.c.get()).a(str, false);
                }
                agfi.k(str);
            }
            j = agfi.j(str);
            if (j == null) {
                agfi.a(str, agqf, agfi.e(str), agfi.g(str), agfi.h(str));
                j = agfi.j(str);
                if (j != null) {
                    k(str);
                } else {
                    return;
                }
            }
            agfi.a(str, agqf);
            agqq agqq2 = j.m;
            if (agqq != agqq2) {
                agfi.a(str, agqq);
            } else {
                agqq = agqq2;
            }
            l(str);
            if (agqf == agqf.ACTIVE) {
                if (str2 == null) {
                    i(str);
                }
                j(str);
                b(str, str2, agqq);
                if (this.c.c()) {
                    avqv avqv = (avqv) ((anxo) agpp.a(j, 4, str2).toBuilder());
                    avqv.e(agqq.a());
                    ((agps) this.d.get()).a((avqw) ((anxl) avqv.build()));
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final Set a(List list) {
        xak.b();
        HashSet hashSet = new HashSet();
        for (agqp agqp : list) {
            agfi agfi = (agfi) this.m.get();
            xvd.a(agqp.a());
            if (xbs.a(agfi.c.a.a(), "videosV2", "id = ? AND media_status = ?", new String[]{r3, Integer.toString(agqf.DELETED.p)}) <= 0) {
                agqy a = a(agqp.a());
                if (a == null || a.i() || ((a.v() && a.w()) || a.o())) {
                    hashSet.add(agqp.a());
                }
            }
        }
        return hashSet;
    }

    /* Access modifiers changed, original: final */
    public final boolean b(String str, int i) {
        xak.b();
        agfi agfi = (agfi) this.m.get();
        boolean b = agfi.b(str, i);
        if (b) {
            n(str);
            agfi.a(str, Collections.emptySet());
        } else {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 36);
            stringBuilder.append("Failed removing video ");
            stringBuilder.append(str);
            stringBuilder.append(" from database");
            xtl.c(stringBuilder.toString());
        }
        return b;
    }
}
