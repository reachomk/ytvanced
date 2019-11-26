package defpackage;

import android.app.Application;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: tur */
final class tur extends ttj implements tzh {
    public final AtomicBoolean d = new AtomicBoolean();
    public volatile twr e;
    public final tuo f;
    public final ude g;
    public final boolean h;
    public final AtomicBoolean i;
    public final boolean j;
    private final boolean k;
    private final int l;
    private final tty m;
    private volatile tuv n;
    private volatile bcdq o;

    tur(udc udc, ude ude, tzu tzu, tzu tzu2, Application application, float f, boolean z) {
        super(udc, application, tzu, tzu2, 1);
        uhy.a((Object) ude);
        boolean z2 = f > 0.0f && f <= 100.0f;
        uhy.a(z2, (Object) "StartupSamplePercentage should be a floating number > 0 and <= 100.");
        this.m = tty.a(application);
        this.k = new udb(f / 100.0f).a();
        this.l = (int) (100.0f / f);
        this.f = null;
        this.g = ude;
        this.h = false;
        this.i = new AtomicBoolean(false);
        this.j = z;
    }

    /* Access modifiers changed, original: final */
    public final UncaughtExceptionHandler a(UncaughtExceptionHandler uncaughtExceptionHandler) {
        return new tuu(this, uncaughtExceptionHandler);
    }

