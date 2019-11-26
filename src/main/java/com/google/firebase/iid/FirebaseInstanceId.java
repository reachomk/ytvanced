package com.google.firebase.iid;

import defpackage.anlf;
import defpackage.anom;
import defpackage.anpc;
import defpackage.anpd;
import defpackage.anpj;
import defpackage.anpl;
import defpackage.anpm;
import defpackage.anpn;
import defpackage.ryi;
import defpackage.rym;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FirebaseInstanceId {
    public static anpj a;
    private static final long g = TimeUnit.HOURS.toSeconds(8);
    private static ScheduledThreadPoolExecutor h;
    public final Executor b;
    public final anlf c;
    public final anpc d;
    public anom e;
    public final anpd f = new anpd();
    private final anpn i;
    private boolean j;
    private boolean k;

    public static FirebaseInstanceId a() {
        return getInstance(anlf.c());
    }

    public static boolean e() {
        return false;
    }

    public static synchronized FirebaseInstanceId getInstance(anlf anlf) {
        FirebaseInstanceId firebaseInstanceId;
        Class cls = FirebaseInstanceId.class;
        synchronized (cls) {
            firebaseInstanceId = (FirebaseInstanceId) anlf.a(cls);
        }
        return firebaseInstanceId;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00a9 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:37:0x00d0, code skipped:
            if (r8.serviceInfo != null) goto L_0x00ae;
     */
    public FirebaseInstanceId(defpackage.anlf r8) {
        /*
        r7 = this;
        r0 = new anpc;
        r1 = r8.a();
        r0.<init>(r1);
        r1 = defpackage.anpv.a();
        r2 = defpackage.anpv.a();
        r7.<init>();
        r3 = new anpd;
        r3.<init>();
        r7.f = r3;
        r3 = 0;
        r7.j = r3;
        r4 = defpackage.anpc.a(r8);
        if (r4 == 0) goto L_0x0103;
    L_0x0024:
        r4 = com.google.firebase.iid.FirebaseInstanceId.class;
        monitor-enter(r4);
        r5 = a;	 Catch:{ all -> 0x0100 }
        if (r5 != 0) goto L_0x0036;
    L_0x002b:
        r5 = new anpj;	 Catch:{ all -> 0x0100 }
        r6 = r8.a();	 Catch:{ all -> 0x0100 }
        r5.<init>(r6);	 Catch:{ all -> 0x0100 }
        a = r5;	 Catch:{ all -> 0x0100 }
    L_0x0036:
        monitor-exit(r4);	 Catch:{ all -> 0x0100 }
        r7.c = r8;
        r7.d = r0;
        r4 = r7.e;
        if (r4 != 0) goto L_0x0059;
    L_0x003f:
        r4 = defpackage.anom.class;
        r4 = r8.a(r4);
        r4 = (defpackage.anom) r4;
        if (r4 == 0) goto L_0x0052;
    L_0x0049:
        r5 = r4.b();
        if (r5 == 0) goto L_0x0052;
    L_0x004f:
        r7.e = r4;
        goto L_0x0059;
    L_0x0052:
        r4 = new anqd;
        r4.<init>(r8, r0, r1);
        r7.e = r4;
    L_0x0059:
        r7.b = r2;
        r8 = new anpn;
        r0 = a;
        r8.<init>(r0);
        r7.i = r8;
        r8 = r7.c;
        r8 = r8.a();
        r0 = "com.google.firebase.messaging";
        r0 = r8.getSharedPreferences(r0, r3);
        r1 = "auto_init";
        r1 = r0.contains(r1);
        r2 = 1;
        if (r1 == 0) goto L_0x0080;
    L_0x0079:
        r8 = "auto_init";
        r3 = r0.getBoolean(r8, r2);
        goto L_0x00d3;
    L_0x0080:
        r0 = r8.getPackageManager();	 Catch:{ NameNotFoundException -> 0x00a9 }
        if (r0 == 0) goto L_0x00a9;
    L_0x0086:
        r8 = r8.getPackageName();	 Catch:{ NameNotFoundException -> 0x00a9 }
        r1 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r8 = r0.getApplicationInfo(r8, r1);	 Catch:{ NameNotFoundException -> 0x00a9 }
        if (r8 == 0) goto L_0x00a9;
    L_0x0092:
        r0 = r8.metaData;	 Catch:{ NameNotFoundException -> 0x00a9 }
        if (r0 == 0) goto L_0x00a9;
    L_0x0096:
        r0 = r8.metaData;	 Catch:{ NameNotFoundException -> 0x00a9 }
        r1 = "firebase_messaging_auto_init_enabled";
        r0 = r0.containsKey(r1);	 Catch:{ NameNotFoundException -> 0x00a9 }
        if (r0 == 0) goto L_0x00a9;
    L_0x00a0:
        r8 = r8.metaData;	 Catch:{ NameNotFoundException -> 0x00a9 }
        r0 = "firebase_messaging_auto_init_enabled";
        r3 = r8.getBoolean(r0);	 Catch:{ NameNotFoundException -> 0x00a9 }
        goto L_0x00d3;
    L_0x00a9:
        r8 = "anqr";
        java.lang.Class.forName(r8);	 Catch:{ ClassNotFoundException -> 0x00b0 }
    L_0x00ae:
        r3 = 1;
        goto L_0x00d3;
    L_0x00b0:
        r8 = r7.c;
        r8 = r8.a();
        r0 = new android.content.Intent;
        r1 = "com.google.firebase.MESSAGING_EVENT";
        r0.<init>(r1);
        r1 = r8.getPackageName();
        r0.setPackage(r1);
        r8 = r8.getPackageManager();
        r8 = r8.resolveService(r0, r3);
        if (r8 == 0) goto L_0x00d3;
    L_0x00ce:
        r8 = r8.serviceInfo;
        if (r8 == 0) goto L_0x00d3;
    L_0x00d2:
        goto L_0x00ae;
    L_0x00d3:
        r7.k = r3;
        r8 = r7.h();
        if (r8 == 0) goto L_0x00ff;
    L_0x00db:
        r8 = r7.d();
        r0 = r7.g();
        if (r0 != 0) goto L_0x00e6;
    L_0x00e5:
        goto L_0x00fc;
    L_0x00e6:
        if (r8 == 0) goto L_0x00fc;
    L_0x00e8:
        r0 = r7.d;
        r0 = r0.b();
        r8 = r8.b(r0);
        if (r8 != 0) goto L_0x00fc;
    L_0x00f4:
        r8 = r7.i;
        r8 = r8.a();
        if (r8 == 0) goto L_0x00ff;
    L_0x00fc:
        r7.b();
    L_0x00ff:
        return;
    L_0x0100:
        r8 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0100 }
        throw r8;
    L_0x0103:
        r8 = new java.lang.IllegalStateException;
        r0 = "FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID";
        r8.<init>(r0);
        goto L_0x010c;
    L_0x010b:
        throw r8;
    L_0x010c:
        goto L_0x010b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.<init>(anlf):void");
    }

    public final synchronized void a(boolean z) {
        this.j = z;
    }

    public final synchronized void b() {
        if (!this.j) {
            a(0);
        }
    }

    public final synchronized void a(long j) {
        a(new anpl(this, this.d, this.i, Math.min(Math.max(30, j + j), g)), j);
        this.j = true;
    }

    public static void a(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (h == null) {
                h = new ScheduledThreadPoolExecutor(1);
            }
            h.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public static String c() {
        return anpc.a(a.b("").a);
    }

    public final anpm d() {
        return a(anpc.a(this.c), "*");
    }

    public static anpm a(String str, String str2) {
        return a.a("", str, str2);
    }

    public final Object a(ryi ryi) {
        try {
            return rym.a(ryi, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    f();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    public final synchronized ryi a(String str) {
        ryi a;
        a = this.i.a(str);
        b();
        return a;
    }

    public final synchronized void f() {
        a.b();
        if (h()) {
            b();
        }
    }

    public final boolean g() {
        return this.e.a();
    }

    private final synchronized boolean h() {
        return this.k;
    }
}
