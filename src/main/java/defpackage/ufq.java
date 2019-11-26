package defpackage;

import android.content.res.AssetFileDescriptor;
import android.os.Build.VERSION;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: ufq */
public final class ufq {
    private static final String[] a = new String[]{"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze"};
    private static final String[] b;

    /* JADX WARNING: Removed duplicated region for block: B:73:0x0155 A:{Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }} */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0155 A:{Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }} */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0155 A:{Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }} */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:179:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01d7 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01d7 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01d7 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01fe  */
    /* JADX WARNING: Missing block: B:132:0x0239, code skipped:
            if (r12 == false) goto L_0x029c;
     */
    public static android.content.res.AssetFileDescriptor a(android.content.Context r12, android.net.Uri r13, java.lang.String r14) {
        /*
        r0 = defpackage.ufr.a;
        r1 = r12.getContentResolver();
        r13 = r13.toString();
        r13 = android.net.Uri.parse(r13);
        r2 = r13.getScheme();
        r3 = "android.resource";
        r3 = r3.equals(r2);
        if (r3 != 0) goto L_0x02a4;
    L_0x001a:
        r3 = "content";
        r3 = r3.equals(r2);
        r4 = 0;
        r5 = 1;
        if (r3 != 0) goto L_0x01a3;
    L_0x0024:
        r3 = "file";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x019b;
    L_0x002c:
        r14 = r1.openAssetFileDescriptor(r13, r14);
        r1 = r14.getParcelFileDescriptor();	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r2 = new java.io.File;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r13 = r13.getPath();	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r2.<init>(r13);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r13 = r2.getCanonicalPath();	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r1 = r1.getFileDescriptor();	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r3 = 21;
        if (r2 < r3) goto L_0x0067;
    L_0x004b:
        r2 = new uft;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r2.<init>(r1);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r1 = defpackage.ufu.a(r2);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r1 = (android.system.StructStat) r1;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r2 = new ufu;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r7 = r1.st_dev;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r9 = r1.st_ino;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r1 = r1.st_mode;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r11 = android.system.OsConstants.S_ISLNK(r1);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r6 = r2;
        r6.<init>(r7, r9, r11);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        goto L_0x006b;
    L_0x0067:
        r2 = defpackage.ufv.a(r1);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
    L_0x006b:
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        if (r1 < r3) goto L_0x008b;
    L_0x006f:
        r1 = new ufw;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r1.<init>(r13);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r1 = defpackage.ufu.a(r1);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r1 = (android.system.StructStat) r1;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r3 = new ufu;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r7 = r1.st_dev;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r9 = r1.st_ino;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r1 = r1.st_mode;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r11 = android.system.OsConstants.S_ISLNK(r1);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r6 = r3;
        r6.<init>(r7, r9, r11);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        goto L_0x008f;
    L_0x008b:
        r3 = defpackage.ufv.a(r13);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
    L_0x008f:
        r1 = r3.c;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r6 = "Can't open file: ";
        if (r1 == 0) goto L_0x00af;
    L_0x0095:
        r12 = new java.io.FileNotFoundException;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r13 = java.lang.String.valueOf(r13);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r0 = r13.length();	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        if (r0 != 0) goto L_0x00a7;
    L_0x00a1:
        r13 = new java.lang.String;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r13.<init>(r6);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        goto L_0x00ab;
    L_0x00a7:
        r13 = r6.concat(r13);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
    L_0x00ab:
        r12.<init>(r13);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        throw r12;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
    L_0x00af:
        r7 = r2.a;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r9 = r3.a;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r1 != 0) goto L_0x016d;
    L_0x00b7:
        r1 = r2.b;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r7 = r3.b;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r3 != 0) goto L_0x016d;
    L_0x00bf:
        r1 = "/proc/";
        r1 = r13.startsWith(r1);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        if (r1 != 0) goto L_0x0157;
    L_0x00c7:
        r1 = "/data/misc/";
        r1 = r13.startsWith(r1);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        if (r1 == 0) goto L_0x00d1;
    L_0x00cf:
        goto L_0x0157;
    L_0x00d1:
        r1 = r0.c;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r1 = defpackage.ra.a(r12);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        if (r1 == 0) goto L_0x00e4;
    L_0x00d9:
        r1 = r1.getCanonicalPath();	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r1 = r13.startsWith(r1);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        if (r1 != 0) goto L_0x0151;
    L_0x00e3:
        goto L_0x00f3;
    L_0x00e4:
        r1 = android.os.Environment.getDataDirectory();	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r1 = r1.getCanonicalPath();	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r1 = r13.startsWith(r1);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        if (r1 == 0) goto L_0x00f3;
    L_0x00f2:
        goto L_0x0151;
    L_0x00f3:
        r1 = defpackage.ra.e(r12);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        if (r1 == 0) goto L_0x010a;
    L_0x00f9:
        r1 = defpackage.ra.a(r1);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        if (r1 == 0) goto L_0x010a;
    L_0x00ff:
        r1 = r1.getCanonicalPath();	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r1 = r13.startsWith(r1);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        if (r1 == 0) goto L_0x010a;
    L_0x0109:
        goto L_0x0151;
    L_0x010a:
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r2 = 19;
        if (r1 < r2) goto L_0x0150;
    L_0x0110:
        r1 = new ufp;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r1.<init>(r12);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r1 = defpackage.ufq.a(r1);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r2 = r1.length;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r3 = 0;
    L_0x011b:
        if (r3 >= r2) goto L_0x0130;
    L_0x011d:
        r7 = r1[r3];	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        if (r7 != 0) goto L_0x0122;
    L_0x0121:
        goto L_0x012d;
    L_0x0122:
        r7 = r7.getCanonicalPath();	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r7 = r13.startsWith(r7);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        if (r7 == 0) goto L_0x012d;
    L_0x012c:
        goto L_0x0151;
    L_0x012d:
        r3 = r3 + 1;
        goto L_0x011b;
    L_0x0130:
        r1 = new ufs;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r1.<init>(r12);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r12 = defpackage.ufq.a(r1);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r1 = r12.length;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r2 = 0;
    L_0x013b:
        if (r2 >= r1) goto L_0x0150;
    L_0x013d:
        r3 = r12[r2];	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        if (r3 != 0) goto L_0x0142;
    L_0x0141:
        goto L_0x014d;
    L_0x0142:
        r3 = r3.getCanonicalPath();	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r3 = r13.startsWith(r3);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        if (r3 == 0) goto L_0x014d;
    L_0x014c:
        goto L_0x0151;
    L_0x014d:
        r2 = r2 + 1;
        goto L_0x013b;
    L_0x0150:
        r5 = 0;
    L_0x0151:
        r12 = r0.b;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        if (r5 != r12) goto L_0x0157;
    L_0x0155:
        goto L_0x02a8;
    L_0x0157:
        r12 = new java.io.FileNotFoundException;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r0 = r13.length();	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        if (r0 != 0) goto L_0x0165;
    L_0x015f:
        r13 = new java.lang.String;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r13.<init>(r6);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        goto L_0x0169;
    L_0x0165:
        r13 = r6.concat(r13);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
    L_0x0169:
        r12.<init>(r13);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        throw r12;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
    L_0x016d:
        r12 = new java.io.FileNotFoundException;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r13 = java.lang.String.valueOf(r13);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r0 = r13.length();	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        if (r0 != 0) goto L_0x017f;
    L_0x0179:
        r13 = new java.lang.String;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        r13.<init>(r6);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        goto L_0x0183;
    L_0x017f:
        r13 = r6.concat(r13);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
    L_0x0183:
        r12.<init>(r13);	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
        throw r12;	 Catch:{ FileNotFoundException -> 0x0196, IOException -> 0x0187 }
    L_0x0187:
        r12 = move-exception;
        r13 = new java.io.FileNotFoundException;
        r0 = "Validation failed.";
        r13.<init>(r0);
        r13.initCause(r12);
        defpackage.ufq.a(r14, r13);
        throw r13;
    L_0x0196:
        r12 = move-exception;
        defpackage.ufq.a(r14, r12);
        throw r12;
    L_0x019b:
        r12 = new java.io.FileNotFoundException;
        r13 = "Not implemented. Contact tiktok-users@";
        r12.<init>(r13);
        throw r12;
    L_0x01a3:
        r2 = r14.hashCode();
        r3 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r6 = -1;
        r7 = 2;
        if (r2 == r3) goto L_0x01ca;
    L_0x01ad:
        r3 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        if (r2 == r3) goto L_0x01c0;
    L_0x01b1:
        r3 = 3653; // 0xe45 float:5.119E-42 double:1.805E-320;
        if (r2 == r3) goto L_0x01b6;
    L_0x01b5:
        goto L_0x01d4;
    L_0x01b6:
        r2 = "rw";
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x01d4;
    L_0x01be:
        r2 = 2;
        goto L_0x01d5;
    L_0x01c0:
        r2 = "w";
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x01d4;
    L_0x01c8:
        r2 = 1;
        goto L_0x01d5;
    L_0x01ca:
        r2 = "r";
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x01d4;
    L_0x01d2:
        r2 = 0;
        goto L_0x01d5;
    L_0x01d4:
        r2 = -1;
    L_0x01d5:
        if (r2 == 0) goto L_0x01e2;
    L_0x01d7:
        if (r2 == r5) goto L_0x01e3;
    L_0x01d9:
        if (r2 != r7) goto L_0x01dc;
    L_0x01db:
        goto L_0x01e3;
    L_0x01dc:
        r12 = new java.lang.IllegalArgumentException;
        r12.<init>();
        throw r12;
    L_0x01e2:
        r7 = 1;
    L_0x01e3:
        r2 = r13.getAuthority();
        r3 = 64;
        r3 = r2.indexOf(r3);
        if (r3 < 0) goto L_0x01f4;
    L_0x01ef:
        r3 = r3 + r5;
        r2 = r2.substring(r3);
    L_0x01f4:
        r3 = r12.getPackageManager();
        r3 = r3.resolveContentProvider(r2, r4);
        if (r3 != 0) goto L_0x022b;
    L_0x01fe:
        r3 = r12.getPackageManager();
        r12 = r12.getPackageName();
        r5 = android.os.Process.myUid();
        r12 = r3.queryContentProviders(r12, r5, r4);
        if (r12 == 0) goto L_0x028d;
    L_0x0210:
        r12 = r12.iterator();
    L_0x0214:
        r3 = r12.hasNext();
        if (r3 == 0) goto L_0x028d;
    L_0x021a:
        r3 = r12.next();
        r3 = (android.content.pm.ProviderInfo) r3;
        r3 = r3.authority;
        r3 = r2.equals(r3);
        if (r3 == 0) goto L_0x0214;
    L_0x0228:
        r12 = r0.b;
        goto L_0x0239;
    L_0x022b:
        r5 = r12.getPackageName();
        r8 = r3.packageName;
        r5 = r5.equals(r8);
        if (r5 == 0) goto L_0x023c;
    L_0x0237:
        r12 = r0.b;
    L_0x0239:
        if (r12 == 0) goto L_0x029c;
    L_0x023b:
        goto L_0x028d;
    L_0x023c:
        r5 = r0.b;
        if (r5 != 0) goto L_0x029c;
    L_0x0240:
        r0 = r0.c;
        r0 = android.os.Process.myPid();
        r5 = android.os.Process.myUid();
        r12 = r12.checkUriPermission(r13, r0, r5, r7);
        if (r12 == 0) goto L_0x028d;
    L_0x0250:
        r12 = b;
        r0 = r12.length;
        r5 = 0;
    L_0x0254:
        if (r5 >= r0) goto L_0x0261;
    L_0x0256:
        r7 = r12[r5];
        r7 = r7.equals(r2);
        if (r7 != 0) goto L_0x028d;
    L_0x025e:
        r5 = r5 + 1;
        goto L_0x0254;
    L_0x0261:
        r12 = r3.exported;
        if (r12 == 0) goto L_0x028d;
    L_0x0265:
        r12 = a;
        r0 = r12.length;
    L_0x0268:
        if (r4 >= r0) goto L_0x028d;
    L_0x026a:
        r2 = r12[r4];
        r5 = r2.length();
        r5 = r5 + r6;
        r5 = r2.charAt(r5);
        r7 = 46;
        if (r5 != r7) goto L_0x0282;
    L_0x0279:
        r5 = r3.packageName;
        r2 = r5.startsWith(r2);
        if (r2 != 0) goto L_0x029c;
    L_0x0281:
        goto L_0x028a;
    L_0x0282:
        r5 = r3.packageName;
        r2 = r5.equals(r2);
        if (r2 != 0) goto L_0x029c;
    L_0x028a:
        r4 = r4 + 1;
        goto L_0x0268;
    L_0x028d:
        r14 = r1.openAssetFileDescriptor(r13, r14);
        if (r14 == 0) goto L_0x0294;
    L_0x0293:
        goto L_0x02a8;
    L_0x0294:
        r12 = new java.io.FileNotFoundException;
        r13 = "Content resolver returned null value.";
        r12.<init>(r13);
        throw r12;
    L_0x029c:
        r12 = new java.io.FileNotFoundException;
        r13 = "Can't open content uri.";
        r12.<init>(r13);
        throw r12;
    L_0x02a4:
        r14 = r1.openAssetFileDescriptor(r13, r14);
    L_0x02a8:
        return r14;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ufq.a(android.content.Context, android.net.Uri, java.lang.String):android.content.res.AssetFileDescriptor");
    }

    private static File[] a(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e) {
            if (VERSION.SDK_INT < 22) {
                return new File[0];
            }
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void a(AssetFileDescriptor assetFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            assetFileDescriptor.close();
        } catch (IOException e) {
            if (VERSION.SDK_INT >= 19) {
                ankx.a((Throwable) fileNotFoundException, e);
            }
        }
    }

    static {
        String[] strArr = new String[3];
        strArr[0] = "media";
        String str = "";
        strArr[1] = VERSION.SDK_INT > 25 ? str : "com.google.android.inputmethod.latin.inputcontent";
        if (VERSION.SDK_INT <= 25) {
            str = "com.google.android.inputmethod.latin.dev.inputcontent";
        }
        strArr[2] = str;
        b = strArr;
    }
}
