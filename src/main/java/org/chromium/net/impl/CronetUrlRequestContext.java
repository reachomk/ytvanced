package org.chromium.net.impl;

import android.os.ConditionVariable;
import defpackage.bchu;
import defpackage.bchv;
import defpackage.bcix;
import defpackage.bcjf;
import defpackage.bcji;
import defpackage.bckr;
import defpackage.bckz;
import defpackage.bclf;
import defpackage.bclq;
import defpackage.bclr;
import defpackage.bcls;
import defpackage.bclt;
import defpackage.bcml;
import defpackage.bcmm;
import defpackage.bcmn;
import defpackage.bcmo;
import defpackage.bcom;
import defpackage.bcoq;
import defpackage.bcov;
import defpackage.bcpe;
import defpackage.bcph;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

public class CronetUrlRequestContext extends bclr {
    public static final String a = CronetUrlRequestContext.class.getSimpleName();
    private static final HashSet m = new HashSet();
    public final Object b = new Object();
    public long c;
    public Thread d;
    private final ConditionVariable e = new ConditionVariable(false);
    private final AtomicInteger f = new AtomicInteger(0);
    private final Object g = new Object();
    private final Object h = new Object();
    private final bchv i = new bchv();
    private final bchv j = new bchv();
    private final Map k = new HashMap();
    private volatile ConditionVariable l;
    private final String n;

