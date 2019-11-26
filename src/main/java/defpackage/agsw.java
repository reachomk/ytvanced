package defpackage;

import android.database.sqlite.SQLiteException;
import android.util.Pair;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: agsw */
public final class agsw implements aixi {
    public final airv a;
    public final aisl b;
    private final agtl c;
    private final agtr d;
    private final zzl e;
    private final zyw f;
    private final ScheduledExecutorService g;
    private final bcaa h;
    private final agsi i;
    private final agty j;
    private final agps k;
    private final ahdm l;
    private final agvs m;

    public agsw(airv airv, aisl aisl, agtl agtl, agtr agtr, zzl zzl, zyw zyw, ScheduledExecutorService scheduledExecutorService, bcaa bcaa, agsi agsi, agty agty, agps agps, ahdm ahdm, agvs agvs) {
        this.a = (airv) amqw.a((Object) airv);
        this.b = (aisl) amqw.a((Object) aisl);
        this.c = (agtl) amqw.a((Object) agtl);
        this.d = (agtr) amqw.a((Object) agtr);
        this.e = (zzl) amqw.a((Object) zzl);
        this.f = (zyw) amqw.a((Object) zyw);
        this.g = (ScheduledExecutorService) amqw.a((Object) scheduledExecutorService);
        this.h = bcaa;
        this.i = (agsi) amqw.a((Object) agsi);
        this.j = (agty) amqw.a((Object) agty);
        this.k = (agps) amqw.a((Object) agps);
        this.l = ahdm;
        this.m = agvs;
    }

    public final Pair a(aiqq aiqq, String str, aiqw aiqw) {
        if (c(aiqq) && aiqq.m()) {
            return new Pair(this.c.a(aiqq), this.d.a(aiqq, true));
        }
        aisg a;
        anjv a2;
        Object obj;
        if (d(aiqq) && b(aiqq)) {
            a = a(aiqq, aiqw, str);
            a2 = a.a();
            if (a.b().a()) {
                obj = (anjv) a.b().b();
            } else {
                obj = this.b.a(aiqq);
            }
            return Pair.create(a2, obj);
        }
        a = aisf.a(aiqq, aiqw, str, new agsv(this), new agsy(this), this.g);
        a2 = a.a();
        if (a.b().a()) {
            obj = (anjv) a.b().b();
        } else {
            obj = a(aiqq);
        }
        return Pair.create(a2, obj);
    }

    public final anjv a(aiqq aiqq) {
        if (aiqq.m()) {
            return this.d.a(aiqq, true);
        }
        if (b(aiqq)) {
            return this.b.a(aiqq);
        }
        anjv a = this.d.a(aiqq, false);
        agsi agsi = this.i;
        anjv a2 = this.b.a(aiqq);
        arvt b = this.e.b();
        long j = 1000;
        if (!(b == null || (b.a & 512) == 0)) {
            avoa avoa = b.h;
            if (avoa == null) {
                avoa = avoa.w;
            }
            j = (long) avoa.q;
        }
        return agsi.a(null, a2, a, j, amuw.a(bqn.class, NullPointerException.class, SQLiteException.class), this.g, this.k, agsx.a, 3);
    }

    public final anjv a(String str, aiqq aiqq, aiqw aiqw) {
        return aisf.a(aiqq, aiqw, str, new agta(this), new agsz(this), this.g).a();
    }

    public final anjv a(aish aish) {
        String c = aish.c();
        aiqq a = aish.a();
        aiqw b = aish.b();
        if (c(a)) {
            return this.c.a(a);
        }
        if (d(a)) {
            return a(a, b, c).a();
        }
        anjv a2 = this.c.a(a);
        anjv a3 = a(a, b, c).a();
        if (a()) {
            agty agty = this.j;
            bcaa bcaa = this.h;
            String b2 = a.b();
            return agty.a(bcaa, b2, c, a3, a2, b(), amuw.a(bqn.class, NullPointerException.class, agly.class, agmc.class, SQLiteException.class), this.g, this.k);
        }
        return agsi.a(c, a3, a2, b(), amuw.a(bqn.class, NullPointerException.class, agly.class, agmc.class, SQLiteException.class), this.g, this.k, agtc.a, 2);
    }

