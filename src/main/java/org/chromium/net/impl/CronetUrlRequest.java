package org.chromium.net.impl;

import defpackage.bchu;
import defpackage.bcjd;
import defpackage.bcjq;
import defpackage.bcko;
import defpackage.bckr;
import defpackage.bcks;
import defpackage.bcky;
import defpackage.bckz;
import defpackage.bclh;
import defpackage.bclu;
import defpackage.bclv;
import defpackage.bcmb;
import defpackage.bcmc;
import defpackage.bcmd;
import defpackage.bcme;
import defpackage.bcmf;
import defpackage.bcmg;
import defpackage.bcmh;
import defpackage.bcmi;
import defpackage.bcmj;
import defpackage.bcmk;
import defpackage.bcoj;
import defpackage.bcok;
import defpackage.bcol;
import defpackage.bcom;
import defpackage.bcon;
import defpackage.bcoo;
import defpackage.bcov;
import defpackage.bcow;
import java.nio.ByteBuffer;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class CronetUrlRequest extends bcom {
    private bclv A;
    private bcmj B;
    public long a;
    public boolean b;
    public final Object c = new Object();
    public final bcow d;
    public final bcov e;
    public CronetUploadDataStream f;
    public bcoo g;
    public bcjd h;
    private final boolean i;
    private boolean j;
    private boolean k;
    private final CronetUrlRequestContext l;
    private final Executor m;
    private final List n = new ArrayList();
    private final String o;
    private final int p;
    private String q;
    private final bcmk r = new bcmk();
    private final Collection s;
    private final boolean t;
    private final boolean u;
    private final boolean v;
    private final int w;
    private final boolean x;
    private final int y;
    private int z;

    CronetUrlRequest(CronetUrlRequestContext cronetUrlRequestContext, String str, int i, bckz bckz, Executor executor, Collection collection, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, bckr bckr) {
        if (str == null) {
            throw new NullPointerException("URL is required");
        } else if (bckz == null) {
            throw new NullPointerException("Listener is required");
        } else if (executor != null) {
            this.i = z2;
            this.l = cronetUrlRequestContext;
            this.o = str;
            this.n.add(str);
            int i4 = 3;
            if (i == 0) {
                i4 = 1;
            } else if (i == 1) {
                i4 = 2;
            } else if (i != 2) {
                i4 = (i == 3 || i != 4) ? 4 : 5;
            }
            this.p = i4;
            this.d = new bcow(bckz);
            this.m = executor;
            this.s = collection;
            this.t = z;
            this.u = false;
            this.v = false;
            this.w = 0;
            this.x = false;
            this.y = 0;
            this.e = bckr != null ? new bcov(bckr) : null;
        } else {
            throw new NullPointerException("Executor is required");
        }
    }

    private final native boolean nativeAddRequestHeader(long j, String str, String str2);

    private final native long nativeCreateRequestAdapter(long j, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3);

    private final native void nativeDestroy(long j, boolean z);

    private final native void nativeFollowDeferredRedirect(long j);

    private final native void nativeGetStatus(long j, VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener);

    private final native boolean nativeReadData(long j, ByteBuffer byteBuffer, int i, int i2);

    private final native boolean nativeSetHttpMethod(long j, String str);

    private final native void nativeStart(long j);

    public final void a(String str) {
        h();
        this.q = str;
    }

    public final void a(String str, String str2) {
        h();
        if (str == null) {
            throw new NullPointerException("Invalid header name.");
        } else if (str2 != null) {
            this.r.add(new SimpleImmutableEntry(str, str2));
        } else {
            throw new NullPointerException("Invalid header value.");
        }
    }

    public final void a(bcks bcks, Executor executor) {
        if (this.q == null) {
            this.q = "POST";
        }
        this.f = new CronetUploadDataStream(bcks, executor, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041 A:{Catch:{ RuntimeException -> 0x00f3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f A:{Catch:{ RuntimeException -> 0x00f3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d6 A:{SYNTHETIC, Splitter:B:36:0x00d6} */
    public final void a() {
        /*
        r17 = this;
        r13 = r17;
        r14 = r13.c;
        monitor-enter(r14);
        r17.h();	 Catch:{ all -> 0x00f8 }
        r15 = 1;
        r0 = r13.l;	 Catch:{ RuntimeException -> 0x00f3 }
        r2 = r0.f();	 Catch:{ RuntimeException -> 0x00f3 }
        r4 = r13.o;	 Catch:{ RuntimeException -> 0x00f3 }
        r5 = r13.p;	 Catch:{ RuntimeException -> 0x00f3 }
        r6 = r13.t;	 Catch:{ RuntimeException -> 0x00f3 }
        r0 = r13.l;	 Catch:{ RuntimeException -> 0x00f3 }
        r0 = r0.c();	 Catch:{ RuntimeException -> 0x00f3 }
        r16 = 0;
        if (r0 != 0) goto L_0x0026;
    L_0x001f:
        r0 = r13.e;	 Catch:{ RuntimeException -> 0x00f3 }
        if (r0 == 0) goto L_0x0024;
    L_0x0023:
        goto L_0x0026;
    L_0x0024:
        r8 = 0;
        goto L_0x0027;
    L_0x0026:
        r8 = 1;
    L_0x0027:
        r9 = r13.v;	 Catch:{ RuntimeException -> 0x00f3 }
        r10 = r13.w;	 Catch:{ RuntimeException -> 0x00f3 }
        r11 = r13.x;	 Catch:{ RuntimeException -> 0x00f3 }
        r12 = r13.y;	 Catch:{ RuntimeException -> 0x00f3 }
        r7 = 0;
        r1 = r17;
        r0 = r1.nativeCreateRequestAdapter(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12);	 Catch:{ RuntimeException -> 0x00f3 }
        r13.a = r0;	 Catch:{ RuntimeException -> 0x00f3 }
        r0 = r13.l;	 Catch:{ RuntimeException -> 0x00f3 }
        r0.d();	 Catch:{ RuntimeException -> 0x00f3 }
        r0 = r13.q;	 Catch:{ RuntimeException -> 0x00f3 }
        if (r0 == 0) goto L_0x0063;
    L_0x0041:
        r1 = r13.a;	 Catch:{ RuntimeException -> 0x00f3 }
        r0 = r13.nativeSetHttpMethod(r1, r0);	 Catch:{ RuntimeException -> 0x00f3 }
        if (r0 == 0) goto L_0x004a;
    L_0x0049:
        goto L_0x0063;
    L_0x004a:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ RuntimeException -> 0x00f3 }
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x00f3 }
        r1.<init>();	 Catch:{ RuntimeException -> 0x00f3 }
        r2 = "Invalid http method ";
        r1.append(r2);	 Catch:{ RuntimeException -> 0x00f3 }
        r2 = r13.q;	 Catch:{ RuntimeException -> 0x00f3 }
        r1.append(r2);	 Catch:{ RuntimeException -> 0x00f3 }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x00f3 }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x00f3 }
        throw r0;	 Catch:{ RuntimeException -> 0x00f3 }
    L_0x0063:
        r0 = r13.r;	 Catch:{ RuntimeException -> 0x00f3 }
        r0 = r0.iterator();	 Catch:{ RuntimeException -> 0x00f3 }
    L_0x0069:
        r1 = r0.hasNext();	 Catch:{ RuntimeException -> 0x00f3 }
        if (r1 == 0) goto L_0x00d2;
    L_0x006f:
        r1 = r0.next();	 Catch:{ RuntimeException -> 0x00f3 }
        r1 = (java.util.Map.Entry) r1;	 Catch:{ RuntimeException -> 0x00f3 }
        r2 = r1.getKey();	 Catch:{ RuntimeException -> 0x00f3 }
        r2 = (java.lang.String) r2;	 Catch:{ RuntimeException -> 0x00f3 }
        r3 = "Content-Type";
        r2 = r2.equalsIgnoreCase(r3);	 Catch:{ RuntimeException -> 0x00f3 }
        if (r2 == 0) goto L_0x0092;
    L_0x0083:
        r2 = r1.getValue();	 Catch:{ RuntimeException -> 0x00f3 }
        r2 = (java.lang.String) r2;	 Catch:{ RuntimeException -> 0x00f3 }
        r2 = r2.isEmpty();	 Catch:{ RuntimeException -> 0x00f3 }
        if (r2 == 0) goto L_0x0090;
    L_0x008f:
        goto L_0x0092;
    L_0x0090:
        r16 = 1;
    L_0x0092:
        r2 = r13.a;	 Catch:{ RuntimeException -> 0x00f3 }
        r4 = r1.getKey();	 Catch:{ RuntimeException -> 0x00f3 }
        r4 = (java.lang.String) r4;	 Catch:{ RuntimeException -> 0x00f3 }
        r5 = r1.getValue();	 Catch:{ RuntimeException -> 0x00f3 }
        r5 = (java.lang.String) r5;	 Catch:{ RuntimeException -> 0x00f3 }
        r2 = r13.nativeAddRequestHeader(r2, r4, r5);	 Catch:{ RuntimeException -> 0x00f3 }
        if (r2 == 0) goto L_0x00a7;
    L_0x00a6:
        goto L_0x0069;
    L_0x00a7:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ RuntimeException -> 0x00f3 }
        r2 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x00f3 }
        r2.<init>();	 Catch:{ RuntimeException -> 0x00f3 }
        r3 = "Invalid header ";
        r2.append(r3);	 Catch:{ RuntimeException -> 0x00f3 }
        r3 = r1.getKey();	 Catch:{ RuntimeException -> 0x00f3 }
        r3 = (java.lang.String) r3;	 Catch:{ RuntimeException -> 0x00f3 }
        r2.append(r3);	 Catch:{ RuntimeException -> 0x00f3 }
        r3 = "=";
        r2.append(r3);	 Catch:{ RuntimeException -> 0x00f3 }
        r1 = r1.getValue();	 Catch:{ RuntimeException -> 0x00f3 }
        r1 = (java.lang.String) r1;	 Catch:{ RuntimeException -> 0x00f3 }
        r2.append(r1);	 Catch:{ RuntimeException -> 0x00f3 }
        r1 = r2.toString();	 Catch:{ RuntimeException -> 0x00f3 }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x00f3 }
        throw r0;	 Catch:{ RuntimeException -> 0x00f3 }
    L_0x00d2:
        r0 = r13.f;	 Catch:{ RuntimeException -> 0x00f3 }
        if (r0 != 0) goto L_0x00dd;
    L_0x00d6:
        r13.j = r15;	 Catch:{ all -> 0x00f8 }
        r17.d();	 Catch:{ all -> 0x00f8 }
        monitor-exit(r14);	 Catch:{ all -> 0x00f8 }
        return;
    L_0x00dd:
        if (r16 == 0) goto L_0x00eb;
    L_0x00df:
        r13.j = r15;	 Catch:{ RuntimeException -> 0x00f3 }
        r1 = new bcma;	 Catch:{ RuntimeException -> 0x00f3 }
        r1.<init>(r13);	 Catch:{ RuntimeException -> 0x00f3 }
        r0.a(r1);	 Catch:{ RuntimeException -> 0x00f3 }
        monitor-exit(r14);	 Catch:{ all -> 0x00f8 }
        return;
    L_0x00eb:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ RuntimeException -> 0x00f3 }
        r1 = "Requests with upload data must have a Content-Type.";
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x00f3 }
        throw r0;	 Catch:{ RuntimeException -> 0x00f3 }
    L_0x00f3:
        r0 = move-exception;
        r13.a(r15);	 Catch:{ all -> 0x00f8 }
        throw r0;	 Catch:{ all -> 0x00f8 }
    L_0x00f8:
        r0 = move-exception;
        monitor-exit(r14);	 Catch:{ all -> 0x00f8 }
        goto L_0x00fc;
    L_0x00fb:
        throw r0;
    L_0x00fc:
        goto L_0x00fb;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetUrlRequest.a():void");
    }

    public final void d() {
        nativeStart(this.a);
    }

    public final void b() {
        synchronized (this.c) {
            if (this.b) {
                this.b = false;
                if (e()) {
                    return;
                }
                nativeFollowDeferredRedirect(this.a);
                return;
            }
            throw new IllegalStateException("No redirect to follow.");
        }
    }

    public final void a(ByteBuffer byteBuffer) {
        bcol.b(byteBuffer);
        bcol.a(byteBuffer);
        synchronized (this.c) {
            if (this.k) {
                this.k = false;
                if (e()) {
                    return;
                }
                if (nativeReadData(this.a, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                    return;
                } else {
                    this.k = true;
                    throw new IllegalArgumentException("Unable to call native read");
                }
            }
            throw new IllegalStateException("Unexpected read attempt.");
        }
    }

    /* JADX WARNING: Missing block: B:12:0x0015, code skipped:
            return;
     */
    public final void c() {
        /*
        r2 = this;
        r0 = r2.c;
        monitor-enter(r0);
        r1 = r2.e();	 Catch:{ all -> 0x0016 }
        if (r1 != 0) goto L_0x0014;
    L_0x0009:
        r1 = r2.j;	 Catch:{ all -> 0x0016 }
        if (r1 != 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0014;
    L_0x000e:
        r1 = 2;
        r2.a(r1);	 Catch:{ all -> 0x0016 }
        monitor-exit(r0);	 Catch:{ all -> 0x0016 }
        return;
    L_0x0014:
        monitor-exit(r0);	 Catch:{ all -> 0x0016 }
        return;
    L_0x0016:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0016 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetUrlRequest.c():void");
    }

    public final boolean e() {
        return this.j && this.a == 0;
    }

    public final void a(bcky bcky) {
        VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener = new VersionSafeCallbacks$UrlRequestStatusListener(bcky);
        synchronized (this.c) {
            long j = this.a;
            if (j != 0) {
                nativeGetStatus(j, versionSafeCallbacks$UrlRequestStatusListener);
                return;
            }
            a(new bcmc(versionSafeCallbacks$UrlRequestStatusListener));
        }
    }

    private final void a(Runnable runnable) {
        try {
            this.m.execute(runnable);
        } catch (RejectedExecutionException e) {
            String str = "Exception posting task to executor";
            bchu.c(CronetUrlRequestContext.a, str, e);
            a(new bclu(str, e));
        }
    }

    private final bcoo a(int i, String str, String[] strArr, boolean z, String str2, String str3, long j) {
        String[] strArr2 = strArr;
        int i2 = 0;
        bcmk bcmk = new bcmk();
        while (i2 < strArr2.length) {
            bcmk.add(new SimpleImmutableEntry(strArr2[i2], strArr2[i2 + 1]));
            i2 += 2;
        }
        return new bcoo(new ArrayList(this.n), i, str, bcmk, z, str2, str3, j);
    }

    private final void h() {
        synchronized (this.c) {
            if (this.j || e()) {
                throw new IllegalStateException("Request is already started.");
            }
        }
    }

    public final void a(int i) {
        this.z = i;
        if (this.a != 0) {
            this.l.e();
            nativeDestroy(this.a, i == 2);
            this.a = 0;
        }
    }

    public final void a(Exception exception) {
        bcjd bclh = new bclh("Exception received from UrlRequest.Callback", exception);
        bchu.c(CronetUrlRequestContext.a, "Exception in CalledByNative method", exception);
        a(bclh);
    }

    /* Access modifiers changed, original: final */
    public final void a(Throwable th) {
        bcjd bclh = new bclh("Exception received from UploadDataProvider", th);
        bchu.c(CronetUrlRequestContext.a, "Exception in upload method", th);
        a(bclh);
    }

    private final void a(bcjd bcjd) {
        synchronized (this.c) {
            if (e()) {
                return;
            }
            this.h = bcjd;
            a(1);
        }
    }

    private final void onRedirectReceived(String str, int i, String str2, String[] strArr, boolean z, String str3, String str4, long j) {
        String str5 = str;
        bcoo a = a(i, str2, strArr, z, str3, str4, j);
        this.n.add(str);
        a(new bcmb(this, a, str));
    }

    private final void onResponseStarted(int i, String str, String[] strArr, boolean z, String str2, String str3, long j) {
        this.g = a(i, str, strArr, z, str2, str3, j);
        a(new bcme(this));
    }

    private final void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        this.g.a(j);
        if (byteBuffer.position() == i2 && byteBuffer.limit() == i3) {
            if (this.B == null) {
                this.B = new bcmj(this);
            }
            byteBuffer.position(i2 + i);
            Runnable runnable = this.B;
            runnable.a = byteBuffer;
            a(runnable);
            return;
        }
        a(new bclu("ByteBuffer modified externally during read", null));
    }

    private final void onSucceeded(long j) {
        this.g.a(j);
        a(new bcmd(this));
    }

    private final void onError(int i, int i2, int i3, String str, long j) {
        bcoo bcoo = this.g;
        if (bcoo != null) {
            bcoo.a(j);
        }
        String str2 = "Exception in CronetUrlRequest: ";
        if (i == 10 || i == 3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(str);
            a(new bcok(stringBuilder.toString(), i, i2, i3));
            return;
        }
        StringBuilder stringBuilder2;
        switch (i) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 8:
                i = 8;
                break;
            case 9:
                i = 9;
                break;
            case 10:
                i = 10;
                break;
            case 11:
                i = 11;
                break;
            default:
                String str3 = CronetUrlRequestContext.a;
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Unknown error code: ");
                stringBuilder2.append(i);
                bchu.c(str3, stringBuilder2.toString(), new Object[0]);
                break;
        }
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str2);
        stringBuilder2.append(str);
        a(new bcoj(stringBuilder2.toString(), i, i2));
    }

    private final void onCanceled() {
        a(new bcmg(this));
    }

    private final void onStatus(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener, int i) {
        a(new bcmf(versionSafeCallbacks$UrlRequestStatusListener, i));
    }

    private final void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15) {
        synchronized (this.c) {
            if (this.A == null) {
                this.A = new bclv(j, j8, j12, j13, z, j14, j15);
            } else {
                throw new IllegalStateException("Metrics collection should only happen once.");
            }
        }
    }

    private final void onNativeAdapterDestroyed() {
        synchronized (this.c) {
            if (this.h == null) {
                return;
            }
            try {
                this.m.execute(new bcmi(this));
            } catch (RejectedExecutionException e) {
                bchu.c(CronetUrlRequestContext.a, "Exception posting task to executor", e);
            }
        }
    }

    public final void f() {
        if (!this.i) {
            if (Thread.currentThread() == this.l.d) {
                throw new bcjq();
            }
        }
    }

    public final void g() {
        bclv bclv = this.A;
        if (bclv != null) {
            bcko bcon = new bcon(this.o, this.s, bclv, this.z, this.g, this.h);
            this.l.a(bcon);
            bcov bcov = this.e;
            if (bcov != null) {
                try {
                    bcov.a().execute(new bcmh(this, bcon));
                } catch (RejectedExecutionException e) {
                    bchu.c(CronetUrlRequestContext.a, "Exception posting task to executor", e);
                }
            }
        }
    }
}
