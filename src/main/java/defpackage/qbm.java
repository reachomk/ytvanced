package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: qbm */
public final class qbm {
    private static final Method a;
    private static final Method b;
    private static final Method c;
    private static final Method d;

    public static WorkSource a(Context context, String str) {
        String str2 = "WorkSourceUtil";
        if (!(context == null || context.getPackageManager() == null || str == null)) {
            String str3;
            try {
                ApplicationInfo a = qph.a(context).a(str, 0);
                if (a == null) {
                    str3 = "Could not get applicationInfo from package: ";
                    Log.e(str2, str.length() == 0 ? new String(str3) : str3.concat(str));
                    return null;
                }
                int i = a.uid;
                WorkSource workSource = new WorkSource();
                Method method = b;
                String str4 = "Unable to assign blame through WorkSource";
                if (method != null) {
                    try {
                        method.invoke(workSource, new Object[]{Integer.valueOf(i), str});
                    } catch (Exception e) {
                        Log.wtf(str2, str4, e);
                    }
                } else {
                    Method method2 = a;
                    if (method2 != null) {
                        try {
                            method2.invoke(workSource, new Object[]{Integer.valueOf(i)});
                        } catch (Exception e2) {
                            Log.wtf(str2, str4, e2);
                        }
                    }
                }
                return workSource;
            } catch (NameNotFoundException unused) {
                str3 = "Could not find package: ";
                if (str.length() == 0) {
                    str = new String(str3);
                } else {
                    str = str3.concat(str);
                }
                Log.e(str2, str);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    public static java.util.List a(android.os.WorkSource r10) {
        /*
        r0 = "Unable to assign blame through WorkSource";
        r1 = "WorkSourceUtil";
        r2 = 0;
        if (r10 != 0) goto L_0x0009;
    L_0x0007:
        r3 = 0;
        goto L_0x001f;
    L_0x0009:
        r3 = c;
        if (r3 == 0) goto L_0x0007;
    L_0x000d:
        r4 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x001a }
        r3 = r3.invoke(r10, r4);	 Catch:{ Exception -> 0x001a }
        r3 = (java.lang.Integer) r3;	 Catch:{ Exception -> 0x001a }
        r3 = r3.intValue();	 Catch:{ Exception -> 0x001a }
        goto L_0x001f;
    L_0x001a:
        r3 = move-exception;
        android.util.Log.wtf(r1, r0, r3);
        goto L_0x0007;
    L_0x001f:
        if (r3 == 0) goto L_0x0051;
    L_0x0021:
        r4 = new java.util.ArrayList;
        r4.<init>();
        r5 = 0;
    L_0x0027:
        if (r5 >= r3) goto L_0x0050;
    L_0x0029:
        r6 = d;
        r7 = 0;
        if (r6 == 0) goto L_0x0043;
    L_0x002e:
        r8 = 1;
        r8 = new java.lang.Object[r8];	 Catch:{ Exception -> 0x003f }
        r9 = java.lang.Integer.valueOf(r5);	 Catch:{ Exception -> 0x003f }
        r8[r2] = r9;	 Catch:{ Exception -> 0x003f }
        r6 = r6.invoke(r10, r8);	 Catch:{ Exception -> 0x003f }
        r6 = (java.lang.String) r6;	 Catch:{ Exception -> 0x003f }
        r7 = r6;
        goto L_0x0043;
    L_0x003f:
        r6 = move-exception;
        android.util.Log.wtf(r1, r0, r6);
    L_0x0043:
        r6 = defpackage.qbh.a(r7);
        if (r6 == 0) goto L_0x004a;
    L_0x0049:
        goto L_0x004d;
    L_0x004a:
        r4.add(r7);
    L_0x004d:
        r5 = r5 + 1;
        goto L_0x0027;
    L_0x0050:
        return r4;
    L_0x0051:
        r10 = java.util.Collections.emptyList();
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qbm.a(android.os.WorkSource):java.util.List");
    }

    public static boolean a(Context context) {
        if (!(context == null || context.getPackageManager() == null)) {
            qpi a = qph.a(context);
            if (a.a.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060 A:{SYNTHETIC, Splitter:B:23:0x0060} */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0076 A:{SYNTHETIC, Splitter:B:29:0x0076} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0048 */
    /* JADX WARNING: Failed to process nested try/catch */
    static {
        /*
        r0 = "add";
        android.os.Process.myUid();
        r1 = 0;
        r2 = 1;
        r3 = 0;
        r4 = android.os.WorkSource.class;
        r5 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x0015 }
        r6 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x0015 }
        r5[r3] = r6;	 Catch:{ Exception -> 0x0015 }
        r4 = r4.getMethod(r0, r5);	 Catch:{ Exception -> 0x0015 }
        goto L_0x0016;
    L_0x0015:
        r4 = r1;
    L_0x0016:
        a = r4;
        r4 = 2;
        r5 = android.os.WorkSource.class;
        r6 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x002a }
        r7 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x002a }
        r6[r3] = r7;	 Catch:{ Exception -> 0x002a }
        r7 = java.lang.String.class;
        r6[r2] = r7;	 Catch:{ Exception -> 0x002a }
        r0 = r5.getMethod(r0, r6);	 Catch:{ Exception -> 0x002a }
        goto L_0x002b;
    L_0x002a:
        r0 = r1;
    L_0x002b:
        b = r0;
        r0 = android.os.WorkSource.class;
        r5 = "size";
        r6 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x0038 }
        r0 = r0.getMethod(r5, r6);	 Catch:{ Exception -> 0x0038 }
        goto L_0x0039;
    L_0x0038:
        r0 = r1;
    L_0x0039:
        c = r0;
        r0 = android.os.WorkSource.class;
        r5 = "get";
        r6 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x0048 }
        r7 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x0048 }
        r6[r3] = r7;	 Catch:{ Exception -> 0x0048 }
        r0.getMethod(r5, r6);	 Catch:{ Exception -> 0x0048 }
    L_0x0048:
        r0 = android.os.WorkSource.class;
        r5 = "getName";
        r6 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x0056 }
        r7 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x0056 }
        r6[r3] = r7;	 Catch:{ Exception -> 0x0056 }
        r1 = r0.getMethod(r5, r6);	 Catch:{ Exception -> 0x0056 }
    L_0x0056:
        d = r1;
        r0 = defpackage.qbf.d();
        r1 = "WorkSourceUtil";
        if (r0 == 0) goto L_0x0070;
    L_0x0060:
        r0 = android.os.WorkSource.class;
        r5 = "createWorkChain";
        r6 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x006a }
        r0.getMethod(r5, r6);	 Catch:{ Exception -> 0x006a }
        goto L_0x0070;
    L_0x006a:
        r0 = move-exception;
        r5 = "Missing WorkChain API createWorkChain";
        android.util.Log.w(r1, r5, r0);
    L_0x0070:
        r0 = defpackage.qbf.d();
        if (r0 == 0) goto L_0x0092;
    L_0x0076:
        r0 = "android.os.WorkSource$WorkChain";
        r0 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x008c }
        r5 = "addNode";
        r4 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x008c }
        r6 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x008c }
        r4[r3] = r6;	 Catch:{ Exception -> 0x008c }
        r3 = java.lang.String.class;
        r4[r2] = r3;	 Catch:{ Exception -> 0x008c }
        r0.getMethod(r5, r4);	 Catch:{ Exception -> 0x008c }
        goto L_0x0092;
    L_0x008c:
        r0 = move-exception;
        r2 = "Missing WorkChain class";
        android.util.Log.w(r1, r2, r0);
    L_0x0092:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qbm.<clinit>():void");
    }
}
