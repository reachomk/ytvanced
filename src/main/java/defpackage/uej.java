package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: uej */
public final class uej implements udw {
    private static final Map d = new zj();
    public final Object a = new Object();
    public volatile Map b;
    public final List c = new ArrayList();
    private final SharedPreferences e;
    private final OnSharedPreferenceChangeListener f = new uei(this);

    /* JADX WARNING: Removed duplicated region for block: B:35:0x005f A:{Catch:{ NullPointerException -> 0x004f }} */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005f A:{Catch:{ NullPointerException -> 0x004f }} */
    static defpackage.uej a(android.content.Context r8, java.lang.String r9) {
        /*
        r0 = defpackage.sjx.a();
        r1 = 0;
        if (r0 == 0) goto L_0x006c;
    L_0x0007:
        r0 = "direct_boot:";
        r0 = r9.startsWith(r0);
        if (r0 != 0) goto L_0x006c;
    L_0x000f:
        r0 = defpackage.sjx.a();
        if (r0 != 0) goto L_0x0016;
    L_0x0015:
        goto L_0x006c;
    L_0x0016:
        r0 = defpackage.sjx.b;
        if (r0 != 0) goto L_0x006c;
    L_0x001a:
        r0 = defpackage.sjx.class;
        monitor-enter(r0);
        r2 = defpackage.sjx.b;	 Catch:{ all -> 0x0069 }
        if (r2 == 0) goto L_0x0023;
    L_0x0021:
        monitor-exit(r0);	 Catch:{ all -> 0x0069 }
        goto L_0x006c;
    L_0x0023:
        r2 = 1;
        r3 = 1;
    L_0x0025:
        r4 = 2;
        r5 = 0;
        if (r3 > r4) goto L_0x005c;
    L_0x0029:
        r4 = defpackage.sjx.a;	 Catch:{ all -> 0x0069 }
        if (r4 != 0) goto L_0x0037;
    L_0x002d:
        r4 = android.os.UserManager.class;
        r4 = r8.getSystemService(r4);	 Catch:{ all -> 0x0069 }
        r4 = (android.os.UserManager) r4;	 Catch:{ all -> 0x0069 }
        defpackage.sjx.a = r4;	 Catch:{ all -> 0x0069 }
    L_0x0037:
        r4 = defpackage.sjx.a;	 Catch:{ all -> 0x0069 }
        if (r4 != 0) goto L_0x003d;
    L_0x003b:
        r3 = 1;
        goto L_0x0061;
    L_0x003d:
        r6 = r4.isUserUnlocked();	 Catch:{ NullPointerException -> 0x004f }
        if (r6 != 0) goto L_0x004d;
    L_0x0043:
        r6 = android.os.Process.myUserHandle();	 Catch:{ NullPointerException -> 0x004f }
        r3 = r4.isUserRunning(r6);	 Catch:{ NullPointerException -> 0x004f }
        if (r3 != 0) goto L_0x005c;
    L_0x004d:
        r3 = 1;
        goto L_0x005d;
    L_0x004f:
        r4 = move-exception;
        r6 = "DirectBootUtils";
        r7 = "Failed to check if user is unlocked.";
        android.util.Log.w(r6, r7, r4);	 Catch:{ all -> 0x0069 }
        defpackage.sjx.a = r5;	 Catch:{ all -> 0x0069 }
        r3 = r3 + 1;
        goto L_0x0025;
    L_0x005c:
        r3 = 0;
    L_0x005d:
        if (r3 == 0) goto L_0x0061;
    L_0x005f:
        defpackage.sjx.a = r5;	 Catch:{ all -> 0x0069 }
    L_0x0061:
        if (r3 == 0) goto L_0x0065;
    L_0x0063:
        defpackage.sjx.b = r2;	 Catch:{ all -> 0x0069 }
    L_0x0065:
        monitor-exit(r0);	 Catch:{ all -> 0x0069 }
        if (r3 != 0) goto L_0x006c;
    L_0x0068:
        return r5;
    L_0x0069:
        r8 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0069 }
        throw r8;
    L_0x006c:
        r0 = defpackage.uej.class;
        monitor-enter(r0);
        r2 = d;	 Catch:{ all -> 0x00a6 }
        r2 = r2.get(r9);	 Catch:{ all -> 0x00a6 }
        r2 = (defpackage.uej) r2;	 Catch:{ all -> 0x00a6 }
        if (r2 != 0) goto L_0x00a4;
    L_0x0079:
        r2 = new uej;	 Catch:{ all -> 0x00a6 }
        r3 = "direct_boot:";
        r3 = r9.startsWith(r3);	 Catch:{ all -> 0x00a6 }
        if (r3 == 0) goto L_0x0098;
    L_0x0083:
        r3 = defpackage.sjx.a();	 Catch:{ all -> 0x00a6 }
        if (r3 == 0) goto L_0x008d;
    L_0x0089:
        r8 = r8.createDeviceProtectedStorageContext();	 Catch:{ all -> 0x00a6 }
    L_0x008d:
        r3 = 12;
        r3 = r9.substring(r3);	 Catch:{ all -> 0x00a6 }
        r8 = r8.getSharedPreferences(r3, r1);	 Catch:{ all -> 0x00a6 }
        goto L_0x009c;
    L_0x0098:
        r8 = r8.getSharedPreferences(r9, r1);	 Catch:{ all -> 0x00a6 }
    L_0x009c:
        r2.<init>(r8);	 Catch:{ all -> 0x00a6 }
        r8 = d;	 Catch:{ all -> 0x00a6 }
        r8.put(r9, r2);	 Catch:{ all -> 0x00a6 }
    L_0x00a4:
        monitor-exit(r0);	 Catch:{ all -> 0x00a6 }
        return r2;
    L_0x00a6:
        r8 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00a6 }
        goto L_0x00aa;
    L_0x00a9:
        throw r8;
    L_0x00aa:
        goto L_0x00a9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uej.a(android.content.Context, java.lang.String):uej");
    }

    private uej(SharedPreferences sharedPreferences) {
        this.e = sharedPreferences;
        this.e.registerOnSharedPreferenceChangeListener(this.f);
    }

    public final Object a(String str) {
        Map map = this.b;
        if (map == null) {
            synchronized (this.a) {
                map = this.b;
                if (map == null) {
                    map = this.e.getAll();
                    this.b = map;
                }
            }
        }
        return map != null ? map.get(str) : null;
    }

    static synchronized void a() {
        synchronized (uej.class) {
            for (uej uej : d.values()) {
                uej.e.unregisterOnSharedPreferenceChangeListener(uej.f);
            }
            d.clear();
        }
    }
}
