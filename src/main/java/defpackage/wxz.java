package defpackage;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: wxz */
public final class wxz {
    private static final int a = 90;
    private static final Pattern b = Pattern.compile("^\\w+$");
    private static final Pattern c = Pattern.compile("^(\\w+:){1,2}\\d+$");
    private final SharedPreferences d;
    private int e = 0;

    public wxz(SharedPreferences sharedPreferences) {
        this.d = sharedPreferences;
    }

    public final synchronized void a(String str, String str2) {
        if (c.matcher(str2).matches()) {
            amqw.a(wxz.c(str));
            str = wxz.g(str);
            HashSet hashSet = new HashSet(this.d.getStringSet(str, amwp.a));
            hashSet.add(str2);
            this.d.edit().putStringSet(str, hashSet).apply();
        }
    }

    private final void c(String str, String str2) {
        HashSet hashSet = new HashSet(this.d.getStringSet(str, amwp.a));
        hashSet.remove(str2);
        this.d.edit().putStringSet(str, hashSet).apply();
    }

    public final synchronized void b(String str, String str2) {
        amqw.a(wxz.c(str));
        String e = wxz.e(str2);
        if (e.length() == str2.length()) {
            e = "";
        } else {
            CharSequence str3;
            String str4 = ":";
            if (str4.length() == 0) {
                str3 = new String(e);
            } else {
                str3 = e.concat(str4);
            }
            e = str2.replace(str3, "");
            if (e.isEmpty() || !e.contains(":")) {
                e = "";
            } else {
                e = wxz.e(e);
            }
        }
        if (!e.isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 28) + e.length());
            stringBuilder.append("GcmTaskController.GcmTasks_");
            stringBuilder.append(str);
            stringBuilder.append("_");
            stringBuilder.append(e);
            c(stringBuilder.toString(), str2);
        }
        c(wxz.g(str), str2);
    }

    public final synchronized boolean a(String str) {
        int i;
        Set stringSet = this.d.getStringSet(wxz.g(str), null);
        i = (stringSet == null || stringSet.isEmpty()) ? 1 : 0;
        return i ^ 1;
    }

    public final synchronized Set b(String str) {
        return this.d.getStringSet(wxz.g(str), new HashSet());
    }

    static boolean c(String str) {
        return b.matcher(str).matches() && str.length() <= a;
    }

    private final synchronized String f(String str) {
        StringBuilder stringBuilder;
        amqw.a(wxz.c(str));
        String valueOf = String.valueOf(this.e);
        this.e = (this.e + 1) % 100000;
        stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(valueOf).length());
        stringBuilder.append(str);
        stringBuilder.append(":");
        stringBuilder.append(valueOf);
        return stringBuilder.toString();
    }

    /* JADX WARNING: Missing block: B:9:0x0020, code skipped:
            return r1;
     */
    public final synchronized java.lang.String d(java.lang.String r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = defpackage.wxz.c(r5);	 Catch:{ all -> 0x0023 }
        r1 = 0;
        if (r0 == 0) goto L_0x0021;
    L_0x0008:
        r0 = r4.b(r5);	 Catch:{ all -> 0x0023 }
        r2 = r0.size();	 Catch:{ all -> 0x0023 }
        r3 = 100000; // 0x186a0 float:1.4013E-40 double:4.94066E-319;
        if (r2 >= r3) goto L_0x001f;
    L_0x0015:
        r1 = r4.f(r5);	 Catch:{ all -> 0x0023 }
        r2 = r0.contains(r1);	 Catch:{ all -> 0x0023 }
        if (r2 != 0) goto L_0x0015;
    L_0x001f:
        monitor-exit(r4);
        return r1;
    L_0x0021:
        monitor-exit(r4);
        return r1;
    L_0x0023:
        r5 = move-exception;
        monitor-exit(r4);
        goto L_0x0027;
    L_0x0026:
        throw r5;
    L_0x0027:
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wxz.d(java.lang.String):java.lang.String");
    }

    public static String e(String str) {
        int indexOf = str.indexOf(":");
        return indexOf > 0 ? str.substring(0, indexOf) : str;
    }

    private static String g(String str) {
        str = String.valueOf(str);
        String str2 = "GcmTaskController.GcmTasks_";
        return str.length() == 0 ? new String(str2) : str2.concat(str);
    }
}
