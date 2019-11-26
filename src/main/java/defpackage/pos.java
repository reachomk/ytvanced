package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Locale;

/* renamed from: pos */
public final class pos {
    public static final Object b = new Object();
    private static final pon g = new pon("RequestTracker");
    public long a = -1;
    private final long c;
    private final Handler d = new Handler(Looper.getMainLooper());
    private pot e;
    private Runnable f;

    public pos(long j) {
        this.c = j;
    }

    public final void a(long j, pot pot) {
        pot pot2;
        long j2;
        synchronized (b) {
            pot2 = this.e;
            j2 = this.a;
            this.a = j;
            this.e = pot;
        }
        if (pot2 != null) {
            pot2.a(j2);
        }
        synchronized (b) {
            Runnable runnable = this.f;
            if (runnable != null) {
                this.d.removeCallbacks(runnable);
            }
            this.f = new pov(this);
            this.d.postDelayed(this.f, this.c);
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (b) {
            z = this.a != -1;
        }
        return z;
    }

    public final boolean a(long j) {
        boolean z;
        synchronized (b) {
            long j2 = this.a;
            z = false;
            if (j2 != -1) {
                if (j2 == j) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARNING: Missing block: B:11:0x0027, code skipped:
            return false;
     */
    public final boolean a(long r8, int r10, java.lang.Object r11) {
        /*
        r7 = this;
        r0 = b;
        monitor-enter(r0);
        r1 = r7.a;	 Catch:{ all -> 0x0028 }
        r3 = -1;
        r5 = 0;
        r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r6 == 0) goto L_0x0026;
    L_0x000c:
        r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1));
        if (r3 != 0) goto L_0x0026;
    L_0x0010:
        r1 = java.util.Locale.ROOT;	 Catch:{ all -> 0x0028 }
        r2 = "request %d completed";
        r3 = 1;
        r4 = new java.lang.Object[r3];	 Catch:{ all -> 0x0028 }
        r8 = java.lang.Long.valueOf(r8);	 Catch:{ all -> 0x0028 }
        r4[r5] = r8;	 Catch:{ all -> 0x0028 }
        r8 = java.lang.String.format(r1, r2, r4);	 Catch:{ all -> 0x0028 }
        r7.a(r10, r11, r8);	 Catch:{ all -> 0x0028 }
        monitor-exit(r0);	 Catch:{ all -> 0x0028 }
        return r3;
    L_0x0026:
        monitor-exit(r0);	 Catch:{ all -> 0x0028 }
        return r5;
    L_0x0028:
        r8 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0028 }
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pos.a(long, int, java.lang.Object):boolean");
    }

    public final boolean b() {
        return a(2002);
    }

    public final boolean a(int i) {
        synchronized (b) {
            if (this.a != -1) {
                a(i, null, String.format(Locale.ROOT, "clearing request %d", new Object[]{Long.valueOf(this.a)}));
                return true;
            }
            return false;
        }
    }

    private final void a(int i, Object obj, String str) {
        g.a(str, new Object[0]);
        synchronized (b) {
            pot pot = this.e;
            if (pot != null) {
                pot.a(this.a, i, obj);
            }
            this.a = -1;
            this.e = null;
            synchronized (b) {
                Runnable runnable = this.f;
                if (runnable == null) {
                } else {
                    this.d.removeCallbacks(runnable);
                    this.f = null;
                }
            }
        }
    }
}
