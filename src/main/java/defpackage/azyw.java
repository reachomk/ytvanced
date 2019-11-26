package defpackage;

import java.security.MessageDigest;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: azyw */
final class azyw implements azzh {
    public static final char[] a = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();
    public final String b;
    public final String c;
    public final azyn d;
    public final String e;
    public final azyl f;
    public final azyk g;
    public final MessageDigest h;
    public azzh i;
    public azzk j;
    public int k;
    public int l;
    private int m;

    public azyw(String str, String str2, azyn azyn, azyl azyl, String str3, azyk azyk, azzn azzn) {
        amqw.a((Object) str);
        amqw.a((Object) str2);
        amqw.a((Object) azyl);
        amqw.a((Object) azyk);
        this.b = str;
        this.c = str2;
        this.d = azyn;
        if (str3 == null) {
            str3 = "";
        }
        this.e = str3;
        this.g = azyk;
        this.f = azyl;
        this.m = 1;
        this.h = azzn.c;
    }

    public final String e() {
        return null;
    }

    public final boolean h() {
        return false;
    }

    public final anjv i() {
        return azzg.a();
    }

    public final synchronized void a(azzk azzk, int i, int i2) {
        boolean z = true;
        amqw.a(i > 0, (Object) "Progress threshold (bytes) must be greater than 0");
        if (i2 < 0) {
            z = false;
        }
        amqw.a(z, (Object) "Progress threshold (millis) must be greater or equal to 0");
        this.j = azzk;
        this.k = i;
        this.l = i2;
    }

    public final anjv a() {
        anka anka;
        azyz azyz = new azyz(this);
        ankn ankn = new ankn();
        ankn.a("Scotty-Uploader-MultipartTransfer-%d");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(ankn.a(ankn));
        if (newSingleThreadExecutor instanceof anka) {
            anka = (anka) newSingleThreadExecutor;
        } else if (newSingleThreadExecutor instanceof ScheduledExecutorService) {
            anka = new ankg((ScheduledExecutorService) newSingleThreadExecutor);
        } else {
            anka = new ankd(newSingleThreadExecutor);
        }
        anjv a = anka.a(azyz);
        anka.shutdown();
        return a;
    }

    public final void f() {
        synchronized (this) {
            azzh azzh = this.i;
            if (azzh != null) {
                azzh.f();
            }
            this.m = 3;
            notifyAll();
        }
    }

    public final azyl g() {
        return this.f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0001 A:{LOOP_START, SYNTHETIC, LOOP:0: B:1:0x0001->B:18:0x0001} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0001 */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing block: B:6:0x0007, code skipped:
            if (r0 == 3) goto L_0x000b;
     */
    /* JADX WARNING: Missing block: B:11:0x0014, code skipped:
            throw new defpackage.azzj(defpackage.azzi.CANCELED, "");
     */
    public final synchronized void b() {
        /*
        r3 = this;
        monitor-enter(r3);
    L_0x0001:
        r0 = r3.m;	 Catch:{ all -> 0x0019 }
        r1 = 2;
        if (r0 == r1) goto L_0x0015;
    L_0x0006:
        r1 = 3;
        if (r0 == r1) goto L_0x000b;
    L_0x0009:
        monitor-exit(r3);
        return;
    L_0x000b:
        r0 = new azzj;	 Catch:{ all -> 0x0019 }
        r1 = defpackage.azzi.CANCELED;	 Catch:{ all -> 0x0019 }
        r2 = "";
        r0.<init>(r1, r2);	 Catch:{ all -> 0x0019 }
        throw r0;	 Catch:{ all -> 0x0019 }
    L_0x0015:
        r3.wait();	 Catch:{ InterruptedException -> 0x0001 }
        goto L_0x0001;
    L_0x0019:
        r0 = move-exception;
        monitor-exit(r3);
        goto L_0x001d;
    L_0x001c:
        throw r0;
    L_0x001d:
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azyw.b():void");
    }
}
