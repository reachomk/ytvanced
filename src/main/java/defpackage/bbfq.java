package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bbfq */
abstract class bbfq implements bazo {
    public static final baur a = baur.a("grpc-retry-pushback-ms", baum.a);
    public static final bavx b = bavx.c.a("Stream thrown away because RetriableStream committed");
    public static Random v = new Random();
    private static final baur w = baur.a("grpc-previous-rpc-attempts", baum.a);
    public final bauw c;
    public final Executor d;
    public final ScheduledExecutorService e;
    public final bbgu f;
    public bbgr g;
    public bbcf h;
    public boolean i;
    public final Object j = new Object();
    public final bbgf k;
    public final long l;
    public final long m;
    public final bbgs n;
    public volatile bbgm o = new bbgm(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);
    public final AtomicBoolean p = new AtomicBoolean();
    public long q;
    public bazn r;
    public bbgi s;
    public bbgi t;
    public long u;
    private final baum x;
    private final bbci y;

    bbfq(bauw bauw, baum baum, bbgf bbgf, long j, long j2, Executor executor, ScheduledExecutorService scheduledExecutorService, bbgu bbgu, bbci bbci, bbgs bbgs) {
        this.c = bauw;
        this.k = bbgf;
        this.l = j;
        this.m = j2;
        this.d = executor;
        this.e = scheduledExecutorService;
        this.x = baum;
        this.f = (bbgu) amqw.a((Object) bbgu, (Object) "retryPolicyProvider");
        this.y = (bbci) amqw.a((Object) bbci, (Object) "hedgingPolicyProvider");
        this.n = bbgs;
    }

    public abstract bavx a();

    public abstract bazo a(bash bash, baum baum);

    public abstract void b();

    public final Runnable a(bbgp bbgp) {
        synchronized (this.j) {
            if (this.o.f != null) {
                return null;
            }
            List list;
            Collection singleton;
            Future a;
            Future future;
            Future future2;
            Collection collection = this.o.c;
            bbgm bbgm = this.o;
            boolean z = true;
            amqw.b(bbgm.f == null, (Object) "Already committed");
            List list2 = bbgm.b;
            if (bbgm.c.contains(bbgp)) {
                list = null;
                singleton = Collections.singleton(bbgp);
            } else {
                list = list2;
                singleton = Collections.emptyList();
                z = false;
            }
            this.o = new bbgm(list, singleton, bbgm.d, bbgp, bbgm.g, z, bbgm.h, bbgm.e);
            this.k.a(-this.q);
            bbgi bbgi = this.s;
            if (bbgi != null) {
                a = bbgi.a();
                this.s = null;
                future = a;
            } else {
                future = null;
            }
            bbgi = this.t;
            if (bbgi != null) {
                a = bbgi.a();
                this.t = null;
                future2 = a;
            } else {
                future2 = null;
            }
            bbfr bbfr = new bbfr(this, collection, bbgp, future, future2);
            return bbfr;
        }
    }

    public final void b(bbgp bbgp) {
        Runnable a = a(bbgp);
        if (a != null) {
            a.run();
        }
    }

    public final bbgp d(int i) {
        bbgp bbgp = new bbgp(i);
        bbfp bbfp = new bbfp(new bbgg(this, bbgp));
        baum baum = this.x;
        baum baum2 = new baum();
        baum2.a(baum);
        if (i > 0) {
            baum2.a(w, String.valueOf(i));
        }
        bbgp.a = a(bbfp, baum2);
        return bbgp;
    }

