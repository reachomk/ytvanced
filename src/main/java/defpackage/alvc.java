package defpackage;

/* renamed from: alvc */
public final class alvc extends wxo {
    private final alxx a;
    private final bcaa b;
    private final bcaa c;
    private final amuu d = new amuu();
    private final amuu e = new amuu();

    public alvc(alxx alxx, bcaa bcaa, bcaa bcaa2) {
        this.a = alxx;
        this.b = bcaa;
        this.c = bcaa2;
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01cd  */
    public final void a() {
        /*
        r9 = this;
        r0 = r9.a;
        r0 = r0.get();
        r0 = (defpackage.aydm) r0;
        r1 = r0.b;
        if (r1 != 0) goto L_0x000e;
    L_0x000c:
        goto L_0x0229;
    L_0x000e:
        r1 = r9.c;
        r1 = r1.get();
        r1 = (defpackage.alwl) r1;
        r2 = r9.d;
        r2 = r2.b();
        r2 = r2.entrySet();
        r2 = r2.iterator();
    L_0x0024:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x0057;
    L_0x002a:
        r3 = r2.next();
        r3 = (java.util.Map.Entry) r3;
        r4 = r3.getKey();
        r4 = (java.lang.String) r4;
        r3 = r3.getValue();
        r3 = (defpackage.bcaa) r3;
        r3 = r3.get();
        r3 = (defpackage.alxr) r3;
        r5 = r1.q;
        r5 = r5.get();
        r5 = (defpackage.alwv) r5;
        r6 = r5.a;
        monitor-enter(r6);
        r5 = r5.b;	 Catch:{ all -> 0x0054 }
        r5.put(r4, r3);	 Catch:{ all -> 0x0054 }
        monitor-exit(r6);	 Catch:{ all -> 0x0054 }
        goto L_0x0024;
    L_0x0054:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0054 }
        throw r0;
    L_0x0057:
        r2 = r9.e;
        r2 = r2.b();
        r2 = r2.entrySet();
        r2 = r2.iterator();
    L_0x0065:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x0098;
    L_0x006b:
        r3 = r2.next();
        r3 = (java.util.Map.Entry) r3;
        r4 = r3.getKey();
        r4 = (java.lang.String) r4;
        r3 = r3.getValue();
        r3 = (defpackage.bcaa) r3;
        r3 = r3.get();
        r3 = (defpackage.alvy) r3;
        r5 = r1.p;
        r5 = r5.get();
        r5 = (defpackage.alws) r5;
        r6 = r5.a;
        monitor-enter(r6);
        r5 = r5.b;	 Catch:{ all -> 0x0095 }
        r5.put(r4, r3);	 Catch:{ all -> 0x0095 }
        monitor-exit(r6);	 Catch:{ all -> 0x0095 }
        goto L_0x0065;
    L_0x0095:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0095 }
        throw r0;
    L_0x0098:
        r2 = r1.j;
        monitor-enter(r2);
        r3 = r0.b;	 Catch:{ all -> 0x0242 }
        r4 = 1;
        if (r3 == 0) goto L_0x01de;
    L_0x00a0:
        r3 = r1.p;	 Catch:{ all -> 0x0242 }
        r3 = r3.get();	 Catch:{ all -> 0x0242 }
        r3 = (defpackage.alws) r3;	 Catch:{ all -> 0x0242 }
        r5 = r3.a;	 Catch:{ all -> 0x0242 }
        monitor-enter(r5);	 Catch:{ all -> 0x0242 }
        r6 = r3.b;	 Catch:{ all -> 0x01db }
        r6 = r6.values();	 Catch:{ all -> 0x01db }
        r6 = r6.iterator();	 Catch:{ all -> 0x01db }
    L_0x00b5:
        r7 = r6.hasNext();	 Catch:{ all -> 0x01db }
        if (r7 == 0) goto L_0x00d1;
    L_0x00bb:
        r7 = r6.next();	 Catch:{ all -> 0x01db }
        r7 = (defpackage.alvy) r7;	 Catch:{ all -> 0x01db }
        r7.a(r0);	 Catch:{ all -> 0x01db }
        r8 = r7 instanceof defpackage.alvu;	 Catch:{ all -> 0x01db }
        if (r8 == 0) goto L_0x00b5;
    L_0x00c8:
        r7 = r7.a();	 Catch:{ all -> 0x01db }
        if (r7 == 0) goto L_0x00b5;
    L_0x00ce:
        r3.c = r4;	 Catch:{ all -> 0x01db }
        goto L_0x00b5;
    L_0x00d1:
        monitor-exit(r5);	 Catch:{ all -> 0x01db }
        r3 = r1.q;	 Catch:{ all -> 0x0242 }
        r3 = r3.get();	 Catch:{ all -> 0x0242 }
        r3 = (defpackage.alwv) r3;	 Catch:{ all -> 0x0242 }
        r5 = r3.a;	 Catch:{ all -> 0x0242 }
        monitor-enter(r5);	 Catch:{ all -> 0x0242 }
        r3 = r3.b;	 Catch:{ all -> 0x01d8 }
        r3 = r3.values();	 Catch:{ all -> 0x01d8 }
        r3 = r3.iterator();	 Catch:{ all -> 0x01d8 }
    L_0x00e7:
        r6 = r3.hasNext();	 Catch:{ all -> 0x01d8 }
        if (r6 == 0) goto L_0x00f7;
    L_0x00ed:
        r6 = r3.next();	 Catch:{ all -> 0x01d8 }
        r6 = (defpackage.alxr) r6;	 Catch:{ all -> 0x01d8 }
        r6.a(r0);	 Catch:{ all -> 0x01d8 }
        goto L_0x00e7;
    L_0x00f7:
        monitor-exit(r5);	 Catch:{ all -> 0x01d8 }
        r3 = r1.j;	 Catch:{ all -> 0x0242 }
        monitor-enter(r3);	 Catch:{ all -> 0x0242 }
        r5 = r1.a;	 Catch:{ all -> 0x01d5 }
        if (r5 == 0) goto L_0x0101;
    L_0x00ff:
        goto L_0x018d;
    L_0x0101:
        r5 = r1.l;	 Catch:{ all -> 0x01d5 }
        r6 = defpackage.alwg.class;
        r7 = new alwk;	 Catch:{ all -> 0x01d5 }
        r7.<init>(r1);	 Catch:{ all -> 0x01d5 }
        r5 = r5.a(r1, r6, r7);	 Catch:{ all -> 0x01d5 }
        r1.b = r5;	 Catch:{ all -> 0x01d5 }
        r5 = r1.l;	 Catch:{ all -> 0x01d5 }
        r6 = defpackage.alwj.class;
        r7 = new alwn;	 Catch:{ all -> 0x01d5 }
        r7.<init>(r1);	 Catch:{ all -> 0x01d5 }
        r5 = r5.a(r1, r6, r7);	 Catch:{ all -> 0x01d5 }
        r1.c = r5;	 Catch:{ all -> 0x01d5 }
        r5 = r1.l;	 Catch:{ all -> 0x01d5 }
        r6 = defpackage.alwi.class;
        r7 = new alwm;	 Catch:{ all -> 0x01d5 }
        r7.<init>(r1);	 Catch:{ all -> 0x01d5 }
        r5 = r5.a(r1, r6, r7);	 Catch:{ all -> 0x01d5 }
        r1.d = r5;	 Catch:{ all -> 0x01d5 }
        r5 = r1.e;	 Catch:{ all -> 0x01d5 }
        if (r5 != 0) goto L_0x014e;
    L_0x0132:
        r5 = new alwq;	 Catch:{ all -> 0x01d5 }
        r5.<init>(r1);	 Catch:{ all -> 0x01d5 }
        r1.f = r5;	 Catch:{ all -> 0x01d5 }
        r5 = new alwt;	 Catch:{ all -> 0x01d5 }
        r5.<init>(r1);	 Catch:{ all -> 0x01d5 }
        r1.g = r5;	 Catch:{ all -> 0x01d5 }
        r5 = new tub;	 Catch:{ all -> 0x01d5 }
        r5.<init>();	 Catch:{ all -> 0x01d5 }
        r1.e = r5;	 Catch:{ all -> 0x01d5 }
        r5 = r1.e;	 Catch:{ all -> 0x01d5 }
        r6 = r1.k;	 Catch:{ all -> 0x01d5 }
        r5.a(r6);	 Catch:{ all -> 0x01d5 }
    L_0x014e:
        r5 = r1.e;	 Catch:{ all -> 0x01d5 }
        r6 = r1.f;	 Catch:{ all -> 0x01d5 }
        r5.a(r6);	 Catch:{ all -> 0x01d5 }
        r5 = r1.e;	 Catch:{ all -> 0x01d5 }
        r6 = r1.g;	 Catch:{ all -> 0x01d5 }
        r5.a(r6);	 Catch:{ all -> 0x01d5 }
        r5 = r1.k;	 Catch:{ all -> 0x01d5 }
        r6 = new android.content.IntentFilter;	 Catch:{ all -> 0x01d5 }
        r7 = "android.intent.action.BATTERY_CHANGED";
        r6.<init>(r7);	 Catch:{ all -> 0x01d5 }
        r7 = 0;
        r5 = r5.registerReceiver(r7, r6);	 Catch:{ all -> 0x01d5 }
        r6 = r1.o;	 Catch:{ all -> 0x01d5 }
        r6 = r6.get();	 Catch:{ all -> 0x01d5 }
        r6 = (defpackage.alwe) r6;	 Catch:{ all -> 0x01d5 }
        r6.a(r5);	 Catch:{ all -> 0x01d5 }
        r5 = new android.content.IntentFilter;	 Catch:{ all -> 0x01d5 }
        r6 = "android.intent.action.SCREEN_OFF";
        r5.<init>(r6);	 Catch:{ all -> 0x01d5 }
        r6 = "android.intent.action.SCREEN_ON";
        r5.addAction(r6);	 Catch:{ all -> 0x01d5 }
        r6 = "android.intent.action.BATTERY_CHANGED";
        r5.addAction(r6);	 Catch:{ all -> 0x01d5 }
        r6 = r1.k;	 Catch:{ all -> 0x01d5 }
        r6.registerReceiver(r1, r5);	 Catch:{ all -> 0x01d5 }
        r1.a = r4;	 Catch:{ all -> 0x01d5 }
    L_0x018d:
        monitor-exit(r3);	 Catch:{ all -> 0x01d5 }
        r3 = r0.a;	 Catch:{ all -> 0x0242 }
        r3 = r3 & 64;
        if (r3 == 0) goto L_0x019f;
    L_0x0194:
        r3 = r0.e;	 Catch:{ all -> 0x0242 }
        if (r3 != 0) goto L_0x019a;
    L_0x0198:
        r3 = defpackage.ayde.d;	 Catch:{ all -> 0x0242 }
    L_0x019a:
        r3 = r3.c;	 Catch:{ all -> 0x0242 }
        if (r3 != 0) goto L_0x019f;
    L_0x019e:
        goto L_0x01b0;
    L_0x019f:
        r3 = r1.r;	 Catch:{ all -> 0x0242 }
        r3 = r3.get();	 Catch:{ all -> 0x0242 }
        r3 = (defpackage.alxu) r3;	 Catch:{ all -> 0x0242 }
        r4 = java.lang.Thread.getDefaultUncaughtExceptionHandler();	 Catch:{ all -> 0x0242 }
        r3.b = r4;	 Catch:{ all -> 0x0242 }
        java.lang.Thread.setDefaultUncaughtExceptionHandler(r3);	 Catch:{ all -> 0x0242 }
    L_0x01b0:
        r3 = r0.a;	 Catch:{ all -> 0x0242 }
        r3 = r3 & 2;
        if (r3 == 0) goto L_0x01c1;
    L_0x01b6:
        r0 = r0.c;	 Catch:{ all -> 0x0242 }
        if (r0 != 0) goto L_0x01bc;
    L_0x01ba:
        r0 = defpackage.aydg.c;	 Catch:{ all -> 0x0242 }
    L_0x01bc:
        r0 = r0.b;	 Catch:{ all -> 0x0242 }
        r3 = (long) r0;	 Catch:{ all -> 0x0242 }
        r1.h = r3;	 Catch:{ all -> 0x0242 }
    L_0x01c1:
        r0 = r1.k;	 Catch:{ all -> 0x0242 }
        r0 = r0.getApplicationContext();	 Catch:{ all -> 0x0242 }
        r0 = defpackage.ucv.b(r0);	 Catch:{ all -> 0x0242 }
        if (r0 == 0) goto L_0x01d1;
    L_0x01cd:
        r1.c();	 Catch:{ all -> 0x0242 }
        goto L_0x0228;
    L_0x01d1:
        r1.b();	 Catch:{ all -> 0x0242 }
        goto L_0x0228;
    L_0x01d5:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x01d5 }
        throw r0;	 Catch:{ all -> 0x0242 }
    L_0x01d8:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x01d8 }
        throw r0;	 Catch:{ all -> 0x0242 }
    L_0x01db:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x01db }
        throw r0;	 Catch:{ all -> 0x0242 }
    L_0x01de:
        r0 = r1.j;	 Catch:{ all -> 0x0242 }
        monitor-enter(r0);	 Catch:{ all -> 0x0242 }
        r3 = r1.a;	 Catch:{ all -> 0x023f }
        r5 = 0;
        if (r3 != 0) goto L_0x01e7;
    L_0x01e6:
        goto L_0x0222;
    L_0x01e7:
        r3 = r1.l;	 Catch:{ all -> 0x023f }
        r6 = new defpackage.xcq[r4];	 Catch:{ all -> 0x023f }
        r7 = r1.b;	 Catch:{ all -> 0x023f }
        r6[r5] = r7;	 Catch:{ all -> 0x023f }
        r3.a(r6);	 Catch:{ all -> 0x023f }
        r3 = r1.l;	 Catch:{ all -> 0x023f }
        r6 = new defpackage.xcq[r4];	 Catch:{ all -> 0x023f }
        r7 = r1.c;	 Catch:{ all -> 0x023f }
        r6[r5] = r7;	 Catch:{ all -> 0x023f }
        r3.a(r6);	 Catch:{ all -> 0x023f }
        r3 = r1.l;	 Catch:{ all -> 0x023f }
        r4 = new defpackage.xcq[r4];	 Catch:{ all -> 0x023f }
        r6 = r1.d;	 Catch:{ all -> 0x023f }
        r4[r5] = r6;	 Catch:{ all -> 0x023f }
        r3.a(r4);	 Catch:{ all -> 0x023f }
        r3 = r1.k;	 Catch:{ all -> 0x023f }
        r3.unregisterReceiver(r1);	 Catch:{ all -> 0x023f }
        r3 = r1.e;	 Catch:{ all -> 0x023f }
        r4 = r1.k;	 Catch:{ all -> 0x023f }
        r3.b(r4);	 Catch:{ all -> 0x023f }
        r3 = r1.e;	 Catch:{ all -> 0x023f }
        r4 = r1.f;	 Catch:{ all -> 0x023f }
        r3.b(r4);	 Catch:{ all -> 0x023f }
        r3 = r1.e;	 Catch:{ all -> 0x023f }
        r4 = r1.g;	 Catch:{ all -> 0x023f }
        r3.b(r4);	 Catch:{ all -> 0x023f }
    L_0x0222:
        r1.a();	 Catch:{ all -> 0x023f }
        r1.a = r5;	 Catch:{ all -> 0x023f }
        monitor-exit(r0);	 Catch:{ all -> 0x023f }
    L_0x0228:
        monitor-exit(r2);	 Catch:{ all -> 0x0242 }
    L_0x0229:
        r0 = r9.b;
        r0 = r0.get();
        r0 = (defpackage.alvi) r0;
        r1 = r0.a;
        r3 = 0;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 <= 0) goto L_0x023e;
    L_0x0239:
        r0 = r0.e;
        r0.start();
    L_0x023e:
        return;
    L_0x023f:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x023f }
        throw r1;	 Catch:{ all -> 0x0242 }
    L_0x0242:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0242 }
        goto L_0x0246;
    L_0x0245:
        throw r0;
    L_0x0246:
        goto L_0x0245;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alvc.a():void");
    }

    public final alvc a(String str, bcaa bcaa) {
        if (this.i == 1) {
            this.d.b(str, bcaa);
            return this;
        }
        throw new IllegalStateException("Transmitter cannot be added once SystemInitializer has been initialized");
    }

    public final alvc b(String str, bcaa bcaa) {
        if (this.i == 1) {
            this.e.b(str, bcaa);
            return this;
        }
        throw new IllegalStateException("Capturer cannot be added once SystemInitializer has been initialized ");
    }
}
