package defpackage;

/* renamed from: agnb */
final class agnb implements xbt {
    private agnb() {
    }

    /* JADX WARNING: Missing block: B:16:0x008c, code skipped:
            if (r2 != null) goto L_0x008e;
     */
    /* JADX WARNING: Missing block: B:18:?, code skipped:
            r2.close();
     */
    /* JADX WARNING: Missing block: B:19:0x0092, code skipped:
            r1 = move-exception;
     */
    /* JADX WARNING: Missing block: B:20:0x0093, code skipped:
            defpackage.ankx.a(r14, r1);
     */
    public final void a(android.database.sqlite.SQLiteDatabase r14) {
        /*
        r13 = this;
        r0 = "ALTER TABLE ytb_progress ADD COLUMN uri TEXT DEFAULT NULL";
        r14.execSQL(r0);
        r0 = defpackage.amur.e();
        r1 = 2;
        r4 = new java.lang.String[r1];
        r1 = "transfer_id";
        r10 = 0;
        r4[r10] = r1;
        r11 = 1;
        r12 = "filepath";
        r4[r11] = r12;
        r3 = "ytb_progress";
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r2 = r14;
        r2 = r2.query(r3, r4, r5, r6, r7, r8, r9);
        r1 = r2.getColumnIndex(r1);	 Catch:{ all -> 0x0089 }
        r3 = r2.getColumnIndex(r12);	 Catch:{ all -> 0x0089 }
    L_0x002a:
        r4 = r2.moveToNext();	 Catch:{ all -> 0x0089 }
        if (r4 == 0) goto L_0x0057;
    L_0x0030:
        r4 = r2.getString(r1);	 Catch:{ all -> 0x0089 }
        r5 = r2.getString(r3);	 Catch:{ all -> 0x0089 }
        r6 = new java.io.File;	 Catch:{ all -> 0x0089 }
        r6.<init>(r5);	 Catch:{ all -> 0x0089 }
        r5 = android.net.Uri.fromFile(r6);	 Catch:{ all -> 0x0089 }
        r6 = new android.content.ContentValues;	 Catch:{ all -> 0x0089 }
        r6.<init>();	 Catch:{ all -> 0x0089 }
        r7 = "uri";
        r5 = r5.toString();	 Catch:{ all -> 0x0089 }
        r6.put(r7, r5);	 Catch:{ all -> 0x0089 }
        r5 = 0;
        r6.put(r12, r5);	 Catch:{ all -> 0x0089 }
        r0.b(r4, r6);	 Catch:{ all -> 0x0089 }
        goto L_0x002a;
    L_0x0057:
        r2.close();
        r0 = r0.b();
        r1 = r0.keySet();
        r1 = (defpackage.amuw) r1;
        r1 = r1.iterator();
        r1 = (defpackage.amxo) r1;
    L_0x006a:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0088;
    L_0x0070:
        r2 = r1.next();
        r2 = (java.lang.String) r2;
        r3 = r0.get(r2);
        r3 = (android.content.ContentValues) r3;
        r4 = new java.lang.String[r11];
        r4[r10] = r2;
        r2 = "ytb_progress";
        r5 = "transfer_id = ?";
        r14.update(r2, r3, r5, r4);
        goto L_0x006a;
    L_0x0088:
        return;
    L_0x0089:
        r14 = move-exception;
        throw r14;	 Catch:{ all -> 0x008b }
    L_0x008b:
        r0 = move-exception;
        if (r2 == 0) goto L_0x0096;
    L_0x008e:
        r2.close();	 Catch:{ all -> 0x0092 }
        goto L_0x0096;
    L_0x0092:
        r1 = move-exception;
        defpackage.ankx.a(r14, r1);
    L_0x0096:
        goto L_0x0098;
    L_0x0097:
        throw r0;
    L_0x0098:
        goto L_0x0097;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agnb.a(android.database.sqlite.SQLiteDatabase):void");
    }

    /* synthetic */ agnb(byte b) {
    }
}