    /* JADX WARNING: Missing block: B:21:0x0051, code skipped:
            r4 = r5.size();
            r6 = 0;
     */
    /* JADX WARNING: Missing block: B:22:0x0056, code skipped:
            if (r6 >= r4) goto L_0x007b;
     */
    /* JADX WARNING: Missing block: B:23:0x0058, code skipped:
            r7 = (defpackage.bbgd) r5.get(r6);
            r10 = r1.o;
            r11 = r10.f;
     */
    /* JADX WARNING: Missing block: B:24:0x0062, code skipped:
            if (r11 != null) goto L_0x0065;
     */
    /* JADX WARNING: Missing block: B:25:0x0065, code skipped:
            if (r11 == r0) goto L_0x0068;
     */
    /* JADX WARNING: Missing block: B:27:0x006a, code skipped:
            if (r10.g != false) goto L_0x0072;
     */
    /* JADX WARNING: Missing block: B:28:0x006c, code skipped:
            r7.a(r0);
            r6 = r6 + 1;
     */
    /* JADX WARNING: Missing block: B:29:0x0072, code skipped:
            if (r11 != r0) goto L_0x0075;
     */
    /* JADX WARNING: Missing block: B:30:0x0074, code skipped:
            r3 = true;
     */
    /* JADX WARNING: Missing block: B:31:0x0075, code skipped:
            defpackage.amqw.b(r3, (java.lang.Object) "substream should be CANCELLED_BECAUSE_COMMITTED already");
     */
    /* JADX WARNING: Missing block: B:32:0x007a, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:65:0x007b, code skipped:
            continue;
     */
    public final void c(defpackage.bbgp r20) {
        /*
        r19 = this;
        r1 = r19;
        r0 = r20;
        r2 = 0;
        r3 = 0;
        r5 = r2;
        r4 = 0;
    L_0x0008:
        r6 = r1.j;
        monitor-enter(r6);
        r7 = r1.o;	 Catch:{ all -> 0x00db }
        r8 = r7.f;	 Catch:{ all -> 0x00db }
        if (r8 != 0) goto L_0x0012;
    L_0x0011:
        goto L_0x001d;
    L_0x0012:
        if (r8 == r0) goto L_0x001d;
    L_0x0014:
        monitor-exit(r6);	 Catch:{ all -> 0x00db }
        r0 = r0.a;
        r2 = b;
        r0.b(r2);
        return;
    L_0x001d:
        r8 = r7.b;	 Catch:{ all -> 0x00db }
        r8 = r8.size();	 Catch:{ all -> 0x00db }
        r9 = 1;
        if (r4 == r8) goto L_0x007f;
    L_0x0026:
        r8 = r0.b;	 Catch:{ all -> 0x00db }
        if (r8 != 0) goto L_0x007d;
    L_0x002a:
        r8 = r4 + 128;
        r10 = r7.b;	 Catch:{ all -> 0x00db }
        r10 = r10.size();	 Catch:{ all -> 0x00db }
        r8 = java.lang.Math.min(r8, r10);	 Catch:{ all -> 0x00db }
        if (r5 != 0) goto L_0x0044;
    L_0x0038:
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x00db }
        r7 = r7.b;	 Catch:{ all -> 0x00db }
        r4 = r7.subList(r4, r8);	 Catch:{ all -> 0x00db }
        r5.<init>(r4);	 Catch:{ all -> 0x00db }
        goto L_0x0050;
    L_0x0044:
        r5.clear();	 Catch:{ all -> 0x00db }
        r7 = r7.b;	 Catch:{ all -> 0x00db }
        r4 = r7.subList(r4, r8);	 Catch:{ all -> 0x00db }
        r5.addAll(r4);	 Catch:{ all -> 0x00db }
    L_0x0050:
        monitor-exit(r6);	 Catch:{ all -> 0x00db }
        r4 = r5.size();
        r6 = 0;
    L_0x0056:
        if (r6 >= r4) goto L_0x007b;
    L_0x0058:
        r7 = r5.get(r6);
        r7 = (defpackage.bbgd) r7;
        r10 = r1.o;
        r11 = r10.f;
        if (r11 != 0) goto L_0x0065;
    L_0x0064:
        goto L_0x0068;
    L_0x0065:
        if (r11 == r0) goto L_0x0068;
    L_0x0067:
        goto L_0x007b;
    L_0x0068:
        r10 = r10.g;
        if (r10 != 0) goto L_0x0072;
    L_0x006c:
        r7.a(r0);
        r6 = r6 + 1;
        goto L_0x0056;
    L_0x0072:
        if (r11 != r0) goto L_0x0075;
    L_0x0074:
        r3 = 1;
    L_0x0075:
        r0 = "substream should be CANCELLED_BECAUSE_COMMITTED already";
        defpackage.amqw.b(r3, r0);
        return;
    L_0x007b:
        r4 = r8;
        goto L_0x0008;
    L_0x007d:
        monitor-exit(r6);	 Catch:{ all -> 0x00db }
        return;
    L_0x007f:
        r4 = r7.a;	 Catch:{ all -> 0x00db }
        r4 = r4 ^ r9;
        r5 = "Already passThrough";
        defpackage.amqw.b(r4, r5);	 Catch:{ all -> 0x00db }
        r4 = r0.b;	 Catch:{ all -> 0x00db }
        if (r4 == 0) goto L_0x008f;
    L_0x008b:
        r4 = r7.c;	 Catch:{ all -> 0x00db }
    L_0x008d:
        r12 = r4;
        goto L_0x00ab;
    L_0x008f:
        r4 = r7.c;	 Catch:{ all -> 0x00db }
        r4 = r4.isEmpty();	 Catch:{ all -> 0x00db }
        if (r4 == 0) goto L_0x009c;
    L_0x0097:
        r4 = java.util.Collections.singletonList(r20);	 Catch:{ all -> 0x00db }
        goto L_0x008d;
    L_0x009c:
        r4 = new java.util.ArrayList;	 Catch:{ all -> 0x00db }
        r5 = r7.c;	 Catch:{ all -> 0x00db }
        r4.<init>(r5);	 Catch:{ all -> 0x00db }
        r4.add(r0);	 Catch:{ all -> 0x00db }
        r4 = java.util.Collections.unmodifiableCollection(r4);	 Catch:{ all -> 0x00db }
        goto L_0x008d;
    L_0x00ab:
        r4 = r7.f;	 Catch:{ all -> 0x00db }
        if (r4 == 0) goto L_0x00b2;
    L_0x00af:
        r16 = 1;
        goto L_0x00b4;
    L_0x00b2:
        r16 = 0;
    L_0x00b4:
        r5 = r7.b;	 Catch:{ all -> 0x00db }
        if (r16 != 0) goto L_0x00ba;
    L_0x00b8:
        r11 = r5;
        goto L_0x00c3;
    L_0x00ba:
        if (r4 != r0) goto L_0x00bd;
    L_0x00bc:
        r3 = 1;
    L_0x00bd:
        r0 = "Another RPC attempt has already committed";
        defpackage.amqw.b(r3, r0);	 Catch:{ all -> 0x00db }
        r11 = r2;
    L_0x00c3:
        r0 = new bbgm;	 Catch:{ all -> 0x00db }
        r13 = r7.d;	 Catch:{ all -> 0x00db }
        r14 = r7.f;	 Catch:{ all -> 0x00db }
        r15 = r7.g;	 Catch:{ all -> 0x00db }
        r2 = r7.h;	 Catch:{ all -> 0x00db }
        r3 = r7.e;	 Catch:{ all -> 0x00db }
        r10 = r0;
        r17 = r2;
        r18 = r3;
        r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18);	 Catch:{ all -> 0x00db }
        r1.o = r0;	 Catch:{ all -> 0x00db }
        monitor-exit(r6);	 Catch:{ all -> 0x00db }
        return;
    L_0x00db:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x00db }
        goto L_0x00df;
    L_0x00de:
        throw r0;
    L_0x00df:
        goto L_0x00de;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbfq.c(bbgp):void");
    }

    public final void a(bazn bazn) {
        this.r = bazn;
        bavx a = a();
        if (a != null) {
            b(a);
            return;
        }
        synchronized (this.j) {
            this.o.b.add(new bbge(this));
        }
        boolean z = false;
        bbgp d = d(0);
        if (this.h == null) {
            z = true;
        }
        amqw.b(z, (Object) "hedgingPolicy has been initialized unexpectedly");
        this.h = this.y.a();
        if (!bbcf.d.equals(this.h)) {
            bbgi bbgi;
            this.i = true;
            this.g = bbgr.f;
            synchronized (this.j) {
                this.o = this.o.a(d);
                bbgi = null;
                if (a(this.o)) {
                    bbgs bbgs = this.n;
                    if (bbgs == null || bbgs.a()) {
                        bbgi = new bbgi(this.j);
                        this.t = bbgi;
                    }
                }
            }
            if (bbgi != null) {
                bbgi.a(this.e.schedule(new bbgh(this, bbgi), this.h.b, TimeUnit.NANOSECONDS));
            }
        }
        c(d);
    }

    public final void b(bavx bavx) {
        bbgp bbgp = new bbgp(0);
        bbgp.a = new bbet();
        Runnable a = a(bbgp);
        if (a != null) {
            this.r.b(bavx, new baum());
            a.run();
            return;
        }
        this.o.f.a.b(bavx);
        synchronized (this.j) {
            bbgm bbgm = this.o;
            this.o = new bbgm(bbgm.b, bbgm.c, bbgm.d, bbgm.f, true, bbgm.a, bbgm.h, bbgm.e);
        }
    }

    public final void a(bbgd bbgd) {
        synchronized (this.j) {
            if (!this.o.a) {
                this.o.b.add(bbgd);
            }
            Collection<bbgp> collection = this.o.c;
        }
        for (bbgp a : collection) {
            bbgd.a(a);
        }
    }

    public final void a(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    public final void c(int i) {
        bbgm bbgm = this.o;
        if (bbgm.a) {
            bbgm.f.a.c(i);
        } else {
            a(new bbgc(i));
        }
    }

    public final void f() {
        bbgm bbgm = this.o;
        if (bbgm.a) {
            bbgm.f.a.f();
        } else {
            a(new bbfv());
        }
    }

    public final void a(basn basn) {
        a(new bbfu(basn));
    }

    public final void a(boolean z) {
        a(new bbfy(z));
    }

    public final void e() {
        a(new bbfx());
    }

    public final void a(String str) {
        a(new bbfs(str));
    }

    public final void a(batc batc) {
        a(new bbfw(batc));
    }

    public final void b(int i) {
        a(new bbga(i));
    }

    public final void a(int i) {
        a(new bbfz(i));
    }

    public final void a(basy basy) {
        a(new bbft(basy));
    }

    public final boolean a(bbgm bbgm) {
        return bbgm.f == null && bbgm.e < this.h.a && !bbgm.h;
    }

    public final void c() {
        Future a;
        synchronized (this.j) {
            bbgi bbgi = this.t;
            if (bbgi != null) {
                a = bbgi.a();
                this.t = null;
            } else {
                a = null;
            }
            this.o = this.o.a();
        }
        if (a != null) {
            a.cancel(false);
        }
    }
}
