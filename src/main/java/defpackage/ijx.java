package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ijx */
public final class ijx implements aixl {
    private final airv a;
    private final agtl b;
    private final aisl c;
    private final agtr d;
    private final zzl e;
    private final zyw f;
    private final ScheduledExecutorService g;
    private final bcaa h;
    private final agsi i;
    private final agty j;
    private final agps k;
    private final Executor l;
    private final ahdm m;
    private final agvs n;
    private final xto o;
    private final xto p;

    public ijx(airv airv, agtl agtl, aisl aisl, agtr agtr, zzl zzl, zyw zyw, ScheduledExecutorService scheduledExecutorService, bcaa bcaa, agsi agsi, agty agty, agps agps, Executor executor, ahdm ahdm, agvs agvs) {
        this.a = airv;
        this.b = agtl;
        this.c = aisl;
        this.d = agtr;
        this.e = zzl;
        this.f = zyw;
        this.g = scheduledExecutorService;
        this.h = bcaa;
        this.i = agsi;
        this.j = agty;
        this.k = agps;
        this.l = executor;
        this.m = ahdm;
        this.n = agvs;
        this.o = new ika("onlinePlaybackRequester", airv, aisl, scheduledExecutorService);
        this.p = new ijz("offlinePlaybackRequester", agtl, agtr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0032  */
    public final defpackage.aixi b(defpackage.aiqq r15) {
        /*
        r14 = this;
        r0 = r14.e;
        r0 = r0.b();
        r1 = 1;
        r2 = 0;
        if (r0 != 0) goto L_0x000c;
    L_0x000a:
        r3 = 0;
        goto L_0x0018;
    L_0x000c:
        r3 = r0.l;
        if (r3 != 0) goto L_0x0012;
    L_0x0010:
        r3 = defpackage.awdw.E;
    L_0x0012:
        r3 = r3.k;
        if (r3 != 0) goto L_0x0017;
    L_0x0016:
        goto L_0x000a;
    L_0x0017:
        r3 = 1;
    L_0x0018:
        if (r0 != 0) goto L_0x001b;
    L_0x001a:
        goto L_0x0027;
    L_0x001b:
        r0 = r0.h;
        if (r0 != 0) goto L_0x0021;
    L_0x001f:
        r0 = defpackage.avoa.w;
    L_0x0021:
        r0 = r0.p;
        if (r0 != 0) goto L_0x0026;
    L_0x0025:
        goto L_0x0027;
    L_0x0026:
        r2 = 1;
    L_0x0027:
        if (r3 == 0) goto L_0x002a;
    L_0x0029:
        goto L_0x0044;
    L_0x002a:
        if (r2 != 0) goto L_0x0044;
    L_0x002c:
        r15 = r15.m();
        if (r15 == 0) goto L_0x003b;
    L_0x0032:
        r15 = r14.p;
        r15 = r15.get();
        r15 = (defpackage.aixi) r15;
        return r15;
    L_0x003b:
        r15 = r14.o;
        r15 = r15.get();
        r15 = (defpackage.aixi) r15;
        return r15;
    L_0x0044:
        r15 = new agsw;
        r1 = r14.a;
        r2 = r14.c;
        r3 = r14.b;
        r4 = r14.d;
        r5 = r14.e;
        r6 = r14.f;
        r7 = r14.g;
        r8 = r14.h;
        r9 = r14.i;
        r10 = r14.j;
        r11 = r14.k;
        r12 = r14.m;
        r13 = r14.n;
        r0 = r15;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
        return r15;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ijx.b(aiqq):aixi");
    }

    public final aixi b(aizx aizx) {
        return aizx instanceof aizs ? b(((aizs) aizx).e) : null;
    }
}
