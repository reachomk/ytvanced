package defpackage;

/* renamed from: tuy */
final class tuy implements tva {
    private final /* synthetic */ tvd a;
    private final /* synthetic */ tuw b;

    tuy(tuw tuw, tvd tvd) {
        this.b = tuw;
        this.a = tvd;
    }

    /* JADX WARNING: Missing block: B:28:0x0062, code skipped:
            return;
     */
    public final void a(java.lang.String r7) {
        /*
        r6 = this;
        r0 = r6.b;
        r1 = r0.e;
        monitor-enter(r1);
        r2 = r0.e;	 Catch:{ all -> 0x0070 }
        r2 = r2.containsKey(r7);	 Catch:{ all -> 0x0070 }
        r3 = 0;
        r4 = 1;
        if (r2 == 0) goto L_0x001c;
    L_0x000f:
        r0 = "FrameMetricService";
        r2 = "measurement already started: %s";
        r4 = new java.lang.String[r4];	 Catch:{ all -> 0x0070 }
        r4[r3] = r7;	 Catch:{ all -> 0x0070 }
        defpackage.tyv.d(r0, r2, r4);	 Catch:{ all -> 0x0070 }
        monitor-exit(r1);	 Catch:{ all -> 0x0070 }
        return;
    L_0x001c:
        r2 = r0.e;	 Catch:{ all -> 0x0070 }
        r2 = r2.size();	 Catch:{ all -> 0x0070 }
        r5 = 25;
        if (r2 >= r5) goto L_0x0063;
    L_0x0026:
        r2 = r0.e;	 Catch:{ all -> 0x0070 }
        r5 = r0.h;	 Catch:{ all -> 0x0070 }
        r5 = r5.a();	 Catch:{ all -> 0x0070 }
        r2.put(r7, r5);	 Catch:{ all -> 0x0070 }
        r7 = r0.e;	 Catch:{ all -> 0x0070 }
        r7 = r7.size();	 Catch:{ all -> 0x0070 }
        if (r7 != r4) goto L_0x0061;
    L_0x0039:
        r7 = r0.f;	 Catch:{ all -> 0x0070 }
        if (r7 != 0) goto L_0x0061;
    L_0x003d:
        r7 = "FrameMetricService";
        r2 = "measuring start";
        r5 = new java.lang.Object[r3];	 Catch:{ all -> 0x0070 }
        defpackage.tyv.b(r7, r2, r5);	 Catch:{ all -> 0x0070 }
        r7 = r0.d;	 Catch:{ all -> 0x0070 }
        monitor-enter(r7);	 Catch:{ all -> 0x0070 }
        r7.b = r4;	 Catch:{ all -> 0x005e }
        r0 = r7.a;	 Catch:{ all -> 0x005e }
        if (r0 != 0) goto L_0x0059;
    L_0x004f:
        r0 = "FrameMetricService";
        r2 = "No activity";
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x005e }
        defpackage.tyv.b(r0, r2, r3);	 Catch:{ all -> 0x005e }
        goto L_0x005c;
    L_0x0059:
        r7.a();	 Catch:{ all -> 0x005e }
    L_0x005c:
        monitor-exit(r7);	 Catch:{ all -> 0x005e }
        goto L_0x0061;
    L_0x005e:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x005e }
        throw r0;	 Catch:{ all -> 0x0070 }
    L_0x0061:
        monitor-exit(r1);	 Catch:{ all -> 0x0070 }
        return;
    L_0x0063:
        r0 = "FrameMetricService";
        r2 = "Too many concurrent measurements, ignoring %s";
        r4 = new java.lang.String[r4];	 Catch:{ all -> 0x0070 }
        r4[r3] = r7;	 Catch:{ all -> 0x0070 }
        defpackage.tyv.d(r0, r2, r4);	 Catch:{ all -> 0x0070 }
        monitor-exit(r1);	 Catch:{ all -> 0x0070 }
        return;
    L_0x0070:
        r7 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0070 }
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tuy.a(java.lang.String):void");
    }

    public final void b(String str) {
        ucc ucc;
        tuw tuw = this.b;
        this.a.a();
        synchronized (tuw.e) {
            ucc = (ucc) tuw.e.remove(str);
            if (tuw.e.isEmpty() && !tuw.f) {
                tuw.d.b();
            }
        }
        if (ucc == null) {
            tyv.d("FrameMetricService", "Measurement not found: %s", str);
        } else if (ucc.a()) {
            bcfd bcfd = (bcfd) bcfe.x.createBuilder();
            bcdy bcdy = (bcdy) ((anxo) ucc.b().toBuilder());
            int a = ucn.a(tuw.a);
            bcdy.copyOnWrite();
            bcdv bcdv = (bcdv) bcdy.instance;
            bcdv.a |= 16;
            bcdv.g = a;
            bcfd.copyOnWrite();
            bcfe bcfe = (bcfe) bcfd.instance;
            bcfe.l = (bcdv) ((anxl) bcdy.build());
            bcfe.a |= 2048;
            tvd tvd = tuw.i;
            if (tvd != null) {
                try {
                    tvd.a();
                } catch (Exception e) {
                    tyv.b("FrameMetricService", "Exception while getting jank metric extension!", e, new Object[0]);
                }
            }
            tuw.a(str, true, (bcfe) ((anxl) bcfd.build()), null, null);
        }
    }

    public final void a(int i) {
        tuw tuw = this.b;
        synchronized (tuw.e) {
            for (ucc a : tuw.e.values()) {
                a.a(i, tuw.g);
            }
        }
    }
}
