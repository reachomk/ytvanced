package defpackage;

/* renamed from: ahm */
final class ahm {
    private ahp a;

    ahm() {
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized ahp a() {
        ahp ahp = this.a;
        if (ahp == null) {
            return null;
        }
        this.a = ahp.a;
        return ahp;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(ahp ahp) {
        ahp.a = this.a;
        this.a = ahp;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b(ahp ahp) {
        ahp ahp2 = this.a;
        if (ahp2 != null) {
            while (true) {
                ahp ahp3 = ahp2.a;
                if (ahp3 != null) {
                    ahp2 = ahp3;
                } else {
                    ahp2.a = ahp;
                    return;
                }
            }
        }
        this.a = ahp;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0013  */
    public final synchronized void a(int r5) {
        /*
        r4 = this;
        monitor-enter(r4);
    L_0x0001:
        r0 = r4.a;	 Catch:{ all -> 0x0028 }
        if (r0 == 0) goto L_0x0011;
    L_0x0005:
        r1 = r0.b;	 Catch:{ all -> 0x0028 }
        if (r1 != r5) goto L_0x0011;
    L_0x0009:
        r1 = r0.a;	 Catch:{ all -> 0x0028 }
        r4.a = r1;	 Catch:{ all -> 0x0028 }
        r0.a();	 Catch:{ all -> 0x0028 }
        goto L_0x0001;
    L_0x0011:
        if (r0 == 0) goto L_0x0026;
    L_0x0013:
        r1 = r0.a;	 Catch:{ all -> 0x0028 }
    L_0x0015:
        if (r1 == 0) goto L_0x0026;
    L_0x0017:
        r2 = r1.a;	 Catch:{ all -> 0x0028 }
        r3 = r1.b;	 Catch:{ all -> 0x0028 }
        if (r3 != r5) goto L_0x0023;
    L_0x001d:
        r0.a = r2;	 Catch:{ all -> 0x0028 }
        r1.a();	 Catch:{ all -> 0x0028 }
        goto L_0x0024;
    L_0x0023:
        r0 = r1;
    L_0x0024:
        r1 = r2;
        goto L_0x0015;
    L_0x0026:
        monitor-exit(r4);
        return;
    L_0x0028:
        r5 = move-exception;
        monitor-exit(r4);
        goto L_0x002c;
    L_0x002b:
        throw r5;
    L_0x002c:
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahm.a(int):void");
    }
}
