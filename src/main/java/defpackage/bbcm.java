package defpackage;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Logger;

/* renamed from: bbcm */
final class bbcm implements batq {
    public static final Logger a = Logger.getLogger(bbcm.class.getName());
    public final batp b;
    public final baye c;
    public final bbct d;
    public final ScheduledExecutorService e;
    public final batm f;
    public final bayz g;
    public final Object h = new Object();
    public final bawg i;
    public final bbcw j;
    public bayb k;
    public final amrj l;
    public ScheduledFuture m;
    public boolean n;
    public final Collection o = new ArrayList();
    public final bbcj p = new bbcl(this);
    public bazv q;
    public volatile bbek r;
    public bass s = bass.a(basp.IDLE);
    public bavx t;
    private final String u;
    private final String v;
    private final bazp w;
    private final bayi x;

    bbcm(List list, String str, String str2, baye baye, bazp bazp, ScheduledExecutorService scheduledExecutorService, amro amro, bawg bawg, bbct bbct, batm batm, bayi bayi, bazc bazc, bbhs bbhs) {
        amqw.a((Object) list, (Object) "addressGroups");
        amqw.a(list.isEmpty() ^ 1, (Object) "addressGroups is empty");
        bbcm.a(list, "addressGroups contains null entry");
        this.j = new bbcw(Collections.unmodifiableList(new ArrayList(list)));
        this.u = str;
        this.v = str2;
        this.c = baye;
        this.w = bazp;
        this.e = scheduledExecutorService;
        this.l = (amrj) amro.get();
        this.i = bawg;
        this.d = bbct;
        this.f = batm;
        this.x = bayi;
        amqw.a((Object) bazc, (Object) "channelTracer");
        this.b = batp.a("Subchannel", str);
        this.g = new bayz(bazc, bbhs);
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:16:0x002b, code skipped:
            r4.i.a();
     */
    /* JADX WARNING: Missing block: B:17:0x0031, code skipped:
            return null;
     */
    public final defpackage.bazq a() {
        /*
        r4 = this;
        r0 = r4.r;
        if (r0 != 0) goto L_0x003c;
    L_0x0004:
        r0 = r4.h;	 Catch:{ all -> 0x0035 }
        monitor-enter(r0);	 Catch:{ all -> 0x0035 }
        r1 = r4.r;	 Catch:{ all -> 0x0032 }
        if (r1 == 0) goto L_0x0012;
    L_0x000b:
        monitor-exit(r0);	 Catch:{ all -> 0x0032 }
        r0 = r4.i;
        r0.a();
        return r1;
    L_0x0012:
        r1 = r4.s;	 Catch:{ all -> 0x0032 }
        r1 = r1.a;	 Catch:{ all -> 0x0032 }
        r2 = defpackage.basp.IDLE;	 Catch:{ all -> 0x0032 }
        if (r1 != r2) goto L_0x002a;
    L_0x001a:
        r1 = r4.g;	 Catch:{ all -> 0x0032 }
        r2 = "CONNECTING as requested";
        r3 = 2;
        r1.a(r3, r2);	 Catch:{ all -> 0x0032 }
        r1 = defpackage.basp.CONNECTING;	 Catch:{ all -> 0x0032 }
        r4.a(r1);	 Catch:{ all -> 0x0032 }
        r4.c();	 Catch:{ all -> 0x0032 }
    L_0x002a:
        monitor-exit(r0);	 Catch:{ all -> 0x0032 }
        r0 = r4.i;
        r0.a();
        r0 = 0;
        return r0;
    L_0x0032:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0032 }
        throw r1;	 Catch:{ all -> 0x0035 }
    L_0x0035:
        r0 = move-exception;
        r1 = r4.i;
        r1.a();
        throw r0;
    L_0x003c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbcm.a():bazq");
    }

    public final void c() {
        batk batk;
        SocketAddress socketAddress;
        amqw.b(this.m == null, (Object) "Should have no reconnectTask scheduled");
        bbcw bbcw = this.j;
        if (bbcw.b == 0 && bbcw.c == 0) {
            amrj amrj = this.l;
            amrj.c();
            amrj.b();
        }
        SocketAddress b = this.j.b();
        if (b instanceof batk) {
            batk = (batk) b;
            socketAddress = batk.a;
        } else {
            socketAddress = b;
            batk = null;
        }
        bazs bazs = new bazs();
        bazs.a = (String) amqw.a(this.u, (Object) "authority");
        bbcw bbcw2 = this.j;
        Object obj = ((batd) bbcw2.a.get(bbcw2.b)).b;
        amqw.a(obj, (Object) "eagAttributes");
        bazs.b = obj;
        bazs.c = this.v;
        bazs.d = batk;
        bbcy bbcy = new bbcy();
        bbcy.a = this.b;
        bbcs bbcs = new bbcs(this.w.a(socketAddress, bazs, bbcy), this.x);
        bbcy.a = bbcs.b();
        batm.a(this.f.d, bbcs);
        this.q = bbcs;
        this.o.add(bbcs);
        Runnable a = bbcs.a((bbej) new bbcv(this, bbcs));
        if (a != null) {
            this.i.a(a);
        }
        this.g.a(2, "Started transport {0}", bbcy.a);
    }

    public final void a(basp basp) {
        a(bass.a(basp));
    }

    public final void a(bass bass) {
        basp basp = this.s.a;
        if (basp != bass.a) {
            boolean z = basp != basp.SHUTDOWN;
            String valueOf = String.valueOf(bass);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 37);
            stringBuilder.append("Cannot transition out of SHUTDOWN to ");
            stringBuilder.append(valueOf);
            amqw.b(z, stringBuilder.toString());
            this.s = bass;
            this.i.a(new bbcn(this, bass));
        }
    }

    /* JADX WARNING: Missing block: B:17:0x0042, code skipped:
            r6.i.a();
     */
    /* JADX WARNING: Missing block: B:18:0x0047, code skipped:
            if (r1 == null) goto L_0x004c;
     */
    /* JADX WARNING: Missing block: B:19:0x0049, code skipped:
            r1.a(r7);
     */
    /* JADX WARNING: Missing block: B:20:0x004c, code skipped:
            if (r2 == null) goto L_0x0051;
     */
    /* JADX WARNING: Missing block: B:21:0x004e, code skipped:
            r2.a(r7);
     */
    /* JADX WARNING: Missing block: B:22:0x0051, code skipped:
            return;
     */
    public final void a(defpackage.bavx r7) {
        /*
        r6 = this;
        r0 = r6.h;	 Catch:{ all -> 0x0055 }
        monitor-enter(r0);	 Catch:{ all -> 0x0055 }
        r1 = r6.s;	 Catch:{ all -> 0x0052 }
        r1 = r1.a;	 Catch:{ all -> 0x0052 }
        r2 = defpackage.basp.SHUTDOWN;	 Catch:{ all -> 0x0052 }
        if (r1 != r2) goto L_0x0012;
    L_0x000b:
        monitor-exit(r0);	 Catch:{ all -> 0x0052 }
        r7 = r6.i;
        r7.a();
        return;
    L_0x0012:
        r6.t = r7;	 Catch:{ all -> 0x0052 }
        r1 = defpackage.basp.SHUTDOWN;	 Catch:{ all -> 0x0052 }
        r6.a(r1);	 Catch:{ all -> 0x0052 }
        r1 = r6.r;	 Catch:{ all -> 0x0052 }
        r2 = r6.q;	 Catch:{ all -> 0x0052 }
        r3 = 0;
        r6.r = r3;	 Catch:{ all -> 0x0052 }
        r6.q = r3;	 Catch:{ all -> 0x0052 }
        r4 = r6.j;	 Catch:{ all -> 0x0052 }
        r4.a();	 Catch:{ all -> 0x0052 }
        r4 = r6.o;	 Catch:{ all -> 0x0052 }
        r4 = r4.isEmpty();	 Catch:{ all -> 0x0052 }
        if (r4 == 0) goto L_0x0032;
    L_0x002f:
        r6.d();	 Catch:{ all -> 0x0052 }
    L_0x0032:
        r4 = r6.m;	 Catch:{ all -> 0x0052 }
        if (r4 == 0) goto L_0x0041;
    L_0x0036:
        r5 = 0;
        r4.cancel(r5);	 Catch:{ all -> 0x0052 }
        r4 = 1;
        r6.n = r4;	 Catch:{ all -> 0x0052 }
        r6.m = r3;	 Catch:{ all -> 0x0052 }
        r6.k = r3;	 Catch:{ all -> 0x0052 }
    L_0x0041:
        monitor-exit(r0);	 Catch:{ all -> 0x0052 }
        r0 = r6.i;
        r0.a();
        if (r1 == 0) goto L_0x004c;
    L_0x0049:
        r1.a(r7);
    L_0x004c:
        if (r2 == 0) goto L_0x0051;
    L_0x004e:
        r2.a(r7);
    L_0x0051:
        return;
    L_0x0052:
        r7 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0052 }
        throw r7;	 Catch:{ all -> 0x0055 }
    L_0x0055:
        r7 = move-exception;
        r0 = r6.i;
        r0.a();
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbcm.a(bavx):void");
    }

    public final String toString() {
        Object obj;
        synchronized (this.h) {
            obj = this.j.a;
        }
        amqo a = amql.a(this);
        a.a("logId", this.b.a);
        a.a("addressGroups", obj);
        return a.toString();
    }

    public final void d() {
        this.g.a(2, "Terminated");
        this.i.a(new bbcq(this));
    }

    public final void a(bazv bazv, boolean z) {
        this.i.execute(new bbcp(this, bazv, z));
    }

    /* Access modifiers changed, original: final */
    public final void b(bavx bavx) {
        a(bavx);
        try {
            synchronized (this.h) {
                ArrayList<bbek> arrayList = new ArrayList(this.o);
            }
            this.i.a();
            for (bbek b : arrayList) {
                b.b(bavx);
            }
        } catch (Throwable th) {
            this.i.a();
        }
    }

    public final batp b() {
        return this.b;
    }

    public static void a(List list, String str) {
        for (Object a : list) {
            amqw.a(a, (Object) str);
        }
    }

    public static String c(bavx bavx) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bavx.m);
        if (bavx.n != null) {
            stringBuilder.append("(");
            stringBuilder.append(bavx.n);
            stringBuilder.append(")");
        }
        return stringBuilder.toString();
    }
}
