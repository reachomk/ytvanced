package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: anpj */
public final class anpj {
    private final SharedPreferences a;
    private final Context b;
    private final anqm c;
    private final Map d = new zj();

    public anpj(Context context) {
        anqm anqm = new anqm();
        this.b = context;
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.c = anqm;
        File file = new File(ra.d(this.b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !c()) {
                    b();
                    FirebaseInstanceId.a().f();
                }
            } catch (IOException unused) {
            }
        }
    }

    public final synchronized String a() {
        return this.a.getString("topic_operaion_queue", "");
    }

    public final synchronized void a(String str) {
        this.a.edit().putString("topic_operaion_queue", str).apply();
    }

    private final synchronized boolean c() {
        return this.a.getAll().isEmpty();
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

    static String a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append("|S|");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    public final synchronized void b() {
        this.d.clear();
        for (File file : anqm.a(this.b).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
        this.a.edit().clear().commit();
    }

    public final synchronized anpm a(String str, String str2, String str3) {
        return anpm.a(this.a.getString(anpj.b(str, str2, str3), null));
    }

    public final synchronized void a(String str, String str2, String str3, String str4, String str5) {
        str4 = anpm.a(str4, str5, System.currentTimeMillis());
        if (str4 != null) {
            Editor edit = this.a.edit();
            edit.putString(anpj.b(str, str2, str3), str4);
            edit.commit();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d A:{SYNTHETIC, Splitter:B:32:0x006d} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d A:{SYNTHETIC, Splitter:B:32:0x006d} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0073 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x001f */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:10|11|12|13) */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:35|36) */
    /* JADX WARNING: Missing block: B:36:?, code skipped:
            android.util.Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
            com.google.firebase.iid.FirebaseInstanceId.a().f();
            r1 = defpackage.anqm.a(r7.b, r8);
     */
    public final synchronized defpackage.anql b(java.lang.String r8) {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.d;	 Catch:{ all -> 0x0090 }
        r0 = r0.get(r8);	 Catch:{ all -> 0x0090 }
        r0 = (defpackage.anql) r0;	 Catch:{ all -> 0x0090 }
        if (r0 != 0) goto L_0x008e;
    L_0x000b:
        r0 = r7.c;	 Catch:{ anqo -> 0x0073 }
        r0 = r7.b;	 Catch:{ anqo -> 0x0073 }
        r1 = 0;
        r2 = defpackage.anqm.b(r0, r8);	 Catch:{ anqo -> 0x0055 }
        r3 = r2.exists();	 Catch:{ anqo -> 0x0055 }
        if (r3 == 0) goto L_0x004b;
    L_0x001a:
        r2 = defpackage.anqm.a(r2);	 Catch:{ anqo | IOException -> 0x001f, anqo | IOException -> 0x001f }
        goto L_0x004c;
    L_0x001f:
        r2 = defpackage.anqm.a(r2);	 Catch:{ IOException -> 0x0024 }
        goto L_0x004c;
    L_0x0024:
        r2 = move-exception;
        r3 = "FirebaseInstanceId";
        r4 = java.lang.String.valueOf(r2);	 Catch:{ anqo -> 0x0055 }
        r5 = r4.length();	 Catch:{ anqo -> 0x0055 }
        r5 = r5 + 45;
        r6 = new java.lang.StringBuilder;	 Catch:{ anqo -> 0x0055 }
        r6.<init>(r5);	 Catch:{ anqo -> 0x0055 }
        r5 = "IID file exists, but failed to read from it: ";
        r6.append(r5);	 Catch:{ anqo -> 0x0055 }
        r6.append(r4);	 Catch:{ anqo -> 0x0055 }
        r4 = r6.toString();	 Catch:{ anqo -> 0x0055 }
        android.util.Log.w(r3, r4);	 Catch:{ anqo -> 0x0055 }
        r3 = new anqo;	 Catch:{ anqo -> 0x0055 }
        r3.<init>(r2);	 Catch:{ anqo -> 0x0055 }
        throw r3;	 Catch:{ anqo -> 0x0055 }
    L_0x004b:
        r2 = r1;
    L_0x004c:
        if (r2 != 0) goto L_0x0050;
    L_0x004e:
        r2 = r1;
        goto L_0x0056;
    L_0x0050:
        defpackage.anqm.a(r0, r8, r2);	 Catch:{ anqo -> 0x0055 }
        r1 = r2;
        goto L_0x006b;
    L_0x0055:
        r2 = move-exception;
    L_0x0056:
        r3 = "com.google.android.gms.appid";
        r4 = 0;
        r3 = r0.getSharedPreferences(r3, r4);	 Catch:{ anqo -> 0x0068 }
        r3 = defpackage.anqm.a(r3, r8);	 Catch:{ anqo -> 0x0068 }
        if (r3 == 0) goto L_0x0069;
    L_0x0063:
        defpackage.anqm.a(r0, r8, r3, r4);	 Catch:{ anqo -> 0x0068 }
        r1 = r3;
        goto L_0x006b;
    L_0x0068:
        r2 = move-exception;
    L_0x0069:
        if (r2 != 0) goto L_0x0072;
    L_0x006b:
        if (r1 != 0) goto L_0x0087;
    L_0x006d:
        r1 = defpackage.anqm.a(r0, r8);	 Catch:{ anqo -> 0x0073 }
        goto L_0x0087;
    L_0x0072:
        throw r2;	 Catch:{ anqo -> 0x0073 }
    L_0x0073:
        r0 = "FirebaseInstanceId";
        r1 = "Stored data is corrupt, generating new identity";
        android.util.Log.w(r0, r1);	 Catch:{ all -> 0x0090 }
        r0 = com.google.firebase.iid.FirebaseInstanceId.a();	 Catch:{ all -> 0x0090 }
        r0.f();	 Catch:{ all -> 0x0090 }
        r0 = r7.b;	 Catch:{ all -> 0x0090 }
        r1 = defpackage.anqm.a(r0, r8);	 Catch:{ all -> 0x0090 }
    L_0x0087:
        r0 = r7.d;	 Catch:{ all -> 0x0090 }
        r0.put(r8, r1);	 Catch:{ all -> 0x0090 }
        monitor-exit(r7);
        return r1;
    L_0x008e:
        monitor-exit(r7);
        return r0;
    L_0x0090:
        r8 = move-exception;
        monitor-exit(r7);
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anpj.b(java.lang.String):anql");
    }

    public final synchronized void c(String str) {
        str = String.valueOf(str).concat("|T|");
        Editor edit = this.a.edit();
        for (String str2 : this.a.getAll().keySet()) {
            if (str2.startsWith(str)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }
}
