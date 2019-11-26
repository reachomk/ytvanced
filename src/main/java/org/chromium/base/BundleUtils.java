package org.chromium.base;

public class BundleUtils {
    private static final boolean a;

    public static boolean isBundle() {
        return a;
    }

    /* JADX WARNING: Missing block: B:10:0x0019, code skipped:
            if (r0 != null) goto L_0x001b;
     */
    /* JADX WARNING: Missing block: B:12:?, code skipped:
            r0.close();
     */
    /* JADX WARNING: Missing block: B:13:0x001f, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:14:0x0020, code skipped:
            defpackage.ankx.a(r2, r0);
     */
    private static java.lang.String getNativeLibraryPath(java.lang.String r2) {
        /*
        r0 = defpackage.bchz.b();
        r1 = defpackage.bchn.a;	 Catch:{ all -> 0x0016 }
        r1 = r1.getClassLoader();	 Catch:{ all -> 0x0016 }
        r1 = (dalvik.system.BaseDexClassLoader) r1;	 Catch:{ all -> 0x0016 }
        r2 = r1.findLibrary(r2);	 Catch:{ all -> 0x0016 }
        if (r0 == 0) goto L_0x0015;
    L_0x0012:
        r0.close();
    L_0x0015:
        return r2;
    L_0x0016:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x0018 }
    L_0x0018:
        r1 = move-exception;
        if (r0 == 0) goto L_0x0023;
    L_0x001b:
        r0.close();	 Catch:{ all -> 0x001f }
        goto L_0x0023;
    L_0x001f:
        r0 = move-exception;
        defpackage.ankx.a(r2, r0);
    L_0x0023:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.BundleUtils.getNativeLibraryPath(java.lang.String):java.lang.String");
    }

    static {
        boolean z;
        try {
            Class.forName("org.chromium.base.BundleCanary");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
    }
}
