package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Base64;
import android.util.Log;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: anpc */
public final class anpc {
    private final Context a;
    private String b;
    private String c;
    private int d;
    private int e = 0;

    public anpc(Context context) {
        this.a = context;
    }

    /* JADX WARNING: Missing block: B:36:0x0076, code skipped:
            return r1;
     */
    public final synchronized int a() {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.e;	 Catch:{ all -> 0x0079 }
        if (r0 != 0) goto L_0x0077;
    L_0x0005:
        r0 = r5.a;	 Catch:{ all -> 0x0079 }
        r0 = r0.getPackageManager();	 Catch:{ all -> 0x0079 }
        r1 = "com.google.android.c2dm.permission.SEND";
        r2 = "com.google.android.gms";
        r1 = r0.checkPermission(r1, r2);	 Catch:{ all -> 0x0079 }
        r2 = -1;
        r3 = 0;
        if (r1 != r2) goto L_0x0020;
    L_0x0017:
        r0 = "FirebaseInstanceId";
        r1 = "Google Play services missing or without correct permission.";
        android.util.Log.e(r0, r1);	 Catch:{ all -> 0x0079 }
        monitor-exit(r5);
        return r3;
    L_0x0020:
        r1 = defpackage.qbf.c();	 Catch:{ all -> 0x0079 }
        r2 = 1;
        if (r1 != 0) goto L_0x0044;
    L_0x0027:
        r1 = new android.content.Intent;	 Catch:{ all -> 0x0079 }
        r4 = "com.google.android.c2dm.intent.REGISTER";
        r1.<init>(r4);	 Catch:{ all -> 0x0079 }
        r4 = "com.google.android.gms";
        r1.setPackage(r4);	 Catch:{ all -> 0x0079 }
        r1 = r0.queryIntentServices(r1, r3);	 Catch:{ all -> 0x0079 }
        if (r1 == 0) goto L_0x0044;
    L_0x0039:
        r1 = r1.size();	 Catch:{ all -> 0x0079 }
        if (r1 > 0) goto L_0x0040;
    L_0x003f:
        goto L_0x0044;
    L_0x0040:
        r5.e = r2;	 Catch:{ all -> 0x0079 }
        monitor-exit(r5);
        return r2;
    L_0x0044:
        r1 = new android.content.Intent;	 Catch:{ all -> 0x0079 }
        r4 = "com.google.iid.TOKEN_REQUEST";
        r1.<init>(r4);	 Catch:{ all -> 0x0079 }
        r4 = "com.google.android.gms";
        r1.setPackage(r4);	 Catch:{ all -> 0x0079 }
        r0 = r0.queryBroadcastReceivers(r1, r3);	 Catch:{ all -> 0x0079 }
        r1 = 2;
        if (r0 != 0) goto L_0x0058;
    L_0x0057:
        goto L_0x0062;
    L_0x0058:
        r0 = r0.size();	 Catch:{ all -> 0x0079 }
        if (r0 <= 0) goto L_0x0062;
    L_0x005e:
        r5.e = r1;	 Catch:{ all -> 0x0079 }
        monitor-exit(r5);
        return r1;
    L_0x0062:
        r0 = "FirebaseInstanceId";
        r3 = "Failed to resolve IID implementation package, falling back";
        android.util.Log.w(r0, r3);	 Catch:{ all -> 0x0079 }
        r0 = defpackage.qbf.c();	 Catch:{ all -> 0x0079 }
        if (r0 == 0) goto L_0x0072;
    L_0x006f:
        r5.e = r1;	 Catch:{ all -> 0x0079 }
        goto L_0x0075;
    L_0x0072:
        r5.e = r2;	 Catch:{ all -> 0x0079 }
        r1 = 1;
    L_0x0075:
        monitor-exit(r5);
        return r1;
    L_0x0077:
        monitor-exit(r5);
        return r0;
    L_0x0079:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anpc.a():int");
    }

    public static String a(anlf anlf) {
        String str = anlf.b().b;
        if (str != null) {
            return str;
        }
        String str2 = anlf.b().a;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length >= 2) {
            str2 = split[1];
            if (!str2.isEmpty()) {
                return str2;
            }
        }
        return null;
    }

    public static String a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public final synchronized String b() {
        if (this.b == null) {
            e();
        }
        return this.b;
    }

    public final synchronized String c() {
        if (this.c == null) {
            e();
        }
        return this.c;
    }

    public final synchronized int d() {
        if (this.d == 0) {
            PackageInfo a = a("com.google.android.gms");
            if (a != null) {
                this.d = a.versionCode;
            }
        }
        return this.d;
    }

    private final synchronized void e() {
        PackageInfo a = a(this.a.getPackageName());
        if (a != null) {
            this.b = Integer.toString(a.versionCode);
            this.c = a.versionName;
        }
    }

    private final PackageInfo a(String str) {
        try {
            return this.a.getPackageManager().getPackageInfo(str, 0);
        } catch (NameNotFoundException e) {
            str = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(str.length() + 23);
            stringBuilder.append("Failed to find package ");
            stringBuilder.append(str);
            Log.w("FirebaseInstanceId", stringBuilder.toString());
            return null;
        }
    }
}
