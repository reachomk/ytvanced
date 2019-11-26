package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

/* renamed from: adyc */
public final class adyc implements adxy, adyu {
    private static final String a = xtl.b("MDX.transport");
    private static final long b = TimeUnit.SECONDS.toMillis(2);
    private final Map c = new HashMap(100);
    private int d;
    private final adxy e;
    private HandlerThread f;
    private Handler g;
    private final acum h;
    private final AtomicInteger i = new AtomicInteger(0);
    private final AtomicInteger j = new AtomicInteger(0);
    private final AtomicInteger k = new AtomicInteger(0);
    private final AtomicInteger l = new AtomicInteger(0);

    public adyc(adxy adxy, acum acum) {
        this.e = adxy;
        this.h = acum;
    }

    private final synchronized boolean b() {
        return this.f != null;
    }

    private final synchronized void b(adym adym) {
        if (this.f == null) {
            this.d = adym.c();
            this.f = new HandlerThread(getClass().getName(), 10);
            this.f.start();
            this.g = new Handler(this.f.getLooper());
            String.format("Starting with MSN(%d): %s", new Object[]{Integer.valueOf(this.d), adym});
            a(adym);
        }
    }

    public final synchronized void a() {
        HandlerThread handlerThread = this.f;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f = null;
            this.g = null;
            this.c.clear();
            c();
        }
    }

    private final synchronized void c() {
        aupw aupw = (aupw) aupt.f.createBuilder();
        int andSet = this.j.getAndSet(0);
        aupw.copyOnWrite();
        aupt aupt = (aupt) aupw.instance;
        aupt.a |= 2;
        aupt.c = andSet;
        andSet = this.l.getAndSet(0);
        aupw.copyOnWrite();
        aupt = (aupt) aupw.instance;
        aupt.a |= 8;
        aupt.e = andSet;
        andSet = this.i.getAndSet(0);
        aupw.copyOnWrite();
        aupt = (aupt) aupw.instance;
        aupt.a |= 1;
        aupt.b = andSet;
        andSet = this.k.getAndSet(0);
        aupw.copyOnWrite();
        aupt aupt2 = (aupt) aupw.instance;
        aupt2.a |= 4;
        aupt2.d = andSet;
        aupt aupt3 = (aupt) ((anxl) aupw.build());
        asmz asmz = (asmz) asmw.f.createBuilder();
        asmz.copyOnWrite();
        asmw asmw = (asmw) asmz.instance;
        if (aupt3 != null) {
            asmw.c = aupt3;
            asmw.b = 58;
            this.h.a((asmw) ((anxl) asmz.build()));
        } else {
            throw new NullPointerException();
        }
    }

    public final void a(adym adym) {
        if (b() && adym.b().has("senderMsn")) {
            if (c(adym)) {
                d();
            }
            return;
        }
        this.e.a(adym);
    }

    public final void a_(adym adym) {
        try {
            b(adym);
        } catch (JSONException unused) {
            xtl.a(a, String.format("Invalid format for Session Status: %s", new Object[]{adym}));
        }
    }

    /* JADX WARNING: Missing block: B:31:0x00a1, code skipped:
            return true;
     */
    private final synchronized boolean c(defpackage.adym r7) {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.c;	 Catch:{ all -> 0x00b8 }
        r0 = r0.size();	 Catch:{ all -> 0x00b8 }
        r1 = 100;
        r2 = 1;
        r3 = 0;
        if (r0 != r1) goto L_0x001d;
    L_0x000d:
        r0 = new java.lang.Object[r2];	 Catch:{ all -> 0x00b8 }
        r0[r3] = r7;	 Catch:{ all -> 0x00b8 }
        r7 = "Queue too big, dropping message: %s";
        java.lang.String.format(r7, r0);	 Catch:{ all -> 0x00b8 }
        r7 = r6.i;	 Catch:{ all -> 0x00b8 }
        r7.incrementAndGet();	 Catch:{ all -> 0x00b8 }
        monitor-exit(r6);
        return r3;
    L_0x001d:
        r0 = r7.c();	 Catch:{ all -> 0x00b8 }
        r1 = r6.d;	 Catch:{ all -> 0x00b8 }
        r4 = 2;
        if (r0 < r1) goto L_0x00a2;
    L_0x0026:
        r1 = r6.c;	 Catch:{ all -> 0x00b8 }
        r5 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x00b8 }
        r1 = r1.containsKey(r5);	 Catch:{ all -> 0x00b8 }
        if (r1 == 0) goto L_0x0033;
    L_0x0032:
        goto L_0x00a2;
    L_0x0033:
        r1 = new java.lang.Object[r4];	 Catch:{ all -> 0x00b8 }
        r1[r3] = r5;	 Catch:{ all -> 0x00b8 }
        r1[r2] = r7;	 Catch:{ all -> 0x00b8 }
        r3 = "Queueing MSN(%d): %s";
        java.lang.String.format(r3, r1);	 Catch:{ all -> 0x00b8 }
        r1 = new adyf;	 Catch:{ all -> 0x00b8 }
        r1.<init>(r6, r0);	 Catch:{ all -> 0x00b8 }
        r0 = r6.c;	 Catch:{ all -> 0x00b8 }
        r3 = new adxu;	 Catch:{ all -> 0x00b8 }
        r3.<init>();	 Catch:{ all -> 0x00b8 }
        r3.b = r1;	 Catch:{ all -> 0x00b8 }
        r3.a = r7;	 Catch:{ all -> 0x00b8 }
        r7 = "";
        r4 = r3.a;	 Catch:{ all -> 0x00b8 }
        if (r4 != 0) goto L_0x005a;
    L_0x0054:
        r4 = " message";
        r7 = r7.concat(r4);	 Catch:{ all -> 0x00b8 }
    L_0x005a:
        r4 = r3.b;	 Catch:{ all -> 0x00b8 }
        if (r4 != 0) goto L_0x0068;
    L_0x005e:
        r7 = java.lang.String.valueOf(r7);	 Catch:{ all -> 0x00b8 }
        r4 = " timeoutRunnable";
        r7 = r7.concat(r4);	 Catch:{ all -> 0x00b8 }
    L_0x0068:
        r4 = r7.isEmpty();	 Catch:{ all -> 0x00b8 }
        if (r4 != 0) goto L_0x0086;
    L_0x006e:
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00b8 }
        r1 = "Missing required properties:";
        r2 = r7.length();	 Catch:{ all -> 0x00b8 }
        if (r2 != 0) goto L_0x007e;
    L_0x0078:
        r7 = new java.lang.String;	 Catch:{ all -> 0x00b8 }
        r7.<init>(r1);	 Catch:{ all -> 0x00b8 }
        goto L_0x0082;
    L_0x007e:
        r7 = r1.concat(r7);	 Catch:{ all -> 0x00b8 }
    L_0x0082:
        r0.<init>(r7);	 Catch:{ all -> 0x00b8 }
        throw r0;	 Catch:{ all -> 0x00b8 }
    L_0x0086:
        r7 = new adxv;	 Catch:{ all -> 0x00b8 }
        r4 = r3.a;	 Catch:{ all -> 0x00b8 }
        r3 = r3.b;	 Catch:{ all -> 0x00b8 }
        r7.<init>(r4, r3);	 Catch:{ all -> 0x00b8 }
        r0.put(r5, r7);	 Catch:{ all -> 0x00b8 }
        r7 = r6.j;	 Catch:{ all -> 0x00b8 }
        r7.incrementAndGet();	 Catch:{ all -> 0x00b8 }
        r7 = r6.g;	 Catch:{ all -> 0x00b8 }
        if (r7 == 0) goto L_0x00a0;
    L_0x009b:
        r3 = b;	 Catch:{ all -> 0x00b8 }
        r7.postDelayed(r1, r3);	 Catch:{ all -> 0x00b8 }
    L_0x00a0:
        monitor-exit(r6);
        return r2;
    L_0x00a2:
        r1 = r6.l;	 Catch:{ all -> 0x00b8 }
        r1.incrementAndGet();	 Catch:{ all -> 0x00b8 }
        r1 = new java.lang.Object[r4];	 Catch:{ all -> 0x00b8 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x00b8 }
        r1[r3] = r0;	 Catch:{ all -> 0x00b8 }
        r1[r2] = r7;	 Catch:{ all -> 0x00b8 }
        r7 = "Dropping MSN(%d): %s";
        java.lang.String.format(r7, r1);	 Catch:{ all -> 0x00b8 }
        monitor-exit(r6);
        return r3;
    L_0x00b8:
        r7 = move-exception;
        monitor-exit(r6);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adyc.c(adym):boolean");
    }

    private final synchronized void d() {
        if (b(this.d)) {
            this.d++;
            String.format("Now expected MSN(%d)", new Object[]{Integer.valueOf(r0)});
            d();
        }
    }

    public final synchronized void a(int i) {
        this.k.incrementAndGet();
        String.format("Cleaning MSN(%d)", new Object[]{Integer.valueOf(i)});
        for (int i2 = this.d; i2 <= i; i2++) {
            try {
                b(i2);
            } catch (JSONException e) {
                xtl.a(a, String.format("Problem cleaning MSN(%d)", new Object[]{Integer.valueOf(i2)}), e);
            }
        }
        this.d = i + 1;
        String.format("Now expected MSN(%d)", new Object[]{Integer.valueOf(i)});
        try {
            d();
        } catch (JSONException e2) {
            xtl.a(a, "Problem processing the queue", e2);
        }
    }

    private final synchronized boolean b(int i) {
        adye adye = (adye) this.c.remove(Integer.valueOf(i));
        if (adye == null) {
            return false;
        }
        Handler handler = this.g;
        if (handler != null) {
            handler.removeCallbacks(adye.b());
        }
        String.format("Processing deduped message MSN(%d): %s", new Object[]{r5, adye.a()});
        this.e.a(adye.a());
        return true;
    }
}