    public final anjv a(aiqq aiqq, String str, int i, aiqw aiqw) {
        aiqq aiqq2 = aiqq;
        if (c(aiqq)) {
            return this.c.b(aiqq);
        }
        if (d(aiqq)) {
            return b(aiqq, str, i, aiqw);
        }
        anjv b = this.c.b(aiqq);
        anjv b2 = b(aiqq, str, i, aiqw);
        if (a()) {
            return this.j.a(this.h, aiqq.b(), str, b2, b, b(), amuw.a(bqn.class, NullPointerException.class, agly.class, agmc.class, SQLiteException.class), this.g, this.k);
        }
        return agsi.a(str, b2, b, b(), amuw.a(bqn.class, NullPointerException.class, agly.class, agmc.class, SQLiteException.class), this.g, this.k, agtb.a, 2);
    }

    private final aisg a(aiqq aiqq, aiqw aiqw, String str) {
        return aisf.a(aiqq, aiqw, str, new agte(this, aiqw), new agtd(this, aiqq, aiqw), this.g);
    }

    private final anjv b(aiqq aiqq, String str, int i, aiqw aiqw) {
        this.a.a(aiqq, i);
        return this.a.a(aiqq, str, i, null, null, true, aiqw);
    }

    /* JADX WARNING: Missing block: B:12:0x002b, code skipped:
            if (r1.m.d().a(r2) != false) goto L_0x0030;
     */
    private final boolean b(defpackage.aiqq r2) {
        /*
        r1 = this;
        r0 = r2.m();
        if (r0 != 0) goto L_0x0030;
    L_0x0006:
        r0 = r1.l;
        r0 = r0.b();
        if (r0 != 0) goto L_0x000f;
    L_0x000e:
        goto L_0x002e;
    L_0x000f:
        r0 = r1.e;
        r0 = r0.b();
        if (r0 == 0) goto L_0x002e;
    L_0x0017:
        r0 = r0.h;
        if (r0 != 0) goto L_0x001d;
    L_0x001b:
        r0 = defpackage.avoa.w;
    L_0x001d:
        r0 = r0.p;
        if (r0 == 0) goto L_0x002e;
    L_0x0021:
        r0 = r1.m;
        r0 = r0.d();
        r2 = r0.a(r2);
        if (r2 == 0) goto L_0x002e;
    L_0x002d:
        goto L_0x0030;
    L_0x002e:
        r2 = 1;
        return r2;
    L_0x0030:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agsw.b(aiqq):boolean");
    }

    private final boolean c(aiqq aiqq) {
        return aiqq.m() && !a();
    }

    /* JADX WARNING: Missing block: B:10:0x001f, code skipped:
            if (r1.k != false) goto L_0x0024;
     */
    private final boolean d(defpackage.aiqq r1) {
        /*
        r0 = this;
        r1 = r1.m();
        if (r1 != 0) goto L_0x0024;
    L_0x0006:
        r1 = r0.l;
        r1 = r1.b();
        if (r1 == 0) goto L_0x0022;
    L_0x000e:
        r1 = r0.e;
        r1 = r1.b();
        if (r1 != 0) goto L_0x0017;
    L_0x0016:
        goto L_0x0022;
    L_0x0017:
        r1 = r1.l;
        if (r1 != 0) goto L_0x001d;
    L_0x001b:
        r1 = defpackage.awdw.E;
    L_0x001d:
        r1 = r1.k;
        if (r1 == 0) goto L_0x0022;
    L_0x0021:
        goto L_0x0024;
    L_0x0022:
        r1 = 1;
        return r1;
    L_0x0024:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agsw.d(aiqq):boolean");
    }

    private final boolean a() {
        return ahda.b(this.f);
    }

    private final long b() {
        arvt b = this.e.b();
        if (b == null || (b.a & 32768) == 0) {
            return 1000;
        }
        awdw awdw = b.l;
        if (awdw == null) {
            awdw = awdw.E;
        }
        return (long) awdw.l;
    }

    public static boolean a(aakj aakj) {
        return aakj != null && aakj.k();
    }
}
