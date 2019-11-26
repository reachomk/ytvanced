package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbya */
public final class bbya {
    public static final Map a = new ConcurrentHashMap();
    private static final boolean b;
    private static final int c;
    private static final AtomicReference d = new AtomicReference();

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (b && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            a.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        return newScheduledThreadPool;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:? A:{SYNTHETIC, RETURN, ORIG_RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053 A:{LOOP_START, LOOP:0: B:14:0x0053->B:19:0x0080} */
    /* JADX WARNING: Missing block: B:3:0x002a, code skipped:
            if (r2 != false) goto L_0x002f;
     */
    static {
        /*
        r0 = new java.util.concurrent.atomic.AtomicReference;
        r0.<init>();
        d = r0;
        r0 = new java.util.concurrent.ConcurrentHashMap;
        r0.<init>();
        a = r0;
        r0 = java.lang.System.getProperties();
        r1 = new bbxz;
        r1.<init>();
        r2 = "rx2.purge-enabled";
        r3 = r0.containsKey(r2);
        r4 = 1;
        if (r3 == 0) goto L_0x002d;
    L_0x0020:
        r2 = r0.getProperty(r2);
        r2 = java.lang.Boolean.parseBoolean(r2);
        r1.a = r2;
        if (r2 == 0) goto L_0x0045;
    L_0x002c:
        goto L_0x002f;
    L_0x002d:
        r1.a = r4;
    L_0x002f:
        r2 = "rx2.purge-period-seconds";
        r3 = r0.containsKey(r2);
        if (r3 == 0) goto L_0x0045;
    L_0x0037:
        r0 = r0.getProperty(r2);	 Catch:{ NumberFormatException -> 0x0042 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x0042 }
        r1.b = r0;	 Catch:{ NumberFormatException -> 0x0042 }
        goto L_0x0047;
    L_0x0042:
        r1.b = r4;
        goto L_0x0047;
    L_0x0045:
        r1.b = r4;
    L_0x0047:
        r0 = r1.a;
        b = r0;
        r0 = r1.b;
        c = r0;
        r0 = b;
        if (r0 == 0) goto L_0x0084;
    L_0x0053:
        r0 = d;
        r0 = r0.get();
        r0 = (java.util.concurrent.ScheduledExecutorService) r0;
        if (r0 != 0) goto L_0x0084;
    L_0x005d:
        r0 = new bbxw;
        r1 = "RxSchedulerPurge";
        r0.<init>(r1);
        r5 = java.util.concurrent.Executors.newScheduledThreadPool(r4, r0);
        r0 = d;
        r1 = 0;
        r0 = r0.compareAndSet(r1, r5);
        if (r0 == 0) goto L_0x0080;
    L_0x0071:
        r6 = new bbyc;
        r6.<init>();
        r0 = c;
        r7 = (long) r0;
        r9 = (long) r0;
        r11 = java.util.concurrent.TimeUnit.SECONDS;
        r5.scheduleAtFixedRate(r6, r7, r9, r11);
        goto L_0x0084;
    L_0x0080:
        r5.shutdownNow();
        goto L_0x0053;
    L_0x0084:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbya.<clinit>():void");
    }
}
