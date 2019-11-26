package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: ajok */
public final class ajok implements ajot {
    private static final long b = TimeUnit.SECONDS.toMillis(25);
    public final bcaa a;
    private final ahjf c;
    private final Executor d;
    private final zzl e;
    private airi f;
    private int g;
    private long h;
    private long i;
    private ajov j;
    private int k = 1;

    public ajok(ahjf ahjf, Executor executor, bcaa bcaa, zzl zzl) {
        this.c = ahjf;
        this.a = (bcaa) amqw.a((Object) bcaa);
        this.d = (Executor) amqw.a((Object) executor);
        this.e = zzl;
    }

    public final ahjc a() {
        return null;
    }

    public final ajow b() {
        return null;
    }

    private final boolean d() {
        return this.i - this.h < b;
    }

    public static apxu a(atdv atdv) {
        atdj atdj = atdv.m;
        if (atdj == null) {
            atdj = atdj.c;
        }
        aujn aujn = atdj.b;
        if (aujn == null) {
            aujn = aujn.f;
        }
        if ((aujn.a & 4) == 0) {
            return null;
        }
        atdj atdj2 = atdv.m;
        if (atdj2 == null) {
            atdj2 = atdj.c;
        }
        aujn aujn2 = atdj2.b;
        if (aujn2 == null) {
            aujn2 = aujn.f;
        }
        apxu apxu = aujn2.b;
        if (apxu == null) {
            apxu = apxu.d;
        }
        return apxu;
    }

    public final void a(ahkm ahkm) {
        this.h = ahkm.a;
        this.i = ahkm.d;
    }

    public final void a(ahkn ahkn) {
        this.f = ahkn.a;
        if (this.f == airi.PLAYBACK_LOADED) {
            ajov ajov = this.j;
            if (ajov != null) {
                b(ajov);
            }
        }
    }

    public final void a(ahkr ahkr) {
        this.g = ahkr.a;
    }

    public final boolean b(atdv atdv) {
        atdj atdj = atdv.m;
        if (atdj == null) {
            atdj = atdj.c;
        }
        return (atdj.a & 1) != 0;
    }

    public final int a(ajov ajov) {
        int a;
        atdv atdv = ((ajoq) ajov).b;
        if (aipo.a(this.e).t) {
            a = awah.a(atdv.b);
            if (a == 0) {
                a = 1;
            }
            this.k = a;
        }
        atdj atdj = atdv.m;
        if (atdj == null) {
            atdj = atdj.c;
        }
        aujn aujn = atdj.b;
        if (aujn == null) {
            aujn = aujn.f;
        }
        aujl aujl = aujn.d;
        if (aujl == null) {
            aujl = aujl.c;
        }
        if ((aujl.a & 1) == 0) {
            a = awah.a(atdv.b);
            if (a != 0 && a == 7) {
                this.c.a(new ahjc(ahjh.SKIP_IF_POSSIBLE, atdv.c));
            }
        }
        return 0;
    }

    /* JADX WARNING: Missing block: B:22:0x0049, code skipped:
            if (r4.c == false) goto L_0x0057;
     */
    public final int b(defpackage.ajov r8) {
        /*
        r7 = this;
        r0 = r7.e;
        r0 = defpackage.aipo.g(r0);
        r1 = 0;
        if (r0 == 0) goto L_0x0015;
    L_0x0009:
        r0 = r7.f;
        r0 = r0.a();
        if (r0 != 0) goto L_0x0012;
    L_0x0011:
        goto L_0x0015;
    L_0x0012:
        r7.j = r8;
        return r1;
    L_0x0015:
        r0 = 0;
        r7.j = r0;
        r0 = r8.d();
        r2 = r0.b;
        r2 = defpackage.awah.a(r2);
        r3 = 1;
        if (r2 == 0) goto L_0x0026;
    L_0x0025:
        goto L_0x0027;
    L_0x0026:
        r2 = 1;
    L_0x0027:
        r4 = defpackage.ajok.a(r0);
        if (r4 == 0) goto L_0x0057;
    L_0x002d:
        r4 = r7.d();
        if (r4 == 0) goto L_0x0034;
    L_0x0033:
        goto L_0x004c;
    L_0x0034:
        r4 = r0.a;
        r5 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r4 = r4 & r5;
        if (r4 == 0) goto L_0x0057;
    L_0x003b:
        r4 = r0.m;
        if (r4 != 0) goto L_0x0041;
    L_0x003f:
        r4 = defpackage.atdj.c;
    L_0x0041:
        r4 = r4.b;
        if (r4 != 0) goto L_0x0047;
    L_0x0045:
        r4 = defpackage.aujn.f;
    L_0x0047:
        r4 = r4.c;
        if (r4 != 0) goto L_0x004c;
    L_0x004b:
        goto L_0x0057;
    L_0x004c:
        r1 = r7.d;
        r2 = new ajoj;
        r2.<init>(r7, r8, r0);
        r1.execute(r2);
        return r3;
    L_0x0057:
        r4 = r7.k;
        r5 = 7;
        if (r4 != r5) goto L_0x0068;
    L_0x005c:
        r4 = r7.f;
        r6 = defpackage.airi.PLAYBACK_LOADED;
        if (r4 == r6) goto L_0x0063;
    L_0x0062:
        goto L_0x0068;
    L_0x0063:
        if (r2 != r5) goto L_0x0066;
    L_0x0065:
        goto L_0x0068;
    L_0x0066:
        r4 = 1;
        goto L_0x0069;
    L_0x0068:
        r4 = 0;
    L_0x0069:
        r6 = r0.b;
        r6 = defpackage.awah.a(r6);
        if (r6 == 0) goto L_0x0072;
    L_0x0071:
        goto L_0x0073;
    L_0x0072:
        r6 = 1;
    L_0x0073:
        r7.k = r6;
        if (r4 == 0) goto L_0x0082;
    L_0x0077:
        r0 = r7.d;
        r1 = new ajom;
        r1.<init>(r7, r8);
        r0.execute(r1);
        return r3;
    L_0x0082:
        r8 = defpackage.aiqr.h(r0);
        if (r8 == 0) goto L_0x0099;
    L_0x0088:
        if (r2 != r5) goto L_0x0099;
    L_0x008a:
        r8 = r7.d();
        if (r8 == 0) goto L_0x0099;
    L_0x0090:
        r8 = r7.g;
        r0 = 2;
        if (r8 == r0) goto L_0x0099;
    L_0x0095:
        r0 = 3;
        if (r8 == r0) goto L_0x0099;
    L_0x0098:
        return r0;
    L_0x0099:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajok.b(ajov):int");
    }

    public final void c() {
        this.j = null;
    }
}
