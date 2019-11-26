package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: zkg */
public final class zkg {
    public final Looper a;
    public final Thread b = this.a.getThread();
    public boolean c;
    public zkd d;
    public String e;
    public String f;
    private boolean g;

    public zkg() {
        HandlerThread handlerThread = new HandlerThread(zkg.class.getSimpleName());
        handlerThread.start();
        this.a = handlerThread.getLooper();
        new Handler(this.a).post(new zkf(this));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001f */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:10|11|12|13|14|15|(2:17|28)(1:27)|23|4) */
    public final void a() {
        /*
        r8 = this;
        r0 = r8.b;
        monitor-enter(r0);
        r1 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x003c }
    L_0x0007:
        r3 = r8.b;	 Catch:{ all -> 0x003c }
        r3 = r3.isAlive();	 Catch:{ all -> 0x003c }
        if (r3 == 0) goto L_0x003a;
    L_0x000f:
        r3 = r8.c;	 Catch:{ all -> 0x003c }
        if (r3 != 0) goto L_0x003a;
    L_0x0013:
        r3 = r8.g;	 Catch:{ all -> 0x003c }
        if (r3 != 0) goto L_0x003a;
    L_0x0017:
        r3 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r5 = r8.b;	 Catch:{ InterruptedException -> 0x001f }
        r5.wait(r3);	 Catch:{ InterruptedException -> 0x001f }
        goto L_0x0026;
    L_0x001f:
        r5 = "GlDeviceInfo";
        r6 = "Wait interrupted";
        defpackage.xtl.b(r5, r6);	 Catch:{ all -> 0x003c }
    L_0x0026:
        r5 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x003c }
        r5 = r5 - r1;
        r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r7 < 0) goto L_0x0007;
    L_0x002f:
        r3 = "GlDeviceInfo";
        r4 = "Wait for GlDeviceInfo timed out";
        defpackage.xtl.b(r3, r4);	 Catch:{ all -> 0x003c }
        r3 = 1;
        r8.g = r3;	 Catch:{ all -> 0x003c }
        goto L_0x0007;
    L_0x003a:
        monitor-exit(r0);	 Catch:{ all -> 0x003c }
        return;
    L_0x003c:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x003c }
        goto L_0x0040;
    L_0x003f:
        throw r1;
    L_0x0040:
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zkg.a():void");
    }
}
