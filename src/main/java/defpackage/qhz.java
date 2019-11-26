package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: qhz */
public final class qhz {
    private final SharedPreferences a;
    private final Context b;
    private final qid c;
    private final Map d = new zj();

    public qhz(Context context) {
        qid qid = new qid();
        this.b = context;
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.c = qid;
        File file = new File(ra.d(this.b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (!file.createNewFile()) {
                    return;
                }
                if (!this.a.getAll().isEmpty()) {
                    qhs.a(this.b, this);
                }
            } catch (IOException unused) {
            }
        }
    }

    private static String b(String str, String str2, String str3) {
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 4) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append(str);
        stringBuilder.append("|T|");
        stringBuilder.append(str2);
        stringBuilder.append("|");
        stringBuilder.append(str3);
        return stringBuilder.toString();
    }

    public final synchronized String a(String str) {
        return this.a.getString(str, null);
    }

    public final synchronized void a() {
        this.d.clear();
        for (File file : qid.a(this.b).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
        this.a.edit().clear().commit();
    }

    public final synchronized String a(String str, String str2, String str3) {
        return this.a.getString(qhz.b(str, str2, str3), null);
    }

    public final synchronized void a(String str, String str2, String str3, String str4, String str5) {
        str = qhz.b(str, str2, str3);
        Editor edit = this.a.edit();
        edit.putString(str, str4);
        edit.putString("appVersion", str5);
        edit.putString("lastToken", Long.toString(System.currentTimeMillis() / 1000));
        edit.commit();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001a */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Missing block: B:9:?, code skipped:
            android.util.Log.w("InstanceID/Store", "Stored data is corrupt, generating new identity");
            defpackage.qhs.a(r3.b, r3);
            r2 = r3.c.a(r3.b, r4);
     */
    public final synchronized defpackage.qig b(java.lang.String r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.d;	 Catch:{ all -> 0x0037 }
        r0 = r0.get(r4);	 Catch:{ all -> 0x0037 }
        r0 = (defpackage.qig) r0;	 Catch:{ all -> 0x0037 }
        if (r0 != 0) goto L_0x0035;
    L_0x000b:
        r0 = r3.c;	 Catch:{ qif -> 0x001a }
        r1 = r3.b;	 Catch:{ qif -> 0x001a }
        r2 = defpackage.qid.b(r1, r4);	 Catch:{ qif -> 0x001a }
        if (r2 != 0) goto L_0x002e;
    L_0x0015:
        r2 = r0.a(r1, r4);	 Catch:{ qif -> 0x001a }
        goto L_0x002e;
    L_0x001a:
        r0 = "InstanceID/Store";
        r1 = "Stored data is corrupt, generating new identity";
        android.util.Log.w(r0, r1);	 Catch:{ all -> 0x0037 }
        r0 = r3.b;	 Catch:{ all -> 0x0037 }
        defpackage.qhs.a(r0, r3);	 Catch:{ all -> 0x0037 }
        r0 = r3.c;	 Catch:{ all -> 0x0037 }
        r1 = r3.b;	 Catch:{ all -> 0x0037 }
        r2 = r0.a(r1, r4);	 Catch:{ all -> 0x0037 }
    L_0x002e:
        r0 = r3.d;	 Catch:{ all -> 0x0037 }
        r0.put(r4, r2);	 Catch:{ all -> 0x0037 }
        monitor-exit(r3);
        return r2;
    L_0x0035:
        monitor-exit(r3);
        return r0;
    L_0x0037:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qhz.b(java.lang.String):qig");
    }

    static String a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append("|S|");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }
}
