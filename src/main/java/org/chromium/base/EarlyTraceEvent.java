package org.chromium.base;

import android.os.Process;
import android.os.SystemClock;
import defpackage.bcho;
import defpackage.bchp;
import defpackage.bchq;
import java.util.Iterator;
import java.util.List;

public class EarlyTraceEvent {
    public static final Object a = new Object();
    public static volatile int b = 0;

    public static boolean getBackgroundStartupTracingFlag() {
        return false;
    }

    private static native void nativeRecordEarlyEvent(String str, long j, long j2, int i, long j3);

    private static native void nativeRecordEarlyFinishAsyncEvent(String str, long j, long j2);

    private static native void nativeRecordEarlyStartAsyncEvent(String str, long j, long j2);

    public static boolean a() {
        int i = b;
        return i == 1 || i == 2;
    }

    public static boolean b() {
        return b == 1;
    }

    static void setBackgroundStartupTracingFlag(boolean z) {
        bcho.a.edit().putBoolean("bg_startup_tracing", z).apply();
    }

    /* JADX WARNING: Missing block: B:11:0x0022, code skipped:
            if (r0 != null) goto L_0x0025;
     */
    /* JADX WARNING: Missing block: B:12:0x0024, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:13:0x0025, code skipped:
            r1 = new java.lang.StringBuilder();
            r1.append("Multiple pending trace events can't have the same name: ");
            r1.append(r4);
     */
    /* JADX WARNING: Missing block: B:14:0x003b, code skipped:
            throw new java.lang.IllegalArgumentException(r1.toString());
     */
    public static void a(java.lang.String r4) {
        /*
        r0 = b();
        if (r0 == 0) goto L_0x003f;
    L_0x0006:
        r0 = new bchq;
        r0.<init>(r4);
        r1 = a;
        monitor-enter(r1);
        r2 = b();	 Catch:{ all -> 0x003c }
        if (r2 != 0) goto L_0x0016;
    L_0x0014:
        monitor-exit(r1);	 Catch:{ all -> 0x003c }
        return;
    L_0x0016:
        r2 = c(r4);	 Catch:{ all -> 0x003c }
        r3 = 0;
        r0 = r3.put(r2, r0);	 Catch:{ all -> 0x003c }
        r0 = (defpackage.bchq) r0;	 Catch:{ all -> 0x003c }
        monitor-exit(r1);	 Catch:{ all -> 0x003c }
        if (r0 != 0) goto L_0x0025;
    L_0x0024:
        return;
    L_0x0025:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Multiple pending trace events can't have the same name: ";
        r1.append(r2);
        r1.append(r4);
        r4 = r1.toString();
        r0.<init>(r4);
        throw r0;
    L_0x003c:
        r4 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x003c }
        throw r4;
    L_0x003f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.EarlyTraceEvent.a(java.lang.String):void");
    }

    /* JADX WARNING: Missing block: B:17:0x0038, code skipped:
            return;
     */
    public static void b(java.lang.String r4) {
        /*
        r0 = a();
        if (r0 == 0) goto L_0x003c;
    L_0x0006:
        r0 = a;
        monitor-enter(r0);
        r1 = a();	 Catch:{ all -> 0x0039 }
        if (r1 != 0) goto L_0x0011;
    L_0x000f:
        monitor-exit(r0);	 Catch:{ all -> 0x0039 }
        return;
    L_0x0011:
        r4 = c(r4);	 Catch:{ all -> 0x0039 }
        r1 = 0;
        r4 = r1.remove(r4);	 Catch:{ all -> 0x0039 }
        r4 = (defpackage.bchq) r4;	 Catch:{ all -> 0x0039 }
        if (r4 != 0) goto L_0x0020;
    L_0x001e:
        monitor-exit(r0);	 Catch:{ all -> 0x0039 }
        return;
    L_0x0020:
        r2 = android.os.SystemClock.elapsedRealtimeNanos();	 Catch:{ all -> 0x0039 }
        r4.e = r2;	 Catch:{ all -> 0x0039 }
        r2 = android.os.SystemClock.currentThreadTimeMillis();	 Catch:{ all -> 0x0039 }
        r4.f = r2;	 Catch:{ all -> 0x0039 }
        r1.add(r4);	 Catch:{ all -> 0x0039 }
        r4 = b;	 Catch:{ all -> 0x0039 }
        r1 = 2;
        if (r4 != r1) goto L_0x0037;
    L_0x0034:
        c();	 Catch:{ all -> 0x0039 }
    L_0x0037:
        monitor-exit(r0);	 Catch:{ all -> 0x0039 }
        return;
    L_0x0039:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0039 }
        throw r4;
    L_0x003c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.EarlyTraceEvent.b(java.lang.String):void");
    }

    public static void c() {
        long d;
        Iterator it;
        List<bchq> list = null;
        if (!list.isEmpty()) {
            d = d();
            for (bchq bchq : list) {
                nativeRecordEarlyEvent(bchq.a, bchq.c + d, bchq.e + d, bchq.b, bchq.f - bchq.d);
            }
            list.clear();
        }
        if (!list.isEmpty()) {
            d = d();
            it = list.iterator();
            while (it.hasNext()) {
                bchp bchp = (bchp) it.next();
                if (bchp.a) {
                    nativeRecordEarlyStartAsyncEvent(bchp.b, bchp.c, bchp.d + d);
                } else {
                    nativeRecordEarlyFinishAsyncEvent(bchp.b, bchp.c, bchp.d + d);
                }
            }
            list.clear();
        }
        if (list.isEmpty() && list.isEmpty()) {
            b = 3;
        }
    }

    private static long d() {
        return (TimeUtils.nativeGetTimeTicksNowUs() * 1000) - SystemClock.elapsedRealtimeNanos();
    }

    private static String c(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("@");
        stringBuilder.append(Process.myTid());
        return stringBuilder.toString();
    }
}
