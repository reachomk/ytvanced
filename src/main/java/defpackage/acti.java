package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: acti */
public final class acti extends rqo implements actf {
    public final Runnable a = new actk(this);
    public final AtomicInteger b = new AtomicInteger(1);
    private final Context c;
    private final zyw d;
    private final actq e;
    private final xlv f;
    private final ScheduledExecutorService g;
    private final xsc h;
    private rql i;
    private anjv j;
    private HandlerThread k = null;
    private Handler l;
    private aukc m;
    private aorp n;
    private Location o;
    private LocationAvailability p;
    private boolean q;

    public acti(Context context, zyw zyw, xlv xlv, xsc xsc, ScheduledExecutorService scheduledExecutorService) {
        Object obj = acth.a;
        this.c = (Context) amqw.a((Object) context);
        this.d = (zyw) amqw.a((Object) zyw);
        this.f = (xlv) amqw.a((Object) xlv);
        this.h = (xsc) amqw.a((Object) xsc);
        this.g = (ScheduledExecutorService) amqw.a((Object) scheduledExecutorService);
        this.e = (actq) amqw.a(obj);
    }

    /* JADX WARNING: Missing block: B:19:0x0048, code skipped:
            return;
     */
    public final synchronized void a() {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.b;	 Catch:{ Exception -> 0x004b }
        r0 = r0.get();	 Catch:{ Exception -> 0x004b }
        r1 = 2;
        r2 = 1;
        if (r0 != r1) goto L_0x001e;
    L_0x000b:
        r0 = r3.b;	 Catch:{ Exception -> 0x004b }
        r0.set(r2);	 Catch:{ Exception -> 0x004b }
        r0 = r3.j;	 Catch:{ Exception -> 0x004b }
        r1 = new actj;	 Catch:{ Exception -> 0x004b }
        r1.<init>(r3);	 Catch:{ Exception -> 0x004b }
        r2 = r3.g;	 Catch:{ Exception -> 0x004b }
        r0.a(r1, r2);	 Catch:{ Exception -> 0x004b }
        monitor-exit(r3);
        return;
    L_0x001e:
        r0 = r3.j;	 Catch:{ Exception -> 0x004b }
        if (r0 == 0) goto L_0x002d;
    L_0x0022:
        r0 = r0.isCancelled();	 Catch:{ Exception -> 0x004b }
        if (r0 != 0) goto L_0x002d;
    L_0x0028:
        r0 = r3.j;	 Catch:{ Exception -> 0x004b }
        r0.cancel(r2);	 Catch:{ Exception -> 0x004b }
    L_0x002d:
        r0 = r3.i;	 Catch:{ Exception -> 0x004b }
        if (r0 == 0) goto L_0x0047;
    L_0x0031:
        r0 = r3.b;	 Catch:{ Exception -> 0x004b }
        r0 = r0.get();	 Catch:{ Exception -> 0x004b }
        r1 = 3;
        if (r0 == r1) goto L_0x0047;
    L_0x003a:
        r0 = r3.i;	 Catch:{ Exception -> 0x004b }
        r0.a(r3);	 Catch:{ Exception -> 0x004b }
        r0 = r3.b;	 Catch:{ Exception -> 0x004b }
        r0.set(r2);	 Catch:{ Exception -> 0x004b }
        r0 = 0;
        r3.i = r0;	 Catch:{ Exception -> 0x004b }
    L_0x0047:
        monitor-exit(r3);
        return;
    L_0x0049:
        r0 = move-exception;
        goto L_0x0053;
    L_0x004b:
        r0 = move-exception;
        r1 = "Failure stopLocationListening.";
        r3.a(r0, r1);	 Catch:{ all -> 0x0049 }
        monitor-exit(r3);
        return;
    L_0x0053:
        monitor-exit(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acti.a():void");
    }

    public final synchronized anjv b() {
        try {
            if (this.b.compareAndSet(1, 2)) {
                if (this.k == null) {
                    this.k = new HandlerThread(getClass().getName().concat("_POLLING"), 10);
                    this.k.start();
                }
                if (this.l == null) {
                    this.l = new Handler(this.k.getLooper());
                }
                anjv anjv = this.j;
                if (!(anjv == null || anjv.isCancelled())) {
                    this.j.cancel(true);
                }
                this.j = anjf.a(new actm(this), this.g);
            }
        } catch (Exception e) {
            a(e, "Failure startLocationListening.");
            return anjf.a();
        }
        return this.j;
    }

    /* JADX WARNING: Missing block: B:64:0x018c, code skipped:
            return;
     */
    public final synchronized void d() {
        /*
        r12 = this;
        monitor-enter(r12);
        r0 = r12.m;	 Catch:{ Exception -> 0x018f }
        if (r0 != 0) goto L_0x001f;
    L_0x0005:
        r0 = r12.d;	 Catch:{ Exception -> 0x018f }
        r0 = r0.a();	 Catch:{ Exception -> 0x018f }
        r0 = r0.q;	 Catch:{ Exception -> 0x018f }
        if (r0 != 0) goto L_0x0011;
    L_0x000f:
        r0 = defpackage.aukc.d;	 Catch:{ Exception -> 0x018f }
    L_0x0011:
        r12.m = r0;	 Catch:{ Exception -> 0x018f }
        r0 = r12.m;	 Catch:{ Exception -> 0x018f }
        if (r0 == 0) goto L_0x001f;
    L_0x0017:
        r0 = r0.c;	 Catch:{ Exception -> 0x018f }
        if (r0 != 0) goto L_0x001d;
    L_0x001b:
        r0 = defpackage.aorp.f;	 Catch:{ Exception -> 0x018f }
    L_0x001d:
        r12.n = r0;	 Catch:{ Exception -> 0x018f }
    L_0x001f:
        r0 = r12.e();	 Catch:{ Exception -> 0x018f }
        if (r0 == 0) goto L_0x0039;
    L_0x0025:
        r0 = r12.f();	 Catch:{ Exception -> 0x018f }
        if (r0 == 0) goto L_0x0039;
    L_0x002b:
        r0 = r12.i;	 Catch:{ Exception -> 0x018f }
        if (r0 != 0) goto L_0x0039;
    L_0x002f:
        r0 = r12.e;	 Catch:{ Exception -> 0x018f }
        r1 = r12.c;	 Catch:{ Exception -> 0x018f }
        r0 = r0.a(r1);	 Catch:{ Exception -> 0x018f }
        r12.i = r0;	 Catch:{ Exception -> 0x018f }
    L_0x0039:
        r0 = r12.b;	 Catch:{ Exception -> 0x018f }
        r0 = r0.get();	 Catch:{ Exception -> 0x018f }
        r1 = 2;
        if (r0 != r1) goto L_0x018b;
    L_0x0042:
        r0 = r12.i;	 Catch:{ Exception -> 0x018f }
        r1 = 1;
        if (r0 != 0) goto L_0x004e;
    L_0x0047:
        r0 = r12.b;	 Catch:{ Exception -> 0x018f }
        r0.set(r1);	 Catch:{ Exception -> 0x018f }
        goto L_0x018b;
    L_0x004e:
        r2 = r12.n;	 Catch:{ Exception -> 0x018f }
        r2 = r2.d;	 Catch:{ Exception -> 0x018f }
        if (r2 == 0) goto L_0x006e;
    L_0x0054:
        r2 = new rsj;	 Catch:{ Exception -> 0x018f }
        r2.<init>();	 Catch:{ Exception -> 0x018f }
        r0 = r0.a(r2);	 Catch:{ Exception -> 0x018f }
        r2 = new actl;	 Catch:{ Exception -> 0x018f }
        r2.<init>(r12);	 Catch:{ Exception -> 0x018f }
        r0 = r0.a(r2);	 Catch:{ Exception -> 0x018f }
        r2 = new acto;	 Catch:{ Exception -> 0x018f }
        r2.<init>(r12);	 Catch:{ Exception -> 0x018f }
        r0.a(r2);	 Catch:{ Exception -> 0x018f }
    L_0x006e:
        r3 = new com.google.android.gms.location.LocationRequest;	 Catch:{ Exception -> 0x018f }
        r3.<init>();	 Catch:{ Exception -> 0x018f }
        r0 = r12.n;	 Catch:{ Exception -> 0x018f }
        r2 = r0.b;	 Catch:{ Exception -> 0x018f }
        r4 = (long) r2;	 Catch:{ Exception -> 0x018f }
        r6 = 0;
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r2 < 0) goto L_0x0172;
    L_0x007e:
        r3.b = r4;	 Catch:{ Exception -> 0x018f }
        r2 = r3.d;	 Catch:{ Exception -> 0x018f }
        if (r2 != 0) goto L_0x008e;
    L_0x0084:
        r4 = (double) r4;
        r6 = 4618441417868443648; // 0x4018000000000000 float:0.0 double:6.0;
        java.lang.Double.isNaN(r4);
        r4 = r4 / r6;
        r4 = (long) r4;
        r3.c = r4;	 Catch:{ Exception -> 0x018f }
    L_0x008e:
        r0 = r0.c;	 Catch:{ Exception -> 0x018f }
        r0 = defpackage.aorr.a(r0);	 Catch:{ Exception -> 0x018f }
        if (r0 == 0) goto L_0x0097;
    L_0x0096:
        goto L_0x0098;
    L_0x0097:
        r0 = 1;
    L_0x0098:
        r0 = r0 + -1;
        r2 = 100;
        if (r0 == r2) goto L_0x00c4;
    L_0x009e:
        r2 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        if (r0 == r2) goto L_0x00c4;
    L_0x00a2:
        r2 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        if (r0 == r2) goto L_0x00c4;
    L_0x00a6:
        r2 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        if (r0 != r2) goto L_0x00ab;
    L_0x00aa:
        goto L_0x00c4;
    L_0x00ab:
        r1 = new java.lang.IllegalArgumentException;	 Catch:{ Exception -> 0x018f }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x018f }
        r3 = 28;
        r2.<init>(r3);	 Catch:{ Exception -> 0x018f }
        r3 = "invalid quality: ";
        r2.append(r3);	 Catch:{ Exception -> 0x018f }
        r2.append(r0);	 Catch:{ Exception -> 0x018f }
        r0 = r2.toString();	 Catch:{ Exception -> 0x018f }
        r1.<init>(r0);	 Catch:{ Exception -> 0x018f }
        throw r1;	 Catch:{ Exception -> 0x018f }
    L_0x00c4:
        r3.a = r0;	 Catch:{ Exception -> 0x018f }
        r0 = r12.i;	 Catch:{ Exception -> 0x018f }
        r2 = r12.k;	 Catch:{ Exception -> 0x018f }
        r10 = r2.getLooper();	 Catch:{ Exception -> 0x018f }
        r11 = new rrh;	 Catch:{ Exception -> 0x018f }
        r4 = defpackage.rrh.a;	 Catch:{ Exception -> 0x018f }
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r2 = r11;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9);	 Catch:{ Exception -> 0x018f }
        r2 = 0;
        if (r10 != 0) goto L_0x00ef;
    L_0x00de:
        r3 = android.os.Looper.myLooper();	 Catch:{ Exception -> 0x018f }
        if (r3 == 0) goto L_0x00e5;
    L_0x00e4:
        goto L_0x00e6;
    L_0x00e5:
        r1 = 0;
    L_0x00e6:
        r3 = "Can't create handler inside thread that has not called Looper.prepare()";
        defpackage.pzr.a(r1, r3);	 Catch:{ Exception -> 0x018f }
        r10 = android.os.Looper.myLooper();	 Catch:{ Exception -> 0x018f }
    L_0x00ef:
        r1 = defpackage.rqo.class;
        r1 = r1.getSimpleName();	 Catch:{ Exception -> 0x018f }
        r3 = "Listener must not be null";
        defpackage.pzr.a(r12, r3);	 Catch:{ Exception -> 0x018f }
        r3 = "Looper must not be null";
        defpackage.pzr.a(r10, r3);	 Catch:{ Exception -> 0x018f }
        r3 = "Listener type must not be null";
        defpackage.pzr.a(r1, r3);	 Catch:{ Exception -> 0x018f }
        r3 = new pue;	 Catch:{ Exception -> 0x018f }
        r3.<init>(r10, r12, r1);	 Catch:{ Exception -> 0x018f }
        r1 = new rsi;	 Catch:{ Exception -> 0x018f }
        r1.<init>(r3, r11, r3);	 Catch:{ Exception -> 0x018f }
        r4 = new rsl;	 Catch:{ Exception -> 0x018f }
        r3 = r3.b;	 Catch:{ Exception -> 0x018f }
        r4.<init>(r0, r3);	 Catch:{ Exception -> 0x018f }
        defpackage.pzr.a(r1);	 Catch:{ Exception -> 0x018f }
        defpackage.pzr.a(r4);	 Catch:{ Exception -> 0x018f }
        r3 = r1.a();	 Catch:{ Exception -> 0x018f }
        r5 = "Listener has already been released.";
        defpackage.pzr.a(r3, r5);	 Catch:{ Exception -> 0x018f }
        r3 = r4.a;	 Catch:{ Exception -> 0x018f }
        r5 = "Listener has already been released.";
        defpackage.pzr.a(r3, r5);	 Catch:{ Exception -> 0x018f }
        r3 = r1.a();	 Catch:{ Exception -> 0x018f }
        r5 = r4.a;	 Catch:{ Exception -> 0x018f }
        r3 = r3.equals(r5);	 Catch:{ Exception -> 0x018f }
        r5 = "Listener registration and unregistration methods must be constructed with the same ListenerHolder.";
        defpackage.pzr.b(r3, r5);	 Catch:{ Exception -> 0x018f }
        r3 = r0.g;	 Catch:{ Exception -> 0x018f }
        r5 = new ryl;	 Catch:{ Exception -> 0x018f }
        r5.<init>();	 Catch:{ Exception -> 0x018f }
        r6 = new pwy;	 Catch:{ Exception -> 0x018f }
        r7 = new pwk;	 Catch:{ Exception -> 0x018f }
        r7.<init>(r1, r4);	 Catch:{ Exception -> 0x018f }
        r6.<init>(r7, r5);	 Catch:{ Exception -> 0x018f }
        r1 = r3.m;	 Catch:{ Exception -> 0x018f }
        r4 = new pwl;	 Catch:{ Exception -> 0x018f }
        r3 = r3.i;	 Catch:{ Exception -> 0x018f }
        r3 = r3.get();	 Catch:{ Exception -> 0x018f }
        r4.<init>(r6, r3, r0);	 Catch:{ Exception -> 0x018f }
        r0 = 8;
        r0 = r1.obtainMessage(r0, r4);	 Catch:{ Exception -> 0x018f }
        r1.sendMessage(r0);	 Catch:{ Exception -> 0x018f }
        r0 = r5.a;	 Catch:{ Exception -> 0x018f }
        r1 = new actn;	 Catch:{ Exception -> 0x018f }
        r1.<init>(r12);	 Catch:{ Exception -> 0x018f }
        r0.a(r1);	 Catch:{ Exception -> 0x018f }
        r0 = r12.b;	 Catch:{ Exception -> 0x018f }
        r0.set(r2);	 Catch:{ Exception -> 0x018f }
        monitor-exit(r12);
        return;
    L_0x0172:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ Exception -> 0x018f }
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x018f }
        r2 = 38;
        r1.<init>(r2);	 Catch:{ Exception -> 0x018f }
        r2 = "invalid interval: ";
        r1.append(r2);	 Catch:{ Exception -> 0x018f }
        r1.append(r4);	 Catch:{ Exception -> 0x018f }
        r1 = r1.toString();	 Catch:{ Exception -> 0x018f }
        r0.<init>(r1);	 Catch:{ Exception -> 0x018f }
        throw r0;	 Catch:{ Exception -> 0x018f }
    L_0x018b:
        monitor-exit(r12);
        return;
    L_0x018d:
        r0 = move-exception;
        goto L_0x0197;
    L_0x018f:
        r0 = move-exception;
        r1 = "Failure doStartup.";
        r12.a(r0, r1);	 Catch:{ all -> 0x018d }
        monitor-exit(r12);
        return;
    L_0x0197:
        monitor-exit(r12);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acti.d():void");
    }

    public final void a(LocationAvailability locationAvailability) {
        this.p = locationAvailability;
    }

    public final void a(LocationResult locationResult) {
        if (locationResult != null) {
            int size = locationResult.b.size();
            a(size != 0 ? (Location) locationResult.b.get(size - 1) : null);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Location location) {
        if (location != null) {
            this.o = location;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Exception exception) {
        a(exception, "FusedLocationApi failure.");
    }

    private final void a(Exception exception, String str) {
        this.b.set(3);
        this.q = true;
        afpc.a(1, afpf.location, str, (Throwable) exception);
        try {
            synchronized (this) {
                rql rql = this.i;
                if (rql != null) {
                    rql.a(this);
                }
            }
        } catch (Exception unused) {
        }
    }

    public final auke c() {
        if (!e()) {
            return null;
        }
        aukd aukd = (aukd) auke.g.createBuilder();
        try {
            int i;
            if (this.q) {
                i = 9;
            } else {
                LocationAvailability locationAvailability;
                if (e()) {
                    if (!f()) {
                        i = 5;
                    }
                }
                if (e() && this.o == null) {
                    locationAvailability = this.p;
                    if (locationAvailability == null || locationAvailability.a()) {
                        i = 2;
                    }
                }
                if (e()) {
                    locationAvailability = this.p;
                    if (locationAvailability != null) {
                        if (!locationAvailability.a()) {
                            i = 8;
                        }
                    }
                }
                i = this.o == null ? 1 : 4;
            }
            aukd.copyOnWrite();
            auke auke = (auke) aukd.instance;
            auke.a = 1 | auke.a;
            auke.b = i - 1;
            Location location = this.o;
            if (location != null) {
                long convert;
                i = (int) (location.getLatitude() * 1.0E7d);
                aukd.copyOnWrite();
                auke auke2 = (auke) aukd.instance;
                auke2.a = 8 | auke2.a;
                auke2.c = i;
                i = (int) (this.o.getLongitude() * 1.0E7d);
                aukd.copyOnWrite();
                auke auke3 = (auke) aukd.instance;
                auke3.a |= 16;
                auke3.d = i;
                i = Math.round(this.o.getAccuracy());
                aukd.copyOnWrite();
                auke3 = (auke) aukd.instance;
                auke3.a |= 32;
                auke3.e = i;
                if (VERSION.SDK_INT >= 17) {
                    convert = TimeUnit.MILLISECONDS.convert(this.h.d() - this.o.getElapsedRealtimeNanos(), TimeUnit.NANOSECONDS);
                } else {
                    convert = this.h.a() - this.o.getTime();
                }
                aukd.copyOnWrite();
                auke2 = (auke) aukd.instance;
                auke2.a |= 64;
                auke2.f = convert;
            }
        } catch (Exception e) {
            afpc.a(2, afpf.location, "Failure createLocationInfo.", e);
        }
        return (auke) ((anxl) aukd.build());
    }

    private final boolean e() {
        aukc aukc = this.m;
        return (aukc == null || this.n == null || !aukc.b) ? false : true;
    }

    private final boolean f() {
        aorp aorp = this.n;
        if (aorp == null || !this.f.a((avwc[]) aorp.e.toArray(new avwc[0]))) {
            return false;
        }
        return true;
    }
}
