package defpackage;

import java.util.Set;

/* renamed from: aamf */
public final class aamf {
    public final xhx a;
    private final afpd b;
    private final Set c;
    private final Set d;
    private final afmh e;
    private final String f;
    private final String g;
    private final amro h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final long m;
    private final xsv n;
    private final xsc o;
    private final afpu p;
    private final zzl q;
    private final boolean r;
    private final aalx s;
    private final bcaa t;
    private final afqa u;
    private final boolean v;
    private final aftt w;

    public aamf(afpd afpd, afqa afqa, Set set, Set set2, afmh afmh, afmg afmg, amqp amqp, amro amro, boolean z, zzf zzf, xsv xsv, xsc xsc, afpu afpu, zzl zzl, xhx xhx, aalx aalx, bcaa bcaa, aftt aftt) {
        this.b = (afpd) amqw.a((Object) afpd);
        this.u = afqa;
        this.c = (Set) amqw.a((Object) set);
        this.d = (Set) amqw.a((Object) set2);
        this.e = (afmh) amqw.a((Object) afmh);
        this.h = (amro) amqw.a((Object) amro);
        this.f = ((afmg) amqw.a((Object) afmg)).a();
        amqp amqp2 = amqp;
        this.g = (String) amqp.a((Object) "");
        this.i = z;
        this.j = zzf.q().d;
        this.k = zzf.q().e;
        this.m = zzf.q().f;
        aydk aydk = zzf.b().d;
        if (aydk == null) {
            aydk = aydk.o;
        }
        this.l = aydk.j;
        this.n = (xsv) amqw.a((Object) xsv);
        this.o = (xsc) amqw.a((Object) xsc);
        this.p = afpu;
        this.q = zzl;
        this.a = xhx;
        this.r = zzf.c().f;
        this.s = aalx;
        this.v = zzf.c().g;
        this.t = bcaa;
        this.w = aftt;
    }

    public final aamc a(aaml aaml, anze anze, afsw afsw, wxm wxm, wxj wxj) {
        aaml.getClass();
        afsw aame = this.r ? new aame(this, afsw) : afsw;
        afpd afpd = this.b;
        afqa afqa = this.u;
        Set set = this.c;
        Set set2 = this.d;
        afmh afmh = this.e;
        String str = this.f;
        String str2 = this.g;
        bqi bqi = (bqi) this.h.get();
        boolean z = this.i;
        boolean z2 = this.j;
        boolean z3 = this.k;
        long j = this.m;
        boolean z4 = z2;
        boolean z5 = this.l;
        xsv xsv = this.n;
        xsc xsc = this.o;
        afpu afpu = this.p;
        zzl zzl = this.q;
        aalx aalx = this.s;
        boolean z6 = this.v;
        boolean z7 = z6;
        bcaa bcaa = this.t;
        zzl zzl2 = zzl;
        aalx aalx2 = aalx;
        z2 = z4;
        z4 = z3;
        long j2 = j;
        aamc aamc = new aamc(aaml, anze, aame, afpd, afqa, set, set2, afmh, str, str2, bqi, z, z2, z4, j2, z5, xsv, xsc, afpu, zzl2, aalx2, z7, bcaa, wxm, wxj, this.w);
        aamc.i = aaml.d();
        Object obj = aaml.n;
        if (obj != null) {
            aamc.b(obj);
        }
        xvj.a();
        return aamc;
    }
}
