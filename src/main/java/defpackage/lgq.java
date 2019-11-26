package defpackage;

import android.text.TextUtils;

/* renamed from: lgq */
public final class lgq extends lgw implements aijx, aikd, aizi {
    public final lgu a;
    public boolean b = true;
    public aafv c;
    public boolean d;
    private final lqv g;
    private final lgs h;
    private boolean i;
    private aafl j;
    private boolean k;
    private boolean l;
    private boolean m;

    public lgq(enl enl, lqv lqv, lgs lgs, lgu lgu) {
        super(enl, new lhf(), lgu);
        this.g = lqv;
        this.h = lgs;
        this.a = lgu;
        a((aikd) this);
    }

    public final synchronized boolean a() {
        return this.k;
    }

    public final synchronized void o_(boolean z) {
        boolean z2 = false;
        if (z) {
            try {
                if (a()) {
                    z2 = true;
                }
            } finally {
            }
        }
        this.l = z2;
    }

    public final synchronized boolean b() {
        return this.l;
    }

    public final synchronized void b(boolean z) {
        this.m = z;
    }

    public final aizl a(aiqq aiqq) {
        lgs lgs = this.h;
        boolean d = d();
        if (lgs.a(aiqq, (aikc) this) || (d && b((enm) lgs.a.b(aiqq)))) {
            return new aizl(aizn.JUMP, aiqq);
        }
        return new aizl(aizn.INSERT, aiqq);
    }

    public final boolean b(aiqq aiqq) {
        enm enm = (enm) aikb.a(this);
        if (!(enm instanceof enk) || !TextUtils.equals(enm.c(), aiqq.b())) {
            return false;
        }
        ((enk) enm).a();
        return true;
    }

