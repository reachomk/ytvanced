package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: baze */
final class baze extends barz {
    private static final Logger k = Logger.getLogger(baze.class.getName());
    private static final byte[] l = "gzip".getBytes(Charset.forName("US-ASCII"));
    public final bauw a;
    public final bbia b;
    public final Executor c;
    public final bayi d;
    public final basr e;
    public bazo f;
    public volatile boolean g;
    public boolean h;
    public batc i = batc.a;
    public basq j = basq.a;
    private volatile ScheduledFuture m;
    private final boolean n;
    private final barv o;
    private final boolean p;
    private boolean q;
    private boolean r;
    private final bazj s;
    private final basu t = new bazm(this);
    private final ScheduledExecutorService u;

    baze(bauw bauw, Executor executor, barv barv, bazj bazj, ScheduledExecutorService scheduledExecutorService, bayi bayi, boolean z) {
        Executor bbgw;
        this.a = bauw;
        this.b = bbhx.a;
        if (executor != aniv.a) {
            bbgw = new bbgw(executor);
        } else {
            bbgw = new bbgt();
        }
        this.c = bbgw;
        this.d = bayi;
        this.e = basr.a();
        boolean z2 = true;
        if (!(bauw.a == baux.UNARY || bauw.a == baux.SERVER_STREAMING)) {
            z2 = false;
        }
        this.n = z2;
        this.o = barv;
        this.s = bazj;
        this.u = scheduledExecutorService;
        this.p = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0143 A:{Catch:{ all -> 0x01d6, all -> 0x01dd }} */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x014f A:{Catch:{ all -> 0x01d6, all -> 0x01dd }} */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x014e A:{Catch:{ all -> 0x01d6, all -> 0x01dd }} */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x015e A:{Catch:{ all -> 0x01d6, all -> 0x01dd }} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0169 A:{Catch:{ all -> 0x01d6, all -> 0x01dd }} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0177 A:{Catch:{ all -> 0x01d6, all -> 0x01dd }} */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01a8 A:{Catch:{ all -> 0x01d6, all -> 0x01dd }} */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01a7 A:{Catch:{ all -> 0x01d6, all -> 0x01dd }} */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01cf A:{Catch:{ all -> 0x01d6, all -> 0x01dd }} */
    public final void a(defpackage.basc r10, defpackage.baum r11) {
        /*
        r9 = this;
        defpackage.bbhx.a();
        r0 = r9.f;	 Catch:{ all -> 0x01dd }
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x000b;
    L_0x0009:
        r0 = 1;
        goto L_0x000c;
    L_0x000b:
        r0 = 0;
    L_0x000c:
        r3 = "Already started";
        defpackage.amqw.b(r0, r3);	 Catch:{ all -> 0x01dd }
        r0 = r9.q;	 Catch:{ all -> 0x01dd }
        r0 = r0 ^ r2;
        r3 = "call was cancelled";
        defpackage.amqw.b(r0, r3);	 Catch:{ all -> 0x01dd }
        r0 = "observer";
        defpackage.amqw.a(r10, r0);	 Catch:{ all -> 0x01dd }
        r0 = "headers";
        defpackage.amqw.a(r11, r0);	 Catch:{ all -> 0x01dd }
        r0 = r9.e;	 Catch:{ all -> 0x01dd }
        r0.d();	 Catch:{ all -> 0x01dd }
        r0 = r9.o;	 Catch:{ all -> 0x01dd }
        r0 = r0.f;	 Catch:{ all -> 0x01dd }
        if (r0 == 0) goto L_0x004a;
    L_0x002e:
        r3 = r9.j;	 Catch:{ all -> 0x01dd }
        r3 = r3.b;	 Catch:{ all -> 0x01dd }
        r3 = r3.get(r0);	 Catch:{ all -> 0x01dd }
        r3 = (defpackage.basn) r3;	 Catch:{ all -> 0x01dd }
        if (r3 != 0) goto L_0x004c;
    L_0x003a:
        r11 = defpackage.bbet.a;	 Catch:{ all -> 0x01dd }
        r9.f = r11;	 Catch:{ all -> 0x01dd }
        r11 = r9.c;	 Catch:{ all -> 0x01dd }
        r1 = new bazd;	 Catch:{ all -> 0x01dd }
        r1.<init>(r9, r10, r0);	 Catch:{ all -> 0x01dd }
        r11.execute(r1);	 Catch:{ all -> 0x01dd }
        goto L_0x01d2;
    L_0x004a:
        r3 = defpackage.baso.a;	 Catch:{ all -> 0x01dd }
    L_0x004c:
        r0 = r9.i;	 Catch:{ all -> 0x01dd }
        r4 = r9.h;	 Catch:{ all -> 0x01dd }
        r5 = defpackage.bbby.c;	 Catch:{ all -> 0x01dd }
        r11.b(r5);	 Catch:{ all -> 0x01dd }
        r5 = defpackage.baso.a;	 Catch:{ all -> 0x01dd }
        if (r3 == r5) goto L_0x0062;
    L_0x0059:
        r5 = defpackage.bbby.c;	 Catch:{ all -> 0x01dd }
        r6 = r3.a();	 Catch:{ all -> 0x01dd }
        r11.a(r5, r6);	 Catch:{ all -> 0x01dd }
    L_0x0062:
        r5 = defpackage.bbby.d;	 Catch:{ all -> 0x01dd }
        r11.b(r5);	 Catch:{ all -> 0x01dd }
        r0 = r0.c;	 Catch:{ all -> 0x01dd }
        r5 = r0.length;	 Catch:{ all -> 0x01dd }
        if (r5 == 0) goto L_0x0071;
    L_0x006c:
        r5 = defpackage.bbby.d;	 Catch:{ all -> 0x01dd }
        r11.a(r5, r0);	 Catch:{ all -> 0x01dd }
    L_0x0071:
        r0 = defpackage.bbby.e;	 Catch:{ all -> 0x01dd }
        r11.b(r0);	 Catch:{ all -> 0x01dd }
        r0 = defpackage.bbby.f;	 Catch:{ all -> 0x01dd }
        r11.b(r0);	 Catch:{ all -> 0x01dd }
        if (r4 == 0) goto L_0x0084;
    L_0x007d:
        r0 = defpackage.bbby.f;	 Catch:{ all -> 0x01dd }
        r4 = l;	 Catch:{ all -> 0x01dd }
        r11.a(r0, r4);	 Catch:{ all -> 0x01dd }
    L_0x0084:
        r0 = r9.c();	 Catch:{ all -> 0x01dd }
        if (r0 == 0) goto L_0x00bb;
    L_0x008a:
        r4 = r0.a();	 Catch:{ all -> 0x01dd }
        if (r4 != 0) goto L_0x0091;
    L_0x0090:
        goto L_0x00bb;
    L_0x0091:
        r11 = new bbbq;	 Catch:{ all -> 0x01dd }
        r1 = defpackage.bavx.e;	 Catch:{ all -> 0x01dd }
        r4 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x01dd }
        r5 = r4.length();	 Catch:{ all -> 0x01dd }
        r5 = r5 + 19;
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01dd }
        r6.<init>(r5);	 Catch:{ all -> 0x01dd }
        r5 = "deadline exceeded: ";
        r6.append(r5);	 Catch:{ all -> 0x01dd }
        r6.append(r4);	 Catch:{ all -> 0x01dd }
        r4 = r6.toString();	 Catch:{ all -> 0x01dd }
        r1 = r1.a(r4);	 Catch:{ all -> 0x01dd }
        r11.<init>(r1);	 Catch:{ all -> 0x01dd }
        r9.f = r11;	 Catch:{ all -> 0x01dd }
        goto L_0x013d;
    L_0x00bb:
        r4 = r9.o;	 Catch:{ all -> 0x01dd }
        r4 = r4.b;	 Catch:{ all -> 0x01dd }
        r5 = r9.e;	 Catch:{ all -> 0x01dd }
        r5.e();	 Catch:{ all -> 0x01dd }
        r5 = k;	 Catch:{ all -> 0x01dd }
        r6 = java.util.logging.Level.FINE;	 Catch:{ all -> 0x01dd }
        r5 = r5.isLoggable(r6);	 Catch:{ all -> 0x01dd }
        if (r5 == 0) goto L_0x0106;
    L_0x00ce:
        if (r0 == 0) goto L_0x0106;
    L_0x00d0:
        if (r4 == r0) goto L_0x00d3;
    L_0x00d2:
        goto L_0x0106;
    L_0x00d3:
        r4 = java.util.concurrent.TimeUnit.NANOSECONDS;	 Catch:{ all -> 0x01dd }
        r4 = r0.a(r4);	 Catch:{ all -> 0x01dd }
        r6 = 0;
        r4 = java.lang.Math.max(r6, r4);	 Catch:{ all -> 0x01dd }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01dd }
        r7 = "Call timeout set to '%d' ns, due to context deadline.";
        r8 = new java.lang.Object[r2];	 Catch:{ all -> 0x01dd }
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x01dd }
        r8[r1] = r4;	 Catch:{ all -> 0x01dd }
        r1 = java.lang.String.format(r7, r8);	 Catch:{ all -> 0x01dd }
        r6.<init>(r1);	 Catch:{ all -> 0x01dd }
        r1 = " Explicit call timeout was not set.";
        r6.append(r1);	 Catch:{ all -> 0x01dd }
        r1 = k;	 Catch:{ all -> 0x01dd }
        r4 = java.util.logging.Level.FINE;	 Catch:{ all -> 0x01dd }
        r5 = "io.grpc.internal.ClientCallImpl";
        r7 = "logIfContextNarrowedTimeout";
        r6 = r6.toString();	 Catch:{ all -> 0x01dd }
        r1.logp(r4, r5, r7, r6);	 Catch:{ all -> 0x01dd }
    L_0x0106:
        r1 = r9.p;	 Catch:{ all -> 0x01dd }
        if (r1 == 0) goto L_0x0119;
    L_0x010a:
        r1 = r9.s;	 Catch:{ all -> 0x01dd }
        r4 = r9.a;	 Catch:{ all -> 0x01dd }
        r5 = r9.o;	 Catch:{ all -> 0x01dd }
        r6 = r9.e;	 Catch:{ all -> 0x01dd }
        r11 = r1.a(r4, r5, r11, r6);	 Catch:{ all -> 0x01dd }
        r9.f = r11;	 Catch:{ all -> 0x01dd }
        goto L_0x013d;
    L_0x0119:
        r1 = r9.s;	 Catch:{ all -> 0x01dd }
        r4 = new bbfc;	 Catch:{ all -> 0x01dd }
        r5 = r9.a;	 Catch:{ all -> 0x01dd }
        r6 = r9.o;	 Catch:{ all -> 0x01dd }
        r4.<init>(r5, r11, r6);	 Catch:{ all -> 0x01dd }
        r1 = r1.a(r4);	 Catch:{ all -> 0x01dd }
        r4 = r9.e;	 Catch:{ all -> 0x01dd }
        r4 = r4.c();	 Catch:{ all -> 0x01dd }
        r5 = r9.a;	 Catch:{ all -> 0x01d6 }
        r6 = r9.o;	 Catch:{ all -> 0x01d6 }
        r11 = r1.a(r5, r11, r6);	 Catch:{ all -> 0x01d6 }
        r9.f = r11;	 Catch:{ all -> 0x01d6 }
        r11 = r9.e;	 Catch:{ all -> 0x01dd }
        r11.a(r4);	 Catch:{ all -> 0x01dd }
    L_0x013d:
        r11 = r9.o;	 Catch:{ all -> 0x01dd }
        r11 = r11.d;	 Catch:{ all -> 0x01dd }
        if (r11 == 0) goto L_0x0148;
    L_0x0143:
        r1 = r9.f;	 Catch:{ all -> 0x01dd }
        r1.a(r11);	 Catch:{ all -> 0x01dd }
    L_0x0148:
        r11 = r9.o;	 Catch:{ all -> 0x01dd }
        r11 = r11.i;	 Catch:{ all -> 0x01dd }
        if (r11 != 0) goto L_0x014f;
    L_0x014e:
        goto L_0x0158;
    L_0x014f:
        r1 = r9.f;	 Catch:{ all -> 0x01dd }
        r11 = r11.intValue();	 Catch:{ all -> 0x01dd }
        r1.b(r11);	 Catch:{ all -> 0x01dd }
    L_0x0158:
        r11 = r9.o;	 Catch:{ all -> 0x01dd }
        r11 = r11.j;	 Catch:{ all -> 0x01dd }
        if (r11 == 0) goto L_0x0167;
    L_0x015e:
        r1 = r9.f;	 Catch:{ all -> 0x01dd }
        r11 = r11.intValue();	 Catch:{ all -> 0x01dd }
        r1.a(r11);	 Catch:{ all -> 0x01dd }
    L_0x0167:
        if (r0 == 0) goto L_0x016e;
    L_0x0169:
        r11 = r9.f;	 Catch:{ all -> 0x01dd }
        r11.a(r0);	 Catch:{ all -> 0x01dd }
    L_0x016e:
        r11 = r9.f;	 Catch:{ all -> 0x01dd }
        r11.a(r3);	 Catch:{ all -> 0x01dd }
        r11 = r9.h;	 Catch:{ all -> 0x01dd }
        if (r11 == 0) goto L_0x017c;
    L_0x0177:
        r11 = r9.f;	 Catch:{ all -> 0x01dd }
        r11.a(r2);	 Catch:{ all -> 0x01dd }
    L_0x017c:
        r11 = r9.f;	 Catch:{ all -> 0x01dd }
        r1 = r9.i;	 Catch:{ all -> 0x01dd }
        r11.a(r1);	 Catch:{ all -> 0x01dd }
        r11 = r9.d;	 Catch:{ all -> 0x01dd }
        r11.a();	 Catch:{ all -> 0x01dd }
        r11 = r9.f;	 Catch:{ all -> 0x01dd }
        r1 = new bazg;	 Catch:{ all -> 0x01dd }
        r1.<init>(r9, r10);	 Catch:{ all -> 0x01dd }
        r11.a(r1);	 Catch:{ all -> 0x01dd }
        r10 = r9.e;	 Catch:{ all -> 0x01dd }
        r11 = r9.t;	 Catch:{ all -> 0x01dd }
        r1 = defpackage.aniv.a;	 Catch:{ all -> 0x01dd }
        r2 = "cancellationListener";
        defpackage.basr.a(r11, r2);	 Catch:{ all -> 0x01dd }
        r11 = "executor";
        defpackage.basr.a(r1, r11);	 Catch:{ all -> 0x01dd }
        r10.b();	 Catch:{ all -> 0x01dd }
        if (r0 != 0) goto L_0x01a8;
    L_0x01a7:
        goto L_0x01cb;
    L_0x01a8:
        r10 = r9.e;	 Catch:{ all -> 0x01dd }
        r10.e();	 Catch:{ all -> 0x01dd }
        r10 = r9.u;	 Catch:{ all -> 0x01dd }
        if (r10 == 0) goto L_0x01cb;
    L_0x01b1:
        r10 = java.util.concurrent.TimeUnit.NANOSECONDS;	 Catch:{ all -> 0x01dd }
        r10 = r0.a(r10);	 Catch:{ all -> 0x01dd }
        r0 = r9.u;	 Catch:{ all -> 0x01dd }
        r1 = new bbcz;	 Catch:{ all -> 0x01dd }
        r2 = new bazl;	 Catch:{ all -> 0x01dd }
        r2.<init>(r9, r10);	 Catch:{ all -> 0x01dd }
        r1.<init>(r2);	 Catch:{ all -> 0x01dd }
        r2 = java.util.concurrent.TimeUnit.NANOSECONDS;	 Catch:{ all -> 0x01dd }
        r10 = r0.schedule(r1, r10, r2);	 Catch:{ all -> 0x01dd }
        r9.m = r10;	 Catch:{ all -> 0x01dd }
    L_0x01cb:
        r10 = r9.g;	 Catch:{ all -> 0x01dd }
        if (r10 == 0) goto L_0x01d2;
    L_0x01cf:
        r9.b();	 Catch:{ all -> 0x01dd }
    L_0x01d2:
        defpackage.bbhx.b();
        return;
    L_0x01d6:
        r10 = move-exception;
        r11 = r9.e;	 Catch:{ all -> 0x01dd }
        r11.a(r4);	 Catch:{ all -> 0x01dd }
        throw r10;	 Catch:{ all -> 0x01dd }
    L_0x01dd:
        r10 = move-exception;
        defpackage.bbhx.b();
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baze.a(basc, baum):void");
    }

    public final void b() {
        this.e.b();
        ScheduledFuture scheduledFuture = this.m;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final basy c() {
        basy basy = this.o.b;
        return basy != null ? basy : this.e.e();
    }

    public final void a(int i) {
        amqw.b(this.f != null, (Object) "Not started");
        amqw.a(true, (Object) "Number requested must be non-negative");
        this.f.c(i);
    }

    public final void a(String str, Throwable th) {
        bbhx.a();
        if (str == null && th == null) {
            try {
                th = new CancellationException("Cancelled without a message or cause");
                k.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", th);
            } catch (Throwable th2) {
                bbhx.b();
            }
        }
        if (!this.q) {
            this.q = true;
            if (this.f != null) {
                bavx a;
                bavx bavx = bavx.c;
                if (str != null) {
                    a = bavx.a(str);
                } else {
                    a = bavx.a("Call cancelled without message");
                }
                if (th != null) {
                    a = a.b(th);
                }
                this.f.b(a);
            }
            b();
        }
        bbhx.b();
    }

    public final void a() {
        bbhx.a();
        try {
            amqw.b(this.f != null, (Object) "Not started");
            amqw.b(this.q ^ 1, (Object) "call was cancelled");
            amqw.b(this.r ^ 1, (Object) "call already half-closed");
            this.r = true;
            this.f.e();
        } finally {
            bbhx.b();
        }
    }

    public final void a(Object obj) {
        bbhx.a();
        try {
            b(obj);
        } finally {
            bbhx.b();
        }
    }

    private final void b(Object obj) {
        amqw.b(this.f != null, (Object) "Not started");
        amqw.b(this.q ^ 1, (Object) "call was cancelled");
        amqw.b(this.r ^ 1, (Object) "call was half-closed");
        try {
            bazo bazo = this.f;
            if (bazo instanceof bbfq) {
                bbfq bbfq = (bbfq) bazo;
                bbgm bbgm = bbfq.o;
                if (bbgm.a) {
                    bbgm.f.a.a(bbfq.c.a(obj));
                } else {
                    bbfq.a(new bbgb(bbfq, obj));
                }
            } else {
                bazo.a(this.a.a(obj));
            }
            if (!this.n) {
                this.f.f();
            }
        } catch (RuntimeException e) {
            this.f.b(bavx.c.b(e).a("Failed to stream message"));
        } catch (Error e2) {
            this.f.b(bavx.c.a("Client sendMessage() failed with Error"));
            throw e2;
        }
    }

    public final String toString() {
        amqo a = amql.a(this);
        a.a("method", this.a);
        return a.toString();
    }
}
