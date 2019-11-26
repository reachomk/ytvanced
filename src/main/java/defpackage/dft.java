package defpackage;

import android.content.Context;

/* renamed from: dft */
final class dft implements Runnable {
    private final /* synthetic */ Context a;
    private final /* synthetic */ dgg b;
    private final /* synthetic */ boolean c = true;
    private final /* synthetic */ boolean d = true;

    dft(Context context, dgg dgg) {
        this.a = context;
        this.b = dgg;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0105 A:{SYNTHETIC, Splitter:B:66:0x0105} */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e9 A:{Catch:{ all -> 0x00c8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e3 A:{Catch:{ all -> 0x00c8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f2 A:{SYNTHETIC, Splitter:B:56:0x00f2} */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0105 A:{SYNTHETIC, Splitter:B:66:0x0105} */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f9  */
    public final void run() {
        /*
        r20 = this;
        r1 = r20;
        r0 = r1.a;	 Catch:{ Exception -> 0x0193 }
        r2 = r1.b;	 Catch:{ Exception -> 0x0193 }
        r0 = defpackage.dgh.a(r0, r2);	 Catch:{ Exception -> 0x0193 }
        if (r0 == 0) goto L_0x0192;
    L_0x000c:
        r2 = r1.a;	 Catch:{ Exception -> 0x0193 }
        r3 = defpackage.dgh.a;	 Catch:{ Exception -> 0x0193 }
        monitor-enter(r3);	 Catch:{ Exception -> 0x0193 }
        r4 = defpackage.dgh.b;	 Catch:{ all -> 0x018f }
        if (r4 != 0) goto L_0x001c;
    L_0x0015:
        r4 = new dgb;	 Catch:{ all -> 0x018f }
        r4.<init>(r2);	 Catch:{ all -> 0x018f }
        defpackage.dgh.b = r4;	 Catch:{ all -> 0x018f }
    L_0x001c:
        r2 = defpackage.dgh.b;	 Catch:{ all -> 0x018f }
        monitor-exit(r3);	 Catch:{ all -> 0x018f }
        r3 = r1.c;	 Catch:{ Exception -> 0x0193 }
        r4 = r1.d;	 Catch:{ Exception -> 0x0193 }
        r5 = new dfy;	 Catch:{ Exception -> 0x0193 }
        r5.<init>(r0, r3);	 Catch:{ Exception -> 0x0193 }
        r3 = r2.a;	 Catch:{ Exception -> 0x0193 }
        monitor-enter(r3);	 Catch:{ Exception -> 0x0193 }
        if (r4 != 0) goto L_0x003c;
    L_0x002d:
        r0 = new dga;	 Catch:{ all -> 0x018c }
        r0.<init>(r2, r5);	 Catch:{ all -> 0x018c }
        r2 = new java.lang.Thread;	 Catch:{ all -> 0x018c }
        r2.<init>(r0);	 Catch:{ all -> 0x018c }
        r2.start();	 Catch:{ all -> 0x018c }
        monitor-exit(r3);	 Catch:{ all -> 0x018c }
        return;
    L_0x003c:
        r4 = r2.f;	 Catch:{ all -> 0x018c }
        r6 = r4.b;	 Catch:{ all -> 0x018c }
        monitor-enter(r6);	 Catch:{ all -> 0x018c }
        r0 = r4.a();	 Catch:{ all -> 0x0189 }
        if (r0 != 0) goto L_0x004a;
    L_0x0047:
        monitor-exit(r6);	 Catch:{ all -> 0x0189 }
        goto L_0x016b;
    L_0x004a:
        r7 = new android.content.ContentValues;	 Catch:{ all -> 0x0189 }
        r7.<init>();	 Catch:{ all -> 0x0189 }
        r8 = "string_url";
        r9 = r5.g;	 Catch:{ all -> 0x0189 }
        r7.put(r8, r9);	 Catch:{ all -> 0x0189 }
        r8 = "preference_key";
        r9 = r5.f;	 Catch:{ all -> 0x0189 }
        r7.put(r8, r9);	 Catch:{ all -> 0x0189 }
        r8 = "is_repeatable";
        r9 = r5.b;	 Catch:{ all -> 0x0189 }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x0189 }
        r7.put(r8, r9);	 Catch:{ all -> 0x0189 }
        r8 = "parameter_is_null";
        r9 = r5.a;	 Catch:{ all -> 0x0189 }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x0189 }
        r7.put(r8, r9);	 Catch:{ all -> 0x0189 }
        r8 = "preference_name";
        r9 = r5.e;	 Catch:{ all -> 0x0189 }
        r7.put(r8, r9);	 Catch:{ all -> 0x0189 }
        r8 = "record_time";
        r9 = r5.d;	 Catch:{ all -> 0x0189 }
        r9 = java.lang.Long.valueOf(r9);	 Catch:{ all -> 0x0189 }
        r7.put(r8, r9);	 Catch:{ all -> 0x0189 }
        r8 = "retry_count";
        r9 = 0;
        r10 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x0189 }
        r7.put(r8, r10);	 Catch:{ all -> 0x0189 }
        r8 = "last_retry_time";
        r10 = r5.d;	 Catch:{ all -> 0x0189 }
        r10 = java.lang.Long.valueOf(r10);	 Catch:{ all -> 0x0189 }
        r7.put(r8, r10);	 Catch:{ all -> 0x0189 }
        r8 = "conversiontracking";
        r10 = 0;
        r7 = r0.insert(r8, r10, r7);	 Catch:{ all -> 0x0189 }
        r5.h = r7;	 Catch:{ all -> 0x0189 }
        r4.b();	 Catch:{ all -> 0x0189 }
        r7 = r4.b;	 Catch:{ all -> 0x0189 }
        monitor-enter(r7);	 Catch:{ all -> 0x0189 }
        r0 = r4.a();	 Catch:{ all -> 0x0186 }
        if (r0 == 0) goto L_0x00fd;
    L_0x00af:
        r8 = "select count(*) from conversiontracking";
        r8 = r0.rawQuery(r8, r10);	 Catch:{ SQLiteException -> 0x00cf, all -> 0x00cc }
        r0 = r8.moveToFirst();	 Catch:{ SQLiteException -> 0x00ca }
        if (r0 == 0) goto L_0x00c4;
    L_0x00bb:
        r9 = r8.getInt(r9);	 Catch:{ SQLiteException -> 0x00ca }
        r8.close();	 Catch:{ all -> 0x0186 }
        monitor-exit(r7);	 Catch:{ all -> 0x0186 }
        goto L_0x00fe;
    L_0x00c4:
        r8.close();	 Catch:{ all -> 0x0186 }
        goto L_0x00f5;
    L_0x00c8:
        r0 = move-exception;
        goto L_0x00f7;
    L_0x00ca:
        r0 = move-exception;
        goto L_0x00d1;
    L_0x00cc:
        r0 = move-exception;
        r8 = r10;
        goto L_0x00f7;
    L_0x00cf:
        r0 = move-exception;
        r8 = r10;
    L_0x00d1:
        r11 = "GoogleConversionReporter";
        r12 = "Error getting record count";
        r0 = r0.getMessage();	 Catch:{ all -> 0x00c8 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x00c8 }
        r13 = r0.length();	 Catch:{ all -> 0x00c8 }
        if (r13 != 0) goto L_0x00e9;
    L_0x00e3:
        r0 = new java.lang.String;	 Catch:{ all -> 0x00c8 }
        r0.<init>(r12);	 Catch:{ all -> 0x00c8 }
        goto L_0x00ed;
    L_0x00e9:
        r0 = r12.concat(r0);	 Catch:{ all -> 0x00c8 }
    L_0x00ed:
        android.util.Log.w(r11, r0);	 Catch:{ all -> 0x00c8 }
        if (r8 == 0) goto L_0x00f5;
    L_0x00f2:
        r8.close();	 Catch:{ all -> 0x0186 }
    L_0x00f5:
        monitor-exit(r7);	 Catch:{ all -> 0x0186 }
        goto L_0x00fe;
    L_0x00f7:
        if (r8 == 0) goto L_0x00fc;
    L_0x00f9:
        r8.close();	 Catch:{ all -> 0x0186 }
    L_0x00fc:
        throw r0;	 Catch:{ all -> 0x0186 }
    L_0x00fd:
        monitor-exit(r7);	 Catch:{ all -> 0x0186 }
    L_0x00fe:
        r7 = (long) r9;
        r11 = 20000; // 0x4e20 float:2.8026E-41 double:9.8813E-320;
        r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1));
        if (r0 <= 0) goto L_0x016a;
    L_0x0105:
        r7 = r4.b;	 Catch:{ all -> 0x0189 }
        monitor-enter(r7);	 Catch:{ all -> 0x0189 }
        r11 = r4.a();	 Catch:{ all -> 0x0167 }
        if (r11 == 0) goto L_0x0165;
    L_0x010e:
        r18 = "record_time ASC";
        r12 = "conversiontracking";
        r19 = "1";
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r17 = 0;
        r10 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19);	 Catch:{ SQLiteException -> 0x0131 }
        if (r10 == 0) goto L_0x0133;
    L_0x0121:
        r0 = r10.moveToFirst();	 Catch:{ SQLiteException -> 0x0131 }
        if (r0 == 0) goto L_0x0133;
    L_0x0127:
        r0 = defpackage.dgf.a(r10);	 Catch:{ SQLiteException -> 0x0131 }
        r4.a(r0);	 Catch:{ SQLiteException -> 0x0131 }
        goto L_0x0133;
    L_0x012f:
        r0 = move-exception;
        goto L_0x015f;
    L_0x0131:
        r0 = move-exception;
        goto L_0x0139;
    L_0x0133:
        if (r10 == 0) goto L_0x015d;
    L_0x0135:
        r10.close();	 Catch:{ all -> 0x0167 }
        goto L_0x015d;
    L_0x0139:
        r4 = "GoogleConversionReporter";
        r8 = "Error remove oldest record";
        r0 = r0.getMessage();	 Catch:{ all -> 0x012f }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x012f }
        r9 = r0.length();	 Catch:{ all -> 0x012f }
        if (r9 != 0) goto L_0x0151;
    L_0x014b:
        r0 = new java.lang.String;	 Catch:{ all -> 0x012f }
        r0.<init>(r8);	 Catch:{ all -> 0x012f }
        goto L_0x0155;
    L_0x0151:
        r0 = r8.concat(r0);	 Catch:{ all -> 0x012f }
    L_0x0155:
        android.util.Log.w(r4, r0);	 Catch:{ all -> 0x012f }
        if (r10 == 0) goto L_0x015d;
    L_0x015a:
        r10.close();	 Catch:{ all -> 0x0167 }
    L_0x015d:
        monitor-exit(r7);	 Catch:{ all -> 0x0167 }
        goto L_0x016a;
    L_0x015f:
        if (r10 == 0) goto L_0x0164;
    L_0x0161:
        r10.close();	 Catch:{ all -> 0x0167 }
    L_0x0164:
        throw r0;	 Catch:{ all -> 0x0167 }
    L_0x0165:
        monitor-exit(r7);	 Catch:{ all -> 0x0167 }
        goto L_0x016a;
    L_0x0167:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x0167 }
        throw r0;	 Catch:{ all -> 0x0189 }
    L_0x016a:
        monitor-exit(r6);	 Catch:{ all -> 0x0189 }
    L_0x016b:
        r0 = r2.e;	 Catch:{ all -> 0x018c }
        if (r0 == 0) goto L_0x0184;
    L_0x016f:
        r0 = r2.c;	 Catch:{ all -> 0x018c }
        r0 = defpackage.dgh.c(r0);	 Catch:{ all -> 0x018c }
        if (r0 == 0) goto L_0x0184;
    L_0x0177:
        r0 = r2.b;	 Catch:{ all -> 0x018c }
        r0.add(r5);	 Catch:{ all -> 0x018c }
        r0 = 1;
        r2.d = r0;	 Catch:{ all -> 0x018c }
        r0 = r2.a;	 Catch:{ all -> 0x018c }
        r0.notify();	 Catch:{ all -> 0x018c }
    L_0x0184:
        monitor-exit(r3);	 Catch:{ all -> 0x018c }
        goto L_0x0192;
    L_0x0186:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x0186 }
        throw r0;	 Catch:{ all -> 0x0189 }
    L_0x0189:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0189 }
        throw r0;	 Catch:{ all -> 0x018c }
    L_0x018c:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x018c }
        throw r0;	 Catch:{ Exception -> 0x0193 }
    L_0x018f:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x018f }
        throw r0;	 Catch:{ Exception -> 0x0193 }
    L_0x0192:
        return;
    L_0x0193:
        r0 = move-exception;
        r2 = "GoogleConversionReporter";
        r3 = "Error sending ping";
        android.util.Log.e(r2, r3, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dft.run():void");
    }
}
