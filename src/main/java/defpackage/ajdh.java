package defpackage;

import android.util.Base64;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: ajdh */
public final class ajdh implements afid {
    private final Runnable A = new ajdg(this);
    private final Runnable B = new ajdj(this);
    private final Runnable C = new ajdi(this);
    private final Runnable D = new ajdl(this);
    private long E;
    private final Runnable F = new ajdk(this);
    private final ScheduledExecutorService G;
    private ScheduledFuture H;
    private angb I;
    private int J;
    private long K;
    private int L;
    public final xsc a;
    public final Executor b;
    public final afia c;
    public final ajdf d;
    public final long e;
    public final int f;
    public final float g;
    public final int h;
    public final float i;
    public volatile boolean j;
    public boolean k;
    public volatile boolean l;
    public long m;
    public volatile int n;
    public final Object o = new Object();
    public ahkm p;
    public boolean q;
    private final boolean r;
    private final int s;
    private final int t;
    private final boolean u;
    private final int v;
    private long w;
    private final Object x = new Object();
    private volatile long y;
    private volatile int z;

    private static boolean c(int i) {
        return (i == 3 || i == 8 || i == 7) ? false : true;
    }

    public final void a(int i) {
    }

    public final void a(long j, long j2) {
    }

    public final void a(afin afin) {
        synchronized (this.x) {
            this.y += afin.c;
            this.z += afin.b;
        }
        b(false);
    }

    public final synchronized long a() {
        return this.E;
    }

    public final void a(boolean z) {
        c();
        if (!this.l) {
            angc angc;
            e(true);
            synchronized (this.o) {
                angb angb = this.I;
                angb.copyOnWrite();
                angc angc2 = (angc) angb.instance;
                angc2.a = 1 | angc2.a;
                angc2.c = z;
                angc = (angc) ((anxl) angb.build());
                this.J = 0;
                this.I = (angb) angc.d.createBuilder();
            }
            try {
                this.b.execute(new ajdn(this, Base64.encodeToString(angc.toByteArray(), 0)));
            } catch (AssertionError unused) {
                xtl.d("Error when encoding currentRebufferInfo");
            }
            if (ajdh.c(this.n) && !z) {
                b();
            }
        }
    }

    public final synchronized void b() {
        c();
        this.H = this.G.schedule(this.F, (long) this.h, TimeUnit.SECONDS);
    }

