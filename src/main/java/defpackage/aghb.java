package defpackage;

/* renamed from: aghb */
final class aghb implements xbt {
    aghb() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007b A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0081  */
    public final void a(android.database.sqlite.SQLiteDatabase r17) {
        /*
        r16 = this;
        r0 = new amuv;
        r0.<init>();
        r1 = 3;
        r4 = new java.lang.String[r1];
        r10 = 0;
        r11 = "video_id";
        r4[r10] = r11;
        r12 = "itag";
        r13 = 1;
        r4[r13] = r12;
        r14 = "external_yt_file_path";
        r15 = 2;
        r4[r15] = r14;
        r3 = "streams";
        r5 = "external_yt_file_path IS NOT NULL";
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r2 = r17;
        r2 = r2.query(r3, r4, r5, r6, r7, r8, r9);
    L_0x0025:
        r3 = r2.moveToNext();	 Catch:{ all -> 0x00be }
        if (r3 == 0) goto L_0x006e;
    L_0x002b:
        r3 = r2.getColumnIndex(r11);	 Catch:{ all -> 0x00be }
        r3 = r2.getString(r3);	 Catch:{ all -> 0x00be }
        r4 = r2.getColumnIndex(r12);	 Catch:{ all -> 0x00be }
        r4 = r2.getInt(r4);	 Catch:{ all -> 0x00be }
        r5 = r2.getColumnIndex(r14);	 Catch:{ all -> 0x00be }
        r5 = r2.getString(r5);	 Catch:{ all -> 0x00be }
        r6 = android.text.TextUtils.isEmpty(r5);	 Catch:{ all -> 0x00be }
        if (r6 != 0) goto L_0x0025;
    L_0x0049:
        r6 = new java.io.File;	 Catch:{ all -> 0x00be }
        r6.<init>(r5);	 Catch:{ all -> 0x00be }
        r5 = android.net.Uri.fromFile(r6);	 Catch:{ all -> 0x00be }
        r6 = new android.content.ContentValues;	 Catch:{ all -> 0x00be }
        r6.<init>();	 Catch:{ all -> 0x00be }
        r6.put(r11, r3);	 Catch:{ all -> 0x00be }
        r3 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x00be }
        r6.put(r12, r3);	 Catch:{ all -> 0x00be }
        r3 = "ytb_uri";
        r4 = r5.toString();	 Catch:{ all -> 0x00be }
        r6.put(r3, r4);	 Catch:{ all -> 0x00be }
        r0.c(r6);	 Catch:{ all -> 0x00be }
        goto L_0x0025;
    L_0x006e:
        r2.close();
        r0 = r0.a();
        r0 = r0.iterator();
        r0 = (defpackage.amxo) r0;
    L_0x007b:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x00bd;
    L_0x0081:
        r2 = r0.next();
        r2 = (android.content.ContentValues) r2;
        r3 = new java.lang.String[r15];
        r4 = r2.getAsString(r11);
        r3[r10] = r4;
        r4 = r2.getAsString(r12);
        r3[r13] = r4;
        r2.remove(r11);
        r2.remove(r12);
        r4 = "streams";
        r5 = "video_id = ? AND itag = ?";
        r6 = r17;
        r2 = r6.update(r4, r2, r5, r3);
        if (r2 == r13) goto L_0x007b;
    L_0x00a7:
        r4 = new java.lang.Object[r1];
        r2 = java.lang.Integer.valueOf(r2);
        r4[r10] = r2;
        r2 = r3[r10];
        r4[r13] = r2;
        r2 = r3[r13];
        r4[r15] = r2;
        r2 = "Unexpected number of rows affected (%d) when populating streams URI column for (%s, %s)";
        defpackage.xtl.a(r2, r4);
        goto L_0x007b;
    L_0x00bd:
        return;
    L_0x00be:
        r0 = move-exception;
        r1 = r0;
        throw r1;	 Catch:{ all -> 0x00c1 }
    L_0x00c1:
        r0 = move-exception;
        r3 = r0;
        if (r2 == 0) goto L_0x00ce;
    L_0x00c5:
        r2.close();	 Catch:{ all -> 0x00c9 }
        goto L_0x00ce;
    L_0x00c9:
        r0 = move-exception;
        r2 = r0;
        defpackage.ankx.a(r1, r2);
    L_0x00ce:
        goto L_0x00d0;
    L_0x00cf:
        throw r3;
    L_0x00d0:
        goto L_0x00cf;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aghb.a(android.database.sqlite.SQLiteDatabase):void");
    }
}
