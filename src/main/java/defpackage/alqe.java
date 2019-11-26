package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: alqe */
public final class alqe implements alqo {
    private final SharedPreferences a;
    private final WifiManager b;

    public alqe(Context context, WifiManager wifiManager) {
        this.a = context.getSharedPreferences("DISCOVERED_SC_STORE", 0);
        this.b = (WifiManager) amqw.a((Object) wifiManager);
    }

    private final String b() {
        return this.b.getConnectionInfo().getBSSID();
    }

    public final synchronized void a(String str) {
        String b = b();
        if (b != null) {
            HashSet hashSet = new HashSet(this.a.getStringSet(b, Collections.emptySet()));
            hashSet.add(str);
            this.a.edit().putStringSet(b, hashSet).apply();
        }
    }

    public final synchronized Set a() {
        return this.a.getStringSet(b(), Collections.emptySet());
    }

    /* JADX WARNING: Missing block: B:13:0x0053, code skipped:
            return;
     */
    public final synchronized void b(java.lang.String r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.b();	 Catch:{ all -> 0x0054 }
        r1 = r4.a;	 Catch:{ all -> 0x0054 }
        r1 = r1.contains(r0);	 Catch:{ all -> 0x0054 }
        if (r1 == 0) goto L_0x0052;
    L_0x000d:
        r1 = r4.a;	 Catch:{ all -> 0x0054 }
        r2 = java.util.Collections.emptySet();	 Catch:{ all -> 0x0054 }
        r1 = r1.getStringSet(r0, r2);	 Catch:{ all -> 0x0054 }
        r1 = r1.contains(r5);	 Catch:{ all -> 0x0054 }
        if (r1 == 0) goto L_0x0052;
    L_0x001d:
        r1 = new java.util.HashSet;	 Catch:{ all -> 0x0054 }
        r2 = r4.a;	 Catch:{ all -> 0x0054 }
        r3 = java.util.Collections.emptySet();	 Catch:{ all -> 0x0054 }
        r2 = r2.getStringSet(r0, r3);	 Catch:{ all -> 0x0054 }
        r1.<init>(r2);	 Catch:{ all -> 0x0054 }
        r1.remove(r5);	 Catch:{ all -> 0x0054 }
        r5 = r1.isEmpty();	 Catch:{ all -> 0x0054 }
        if (r5 == 0) goto L_0x0043;
    L_0x0035:
        r5 = r4.a;	 Catch:{ all -> 0x0054 }
        r5 = r5.edit();	 Catch:{ all -> 0x0054 }
        r5 = r5.remove(r0);	 Catch:{ all -> 0x0054 }
        r5.apply();	 Catch:{ all -> 0x0054 }
        goto L_0x0052;
    L_0x0043:
        r5 = r4.a;	 Catch:{ all -> 0x0054 }
        r5 = r5.edit();	 Catch:{ all -> 0x0054 }
        r5 = r5.putStringSet(r0, r1);	 Catch:{ all -> 0x0054 }
        r5.apply();	 Catch:{ all -> 0x0054 }
        monitor-exit(r4);
        return;
    L_0x0052:
        monitor-exit(r4);
        return;
    L_0x0054:
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alqe.b(java.lang.String):void");
    }
}