    private final synchronized void c() {
        ScheduledFuture scheduledFuture = this.H;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.H = null;
        }
    }

    /* JADX WARNING: Missing block: B:15:0x0030, code skipped:
            if (r1 < 0) goto L_0x00bd;
     */
    /* JADX WARNING: Missing block: B:17:0x0034, code skipped:
            if (r4 < r11.v) goto L_0x003c;
     */
    /* JADX WARNING: Missing block: B:18:0x0036, code skipped:
            defpackage.xtl.d("We've reached the rebuffer observation threshold for this reporting interval");
     */
    /* JADX WARNING: Missing block: B:19:0x003b, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:21:0x003d, code skipped:
            if (r5 != 5) goto L_0x0041;
     */
    /* JADX WARNING: Missing block: B:22:0x003f, code skipped:
            r0 = 2;
     */
    /* JADX WARNING: Missing block: B:23:0x0041, code skipped:
            if (r5 == 9) goto L_0x0045;
     */
    /* JADX WARNING: Missing block: B:24:0x0043, code skipped:
            r0 = 1;
     */
    /* JADX WARNING: Missing block: B:25:0x0045, code skipped:
            r0 = 3;
     */
    /* JADX WARNING: Missing block: B:26:0x0046, code skipped:
            r1 = a(r1);
     */
    /* JADX WARNING: Missing block: B:27:0x004d, code skipped:
            if (r1 < 0.0f) goto L_0x008c;
     */
    /* JADX WARNING: Missing block: B:28:0x004f, code skipped:
            r2 = (defpackage.angd) defpackage.ange.e.createBuilder();
            r2.copyOnWrite();
            r4 = (defpackage.ange) r2.instance;
            r4.a |= 1;
            r4.b = r0 - 1;
            r2.copyOnWrite();
            r0 = (defpackage.ange) r2.instance;
            r0.a |= 4;
            r0.d = r1;
     */
    /* JADX WARNING: Missing block: B:29:0x0076, code skipped:
            if (r3 != 1) goto L_0x0079;
     */
    /* JADX WARNING: Missing block: B:30:0x0079, code skipped:
            if (r3 != 2) goto L_0x007c;
     */
    /* JADX WARNING: Missing block: B:31:0x007c, code skipped:
            r8 = false;
     */
    /* JADX WARNING: Missing block: B:32:0x007d, code skipped:
            r2.copyOnWrite();
            r0 = (defpackage.ange) r2.instance;
            r0.a = 2 | r0.a;
            r0.c = r8;
     */
    /* JADX WARNING: Missing block: B:33:0x008c, code skipped:
            r2 = null;
     */
    /* JADX WARNING: Missing block: B:34:0x008d, code skipped:
            r12 = r11.o;
     */
    /* JADX WARNING: Missing block: B:35:0x008f, code skipped:
            monitor-enter(r12);
     */
    /* JADX WARNING: Missing block: B:36:0x0090, code skipped:
            if (r2 == null) goto L_0x00b8;
     */
    /* JADX WARNING: Missing block: B:38:?, code skipped:
            r0 = r11.I;
            r0.copyOnWrite();
            r0 = (defpackage.angc) r0.instance;
     */
    /* JADX WARNING: Missing block: B:39:0x00a1, code skipped:
            if (r0.b.a() != false) goto L_0x00ab;
     */
    /* JADX WARNING: Missing block: B:40:0x00a3, code skipped:
            r0.b = defpackage.anxl.mutableCopy(r0.b);
     */
    /* JADX WARNING: Missing block: B:41:0x00ab, code skipped:
            r0.b.add((defpackage.ange) ((defpackage.anxl) r2.build()));
     */
    /* JADX WARNING: Missing block: B:42:0x00b8, code skipped:
            monitor-exit(r12);
     */
    /* JADX WARNING: Missing block: B:43:0x00b9, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:47:0x00bd, code skipped:
            return;
     */
    private final void e(boolean r12) {
        /*
        r11 = this;
        r0 = r11.o;
        monitor-enter(r0);
        r1 = r11.K;	 Catch:{ all -> 0x00be }
        r3 = r11.L;	 Catch:{ all -> 0x00be }
        r4 = r11.J;	 Catch:{ all -> 0x00be }
        r5 = r11.n;	 Catch:{ all -> 0x00be }
        r6 = 9;
        r7 = 5;
        if (r5 == r7) goto L_0x0014;
    L_0x0010:
        if (r5 == r6) goto L_0x0014;
    L_0x0012:
        monitor-exit(r0);	 Catch:{ all -> 0x00be }
        return;
    L_0x0014:
        r8 = 1;
        if (r12 == 0) goto L_0x0020;
    L_0x0017:
        r12 = r11.a;	 Catch:{ all -> 0x00be }
        r9 = r12.b();	 Catch:{ all -> 0x00be }
        r11.K = r9;	 Catch:{ all -> 0x00be }
        goto L_0x0026;
    L_0x0020:
        r9 = -1;
        r11.K = r9;	 Catch:{ all -> 0x00be }
        r11.L = r8;	 Catch:{ all -> 0x00be }
    L_0x0026:
        r12 = r11.J;	 Catch:{ all -> 0x00be }
        r12 = r12 + r8;
        r11.J = r12;	 Catch:{ all -> 0x00be }
        monitor-exit(r0);	 Catch:{ all -> 0x00be }
        r9 = 0;
        r12 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1));
        if (r12 < 0) goto L_0x00bd;
    L_0x0032:
        r12 = r11.v;
        if (r4 < r12) goto L_0x003c;
    L_0x0036:
        r12 = "We've reached the rebuffer observation threshold for this reporting interval";
        defpackage.xtl.d(r12);
        return;
    L_0x003c:
        r12 = 2;
        if (r5 != r7) goto L_0x0041;
    L_0x003f:
        r0 = 2;
        goto L_0x0046;
    L_0x0041:
        if (r5 == r6) goto L_0x0045;
    L_0x0043:
        r0 = 1;
        goto L_0x0046;
    L_0x0045:
        r0 = 3;
    L_0x0046:
        r1 = r11.a(r1);
        r2 = 0;
        r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r2 < 0) goto L_0x008c;
    L_0x004f:
        r2 = defpackage.ange.e;
        r2 = r2.createBuilder();
        r2 = (defpackage.angd) r2;
        r2.copyOnWrite();
        r4 = r2.instance;
        r4 = (defpackage.ange) r4;
        r5 = r4.a;
        r5 = r5 | r8;
        r4.a = r5;
        r0 = r0 + -1;
        r4.b = r0;
        r2.copyOnWrite();
        r0 = r2.instance;
        r0 = (defpackage.ange) r0;
        r4 = r0.a;
        r4 = r4 | 4;
        r0.a = r4;
        r0.d = r1;
        if (r3 != r8) goto L_0x0079;
    L_0x0078:
        goto L_0x008d;
    L_0x0079:
        if (r3 != r12) goto L_0x007c;
    L_0x007b:
        goto L_0x007d;
    L_0x007c:
        r8 = 0;
    L_0x007d:
        r2.copyOnWrite();
        r0 = r2.instance;
        r0 = (defpackage.ange) r0;
        r1 = r0.a;
        r12 = r12 | r1;
        r0.a = r12;
        r0.c = r8;
        goto L_0x008d;
    L_0x008c:
        r2 = 0;
    L_0x008d:
        r12 = r11.o;
        monitor-enter(r12);
        if (r2 == 0) goto L_0x00b8;
    L_0x0092:
        r0 = r11.I;	 Catch:{ all -> 0x00ba }
        r0.copyOnWrite();	 Catch:{ all -> 0x00ba }
        r0 = r0.instance;	 Catch:{ all -> 0x00ba }
        r0 = (defpackage.angc) r0;	 Catch:{ all -> 0x00ba }
        r1 = r0.b;	 Catch:{ all -> 0x00ba }
        r1 = r1.a();	 Catch:{ all -> 0x00ba }
        if (r1 != 0) goto L_0x00ab;
    L_0x00a3:
        r1 = r0.b;	 Catch:{ all -> 0x00ba }
        r1 = defpackage.anxl.mutableCopy(r1);	 Catch:{ all -> 0x00ba }
        r0.b = r1;	 Catch:{ all -> 0x00ba }
    L_0x00ab:
        r0 = r0.b;	 Catch:{ all -> 0x00ba }
        r1 = r2.build();	 Catch:{ all -> 0x00ba }
        r1 = (defpackage.anxl) r1;	 Catch:{ all -> 0x00ba }
        r1 = (defpackage.ange) r1;	 Catch:{ all -> 0x00ba }
        r0.add(r1);	 Catch:{ all -> 0x00ba }
    L_0x00b8:
        monitor-exit(r12);	 Catch:{ all -> 0x00ba }
        return;
    L_0x00ba:
        r0 = move-exception;
        monitor-exit(r12);	 Catch:{ all -> 0x00ba }
        throw r0;
    L_0x00bd:
        return;
    L_0x00be:
        r12 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00be }
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajdh.e(boolean):void");
    }

    private final synchronized float a(long j) {
        long b;
        b = this.a.b() - j;
        this.E += b / 1000;
        return ((float) Math.round(((float) (b * 10)) / 1000.0f)) / 10.0f;
    }

    private final synchronized boolean d() {
        return this.H != null;
    }

    public final void b(int i) {
        if (this.j && this.q && this.n != i) {
            Object obj = (this.n == 5 || this.n == 9) ? 1 : null;
            Object obj2 = (i == 5 || i == 9) ? 1 : null;
            if (obj != null) {
                if (obj2 == null) {
                    e(false);
                } else if (i != 9) {
                    i = this.n;
                } else {
                    e(true);
                }
            } else if (obj2 != null) {
                synchronized (this.o) {
                    if (this.K >= 0) {
                    } else {
                        ahkm ahkm = this.p;
                        if (ahkm != null) {
                            long j = ahkm.e;
                            if (j != -1) {
                                long j2 = ahkm.a;
                                if (j2 != -1) {
                                    this.L = j - j2 > 0 ? 2 : 3;
                                    this.p = null;
                                    this.K = this.a.b();
                                }
                            }
                        }
                        this.L = 1;
                        this.K = this.a.b();
                    }
                }
            }
            if (ajdh.c(i) && !d()) {
                b();
            }
            this.n = i;
        }
    }

    public final void b(boolean z) {
        if (this.r) {
            if (z) {
                this.b.execute(this.A);
            } else {
                this.b.execute(this.B);
            }
        } else if (z) {
            this.b.execute(this.C);
        } else {
            this.b.execute(this.D);
        }
    }

    public final void c(boolean z) {
        synchronized (this.x) {
            long b = this.a.b();
            if (this.y > 0 && (z || b > this.w)) {
                if (this.z <= this.s) {
                    if (this.y <= ((long) this.t)) {
                        if (this.u) {
                            this.y = 0;
                            this.z = 0;
                        }
                        this.w = b + 30000;
                    }
                }
                a(this.y, this.z);
                this.y = 0;
                this.z = 0;
                this.w = b + 30000;
            }
        }
    }

    public final void d(boolean z) {
        synchronized (this.x) {
            long b = this.a.b();
            if (this.y > 0 && (z || b > this.w)) {
                if (this.z > this.s) {
                    a(this.y, this.z);
                }
                this.w = b + 30000;
                this.y = 0;
                this.z = 0;
            }
        }
    }

    private final void a(long j, int i) {
        if (i > 0) {
            ajdf ajdf = this.d;
            amqw.a(true);
            tkt a = ajdf.b.a();
            a.b(j);
            a.a(TimeUnit.MILLISECONDS.toMicros((long) i));
            ajdf.a.a(a);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(65);
        stringBuilder.append("bandwidthElapsed not > 0, bandwidthBytes is: ");
        stringBuilder.append(j);
        xtl.d(stringBuilder.toString());
    }

    /* synthetic */ ajdh(xsc xsc, Executor executor, ajdf ajdf, afia afia, awtm awtm, ScheduledExecutorService scheduledExecutorService) {
        this.a = xsc;
        this.b = executor;
        this.d = ajdf;
        this.c = afia;
        this.r = awtm.j;
        this.s = awtm.k;
        this.t = awtm.l;
        this.u = awtm.m;
        this.v = awtm.r;
        this.f = awtm.t;
        this.h = awtm.p;
        this.g = awtm.s;
        this.i = awtm.q;
        this.j = awtm.n;
        this.G = scheduledExecutorService;
        long b = xsc.b();
        this.e = b;
        this.w = b + 30000;
        this.k = true;
        this.n = 0;
        this.I = (angb) angc.d.createBuilder();
        this.q = false;
        this.J = 0;
        this.m = 0;
        this.l = false;
        this.L = 1;
        this.K = -1;
    }
}
