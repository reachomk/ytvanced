package defpackage;

/* renamed from: twq */
final /* synthetic */ class twq implements Runnable {
    private final twn a;
    private final twm b;

    twq(twn twn, twm twm) {
        this.a = twn;
        this.b = twm;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0022 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:10|11) */
    /* JADX WARNING: Missing block: B:11:?, code skipped:
            defpackage.tyv.d("NetworkCapture", "Failed to get network type, Please add: android.permission.ACCESS_NETWORK_STATE to AndroidManifest.xml", new java.lang.Object[0]);
     */
    public final void run() {
        /*
        r6 = this;
        r0 = r6.a;
        r1 = r6.b;
        r2 = r0.a;	 Catch:{ all -> 0x0072 }
        r3 = defpackage.ucu.a(r2);	 Catch:{ all -> 0x0072 }
        r1.j = r3;	 Catch:{ all -> 0x0072 }
        r3 = -1;
        r4 = "connectivity";
        r2 = r2.getSystemService(r4);	 Catch:{ SecurityException -> 0x0022 }
        r2 = (android.net.ConnectivityManager) r2;	 Catch:{ SecurityException -> 0x0022 }
        if (r2 == 0) goto L_0x002c;
    L_0x0017:
        r2 = r2.getActiveNetworkInfo();	 Catch:{ SecurityException -> 0x0022 }
        if (r2 == 0) goto L_0x002c;
    L_0x001d:
        r3 = r2.getType();	 Catch:{ SecurityException -> 0x0022 }
        goto L_0x002c;
    L_0x0022:
        r2 = "NetworkCapture";
        r4 = "Failed to get network type, Please add: android.permission.ACCESS_NETWORK_STATE to AndroidManifest.xml";
        r5 = 0;
        r5 = new java.lang.Object[r5];	 Catch:{ all -> 0x0072 }
        defpackage.tyv.d(r2, r4, r5);	 Catch:{ all -> 0x0072 }
    L_0x002c:
        r2 = defpackage.bcbu.a(r3);	 Catch:{ all -> 0x0072 }
        if (r2 == 0) goto L_0x0033;
    L_0x0032:
        goto L_0x0034;
    L_0x0033:
        r2 = 1;
    L_0x0034:
        r1.o = r2;	 Catch:{ all -> 0x0072 }
        r2 = r0.d;	 Catch:{ all -> 0x0072 }
        monitor-enter(r2);	 Catch:{ all -> 0x0072 }
        r3 = r0.g;	 Catch:{ all -> 0x006f }
        r3.add(r1);	 Catch:{ all -> 0x006f }
        r1 = r0.g;	 Catch:{ all -> 0x006f }
        r1 = r1.size();	 Catch:{ all -> 0x006f }
        r3 = r0.e;	 Catch:{ all -> 0x006f }
        if (r1 < r3) goto L_0x005c;
    L_0x0048:
        r1 = r0.g;	 Catch:{ all -> 0x006f }
        r3 = r1.size();	 Catch:{ all -> 0x006f }
        r3 = new defpackage.twm[r3];	 Catch:{ all -> 0x006f }
        r1 = r1.toArray(r3);	 Catch:{ all -> 0x006f }
        r1 = (defpackage.twm[]) r1;	 Catch:{ all -> 0x006f }
        r3 = r0.g;	 Catch:{ all -> 0x006f }
        r3.clear();	 Catch:{ all -> 0x006f }
        goto L_0x005d;
    L_0x005c:
        r1 = 0;
    L_0x005d:
        monitor-exit(r2);	 Catch:{ all -> 0x006f }
        if (r1 == 0) goto L_0x0069;
    L_0x0060:
        r2 = r0.f;	 Catch:{ all -> 0x0072 }
        r1 = r2.a(r1);	 Catch:{ all -> 0x0072 }
        r0.a(r1);	 Catch:{ all -> 0x0072 }
    L_0x0069:
        r0 = r0.h;
        r0.decrementAndGet();
        return;
    L_0x006f:
        r1 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x006f }
        throw r1;	 Catch:{ all -> 0x0072 }
    L_0x0072:
        r1 = move-exception;
        r0 = r0.h;
        r0.decrementAndGet();
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.twq.run():void");
    }
}
