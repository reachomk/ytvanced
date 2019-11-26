package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

/* renamed from: anqm */
final class anqm {
    anqm() {
    }

    static anql a(Context context, String str) {
        anql anql = new anql(anop.a(), System.currentTimeMillis());
        anql a = anqm.a(context, str, anql, true);
        if (a != null && !a.equals(anql)) {
            return a;
        }
        anqm.a(context, str, anql);
        return anql;
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
                Log.w("FirebaseInstanceId", stringBuilder.toString());
                throw new anqo(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new anqo(e2);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0052 */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|(7:11|12|13|14|15|16|17)|18|19|20|21|22|23|24) */
    /* JADX WARNING: Missing block: B:29:0x0066, code skipped:
            if (r6 != null) goto L_0x0069;
     */
    /* JADX WARNING: Missing block: B:31:?, code skipped:
            defpackage.anqm.a(r8, r6);
     */
    /* JADX WARNING: Missing block: B:38:?, code skipped:
            defpackage.anqm.a(r6, r1);
     */
    public static defpackage.anql a(android.content.Context r6, java.lang.String r7, defpackage.anql r8, boolean r9) {
        /*
        r0 = new java.util.Properties;
        r0.<init>();
        r1 = r8.a();
        r2 = "pub";
        r0.setProperty(r2, r1);
        r1 = r8.b();
        r2 = "pri";
        r0.setProperty(r2, r1);
        r1 = r8.b;
        r1 = java.lang.String.valueOf(r1);
        r2 = "cre";
        r0.setProperty(r2, r1);
        r6 = defpackage.anqm.b(r6, r7);
        r7 = 0;
        r6.createNewFile();	 Catch:{ IOException -> 0x0074 }
        r1 = new java.io.RandomAccessFile;	 Catch:{ IOException -> 0x0074 }
        r2 = "rw";
        r1.<init>(r6, r2);	 Catch:{ IOException -> 0x0074 }
        r6 = r1.getChannel();	 Catch:{ all -> 0x006d }
        r6.lock();	 Catch:{ all -> 0x0063 }
        r2 = 0;
        if (r9 == 0) goto L_0x0052;
    L_0x003c:
        r4 = r6.size();	 Catch:{ all -> 0x0063 }
        r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r9 <= 0) goto L_0x0052;
    L_0x0044:
        r6.position(r2);	 Catch:{ anqo | IOException -> 0x0052, anqo | IOException -> 0x0052 }
        r8 = defpackage.anqm.a(r6);	 Catch:{ anqo | IOException -> 0x0052, anqo | IOException -> 0x0052 }
        defpackage.anqm.a(r7, r6);	 Catch:{ all -> 0x006d }
        defpackage.anqm.a(r7, r1);	 Catch:{ IOException -> 0x0074 }
        return r8;
    L_0x0052:
        r6.position(r2);	 Catch:{ all -> 0x0063 }
        r9 = java.nio.channels.Channels.newOutputStream(r6);	 Catch:{ all -> 0x0063 }
        r0.store(r9, r7);	 Catch:{ all -> 0x0063 }
        defpackage.anqm.a(r7, r6);	 Catch:{ all -> 0x006d }
        defpackage.anqm.a(r7, r1);	 Catch:{ IOException -> 0x0074 }
        return r8;
    L_0x0063:
        r8 = move-exception;
        throw r8;	 Catch:{ all -> 0x0065 }
    L_0x0065:
        r9 = move-exception;
        if (r6 != 0) goto L_0x0069;
    L_0x0068:
        goto L_0x006c;
    L_0x0069:
        defpackage.anqm.a(r8, r6);	 Catch:{ all -> 0x006d }
    L_0x006c:
        throw r9;	 Catch:{ all -> 0x006d }
    L_0x006d:
        r6 = move-exception;
        throw r6;	 Catch:{ all -> 0x006f }
    L_0x006f:
        r8 = move-exception;
        defpackage.anqm.a(r6, r1);	 Catch:{ IOException -> 0x0074 }
        throw r8;	 Catch:{ IOException -> 0x0074 }
    L_0x0074:
        r6 = move-exception;
        r6 = java.lang.String.valueOf(r6);
        r8 = r6.length();
        r9 = new java.lang.StringBuilder;
        r8 = r8 + 21;
        r9.<init>(r8);
        r8 = "Failed to write key: ";
        r9.append(r8);
        r9.append(r6);
        r6 = r9.toString();
        r8 = "FirebaseInstanceId";
        android.util.Log.w(r8, r6);
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anqm.a(android.content.Context, java.lang.String, anql, boolean):anql");
    }

    public static File a(Context context) {
        File d = ra.d(context);
        if (d != null && d.isDirectory()) {
            return d;
        }
        Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    public static File b(Context context, String str) {
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
        return new File(anqm.a(context), str);
    }

    /* JADX WARNING: Missing block: B:15:0x0024, code skipped:
            if (r7 != null) goto L_0x0027;
     */
    /* JADX WARNING: Missing block: B:17:?, code skipped:
            defpackage.anqm.a(r1, r7);
     */
    /* JADX WARNING: Missing block: B:23:0x002e, code skipped:
            defpackage.anqm.a(r7, r0);
     */
    public static defpackage.anql a(java.io.File r7) {
        /*
        r0 = new java.io.FileInputStream;
        r0.<init>(r7);
        r7 = r0.getChannel();	 Catch:{ all -> 0x002b }
        r2 = 0;
        r4 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r6 = 1;
        r1 = r7;
        r1.lock(r2, r4, r6);	 Catch:{ all -> 0x0021 }
        r1 = defpackage.anqm.a(r7);	 Catch:{ all -> 0x0021 }
        r2 = 0;
        defpackage.anqm.a(r2, r7);	 Catch:{ all -> 0x002b }
        defpackage.anqm.a(r2, r0);
        return r1;
    L_0x0021:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0023 }
    L_0x0023:
        r2 = move-exception;
        if (r7 != 0) goto L_0x0027;
    L_0x0026:
        goto L_0x002a;
    L_0x0027:
        defpackage.anqm.a(r1, r7);	 Catch:{ all -> 0x002b }
    L_0x002a:
        throw r2;	 Catch:{ all -> 0x002b }
    L_0x002b:
        r7 = move-exception;
        throw r7;	 Catch:{ all -> 0x002d }
    L_0x002d:
        r1 = move-exception;
        defpackage.anqm.a(r7, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anqm.a(java.io.File):anql");
    }

    private static anql a(FileChannel fileChannel) {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        String property = properties.getProperty("pub");
        String property2 = properties.getProperty("pri");
        if (property == null || property2 == null) {
            throw new anqo("Invalid properties file");
        }
        try {
            return new anql(anqm.a(property, property2), Long.parseLong(properties.getProperty("cre")));
        } catch (NumberFormatException e) {
            throw new anqo(e);
        }
    }

    public static anql a(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(anpj.a(str, "|P|"), null);
        String string2 = sharedPreferences.getString(anpj.a(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        KeyPair a = anqm.a(string, string2);
        String string3 = sharedPreferences.getString(anpj.a(str, "cre"), null);
        long j = 0;
        if (string3 != null) {
            try {
                j = Long.parseLong(string3);
            } catch (NumberFormatException unused) {
            }
        }
        return new anql(a, j);
    }

    public static void a(Context context, String str, anql anql) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (anql.equals(anqm.a(sharedPreferences, str))) {
                return;
            }
        } catch (anqo unused) {
        }
        Editor edit = sharedPreferences.edit();
        edit.putString(anpj.a(str, "|P|"), anql.a());
        edit.putString(anpj.a(str, "|K|"), anql.b());
        edit.putString(anpj.a(str, "cre"), String.valueOf(anql.b));
        edit.commit();
    }
}
