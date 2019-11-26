package defpackage;

import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* renamed from: amzn */
final class amzn extends amzf {
    public static final AtomicReference b = new AtomicReference();
    private static amzj d;
    private static final AtomicLong e = new AtomicLong();
    private static final ConcurrentLinkedQueue f = new ConcurrentLinkedQueue();
    public volatile amyr c;

    public amzn(String str) {
        super(str);
        amzj amzj = d;
        this.c = amzj != null ? amzj.a(a()) : null;
    }

    public static void b() {
        while (true) {
            amzp amzp = (amzp) f.poll();
            if (amzp != null) {
                e.getAndDecrement();
                amyr amyr = amzp.a;
                amys amys = amzp.b;
                if (amys.j() || amyr.a(amys.d())) {
                    amyr.a(amys);
                }
            } else {
                return;
            }
        }
    }

    public final boolean a(Level level) {
        return this.c != null ? this.c.a(level) : true;
    }

    public final void a(amys amys) {
        if (this.c != null) {
            this.c.a(amys);
            return;
        }
        if (e.incrementAndGet() > 20) {
            f.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f.offer(new amzp(this, amys));
        if (this.c != null) {
            amzn.b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    static {
        /*
        r0 = new java.util.concurrent.atomic.AtomicReference;
        r0.<init>();
        b = r0;
        r0 = android.os.Build.FINGERPRINT;
        r1 = 0;
        r2 = 1;
        if (r0 == 0) goto L_0x001a;
    L_0x000d:
        r0 = android.os.Build.FINGERPRINT;
        r3 = "robolectric";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0018;
    L_0x0017:
        goto L_0x001a;
    L_0x0018:
        r0 = 0;
        goto L_0x001b;
    L_0x001a:
        r0 = 1;
    L_0x001b:
        r3 = android.os.Build.HARDWARE;
        r4 = "goldfish";
        r3 = r4.equals(r3);
        if (r3 != 0) goto L_0x0031;
    L_0x0025:
        r3 = android.os.Build.HARDWARE;
        r4 = "ranchu";
        r3 = r4.equals(r3);
        if (r3 == 0) goto L_0x0030;
    L_0x002f:
        goto L_0x0031;
    L_0x0030:
        r2 = 0;
    L_0x0031:
        if (r0 == 0) goto L_0x0034;
    L_0x0033:
        goto L_0x003a;
    L_0x0034:
        if (r2 != 0) goto L_0x003a;
    L_0x0036:
        r0 = 0;
        d = r0;
        goto L_0x0041;
    L_0x003a:
        r0 = new amzk;
        r0.<init>();
        d = r0;
    L_0x0041:
        r0 = new java.util.concurrent.atomic.AtomicLong;
        r0.<init>();
        e = r0;
        r0 = new java.util.concurrent.ConcurrentLinkedQueue;
        r0.<init>();
        f = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amzn.<clinit>():void");
    }
}
