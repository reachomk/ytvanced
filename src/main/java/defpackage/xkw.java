package defpackage;

import java.util.concurrent.Executor;

/* renamed from: xkw */
final class xkw implements Runnable, xjy {
    private final Executor a;
    private final xle b;
    private final xkj c;
    private final xku d;
    private final xjp e;
    private final xii f;
    private String g;
    private bpz h;
    private Long i;
    private boolean j = false;
    private xki k;

    xkw(Executor executor, xle xle, xkj xkj, xku xku, xjp xjp) {
        this.a = executor;
        this.b = xle;
        this.c = xkj;
        this.d = xku;
        this.e = xjp;
        this.f = new xii();
    }

    public final void run() {
        if (this.e.a()) {
            this.d.a(this.b);
            this.e.b();
            return;
        }
        this.g = this.b.g();
        if (this.b.e) {
            this.c.n().b(this.g);
        }
        if (this.b.i) {
            this.h = this.c.n().a(this.g);
        }
        bpz bpz = this.h;
        if (!(bpz == null || bpz.a())) {
            bpz bpz2 = this.h;
            a(new bqd(bpz2.a, bpz2.g), null);
            if (!this.h.b()) {
                return;
            }
        }
        try {
            if (this.c.y() != null) {
                try {
                    bqd a = this.c.y().a();
                    if (a != null) {
                        a(a, null);
                        return;
                    }
                } catch (bqn e) {
                    a(null, e);
                    return;
                }
            }
            if (this.c.z() != null) {
                this.j = true;
                this.i = this.c.z().a(this.b);
            }
            b();
        } catch (Exception e2) {
            a(e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00fd A:{Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00fc A:{Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x012c A:{Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0145 A:{Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0142 A:{Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x013f A:{Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x013c A:{Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0139 A:{Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0136 A:{Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0133 A:{Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0130 A:{Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0161 A:{Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0157 A:{Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0172 A:{Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x017d A:{Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01c6 A:{Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }} */
    private final void b() {
        /*
        r17 = this;
        r10 = r17;
        r0 = r10.e;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r0 = r0.a();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        if (r0 == 0) goto L_0x0017;
    L_0x000a:
        r0 = r10.d;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r10.b;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r0.a(r1);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r0 = r10.e;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r0.b();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        return;
    L_0x0017:
        r0 = r10.c;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r0 = r0.c();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r0 = r0.get();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r0 = (defpackage.xvq) r0;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r10.b;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r1.f();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r0 = r0.a(r1);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r0 = r0.a(r1);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r10.c;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r3 = r1.v();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        if (r3 == 0) goto L_0x003c;
    L_0x0039:
        defpackage.xlg.a(r0);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
    L_0x003c:
        r12 = new java.util.HashMap;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r12.<init>();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r10.h;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        if (r1 == 0) goto L_0x0068;
    L_0x0045:
        r1 = r1.b;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        if (r1 == 0) goto L_0x004e;
    L_0x0049:
        r2 = "If-None-Match";
        r12.put(r2, r1);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
    L_0x004e:
        r1 = r10.h;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r1.d;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r4 = 0;
        r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
        if (r6 <= 0) goto L_0x0068;
    L_0x0058:
        r4 = "If-Modified-Since";
        r5 = defpackage.xkv.a;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r6 = new java.util.Date;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r6.<init>(r1);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r5.format(r6);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r12.put(r4, r1);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
    L_0x0068:
        r1 = r10.b;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r2 = r1.c;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r13 = 1;
        r14 = 2;
        if (r2 == r13) goto L_0x0076;
    L_0x0070:
        if (r2 == r14) goto L_0x0076;
    L_0x0072:
        r4 = 7;
        if (r2 == r4) goto L_0x0076;
    L_0x0075:
        goto L_0x007f;
    L_0x0076:
        r2 = "Content-Type";
        r1 = r1.e();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r12.put(r2, r1);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
    L_0x007f:
        r1 = r10.b;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r1.c();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r12.putAll(r1);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r10.b;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r15 = r1.a();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r10.c;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r1.g();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r1.i;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        if (r1 != 0) goto L_0x0099;
    L_0x0098:
        goto L_0x00bf;
    L_0x0099:
        r1 = r10.b;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r1.f;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r1.aZ_();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        if (r1 <= 0) goto L_0x00bf;
    L_0x00a3:
        r1 = new xko;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r2 = r10.c;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r5 = r2.i();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r2 = r10.c;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r6 = r2.q();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r2 = r10.b;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r2 = r2.f;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r2 = r2.aZ_();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r8 = (long) r2;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r4 = r1;
        r4.<init>(r5, r6, r8);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        goto L_0x00c1;
    L_0x00bf:
        r1 = defpackage.xky.c;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
    L_0x00c1:
        r9 = r1;
        r1 = r10.c;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r8 = r1.j();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r7 = new xjt;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r10.c;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r2 = r1.f();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r5 = r10.a;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r6 = r10.b;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r4 = r10.h;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r7;
        r16 = r4;
        r4 = r8;
        r13 = r7;
        r7 = r16;
        r11 = r8;
        r8 = r17;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = defpackage.aniv.a;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r2 = r10.c;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r2 = r2.a();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r2 = r2.get();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r2 = (defpackage.bciz) r2;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r0 = r2.a(r0, r13, r1);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r0 = (defpackage.bcjl) r0;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r0.b();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        if (r15 != 0) goto L_0x00fd;
    L_0x00fc:
        goto L_0x010f;
    L_0x00fd:
        r2 = r15.length;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r3 = new bckv;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r4 = 0;
        r2 = java.nio.ByteBuffer.wrap(r15, r4, r2);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r2 = r2.slice();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r3.<init>(r2);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r0.a(r3, r1);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
    L_0x010f:
        r1 = r10.c;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r1.b();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r1.get();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = (defpackage.xje) r1;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r2 = r12.entrySet();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1.a(r0, r2);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r11.a(r0);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r10.b;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r1.c;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        switch(r1) {
            case 0: goto L_0x0145;
            case 1: goto L_0x0142;
            case 2: goto L_0x013f;
            case 3: goto L_0x013c;
            case 4: goto L_0x0139;
            case 5: goto L_0x0136;
            case 6: goto L_0x0133;
            case 7: goto L_0x0130;
            default: goto L_0x012c;
        };	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
    L_0x012c:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        goto L_0x01d2;
    L_0x0130:
        r1 = "PATCH";
        goto L_0x0147;
    L_0x0133:
        r1 = "TRACE";
        goto L_0x0147;
    L_0x0136:
        r1 = "OPTIONS";
        goto L_0x0147;
    L_0x0139:
        r1 = "HEAD";
        goto L_0x0147;
    L_0x013c:
        r1 = "DELETE";
        goto L_0x0147;
    L_0x013f:
        r1 = "PUT";
        goto L_0x0147;
    L_0x0142:
        r1 = "POST";
        goto L_0x0147;
    L_0x0145:
        r1 = "GET";
    L_0x0147:
        r0.a(r1);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r10.b;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r1.d();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r1.ordinal();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r2 = 3;
        if (r1 == 0) goto L_0x0161;
    L_0x0157:
        if (r1 == r14) goto L_0x015f;
    L_0x0159:
        if (r1 == r2) goto L_0x015d;
    L_0x015b:
        r1 = 2;
        goto L_0x0162;
    L_0x015d:
        r1 = 4;
        goto L_0x0162;
    L_0x015f:
        r1 = 3;
        goto L_0x0162;
    L_0x0161:
        r1 = 1;
    L_0x0162:
        r0.a(r1);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r10.f;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r0.a(r1);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r10.c;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r1.h();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        if (r1 == 0) goto L_0x0175;
    L_0x0172:
        r0.a();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
    L_0x0175:
        r1 = r10.c;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r1.k();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        if (r1 == 0) goto L_0x01a4;
    L_0x017d:
        r1 = new xki;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r2 = r10.f;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r3 = r10.c;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r3 = r3.k();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r4 = r10.c;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r4 = r4.l();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1.<init>(r2, r3, r4);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r10.k = r1;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r10.k;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r2 = r1.b;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        if (r2 == 0) goto L_0x01a4;
    L_0x0198:
        r3 = r1.c;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        if (r3 == 0) goto L_0x01a4;
    L_0x019c:
        r4 = new xkk;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r4.<init>(r1, r2, r3);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r0.a(r4);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
    L_0x01a4:
        r0 = r0.c();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r13.a;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r1.b();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r13.e = r1;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r13.c;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r2 = new xjw;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r2.<init>(r13, r0);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1.a(r2);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r10.b;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r2 = defpackage.xhs.class;
        r1 = r1.a(r2);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = (defpackage.xhs) r1;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        if (r1 == 0) goto L_0x01c9;
    L_0x01c6:
        r1.a();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
    L_0x01c9:
        r0.a();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r10.e;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1.a(r0);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        return;
    L_0x01d2:
        r2 = new java.lang.StringBuilder;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r3 = 27;
        r2.<init>(r3);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r3 = "Unknown method: ";
        r2.append(r3);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r2.append(r1);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r1 = r2.toString();	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        r0.<init>(r1);	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
        throw r0;	 Catch:{ bpx -> 0x01f4, xld -> 0x01e9 }
    L_0x01e9:
        r0 = move-exception;
        r1 = new bqn;
        r1.<init>(r0);
        r2 = 0;
        r10.a(r2, r1);
        return;
    L_0x01f4:
        r0 = move-exception;
        r2 = 0;
        r1 = r10.a(r0);
        if (r1 == 0) goto L_0x0200;
    L_0x01fc:
        r17.b();
        return;
    L_0x0200:
        r10.a(r2, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkw.b():void");
    }

    private final void a(bqd bqd, bqn bqn) {
        if (bqn == null) {
            try {
                this.c.m().d();
                if (this.j) {
                    if (bqd != null) {
                        this.c.z().a(this.b, bqd, this.i);
                    }
                }
                bqh a = this.b.a(bqd);
                if (this.b.i && a.b != null) {
                    this.c.n().a(this.g, a.b);
                }
                this.f.a(this.b.h);
                a(a);
                return;
            } catch (Exception e) {
                a(e);
                return;
            }
        }
        bqn a2 = this.b.a(bqn);
        this.f.a(this.b.h);
        a(bqh.a(a2));
    }

    private final void a(bqh bqh) {
        this.e.a(this.b, bqh);
        this.d.a(this.b, bqh);
        xki xki = this.k;
        if (xki != null && xki.d != null && xki.b != null) {
            Executor executor = xki.c;
            if (executor != null) {
                executor.execute(new xkh(xki));
            }
        }
    }

    private final void a(Exception exception) {
        a(bqh.a(new bqn((Throwable) exception)));
    }

    public final void a() {
        xhs xhs = (xhs) this.b.a(xhs.class);
        if (xhs != null) {
            xhs.b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x006f A:{Splitter:B:0:0x0000, ExcHandler: Exception (r3_1 'e' java.lang.Exception)} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:44:0x006f, code skipped:
            r3 = move-exception;
     */
    /* JADX WARNING: Missing block: B:45:0x0070, code skipped:
            a(r3);
     */
    /* JADX WARNING: Missing block: B:46:0x0073, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:47:0x0074, code skipped:
            r4 = e;
     */
    /* JADX WARNING: Missing block: B:48:0x0075, code skipped:
            r0 = null;
     */
    /* JADX WARNING: Missing block: B:54:0x0088, code skipped:
            b();
     */
    /* JADX WARNING: Missing block: B:55:0x008b, code skipped:
            return;
     */
    public final void a(defpackage.bqd r3, defpackage.bcjd r4) {
        /*
        r2 = this;
        r0 = r2.e;	 Catch:{ bqn -> 0x0074, Exception -> 0x006f }
        r0 = r0.a();	 Catch:{ bqn -> 0x0074, Exception -> 0x006f }
        if (r0 == 0) goto L_0x0022;
    L_0x0008:
        r0 = r2.d;	 Catch:{ bqn -> 0x0074, Exception -> 0x006f }
        r1 = r2.b;	 Catch:{ bqn -> 0x0074, Exception -> 0x006f }
        r0 = r0.b(r1);	 Catch:{ bqn -> 0x0074, Exception -> 0x006f }
        if (r0 != 0) goto L_0x0018;
    L_0x0012:
        r4 = r2.e;	 Catch:{ bqn -> 0x0074, Exception -> 0x006f }
        r4.b();	 Catch:{ bqn -> 0x0074, Exception -> 0x006f }
        return;
    L_0x0018:
        if (r3 != 0) goto L_0x0022;
    L_0x001a:
        r4 = r2.d;	 Catch:{ bqn -> 0x0074, Exception -> 0x006f }
        r0 = r2.b;	 Catch:{ bqn -> 0x0074, Exception -> 0x006f }
        r4.a(r0);	 Catch:{ bqn -> 0x0074, Exception -> 0x006f }
        return;
    L_0x0022:
        if (r3 == 0) goto L_0x0048;
    L_0x0024:
        r4 = r3.a;	 Catch:{ bqn -> 0x0074, Exception -> 0x006f }
        r0 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r4 < r0) goto L_0x0034;
    L_0x002a:
        r0 = 299; // 0x12b float:4.19E-43 double:1.477E-321;
        if (r4 <= r0) goto L_0x002f;
    L_0x002e:
        goto L_0x0034;
    L_0x002f:
        r4 = 0;
        r2.a(r3, r4);	 Catch:{ bqn -> 0x0074, Exception -> 0x006f }
        return;
    L_0x0034:
        r0 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r4 == r0) goto L_0x0042;
    L_0x0038:
        r0 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        if (r4 == r0) goto L_0x0042;
    L_0x003c:
        r4 = new bql;	 Catch:{ bqn -> 0x0074, Exception -> 0x006f }
        r4.<init>(r3);	 Catch:{ bqn -> 0x0074, Exception -> 0x006f }
        throw r4;	 Catch:{ bqn -> 0x0074, Exception -> 0x006f }
    L_0x0042:
        r4 = new bpx;	 Catch:{ bqn -> 0x006c, Exception -> 0x006f }
        r4.<init>(r3);	 Catch:{ bqn -> 0x006c, Exception -> 0x006f }
        throw r4;	 Catch:{ bqn -> 0x006c, Exception -> 0x006f }
    L_0x0048:
        if (r4 == 0) goto L_0x0066;
    L_0x004a:
        r0 = r4 instanceof defpackage.bckg;	 Catch:{ bqn -> 0x0074, Exception -> 0x006f }
        if (r0 == 0) goto L_0x0060;
    L_0x004e:
        r0 = r4;
        r0 = (defpackage.bckg) r0;	 Catch:{ bqn -> 0x0074, Exception -> 0x006f }
        r0 = r0.c();	 Catch:{ bqn -> 0x0074, Exception -> 0x006f }
        if (r0 == 0) goto L_0x0060;
    L_0x0057:
        r0 = new bqo;	 Catch:{ bqn -> 0x006c, Exception -> 0x006f }
        r0.<init>();	 Catch:{ bqn -> 0x006c, Exception -> 0x006f }
        r0.initCause(r4);	 Catch:{ bqn -> 0x006c, Exception -> 0x006f }
        throw r0;	 Catch:{ bqn -> 0x006c, Exception -> 0x006f }
    L_0x0060:
        r0 = new bqe;	 Catch:{ bqn -> 0x0074, Exception -> 0x006f }
        r0.<init>(r4);	 Catch:{ bqn -> 0x0074, Exception -> 0x006f }
        throw r0;	 Catch:{ bqn -> 0x0074, Exception -> 0x006f }
    L_0x0066:
        r4 = new bqo;	 Catch:{ bqn -> 0x006c, Exception -> 0x006f }
        r4.<init>();	 Catch:{ bqn -> 0x006c, Exception -> 0x006f }
        throw r4;	 Catch:{ bqn -> 0x006c, Exception -> 0x006f }
    L_0x006c:
        r4 = move-exception;
        r0 = 1;
        goto L_0x0076;
    L_0x006f:
        r3 = move-exception;
        r2.a(r3);
        return;
    L_0x0074:
        r4 = move-exception;
        r0 = 0;
    L_0x0076:
        r1 = r2.b;
        r1 = r1.j();
        if (r1 == 0) goto L_0x007f;
    L_0x007e:
        goto L_0x0082;
    L_0x007f:
        if (r0 != 0) goto L_0x0082;
    L_0x0081:
        goto L_0x008c;
    L_0x0082:
        r0 = r2.a(r4);
        if (r0 == 0) goto L_0x008c;
    L_0x0088:
        r2.b();
        return;
    L_0x008c:
        r2.a(r3, r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkw.a(bqd, bcjd):void");
    }

    private final boolean a(bqn bqn) {
        try {
            this.b.f.a_(bqn);
            return true;
        } catch (bqn unused) {
            return false;
        }
    }
}
