package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: acuz */
public final class acuz implements Observer {
    public static final long a = TimeUnit.SECONDS.toMillis(30);
    public static final long b = TimeUnit.SECONDS.toMillis(90);
    private final xsc A;
    private final SharedPreferences B;
    private final Executor C;
    private final Runnable D = new acve(this);
    public boolean c = false;
    public boolean d = false;
    public long e = -1;
    public long f = -1;
    public tub g;
    public ttx h;
    public ttw i;
    public afpt j;
    public afot k;
    public xcq l;
    public xcq m;
    public final Object n = new Object();
    public final Application o;
    public final xpt p;
    public final zzl q;
    public final xci r;
    public final afpu s;
    public int t = 1;
    private boolean u = false;
    private long v = -1;
    private long w = -1;
    private ScheduledFuture x;
    private final ScheduledExecutorService y;
    private final acum z;

    public acuz(acum acum, Application application, ScheduledExecutorService scheduledExecutorService, xpt xpt, xsc xsc, zzl zzl, SharedPreferences sharedPreferences, xci xci, Executor executor, afpu afpu) {
        this.z = (acum) amqw.a((Object) acum);
        this.o = (Application) amqw.a((Object) application);
        this.y = (ScheduledExecutorService) amqw.a((Object) scheduledExecutorService);
        this.p = (xpt) amqw.a((Object) xpt);
        this.A = (xsc) amqw.a((Object) xsc);
        this.q = (zzl) amqw.a((Object) zzl);
        this.B = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.r = (xci) amqw.a((Object) xci);
        this.C = (Executor) amqw.a((Object) executor);
        this.s = (afpu) amqw.a((Object) afpu);
    }

    public final void update(Observable observable, Object obj) {
        synchronized (this.n) {
            if (observable == this.p && this.v == -1) {
                this.v = ((Long) obj).longValue();
            }
        }
        if (this.t == 2 && !this.u) {
            b();
        }
    }

    public final void a(boolean z) {
        synchronized (this.n) {
            afpt c = this.s.c();
            if (c.a().equals(this.j.a())) {
                return;
            }
            a(4, this.j, this.k);
            a();
            this.j = c;
            this.k = !z ? new afot(this.s.h(), this.s.g()) : null;
            a(3, this.j, this.k);
        }
    }

    public final void a() {
        synchronized (this.n) {
            this.B.edit().putLong("foreground_heartbeat_index", 0).apply();
        }
    }

    public final void b() {
        synchronized (this.n) {
            c();
            long j = this.e;
            if (j <= 0) {
                return;
            }
            this.x = this.y.scheduleAtFixedRate(this.D, j, j, TimeUnit.MILLISECONDS);
            this.u = true;
        }
    }

    public final void c() {
        synchronized (this.n) {
            ScheduledFuture scheduledFuture = this.x;
            if (!(scheduledFuture == null || scheduledFuture.isCancelled())) {
                this.x.cancel(true);
            }
            this.u = false;
        }
    }

    public final void d() {
        this.C.execute(new acvd(this));
    }

    public final void e() {
        this.C.execute(new acvg(this));
    }

