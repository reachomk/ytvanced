package defpackage;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: xlx */
public final class xlx implements xmc {
    private final Context a;
    private final StorageManager b;
    private Map c;
    private final Object d = new Object();

    public xlx(Context context) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (StorageManager) context.getSystemService("storage");
        this.c = null;
    }

    public final boolean a() {
        return this.a.getExternalFilesDirs(null).length > 1;
    }

    public final Map b() {
        Map hashMap = new HashMap();
        for (File file : i()) {
            if (file != null) {
                hashMap.put(a(file), Boolean.valueOf(xlx.b(file)));
            }
        }
        return amur.a(hashMap);
    }

    public final boolean a(String str) {
        Boolean bool = (Boolean) b().get(str);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean c() {
        File d = d();
        return d != null && xlx.b(d);
    }

    private static boolean b(File file) {
        return Environment.getStorageState(file).equals("mounted");
    }

    public final File d() {
        List i = i();
        return !i.isEmpty() ? (File) i.get(0) : null;
    }

    public final File b(String str) {
        for (File file : i()) {
            if (a(file).equals(str)) {
                return file;
            }
        }
        return null;
    }

    private final List i() {
        if (!a()) {
            return amul.g();
        }
        try {
            Collection arrayList = new ArrayList();
            File[] externalFilesDirs = this.a.getExternalFilesDirs(null);
            for (int i = 1; i < externalFilesDirs.length; i++) {
                Object obj = externalFilesDirs[i];
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            return amul.a(arrayList);
        } catch (ArrayIndexOutOfBoundsException unused) {
            return amul.g();
        }
    }

    public final long e() {
        if (!c()) {
            return 0;
        }
        StatFs statFs = new StatFs(d().getAbsolutePath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007a */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087 A:{Catch:{ all -> 0x006a }} */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0020 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b9 A:{Catch:{ all -> 0x006a }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x007d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0079 */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087 A:{Catch:{ all -> 0x006a }} */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b9 A:{Catch:{ all -> 0x006a }} */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0020 A:{SYNTHETIC} */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:20|21|33|34|(2:36|(1:38)(4:39|(2:41|(1:43))|44|(1:46)))|47|(2:49|57)(1:56)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:22|27|28|58|29|30) */
    public final java.util.Map f() {
        /*
        r9 = this;
        r0 = r9.d;
        monitor-enter(r0);
        r1 = r9.c;	 Catch:{ all -> 0x00cc }
        if (r1 == 0) goto L_0x000d;
    L_0x0007:
        r1 = defpackage.amur.a(r1);	 Catch:{ all -> 0x00cc }
        monitor-exit(r0);	 Catch:{ all -> 0x00cc }
        return r1;
    L_0x000d:
        r1 = new java.util.HashMap;	 Catch:{ all -> 0x00cc }
        r1.<init>();	 Catch:{ all -> 0x00cc }
        r9.c = r1;	 Catch:{ all -> 0x00cc }
        r1 = r9.i();	 Catch:{ all -> 0x00cc }
        r2 = r9.b();	 Catch:{ all -> 0x00cc }
        r1 = r1.iterator();	 Catch:{ all -> 0x00cc }
    L_0x0020:
        r3 = r1.hasNext();	 Catch:{ all -> 0x00cc }
        if (r3 == 0) goto L_0x00c4;
    L_0x0026:
        r3 = r1.next();	 Catch:{ all -> 0x00cc }
        r3 = (java.io.File) r3;	 Catch:{ all -> 0x00cc }
        r4 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x00cc }
        r5 = r9.a(r3);	 Catch:{ all -> 0x00cc }
        r5 = r2.get(r5);	 Catch:{ all -> 0x00cc }
        r4 = r4.equals(r5);	 Catch:{ all -> 0x00cc }
        if (r4 == 0) goto L_0x0020;
    L_0x003c:
        r4 = new java.io.File;	 Catch:{ all -> 0x00cc }
        r5 = "sdcard";
        r4.<init>(r3, r5);	 Catch:{ all -> 0x00cc }
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00cc }
        r5.<init>();	 Catch:{ all -> 0x00cc }
        r6 = defpackage.anbe.a();	 Catch:{ all -> 0x00cc }
        r7 = new java.io.BufferedReader;	 Catch:{ FileNotFoundException -> 0x007a, IOException -> 0x006c }
        r8 = new java.io.FileReader;	 Catch:{ FileNotFoundException -> 0x007a, IOException -> 0x006c }
        r8.<init>(r4);	 Catch:{ FileNotFoundException -> 0x007a, IOException -> 0x006c }
        r7.<init>(r8);	 Catch:{ FileNotFoundException -> 0x007a, IOException -> 0x006c }
        r7 = r6.a(r7);	 Catch:{ FileNotFoundException -> 0x007a, IOException -> 0x006c }
        r7 = (java.io.BufferedReader) r7;	 Catch:{ FileNotFoundException -> 0x007a, IOException -> 0x006c }
    L_0x005c:
        r8 = r7.readLine();	 Catch:{ FileNotFoundException -> 0x007a, IOException -> 0x006c }
        if (r8 == 0) goto L_0x0066;
    L_0x0062:
        r5.append(r8);	 Catch:{ FileNotFoundException -> 0x007a, IOException -> 0x006c }
        goto L_0x005c;
    L_0x0066:
        r6.close();	 Catch:{ Exception -> 0x007d }
        goto L_0x007d;
    L_0x006a:
        r1 = move-exception;
        goto L_0x0076;
    L_0x006c:
        r7 = move-exception;
        r8 = "Error getting sdcard id from sdcard file";
        defpackage.xtl.a(r8, r7);	 Catch:{ all -> 0x006a }
        r6.close();	 Catch:{ Exception -> 0x007d }
        goto L_0x007d;
    L_0x0076:
        r6.close();	 Catch:{ Exception -> 0x0079 }
    L_0x0079:
        throw r1;	 Catch:{ all -> 0x00cc }
    L_0x007a:
        r6.close();	 Catch:{ Exception -> 0x007d }
    L_0x007d:
        r5 = r5.toString();	 Catch:{ all -> 0x00cc }
        r6 = android.text.TextUtils.isEmpty(r5);	 Catch:{ all -> 0x00cc }
        if (r6 == 0) goto L_0x00b3;
    L_0x0087:
        r6 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x00cc }
        r7 = 24;
        if (r6 >= r7) goto L_0x0092;
    L_0x008d:
        r5 = defpackage.xlx.c(r4);	 Catch:{ all -> 0x00cc }
        goto L_0x00b3;
    L_0x0092:
        r6 = r9.b;	 Catch:{ all -> 0x00cc }
        r6 = r6.getStorageVolume(r4);	 Catch:{ all -> 0x00cc }
        if (r6 == 0) goto L_0x00a9;
    L_0x009a:
        r6 = r6.getUuid();	 Catch:{ all -> 0x00cc }
        r7 = android.text.TextUtils.isEmpty(r6);	 Catch:{ all -> 0x00cc }
        if (r7 != 0) goto L_0x00a9;
    L_0x00a4:
        r5 = 3;
        r5 = defpackage.xlx.a(r6, r5);	 Catch:{ all -> 0x00cc }
    L_0x00a9:
        r6 = android.text.TextUtils.isEmpty(r5);	 Catch:{ all -> 0x00cc }
        if (r6 == 0) goto L_0x00b3;
    L_0x00af:
        r5 = defpackage.xlx.c(r4);	 Catch:{ all -> 0x00cc }
    L_0x00b3:
        r4 = android.text.TextUtils.isEmpty(r5);	 Catch:{ all -> 0x00cc }
        if (r4 != 0) goto L_0x0020;
    L_0x00b9:
        r4 = r9.c;	 Catch:{ all -> 0x00cc }
        r3 = r9.a(r3);	 Catch:{ all -> 0x00cc }
        r4.put(r3, r5);	 Catch:{ all -> 0x00cc }
        goto L_0x0020;
    L_0x00c4:
        r1 = r9.c;	 Catch:{ all -> 0x00cc }
        r1 = defpackage.amur.a(r1);	 Catch:{ all -> 0x00cc }
        monitor-exit(r0);	 Catch:{ all -> 0x00cc }
        return r1;
    L_0x00cc:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00cc }
        goto L_0x00d0;
    L_0x00cf:
        throw r1;
    L_0x00d0:
        goto L_0x00cf;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xlx.f():java.util.Map");
    }

    public final String g() {
        return xlx.a("0000-0000", 1);
    }

    public final String a(File file) {
        if (file == null) {
            return "";
        }
        try {
            file = file.getCanonicalPath();
            return file;
        } catch (IOException unused) {
            return file.getAbsolutePath();
        }
    }

    public final void h() {
        synchronized (this.d) {
            this.c = null;
        }
    }

    private static String c(File file) {
        String a = xlx.a(UUID.randomUUID().toString(), 2);
        anbe a2 = anbe.a();
        try {
            ((FileWriter) a2.a(new FileWriter(file))).write(a);
            try {
                a2.close();
            } catch (Exception unused) {
            }
            return a;
        } catch (IOException e) {
            xtl.a("Error writing sdcard id", e);
            try {
                a2.close();
            } catch (Exception unused2) {
            }
            return null;
        } catch (Throwable e2) {
            try {
                a2.close();
            } catch (Exception unused3) {
            }
            throw e2;
        }
    }

    private static String a(String str, int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id:");
        stringBuilder.append(str);
        stringBuilder.append(";t:");
        stringBuilder.append(i);
        return stringBuilder.toString();
    }
}
