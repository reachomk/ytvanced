package defpackage;

/* renamed from: dgd */
final class dgd implements Runnable {
    private final /* synthetic */ dgb a;

    /* JADX WARNING: Missing block: B:49:0x009c, code skipped:
            return;
     */
    public final void run() {
        /*
        r14 = this;
        r0 = r14.a;
        r0 = r0.a;
        r9 = "100";
        monitor-enter(r0);
        r1 = r14.a;	 Catch:{ all -> 0x009d }
        r2 = r1.e;	 Catch:{ all -> 0x009d }
        if (r2 == 0) goto L_0x009b;
    L_0x000d:
        r1 = r1.c;	 Catch:{ all -> 0x009d }
        r1 = defpackage.dgh.c(r1);	 Catch:{ all -> 0x009d }
        if (r1 == 0) goto L_0x009b;
    L_0x0015:
        r1 = r14.a;	 Catch:{ all -> 0x009d }
        r2 = r1.d;	 Catch:{ all -> 0x009d }
        if (r2 != 0) goto L_0x009b;
    L_0x001b:
        r10 = r1.b;	 Catch:{ all -> 0x009d }
        r1 = r1.f;	 Catch:{ all -> 0x009d }
        r11 = r1.b;	 Catch:{ all -> 0x009d }
        monitor-enter(r11);	 Catch:{ all -> 0x009d }
        r12 = new java.util.LinkedList;	 Catch:{ all -> 0x0098 }
        r12.<init>();	 Catch:{ all -> 0x0098 }
        r1 = r1.a();	 Catch:{ all -> 0x0098 }
        if (r1 == 0) goto L_0x0081;
    L_0x002d:
        r13 = 0;
        r8 = "last_retry_time ASC";
        r2 = "conversiontracking";
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r13 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ SQLiteException -> 0x0054 }
        r1 = r13.moveToFirst();	 Catch:{ SQLiteException -> 0x0054 }
        if (r1 == 0) goto L_0x004e;
    L_0x0041:
        r1 = defpackage.dgf.a(r13);	 Catch:{ SQLiteException -> 0x0054 }
        r12.add(r1);	 Catch:{ SQLiteException -> 0x0054 }
        r1 = r13.moveToNext();	 Catch:{ SQLiteException -> 0x0054 }
        if (r1 != 0) goto L_0x0041;
    L_0x004e:
        r13.close();	 Catch:{ all -> 0x0098 }
        goto L_0x0079;
    L_0x0052:
        r1 = move-exception;
        goto L_0x007b;
    L_0x0054:
        r1 = move-exception;
        r2 = "GoogleConversionReporter";
        r3 = "Error extracing ping Info: ";
        r1 = r1.getMessage();	 Catch:{ all -> 0x0052 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x0052 }
        r4 = r1.length();	 Catch:{ all -> 0x0052 }
        if (r4 != 0) goto L_0x006d;
    L_0x0067:
        r1 = new java.lang.String;	 Catch:{ all -> 0x0052 }
        r1.<init>(r3);	 Catch:{ all -> 0x0052 }
        goto L_0x0071;
    L_0x006d:
        r1 = r3.concat(r1);	 Catch:{ all -> 0x0052 }
    L_0x0071:
        android.util.Log.w(r2, r1);	 Catch:{ all -> 0x0052 }
        if (r13 == 0) goto L_0x0079;
    L_0x0076:
        r13.close();	 Catch:{ all -> 0x0098 }
    L_0x0079:
        monitor-exit(r11);	 Catch:{ all -> 0x0098 }
        goto L_0x0082;
    L_0x007b:
        if (r13 == 0) goto L_0x0080;
    L_0x007d:
        r13.close();	 Catch:{ all -> 0x0098 }
    L_0x0080:
        throw r1;	 Catch:{ all -> 0x0098 }
    L_0x0081:
        monitor-exit(r11);	 Catch:{ all -> 0x0098 }
    L_0x0082:
        r10.addAll(r12);	 Catch:{ all -> 0x009d }
        r1 = r14.a;	 Catch:{ all -> 0x009d }
        r1 = r1.c;	 Catch:{ all -> 0x009d }
        defpackage.dgh.b(r1);	 Catch:{ all -> 0x009d }
        r1 = r14.a;	 Catch:{ all -> 0x009d }
        r2 = 1;
        r1.d = r2;	 Catch:{ all -> 0x009d }
        r1 = r1.a;	 Catch:{ all -> 0x009d }
        r1.notify();	 Catch:{ all -> 0x009d }
        monitor-exit(r0);	 Catch:{ all -> 0x009d }
        return;
    L_0x0098:
        r1 = move-exception;
        monitor-exit(r11);	 Catch:{ all -> 0x0098 }
        throw r1;	 Catch:{ all -> 0x009d }
    L_0x009b:
        monitor-exit(r0);	 Catch:{ all -> 0x009d }
        return;
    L_0x009d:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x009d }
        goto L_0x00a1;
    L_0x00a0:
        throw r1;
    L_0x00a1:
        goto L_0x00a0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgd.run():void");
    }

    /* synthetic */ dgd(dgb dgb) {
        this.a = dgb;
    }
}
