package defpackage;

/* renamed from: bbzs */
final class bbzs implements bbnc, bbys {
    public final bbzp a;
    public boolean b;
    public boolean c;
    public bbyp d;
    public volatile boolean e;
    public long f;
    private final bbmo g;
    private boolean h;

    bbzs(bbmo bbmo, bbzp bbzp) {
        this.g = bbmo;
        this.a = bbzp;
    }

    public final void bK_() {
        if (!this.e) {
            this.e = true;
            this.a.a(this);
        }
    }

    public final boolean c() {
        return this.e;
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:24:0x002f, code skipped:
            r3.h = true;
     */
    public final void a(java.lang.Object r4, long r5) {
        /*
        r3 = this;
        r0 = r3.e;
        if (r0 != 0) goto L_0x0038;
    L_0x0004:
        r0 = r3.h;
        if (r0 != 0) goto L_0x0035;
    L_0x0008:
        monitor-enter(r3);
        r0 = r3.e;	 Catch:{ all -> 0x0032 }
        if (r0 == 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r3);	 Catch:{ all -> 0x0032 }
        return;
    L_0x000f:
        r0 = r3.f;	 Catch:{ all -> 0x0032 }
        r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1));
        if (r2 != 0) goto L_0x0017;
    L_0x0015:
        monitor-exit(r3);	 Catch:{ all -> 0x0032 }
        return;
    L_0x0017:
        r5 = r3.c;	 Catch:{ all -> 0x0032 }
        if (r5 == 0) goto L_0x002b;
    L_0x001b:
        r5 = r3.d;	 Catch:{ all -> 0x0032 }
        if (r5 != 0) goto L_0x0026;
    L_0x001f:
        r5 = new bbyp;	 Catch:{ all -> 0x0032 }
        r5.<init>();	 Catch:{ all -> 0x0032 }
        r3.d = r5;	 Catch:{ all -> 0x0032 }
    L_0x0026:
        r5.a(r4);	 Catch:{ all -> 0x0032 }
        monitor-exit(r3);	 Catch:{ all -> 0x0032 }
        return;
    L_0x002b:
        r5 = 1;
        r3.b = r5;	 Catch:{ all -> 0x0032 }
        monitor-exit(r3);	 Catch:{ all -> 0x0032 }
        r3.h = r5;
        goto L_0x0035;
    L_0x0032:
        r4 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0032 }
        throw r4;
    L_0x0035:
        r3.a(r4);
    L_0x0038:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbzs.a(java.lang.Object, long):void");
    }

    public final boolean a(Object obj) {
        if (!this.e) {
            bbmo bbmo = this.g;
            if (obj == bbyy.a) {
                bbmo.a();
            } else if (obj instanceof bbza) {
                bbmo.a(((bbza) obj).a);
            } else {
                bbmo.b_(obj);
                return false;
            }
        }
        return true;
    }
}
