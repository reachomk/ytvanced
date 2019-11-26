package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: amhm */
public final class amhm extends amgh {
    public static final Charset a = Charset.forName("UTF-8");
    public final amab c;
    private final xsc d;
    private final atlx e;
    private final azzn f;
    private final alys h;
    private final amjf i;
    private final amjm j;
    private final amac k;
    private final amcc l;
    private final Map m = new ConcurrentHashMap();

    public amhm(xsc xsc, atlx atlx, amab amab, amce amce, amcf amcf, alys alys, amjf amjf, amjm amjm, amac amac, ambw ambw) {
        super(5, ambw);
        this.d = xsc;
        this.e = atlx;
        this.c = amab;
        this.h = alys;
        this.i = amjf;
        this.j = amjm;
        this.k = amac;
        this.l = new amcc(amce, amcf);
        azzm a = azzn.a();
        a.a = 0;
        this.f = a.a();
    }

    public final String a() {
        return "ScottyTransferTask";
    }

    public final boolean d() {
        return true;
    }

    public final amcj b() {
        return this.l;
    }

    public final amec a(amea amea) {
        amec amec = amea.s;
        return amec == null ? amec.g : amec;
    }

    public final bbnr c() {
        return amhl.a;
    }

    public final anjv a(String str, amea amea) {
        str = amea.c;
        String str2 = amea.g;
        String str3 = amea.p;
        String str4 = amea.q;
        azzh a = this.j.a().a(str3, this.i.a(amea, new amho(this, str, str2)), this.f);
        a.a(new amhs(this, str, str2), 65536, 500);
        this.k.m();
        anjv a2 = anic.a(a.a(), new amhn(this, str4), aniv.a);
        anjf.a(a2, new amhp(this, a, str, str2), aniv.a);
        return a2;
    }

    /* Access modifiers changed, original: final */
    public final alzf a(Throwable th, amea amea, boolean z) {
        String str = "ScottyTransferTask";
        int i = 1;
        alys alys;
        int a;
        if (th instanceof SecurityException) {
            alys = this.h;
            str = str.concat(" File Permission");
            a = amek.a(amea.h);
            if (a == 0) {
                a = 1;
            }
            alys.a(str, th, a);
            return a(amjq.a(24), z);
        } else if (th instanceof FileNotFoundException) {
            alys = this.h;
            str = str.concat(" File Not Found");
            a = amek.a(amea.h);
            if (a == 0) {
                a = 1;
            }
            alys.a(str, th, a);
            return a(amjq.a(23), z);
        } else if ((th instanceof IOException) || (th instanceof IndexOutOfBoundsException)) {
            alys = this.h;
            str = str.concat(" Source Failed");
            a = amek.a(amea.h);
            if (a == 0) {
                a = 1;
            }
            alys.a(str, th, a);
            return a(amjq.a(3), z);
        } else if (th instanceof bql) {
            alys = this.h;
            str = str.concat(" Transfer Failed");
            a = amek.a(amea.h);
            if (a == 0) {
                a = 1;
            }
            alys.a(str, th, a);
            return a(amjq.a(6), z);
        } else if ((th instanceof bqe) || (th instanceof bqf)) {
            alzf a2;
            Long l = (Long) this.m.get(amea.g);
            if (l == null || l.longValue() <= amea.r || this.e.e.size() <= 0) {
                Object obj = amea.s;
                if (obj == null) {
                    obj = amec.g;
                }
                a2 = a(amjq.a(6, (amec) amqw.a(obj), this.e.e, this.h), z);
            } else {
                ameb ameb = (ameb) amec.g.createBuilder();
                ameb.b(3);
                ameb.a(this.d.a() + this.e.e.b(0));
                ameb.a(1);
                ameb.c(6);
                a2 = a((amec) ((anxl) ameb.build()), z, new amhq(l));
            }
            return a2;
        } else {
            alys = this.h;
            str = str.concat(" Throwable");
            int a3 = amek.a(amea.h);
            if (a3 != 0) {
                i = a3;
            }
            alys.a(str, th, i);
            return super.a(th, amea, z);
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean b(amea amea) {
        int i = amea.a;
        return ((i & 1) == 0 || (i & 16) == 0 || (32768 & i) == 0 || (65536 & i) == 0 || (i & 2) == 0) ? false : true;
    }

    public final void a(String str, String str2, azzh azzh, double d) {
        azyl g = azzh.g();
        long j = 0;
        long d2 = g != null ? g.d() : 0;
        if (g != null) {
            j = g.a();
        }
        long j2 = j != -1 ? j : -1;
        this.m.put(str2, Long.valueOf(d2));
        this.c.a(str, str2, d2, j2, d);
    }

    public static bqd a(int i, azyn azyn, byte[] bArr) {
        HashMap hashMap = new HashMap();
        for (String str : azyn.a()) {
            hashMap.put(str, azyn.b(str));
        }
        return new bqd(i, bArr, hashMap);
    }
}
