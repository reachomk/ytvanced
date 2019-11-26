package defpackage;

import android.net.Uri;

/* renamed from: uhw */
public final class uhw {
    private static final String[] a = new String[]{"_data"};

    private static boolean a(Uri uri) {
        if (uri != null) {
            if ("content".equals(uri.getScheme())) {
                if ("media".equals(uri.getAuthority())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ad  */
    public static java.lang.String a(android.content.ContentResolver r11, android.net.Uri r12) {
        /*
        r0 = "ContentUriUtils";
        r1 = 5;
        r2 = 0;
        r3 = r11.getType(r12);	 Catch:{ Exception -> 0x0009 }
        goto L_0x002f;
    L_0x0009:
        r3 = move-exception;
        r4 = android.util.Log.isLoggable(r0, r1);	 Catch:{ Exception -> 0x00a4 }
        if (r4 == 0) goto L_0x002e;
    L_0x0010:
        r4 = java.lang.String.valueOf(r12);	 Catch:{ Exception -> 0x00a4 }
        r5 = r4.length();	 Catch:{ Exception -> 0x00a4 }
        r5 = r5 + 31;
        r6 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00a4 }
        r6.<init>(r5);	 Catch:{ Exception -> 0x00a4 }
        r5 = "safeGetMimeType failed for uri=";
        r6.append(r5);	 Catch:{ Exception -> 0x00a4 }
        r6.append(r4);	 Catch:{ Exception -> 0x00a4 }
        r4 = r6.toString();	 Catch:{ Exception -> 0x00a4 }
        android.util.Log.w(r0, r4, r3);	 Catch:{ Exception -> 0x00a4 }
    L_0x002e:
        r3 = r2;
    L_0x002f:
        r4 = android.text.TextUtils.isEmpty(r3);	 Catch:{ Exception -> 0x00a2 }
        if (r4 == 0) goto L_0x0045;
    L_0x0035:
        r4 = android.webkit.MimeTypeMap.getSingleton();	 Catch:{ Exception -> 0x00a2 }
        r5 = r12.toString();	 Catch:{ Exception -> 0x00a2 }
        r5 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r5);	 Catch:{ Exception -> 0x00a2 }
        r3 = r4.getMimeTypeFromExtension(r5);	 Catch:{ Exception -> 0x00a2 }
    L_0x0045:
        r4 = "*/*";
        r4 = r4.equals(r3);	 Catch:{ Exception -> 0x00a2 }
        if (r4 == 0) goto L_0x00ac;
    L_0x004d:
        r4 = defpackage.uhw.a(r12);	 Catch:{ Exception -> 0x00a2 }
        if (r4 == 0) goto L_0x00ac;
    L_0x0053:
        r7 = a;	 Catch:{ Exception -> 0x00a2 }
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r5 = r11;
        r6 = r12;
        r11 = r5.query(r6, r7, r8, r9, r10);	 Catch:{ Exception -> 0x00a2 }
        if (r11 == 0) goto L_0x007d;
    L_0x0060:
        r4 = r11.moveToFirst();	 Catch:{ all -> 0x0078 }
        if (r4 == 0) goto L_0x007d;
    L_0x0066:
        r2 = android.webkit.MimeTypeMap.getSingleton();	 Catch:{ all -> 0x0078 }
        r4 = 0;
        r4 = r11.getString(r4);	 Catch:{ all -> 0x0078 }
        r4 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r4);	 Catch:{ all -> 0x0078 }
        r2 = r2.getMimeTypeFromExtension(r4);	 Catch:{ all -> 0x0078 }
        goto L_0x007d;
    L_0x0078:
        r2 = move-exception;
        r11.close();	 Catch:{ Exception -> 0x00a2 }
        throw r2;	 Catch:{ Exception -> 0x00a2 }
    L_0x007d:
        if (r11 == 0) goto L_0x0082;
    L_0x007f:
        r11.close();	 Catch:{ Exception -> 0x00a2 }
    L_0x0082:
        r11 = android.text.TextUtils.isEmpty(r2);	 Catch:{ Exception -> 0x00a2 }
        if (r11 == 0) goto L_0x00a0;
    L_0x0088:
        r11 = defpackage.uhw.a(r12);	 Catch:{ Exception -> 0x00a2 }
        if (r11 == 0) goto L_0x009d;
    L_0x008e:
        r11 = r12.toString();	 Catch:{ Exception -> 0x00a2 }
        r2 = "/video/";
        r11 = r11.contains(r2);	 Catch:{ Exception -> 0x00a2 }
        if (r11 == 0) goto L_0x009d;
    L_0x009a:
        r3 = "video/*";
        goto L_0x00ac;
    L_0x009d:
        r3 = "image/*";
        goto L_0x00ac;
    L_0x00a0:
        r3 = r2;
        goto L_0x00ac;
    L_0x00a2:
        r11 = move-exception;
        goto L_0x00a6;
    L_0x00a4:
        r11 = move-exception;
        r3 = r2;
    L_0x00a6:
        r1 = android.util.Log.isLoggable(r0, r1);
        if (r1 != 0) goto L_0x00ad;
    L_0x00ac:
        return r3;
    L_0x00ad:
        r12 = java.lang.String.valueOf(r12);
        r1 = r12.length();
        r2 = new java.lang.StringBuilder;
        r1 = r1 + 27;
        r2.<init>(r1);
        r1 = "getMimeType failed for uri=";
        r2.append(r1);
        r2.append(r12);
        r12 = r2.toString();
        android.util.Log.w(r0, r12, r11);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uhw.a(android.content.ContentResolver, android.net.Uri):java.lang.String");
    }
}
