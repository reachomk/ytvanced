package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.io.IOException;

/* renamed from: anuu */
public final class anuu {
    private static final amxs a = amxs.a("com/google/mediapipe/framework/AssetCache");
    private static anuu b;
    private final int c;
    private final anut d;
    private final Context e;

    public static synchronized anuu a(Context context) {
        anuu anuu;
        synchronized (anuu.class) {
            amqw.a((Object) context);
            if (b == null) {
                b = new anuu(context);
            }
            anuu = b;
        }
        return anuu;
    }

    public static synchronized anuu a() {
        anuu anuu;
        synchronized (anuu.class) {
            anuu = b;
        }
        return anuu;
    }

    public final synchronized void a(String str) {
        String[] list;
        amqw.a((Object) str);
        try {
            list = this.e.getAssets().list(str);
        } catch (IOException e) {
            ((amxr) ((amxr) ((amxr) a.a()).a((Throwable) e)).a("com/google/mediapipe/framework/AssetCache", "loadAllAssets", 96, "AssetCache.java")).a("Unable to get files in assets path: %s", (Object) str);
            list = null;
        }
        if (list != null) {
            if (r1 != 0) {
                for (String str2 : list) {
                    String str22;
                    if (!TextUtils.isEmpty(str)) {
                        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str22).length());
                        stringBuilder.append(str);
                        stringBuilder.append("/");
                        stringBuilder.append(str22);
                        str22 = stringBuilder.toString();
                    }
                    b(str22);
                }
                return;
            }
        }
        ((amxr) ((amxr) a.b()).a("com/google/mediapipe/framework/AssetCache", "loadAllAssets", 99, "AssetCache.java")).a("No files to load");
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00dc A:{SYNTHETIC, Splitter:B:43:0x00dc} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00e1 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:48|49|(2:51|52)|56|57) */
    /* JADX WARNING: Missing block: B:49:?, code skipped:
            ((defpackage.amxr) ((defpackage.amxr) a.a()).a("com/google/mediapipe/framework/AssetCache", "getAbsolutePathFromAsset", 136, "AssetCache.java")).a("Unable to unpack: %s", (java.lang.Object) r10);
     */
    /* JADX WARNING: Missing block: B:50:0x00fc, code skipped:
            if (r0 != null) goto L_0x00fe;
     */
    /* JADX WARNING: Missing block: B:52:?, code skipped:
            r0.close();
     */
    /* JADX WARNING: Missing block: B:55:0x0103, code skipped:
            return null;
     */
    /* JADX WARNING: Missing block: B:57:0x0105, code skipped:
            return null;
     */
    public final synchronized java.lang.String b(java.lang.String r10) {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = r9.e;	 Catch:{ all -> 0x0106 }
        r0 = r0.getAssets();	 Catch:{ all -> 0x0106 }
        r1 = new java.io.File;	 Catch:{ all -> 0x0106 }
        r2 = r9.e;	 Catch:{ all -> 0x0106 }
        r2 = r2.getCacheDir();	 Catch:{ all -> 0x0106 }
        r3 = "drishti_asset_cache";
        r1.<init>(r2, r3);	 Catch:{ all -> 0x0106 }
        r1.mkdir();	 Catch:{ all -> 0x0106 }
        r2 = new java.io.File;	 Catch:{ all -> 0x0106 }
        r2.<init>(r10);	 Catch:{ all -> 0x0106 }
        r2 = r2.getName();	 Catch:{ all -> 0x0106 }
        r3 = new java.io.File;	 Catch:{ all -> 0x0106 }
        r1 = r1.getPath();	 Catch:{ all -> 0x0106 }
        r3.<init>(r1, r2);	 Catch:{ all -> 0x0106 }
        r1 = r3.exists();	 Catch:{ all -> 0x0106 }
        r2 = 1;
        r4 = 0;
        if (r1 == 0) goto L_0x006a;
    L_0x0031:
        r1 = r9.c;	 Catch:{ all -> 0x0106 }
        if (r1 == 0) goto L_0x006a;
    L_0x0035:
        r5 = r9.d;	 Catch:{ all -> 0x0106 }
        r5 = r5.getReadableDatabase();	 Catch:{ all -> 0x0106 }
        r6 = new java.lang.String[r2];	 Catch:{ all -> 0x0106 }
        r7 = "version";
        r6[r4] = r7;	 Catch:{ all -> 0x0106 }
        r7 = new java.lang.String[r2];	 Catch:{ all -> 0x0106 }
        r7[r4] = r10;	 Catch:{ all -> 0x0106 }
        r8 = "asset = ?";
        r5 = defpackage.anut.a(r5, r6, r8, r7);	 Catch:{ all -> 0x0106 }
        r6 = r5.getCount();	 Catch:{ all -> 0x0106 }
        if (r6 == 0) goto L_0x006a;
    L_0x0051:
        r5.moveToFirst();	 Catch:{ all -> 0x0106 }
        r6 = "version";
        r6 = r5.getColumnIndexOrThrow(r6);	 Catch:{ all -> 0x0106 }
        r6 = r5.getInt(r6);	 Catch:{ all -> 0x0106 }
        r5.close();	 Catch:{ all -> 0x0106 }
        if (r6 == r1) goto L_0x0064;
    L_0x0063:
        goto L_0x006a;
    L_0x0064:
        r10 = r3.getAbsolutePath();	 Catch:{ all -> 0x0106 }
        monitor-exit(r9);
        return r10;
    L_0x006a:
        r1 = 0;
        r0 = r0.open(r10);	 Catch:{ IOException -> 0x00e0 }
        r5 = new java.io.FileOutputStream;	 Catch:{ all -> 0x00d8 }
        r5.<init>(r3);	 Catch:{ all -> 0x00d8 }
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = new byte[r6];	 Catch:{ all -> 0x00d6 }
    L_0x0078:
        r7 = r0.read(r6);	 Catch:{ all -> 0x00d6 }
        r8 = -1;
        if (r7 == r8) goto L_0x0083;
    L_0x007f:
        r5.write(r6, r4, r7);	 Catch:{ all -> 0x00d6 }
        goto L_0x0078;
    L_0x0083:
        r5.close();	 Catch:{ IOException -> 0x00e1 }
        r0 = r9.c;	 Catch:{ all -> 0x0106 }
        if (r0 == 0) goto L_0x00d0;
    L_0x008a:
        r0 = r9.d;	 Catch:{ all -> 0x0106 }
        r5 = r3.getAbsolutePath();	 Catch:{ all -> 0x0106 }
        r6 = r9.c;	 Catch:{ all -> 0x0106 }
        r0 = r0.getWritableDatabase();	 Catch:{ all -> 0x0106 }
        r7 = 2;
        r7 = new java.lang.String[r7];	 Catch:{ all -> 0x0106 }
        r7[r4] = r10;	 Catch:{ all -> 0x0106 }
        r7[r2] = r5;	 Catch:{ all -> 0x0106 }
        r2 = "asset = ? and cache_path != ?";
        defpackage.anut.a(r0, r2, r7);	 Catch:{ all -> 0x0106 }
        r2 = new android.content.ContentValues;	 Catch:{ all -> 0x0106 }
        r2.<init>();	 Catch:{ all -> 0x0106 }
        r4 = "asset";
        r2.put(r4, r10);	 Catch:{ all -> 0x0106 }
        r10 = "cache_path";
        r2.put(r10, r5);	 Catch:{ all -> 0x0106 }
        r10 = "version";
        r4 = java.lang.Integer.valueOf(r6);	 Catch:{ all -> 0x0106 }
        r2.put(r10, r4);	 Catch:{ all -> 0x0106 }
        r10 = "AssetVersion";
        r4 = 5;
        r0 = r0.insertWithOnConflict(r10, r1, r2, r4);	 Catch:{ all -> 0x0106 }
        r4 = -1;
        r10 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r10 == 0) goto L_0x00c8;
    L_0x00c7:
        goto L_0x00d0;
    L_0x00c8:
        r10 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0106 }
        r0 = "Can't insert entry into the mediapipe db.";
        r10.<init>(r0);	 Catch:{ all -> 0x0106 }
        throw r10;	 Catch:{ all -> 0x0106 }
    L_0x00d0:
        r10 = r3.getAbsolutePath();	 Catch:{ all -> 0x0106 }
        monitor-exit(r9);
        return r10;
    L_0x00d6:
        r2 = move-exception;
        goto L_0x00da;
    L_0x00d8:
        r2 = move-exception;
        r5 = r1;
    L_0x00da:
        if (r5 == 0) goto L_0x00df;
    L_0x00dc:
        r5.close();	 Catch:{ IOException -> 0x00e1 }
    L_0x00df:
        throw r2;	 Catch:{ IOException -> 0x00e1 }
    L_0x00e0:
        r0 = r1;
    L_0x00e1:
        r2 = a;	 Catch:{ all -> 0x0106 }
        r2 = r2.a();	 Catch:{ all -> 0x0106 }
        r2 = (defpackage.amxr) r2;	 Catch:{ all -> 0x0106 }
        r3 = "com/google/mediapipe/framework/AssetCache";
        r4 = "getAbsolutePathFromAsset";
        r5 = 136; // 0x88 float:1.9E-43 double:6.7E-322;
        r6 = "AssetCache.java";
        r2 = r2.a(r3, r4, r5, r6);	 Catch:{ all -> 0x0106 }
        r2 = (defpackage.amxr) r2;	 Catch:{ all -> 0x0106 }
        r3 = "Unable to unpack: %s";
        r2.a(r3, r10);	 Catch:{ all -> 0x0106 }
        if (r0 == 0) goto L_0x0104;
    L_0x00fe:
        r0.close();	 Catch:{ IOException -> 0x0102 }
        goto L_0x0104;
    L_0x0102:
        monitor-exit(r9);
        return r1;
    L_0x0104:
        monitor-exit(r9);
        return r1;
    L_0x0106:
        r10 = move-exception;
        monitor-exit(r9);
        goto L_0x010a;
    L_0x0109:
        throw r10;
    L_0x010a:
        goto L_0x0109;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anuu.b(java.lang.String):java.lang.String");
    }

    private anuu(Context context) {
        this.e = context;
        this.d = new anut(context);
        try {
            this.c = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            ((amxr) ((amxr) a.c()).a("com/google/mediapipe/framework/AssetCache", "<init>", 178, "AssetCache.java")).a("Current app version code: %d", this.c);
            anut anut = this.d;
            int i = this.c;
            SQLiteDatabase writableDatabase = anut.getWritableDatabase();
            String[] strArr = new String[]{Integer.toString(i)};
            String str = "version != ?";
            anut.a(writableDatabase, str, strArr);
            writableDatabase.delete("AssetVersion", str, strArr);
        } catch (NameNotFoundException e) {
            throw new RuntimeException("Can't get app version code.", e);
        }
    }
}
