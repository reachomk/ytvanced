package defpackage;

/* renamed from: gst */
final /* synthetic */ class gst implements anij {
    private final gso a;

    gst(gso gso) {
        this.a = gso;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x018a A:{Catch:{ Exception -> 0x0255, all -> 0x0253 }} */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0184 A:{Catch:{ Exception -> 0x0255, all -> 0x0253 }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x017c */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0127 A:{Catch:{ Exception -> 0x0255, all -> 0x0253 }} */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x000f A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x028e  */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public final defpackage.anjv a() {
        /*
        r14 = this;
        r0 = ": ";
        r1 = r14.a;
        r2 = r1.Y;
        r2.clear();
        r2 = r1.ai;
        r2 = r2.iterator();
    L_0x000f:
        r3 = r2.hasNext();
        r4 = 0;
        if (r3 == 0) goto L_0x029b;
    L_0x0016:
        r3 = r2.next();
        r3 = (defpackage.alyb) r3;
        if (r3 == 0) goto L_0x000f;
    L_0x001e:
        r5 = r3.a;
        r6 = android.net.Uri.EMPTY;
        r5 = r5.equals(r6);
        if (r5 != 0) goto L_0x000f;
    L_0x0028:
        r5 = r1.aa;
        r6 = r1.g;
        r13 = r3.a;
        r7 = r5.b;
        r7 = r7.getType(r13);
        if (r7 == 0) goto L_0x0045;
    L_0x0036:
        r8 = "image/";
        r7 = r7.startsWith(r8);
        if (r7 == 0) goto L_0x0045;
    L_0x003e:
        r3 = "URI is an image";
        defpackage.xtl.d(r3);
        goto L_0x028c;
    L_0x0045:
        r7 = r5.b;	 Catch:{ SecurityException -> 0x00ee, IllegalArgumentException -> 0x00bb, SQLiteException -> 0x0088, NullPointerException -> 0x0054 }
        r9 = defpackage.alyd.a;	 Catch:{ SecurityException -> 0x00ee, IllegalArgumentException -> 0x00bb, SQLiteException -> 0x0088, NullPointerException -> 0x0054 }
        r10 = "mime_type LIKE 'video/%'";
        r11 = 0;
        r12 = 0;
        r8 = r13;
        r7 = r7.query(r8, r9, r10, r11, r12);	 Catch:{ SecurityException -> 0x00ee, IllegalArgumentException -> 0x00bb, SQLiteException -> 0x0088, NullPointerException -> 0x0054 }
        goto L_0x0121;
    L_0x0054:
        r7 = move-exception;
        r8 = java.lang.String.valueOf(r13);
        r7 = r7.getMessage();
        r9 = r8.length();
        r10 = java.lang.String.valueOf(r7);
        r10 = r10.length();
        r11 = new java.lang.StringBuilder;
        r9 = r9 + 50;
        r9 = r9 + r10;
        r11.<init>(r9);
        r9 = "NullPointerException resolving content from URL ";
        r11.append(r9);
        r11.append(r8);
        r11.append(r0);
        r11.append(r7);
        r7 = r11.toString();
        defpackage.xtl.d(r7);
        goto L_0x0120;
    L_0x0088:
        r7 = move-exception;
        r8 = java.lang.String.valueOf(r13);
        r7 = r7.getMessage();
        r9 = r8.length();
        r10 = java.lang.String.valueOf(r7);
        r10 = r10.length();
        r11 = new java.lang.StringBuilder;
        r9 = r9 + 35;
        r9 = r9 + r10;
        r11.<init>(r9);
        r9 = "Error resolving content from URL ";
        r11.append(r9);
        r11.append(r8);
        r11.append(r0);
        r11.append(r7);
        r7 = r11.toString();
        defpackage.xtl.d(r7);
        goto L_0x0120;
    L_0x00bb:
        r7 = move-exception;
        r8 = java.lang.String.valueOf(r13);
        r7 = r7.getMessage();
        r9 = r8.length();
        r10 = java.lang.String.valueOf(r7);
        r10 = r10.length();
        r11 = new java.lang.StringBuilder;
        r9 = r9 + 46;
        r9 = r9 + r10;
        r11.<init>(r9);
        r9 = "Illegal argument when resolving content URL ";
        r11.append(r9);
        r11.append(r8);
        r11.append(r0);
        r11.append(r7);
        r7 = r11.toString();
        defpackage.xtl.d(r7);
        goto L_0x0120;
    L_0x00ee:
        r7 = move-exception;
        r8 = java.lang.String.valueOf(r13);
        r7 = r7.getMessage();
        r9 = r8.length();
        r10 = java.lang.String.valueOf(r7);
        r10 = r10.length();
        r11 = new java.lang.StringBuilder;
        r9 = r9 + 34;
        r9 = r9 + r10;
        r11.<init>(r9);
        r9 = "SecurityException resolving URI ";
        r11.append(r9);
        r11.append(r8);
        r11.append(r0);
        r11.append(r7);
        r7 = r11.toString();
        defpackage.xtl.d(r7);
    L_0x0120:
        r7 = r4;
    L_0x0121:
        r8 = r13.getPath();	 Catch:{ Exception -> 0x0255 }
        if (r8 == 0) goto L_0x024d;
    L_0x0127:
        r9 = new java.io.File;	 Catch:{ Exception -> 0x0255 }
        r9.<init>(r8);	 Catch:{ Exception -> 0x0255 }
        r8 = r9.getCanonicalPath();	 Catch:{ Exception -> 0x0255 }
        r9 = android.os.Environment.getDataDirectory();	 Catch:{ Exception -> 0x0255 }
        r9 = r9.toString();	 Catch:{ Exception -> 0x0255 }
        r8 = r8.startsWith(r9);	 Catch:{ Exception -> 0x0255 }
        if (r8 == 0) goto L_0x0147;
    L_0x013e:
        if (r7 != 0) goto L_0x0142;
    L_0x0140:
        goto L_0x028c;
    L_0x0142:
        r7.close();
        goto L_0x028c;
    L_0x0147:
        r8 = r3.c;	 Catch:{ Exception -> 0x0255 }
        r9 = 2;
        r10 = 3;
        r11 = 1;
        if (r8 == 0) goto L_0x0192;
    L_0x014e:
        r3 = r5.c;	 Catch:{ Exception -> 0x0255 }
        r5 = 58;
        r5 = defpackage.amqz.a(r5);	 Catch:{ Exception -> 0x0255 }
        r5 = r5.c(r8);	 Catch:{ Exception -> 0x0255 }
        r12 = r5.size();	 Catch:{ Exception -> 0x0255 }
        if (r12 >= r10) goto L_0x0166;
    L_0x0160:
        r3 = "Ignoring unknown frontendUploadId format.";
        defpackage.xtl.c(r3);	 Catch:{ Exception -> 0x0255 }
        goto L_0x01a9;
    L_0x0166:
        r9 = r5.get(r9);	 Catch:{ NumberFormatException -> 0x017c }
        r9 = (java.lang.String) r9;	 Catch:{ NumberFormatException -> 0x017c }
        r9 = java.lang.Integer.parseInt(r9);	 Catch:{ NumberFormatException -> 0x017c }
        r9 = r9 + r11;
        r3.b = r9;	 Catch:{ NumberFormatException -> 0x017c }
        r5 = r5.get(r11);	 Catch:{ NumberFormatException -> 0x017c }
        r5 = (java.lang.String) r5;	 Catch:{ NumberFormatException -> 0x017c }
        r3.a = r5;	 Catch:{ NumberFormatException -> 0x017c }
        goto L_0x01a9;
    L_0x017c:
        r3 = "Malformed frontendId: ";
        r5 = r8.length();	 Catch:{ Exception -> 0x0255 }
        if (r5 != 0) goto L_0x018a;
    L_0x0184:
        r5 = new java.lang.String;	 Catch:{ Exception -> 0x0255 }
        r5.<init>(r3);	 Catch:{ Exception -> 0x0255 }
        goto L_0x018e;
    L_0x018a:
        r5 = r3.concat(r8);	 Catch:{ Exception -> 0x0255 }
    L_0x018e:
        defpackage.xtl.c(r5);	 Catch:{ Exception -> 0x0255 }
        goto L_0x01a9;
    L_0x0192:
        r5 = r5.c;	 Catch:{ Exception -> 0x0255 }
        r3 = r3.b;	 Catch:{ Exception -> 0x0255 }
        r3 = r3.ordinal();	 Catch:{ Exception -> 0x0255 }
        if (r3 == r11) goto L_0x01a4;
    L_0x019c:
        if (r3 == r9) goto L_0x01a4;
    L_0x019e:
        if (r3 == r10) goto L_0x01a4;
    L_0x01a0:
        r8 = 4;
        if (r3 == r8) goto L_0x01a4;
    L_0x01a3:
        goto L_0x01a5;
    L_0x01a4:
        r11 = 0;
    L_0x01a5:
        r8 = r5.a(r9, r11);	 Catch:{ Exception -> 0x0255 }
    L_0x01a9:
        if (r7 == 0) goto L_0x0231;
    L_0x01ab:
        r3 = r7.moveToFirst();	 Catch:{ Exception -> 0x0255 }
        if (r3 != 0) goto L_0x01b3;
    L_0x01b1:
        goto L_0x0231;
    L_0x01b3:
        r3 = new alya;	 Catch:{ Exception -> 0x0255 }
        r3.<init>(r13, r8);	 Catch:{ Exception -> 0x0255 }
        r5 = "_id";
        r5 = defpackage.alyd.a(r7, r5);	 Catch:{ Exception -> 0x0255 }
        r3.d = r5;	 Catch:{ Exception -> 0x0255 }
        r5 = "mime_type";
        r5 = defpackage.alyd.b(r7, r5);	 Catch:{ Exception -> 0x0255 }
        r3.f = r5;	 Catch:{ Exception -> 0x0255 }
        r5 = "duration";
        r5 = defpackage.alyd.a(r7, r5);	 Catch:{ Exception -> 0x0255 }
        r3.g = r5;	 Catch:{ Exception -> 0x0255 }
        r5 = "_size";
        r5 = defpackage.alyd.a(r7, r5);	 Catch:{ Exception -> 0x0255 }
        r3.h = r5;	 Catch:{ Exception -> 0x0255 }
        r5 = "latitude";
        r5 = defpackage.alyd.b(r7, r5);	 Catch:{ Exception -> 0x0255 }
        r3.i = r5;	 Catch:{ Exception -> 0x0255 }
        r5 = "longitude";
        r5 = defpackage.alyd.b(r7, r5);	 Catch:{ Exception -> 0x0255 }
        r3.j = r5;	 Catch:{ Exception -> 0x0255 }
        r5 = r3.f;	 Catch:{ Exception -> 0x0255 }
        if (r5 == 0) goto L_0x021d;
    L_0x01ec:
        r9 = "video/";
        r5 = r5.startsWith(r9);	 Catch:{ Exception -> 0x0255 }
        if (r5 != 0) goto L_0x021d;
    L_0x01f4:
        r3 = r3.f;	 Catch:{ Exception -> 0x0255 }
        r5 = java.lang.String.valueOf(r3);	 Catch:{ Exception -> 0x0255 }
        r5 = r5.length();	 Catch:{ Exception -> 0x0255 }
        r5 = r5 + 20;
        r6 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0255 }
        r6.<init>(r5);	 Catch:{ Exception -> 0x0255 }
        r5 = "invalid file type [";
        r6.append(r5);	 Catch:{ Exception -> 0x0255 }
        r6.append(r3);	 Catch:{ Exception -> 0x0255 }
        r3 = "]";
        r6.append(r3);	 Catch:{ Exception -> 0x0255 }
        r3 = r6.toString();	 Catch:{ Exception -> 0x0255 }
        defpackage.xtl.d(r3);	 Catch:{ Exception -> 0x0255 }
        r7.close();
        goto L_0x028c;
    L_0x021d:
        r5 = new acvs;	 Catch:{ Exception -> 0x0255 }
        r9 = defpackage.acwc.UPLOAD_VIDEO_RECEIVED_PUBLIC_URI;	 Catch:{ Exception -> 0x0255 }
        r5.<init>(r9);	 Catch:{ Exception -> 0x0255 }
        r9 = r3.c;	 Catch:{ Exception -> 0x0255 }
        r8 = defpackage.alyc.a(r8, r9);	 Catch:{ Exception -> 0x0255 }
        r6.a(r10, r5, r8);	 Catch:{ Exception -> 0x0255 }
        r7.close();
        goto L_0x024b;
    L_0x0231:
        r3 = new alya;	 Catch:{ Exception -> 0x0255 }
        r3.<init>(r13, r8);	 Catch:{ Exception -> 0x0255 }
        r5 = new acvs;	 Catch:{ Exception -> 0x0255 }
        r9 = defpackage.acwc.UPLOAD_VIDEO_RECEIVED_PRIVATE_URI;	 Catch:{ Exception -> 0x0255 }
        r5.<init>(r9);	 Catch:{ Exception -> 0x0255 }
        r9 = r3.c;	 Catch:{ Exception -> 0x0255 }
        r8 = defpackage.alyc.a(r8, r9);	 Catch:{ Exception -> 0x0255 }
        r6.a(r10, r5, r8);	 Catch:{ Exception -> 0x0255 }
        if (r7 == 0) goto L_0x024b;
    L_0x0248:
        r7.close();
    L_0x024b:
        r4 = r3;
        goto L_0x028c;
    L_0x024d:
        if (r7 == 0) goto L_0x028c;
    L_0x024f:
        r7.close();
        goto L_0x028c;
    L_0x0253:
        r0 = move-exception;
        goto L_0x0295;
    L_0x0255:
        r3 = move-exception;
        r5 = java.lang.String.valueOf(r13);	 Catch:{ all -> 0x0253 }
        r3 = r3.getMessage();	 Catch:{ all -> 0x0253 }
        r6 = r5.length();	 Catch:{ all -> 0x0253 }
        r6 = r6 + 39;
        r8 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x0253 }
        r8 = r8.length();	 Catch:{ all -> 0x0253 }
        r6 = r6 + r8;
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0253 }
        r8.<init>(r6);	 Catch:{ all -> 0x0253 }
        r6 = "Exception when resolving content URI ";
        r8.append(r6);	 Catch:{ all -> 0x0253 }
        r8.append(r5);	 Catch:{ all -> 0x0253 }
        r8.append(r0);	 Catch:{ all -> 0x0253 }
        r8.append(r3);	 Catch:{ all -> 0x0253 }
        r3 = r8.toString();	 Catch:{ all -> 0x0253 }
        defpackage.xtl.d(r3);	 Catch:{ all -> 0x0253 }
        if (r7 == 0) goto L_0x028c;
    L_0x0289:
        r7.close();
    L_0x028c:
        if (r4 == 0) goto L_0x000f;
    L_0x028e:
        r3 = r1.Y;
        r3.add(r4);
        goto L_0x000f;
    L_0x0295:
        if (r7 == 0) goto L_0x029a;
    L_0x0297:
        r7.close();
    L_0x029a:
        throw r0;
    L_0x029b:
        r0 = defpackage.anjf.a(r4);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gst.a():anjv");
    }
}
