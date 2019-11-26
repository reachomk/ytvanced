package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import java.io.File;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ajek */
public final class ajek {
    public final afmi a;
    private final xsc b;
    private final xsc c;
    private final afqv d;
    private final afmq e;
    private final afhc f;
    private final afhc g;
    private final xhv h;
    private final xry i;
    private final afia j;
    private final bcaa k;
    private final long l;
    private final afhe m;
    private final ajql n;
    private final ScheduledExecutorService o;
    private final Executor p;
    private final afpu q;
    private final bapu r;
    private final bapu s;
    private final ahhq t;
    private final zzl u;
    private final List v;
    private final Random w = new Random();
    private final Pair x;

    public ajek(afqv afqv, afmq afmq, xsc xsc, xsc xsc2, Context context, xhv xhv, xry xry, afmi afmi, afia afia, bcaa bcaa, aepl aepl, afhe afhe, ajql ajql, ScheduledExecutorService scheduledExecutorService, Executor executor, afpu afpu, bapu bapu, bapu bapu2, ahhq ahhq, zzl zzl, List list) {
        this.d = (afqv) amqw.a((Object) afqv);
        this.e = (afmq) amqw.a((Object) afmq);
        this.b = (xsc) amqw.a((Object) xsc);
        this.c = (xsc) amqw.a((Object) xsc2);
        this.f = afhn.a(context);
        this.g = new ajeo();
        this.h = (xhv) amqw.a((Object) xhv);
        this.i = (xry) amqw.a((Object) xry);
        this.a = (afmi) amqw.a((Object) afmi);
        this.j = (afia) amqw.a((Object) afia);
        this.k = (bcaa) amqw.a((Object) bcaa);
        this.l = aepl.a();
        this.m = (afhe) amqw.a((Object) afhe);
        this.n = (ajql) amqw.a((Object) ajql);
        this.o = (ScheduledExecutorService) amqw.a((Object) scheduledExecutorService);
        this.p = (Executor) amqw.a((Object) executor);
        this.q = (afpu) amqw.a((Object) afpu);
        this.r = (bapu) amqw.a((Object) bapu);
        this.s = (bapu) amqw.a((Object) bapu2);
        this.t = ahhq;
        this.u = zzl;
        this.v = (List) amqw.a((Object) list);
        this.x = xss.j(context);
    }

    public final ajee a(aakm aakm, String str, String str2, boolean z, boolean z2, aajj aajj, boolean z3) {
        aajj aajj2 = aajj;
        if (aakm != null) {
            float f;
            afhc afhc;
            Object obj = (amro) this.r.get();
            amqw.a(obj);
            Object obj2 = (amro) this.s.get();
            amqw.a(obj2);
            File file = (File) this.k.get();
            double nextDouble = this.w.nextDouble();
            awdg awdg = aajj2.c;
            if ((awdg.b & 128) != 0) {
                awtu awtu = awdg.y;
                if (awtu == null) {
                    awtu = awtu.d;
                }
                f = awtu.c;
            } else {
                f = 0.0f;
            }
            if (nextDouble < ((double) f)) {
                afhc = this.f;
            } else {
                afhc = this.g;
            }
            afhc afhc2 = afhc;
            int a = apxg.a(a().e);
            if (a == 0 || a == 1) {
                a = 2;
            } else {
                a = apxg.a(a().e);
                if (a == 0) {
                    a = 1;
                }
            }
            int i = a - 1;
            if (a != 0) {
                xsc xsc;
                String valueOf;
                if (i != 2) {
                    xsc = this.b;
                } else {
                    xsc = this.c;
                }
                xsc xsc2 = xsc;
                ajee ajee = r3;
                ajee ajee2 = new ajee(xsc2, this.d, this.e, afhc2, this.h, this.i, this.a, this.j, file != null ? file.getFreeSpace() : -1, file != null ? file.getTotalSpace() : -1, this.l, this.m, this.n, this.o, this.p, this.q, obj, obj2, this.t.c(), aakm, ajee.a(((aakm) amqw.a((Object) aakm)).a(), xvd.a(str), str2, z3, this.a), z2, z3, this.v);
                ajee.F = z;
                ajee.o = -1;
                ajee.r = -1;
                ajee.a(aajj2.a(ajee.a));
                ajee.e.a(ajee.f);
                ajee.e.a(ajee.g);
                ajee.e.a(ajee.h);
                ajee.j.addObserver(ajee);
                String str3 = "ctmp";
                if (a().u) {
                    Pair pair = this.x;
                    ajet ajet = ajee.i;
                    valueOf = String.valueOf(pair.first);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 4);
                    stringBuilder.append("ddw:");
                    stringBuilder.append(valueOf);
                    ajet.a(str3, stringBuilder.toString());
                    ajet = ajee.i;
                    String valueOf2 = String.valueOf(pair.second);
                    StringBuilder stringBuilder2 = new StringBuilder(valueOf2.length() + 4);
                    stringBuilder2.append("ddh:");
                    stringBuilder2.append(valueOf2);
                    ajet.a(str3, stringBuilder2.toString());
                }
                if (a().w) {
                    ajet ajet2 = ajee.i;
                    String str4 = "cdevice:";
                    valueOf = String.valueOf(Build.DEVICE);
                    ajet2.a(str3, valueOf.length() == 0 ? new String(str4) : str4.concat(valueOf));
                }
                return ajee;
            }
            throw null;
        }
        xtl.d("Missing QoE base url");
        return null;
    }

    private final awtm a() {
        awtm awtm;
        zzl zzl = this.u;
        if (zzl == null || zzl.b() == null) {
            awtm = awtm.x;
        } else {
            auuo auuo = this.u.b().k;
            if (auuo == null) {
                auuo = auuo.k;
            }
            awtm = auuo.e;
            if (awtm == null) {
                return awtm.x;
            }
        }
        return awtm;
    }
}