    public final synchronized void a(aafv aafv) {
        boolean z = aafv != null;
        this.i = z;
        if (!z) {
            this.a.c = null;
            this.j = null;
            b(null);
        } else if (this.b) {
            a(aafv, c(aafv));
        } else {
            b(aafv);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d9  */
    public final synchronized void a(defpackage.aafv r7, boolean r8) {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r7.c;	 Catch:{ all -> 0x011d }
        r0 = defpackage.aiqx.c(r0);	 Catch:{ all -> 0x011d }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x011d }
        r1 = 1;
        r0 = r0 ^ r1;
        r2 = 0;
        if (r8 == 0) goto L_0x0012;
    L_0x0010:
        if (r0 == 0) goto L_0x00fb;
    L_0x0012:
        r8 = r6.f;	 Catch:{ all -> 0x011d }
        defpackage.amqw.a(r7);	 Catch:{ all -> 0x011d }
        defpackage.amqw.a(r7);	 Catch:{ all -> 0x011d }
        r0 = r7.a;	 Catch:{ all -> 0x011d }
        r3 = 0;
        if (r0 == 0) goto L_0x0030;
    L_0x001f:
        r0 = r0.n;	 Catch:{ all -> 0x011d }
        if (r0 != 0) goto L_0x0024;
    L_0x0023:
        goto L_0x0030;
    L_0x0024:
        r4 = r0.a;	 Catch:{ all -> 0x011d }
        r4 = r4 & r1;
        if (r4 == 0) goto L_0x0030;
    L_0x0029:
        r0 = r0.b;	 Catch:{ all -> 0x011d }
        if (r0 != 0) goto L_0x0031;
    L_0x002d:
        r0 = defpackage.avjl.e;	 Catch:{ all -> 0x011d }
        goto L_0x0031;
    L_0x0030:
        r0 = r3;
    L_0x0031:
        if (r0 != 0) goto L_0x0034;
    L_0x0033:
        goto L_0x003c;
    L_0x0034:
        r8.a(r0);	 Catch:{ all -> 0x011d }
        r0 = r8.e;	 Catch:{ all -> 0x011d }
        if (r0 == 0) goto L_0x003c;
    L_0x003b:
        goto L_0x0064;
    L_0x003c:
        r0 = r7.c;	 Catch:{ all -> 0x011d }
        r8.a();	 Catch:{ all -> 0x011d }
        r4 = defpackage.avjj.c;	 Catch:{ all -> 0x011d }
        r4 = r4.createBuilder();	 Catch:{ all -> 0x011d }
        r4 = (defpackage.avji) r4;	 Catch:{ all -> 0x011d }
        r4.a(r0);	 Catch:{ all -> 0x011d }
        r4 = r4.build();	 Catch:{ all -> 0x011d }
        r4 = (defpackage.anxl) r4;	 Catch:{ all -> 0x011d }
        r4 = (defpackage.avjj) r4;	 Catch:{ all -> 0x011d }
        r5 = r8.a;	 Catch:{ all -> 0x011d }
        r5.add(r4);	 Catch:{ all -> 0x011d }
        r4 = r8.c;	 Catch:{ all -> 0x011d }
        r0 = defpackage.elq.a(r0);	 Catch:{ all -> 0x011d }
        r4.add(r0);	 Catch:{ all -> 0x011d }
        r8.d = r2;	 Catch:{ all -> 0x011d }
    L_0x0064:
        r8 = r6.f;	 Catch:{ all -> 0x011d }
        r0 = r8.d;	 Catch:{ all -> 0x011d }
        r8 = r8.a;	 Catch:{ all -> 0x011d }
        r8 = r8.get(r0);	 Catch:{ all -> 0x011d }
        r8 = (defpackage.avjj) r8;	 Catch:{ all -> 0x011d }
        r0 = r6.e();	 Catch:{ all -> 0x011d }
        r4 = -1;
        if (r0 != r4) goto L_0x0078;
    L_0x0077:
        goto L_0x00c7;
    L_0x0078:
        r4 = r8.a;	 Catch:{ all -> 0x011d }
        r4 = r4 & r1;
        if (r4 == 0) goto L_0x00c7;
    L_0x007d:
        r0 = r6.a(r2, r0);	 Catch:{ all -> 0x011d }
        r0 = (defpackage.enm) r0;	 Catch:{ all -> 0x011d }
        r4 = r0 instanceof defpackage.enk;	 Catch:{ all -> 0x011d }
        if (r4 == 0) goto L_0x00c7;
    L_0x0087:
        r0 = (defpackage.enk) r0;	 Catch:{ all -> 0x011d }
        r4 = r8.b;	 Catch:{ all -> 0x011d }
        if (r4 != 0) goto L_0x008f;
    L_0x008d:
        r4 = defpackage.apxu.d;	 Catch:{ all -> 0x011d }
    L_0x008f:
        r4 = defpackage.aiqx.b(r4);	 Catch:{ all -> 0x011d }
        r5 = r0.c();	 Catch:{ all -> 0x011d }
        r4 = android.text.TextUtils.equals(r5, r4);	 Catch:{ all -> 0x011d }
        if (r4 == 0) goto L_0x00c7;
    L_0x009d:
        r4 = r8.a;	 Catch:{ all -> 0x011d }
        r4 = r4 & r1;
        if (r4 == 0) goto L_0x00a9;
    L_0x00a2:
        r4 = r8.b;	 Catch:{ all -> 0x011d }
        if (r4 != 0) goto L_0x00aa;
    L_0x00a6:
        r4 = defpackage.apxu.d;	 Catch:{ all -> 0x011d }
        goto L_0x00aa;
    L_0x00a9:
        r4 = r3;
    L_0x00aa:
        r4 = defpackage.enj.a(r0, r4);	 Catch:{ all -> 0x011d }
        if (r4 == 0) goto L_0x00c7;
    L_0x00b0:
        r4 = r8.a;	 Catch:{ all -> 0x011d }
        r4 = r4 & r1;
        if (r4 == 0) goto L_0x00bb;
    L_0x00b5:
        r3 = r8.b;	 Catch:{ all -> 0x011d }
        if (r3 != 0) goto L_0x00bb;
    L_0x00b9:
        r3 = defpackage.apxu.d;	 Catch:{ all -> 0x011d }
    L_0x00bb:
        r0.a(r3);	 Catch:{ all -> 0x011d }
        r8 = r6.e;	 Catch:{ all -> 0x011d }
        r0 = r0.b();	 Catch:{ all -> 0x011d }
        r8.a(r3, r0);	 Catch:{ all -> 0x011d }
    L_0x00c7:
        r8 = r6.f;	 Catch:{ all -> 0x011d }
        r8 = r8.a;	 Catch:{ all -> 0x011d }
        r6.a(r2, r8);	 Catch:{ all -> 0x011d }
        r8 = r6.e();	 Catch:{ all -> 0x011d }
        r0 = r6.f;	 Catch:{ all -> 0x011d }
        r0 = r0.d;	 Catch:{ all -> 0x011d }
        if (r8 != r0) goto L_0x00d9;
    L_0x00d8:
        goto L_0x00dc;
    L_0x00d9:
        r6.b(r0);	 Catch:{ all -> 0x011d }
    L_0x00dc:
        r8 = r6.f;	 Catch:{ all -> 0x011d }
        r8 = r8.b;	 Catch:{ all -> 0x011d }
        r6.a(r1, r8);	 Catch:{ all -> 0x011d }
        r8 = r6.e;	 Catch:{ all -> 0x011d }
        r0 = r6.f;	 Catch:{ all -> 0x011d }
        r0 = r0.c;	 Catch:{ all -> 0x011d }
        r8.a(r0);	 Catch:{ all -> 0x011d }
        r8 = r6.a;	 Catch:{ all -> 0x011d }
        r0 = defpackage.aikb.a(r6);	 Catch:{ all -> 0x011d }
        r0 = (defpackage.enm) r0;	 Catch:{ all -> 0x011d }
        r8.b = r0;	 Catch:{ all -> 0x011d }
        r8 = r6.g;	 Catch:{ all -> 0x011d }
        r8.a();	 Catch:{ all -> 0x011d }
    L_0x00fb:
        r8 = r6.a;	 Catch:{ all -> 0x011d }
        r0 = defpackage.aikb.a(r6);	 Catch:{ all -> 0x011d }
        r0 = (defpackage.enm) r0;	 Catch:{ all -> 0x011d }
        r8.c = r0;	 Catch:{ all -> 0x011d }
        r7 = r7.i;	 Catch:{ all -> 0x011d }
        r6.j = r7;	 Catch:{ all -> 0x011d }
        r7 = r6.j;	 Catch:{ all -> 0x011d }
        if (r7 == 0) goto L_0x0113;
    L_0x010d:
        r7 = r7.b();	 Catch:{ all -> 0x011d }
        if (r7 != 0) goto L_0x0114;
    L_0x0113:
        r1 = 0;
    L_0x0114:
        r6.k = r1;	 Catch:{ all -> 0x011d }
        if (r1 != 0) goto L_0x011b;
    L_0x0118:
        r6.o_(r2);	 Catch:{ all -> 0x011d }
    L_0x011b:
        monitor-exit(r6);
        return;
    L_0x011d:
        r7 = move-exception;
        monitor-exit(r6);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgq.a(aafv, boolean):void");
    }

    public final synchronized aiqq a(aizl aizl) {
        lgv c = c(aizl);
        if (c == null) {
            return null;
        }
        aiqq e = c.b.e();
        e.a(aizl.f);
        return e;
    }

    public final void a(aizl aizl, aiqq aiqq) {
        Object c = c(aizl);
        if (c != null) {
            enm enm = c.b;
            if (enm != null && aiqx.a(enm.e(), aiqq)) {
                this.a.d = (lgv) amqw.a(c);
                super.a(c.b);
                this.a.d = null;
                return;
            }
        }
        throw new IllegalStateException("Navigation committed to a video that is not expected by the navigable queue");
    }

    public final synchronized void c() {
        super.c();
        this.a.b = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00db A:{RETURN} */
    private final defpackage.lgv c(defpackage.aizl r8) {
        /*
        r7 = this;
        r0 = r7.j;
        r1 = 0;
        r2 = 0;
        if (r0 == 0) goto L_0x000f;
    L_0x0006:
        r3 = r7.l;
        r4 = r7.m;
        r0 = r0.a(r3, r1, r4);
        goto L_0x0010;
    L_0x000f:
        r0 = r2;
    L_0x0010:
        r3 = r7.h;
        r4 = r7.d();
        r5 = r8.e;
        r6 = defpackage.aizn.INSERT;
        if (r5 == r6) goto L_0x00dc;
    L_0x001c:
        r6 = defpackage.aizn.JUMP;
        if (r5 != r6) goto L_0x0078;
    L_0x0020:
        r0 = r8.e;
        r5 = defpackage.aizn.JUMP;
        if (r0 != r5) goto L_0x00e0;
    L_0x0026:
        r0 = r8.f;
        if (r0 == 0) goto L_0x00e0;
    L_0x002a:
        r5 = r3.a;
        r5 = r5.b(r0);
        r5 = (defpackage.enm) r5;
        if (r4 == 0) goto L_0x0069;
    L_0x0034:
        r3 = r3.a;
        r8 = defpackage.aika.a(r7, r8, r3, r1);
        r8 = (defpackage.enm) r8;
        if (r8 != 0) goto L_0x003f;
    L_0x003e:
        goto L_0x0069;
    L_0x003f:
        r0 = r5.d();
        r0 = r0.b;
        r0 = r0.d();
        r1 = r8.d();
        r1 = r1.b;
        r1 = r1.d();
        r0 = java.util.Arrays.equals(r0, r1);
        if (r0 != 0) goto L_0x0061;
    L_0x0059:
        r8 = defpackage.aizn.JUMP;
        r2 = defpackage.lgs.b(r8, r5);
        goto L_0x00e0;
    L_0x0061:
        r0 = defpackage.aizn.JUMP;
        r2 = defpackage.lgs.a(r0, r8);
        goto L_0x00e0;
    L_0x0069:
        r8 = defpackage.lgs.a(r0, r7);
        if (r8 != 0) goto L_0x0071;
    L_0x006f:
        goto L_0x00e0;
    L_0x0071:
        r8 = defpackage.aizn.JUMP;
        r8 = defpackage.lgs.b(r8, r5);
        return r8;
    L_0x0078:
        r8 = r8.e;
        if (r4 != 0) goto L_0x007e;
    L_0x007c:
        r1 = r2;
        goto L_0x007f;
    L_0x007e:
        r1 = r7;
    L_0x007f:
        if (r0 == 0) goto L_0x00d7;
    L_0x0081:
        r4 = r8.ordinal();
        if (r4 == 0) goto L_0x00bf;
    L_0x0087:
        r5 = 1;
        if (r4 == r5) goto L_0x00a7;
    L_0x008a:
        r1 = 2;
        if (r4 == r1) goto L_0x009c;
    L_0x008d:
        r1 = 3;
        if (r4 == r1) goto L_0x0091;
    L_0x0090:
        goto L_0x00d7;
    L_0x0091:
        r0 = r0.d();
        if (r0 == 0) goto L_0x00d7;
    L_0x0097:
        r8 = r3.a(r8, r0);
        goto L_0x00d8;
    L_0x009c:
        r0 = r0.a();
        if (r0 == 0) goto L_0x00d7;
    L_0x00a2:
        r8 = r3.a(r8, r0);
        goto L_0x00d8;
    L_0x00a7:
        r4 = r0.c();
        if (r4 == 0) goto L_0x00b2;
    L_0x00ad:
        r8 = r3.a(r8, r4);
        goto L_0x00d8;
    L_0x00b2:
        r0 = r0.a;
        r0 = r0.h;
        if (r0 != 0) goto L_0x00ba;
    L_0x00b8:
        r0 = defpackage.aozk.c;
    L_0x00ba:
        r8 = r3.a(r8, r0, r1);
        goto L_0x00d8;
    L_0x00bf:
        r4 = r0.b();
        if (r4 == 0) goto L_0x00ca;
    L_0x00c5:
        r8 = r3.a(r8, r4);
        goto L_0x00d8;
    L_0x00ca:
        r0 = r0.a;
        r0 = r0.f;
        if (r0 != 0) goto L_0x00d2;
    L_0x00d0:
        r0 = defpackage.aozk.c;
    L_0x00d2:
        r8 = r3.a(r8, r0, r1);
        goto L_0x00d8;
    L_0x00d7:
        r8 = r2;
    L_0x00d8:
        if (r8 != 0) goto L_0x00db;
    L_0x00da:
        goto L_0x00e0;
    L_0x00db:
        return r8;
    L_0x00dc:
        r8 = r8.f;
        if (r8 != 0) goto L_0x00e1;
    L_0x00e0:
        return r2;
    L_0x00e1:
        r0 = defpackage.aizn.INSERT;
        r1 = r3.a;
        r8 = r1.b(r8);
        r8 = (defpackage.enm) r8;
        r8 = defpackage.lgs.b(r0, r8);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgq.c(aizl):lgv");
    }

    private final boolean c(aafv aafv) {
        if (aafv != null) {
            enm enm = (enm) aikb.a(this);
            if (enm != null && aafv == this.g.b(enm)) {
                return true;
            }
        }
        return false;
    }

    public final void b(aafv aafv) {
        this.c = aafv;
        this.d = c(aafv);
    }

    public final int b(aizl aizl) {
        if (aizl.e == aizn.AUTOPLAY && !this.i) {
            return 3;
        }
        return aizl.a(c(aizl) != null);
    }
}