    public final void g() {
        if (this.i.getAndSet(false)) {
            a(bcfa.PRIMES_CRASH_MONITORING_INITIALIZED, this.o);
            a(bcfa.PRIMES_FIRST_ACTIVITY_LAUNCHED, null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x008e A:{Catch:{ IOException -> 0x009b, SecurityException -> 0x0092 }} */
    public final void e() {
        /*
        r10 = this;
        r0 = 0;
        r1 = new java.lang.Object[r0];
        r2 = "CrashMetricService";
        r3 = "onPrimesInitialize";
        defpackage.tyv.b(r2, r3, r1);
        r1 = r10.j;
        r3 = 0;
        if (r1 == 0) goto L_0x00ac;
    L_0x000f:
        r1 = new java.lang.Object[r0];
        r4 = "persistent crash enabled.";
        defpackage.tyv.b(r2, r4, r1);
        defpackage.uia.b();	 Catch:{ RuntimeException -> 0x00a4 }
        r1 = new java.io.File;	 Catch:{ RuntimeException -> 0x00a4 }
        r4 = r10.a;	 Catch:{ RuntimeException -> 0x00a4 }
        r4 = r4.getFilesDir();	 Catch:{ RuntimeException -> 0x00a4 }
        r5 = "primes_crash";
        r1.<init>(r4, r5);	 Catch:{ RuntimeException -> 0x00a4 }
        r4 = r1.exists();	 Catch:{ IOException -> 0x009b, SecurityException -> 0x0092 }
        if (r4 == 0) goto L_0x00ac;
    L_0x002c:
        r4 = "found persisted crash";
        r5 = new java.lang.Object[r0];	 Catch:{ IOException -> 0x009b, SecurityException -> 0x0092 }
        defpackage.tyv.b(r2, r4, r5);	 Catch:{ IOException -> 0x009b, SecurityException -> 0x0092 }
        r4 = defpackage.bcdq.i;	 Catch:{ IOException -> 0x009b, SecurityException -> 0x0092 }
        r4 = r4.createBuilder();	 Catch:{ IOException -> 0x009b, SecurityException -> 0x0092 }
        r4 = (defpackage.bcdp) r4;	 Catch:{ IOException -> 0x009b, SecurityException -> 0x0092 }
        r5 = r1.length();	 Catch:{ all -> 0x008a }
        r7 = 0;
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 <= 0) goto L_0x0069;
    L_0x0045:
        r7 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 >= 0) goto L_0x0069;
    L_0x004c:
        r6 = (int) r5;	 Catch:{ all -> 0x008a }
        r5 = new byte[r6];	 Catch:{ all -> 0x008a }
        r7 = new java.io.FileInputStream;	 Catch:{ all -> 0x008a }
        r7.<init>(r1);	 Catch:{ all -> 0x008a }
        r8 = 0;
    L_0x0055:
        if (r8 >= r6) goto L_0x005f;
    L_0x0057:
        r9 = r6 - r8;
        r9 = r7.read(r5, r8, r9);	 Catch:{ all -> 0x0067 }
        r8 = r8 + r9;
        goto L_0x0055;
    L_0x005f:
        r6 = defpackage.anxa.c();	 Catch:{ all -> 0x0067 }
        r4.mergeFrom(r5, r6);	 Catch:{ all -> 0x0067 }
        goto L_0x006d;
    L_0x0067:
        r1 = move-exception;
        goto L_0x008c;
    L_0x0069:
        r4.a();	 Catch:{ all -> 0x008a }
        r7 = r3;
    L_0x006d:
        r1 = r1.delete();	 Catch:{ all -> 0x0067 }
        if (r7 == 0) goto L_0x0076;
    L_0x0073:
        r7.close();	 Catch:{ IOException -> 0x009b, SecurityException -> 0x0092 }
    L_0x0076:
        if (r1 != 0) goto L_0x0080;
    L_0x0078:
        r1 = "could not delete crash file";
        r4 = new java.lang.Object[r0];	 Catch:{ IOException -> 0x009b, SecurityException -> 0x0092 }
        defpackage.tyv.d(r2, r1, r4);	 Catch:{ IOException -> 0x009b, SecurityException -> 0x0092 }
        goto L_0x00ac;
    L_0x0080:
        r1 = r4.build();	 Catch:{ IOException -> 0x009b, SecurityException -> 0x0092 }
        r1 = (defpackage.anxl) r1;	 Catch:{ IOException -> 0x009b, SecurityException -> 0x0092 }
        r1 = (defpackage.bcdq) r1;	 Catch:{ IOException -> 0x009b, SecurityException -> 0x0092 }
        r3 = r1;
        goto L_0x00ac;
    L_0x008a:
        r1 = move-exception;
        r7 = r3;
    L_0x008c:
        if (r7 == 0) goto L_0x0091;
    L_0x008e:
        r7.close();	 Catch:{ IOException -> 0x009b, SecurityException -> 0x0092 }
    L_0x0091:
        throw r1;	 Catch:{ IOException -> 0x009b, SecurityException -> 0x0092 }
    L_0x0092:
        r1 = move-exception;
        r4 = "Unexpected SecurityException";
        r5 = new java.lang.Object[r0];	 Catch:{ RuntimeException -> 0x00a4 }
        defpackage.tyv.a(r2, r4, r1, r5);	 Catch:{ RuntimeException -> 0x00a4 }
        goto L_0x00ac;
    L_0x009b:
        r1 = move-exception;
        r4 = "IO failure";
        r5 = new java.lang.Object[r0];	 Catch:{ RuntimeException -> 0x00a4 }
        defpackage.tyv.a(r2, r4, r1, r5);	 Catch:{ RuntimeException -> 0x00a4 }
        goto L_0x00ac;
    L_0x00a4:
        r1 = move-exception;
        r4 = new java.lang.Object[r0];
        r5 = "Unexpected failure: ";
        defpackage.tyv.b(r2, r5, r1, r4);
    L_0x00ac:
        r1 = r10.i;
        r1 = r1.get();
        if (r1 != 0) goto L_0x00d0;
    L_0x00b4:
        r1 = r10.b();
        if (r1 != 0) goto L_0x00bb;
    L_0x00ba:
        goto L_0x00c8;
    L_0x00bb:
        if (r3 == 0) goto L_0x00be;
    L_0x00bd:
        goto L_0x00c2;
    L_0x00be:
        r1 = r10.k;
        if (r1 == 0) goto L_0x00c8;
    L_0x00c2:
        r0 = defpackage.bcfa.PRIMES_CRASH_MONITORING_INITIALIZED;
        r10.a(r0, r3);
        return;
    L_0x00c8:
        r0 = new java.lang.Object[r0];
        r1 = "Startup metric for 'PRIMES_CRASH_MONITORING_INITIALIZED' dropped.";
        defpackage.tyv.c(r2, r1, r0);
        return;
    L_0x00d0:
        r10.o = r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tur.e():void");
    }

    /* Access modifiers changed, original: final */
    public final void a(twr twr) {
        String valueOf = String.valueOf(twr.a(twr));
        String str = "activeComponentName: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        tyv.b("CrashMetricService", valueOf, new Object[0]);
        this.e = twr;
    }

    public final void f() {
        String str = "CrashMetricService";
        tyv.b(str, "onFirstActivityCreated", new Object[0]);
        if (!this.i.get()) {
            bcfa bcfa = bcfa.PRIMES_FIRST_ACTIVITY_LAUNCHED;
            if (b() && this.k) {
                c().submit(new tus(this, bcfa));
            } else {
                tyv.c(str, "Startup metric for '%s' dropped.", bcfa);
            }
        }
        this.n = new tuq(this);
        this.m.a(this.n);
    }

    /* Access modifiers changed, original: final */
    public final void a(bcfa bcfa, bcdq bcdq) {
        bcfd bcfd = (bcfd) bcfe.x.createBuilder();
        bcev bcev = (bcev) bcew.e.createBuilder();
        int i = this.l;
        bcev.copyOnWrite();
        bcew bcew = (bcew) bcev.instance;
        bcew.a |= 2;
        bcew.c = i;
        bcev.copyOnWrite();
        bcew bcew2 = (bcew) bcev.instance;
        if (bcfa != null) {
            bcew2.a |= 1;
            bcew2.b = bcfa.c;
            if (bcdq != null) {
                bcex bcex = (bcex) bcey.e.createBuilder();
                bcex.copyOnWrite();
                bcey bcey = (bcey) bcex.instance;
                bcey.b = bcdq;
                bcey.a |= 1;
                bcev.a((bcey) ((anxl) bcex.build()));
            }
            bcfd.a(bcev);
            a((bcfe) ((anxl) bcfd.build()));
            return;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        if (this.n != null) {
            this.m.b(this.n);
            this.n = null;
        }
        if (this.d.get() && (Thread.getDefaultUncaughtExceptionHandler() instanceof tuu)) {
            Thread.setDefaultUncaughtExceptionHandler(((tuu) Thread.getDefaultUncaughtExceptionHandler()).a);
        }
    }
}
