package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: twg */
final class twg extends ttj {
    public static final long d = TimeUnit.DAYS.toMillis(1);
    private static volatile twg q;
    public final tzu b;
    public final tty e;
    public final tzu f;
    public final double g;
    public final ucx h;
    public final ubf i;
    public final ReentrantLock j = new ReentrantLock();
    public final SharedPreferences k;
    public final AtomicLong l = new AtomicLong();
    public volatile ScheduledFuture m;
    public final ttx n = new twf(this);
    public final ttx o = new twh(this);
    public final ttw p = new twj(this);

    private twg(udc udc, Application application, tty tty, ucx ucx, ubf ubf, tzu tzu, tzu tzu2, SharedPreferences sharedPreferences) {
        super(udc, application, tzu, tzu2, 2);
        this.e = tty;
        this.g = 0.95d;
        this.h = (ucx) uhy.a((Object) ucx);
        this.i = (ubf) uhy.a((Object) ubf);
        this.f = (tzu) uhy.a((Object) tzu);
        this.b = (tzu) uhy.a((Object) tzu2);
        this.k = sharedPreferences;
    }

    /* JADX WARNING: Missing block: B:12:0x0034, code skipped:
            if (r0.getPendingJob(184188964) == null) goto L_0x0036;
     */
    static synchronized defpackage.twg a(defpackage.udc r11, android.app.Application r12, defpackage.tzu r13, defpackage.tzu r14, android.content.SharedPreferences r15) {
        /*
        r1 = defpackage.twg.class;
        monitor-enter(r1);
        r0 = "jobscheduler";
        r0 = r12.getSystemService(r0);	 Catch:{ all -> 0x00a9 }
        r0 = (android.app.job.JobScheduler) r0;	 Catch:{ all -> 0x00a9 }
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x00a9 }
        r3 = 24;
        r5 = 0;
        r6 = 184188964; // 0xafa8024 float:2.4122325E-32 double:9.10014395E-316;
        if (r2 >= r3) goto L_0x0030;
    L_0x0015:
        r0 = r0.getAllPendingJobs();	 Catch:{ all -> 0x00a9 }
        r0 = r0.iterator();	 Catch:{ all -> 0x00a9 }
    L_0x001d:
        r2 = r0.hasNext();	 Catch:{ all -> 0x00a9 }
        if (r2 == 0) goto L_0x0036;
    L_0x0023:
        r2 = r0.next();	 Catch:{ all -> 0x00a9 }
        r2 = (android.app.job.JobInfo) r2;	 Catch:{ all -> 0x00a9 }
        r2 = r2.getId();	 Catch:{ all -> 0x00a9 }
        if (r2 != r6) goto L_0x001d;
    L_0x002f:
        goto L_0x004e;
    L_0x0030:
        r0 = r0.getPendingJob(r6);	 Catch:{ all -> 0x00a9 }
        if (r0 != 0) goto L_0x004e;
    L_0x0036:
        r0 = defpackage.ucw.a(r12);	 Catch:{ SecurityException -> 0x0044 }
        r2 = r0.exists();	 Catch:{ SecurityException -> 0x0044 }
        if (r2 == 0) goto L_0x004e;
    L_0x0040:
        r0.delete();	 Catch:{ SecurityException -> 0x0044 }
        goto L_0x004e;
    L_0x0044:
        r0 = move-exception;
        r2 = "SerializedMhdFile";
        r3 = "Error deleting file";
        r6 = new java.lang.Object[r5];	 Catch:{ all -> 0x00a9 }
        defpackage.tyv.c(r2, r3, r0, r6);	 Catch:{ all -> 0x00a9 }
    L_0x004e:
        r0 = q;	 Catch:{ all -> 0x00a9 }
        if (r0 != 0) goto L_0x00a5;
    L_0x0052:
        r0 = r13.a();	 Catch:{ all -> 0x00a9 }
        r0 = (defpackage.twe) r0;	 Catch:{ all -> 0x00a9 }
        r0 = r0.a;	 Catch:{ all -> 0x00a9 }
        if (r0 == 0) goto L_0x0060;
    L_0x005c:
        r5 = r0.hashCode();	 Catch:{ all -> 0x00a9 }
    L_0x0060:
        r0 = new twg;	 Catch:{ all -> 0x00a9 }
        r6 = defpackage.tty.a(r12);	 Catch:{ all -> 0x00a9 }
        r2 = new ucz;	 Catch:{ all -> 0x00a9 }
        r2.<init>(r15);	 Catch:{ all -> 0x00a9 }
        r7 = new ucx;	 Catch:{ all -> 0x00a9 }
        r3 = "primes.miniheapdump.memorySamples";
        r8 = defpackage.udq.d;	 Catch:{ all -> 0x00a9 }
        r8 = r8.getParserForType();	 Catch:{ all -> 0x00a9 }
        r3 = r2.a(r3, r8);	 Catch:{ all -> 0x00a9 }
        r3 = (defpackage.udq) r3;	 Catch:{ all -> 0x00a9 }
        if (r3 != 0) goto L_0x007e;
    L_0x007d:
        goto L_0x008a;
    L_0x007e:
        r8 = r3.a;	 Catch:{ all -> 0x00a9 }
        r8 = r8 & 1;
        if (r8 == 0) goto L_0x008a;
    L_0x0084:
        r8 = r3.c;	 Catch:{ all -> 0x00a9 }
        if (r8 == r5) goto L_0x008a;
    L_0x0088:
        r3 = defpackage.udq.d;	 Catch:{ all -> 0x00a9 }
    L_0x008a:
        r8 = new java.util.Random;	 Catch:{ all -> 0x00a9 }
        r8.<init>();	 Catch:{ all -> 0x00a9 }
        r7.<init>(r2, r3, r5, r8);	 Catch:{ all -> 0x00a9 }
        r8 = new ubf;	 Catch:{ all -> 0x00a9 }
        r8.<init>();	 Catch:{ all -> 0x00a9 }
        r2 = r0;
        r3 = r11;
        r4 = r12;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r13;
        r9 = r14;
        r10 = r15;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ all -> 0x00a9 }
        q = r0;	 Catch:{ all -> 0x00a9 }
    L_0x00a5:
        r0 = q;	 Catch:{ all -> 0x00a9 }
        monitor-exit(r1);
        return r0;
    L_0x00a9:
        r0 = move-exception;
        monitor-exit(r1);
        goto L_0x00ad;
    L_0x00ac:
        throw r0;
    L_0x00ad:
        goto L_0x00ac;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.twg.a(udc, android.app.Application, tzu, tzu, android.content.SharedPreferences):twg");
    }

    static boolean a(Application application) {
        return uaa.a(application, "com.google.android.libraries.performance.primes.backgroundjobs.logger.LoggerJob");
    }

    public final void e() {
        if (this.m != null) {
            this.m.cancel(true);
            this.m = null;
        }
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        e();
        this.e.b(this.n);
        this.e.b(this.p);
        tyu.d(this.a);
    }

    public final void a(bceq bceq) {
        bcfd bcfd = (bcfd) bcfe.x.createBuilder();
        bcev bcev = (bcev) bcew.e.createBuilder();
        bcex bcex = (bcex) bcey.e.createBuilder();
        bcex.copyOnWrite();
        bcey bcey = (bcey) bcex.instance;
        if (bceq != null) {
            bcey.d = bceq;
            bcey.a |= 4;
            bcev.a((bcey) ((anxl) bcex.build()));
            bcfd.a(bcev);
            a((bcfe) ((anxl) bcfd.build()));
            return;
        }
        throw new NullPointerException();
    }
}
