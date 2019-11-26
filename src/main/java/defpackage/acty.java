package defpackage;

import android.content.SharedPreferences;

/* renamed from: acty */
public final class acty {
    public final SharedPreferences a;
    private final xci b;

    public acty(SharedPreferences sharedPreferences, xci xci) {
        this.a = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.b = (xci) amqw.a((Object) xci);
        this.b.a((Object) this, afpw.class, new actx(this));
    }

    public final synchronized void a(afpt afpt) {
        String e = acty.e(afpt);
        if (!this.a.contains(e)) {
            this.a.edit().putLong(e, 1).apply();
        }
    }

    public final synchronized long b(afpt afpt) {
        String e = acty.e(afpt);
        long j = this.a.getLong(e, -1);
        if (j == -1) {
            return j;
        }
        long j2 = 1;
        if (j < 65535) {
            j2 = 1 + j;
        }
        this.a.edit().putLong(e, j2).apply();
        return j;
    }

    private static String e(afpt afpt) {
        String valueOf = String.valueOf(afpt.a());
        String str = "client_event_id_manager_client_count_identity_";
        return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }

    public static String c(afpt afpt) {
        String valueOf = String.valueOf(afpt.a());
        String str = "client_event_id_manager_event_id_for_identity_";
        return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }

    /* JADX WARNING: Missing block: B:10:0x0036, code skipped:
            return;
     */
    public final synchronized void d(defpackage.afpt r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        if (r3 == 0) goto L_0x003a;
    L_0x0003:
        r0 = defpackage.acty.e(r3);	 Catch:{ all -> 0x0037 }
        r1 = r2.a;	 Catch:{ all -> 0x0037 }
        r1 = r1.contains(r0);	 Catch:{ all -> 0x0037 }
        if (r1 == 0) goto L_0x001c;
    L_0x000f:
        r1 = r2.a;	 Catch:{ all -> 0x0037 }
        r1 = r1.edit();	 Catch:{ all -> 0x0037 }
        r0 = r1.remove(r0);	 Catch:{ all -> 0x0037 }
        r0.apply();	 Catch:{ all -> 0x0037 }
    L_0x001c:
        r3 = defpackage.acty.c(r3);	 Catch:{ all -> 0x0037 }
        r0 = r2.a;	 Catch:{ all -> 0x0037 }
        r0 = r0.contains(r3);	 Catch:{ all -> 0x0037 }
        if (r0 == 0) goto L_0x0035;
    L_0x0028:
        r0 = r2.a;	 Catch:{ all -> 0x0037 }
        r0 = r0.edit();	 Catch:{ all -> 0x0037 }
        r3 = r0.remove(r3);	 Catch:{ all -> 0x0037 }
        r3.apply();	 Catch:{ all -> 0x0037 }
    L_0x0035:
        monitor-exit(r2);
        return;
    L_0x0037:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
    L_0x003a:
        monitor-exit(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acty.d(afpt):void");
    }
}
