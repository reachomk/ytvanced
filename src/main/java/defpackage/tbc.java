package defpackage;

/* renamed from: tbc */
public final class tbc implements tax {
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065 A:{Catch:{ psg -> 0x008e, psj -> 0x007e }} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b A:{Catch:{ all -> 0x0030 }} */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065 A:{Catch:{ psg -> 0x008e, psj -> 0x007e }} */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006b  */
    public final defpackage.tba a(android.content.Context r13) {
        /*
        r12 = this;
        r0 = "Error while reading from SharedPreferences ";
        r1 = "GmscoreFlag";
        r2 = new pde;	 Catch:{ psg -> 0x008e, psj -> 0x007e }
        r2.<init>(r13);	 Catch:{ psg -> 0x008e, psj -> 0x007e }
        r3 = "gads:ad_id_app_context:enabled";
        r3 = r2.a(r3);	 Catch:{ psg -> 0x008e, psj -> 0x007e }
        r4 = "gads:ad_id_app_context:ping_ratio";
        r5 = 0;
        r6 = r2.a;	 Catch:{ all -> 0x001e }
        if (r6 == 0) goto L_0x001c;
    L_0x0016:
        r4 = r6.getFloat(r4, r5);	 Catch:{ all -> 0x001e }
        r11 = r4;
        goto L_0x0023;
    L_0x001c:
        r11 = 0;
        goto L_0x0023;
    L_0x001e:
        r4 = move-exception;
        android.util.Log.w(r1, r0, r4);	 Catch:{ psg -> 0x008e, psj -> 0x007e }
        goto L_0x001c;
    L_0x0023:
        r4 = "gads:ad_id_use_shared_preference:experiment_id";
        r5 = "";
        r6 = r2.a;	 Catch:{ all -> 0x0030 }
        if (r6 == 0) goto L_0x0034;
    L_0x002b:
        r0 = r6.getString(r4, r5);	 Catch:{ all -> 0x0030 }
        goto L_0x0035;
    L_0x0030:
        r4 = move-exception;
        android.util.Log.w(r1, r0, r4);	 Catch:{ psg -> 0x008e, psj -> 0x007e }
    L_0x0034:
        r0 = r5;
    L_0x0035:
        r1 = "gads:ad_id_use_persistent_service:enabled";
        r9 = r2.a(r1);	 Catch:{ psg -> 0x008e, psj -> 0x007e }
        r1 = new pcv;	 Catch:{ psg -> 0x008e, psj -> 0x007e }
        r6 = -1;
        r4 = r1;
        r5 = r13;
        r8 = r3;
        r4.<init>(r5, r6, r8, r9);	 Catch:{ psg -> 0x008e, psj -> 0x007e }
        r4 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x006d }
        r13 = 0;
        r1.a(r13);	 Catch:{ all -> 0x006d }
        r13 = r1.a();	 Catch:{ all -> 0x006d }
        r6 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x006d }
        r8 = r6 - r4;
        r10 = 0;
        r4 = r13;
        r5 = r3;
        r6 = r11;
        r7 = r8;
        r9 = r0;
        defpackage.pcv.a(r4, r5, r6, r7, r9, r10);	 Catch:{ all -> 0x006d }
        r1.b();	 Catch:{ psg -> 0x008e, psj -> 0x007e }
        if (r13 == 0) goto L_0x006b;
    L_0x0065:
        r0 = new tbb;	 Catch:{ psg -> 0x008e, psj -> 0x007e }
        r0.<init>(r13);	 Catch:{ psg -> 0x008e, psj -> 0x007e }
        return r0;
    L_0x006b:
        r13 = 0;
        return r13;
    L_0x006d:
        r13 = move-exception;
        r4 = 0;
        r7 = -1;
        r5 = r3;
        r6 = r11;
        r9 = r0;
        r10 = r13;
        defpackage.pcv.a(r4, r5, r6, r7, r9, r10);	 Catch:{ all -> 0x0079 }
        throw r13;	 Catch:{ all -> 0x0079 }
    L_0x0079:
        r13 = move-exception;
        r1.b();	 Catch:{ psg -> 0x008e, psj -> 0x007e }
        throw r13;	 Catch:{ psg -> 0x008e, psj -> 0x007e }
    L_0x007e:
        r13 = move-exception;
        r0 = new tei;
        r1 = r13.a;
        r2 = r13.getMessage();
        r13.a();
        r0.<init>(r1, r2, r13);
        throw r0;
    L_0x008e:
        r13 = move-exception;
        r0 = new tej;
        r1 = r13.a;
        r0.<init>(r1, r13);
        goto L_0x0098;
    L_0x0097:
        throw r0;
    L_0x0098:
        goto L_0x0097;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tbc.a(android.content.Context):tba");
    }
}
