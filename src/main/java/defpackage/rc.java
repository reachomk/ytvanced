package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.HashMap;

/* renamed from: rc */
public class rc extends ContentProvider {
    private static final String[] a = new String[]{"_display_name", "_size"};
    private static final File b = new File("/");
    private static HashMap c = new HashMap();
    private rf d;

    public final boolean onCreate() {
        return true;
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            this.d = rc.a(context, providerInfo.authority);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public static Uri a(Context context, String str, File file) {
        return rc.a(context, str).a(file);
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        File a = this.d.a(uri);
        if (strArr == null) {
            strArr = a;
        }
        strArr2 = new String[r9];
        Object[] objArr = new Object[r9];
        int i = 0;
        for (Object obj : strArr) {
            int i2;
            String str3 = "_display_name";
            if (str3.equals(obj)) {
                strArr2[i] = str3;
                i2 = i + 1;
                objArr[i] = a.getName();
            } else {
                str3 = "_size";
                if (str3.equals(obj)) {
                    strArr2[i] = str3;
                    i2 = i + 1;
                    objArr[i] = Long.valueOf(a.length());
                } else {
                }
            }
            i = i2;
        }
        String[] strArr3 = new String[i];
        System.arraycopy(strArr2, 0, strArr3, 0, i);
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        MatrixCursor matrixCursor = new MatrixCursor(strArr3, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    public final String getType(Uri uri) {
        File a = this.d.a(uri);
        int lastIndexOf = a.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        return "application/octet-stream";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return this.d.a(uri).delete();
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        File a = this.d.a(uri);
        int i = 738197504;
        if ("r".equals(str)) {
            i = 268435456;
        } else if (!("w".equals(str) || "wt".equals(str))) {
            if ("wa".equals(str)) {
                i = 704643072;
            } else if ("rw".equals(str)) {
                i = 939524096;
            } else if ("rwt".equals(str)) {
                i = 1006632960;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid mode: ");
                stringBuilder.append(str);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return ParcelFileDescriptor.open(a, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x0122 A:{Splitter:B:5:0x000f, ExcHandler: XmlPullParserException (r11_6 'e' org.xmlpull.v1.XmlPullParserException)} */
    /* JADX WARNING: Missing block: B:63:?, code skipped:
            c.put(r12, r1);
     */
    /* JADX WARNING: Missing block: B:71:0x0122, code skipped:
            r11 = move-exception;
     */
    /* JADX WARNING: Missing block: B:74:0x012a, code skipped:
            throw new java.lang.IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", r11);
     */
    private static defpackage.rf a(android.content.Context r11, java.lang.String r12) {
        /*
        r0 = c;
        monitor-enter(r0);
        r1 = c;	 Catch:{ all -> 0x0134 }
        r1 = r1.get(r12);	 Catch:{ all -> 0x0134 }
        r1 = (defpackage.rf) r1;	 Catch:{ all -> 0x0134 }
        if (r1 == 0) goto L_0x000f;
    L_0x000d:
        goto L_0x0101;
    L_0x000f:
        r1 = new re;	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r1.<init>(r12);	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r2 = r11.getPackageManager();	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r2 = r2.resolveContentProvider(r12, r3);	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        if (r2 == 0) goto L_0x010b;
    L_0x0020:
        r3 = r11.getPackageManager();	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r4 = "android.support.FILE_PROVIDER_PATHS";
        r2 = r2.loadXmlMetaData(r3, r4);	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        if (r2 == 0) goto L_0x0103;
    L_0x002c:
        r3 = r2.next();	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r4 = 1;
        if (r3 == r4) goto L_0x00fc;
    L_0x0033:
        r5 = 2;
        if (r3 != r5) goto L_0x002c;
    L_0x0036:
        r3 = r2.getName();	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r5 = "name";
        r6 = 0;
        r5 = r2.getAttributeValue(r6, r5);	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r7 = "path";
        r7 = r2.getAttributeValue(r6, r7);	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r8 = "root-path";
        r8 = r8.equals(r3);	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r9 = 0;
        if (r8 != 0) goto L_0x00b3;
    L_0x0050:
        r8 = "files-path";
        r8 = r8.equals(r3);	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        if (r8 != 0) goto L_0x00ae;
    L_0x0058:
        r8 = "cache-path";
        r8 = r8.equals(r3);	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        if (r8 != 0) goto L_0x00a9;
    L_0x0060:
        r8 = "external-path";
        r8 = r8.equals(r3);	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        if (r8 != 0) goto L_0x00a4;
    L_0x0068:
        r8 = "external-files-path";
        r8 = r8.equals(r3);	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        if (r8 != 0) goto L_0x009a;
    L_0x0070:
        r8 = "external-cache-path";
        r8 = r8.equals(r3);	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        if (r8 == 0) goto L_0x0082;
    L_0x0078:
        r3 = defpackage.ra.c(r11);	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r8 = r3.length;	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        if (r8 <= 0) goto L_0x00b5;
    L_0x007f:
        r6 = r3[r9];	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        goto L_0x00b5;
    L_0x0082:
        r8 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r10 = 21;
        if (r8 < r10) goto L_0x00b5;
    L_0x0088:
        r8 = "external-media-path";
        r3 = r8.equals(r3);	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        if (r3 == 0) goto L_0x00b5;
    L_0x0090:
        r3 = r11.getExternalMediaDirs();	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r8 = r3.length;	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        if (r8 <= 0) goto L_0x00b5;
    L_0x0097:
        r6 = r3[r9];	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        goto L_0x00b5;
    L_0x009a:
        r3 = defpackage.ra.b(r11);	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r8 = r3.length;	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        if (r8 <= 0) goto L_0x00b5;
    L_0x00a1:
        r6 = r3[r9];	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        goto L_0x00b5;
    L_0x00a4:
        r6 = android.os.Environment.getExternalStorageDirectory();	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        goto L_0x00b5;
    L_0x00a9:
        r6 = r11.getCacheDir();	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        goto L_0x00b5;
    L_0x00ae:
        r6 = r11.getFilesDir();	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        goto L_0x00b5;
    L_0x00b3:
        r6 = b;	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
    L_0x00b5:
        if (r6 == 0) goto L_0x002c;
    L_0x00b7:
        r3 = new java.lang.String[r4];	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r3[r9] = r7;	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r7 = r6;
        r6 = 0;
    L_0x00bd:
        if (r6 <= 0) goto L_0x00f0;
    L_0x00bf:
        r3 = android.text.TextUtils.isEmpty(r5);	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        if (r3 != 0) goto L_0x00e8;
    L_0x00c5:
        r3 = r7.getCanonicalFile();	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x0122 }
        r4 = r1.a;	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r4.put(r5, r3);	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        goto L_0x002c;
    L_0x00d0:
        r11 = move-exception;
        r12 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r1.<init>();	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r2 = "Failed to resolve canonical path for ";
        r1.append(r2);	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r1.append(r7);	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r12.<init>(r1, r11);	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        throw r12;	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
    L_0x00e8:
        r11 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r12 = "Name must not be empty";
        r11.<init>(r12);	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        throw r11;	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
    L_0x00f0:
        r6 = r3[r9];	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        if (r6 == 0) goto L_0x00fa;
    L_0x00f4:
        r8 = new java.io.File;	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r8.<init>(r7, r6);	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r7 = r8;
    L_0x00fa:
        r6 = 1;
        goto L_0x00bd;
    L_0x00fc:
        r11 = c;	 Catch:{ all -> 0x0134 }
        r11.put(r12, r1);	 Catch:{ all -> 0x0134 }
    L_0x0101:
        monitor-exit(r0);	 Catch:{ all -> 0x0134 }
        return r1;
    L_0x0103:
        r11 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r12 = "Missing android.support.FILE_PROVIDER_PATHS meta-data";
        r11.<init>(r12);	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        throw r11;	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
    L_0x010b:
        r11 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r1.<init>();	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r2 = "Couldn't find meta-data for provider with authority ";
        r1.append(r2);	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r1.append(r12);	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r12 = r1.toString();	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        r11.<init>(r12);	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
        throw r11;	 Catch:{ IOException -> 0x012b, XmlPullParserException -> 0x0122 }
    L_0x0122:
        r11 = move-exception;
        r12 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x0134 }
        r1 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data";
        r12.<init>(r1, r11);	 Catch:{ all -> 0x0134 }
        throw r12;	 Catch:{ all -> 0x0134 }
    L_0x012b:
        r11 = move-exception;
        r12 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x0134 }
        r1 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data";
        r12.<init>(r1, r11);	 Catch:{ all -> 0x0134 }
        throw r12;	 Catch:{ all -> 0x0134 }
    L_0x0134:
        r11 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0134 }
        goto L_0x0138;
    L_0x0137:
        throw r11;
    L_0x0138:
        goto L_0x0137;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc.a(android.content.Context, java.lang.String):rf");
    }
}
