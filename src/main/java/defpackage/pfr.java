package defpackage;

import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Handler;

/* renamed from: pfr */
public final class pfr {
    private static Boolean c;
    public final Handler a = new Handler();
    public final Context b;

    public pfr(Context context) {
        pzr.a((Object) context);
        this.b = context;
    }

    public static boolean a(Context context) {
        pzr.a((Object) context);
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                z = true;
            }
        } catch (NameNotFoundException unused) {
        }
        c = Boolean.valueOf(z);
        return z;
    }

    public final void a() {
        pgd.a(this.b).a().a("Local AnalyticsService is starting up");
    }

    public final void b() {
        pgd.a(this.b).a().a("Local AnalyticsService is shutting down");
    }

    /* JADX WARNING: Missing block: B:27:0x0062, code skipped:
            if (r4.g == 1) goto L_0x0064;
     */
    public final int a(android.content.Intent r16, int r17) {
        /*
        r15 = this;
        r1 = r15;
        r2 = 0;
        r3 = defpackage.pfs.a;	 Catch:{ SecurityException -> 0x008f }
        monitor-enter(r3);	 Catch:{ SecurityException -> 0x008f }
        r4 = defpackage.pfs.b;	 Catch:{ all -> 0x008c }
        if (r4 != 0) goto L_0x000b;
    L_0x0009:
        goto L_0x008a;
    L_0x000b:
        r0 = r4.a;	 Catch:{ all -> 0x008c }
        r0 = r0.isHeld();	 Catch:{ all -> 0x008c }
        if (r0 == 0) goto L_0x008a;
    L_0x0013:
        r0 = r4.h;	 Catch:{ all -> 0x008c }
        r0 = r0.decrementAndGet();	 Catch:{ all -> 0x008c }
        if (r0 >= 0) goto L_0x002c;
    L_0x001b:
        r0 = "WakeLock";
        r5 = r4.c;	 Catch:{ all -> 0x008c }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x008c }
        r6 = " release without a matched acquire!";
        r5 = r5.concat(r6);	 Catch:{ all -> 0x008c }
        android.util.Log.e(r0, r5);	 Catch:{ all -> 0x008c }
    L_0x002c:
        r4.c();	 Catch:{ all -> 0x008c }
        monitor-enter(r4);	 Catch:{ all -> 0x008c }
        r0 = r4.e;	 Catch:{ all -> 0x0087 }
        r5 = 1;
        if (r0 == 0) goto L_0x005c;
    L_0x0035:
        r0 = r4.f;	 Catch:{ all -> 0x0087 }
        r0 = r0.get(r2);	 Catch:{ all -> 0x0087 }
        r0 = (java.lang.Integer[]) r0;	 Catch:{ all -> 0x0087 }
        if (r0 == 0) goto L_0x005c;
    L_0x003f:
        r6 = 0;
        r7 = r0[r6];	 Catch:{ all -> 0x0087 }
        r7 = r7.intValue();	 Catch:{ all -> 0x0087 }
        if (r7 != r5) goto L_0x004e;
    L_0x0048:
        r0 = r4.f;	 Catch:{ all -> 0x0087 }
        r0.remove(r2);	 Catch:{ all -> 0x0087 }
        goto L_0x0064;
    L_0x004e:
        r7 = r0[r6];	 Catch:{ all -> 0x0087 }
        r7 = r7.intValue();	 Catch:{ all -> 0x0087 }
        r7 = r7 + -1;
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x0087 }
        r0[r6] = r7;	 Catch:{ all -> 0x0087 }
    L_0x005c:
        r0 = r4.e;	 Catch:{ all -> 0x0087 }
        if (r0 != 0) goto L_0x0082;
    L_0x0060:
        r0 = r4.g;	 Catch:{ all -> 0x0087 }
        if (r0 != r5) goto L_0x0082;
    L_0x0064:
        r6 = r4.d;	 Catch:{ all -> 0x0087 }
        r0 = r4.a;	 Catch:{ all -> 0x0087 }
        r7 = defpackage.qas.a(r0, r2);	 Catch:{ all -> 0x0087 }
        r9 = r4.c;	 Catch:{ all -> 0x0087 }
        r11 = r4.b;	 Catch:{ all -> 0x0087 }
        r12 = r4.a();	 Catch:{ all -> 0x0087 }
        r8 = 8;
        r10 = 0;
        r13 = 0;
        defpackage.qau.a(r6, r7, r8, r9, r10, r11, r12, r13);	 Catch:{ all -> 0x0087 }
        r0 = r4.g;	 Catch:{ all -> 0x0087 }
        r0 = r0 + -1;
        r4.g = r0;	 Catch:{ all -> 0x0087 }
    L_0x0082:
        monitor-exit(r4);	 Catch:{ all -> 0x0087 }
        r4.b();	 Catch:{ all -> 0x008c }
        goto L_0x008a;
    L_0x0087:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0087 }
        throw r0;	 Catch:{ all -> 0x008c }
    L_0x008a:
        monitor-exit(r3);	 Catch:{ all -> 0x008c }
        goto L_0x008f;
    L_0x008c:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x008c }
        throw r0;	 Catch:{ SecurityException -> 0x008f }
    L_0x008f:
        r0 = r1.b;
        r0 = defpackage.pgd.a(r0);
        r0 = r0.a();
        r3 = 2;
        if (r16 != 0) goto L_0x00a2;
    L_0x009c:
        r2 = "AnalyticsService started with null intent";
        r0.b(r2);
        return r3;
    L_0x00a2:
        r4 = r16.getAction();
        r5 = java.lang.Integer.valueOf(r17);
        r6 = "Local AnalyticsService called. startId, action";
        r0.a(r6, r5, r4);
        r0 = "com.google.android.gms.analytics.ANALYTICS_DISPATCH";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x00ba;
    L_0x00b7:
        r15.a(r5, r2);
    L_0x00ba:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfr.a(android.content.Intent, int):int");
    }

    public final void a(Integer num, JobParameters jobParameters) {
        pgd a = pgd.a(this.b);
        a.c().a(new pfu(this, num, a.a(), jobParameters));
    }
}
