package defpackage;

/* renamed from: txk */
final class txk implements Runnable {
    private final /* synthetic */ txf a;
    private final /* synthetic */ tya b;
    private final /* synthetic */ tzu c;
    private final /* synthetic */ tzu d;
    private final /* synthetic */ tzu e;
    private final /* synthetic */ txl f;
    private final /* synthetic */ txo g;

    txk(txf txf, tya tya, tzu tzu, tzu tzu2, tzu tzu3, txl txl, txo txo) {
        this.a = txf;
        this.b = tya;
        this.c = tzu;
        this.d = tzu2;
        this.e = tzu3;
        this.f = txl;
        this.g = txo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:187:0x04aa A:{Catch:{ all -> 0x0581, all -> 0x0579, all -> 0x0575, all -> 0x0538, all -> 0x04f2, all -> 0x048a, all -> 0x03db, all -> 0x0308, all -> 0x0269, all -> 0x0233, RuntimeException -> 0x05dc, all -> 0x05d8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0518 A:{Catch:{ all -> 0x0581, all -> 0x0579, all -> 0x0575, all -> 0x0538, all -> 0x04f2, all -> 0x048a, all -> 0x03db, all -> 0x0308, all -> 0x0269, all -> 0x0233, RuntimeException -> 0x05dc, all -> 0x05d8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0542 A:{Catch:{ all -> 0x0581, all -> 0x0579, all -> 0x0575, all -> 0x0538, all -> 0x04f2, all -> 0x048a, all -> 0x03db, all -> 0x0308, all -> 0x0269, all -> 0x0233, RuntimeException -> 0x05dc, all -> 0x05d8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x05a2 A:{Catch:{ all -> 0x0581, all -> 0x0579, all -> 0x0575, all -> 0x0538, all -> 0x04f2, all -> 0x048a, all -> 0x03db, all -> 0x0308, all -> 0x0269, all -> 0x0233, RuntimeException -> 0x05dc, all -> 0x05d8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0405 A:{Catch:{ all -> 0x0581, all -> 0x0579, all -> 0x0575, all -> 0x0538, all -> 0x04f2, all -> 0x048a, all -> 0x03db, all -> 0x0308, all -> 0x0269, all -> 0x0233, RuntimeException -> 0x05dc, all -> 0x05d8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x04aa A:{Catch:{ all -> 0x0581, all -> 0x0579, all -> 0x0575, all -> 0x0538, all -> 0x04f2, all -> 0x048a, all -> 0x03db, all -> 0x0308, all -> 0x0269, all -> 0x0233, RuntimeException -> 0x05dc, all -> 0x05d8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0518 A:{Catch:{ all -> 0x0581, all -> 0x0579, all -> 0x0575, all -> 0x0538, all -> 0x04f2, all -> 0x048a, all -> 0x03db, all -> 0x0308, all -> 0x0269, all -> 0x0233, RuntimeException -> 0x05dc, all -> 0x05d8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0542 A:{Catch:{ all -> 0x0581, all -> 0x0579, all -> 0x0575, all -> 0x0538, all -> 0x04f2, all -> 0x048a, all -> 0x03db, all -> 0x0308, all -> 0x0269, all -> 0x0233, RuntimeException -> 0x05dc, all -> 0x05d8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x05a2 A:{Catch:{ all -> 0x0581, all -> 0x0579, all -> 0x0575, all -> 0x0538, all -> 0x04f2, all -> 0x048a, all -> 0x03db, all -> 0x0308, all -> 0x0269, all -> 0x0233, RuntimeException -> 0x05dc, all -> 0x05d8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0337 A:{Catch:{ all -> 0x0581, all -> 0x0579, all -> 0x0575, all -> 0x0538, all -> 0x04f2, all -> 0x048a, all -> 0x03db, all -> 0x0308, all -> 0x0269, all -> 0x0233, RuntimeException -> 0x05dc, all -> 0x05d8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0322 A:{Catch:{ all -> 0x0581, all -> 0x0579, all -> 0x0575, all -> 0x0538, all -> 0x04f2, all -> 0x048a, all -> 0x03db, all -> 0x0308, all -> 0x0269, all -> 0x0233, RuntimeException -> 0x05dc, all -> 0x05d8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0405 A:{Catch:{ all -> 0x0581, all -> 0x0579, all -> 0x0575, all -> 0x0538, all -> 0x04f2, all -> 0x048a, all -> 0x03db, all -> 0x0308, all -> 0x0269, all -> 0x0233, RuntimeException -> 0x05dc, all -> 0x05d8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x04aa A:{Catch:{ all -> 0x0581, all -> 0x0579, all -> 0x0575, all -> 0x0538, all -> 0x04f2, all -> 0x048a, all -> 0x03db, all -> 0x0308, all -> 0x0269, all -> 0x0233, RuntimeException -> 0x05dc, all -> 0x05d8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0518 A:{Catch:{ all -> 0x0581, all -> 0x0579, all -> 0x0575, all -> 0x0538, all -> 0x04f2, all -> 0x048a, all -> 0x03db, all -> 0x0308, all -> 0x0269, all -> 0x0233, RuntimeException -> 0x05dc, all -> 0x05d8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0542 A:{Catch:{ all -> 0x0581, all -> 0x0579, all -> 0x0575, all -> 0x0538, all -> 0x04f2, all -> 0x048a, all -> 0x03db, all -> 0x0308, all -> 0x0269, all -> 0x0233, RuntimeException -> 0x05dc, all -> 0x05d8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x05a2 A:{Catch:{ all -> 0x0581, all -> 0x0579, all -> 0x0575, all -> 0x0538, all -> 0x04f2, all -> 0x048a, all -> 0x03db, all -> 0x0308, all -> 0x0269, all -> 0x0233, RuntimeException -> 0x05dc, all -> 0x05d8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x05a2 A:{Catch:{ all -> 0x0581, all -> 0x0579, all -> 0x0575, all -> 0x0538, all -> 0x04f2, all -> 0x048a, all -> 0x03db, all -> 0x0308, all -> 0x0269, all -> 0x0233, RuntimeException -> 0x05dc, all -> 0x05d8 }} */
    public final void run() {
        /*
        r37 = this;
        r1 = r37;
        r2 = 0;
        r3 = "Primes";
        r4 = "background initialization";
        r5 = new java.lang.Object[r2];	 Catch:{ RuntimeException -> 0x05e3 }
        defpackage.tyv.d(r3, r4, r5);	 Catch:{ RuntimeException -> 0x05e3 }
        r3 = r1.a;	 Catch:{ RuntimeException -> 0x05e3 }
        r4 = r1.b;	 Catch:{ RuntimeException -> 0x05e3 }
        r5 = r1.c;	 Catch:{ RuntimeException -> 0x05e3 }
        r6 = r1.d;	 Catch:{ RuntimeException -> 0x05e3 }
        r7 = r1.e;	 Catch:{ RuntimeException -> 0x05e3 }
        r8 = r1.f;	 Catch:{ RuntimeException -> 0x05e3 }
        r9 = r1.g;	 Catch:{ RuntimeException -> 0x05e3 }
        r10 = defpackage.tyo.a;	 Catch:{ RuntimeException -> 0x05e3 }
        r11 = defpackage.tup.b();	 Catch:{ RuntimeException -> 0x05e3 }
        r10.a = r11;	 Catch:{ RuntimeException -> 0x05e3 }
        r10 = 2131953378; // 0x7f1306e2 float:1.9543225E38 double:1.0533249226E-314;
        r10 = java.lang.Integer.valueOf(r10);	 Catch:{ RuntimeException -> 0x05e3 }
        defpackage.uhy.a(r10);	 Catch:{ RuntimeException -> 0x05e3 }
        r10 = r3.a;	 Catch:{ RuntimeException -> 0x05e3 }
        r13 = r3.b;	 Catch:{ RuntimeException -> 0x05e3 }
        r15 = r3.c;	 Catch:{ RuntimeException -> 0x05e3 }
        r7 = r7.a();	 Catch:{ RuntimeException -> 0x05e3 }
        r7 = (defpackage.tzs) r7;	 Catch:{ RuntimeException -> 0x05e3 }
        r7.a(r8);	 Catch:{ RuntimeException -> 0x05e3 }
        r7.a(r9);	 Catch:{ RuntimeException -> 0x05e3 }
        r7.a(r10, r13);	 Catch:{ RuntimeException -> 0x05e3 }
        r11 = r7.a;	 Catch:{ RuntimeException -> 0x05e3 }
        if (r11 != 0) goto L_0x05cb;
    L_0x0045:
        r11 = defpackage.tyo.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r12 = defpackage.tup.b();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r11.b = r12;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r6 = r6.a();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r17 = r6;
        r17 = (android.content.SharedPreferences) r17;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r4 = r4.a();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r4 = defpackage.uhy.a(r4);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r4 = (defpackage.txw) r4;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r4 = defpackage.txw.a(r4);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r6 = defpackage.tyo.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r11 = defpackage.tup.b();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r6.c = r11;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r5 = r5.a();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r5 = (defpackage.tyi) r5;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r5 = defpackage.uhy.a(r5);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r5 = (defpackage.tyi) r5;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r6 = r7.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r6 != 0) goto L_0x05c7;
    L_0x007b:
        r6 = defpackage.tyo.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r11 = defpackage.tup.b();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r6.d = r11;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r14 = new txj;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r14.<init>(r4);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r6 = r15.get();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r6 = (defpackage.txg) r6;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r11 = r6 instanceof defpackage.twy;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r11 == 0) goto L_0x0096;
    L_0x0092:
        r11 = r6;
        r11 = (defpackage.twy) r11;	 Catch:{ RuntimeException -> 0x05e3 }
        goto L_0x0097;
    L_0x0096:
        r11 = 0;
    L_0x0097:
        if (r6 == 0) goto L_0x05ce;
    L_0x0099:
        r6 = new tvg;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r12 = r11.e;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r11 = r6;
        r19 = r12;
        r12 = r10;
        r20 = r15;
        r15 = r4;
        r16 = r5;
        r18 = r7;
        r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r11 = new tui;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r10.getPackageName();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r11.<init>(r6);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r12 = r7.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r12 == 0) goto L_0x00bc;
    L_0x00b7:
        r3.a();	 Catch:{ RuntimeException -> 0x05e3 }
        goto L_0x05d0;
    L_0x00bc:
        r3 = r20.get();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r3 = (defpackage.txg) r3;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r12 = r3 instanceof defpackage.twy;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r12 == 0) goto L_0x0585;
    L_0x00c6:
        r12 = r20;
        r12 = r12.compareAndSet(r3, r11);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r12 != 0) goto L_0x00d0;
    L_0x00ce:
        goto L_0x0585;
    L_0x00d0:
        r12 = new java.util.ArrayList;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r12.<init>();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r13 = r11.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r13 = r13.b();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r13 == 0) goto L_0x00e6;
    L_0x00dd:
        r13 = r11.a;	 Catch:{ RuntimeException -> 0x05e3 }
        r13 = r13.c();	 Catch:{ RuntimeException -> 0x05e3 }
        r12.add(r13);	 Catch:{ RuntimeException -> 0x05e3 }
    L_0x00e6:
        r13 = r11.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r14 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r15 = 28;
        if (r14 < r15) goto L_0x013c;
    L_0x00ee:
        r14 = android.os.StrictMode.ThreadPolicy.LAX;	 Catch:{ RuntimeException -> 0x05e3 }
        r15 = android.os.StrictMode.getThreadPolicy();	 Catch:{ RuntimeException -> 0x05e3 }
        r14 = r14.equals(r15);	 Catch:{ RuntimeException -> 0x05e3 }
        if (r14 == 0) goto L_0x013c;
    L_0x00fa:
        r14 = android.os.StrictMode.VmPolicy.LAX;	 Catch:{ RuntimeException -> 0x05e3 }
        r15 = android.os.StrictMode.getVmPolicy();	 Catch:{ RuntimeException -> 0x05e3 }
        r14 = r14.equals(r15);	 Catch:{ RuntimeException -> 0x05e3 }
        if (r14 == 0) goto L_0x013c;
    L_0x0106:
        r14 = r13.l;	 Catch:{ RuntimeException -> 0x05e3 }
        r14 = r14.l();	 Catch:{ RuntimeException -> 0x05e3 }
        r14 = r14.a();	 Catch:{ RuntimeException -> 0x05e3 }
        if (r14 == 0) goto L_0x013c;
    L_0x0112:
        r14 = r13.l;	 Catch:{ RuntimeException -> 0x05e3 }
        r14 = r14.l();	 Catch:{ RuntimeException -> 0x05e3 }
        r14 = r14.b();	 Catch:{ RuntimeException -> 0x05e3 }
        r14 = (defpackage.tyf) r14;	 Catch:{ RuntimeException -> 0x05e3 }
        r14 = r14.b;	 Catch:{ RuntimeException -> 0x05e3 }
        r14 = r14.a();	 Catch:{ RuntimeException -> 0x05e3 }
        if (r14 == 0) goto L_0x013c;
    L_0x0126:
        r13 = r13.l;	 Catch:{ RuntimeException -> 0x05e3 }
        r13 = r13.l();	 Catch:{ RuntimeException -> 0x05e3 }
        r13 = r13.b();	 Catch:{ RuntimeException -> 0x05e3 }
        r13 = (defpackage.tyf) r13;	 Catch:{ RuntimeException -> 0x05e3 }
        r13 = r13.b;	 Catch:{ RuntimeException -> 0x05e3 }
        r13 = r13.b();	 Catch:{ RuntimeException -> 0x05e3 }
        r13 = (defpackage.tzj) r13;	 Catch:{ RuntimeException -> 0x05e3 }
        r13 = r13.a;	 Catch:{ RuntimeException -> 0x05e3 }
    L_0x013c:
        r13 = r11.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r14 = r13.l;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r14 = r14.g();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r14 = r14.a();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r14 == 0) goto L_0x0192;
    L_0x014a:
        r14 = r13.l;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r14 = r14.g();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r14.b();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r13 = r13.l;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r13 = r13.g();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r13.b();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r13 = r11.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r14 = r13.a();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r15 = r13.i;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r13.j;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = r13.k;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r21 = r10;
        r10 = r13.n;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r22 = r5;
        r5 = r13.l;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r5 = r5.g();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r5 = r5.b();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r5 = (defpackage.tzb) r5;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r5 = r5.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r16 = r2;
        r17 = r1;
        r18 = r10;
        r19 = r5;
        r1 = defpackage.tww.a(r14, r15, r16, r17, r18, r19);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = r13.a(r1);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = (defpackage.tww) r1;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r12.add(r1);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        goto L_0x0196;
    L_0x0192:
        r22 = r5;
        r21 = r10;
    L_0x0196:
        r1 = r11.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r5 = 24;
        if (r2 < r5) goto L_0x023c;
    L_0x019e:
        r2 = r1.l;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r2.j();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r2.a();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r2 == 0) goto L_0x023c;
    L_0x01aa:
        r1 = r1.l;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = r1.j();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = r1.b();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = (defpackage.txr) r1;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = r1.b;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r1 == 0) goto L_0x023c;
    L_0x01ba:
        r1 = r11.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r1.g;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r2 != 0) goto L_0x0237;
    L_0x01c0:
        r2 = defpackage.tuc.class;
        monitor-enter(r2);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r10 = r1.g;	 Catch:{ all -> 0x0233 }
        if (r10 != 0) goto L_0x0231;
    L_0x01c7:
        r24 = r1.a();	 Catch:{ all -> 0x0233 }
        r10 = r1.i;	 Catch:{ all -> 0x0233 }
        r15 = r1.j;	 Catch:{ all -> 0x0233 }
        r14 = r1.k;	 Catch:{ all -> 0x0233 }
        r13 = r1.n;	 Catch:{ all -> 0x0233 }
        r5 = r1.l;	 Catch:{ all -> 0x0233 }
        r5 = r5.j();	 Catch:{ all -> 0x0233 }
        r16 = r13;
        r13 = defpackage.txr.a();	 Catch:{ all -> 0x0233 }
        r17 = r14;
        r14 = r13.a;	 Catch:{ all -> 0x0233 }
        if (r14 == 0) goto L_0x01e6;
    L_0x01e5:
        goto L_0x01ea;
    L_0x01e6:
        r14 = defpackage.txr.a;	 Catch:{ all -> 0x0233 }
        r13.a = r14;	 Catch:{ all -> 0x0233 }
    L_0x01ea:
        r14 = new txr;	 Catch:{ all -> 0x0233 }
        r13 = r13.a;	 Catch:{ all -> 0x0233 }
        r14.<init>(r13);	 Catch:{ all -> 0x0233 }
        r5 = r5.a(r14);	 Catch:{ all -> 0x0233 }
        r5 = (defpackage.txr) r5;	 Catch:{ all -> 0x0233 }
        r29 = new tzz;	 Catch:{ all -> 0x0233 }
        r14 = new uan;	 Catch:{ all -> 0x0233 }
        r14.<init>(r10);	 Catch:{ all -> 0x0233 }
        r18 = defpackage.tuf.a;	 Catch:{ all -> 0x0233 }
        r23 = defpackage.tue.a;	 Catch:{ all -> 0x0233 }
        r13 = r5.d;	 Catch:{ all -> 0x0233 }
        r25 = r13;
        r28 = r16;
        r13 = r29;
        r16 = r14;
        r27 = r17;
        r14 = r15;
        r26 = r15;
        r15 = r16;
        r16 = r18;
        r17 = r23;
        r18 = r25;
        r13.<init>(r14, r15, r16, r17, r18);	 Catch:{ all -> 0x0233 }
        r13 = new tuc;	 Catch:{ all -> 0x0233 }
        r5 = r5.c;	 Catch:{ all -> 0x0233 }
        r30 = 0;
        r23 = r13;
        r25 = r10;
        r23.<init>(r24, r25, r26, r27, r28, r29, r30);	 Catch:{ all -> 0x0233 }
        r5 = r1.a(r13);	 Catch:{ all -> 0x0233 }
        r5 = (defpackage.tuc) r5;	 Catch:{ all -> 0x0233 }
        r1.g = r5;	 Catch:{ all -> 0x0233 }
    L_0x0231:
        monitor-exit(r2);	 Catch:{ all -> 0x0233 }
        goto L_0x0237;
    L_0x0233:
        r0 = move-exception;
        r1 = r0;
        monitor-exit(r2);	 Catch:{ all -> 0x0233 }
        throw r1;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
    L_0x0237:
        r1 = r1.g;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r12.add(r1);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
    L_0x023c:
        r1 = r11.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r1.m;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r2.d;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r2 != 0) goto L_0x0245;
    L_0x0244:
        goto L_0x0272;
    L_0x0245:
        r2 = r1.b;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r2 != 0) goto L_0x026d;
    L_0x0249:
        r2 = defpackage.tvk.class;
        monitor-enter(r2);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r5 = r1.b;	 Catch:{ all -> 0x0269 }
        if (r5 != 0) goto L_0x0267;
    L_0x0250:
        r5 = r1.a();	 Catch:{ all -> 0x0269 }
        r10 = r1.i;	 Catch:{ all -> 0x0269 }
        r13 = r1.j;	 Catch:{ all -> 0x0269 }
        r14 = r1.k;	 Catch:{ all -> 0x0269 }
        r15 = new tvk;	 Catch:{ all -> 0x0269 }
        r15.<init>(r5, r10, r13, r14);	 Catch:{ all -> 0x0269 }
        r5 = r1.a(r15);	 Catch:{ all -> 0x0269 }
        r5 = (defpackage.tvk) r5;	 Catch:{ all -> 0x0269 }
        r1.b = r5;	 Catch:{ all -> 0x0269 }
    L_0x0267:
        monitor-exit(r2);	 Catch:{ all -> 0x0269 }
        goto L_0x026d;
    L_0x0269:
        r0 = move-exception;
        r1 = r0;
        monitor-exit(r2);	 Catch:{ all -> 0x0269 }
        throw r1;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
    L_0x026d:
        r1 = r1.b;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r12.add(r1);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
    L_0x0272:
        r1 = r11.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r10 = 24;
        if (r2 < r10) goto L_0x0316;
    L_0x027a:
        r2 = r1.l;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r2.h();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r2.a();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r2 == 0) goto L_0x0316;
    L_0x0286:
        r2 = r1.l;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r2.h();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r2.b();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = (defpackage.tyt) r2;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r2.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r2 != 0) goto L_0x0298;
    L_0x0296:
        goto L_0x0316;
    L_0x0298:
        r1 = r1.l;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = r1.h();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = r1.b();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = (defpackage.tyt) r1;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = r1.c;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r1 != 0) goto L_0x0316;
    L_0x02a8:
        r1 = r11.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r1.d;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r2 != 0) goto L_0x030c;
    L_0x02ae:
        r2 = defpackage.tuw.class;
        monitor-enter(r2);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r10 = r1.d;	 Catch:{ all -> 0x0308 }
        if (r10 != 0) goto L_0x0302;
    L_0x02b5:
        r30 = new ubz;	 Catch:{ all -> 0x0308 }
        r30.<init>();	 Catch:{ all -> 0x0308 }
        r24 = r1.a();	 Catch:{ all -> 0x0308 }
        r10 = r1.i;	 Catch:{ all -> 0x0308 }
        r13 = r1.j;	 Catch:{ all -> 0x0308 }
        r14 = r1.k;	 Catch:{ all -> 0x0308 }
        r15 = r1.l;	 Catch:{ all -> 0x0308 }
        r15 = r15.h();	 Catch:{ all -> 0x0308 }
        r15 = r15.b();	 Catch:{ all -> 0x0308 }
        r15 = (defpackage.tyt) r15;	 Catch:{ all -> 0x0308 }
        r5 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x0308 }
        r17 = r4;
        r4 = 24;
        if (r5 < r4) goto L_0x02da;
    L_0x02d8:
        r4 = 1;
        goto L_0x02db;
    L_0x02da:
        r4 = 0;
    L_0x02db:
        defpackage.uhy.b(r4);	 Catch:{ all -> 0x0308 }
        r4 = new tuw;	 Catch:{ all -> 0x0308 }
        r5 = r15.b;	 Catch:{ all -> 0x0308 }
        r18 = r9;
        r9 = r15.d;	 Catch:{ all -> 0x0308 }
        r15 = r15.e;	 Catch:{ all -> 0x0308 }
        r23 = r4;
        r25 = r10;
        r26 = r13;
        r27 = r14;
        r28 = r5;
        r29 = r9;
        r31 = r15;
        r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31);	 Catch:{ all -> 0x0308 }
        r4 = r1.a(r4);	 Catch:{ all -> 0x0308 }
        r4 = (defpackage.tuw) r4;	 Catch:{ all -> 0x0308 }
        r1.d = r4;	 Catch:{ all -> 0x0308 }
        goto L_0x0306;
    L_0x0302:
        r17 = r4;
        r18 = r9;
    L_0x0306:
        monitor-exit(r2);	 Catch:{ all -> 0x0308 }
        goto L_0x0310;
    L_0x0308:
        r0 = move-exception;
        r1 = r0;
        monitor-exit(r2);	 Catch:{ all -> 0x0308 }
        throw r1;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
    L_0x030c:
        r17 = r4;
        r18 = r9;
    L_0x0310:
        r1 = r1.d;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r12.add(r1);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        goto L_0x031a;
    L_0x0316:
        r17 = r4;
        r18 = r9;
    L_0x031a:
        r1 = r11.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r4 = 21;
        if (r2 >= r4) goto L_0x0337;
    L_0x0322:
        r2 = 1;
        r1 = new java.lang.Integer[r2];	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r4 = 0;
        r1[r4] = r2;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = "LazyMetricServices";
        r4 = "Service unsupported on SDK %d";
        defpackage.tyv.b(r2, r4, r1);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        goto L_0x03ed;
    L_0x0337:
        r2 = r1.l;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r2.l();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r2.a();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r2 == 0) goto L_0x03ed;
    L_0x0343:
        r2 = r1.l;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r2.l();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r2.b();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = (defpackage.tyf) r2;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r2.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r2.a();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r2 == 0) goto L_0x03ed;
    L_0x0357:
        r1 = r1.l;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = r1.l();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = r1.b();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = (defpackage.tyf) r1;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = r1.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = r1.b();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = (defpackage.tze) r1;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = r1.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r1 == 0) goto L_0x03ed;
    L_0x036f:
        r1 = r11.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r1.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r2 != 0) goto L_0x03df;
    L_0x0375:
        r2 = defpackage.tul.class;
        monitor-enter(r2);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r4 = r1.a;	 Catch:{ all -> 0x03db }
        if (r4 != 0) goto L_0x03d1;
    L_0x037c:
        r24 = r1.a();	 Catch:{ all -> 0x03db }
        r4 = r1.i;	 Catch:{ all -> 0x03db }
        r5 = r1.j;	 Catch:{ all -> 0x03db }
        r9 = r1.k;	 Catch:{ all -> 0x03db }
        r10 = r1.l;	 Catch:{ all -> 0x03db }
        r10 = r10.l();	 Catch:{ all -> 0x03db }
        r10 = r10.b();	 Catch:{ all -> 0x03db }
        r10 = (defpackage.tyf) r10;	 Catch:{ all -> 0x03db }
        r10 = r10.a;	 Catch:{ all -> 0x03db }
        r10 = r10.b();	 Catch:{ all -> 0x03db }
        r10 = (defpackage.tze) r10;	 Catch:{ all -> 0x03db }
        r13 = new tul;	 Catch:{ all -> 0x03db }
        r14 = r10.b;	 Catch:{ all -> 0x03db }
        r15 = r10.e;	 Catch:{ all -> 0x03db }
        r16 = r6;
        r6 = r10.c;	 Catch:{ all -> 0x03db }
        r19 = r3;
        r3 = r10.d;	 Catch:{ all -> 0x03db }
        r36 = r7;
        r35 = r8;
        r7 = r10.f;	 Catch:{ all -> 0x03db }
        r34 = new sds;	 Catch:{ all -> 0x03db }
        r34.<init>();	 Catch:{ all -> 0x03db }
        r23 = r13;
        r25 = r4;
        r26 = r5;
        r27 = r9;
        r28 = r14;
        r29 = r15;
        r30 = r6;
        r31 = r3;
        r32 = r7;
        r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r34);	 Catch:{ all -> 0x03db }
        r3 = r1.a(r13);	 Catch:{ all -> 0x03db }
        r3 = (defpackage.tul) r3;	 Catch:{ all -> 0x03db }
        r1.a = r3;	 Catch:{ all -> 0x03db }
        goto L_0x03d9;
    L_0x03d1:
        r19 = r3;
        r16 = r6;
        r36 = r7;
        r35 = r8;
    L_0x03d9:
        monitor-exit(r2);	 Catch:{ all -> 0x03db }
        goto L_0x03e7;
    L_0x03db:
        r0 = move-exception;
        r1 = r0;
        monitor-exit(r2);	 Catch:{ all -> 0x03db }
        throw r1;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
    L_0x03df:
        r19 = r3;
        r16 = r6;
        r36 = r7;
        r35 = r8;
    L_0x03e7:
        r1 = r1.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r12.add(r1);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        goto L_0x03f5;
    L_0x03ed:
        r19 = r3;
        r16 = r6;
        r36 = r7;
        r35 = r8;
    L_0x03f5:
        r1 = r11.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = r1.h;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = r1.a();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = (defpackage.amqp) r1;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = r1.a();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r1 == 0) goto L_0x0409;
    L_0x0405:
        r1 = defpackage.tzk.c;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = r1.d;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
    L_0x0409:
        r1 = r11.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r1.l;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r2.k();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r2.a();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r2 == 0) goto L_0x0427;
    L_0x0417:
        r2 = r1.l;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r2.k();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r2.b();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = (defpackage.tyx) r2;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r2.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r2 != 0) goto L_0x0432;
    L_0x0427:
        r1 = r1.m;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r1.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r2 != 0) goto L_0x0432;
    L_0x042d:
        r1 = r1.b;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r1 != 0) goto L_0x0432;
    L_0x0431:
        goto L_0x049c;
    L_0x0432:
        r1 = r11.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r1.f;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r2 != 0) goto L_0x048e;
    L_0x0438:
        r2 = defpackage.tvm.class;
        monitor-enter(r2);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r3 = r1.f;	 Catch:{ all -> 0x048a }
        if (r3 != 0) goto L_0x0488;
    L_0x043f:
        r31 = r1.a();	 Catch:{ all -> 0x048a }
        r3 = r1.i;	 Catch:{ all -> 0x048a }
        r4 = r1.m;	 Catch:{ all -> 0x048a }
        r4 = r4.b;	 Catch:{ all -> 0x048a }
        r5 = r1.j;	 Catch:{ all -> 0x048a }
        r6 = r1.k;	 Catch:{ all -> 0x048a }
        r7 = r1.l;	 Catch:{ all -> 0x048a }
        r7 = r7.k();	 Catch:{ all -> 0x048a }
        r8 = r1.i;	 Catch:{ all -> 0x048a }
        r27 = defpackage.tty.a(r8);	 Catch:{ all -> 0x048a }
        r8 = new tyx;	 Catch:{ all -> 0x048a }
        r8.<init>();	 Catch:{ all -> 0x048a }
        r7 = r7.a(r8);	 Catch:{ all -> 0x048a }
        r7 = (defpackage.tyx) r7;	 Catch:{ all -> 0x048a }
        r8 = new tvm;	 Catch:{ all -> 0x048a }
        r9 = r7.b;	 Catch:{ all -> 0x048a }
        r10 = new ucf;	 Catch:{ all -> 0x048a }
        r7 = r7.c;	 Catch:{ all -> 0x048a }
        r10.<init>(r7);	 Catch:{ all -> 0x048a }
        r23 = r8;
        r24 = r3;
        r25 = r4;
        r26 = r9;
        r28 = r5;
        r29 = r6;
        r30 = r10;
        r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31);	 Catch:{ all -> 0x048a }
        r3 = r1.a(r8);	 Catch:{ all -> 0x048a }
        r3 = (defpackage.tvm) r3;	 Catch:{ all -> 0x048a }
        r1.f = r3;	 Catch:{ all -> 0x048a }
    L_0x0488:
        monitor-exit(r2);	 Catch:{ all -> 0x048a }
        goto L_0x048e;
    L_0x048a:
        r0 = move-exception;
        r1 = r0;
        monitor-exit(r2);	 Catch:{ all -> 0x048a }
        throw r1;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
    L_0x048e:
        r1 = r1.f;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        monitor-enter(r1);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r1.e;	 Catch:{ all -> 0x0581 }
        r2.a();	 Catch:{ all -> 0x0581 }
        r2 = r1.d;	 Catch:{ all -> 0x0581 }
        r2.a(r1);	 Catch:{ all -> 0x0581 }
        monitor-exit(r1);	 Catch:{ all -> 0x0581 }
    L_0x049c:
        r1 = r11.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r1.l;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r2.m();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r2.a();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r2 == 0) goto L_0x0511;
    L_0x04aa:
        r2 = r1.l;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r2.m();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r2.b();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = (defpackage.tyz) r2;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r2.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r2 != 0) goto L_0x04bb;
    L_0x04ba:
        goto L_0x0511;
    L_0x04bb:
        r2 = r1.i;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = defpackage.twg.a(r2);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r2 == 0) goto L_0x0511;
    L_0x04c3:
        r1 = r1.i;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = defpackage.ubq.a(r1);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r1 == 0) goto L_0x0511;
    L_0x04cb:
        r1 = r11.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r1.c;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r2 != 0) goto L_0x04f6;
    L_0x04d1:
        r2 = defpackage.twg.class;
        monitor-enter(r2);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r3 = r1.c;	 Catch:{ all -> 0x04f2 }
        if (r3 != 0) goto L_0x04f0;
    L_0x04d8:
        r3 = r1.a();	 Catch:{ all -> 0x04f2 }
        r4 = r1.i;	 Catch:{ all -> 0x04f2 }
        r5 = r1.j;	 Catch:{ all -> 0x04f2 }
        r6 = r1.k;	 Catch:{ all -> 0x04f2 }
        r7 = r1.n;	 Catch:{ all -> 0x04f2 }
        r3 = defpackage.twg.a(r3, r4, r5, r6, r7);	 Catch:{ all -> 0x04f2 }
        r3 = r1.a(r3);	 Catch:{ all -> 0x04f2 }
        r3 = (defpackage.twg) r3;	 Catch:{ all -> 0x04f2 }
        r1.c = r3;	 Catch:{ all -> 0x04f2 }
    L_0x04f0:
        monitor-exit(r2);	 Catch:{ all -> 0x04f2 }
        goto L_0x04f6;
    L_0x04f2:
        r0 = move-exception;
        r1 = r0;
        monitor-exit(r2);	 Catch:{ all -> 0x04f2 }
        throw r1;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
    L_0x04f6:
        r1 = r1.c;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r1.c;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r2 != 0) goto L_0x0511;
    L_0x04fc:
        r2 = r1.e;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r3 = r1.o;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2.a(r3);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r1.e;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r3 = r1.n;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2.a(r3);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r1.e;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = r1.p;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2.a(r1);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
    L_0x0511:
        r1 = r12.size();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = 0;
    L_0x0516:
        if (r2 >= r1) goto L_0x053c;
    L_0x0518:
        r3 = r12.get(r2);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r3 = (defpackage.tzh) r3;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r3.e();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        monitor-enter(r35);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r4 = r35;
        r5 = r4.b;	 Catch:{ all -> 0x0538 }
        if (r5 != 0) goto L_0x052f;
    L_0x0528:
        r5 = r4.a;	 Catch:{ all -> 0x0538 }
        r5.add(r3);	 Catch:{ all -> 0x0538 }
        monitor-exit(r4);	 Catch:{ all -> 0x0538 }
        goto L_0x0533;
    L_0x052f:
        monitor-exit(r4);	 Catch:{ all -> 0x0538 }
        r3.f();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
    L_0x0533:
        r2 = r2 + 1;
        r35 = r4;
        goto L_0x0516;
    L_0x0538:
        r0 = move-exception;
        r1 = r0;
        monitor-exit(r4);	 Catch:{ all -> 0x0538 }
        throw r1;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
    L_0x053c:
        r7 = r36;
        r1 = r7.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r1 != 0) goto L_0x057d;
    L_0x0542:
        r3 = r19;
        r3 = (defpackage.twy) r3;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r3.a(r11);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = r3.d;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        monitor-enter(r1);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r3.a = r11;	 Catch:{ all -> 0x0579 }
        monitor-exit(r1);	 Catch:{ all -> 0x0579 }
        r3.a(r11);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = new txm;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r16;
        r1.<init>(r2);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = r18;
        r3 = r2.b;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        monitor-enter(r3);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r4 = r2.c;	 Catch:{ all -> 0x0575 }
        if (r4 == 0) goto L_0x056e;
    L_0x0562:
        r2 = r2.a;	 Catch:{ all -> 0x0575 }
        r2 = r2.a();	 Catch:{ all -> 0x0575 }
        r2 = (java.util.concurrent.ScheduledExecutorService) r2;	 Catch:{ all -> 0x0575 }
        r2.submit(r1);	 Catch:{ all -> 0x0575 }
        goto L_0x0573;
    L_0x056e:
        r2 = r2.b;	 Catch:{ all -> 0x0575 }
        r2.add(r1);	 Catch:{ all -> 0x0575 }
    L_0x0573:
        monitor-exit(r3);	 Catch:{ all -> 0x0575 }
        goto L_0x057d;
    L_0x0575:
        r0 = move-exception;
        r1 = r0;
        monitor-exit(r3);	 Catch:{ all -> 0x0575 }
        throw r1;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
    L_0x0579:
        r0 = move-exception;
        r2 = r0;
        monitor-exit(r1);	 Catch:{ all -> 0x0579 }
        throw r2;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
    L_0x057d:
        r19.a();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        goto L_0x0598;
    L_0x0581:
        r0 = move-exception;
        r2 = r0;
        monitor-exit(r1);	 Catch:{ all -> 0x0581 }
        throw r2;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
    L_0x0585:
        r17 = r4;
        r22 = r5;
        r21 = r10;
        r1 = "Primes";
        r2 = "Primes shutdown during initialization";
        r3 = 0;
        r4 = new java.lang.Object[r3];	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        defpackage.tyv.b(r1, r2, r4);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r11.a();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
    L_0x0598:
        r1 = r17.k();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = r1.a();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r1 != 0) goto L_0x05b8;
    L_0x05a2:
        r1 = r17.m();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1 = r1.a();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r1 == 0) goto L_0x05ad;
    L_0x05ac:
        goto L_0x05b8;
    L_0x05ad:
        r5 = r22;
        r1 = r5.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r1 != 0) goto L_0x05b8;
    L_0x05b3:
        r1 = r5.b;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        if (r1 != 0) goto L_0x05b8;
    L_0x05b7:
        goto L_0x05be;
    L_0x05b8:
        defpackage.tyu.b(r21);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        defpackage.tyu.d(r21);	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
    L_0x05be:
        r1 = defpackage.tyo.a;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r2 = defpackage.tup.b();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        r1.e = r2;	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        goto L_0x05ce;
    L_0x05c7:
        r3.a();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
        goto L_0x05ce;
    L_0x05cb:
        r3.a();	 Catch:{ RuntimeException -> 0x05dc, all -> 0x05d8 }
    L_0x05ce:
        r1 = r37;
    L_0x05d0:
        r2 = r1.a;
        r2 = r2.d;
        r2.countDown();
        return;
    L_0x05d8:
        r0 = move-exception;
        r1 = r37;
        goto L_0x05e1;
    L_0x05dc:
        r0 = move-exception;
        r1 = r37;
        goto L_0x05e4;
    L_0x05e0:
        r0 = move-exception;
    L_0x05e1:
        r2 = r0;
        goto L_0x05fc;
    L_0x05e3:
        r0 = move-exception;
    L_0x05e4:
        r2 = r0;
        r3 = "Primes";
        r4 = "Primes failed to initialized in the background";
        r5 = 0;
        r5 = new java.lang.Object[r5];	 Catch:{ all -> 0x05e0 }
        defpackage.tyv.b(r3, r4, r2, r5);	 Catch:{ all -> 0x05e0 }
        r2 = r1.a;	 Catch:{ all -> 0x05e0 }
        r2.a();	 Catch:{ all -> 0x05e0 }
        r2 = r1.a;
        r2 = r2.d;
        r2.countDown();
        return;
    L_0x05fc:
        r3 = r1.a;
        r3 = r3.d;
        r3.countDown();
        goto L_0x0605;
    L_0x0604:
        throw r2;
    L_0x0605:
        goto L_0x0604;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txk.run():void");
    }
}
