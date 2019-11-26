package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: xux */
public final class xux {
    public static void a(Context context, String str) {
        String absolutePath;
        try {
            System.loadLibrary(str);
        } catch (NoSuchMethodError | NullPointerException | SecurityException | UnsatisfiedLinkError e) {
            String valueOf = String.valueOf(str);
            String str2 = "System.loadLibrary failed for ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            xtl.b(valueOf, e);
            valueOf = xul.b(context);
            File file = new File(xux.a(context), valueOf);
            File file2 = new File(file, String.format("lib%s.so", new Object[]{str}));
            String.valueOf(file2).length();
            if (file2.exists()) {
                absolutePath = file2.getAbsolutePath();
            } else {
                if (file.exists() || file.mkdirs()) {
                    str2 = context.getApplicationInfo().sourceDir;
                    String valueOf2 = String.valueOf(str2);
                    String str3 = "sourceDir ";
                    if (valueOf2.length() == 0) {
                        valueOf2 = new String(str3);
                    } else {
                        str3.concat(valueOf2);
                    }
                    File[] listFiles = xux.a(context).listFiles();
                    int i = 2;
                    if (listFiles != null) {
                        int length = listFiles.length;
                        int i2 = 0;
                        while (i2 < length) {
                            File file3 = listFiles[i2];
                            boolean z = file3.isDirectory() && !file3.getName().equals(valueOf);
                            Object[] objArr = new Object[i];
                            objArr[0] = file3;
                            objArr[1] = Boolean.valueOf(z);
                            String.format("Found %s, isOldLibDir %s", objArr);
                            if (z) {
                                File[] listFiles2 = file3.listFiles();
                                if (listFiles2 != null) {
                                    for (File a : listFiles2) {
                                        if (xux.a(a)) {
                                            xtl.e(String.format("Successfully deleted an old lib %s", new Object[]{listFiles2[r15]}));
                                        }
                                    }
                                }
                                if (xux.a(file3)) {
                                    xtl.e(String.format("Successfully deleted old libs in %s", new Object[]{file3}));
                                }
                            }
                            i2++;
                            i = 2;
                        }
                    }
                    absolutePath = "lib/%s/%s";
                    if (VERSION.SDK_INT < 21) {
                        try {
                            xux.a(str2, String.format(absolutePath, new Object[]{Build.CPU_ABI, r4}), file2);
                            xtl.e(String.format("Successfully unzipped first try %s/%s", new Object[]{str2, valueOf}));
                        } catch (IOException unused) {
                            try {
                                xux.a(str2, String.format(absolutePath, new Object[]{Build.CPU_ABI2, r4}), file2);
                                xtl.e(String.format("Successfully unzipped second try %s/%s", new Object[]{str2, valueOf}));
                            } catch (IOException unused2) {
                                xux.a(file2);
                            }
                        }
                    } else {
                        int length2 = Build.SUPPORTED_ABIS.length;
                        i = 0;
                        while (i < length2) {
                            try {
                                xux.a(str2, String.format(absolutePath, new Object[]{r1[i], r4}), file2);
                                try {
                                    xtl.e(String.format("Successfully unzipped supported %s/%s", new Object[]{str2, String.format(absolutePath, new Object[]{r1[i], r4})}));
                                } catch (IOException unused3) {
                                    continue;
                                }
                            } catch (IOException unused4) {
                                i++;
                            }
                        }
                        valueOf = String.valueOf(Arrays.toString(Build.SUPPORTED_ABIS));
                        str2 = "Failed to unzip from either of ABIs: ";
                        if (valueOf.length() == 0) {
                            valueOf = new String(str2);
                        } else {
                            valueOf = str2.concat(valueOf);
                        }
                        xtl.d(valueOf);
                        xux.a(file2);
                    }
                    absolutePath = file2.getAbsolutePath();
                    break;
                }
                valueOf = String.valueOf(file);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 30);
                stringBuilder.append("Cannot create cache directory ");
                stringBuilder.append(valueOf);
                xtl.c(stringBuilder.toString());
                absolutePath = null;
            }
            if (absolutePath != null) {
                System.load(absolutePath);
                String valueOf3 = String.valueOf(str);
                valueOf = "Successfully recovered and loaded ";
                xtl.d(valueOf3.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf3));
                return;
            }
            str2 = String.valueOf(str);
            String str4 = "Cannot find or unzip library: ";
            UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(str2.length() == 0 ? new String(str4) : str4.concat(str2));
            unsatisfiedLinkError.initCause(e);
            throw unsatisfiedLinkError;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0076  */
    private static void a(java.lang.String r4, java.lang.String r5, java.io.File r6) {
        /*
        r0 = 0;
        r1 = new java.util.zip.ZipFile;	 Catch:{ all -> 0x0066 }
        r1.<init>(r4);	 Catch:{ all -> 0x0066 }
        r2 = r1.getEntry(r5);	 Catch:{ all -> 0x0062 }
        if (r2 == 0) goto L_0x0030;
    L_0x000c:
        r4 = new java.io.BufferedInputStream;	 Catch:{ all -> 0x0062 }
        r5 = r1.getInputStream(r2);	 Catch:{ all -> 0x0062 }
        r4.<init>(r5);	 Catch:{ all -> 0x0062 }
        r5 = new java.io.FileOutputStream;	 Catch:{ all -> 0x002d }
        r5.<init>(r6);	 Catch:{ all -> 0x002d }
        defpackage.anaz.a(r4, r5);	 Catch:{ all -> 0x002a }
        r5.flush();	 Catch:{ all -> 0x002a }
        r5.close();
        r4.close();
        r1.close();
        return;
    L_0x002a:
        r6 = move-exception;
        r0 = r5;
        goto L_0x006a;
    L_0x002d:
        r5 = move-exception;
        r6 = r5;
        goto L_0x006a;
    L_0x0030:
        r6 = new java.io.IOException;	 Catch:{ all -> 0x0062 }
        r2 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x0062 }
        r2 = r2.length();	 Catch:{ all -> 0x0062 }
        r2 = r2 + 17;
        r3 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x0062 }
        r3 = r3.length();	 Catch:{ all -> 0x0062 }
        r2 = r2 + r3;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0062 }
        r3.<init>(r2);	 Catch:{ all -> 0x0062 }
        r2 = "Did not find ";
        r3.append(r2);	 Catch:{ all -> 0x0062 }
        r3.append(r5);	 Catch:{ all -> 0x0062 }
        r5 = " in ";
        r3.append(r5);	 Catch:{ all -> 0x0062 }
        r3.append(r4);	 Catch:{ all -> 0x0062 }
        r4 = r3.toString();	 Catch:{ all -> 0x0062 }
        r6.<init>(r4);	 Catch:{ all -> 0x0062 }
        throw r6;	 Catch:{ all -> 0x0062 }
    L_0x0062:
        r4 = move-exception;
        r6 = r4;
        r4 = r0;
        goto L_0x006a;
    L_0x0066:
        r4 = move-exception;
        r6 = r4;
        r4 = r0;
        r1 = r4;
    L_0x006a:
        if (r0 == 0) goto L_0x006f;
    L_0x006c:
        r0.close();
    L_0x006f:
        if (r4 == 0) goto L_0x0074;
    L_0x0071:
        r4.close();
    L_0x0074:
        if (r1 == 0) goto L_0x0079;
    L_0x0076:
        r1.close();
    L_0x0079:
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xux.a(java.lang.String, java.lang.String, java.io.File):void");
    }

    private static File a(Context context) {
        return new File(context.getFilesDir(), "libs");
    }

    private static boolean a(File file) {
        if (file.exists()) {
            return file.delete();
        }
        xtl.e(String.format("Failed to delete file %s because it does not exist", new Object[]{file}));
        return false;
    }
}