    public CronetUrlRequestContext(bclq bclq) {
        Throwable th;
        bclq bclq2 = bclq;
        boolean z = bclq2.o;
        CronetLibraryLoader.a(bclq2.a, bclq2);
        nativeSetMinLogLevel(3);
        if (bclq2.k != 1) {
            this.n = null;
        } else {
            this.n = bclq2.f;
            synchronized (m) {
                if (m.add(this.n)) {
                } else {
                    throw new IllegalStateException("Disk cache storage path already in use");
                }
            }
        }
        Object obj = this.b;
        synchronized (obj) {
            Object obj2;
            try {
                String b;
                String str = bclq2.e;
                String str2 = bclq2.f;
                boolean z2 = bclq2.g;
                if (z2) {
                    b = bcoq.b(bclq2.a);
                } else {
                    b = "";
                }
                String str3 = b;
                boolean z3 = bclq2.h;
                z = bclq2.i;
                boolean z4 = bclq2.j;
                int i = bclq2.k;
                long j = bclq2.l;
                String str4 = bclq2.m;
                obj2 = obj;
                long j2 = bclq2.n;
                z = bclq2.o;
                j2 = nativeCreateRequestContextConfig(str, str2, z2, str3, z3, false, z4, i, j, str4, 0, false, bclq2.d, bclq2.a(10));
                for (bcls bcls : bclq2.b) {
                    nativeAddQuicHint(j2, bcls.a, bcls.b, bcls.c);
                }
                for (bclt bclt : bclq2.c) {
                    str2 = bclt.a;
                    byte[][] bArr = bclt.b;
                    nativeAddPkp(j2, str2, bArr, bclt.c, bclt.d.getTime());
                }
                j2 = nativeCreateRequestContextAdapter(j2);
                this.c = j2;
                if (j2 != 0) {
                    CronetLibraryLoader.a(new bcml(this));
                    return;
                }
                throw new NullPointerException("Context Adapter creation failed.");
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    private static native void nativeAddPkp(long j, String str, byte[][] bArr, boolean z, long j2);

    private static native void nativeAddQuicHint(long j, String str, int i, int i2);

    private native void nativeConfigureNetworkQualityEstimatorForTesting(long j, boolean z, boolean z2, boolean z3);

    private static native long nativeCreateRequestContextAdapter(long j);

    private static native long nativeCreateRequestContextConfig(String str, String str2, boolean z, String str3, boolean z2, boolean z3, boolean z4, int i, long j, String str4, long j2, boolean z5, boolean z6, int i2);

    private native void nativeDestroy(long j);

    private static native byte[] nativeGetHistogramDeltas();

    private native void nativeProvideRTTObservations(long j, boolean z);

    private native void nativeProvideThroughputObservations(long j, boolean z);

    private static native int nativeSetMinLogLevel(int i);

    private native void nativeStartNetLogToDisk(long j, String str, boolean z, int i);

    private native boolean nativeStartNetLogToFile(long j, String str, boolean z);

    private native void nativeStopNetLog(long j);

    public native void nativeInitRequestContextOnInitThread(long j);

    public final bcji a(String str, bcix bcix, Executor executor) {
        return new bclf(str, bcix, executor, this);
    }

    public final bcom a(String str, bckz bckz, Executor executor, int i, Collection collection, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, bckr bckr) {
        Throwable th;
        Object obj = this.b;
        synchronized (obj) {
            Object obj2;
            try {
                g();
                CronetUrlRequest cronetUrlRequest = cronetUrlRequest;
                obj2 = obj;
                cronetUrlRequest = new CronetUrlRequest(this, str, i, bckz, executor, collection, z, z2, false, 0, false, 0, bckr);
                return cronetUrlRequest;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final bcjf a(String str, bcix bcix, Executor executor, String str2, List list, int i, boolean z, Collection collection, boolean z2, int i2, boolean z3, int i3) {
        Throwable th;
        Object obj = this.b;
        synchronized (obj) {
            Object obj2;
            try {
                g();
                CronetBidirectionalStream cronetBidirectionalStream = cronetBidirectionalStream;
                obj2 = obj;
                cronetBidirectionalStream = new CronetBidirectionalStream(this, str, i, bcix, executor, str2, list, z, collection, z2, i2, z3, i3);
                return cronetBidirectionalStream;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public final String a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cronet/");
        stringBuilder.append(bcmo.a());
        return stringBuilder.toString();
    }

    public void stopNetLogCompleted() {
        this.l.open();
    }

    public final void a(bckr bckr) {
        synchronized (this.h) {
            this.k.put(bckr, new bcov(bckr));
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean c() {
        int isEmpty;
        synchronized (this.h) {
            isEmpty = this.k.isEmpty() ^ 1;
        }
        return isEmpty;
    }

    public final URLConnection a(URL url) {
        return a(url, Proxy.NO_PROXY);
    }

    public final URLConnection a(URL url, Proxy proxy) {
        if (proxy.type() == Type.DIRECT) {
            String protocol = url.getProtocol();
            if ("http".equals(protocol) || "https".equals(protocol)) {
                return new bcpe(url, this);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected protocol:");
            stringBuilder.append(protocol);
            throw new UnsupportedOperationException(stringBuilder.toString());
        }
        throw new UnsupportedOperationException();
    }

    public final URLStreamHandlerFactory b() {
        return new bcph(this);
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        this.f.incrementAndGet();
    }

    /* Access modifiers changed, original: final */
    public final void e() {
        this.f.decrementAndGet();
    }

    public final long f() {
        long j;
        synchronized (this.b) {
            g();
            j = this.c;
        }
        return j;
    }

    private final void g() {
        if (this.c == 0) {
            throw new IllegalStateException("Engine is shut down.");
        }
    }

    private void initNetworkThread() {
        this.d = Thread.currentThread();
        this.e.open();
        Thread.currentThread().setName("ChromiumNet");
    }

    private void onEffectiveConnectionTypeChanged(int i) {
        synchronized (this.g) {
        }
    }

    private void onRTTOrThroughputEstimatesComputed(int i, int i2, int i3) {
        synchronized (this.g) {
        }
    }

    private void onRttObservation(int i, long j, int i2) {
        synchronized (this.g) {
            Iterator it = this.i.iterator();
            if (it.hasNext()) {
                it.next();
                bcmn bcmn = new bcmn();
                throw new NoSuchMethodError();
            }
        }
    }

    private void onThroughputObservation(int i, long j, int i2) {
        synchronized (this.g) {
            Iterator it = this.j.iterator();
            if (it.hasNext()) {
                it.next();
                bcmm bcmm = new bcmm();
                throw new NoSuchMethodError();
            }
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:9:0x0019, code skipped:
            r0 = r1.size();
            r2 = 0;
     */
    /* JADX WARNING: Missing block: B:10:0x001e, code skipped:
            if (r2 >= r0) goto L_0x0035;
     */
    /* JADX WARNING: Missing block: B:11:0x0020, code skipped:
            r3 = (defpackage.bcov) r1.get(r2);
            a(r3.a(), new defpackage.bcmp(r3, r6));
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:12:0x0035, code skipped:
            return;
     */
    public final void a(defpackage.bcko r6) {
        /*
        r5 = this;
        r0 = r5.h;
        monitor-enter(r0);
        r1 = r5.k;	 Catch:{ all -> 0x0036 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x0036 }
        if (r1 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r0);	 Catch:{ all -> 0x0036 }
        return;
    L_0x000d:
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x0036 }
        r2 = r5.k;	 Catch:{ all -> 0x0036 }
        r2 = r2.values();	 Catch:{ all -> 0x0036 }
        r1.<init>(r2);	 Catch:{ all -> 0x0036 }
        monitor-exit(r0);	 Catch:{ all -> 0x0036 }
        r0 = r1.size();
        r2 = 0;
    L_0x001e:
        if (r2 >= r0) goto L_0x0035;
    L_0x0020:
        r3 = r1.get(r2);
        r3 = (defpackage.bcov) r3;
        r4 = new bcmp;
        r4.<init>(r3, r6);
        r3 = r3.a();
        a(r3, r4);
        r2 = r2 + 1;
        goto L_0x001e;
    L_0x0035:
        return;
    L_0x0036:
        r6 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0036 }
        goto L_0x003a;
    L_0x0039:
        throw r6;
    L_0x003a:
        goto L_0x0039;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetUrlRequestContext.a(bcko):void");
    }

    private static void a(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            bchu.c(a, "Exception posting task to executor", e);
        }
    }
}
