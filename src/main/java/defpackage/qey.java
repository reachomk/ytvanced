package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* renamed from: qey */
public final class qey {
    private static qey b;
    public final Context a;
    private final Map c = new zj();

    public static qey a(Context context) {
        qey qey;
        synchronized (qey.class) {
            if (b == null) {
                b = new qey(context.getApplicationContext());
            }
            qey = b;
        }
        return qey;
    }

    private qey(Context context) {
        this.a = context;
    }

    public final qfq a() {
        if (qfc.a(this.a) >= 5000000) {
            return new qfr(this.a);
        }
        Log.e("GcmNetworkManager", "Google Play services is not available, dropping all GcmNetworkManager requests");
        return new qft();
    }

    /* JADX WARNING: Missing block: B:26:?, code skipped:
            defpackage.qey.a(r5, r0);
     */
    public final synchronized void a(com.google.android.gms.gcm.Task r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = new qfs;	 Catch:{ all -> 0x0059 }
        r1 = "nts:client:schedule:";
        r2 = r5.b;	 Catch:{ all -> 0x0059 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0059 }
        r3 = r2.length();	 Catch:{ all -> 0x0059 }
        if (r3 != 0) goto L_0x0017;
    L_0x0011:
        r2 = new java.lang.String;	 Catch:{ all -> 0x0059 }
        r2.<init>(r1);	 Catch:{ all -> 0x0059 }
        goto L_0x001b;
    L_0x0017:
        r2 = r1.concat(r2);	 Catch:{ all -> 0x0059 }
    L_0x001b:
        r0.<init>(r2);	 Catch:{ all -> 0x0059 }
        r1 = r5.a;	 Catch:{ all -> 0x0052 }
        r4.b(r1);	 Catch:{ all -> 0x0052 }
        r1 = r4.a();	 Catch:{ all -> 0x0052 }
        r1 = r1.a(r5);	 Catch:{ all -> 0x0052 }
        if (r1 == 0) goto L_0x004c;
    L_0x002d:
        r1 = r4.c;	 Catch:{ all -> 0x0052 }
        r2 = r5.a;	 Catch:{ all -> 0x0052 }
        r1 = r1.get(r2);	 Catch:{ all -> 0x0052 }
        r1 = (java.util.Map) r1;	 Catch:{ all -> 0x0052 }
        if (r1 != 0) goto L_0x003a;
    L_0x0039:
        goto L_0x004c;
    L_0x003a:
        r2 = r5.b;	 Catch:{ all -> 0x0052 }
        r2 = r1.containsKey(r2);	 Catch:{ all -> 0x0052 }
        if (r2 == 0) goto L_0x004c;
    L_0x0042:
        r5 = r5.b;	 Catch:{ all -> 0x0052 }
        r2 = 1;
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ all -> 0x0052 }
        r1.put(r5, r2);	 Catch:{ all -> 0x0052 }
    L_0x004c:
        r5 = 0;
        defpackage.qey.a(r5, r0);	 Catch:{ all -> 0x0059 }
        monitor-exit(r4);
        return;
    L_0x0052:
        r5 = move-exception;
        throw r5;	 Catch:{ all -> 0x0054 }
    L_0x0054:
        r1 = move-exception;
        defpackage.qey.a(r5, r0);	 Catch:{ all -> 0x0059 }
        throw r1;	 Catch:{ all -> 0x0059 }
    L_0x0059:
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qey.a(com.google.android.gms.gcm.Task):void");
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must provide a valid tag.");
        } else if (str.length() > 100) {
            throw new IllegalArgumentException("Tag is larger than max permissible tag length (100)");
        }
    }

    public final boolean b(String str) {
        pzr.a((Object) str, (Object) "GcmTaskService must not be null.");
        PackageManager packageManager = this.a.getPackageManager();
        Collection emptyList;
        if (packageManager == null) {
            emptyList = Collections.emptyList();
        } else {
            Intent className;
            String str2 = "com.google.android.gms.gcm.ACTION_TASK_READY";
            if (str != null) {
                className = new Intent(str2).setClassName(this.a, str);
            } else {
                className = new Intent(str2).setPackage(this.a.getPackageName());
            }
            emptyList = packageManager.queryIntentServices(className, 0);
        }
        if (emptyList == null || emptyList.isEmpty()) {
            Log.e("GcmNetworkManager", String.valueOf(str).concat(" is not available. This may cause the task to be lost."));
            return true;
        }
        for (ResolveInfo resolveInfo : emptyList) {
            if (resolveInfo.serviceInfo != null && resolveInfo.serviceInfo.enabled) {
                return true;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 118);
        stringBuilder.append("The GcmTaskService class you provided ");
        stringBuilder.append(str);
        stringBuilder.append(" does not seem to support receiving com.google.android.gms.gcm.ACTION_TASK_READY");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized boolean a(String str, String str2) {
        Map map = (Map) this.c.get(str2);
        if (map == null) {
            map = new zj();
            this.c.put(str2, map);
        }
        if (map.put(str, Boolean.valueOf(false)) == null) {
            return true;
        }
        return false;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b(String str, String str2) {
        Map map = (Map) this.c.get(str2);
        if (!(map == null || map.remove(str) == null || !map.isEmpty())) {
            this.c.remove(str2);
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized boolean c(String str, String str2) {
        Map map = (Map) this.c.get(str2);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized boolean c(String str) {
        return this.c.containsKey(str);
    }
}
