package org.chromium.base;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import defpackage.ankx;
import defpackage.bchn;
import java.io.IOException;

public abstract class ContentUriUtils {
    private ContentUriUtils() {
    }

    public static int openContentUriForRead(String str) {
        AssetFileDescriptor a = a(str);
        return a != null ? a.getParcelFileDescriptor().detachFd() : -1;
    }

    public static boolean contentUriExists(String str) {
        AssetFileDescriptor a = a(str);
        boolean z = a != null;
        if (a != null) {
            try {
                a.close();
            } catch (IOException unused) {
            }
        }
        return z;
    }

    public static String getMimeType(String str) {
        ContentResolver contentResolver = bchn.a.getContentResolver();
        Uri parse = Uri.parse(str);
        if (!a(parse)) {
            return contentResolver.getType(parse);
        }
        String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
        return (streamTypes == null || streamTypes.length <= 0) ? null : streamTypes[0];
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0048 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:17|18|19|20|21) */
    private static android.content.res.AssetFileDescriptor a(java.lang.String r11) {
        /*
        r0 = "ContentUriUtils";
        r1 = defpackage.bchn.a;
        r1 = r1.getContentResolver();
        r2 = android.net.Uri.parse(r11);
        r3 = 0;
        r4 = a(r2);	 Catch:{ FileNotFoundException -> 0x007d, SecurityException -> 0x0067, Exception -> 0x0051 }
        if (r4 != 0) goto L_0x0026;
    L_0x0013:
        r4 = "r";
        r6 = r1.openFileDescriptor(r2, r4);	 Catch:{ FileNotFoundException -> 0x007d, SecurityException -> 0x0067, Exception -> 0x0051 }
        if (r6 == 0) goto L_0x0092;
    L_0x001b:
        r1 = new android.content.res.AssetFileDescriptor;	 Catch:{ FileNotFoundException -> 0x007d, SecurityException -> 0x0067, Exception -> 0x0051 }
        r7 = 0;
        r9 = -1;
        r5 = r1;
        r5.<init>(r6, r7, r9);	 Catch:{ FileNotFoundException -> 0x007d, SecurityException -> 0x0067, Exception -> 0x0051 }
        return r1;
    L_0x0026:
        r4 = "*/*";
        r4 = r1.getStreamTypes(r2, r4);	 Catch:{ FileNotFoundException -> 0x007d, SecurityException -> 0x0067, Exception -> 0x0051 }
        if (r4 == 0) goto L_0x0092;
    L_0x002e:
        r5 = r4.length;	 Catch:{ FileNotFoundException -> 0x007d, SecurityException -> 0x0067, Exception -> 0x0051 }
        if (r5 <= 0) goto L_0x0092;
    L_0x0031:
        r5 = 0;
        r4 = r4[r5];	 Catch:{ FileNotFoundException -> 0x007d, SecurityException -> 0x0067, Exception -> 0x0051 }
        r1 = r1.openTypedAssetFileDescriptor(r2, r4, r3);	 Catch:{ FileNotFoundException -> 0x007d, SecurityException -> 0x0067, Exception -> 0x0051 }
        if (r1 == 0) goto L_0x0050;
    L_0x003a:
        r4 = r1.getStartOffset();	 Catch:{ FileNotFoundException -> 0x007d, SecurityException -> 0x0067, Exception -> 0x0051 }
        r6 = 0;
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r2 != 0) goto L_0x0045;
    L_0x0044:
        goto L_0x0050;
    L_0x0045:
        r1.close();	 Catch:{ IOException -> 0x0048 }
    L_0x0048:
        r1 = new java.lang.SecurityException;	 Catch:{ FileNotFoundException -> 0x007d, SecurityException -> 0x0067, Exception -> 0x0051 }
        r2 = "Cannot open files with non-zero offset type.";
        r1.<init>(r2);	 Catch:{ FileNotFoundException -> 0x007d, SecurityException -> 0x0067, Exception -> 0x0051 }
        throw r1;	 Catch:{ FileNotFoundException -> 0x007d, SecurityException -> 0x0067, Exception -> 0x0051 }
    L_0x0050:
        return r1;
    L_0x0051:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = "Unknown content uri: ";
        r2.append(r4);
        r2.append(r11);
        r11 = r2.toString();
        android.util.Log.w(r0, r11, r1);
        goto L_0x0092;
    L_0x0067:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = "Cannot open content uri: ";
        r2.append(r4);
        r2.append(r11);
        r11 = r2.toString();
        android.util.Log.w(r0, r11, r1);
        goto L_0x0092;
    L_0x007d:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = "Cannot find content uri: ";
        r2.append(r4);
        r2.append(r11);
        r11 = r2.toString();
        android.util.Log.w(r0, r11, r1);
    L_0x0092:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.ContentUriUtils.a(java.lang.String):android.content.res.AssetFileDescriptor");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0080 A:{RETURN} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x007a */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:1|2|3|(7:5|6|7|8|9|(3:11|12|(3:14|15|(2:17|18)(6:19|20|(2:22|(2:26|(1:28)))|29|30|31)))|(1:40))|41|42|(1:44)(1:45)) */
    /* JADX WARNING: Missing block: B:37:?, code skipped:
            a(r1, r0);
     */
    public static java.lang.String maybeGetDisplayName(java.lang.String r11) {
        /*
        r6 = android.net.Uri.parse(r11);
        r7 = 0;
        r0 = defpackage.bchn.a;	 Catch:{ Exception -> 0x0082 }
        r8 = "_display_name";
        r9 = "";
        if (r6 != 0) goto L_0x000f;
    L_0x000d:
        goto L_0x007a;
    L_0x000f:
        r10 = r0.getContentResolver();	 Catch:{ Exception -> 0x0082 }
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r0 = r10;
        r1 = r6;
        r0 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ NullPointerException -> 0x007a }
        if (r0 == 0) goto L_0x0075;
    L_0x001f:
        r1 = r0.getCount();	 Catch:{ all -> 0x006e }
        if (r1 <= 0) goto L_0x0075;
    L_0x0025:
        r0.moveToFirst();	 Catch:{ all -> 0x006e }
        r1 = r0.getColumnIndex(r8);	 Catch:{ all -> 0x006e }
        r2 = -1;
        if (r1 != r2) goto L_0x0033;
    L_0x002f:
        a(r7, r0);	 Catch:{ NullPointerException -> 0x007a }
        goto L_0x007a;
    L_0x0033:
        r1 = r0.getString(r1);	 Catch:{ all -> 0x006e }
        r2 = a(r0);	 Catch:{ all -> 0x006e }
        if (r2 == 0) goto L_0x0069;
    L_0x003d:
        r2 = "*/*";
        r2 = r10.getStreamTypes(r6, r2);	 Catch:{ all -> 0x006e }
        if (r2 == 0) goto L_0x0069;
    L_0x0045:
        r3 = r2.length;	 Catch:{ all -> 0x006e }
        if (r3 <= 0) goto L_0x0069;
    L_0x0048:
        r3 = android.webkit.MimeTypeMap.getSingleton();	 Catch:{ all -> 0x006e }
        r4 = 0;
        r2 = r2[r4];	 Catch:{ all -> 0x006e }
        r2 = r3.getExtensionFromMimeType(r2);	 Catch:{ all -> 0x006e }
        if (r2 == 0) goto L_0x0069;
    L_0x0055:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x006e }
        r3.<init>();	 Catch:{ all -> 0x006e }
        r3.append(r1);	 Catch:{ all -> 0x006e }
        r1 = ".";
        r3.append(r1);	 Catch:{ all -> 0x006e }
        r3.append(r2);	 Catch:{ all -> 0x006e }
        r1 = r3.toString();	 Catch:{ all -> 0x006e }
    L_0x0069:
        a(r7, r0);	 Catch:{ NullPointerException -> 0x007a }
        r9 = r1;
        goto L_0x007a;
    L_0x006e:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0070 }
    L_0x0070:
        r2 = move-exception;
        a(r1, r0);	 Catch:{ NullPointerException -> 0x007a }
        throw r2;	 Catch:{ NullPointerException -> 0x007a }
    L_0x0075:
        if (r0 == 0) goto L_0x007a;
    L_0x0077:
        a(r7, r0);	 Catch:{ NullPointerException -> 0x007a }
    L_0x007a:
        r11 = android.text.TextUtils.isEmpty(r9);	 Catch:{ Exception -> 0x0082 }
        if (r11 != 0) goto L_0x0081;
    L_0x0080:
        return r9;
    L_0x0081:
        return r7;
    L_0x0082:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Cannot open content uri: ";
        r1.append(r2);
        r1.append(r11);
        r11 = r1.toString();
        r1 = "ContentUriUtils";
        android.util.Log.w(r1, r11, r0);
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.ContentUriUtils.maybeGetDisplayName(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Missing block: B:21:?, code skipped:
            a(r1, r8);
     */
    private static boolean a(android.net.Uri r8) {
        /*
        r0 = 0;
        if (r8 == 0) goto L_0x003a;
    L_0x0003:
        r1 = defpackage.bchn.a;
        r1 = android.provider.DocumentsContract.isDocumentUri(r1, r8);
        if (r1 == 0) goto L_0x003a;
    L_0x000b:
        r1 = defpackage.bchn.a;
        r2 = r1.getContentResolver();
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r3 = r8;
        r8 = r2.query(r3, r4, r5, r6, r7);	 Catch:{ NullPointerException -> 0x003a }
        r1 = 0;
        if (r8 == 0) goto L_0x0035;
    L_0x001d:
        r2 = r8.getCount();	 Catch:{ all -> 0x002e }
        if (r2 <= 0) goto L_0x0035;
    L_0x0023:
        r8.moveToFirst();	 Catch:{ all -> 0x002e }
        r2 = a(r8);	 Catch:{ all -> 0x002e }
        a(r1, r8);	 Catch:{ NullPointerException -> 0x003a }
        return r2;
    L_0x002e:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0030 }
    L_0x0030:
        r2 = move-exception;
        a(r1, r8);	 Catch:{ NullPointerException -> 0x003a }
        throw r2;	 Catch:{ NullPointerException -> 0x003a }
    L_0x0035:
        if (r8 == 0) goto L_0x003a;
    L_0x0037:
        a(r1, r8);	 Catch:{ NullPointerException -> 0x003a }
    L_0x003a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.ContentUriUtils.a(android.net.Uri):boolean");
    }

    private static boolean a(Cursor cursor) {
        if (VERSION.SDK_INT >= 24) {
            int columnIndex = cursor.getColumnIndex("flags");
            if (columnIndex >= 0 && (cursor.getLong(columnIndex) & 512) != 0) {
                return true;
            }
        }
        return false;
    }

    public static void delete(String str) {
        bchn.a.getContentResolver().delete(Uri.parse(str), null, null);
    }

    private static /* synthetic */ void a(Throwable th, Cursor cursor) {
        if (th != null) {
            try {
                cursor.close();
                return;
            } catch (Throwable th2) {
                ankx.a(th, th2);
                return;
            }
        }
        cursor.close();
    }

    static {
        Object obj = new Object();
    }
}