    /* JADX WARNING: Missing block: B:10:0x001c, code skipped:
            if (r5 >= r7) goto L_0x001e;
     */
    private final void a(int r13, defpackage.afpt r14, defpackage.afot r15) {
        /*
        r12 = this;
        r0 = r12.n;
        monitor-enter(r0);
        r1 = 0;
        r3 = -1;
        r5 = 2;
        if (r13 != r5) goto L_0x0023;
    L_0x000a:
        r5 = r12.p;	 Catch:{ all -> 0x0129 }
        r5 = r5.b();	 Catch:{ all -> 0x0129 }
        r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r7 == 0) goto L_0x001e;
    L_0x0014:
        r7 = r12.f;	 Catch:{ all -> 0x0129 }
        r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1));
        if (r9 <= 0) goto L_0x0023;
    L_0x001a:
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 < 0) goto L_0x0023;
    L_0x001e:
        r12.c();	 Catch:{ all -> 0x0129 }
        monitor-exit(r0);	 Catch:{ all -> 0x0129 }
        return;
    L_0x0023:
        r5 = defpackage.arkz.f;	 Catch:{ all -> 0x0129 }
        r5 = r5.createBuilder();	 Catch:{ all -> 0x0129 }
        r5 = (defpackage.arky) r5;	 Catch:{ all -> 0x0129 }
        r6 = 3;
        if (r13 == r6) goto L_0x002f;
    L_0x002e:
        goto L_0x0033;
    L_0x002f:
        r12.v = r3;	 Catch:{ all -> 0x0129 }
        r12.w = r3;	 Catch:{ all -> 0x0129 }
    L_0x0033:
        r5.copyOnWrite();	 Catch:{ all -> 0x0129 }
        r7 = r5.instance;	 Catch:{ all -> 0x0129 }
        r7 = (defpackage.arkz) r7;	 Catch:{ all -> 0x0129 }
        r8 = r7.a;	 Catch:{ all -> 0x0129 }
        r8 = r8 | 8;
        r7.a = r8;	 Catch:{ all -> 0x0129 }
        r8 = r13 + -1;
        r7.e = r8;	 Catch:{ all -> 0x0129 }
        r7 = r12.B;	 Catch:{ all -> 0x0129 }
        r8 = "foreground_heartbeat_index";
        r7 = r7.getLong(r8, r3);	 Catch:{ all -> 0x0129 }
        r9 = 1;
        r11 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));
        if (r11 != 0) goto L_0x0065;
    L_0x0052:
        r5.a(r1);	 Catch:{ all -> 0x0129 }
        r1 = r12.B;	 Catch:{ all -> 0x0129 }
        r1 = r1.edit();	 Catch:{ all -> 0x0129 }
        r2 = "foreground_heartbeat_index";
        r1 = r1.putLong(r2, r9);	 Catch:{ all -> 0x0129 }
        r1.apply();	 Catch:{ all -> 0x0129 }
        goto L_0x0078;
    L_0x0065:
        r5.a(r7);	 Catch:{ all -> 0x0129 }
        r1 = r12.B;	 Catch:{ all -> 0x0129 }
        r1 = r1.edit();	 Catch:{ all -> 0x0129 }
        r2 = "foreground_heartbeat_index";
        r7 = r7 + r9;
        r1 = r1.putLong(r2, r7);	 Catch:{ all -> 0x0129 }
        r1.apply();	 Catch:{ all -> 0x0129 }
    L_0x0078:
        r1 = r12.A;	 Catch:{ all -> 0x0129 }
        r1 = r1.b();	 Catch:{ all -> 0x0129 }
        r7 = r12.w;	 Catch:{ all -> 0x0129 }
        r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));
        if (r9 == 0) goto L_0x0087;
    L_0x0084:
        r7 = r1 - r7;
        goto L_0x0088;
    L_0x0087:
        r7 = r3;
    L_0x0088:
        r5.copyOnWrite();	 Catch:{ all -> 0x0129 }
        r9 = r5.instance;	 Catch:{ all -> 0x0129 }
        r9 = (defpackage.arkz) r9;	 Catch:{ all -> 0x0129 }
        r10 = r9.a;	 Catch:{ all -> 0x0129 }
        r11 = 4;
        r10 = r10 | r11;
        r9.a = r10;	 Catch:{ all -> 0x0129 }
        r9.d = r7;	 Catch:{ all -> 0x0129 }
        r7 = r12.v;	 Catch:{ all -> 0x0129 }
        r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));
        if (r9 == 0) goto L_0x00a0;
    L_0x009d:
        r7 = r1 - r7;
        goto L_0x00a1;
    L_0x00a0:
        r7 = r3;
    L_0x00a1:
        r5.copyOnWrite();	 Catch:{ all -> 0x0129 }
        r9 = r5.instance;	 Catch:{ all -> 0x0129 }
        r9 = (defpackage.arkz) r9;	 Catch:{ all -> 0x0129 }
        r10 = r9.a;	 Catch:{ all -> 0x0129 }
        r10 = r10 | 1;
        r9.a = r10;	 Catch:{ all -> 0x0129 }
        r9.b = r7;	 Catch:{ all -> 0x0129 }
        r7 = r12.d;	 Catch:{ all -> 0x0129 }
        if (r7 == 0) goto L_0x00ce;
    L_0x00b4:
        r7 = r12.A;	 Catch:{ all -> 0x0129 }
        r7 = r7.a();	 Catch:{ all -> 0x0129 }
        r7 = (double) r7;
        r9 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        java.lang.Double.isNaN(r7);
        r7 = r7 / r9;
        r7 = java.lang.Math.round(r7);	 Catch:{ all -> 0x0129 }
        r9 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r7 = r7 * r9;
        r8 = r7;
        goto L_0x00cf;
    L_0x00ce:
        r8 = r3;
    L_0x00cf:
        if (r13 == r11) goto L_0x0108;
    L_0x00d1:
        if (r13 == r6) goto L_0x00ec;
    L_0x00d3:
        r13 = defpackage.asmw.f;	 Catch:{ all -> 0x0129 }
        r13 = r13.createBuilder();	 Catch:{ all -> 0x0129 }
        r13 = (defpackage.asmz) r13;	 Catch:{ all -> 0x0129 }
        r13.a(r5);	 Catch:{ all -> 0x0129 }
        r13 = r13.build();	 Catch:{ all -> 0x0129 }
        r13 = (defpackage.anxl) r13;	 Catch:{ all -> 0x0129 }
        r13 = (defpackage.asmw) r13;	 Catch:{ all -> 0x0129 }
        r14 = r12.z;	 Catch:{ all -> 0x0129 }
        r14.a(r13);	 Catch:{ all -> 0x0129 }
        goto L_0x0123;
    L_0x00ec:
        r13 = defpackage.asmw.f;	 Catch:{ all -> 0x0129 }
        r13 = r13.createBuilder();	 Catch:{ all -> 0x0129 }
        r13 = (defpackage.asmz) r13;	 Catch:{ all -> 0x0129 }
        r13.a(r5);	 Catch:{ all -> 0x0129 }
        r13 = r13.build();	 Catch:{ all -> 0x0129 }
        r13 = (defpackage.anxl) r13;	 Catch:{ all -> 0x0129 }
        r6 = r13;
        r6 = (defpackage.asmw) r6;	 Catch:{ all -> 0x0129 }
        r5 = r12.z;	 Catch:{ all -> 0x0129 }
        r7 = r14;
        r10 = r15;
        r5.a(r6, r7, r8, r10);	 Catch:{ all -> 0x0129 }
        goto L_0x0123;
    L_0x0108:
        r13 = defpackage.asmw.f;	 Catch:{ all -> 0x0129 }
        r13 = r13.createBuilder();	 Catch:{ all -> 0x0129 }
        r13 = (defpackage.asmz) r13;	 Catch:{ all -> 0x0129 }
        r13.a(r5);	 Catch:{ all -> 0x0129 }
        r13 = r13.build();	 Catch:{ all -> 0x0129 }
        r13 = (defpackage.anxl) r13;	 Catch:{ all -> 0x0129 }
        r6 = r13;
        r6 = (defpackage.asmw) r6;	 Catch:{ all -> 0x0129 }
        r5 = r12.z;	 Catch:{ all -> 0x0129 }
        r7 = r14;
        r10 = r15;
        r5.b(r6, r7, r8, r10);	 Catch:{ all -> 0x0129 }
    L_0x0123:
        r12.v = r3;	 Catch:{ all -> 0x0129 }
        r12.w = r1;	 Catch:{ all -> 0x0129 }
        monitor-exit(r0);	 Catch:{ all -> 0x0129 }
        return;
    L_0x0129:
        r13 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0129 }
        throw r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acuz.a(int, afpt, afot):void");
    }
}
