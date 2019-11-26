package defpackage;

import android.content.Context;

/* renamed from: pfs */
public final class pfs {
    public static Object a = new Object();
    public static ryb b;
    private static Boolean c;

    public static boolean a(Context context) {
        pzr.a((Object) context);
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean a = pfy.a(context, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        c = Boolean.valueOf(a);
        return a;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00e7 */
    /* JADX WARNING: Missing block: B:36:0x00b1, code skipped:
            if (r14.g == 0) goto L_0x00b3;
     */
    /* JADX WARNING: Missing block: B:49:0x00ed, code skipped:
            return;
     */
    public static void a(android.content.Context r14, android.content.Intent r15) {
        /*
        r0 = defpackage.pgd.a(r14);
        r0 = r0.a();
        if (r15 != 0) goto L_0x0010;
    L_0x000a:
        r14 = "AnalyticsReceiver called with null intent";
        r0.b(r14);
        return;
    L_0x0010:
        r15 = r15.getAction();
        r1 = "Local AnalyticsReceiver got";
        r0.a(r1, r15);
        r1 = "com.google.android.gms.analytics.ANALYTICS_DISPATCH";
        r15 = r1.equals(r15);
        if (r15 == 0) goto L_0x00f1;
    L_0x0021:
        r15 = defpackage.pfr.a(r14);
        r1 = new android.content.Intent;
        r2 = "com.google.android.gms.analytics.ANALYTICS_DISPATCH";
        r1.<init>(r2);
        r2 = new android.content.ComponentName;
        r3 = "com.google.android.gms.analytics.AnalyticsService";
        r2.<init>(r14, r3);
        r1.setComponent(r2);
        r2 = "com.google.android.gms.analytics.ANALYTICS_DISPATCH";
        r1.setAction(r2);
        r2 = a;
        monitor-enter(r2);
        r14.startService(r1);	 Catch:{ all -> 0x00ee }
        if (r15 != 0) goto L_0x0045;
    L_0x0043:
        monitor-exit(r2);	 Catch:{ all -> 0x00ee }
        return;
    L_0x0045:
        r15 = b;	 Catch:{ SecurityException -> 0x00e7 }
        r1 = 0;
        if (r15 != 0) goto L_0x005a;
    L_0x004a:
        r15 = new ryb;	 Catch:{ SecurityException -> 0x00e7 }
        r3 = "Analytics WakeLock";
        r15.<init>(r14, r3);	 Catch:{ SecurityException -> 0x00e7 }
        b = r15;	 Catch:{ SecurityException -> 0x00e7 }
        r14 = r15.a;	 Catch:{ SecurityException -> 0x00e7 }
        r14.setReferenceCounted(r1);	 Catch:{ SecurityException -> 0x00e7 }
        r15.e = r1;	 Catch:{ SecurityException -> 0x00e7 }
    L_0x005a:
        r14 = b;	 Catch:{ SecurityException -> 0x00e7 }
        r15 = r14.h;	 Catch:{ SecurityException -> 0x00e7 }
        r15.incrementAndGet();	 Catch:{ SecurityException -> 0x00e7 }
        r14.c();	 Catch:{ SecurityException -> 0x00e7 }
        monitor-enter(r14);	 Catch:{ SecurityException -> 0x00e7 }
        r15 = r14.f;	 Catch:{ all -> 0x00e4 }
        r15 = r15.isEmpty();	 Catch:{ all -> 0x00e4 }
        if (r15 == 0) goto L_0x0071;
    L_0x006d:
        r15 = r14.g;	 Catch:{ all -> 0x00e4 }
        if (r15 <= 0) goto L_0x0080;
    L_0x0071:
        r15 = r14.a;	 Catch:{ all -> 0x00e4 }
        r15 = r15.isHeld();	 Catch:{ all -> 0x00e4 }
        if (r15 != 0) goto L_0x0080;
    L_0x0079:
        r15 = r14.f;	 Catch:{ all -> 0x00e4 }
        r15.clear();	 Catch:{ all -> 0x00e4 }
        r14.g = r1;	 Catch:{ all -> 0x00e4 }
    L_0x0080:
        r15 = r14.e;	 Catch:{ all -> 0x00e4 }
        r3 = 0;
        r4 = 1;
        if (r15 == 0) goto L_0x00ab;
    L_0x0086:
        r15 = r14.f;	 Catch:{ all -> 0x00e4 }
        r15 = r15.get(r3);	 Catch:{ all -> 0x00e4 }
        r15 = (java.lang.Integer[]) r15;	 Catch:{ all -> 0x00e4 }
        if (r15 != 0) goto L_0x009e;
    L_0x0090:
        r15 = r14.f;	 Catch:{ all -> 0x00e4 }
        r5 = new java.lang.Integer[r4];	 Catch:{ all -> 0x00e4 }
        r6 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x00e4 }
        r5[r1] = r6;	 Catch:{ all -> 0x00e4 }
        r15.put(r3, r5);	 Catch:{ all -> 0x00e4 }
        goto L_0x00b3;
    L_0x009e:
        r5 = r15[r1];	 Catch:{ all -> 0x00e4 }
        r5 = r5.intValue();	 Catch:{ all -> 0x00e4 }
        r5 = r5 + r4;
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x00e4 }
        r15[r1] = r5;	 Catch:{ all -> 0x00e4 }
    L_0x00ab:
        r15 = r14.e;	 Catch:{ all -> 0x00e4 }
        if (r15 != 0) goto L_0x00cf;
    L_0x00af:
        r15 = r14.g;	 Catch:{ all -> 0x00e4 }
        if (r15 != 0) goto L_0x00cf;
    L_0x00b3:
        r5 = r14.d;	 Catch:{ all -> 0x00e4 }
        r15 = r14.a;	 Catch:{ all -> 0x00e4 }
        r6 = defpackage.qas.a(r15, r3);	 Catch:{ all -> 0x00e4 }
        r8 = r14.c;	 Catch:{ all -> 0x00e4 }
        r10 = r14.b;	 Catch:{ all -> 0x00e4 }
        r11 = r14.a();	 Catch:{ all -> 0x00e4 }
        r7 = 7;
        r9 = 0;
        r12 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        defpackage.qau.a(r5, r6, r7, r8, r9, r10, r11, r12);	 Catch:{ all -> 0x00e4 }
        r15 = r14.g;	 Catch:{ all -> 0x00e4 }
        r15 = r15 + r4;
        r14.g = r15;	 Catch:{ all -> 0x00e4 }
    L_0x00cf:
        monitor-exit(r14);	 Catch:{ all -> 0x00e4 }
        r15 = r14.a;	 Catch:{ SecurityException -> 0x00e7 }
        r15.acquire();	 Catch:{ SecurityException -> 0x00e7 }
        r15 = defpackage.ryb.i;	 Catch:{ SecurityException -> 0x00e7 }
        r1 = new ryd;	 Catch:{ SecurityException -> 0x00e7 }
        r1.<init>(r14);	 Catch:{ SecurityException -> 0x00e7 }
        r14 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ SecurityException -> 0x00e7 }
        r3 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r15.schedule(r1, r3, r14);	 Catch:{ SecurityException -> 0x00e7 }
        goto L_0x00ec;
    L_0x00e4:
        r15 = move-exception;
        monitor-exit(r14);	 Catch:{ all -> 0x00e4 }
        throw r15;	 Catch:{ SecurityException -> 0x00e7 }
    L_0x00e7:
        r14 = "Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.";
        r0.b(r14);	 Catch:{ all -> 0x00ee }
    L_0x00ec:
        monitor-exit(r2);	 Catch:{ all -> 0x00ee }
        return;
    L_0x00ee:
        r14 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00ee }
        throw r14;
    L_0x00f1:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfs.a(android.content.Context, android.content.Intent):void");
    }
}
