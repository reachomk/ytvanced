package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import defpackage.ptd;
import defpackage.ptg;
import defpackage.ptj;
import defpackage.ptl;
import defpackage.ptm;
import defpackage.ptn;
import defpackage.ptv;
import defpackage.ptw;
import defpackage.pws;
import defpackage.pww;
import defpackage.pxl;
import defpackage.pzr;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public abstract class BasePendingResult extends ptg {
    private static final ThreadLocal a = new pxl();
    private final ptw b;
    private final CountDownLatch c;
    public final Object d;
    public final WeakReference e;
    public ptn f;
    public boolean g;
    private final ArrayList h;
    private ptm i;
    private final AtomicReference j;
    private Status k;
    private volatile boolean l;
    private boolean m;
    public ptv mResultGuardian;
    private boolean n;
    private volatile pws o;

    @Deprecated
    BasePendingResult() {
        this.d = new Object();
        this.c = new CountDownLatch(1);
        this.h = new ArrayList();
        this.j = new AtomicReference();
        this.g = false;
        this.b = new ptw(Looper.getMainLooper());
        this.e = new WeakReference(null);
    }

    public abstract ptn a(Status status);

    public BasePendingResult(ptd ptd) {
        Looper mainLooper;
        this.d = new Object();
        this.c = new CountDownLatch(1);
        this.h = new ArrayList();
        this.j = new AtomicReference();
        this.g = false;
        if (ptd == null) {
            mainLooper = Looper.getMainLooper();
        } else {
            mainLooper = ptd.b();
        }
        this.b = new ptw(mainLooper);
        this.e = new WeakReference(ptd);
    }

    @Deprecated
    public BasePendingResult(Looper looper) {
        this.d = new Object();
        this.c = new CountDownLatch(1);
        this.h = new ArrayList();
        this.j = new AtomicReference();
        this.g = false;
        this.b = new ptw(looper);
        this.e = new WeakReference(null);
    }

    public final boolean e() {
        return this.c.getCount() == 0;
    }

    public final ptn a(TimeUnit timeUnit) {
        pzr.a(this.l ^ 1, (Object) "Result has already been consumed.");
        pws pws = this.o;
        pzr.a(true, (Object) "Cannot await if then() has been called.");
        try {
            if (!this.c.await(0, timeUnit)) {
                c(Status.d);
            }
        } catch (InterruptedException unused) {
            c(Status.b);
        }
        pzr.a(e(), (Object) "Result is not ready.");
        return a();
    }

    /* JADX WARNING: Missing block: B:17:0x0035, code skipped:
            return;
     */
    public final void a(defpackage.ptm r5) {
        /*
        r4 = this;
        r0 = r4.d;
        monitor-enter(r0);
        if (r5 != 0) goto L_0x000a;
    L_0x0005:
        r5 = 0;
        r4.i = r5;	 Catch:{ all -> 0x0036 }
        monitor-exit(r0);	 Catch:{ all -> 0x0036 }
        return;
    L_0x000a:
        r1 = r4.l;	 Catch:{ all -> 0x0036 }
        r2 = 1;
        r1 = r1 ^ r2;
        r3 = "Result has already been consumed.";
        defpackage.pzr.a(r1, r3);	 Catch:{ all -> 0x0036 }
        r1 = r4.o;	 Catch:{ all -> 0x0036 }
        r1 = "Cannot set callbacks if then() has been called.";
        defpackage.pzr.a(r2, r1);	 Catch:{ all -> 0x0036 }
        r1 = r4.d();	 Catch:{ all -> 0x0036 }
        if (r1 == 0) goto L_0x0022;
    L_0x0020:
        monitor-exit(r0);	 Catch:{ all -> 0x0036 }
        return;
    L_0x0022:
        r1 = r4.e();	 Catch:{ all -> 0x0036 }
        if (r1 == 0) goto L_0x0032;
    L_0x0028:
        r1 = r4.b;	 Catch:{ all -> 0x0036 }
        r2 = r4.a();	 Catch:{ all -> 0x0036 }
        r1.a(r5, r2);	 Catch:{ all -> 0x0036 }
        goto L_0x0034;
    L_0x0032:
        r4.i = r5;	 Catch:{ all -> 0x0036 }
    L_0x0034:
        monitor-exit(r0);	 Catch:{ all -> 0x0036 }
        return;
    L_0x0036:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0036 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.a(ptm):void");
    }

    public final void a(ptj ptj) {
        pzr.b(true, "Callback cannot be null.");
        synchronized (this.d) {
            if (e()) {
                ptj.a(this.k);
            } else {
                this.h.add(ptj);
            }
        }
    }

    /* JADX WARNING: Missing block: B:12:0x0020, code skipped:
            return;
     */
    public final void c() {
        /*
        r2 = this;
        r0 = r2.d;
        monitor-enter(r0);
        r1 = r2.m;	 Catch:{ all -> 0x0021 }
        if (r1 != 0) goto L_0x001f;
    L_0x0007:
        r1 = r2.l;	 Catch:{ all -> 0x0021 }
        if (r1 == 0) goto L_0x000c;
    L_0x000b:
        goto L_0x001f;
    L_0x000c:
        r1 = r2.f;	 Catch:{ all -> 0x0021 }
        b(r1);	 Catch:{ all -> 0x0021 }
        r1 = 1;
        r2.m = r1;	 Catch:{ all -> 0x0021 }
        r1 = com.google.android.gms.common.api.Status.e;	 Catch:{ all -> 0x0021 }
        r1 = r2.a(r1);	 Catch:{ all -> 0x0021 }
        r2.c(r1);	 Catch:{ all -> 0x0021 }
        monitor-exit(r0);	 Catch:{ all -> 0x0021 }
        return;
    L_0x001f:
        monitor-exit(r0);	 Catch:{ all -> 0x0021 }
        return;
    L_0x0021:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0021 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.c():void");
    }

    public final boolean d() {
        boolean z;
        synchronized (this.d) {
            z = this.m;
        }
        return z;
    }

    public final void a(ptn ptn) {
        synchronized (this.d) {
            if (this.n || this.m) {
                b(ptn);
                return;
            }
            e();
            pzr.a(e() ^ 1, (Object) "Results have already been set");
            pzr.a(this.l ^ 1, (Object) "Result has already been consumed");
            c(ptn);
        }
    }

    public final void c(Status status) {
        synchronized (this.d) {
            if (!e()) {
                a(a(status));
                this.n = true;
            }
        }
    }

    public final void a(pww pww) {
        this.j.set(pww);
    }

    public final void f() {
        boolean z = true;
        if (!(this.g || ((Boolean) a.get()).booleanValue())) {
            z = false;
        }
        this.g = z;
    }

    private final ptn a() {
        ptn ptn;
        synchronized (this.d) {
            pzr.a(this.l ^ 1, (Object) "Result has already been consumed.");
            pzr.a(e(), (Object) "Result is not ready.");
            ptn = this.f;
            this.f = null;
            this.i = null;
            this.l = true;
        }
        pww pww = (pww) this.j.getAndSet(null);
        if (pww != null) {
            pww.a(this);
        }
        return ptn;
    }

    private final void c(ptn ptn) {
        this.f = ptn;
        this.c.countDown();
        this.k = this.f.a();
        if (this.m) {
            this.i = null;
        } else if (this.i != null) {
            this.b.removeMessages(2);
            this.b.a(this.i, a());
        } else if (this.f instanceof ptl) {
            this.mResultGuardian = new ptv(this);
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ((ptj) arrayList.get(i)).a(this.k);
            i = i2;
        }
        this.h.clear();
    }

    public static void b(ptn ptn) {
        if (ptn instanceof ptl) {
            try {
                ((ptl) ptn).b();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(ptn);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 18);
                stringBuilder.append("Unable to release ");
                stringBuilder.append(valueOf);
                Log.w("BasePendingResult", stringBuilder.toString(), e);
            }
        }
    }
}
