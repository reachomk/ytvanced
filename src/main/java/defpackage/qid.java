package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: qid */
final class qid {
    qid() {
    }

    /* Access modifiers changed, original: final */
    public final qig a(Context context, String str) {
        qig qig = new qig(qht.a(), System.currentTimeMillis());
        try {
            qig b = qid.b(context, str);
            if (b != null) {
                return b;
            }
        } catch (qif unused) {
        }
        qid.a(context, str, qig);
        qid.b(context, str, qig);
        return qig;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0010 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:4|5|6|7) */
    public static defpackage.qig b(android.content.Context r6, java.lang.String r7) {
        /*
        r0 = 0;
        r1 = defpackage.qid.c(r6, r7);	 Catch:{ qif -> 0x0045 }
        r2 = r1.exists();	 Catch:{ qif -> 0x0045 }
        if (r2 == 0) goto L_0x003c;
    L_0x000b:
        r1 = defpackage.qid.a(r1);	 Catch:{ IOException -> 0x0010 }
        goto L_0x003d;
    L_0x0010:
        r1 = defpackage.qid.a(r1);	 Catch:{ IOException -> 0x0015 }
        goto L_0x003d;
    L_0x0015:
        r1 = move-exception;
        r2 = "InstanceID";
        r3 = java.lang.String.valueOf(r1);	 Catch:{ qif -> 0x0045 }
        r4 = r3.length();	 Catch:{ qif -> 0x0045 }
        r4 = r4 + 45;
        r5 = new java.lang.StringBuilder;	 Catch:{ qif -> 0x0045 }
        r5.<init>(r4);	 Catch:{ qif -> 0x0045 }
        r4 = "IID file exists, but failed to read from it: ";
        r5.append(r4);	 Catch:{ qif -> 0x0045 }
        r5.append(r3);	 Catch:{ qif -> 0x0045 }
        r3 = r5.toString();	 Catch:{ qif -> 0x0045 }
        android.util.Log.w(r2, r3);	 Catch:{ qif -> 0x0045 }
        r2 = new qif;	 Catch:{ qif -> 0x0045 }
        r2.<init>(r1);	 Catch:{ qif -> 0x0045 }
        throw r2;	 Catch:{ qif -> 0x0045 }
    L_0x003c:
        r1 = r0;
    L_0x003d:
        if (r1 == 0) goto L_0x0043;
    L_0x003f:
        defpackage.qid.b(r6, r7, r1);	 Catch:{ qif -> 0x0045 }
        return r1;
    L_0x0043:
        r1 = r0;
        goto L_0x0046;
    L_0x0045:
        r1 = move-exception;
    L_0x0046:
        r2 = "com.google.android.gms.appid";
        r3 = 0;
        r2 = r6.getSharedPreferences(r2, r3);	 Catch:{ qif -> 0x0057 }
        r2 = defpackage.qid.a(r2, r7);	 Catch:{ qif -> 0x0057 }
        if (r2 == 0) goto L_0x0059;
    L_0x0053:
        defpackage.qid.a(r6, r7, r2);	 Catch:{ qif -> 0x0057 }
        return r2;
    L_0x0057:
        r6 = move-exception;
        r1 = r6;
    L_0x0059:
        if (r1 != 0) goto L_0x005c;
    L_0x005b:
        return r0;
    L_0x005c:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qid.b(android.content.Context, java.lang.String):qig");
    }

    private static KeyPair a(String str, String str2) {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance("RSA");
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                str2 = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(str2.length() + 19);
                stringBuilder.append("Invalid key stored ");
                stringBuilder.append(str2);
                Log.w("InstanceID", stringBuilder.toString());
                throw new qif(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new qif(e2);
        }
    }

    /* JADX WARNING: Missing block: B:13:?, code skipped:
            defpackage.qid.a(r3, r5);
     */
    private static void a(android.content.Context r3, java.lang.String r4, defpackage.qig r5) {
        /*
        r3 = defpackage.qid.c(r3, r4);	 Catch:{ IOException -> 0x003d }
        r3.createNewFile();	 Catch:{ IOException -> 0x003d }
        r4 = new java.util.Properties;	 Catch:{ IOException -> 0x003d }
        r4.<init>();	 Catch:{ IOException -> 0x003d }
        r0 = "pub";
        r1 = r5.a();	 Catch:{ IOException -> 0x003d }
        r4.setProperty(r0, r1);	 Catch:{ IOException -> 0x003d }
        r0 = "pri";
        r1 = r5.b();	 Catch:{ IOException -> 0x003d }
        r4.setProperty(r0, r1);	 Catch:{ IOException -> 0x003d }
        r0 = "cre";
        r1 = r5.b;	 Catch:{ IOException -> 0x003d }
        r5 = java.lang.String.valueOf(r1);	 Catch:{ IOException -> 0x003d }
        r4.setProperty(r0, r5);	 Catch:{ IOException -> 0x003d }
        r5 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x003d }
        r5.<init>(r3);	 Catch:{ IOException -> 0x003d }
        r3 = 0;
        r4.store(r5, r3);	 Catch:{ all -> 0x0036 }
        defpackage.qid.a(r3, r5);	 Catch:{ IOException -> 0x003d }
        return;
    L_0x0036:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x0038 }
    L_0x0038:
        r4 = move-exception;
        defpackage.qid.a(r3, r5);	 Catch:{ IOException -> 0x003d }
        throw r4;	 Catch:{ IOException -> 0x003d }
    L_0x003d:
        r3 = move-exception;
        r3 = java.lang.String.valueOf(r3);
        r4 = r3.length();
        r5 = new java.lang.StringBuilder;
        r4 = r4 + 21;
        r5.<init>(r4);
        r4 = "Failed to write key: ";
        r5.append(r4);
        r5.append(r3);
        r3 = r5.toString();
        r4 = "InstanceID";
        android.util.Log.w(r4, r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qid.a(android.content.Context, java.lang.String, qig):void");
    }

    public static File a(Context context) {
        File d = ra.d(context);
        if (d != null && d.isDirectory()) {
            return d;
        }
        Log.w("InstanceID", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    private static File c(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "com.google.InstanceId.properties";
        } else {
            try {
                str = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 33);
                stringBuilder.append("com.google.InstanceId_");
                stringBuilder.append(str);
                stringBuilder.append(".properties");
                str = stringBuilder.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        return new File(qid.a(context), str);
    }

    /* JADX WARNING: Missing block: B:23:0x0044, code skipped:
            defpackage.qid.a(r6, r0);
     */
    private static defpackage.qig a(java.io.File r6) {
        /*
        r0 = new java.io.FileInputStream;
        r0.<init>(r6);
        r6 = new java.util.Properties;	 Catch:{ all -> 0x0041 }
        r6.<init>();	 Catch:{ all -> 0x0041 }
        r6.load(r0);	 Catch:{ all -> 0x0041 }
        r1 = "pub";
        r1 = r6.getProperty(r1);	 Catch:{ all -> 0x0041 }
        r2 = "pri";
        r2 = r6.getProperty(r2);	 Catch:{ all -> 0x0041 }
        r3 = 0;
        if (r1 != 0) goto L_0x001d;
    L_0x001c:
        goto L_0x003d;
    L_0x001d:
        if (r2 == 0) goto L_0x003d;
    L_0x001f:
        r1 = defpackage.qid.a(r1, r2);	 Catch:{ all -> 0x0041 }
        r2 = "cre";
        r6 = r6.getProperty(r2);	 Catch:{ NumberFormatException -> 0x0036 }
        r4 = java.lang.Long.parseLong(r6);	 Catch:{ NumberFormatException -> 0x0036 }
        r6 = new qig;	 Catch:{ all -> 0x0041 }
        r6.<init>(r1, r4);	 Catch:{ all -> 0x0041 }
        defpackage.qid.a(r3, r0);
        return r6;
    L_0x0036:
        r6 = move-exception;
        r1 = new qif;	 Catch:{ all -> 0x0041 }
        r1.<init>(r6);	 Catch:{ all -> 0x0041 }
        throw r1;	 Catch:{ all -> 0x0041 }
    L_0x003d:
        defpackage.qid.a(r3, r0);
        return r3;
    L_0x0041:
        r6 = move-exception;
        throw r6;	 Catch:{ all -> 0x0043 }
    L_0x0043:
        r1 = move-exception;
        defpackage.qid.a(r6, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qid.a(java.io.File):qig");
    }

    private static qig a(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(qhz.a(str, "|P|"), null);
        String string2 = sharedPreferences.getString(qhz.a(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        KeyPair a = qid.a(string, string2);
        String string3 = sharedPreferences.getString(qhz.a(str, "cre"), null);
        long j = 0;
        if (string3 != null) {
            try {
                j = Long.parseLong(string3);
            } catch (NumberFormatException unused) {
            }
        }
        return new qig(a, j);
    }

    private static void b(Context context, String str, qig qig) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (qig.equals(qid.a(sharedPreferences, str))) {
                return;
            }
        } catch (qif unused) {
        }
        Editor edit = sharedPreferences.edit();
        edit.putString(qhz.a(str, "|P|"), qig.a());
        edit.putString(qhz.a(str, "|K|"), qig.b());
        edit.putString(qhz.a(str, "cre"), String.valueOf(qig.b));
        edit.commit();
    }
}
