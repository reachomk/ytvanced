package org.chromium.net.impl;

import defpackage.bchu;
import defpackage.bciw;
import defpackage.bcix;
import defpackage.bcjd;
import defpackage.bcjf;
import defpackage.bckq;
import defpackage.bclh;
import defpackage.bcli;
import defpackage.bclj;
import defpackage.bclk;
import defpackage.bcll;
import defpackage.bclm;
import defpackage.bcln;
import defpackage.bclp;
import defpackage.bclu;
import defpackage.bclv;
import defpackage.bcok;
import defpackage.bcol;
import defpackage.bcon;
import defpackage.bcoo;
import defpackage.bcor;
import defpackage.bcot;
import java.nio.ByteBuffer;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public class CronetBidirectionalStream extends bcjf {
    public final bcot a;
    public final String b;
    public final Object c = new Object();
    public boolean d;
    public int e;
    public int f;
    public bcoo g;
    private final CronetUrlRequestContext h;
    private final Executor i;
    private final String j;
    private final int k;
    private final String[] l;
    private final boolean m;
    private final Collection n;
    private final boolean o;
    private final int p;
    private final boolean q;
    private final int r;
    private bcjd s;
    private LinkedList t;
    private LinkedList u;
    private boolean v;
    private bckq w;
    private long x;
    private bclp y;

    CronetBidirectionalStream(CronetUrlRequestContext cronetUrlRequestContext, String str, int i, bcix bcix, Executor executor, String str2, List list, boolean z, Collection collection, boolean z2, int i2, boolean z3, int i3) {
        int i4 = i;
        int i5 = 0;
        this.e = 0;
        this.f = 0;
        this.h = cronetUrlRequestContext;
        this.j = str;
        int i6 = 4;
        if (i4 == 0) {
            i6 = 1;
        } else if (i4 == 1) {
            i6 = 2;
        } else if (i4 == 2) {
            i6 = 3;
        } else if (i4 != 3) {
            if (i4 == 4) {
                i6 = 5;
            } else {
                throw new IllegalArgumentException("Invalid stream priority.");
            }
        }
        this.k = i6;
        bcix bcix2 = bcix;
        this.a = new bcot(bcix);
        this.i = executor;
        this.b = str2;
        i4 = list.size();
        String[] strArr = new String[(i4 + i4)];
        i6 = list.size();
        int i7 = 0;
        while (i5 < i6) {
            Entry entry = (Entry) list.get(i5);
            int i8 = i7 + 1;
            strArr[i7] = (String) entry.getKey();
            i7 = i8 + 1;
            strArr[i8] = (String) entry.getValue();
            i5++;
        }
        this.l = strArr;
        this.m = z;
        this.t = new LinkedList();
        this.u = new LinkedList();
        this.n = collection;
        this.o = z2;
        this.p = i2;
        this.q = z3;
        this.r = i3;
    }

    private native long nativeCreateBidirectionalStream(long j, boolean z, boolean z2, boolean z3, int i, boolean z4, int i2);

    private native void nativeDestroy(long j, boolean z);

    private native boolean nativeReadData(long j, ByteBuffer byteBuffer, int i, int i2);

    private native void nativeSendRequestHeaders(long j);

    private native int nativeStart(long j, String str, int i, String str2, String[] strArr, boolean z);

    private native boolean nativeWritevData(long j, ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z);

    public final void a() {
        synchronized (this.c) {
            if (this.e == 0) {
                try {
                    this.x = nativeCreateBidirectionalStream(this.h.f(), this.m ^ 1, this.h.c(), this.o, this.p, this.q, this.r);
                    this.h.d();
                    long j = this.x;
                    String str = this.j;
                    int i = this.k;
                    String str2 = this.b;
                    int nativeStart = nativeStart(j, str, i, str2, this.l, a(str2) ^ 1);
                    if (nativeStart == -1) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid http method ");
                        stringBuilder.append(this.b);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    } else if (nativeStart <= 0) {
                        this.f = 1;
                        this.e = 1;
                    } else {
                        nativeStart--;
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Invalid header ");
                        stringBuilder2.append(this.l[nativeStart]);
                        stringBuilder2.append("=");
                        stringBuilder2.append(this.l[nativeStart + 1]);
                        throw new IllegalArgumentException(stringBuilder2.toString());
                    }
                } catch (RuntimeException e) {
                    a(false);
                    throw e;
                }
            }
            throw new IllegalStateException("Stream is already started.");
        }
    }

    public final void a(ByteBuffer byteBuffer) {
        synchronized (this.c) {
            bcol.b(byteBuffer);
            bcol.a(byteBuffer);
            if (this.e != 2) {
                throw new IllegalStateException("Unexpected read attempt.");
            } else if (d()) {
            } else {
                if (this.y == null) {
                    this.y = new bclp(this);
                }
                this.e = 3;
                if (nativeReadData(this.x, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                } else {
                    this.e = 2;
                    throw new IllegalArgumentException("Unable to call native read");
                }
            }
        }
    }

    /* JADX WARNING: Missing block: B:17:0x0026, code skipped:
            return;
     */
    public final void a(java.nio.ByteBuffer r3, boolean r4) {
        /*
        r2 = this;
        r0 = r2.c;
        monitor-enter(r0);
        defpackage.bcol.a(r3);	 Catch:{ all -> 0x0037 }
        r1 = r3.hasRemaining();	 Catch:{ all -> 0x0037 }
        if (r1 == 0) goto L_0x000d;
    L_0x000c:
        goto L_0x000f;
    L_0x000d:
        if (r4 == 0) goto L_0x002f;
    L_0x000f:
        r1 = r2.v;	 Catch:{ all -> 0x0037 }
        if (r1 != 0) goto L_0x0027;
    L_0x0013:
        r1 = r2.d();	 Catch:{ all -> 0x0037 }
        if (r1 == 0) goto L_0x001b;
    L_0x0019:
        monitor-exit(r0);	 Catch:{ all -> 0x0037 }
        return;
    L_0x001b:
        r1 = r2.t;	 Catch:{ all -> 0x0037 }
        r1.add(r3);	 Catch:{ all -> 0x0037 }
        if (r4 == 0) goto L_0x0025;
    L_0x0022:
        r3 = 1;
        r2.v = r3;	 Catch:{ all -> 0x0037 }
    L_0x0025:
        monitor-exit(r0);	 Catch:{ all -> 0x0037 }
        return;
    L_0x0027:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x0037 }
        r4 = "Write after writing end of stream.";
        r3.<init>(r4);	 Catch:{ all -> 0x0037 }
        throw r3;	 Catch:{ all -> 0x0037 }
    L_0x002f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x0037 }
        r4 = "Empty buffer before end of stream.";
        r3.<init>(r4);	 Catch:{ all -> 0x0037 }
        throw r3;	 Catch:{ all -> 0x0037 }
    L_0x0037:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0037 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetBidirectionalStream.a(java.nio.ByteBuffer, boolean):void");
    }

    /* JADX WARNING: Missing block: B:20:0x003e, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:32:0x005f, code skipped:
            return;
     */
    public final void b() {
        /*
        r4 = this;
        r0 = r4.c;
        monitor-enter(r0);
        r1 = r4.d();	 Catch:{ all -> 0x0060 }
        if (r1 != 0) goto L_0x005e;
    L_0x0009:
        r1 = r4.f;	 Catch:{ all -> 0x0060 }
        r2 = 8;
        r3 = 9;
        if (r1 != r2) goto L_0x0012;
    L_0x0011:
        goto L_0x0015;
    L_0x0012:
        if (r1 == r3) goto L_0x0015;
    L_0x0014:
        goto L_0x005e;
    L_0x0015:
        r1 = r4.t;	 Catch:{ all -> 0x0060 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x0060 }
        if (r1 == 0) goto L_0x003f;
    L_0x001d:
        r1 = r4.u;	 Catch:{ all -> 0x0060 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x0060 }
        if (r1 == 0) goto L_0x003f;
    L_0x0025:
        r1 = r4.d;	 Catch:{ all -> 0x0060 }
        if (r1 != 0) goto L_0x003d;
    L_0x0029:
        r1 = 1;
        r4.d = r1;	 Catch:{ all -> 0x0060 }
        r1 = r4.x;	 Catch:{ all -> 0x0060 }
        r4.nativeSendRequestHeaders(r1);	 Catch:{ all -> 0x0060 }
        r1 = r4.b;	 Catch:{ all -> 0x0060 }
        r1 = a(r1);	 Catch:{ all -> 0x0060 }
        if (r1 != 0) goto L_0x003d;
    L_0x0039:
        r1 = 10;
        r4.f = r1;	 Catch:{ all -> 0x0060 }
    L_0x003d:
        monitor-exit(r0);	 Catch:{ all -> 0x0060 }
        return;
    L_0x003f:
        r1 = r4.t;	 Catch:{ all -> 0x0060 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x0060 }
        if (r1 != 0) goto L_0x0053;
    L_0x0047:
        r1 = r4.u;	 Catch:{ all -> 0x0060 }
        r2 = r4.t;	 Catch:{ all -> 0x0060 }
        r1.addAll(r2);	 Catch:{ all -> 0x0060 }
        r1 = r4.t;	 Catch:{ all -> 0x0060 }
        r1.clear();	 Catch:{ all -> 0x0060 }
    L_0x0053:
        r1 = r4.f;	 Catch:{ all -> 0x0060 }
        if (r1 != r3) goto L_0x0059;
    L_0x0057:
        monitor-exit(r0);	 Catch:{ all -> 0x0060 }
        return;
    L_0x0059:
        r4.f();	 Catch:{ all -> 0x0060 }
        monitor-exit(r0);	 Catch:{ all -> 0x0060 }
        return;
    L_0x005e:
        monitor-exit(r0);	 Catch:{ all -> 0x0060 }
        return;
    L_0x0060:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0060 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetBidirectionalStream.b():void");
    }

    private final void f() {
        int size = this.u.size();
        ByteBuffer[] byteBufferArr = new ByteBuffer[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        for (int i = 0; i < size; i++) {
            ByteBuffer byteBuffer = (ByteBuffer) this.u.poll();
            byteBufferArr[i] = byteBuffer;
            iArr[i] = byteBuffer.position();
            iArr2[i] = byteBuffer.limit();
        }
        this.f = 9;
        this.d = true;
        long j = this.x;
        boolean z = this.v && this.t.isEmpty();
        if (!nativeWritevData(j, byteBufferArr, iArr, iArr2, z)) {
            this.f = 8;
            throw new IllegalArgumentException("Unable to call native writev.");
        }
    }

    /* JADX WARNING: Missing block: B:12:0x001a, code skipped:
            return;
     */
    public final void c() {
        /*
        r2 = this;
        r0 = r2.c;
        monitor-enter(r0);
        r1 = r2.d();	 Catch:{ all -> 0x001b }
        if (r1 != 0) goto L_0x0019;
    L_0x0009:
        r1 = r2.e;	 Catch:{ all -> 0x001b }
        if (r1 != 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0019;
    L_0x000e:
        r1 = 5;
        r2.f = r1;	 Catch:{ all -> 0x001b }
        r2.e = r1;	 Catch:{ all -> 0x001b }
        r1 = 1;
        r2.a(r1);	 Catch:{ all -> 0x001b }
        monitor-exit(r0);	 Catch:{ all -> 0x001b }
        return;
    L_0x0019:
        monitor-exit(r0);	 Catch:{ all -> 0x001b }
        return;
    L_0x001b:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001b }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetBidirectionalStream.c():void");
    }

    public final boolean d() {
        return this.e != 0 && this.x == 0;
    }

    public final void e() {
        synchronized (this.c) {
            if (d()) {
                return;
            }
            if (this.f == 10) {
                if (this.e == 4) {
                    this.f = 7;
                    this.e = 7;
                    a(false);
                    try {
                        this.a.b(this, this.g);
                        return;
                    } catch (Exception e) {
                        bchu.c(CronetUrlRequestContext.a, "Exception in onSucceeded method", e);
                        return;
                    }
                }
            }
        }
    }

    private void onStreamReady(boolean z) {
        a(new bclj(this, z));
    }

    private void onResponseHeadersReceived(int i, String str, String[] strArr, long j) {
        try {
            int i2 = i;
            this.g = new bcoo(Arrays.asList(new String[]{this.j}), i2, "", a(strArr), false, str, null, j);
            a(new bcll(this));
        } catch (Exception unused) {
            b(new bclu("Cannot prepare ResponseInfo", null));
        }
    }

    private void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        this.g.a(j);
        if (byteBuffer.position() == i2 && byteBuffer.limit() == i3) {
            if (i >= 0) {
                i2 += i;
                if (i2 <= i3) {
                    byteBuffer.position(i2);
                    Runnable runnable = this.y;
                    runnable.a = byteBuffer;
                    runnable.b = i == 0;
                    a(runnable);
                    return;
                }
            }
            b(new bclu("Invalid number of bytes read", null));
            return;
        }
        b(new bclu("ByteBuffer modified externally during read", null));
    }

    /* JADX WARNING: Missing block: B:11:0x001b, code skipped:
            r1 = 0;
     */
    /* JADX WARNING: Missing block: B:12:0x001d, code skipped:
            r2 = r7.length;
     */
    /* JADX WARNING: Missing block: B:13:0x001e, code skipped:
            if (r1 >= r2) goto L_0x005a;
     */
    /* JADX WARNING: Missing block: B:14:0x0020, code skipped:
            r3 = r7[r1];
     */
    /* JADX WARNING: Missing block: B:15:0x0028, code skipped:
            if (r3.position() != r8[r1]) goto L_0x004f;
     */
    /* JADX WARNING: Missing block: B:17:0x0030, code skipped:
            if (r3.limit() == r9[r1]) goto L_0x0033;
     */
    /* JADX WARNING: Missing block: B:18:0x0033, code skipped:
            r3.position(r3.limit());
     */
    /* JADX WARNING: Missing block: B:19:0x003c, code skipped:
            if (r10 == false) goto L_0x0045;
     */
    /* JADX WARNING: Missing block: B:21:0x0040, code skipped:
            if (r1 == (r2 - 1)) goto L_0x0043;
     */
    /* JADX WARNING: Missing block: B:22:0x0043, code skipped:
            r2 = true;
     */
    /* JADX WARNING: Missing block: B:23:0x0045, code skipped:
            r2 = false;
     */
    /* JADX WARNING: Missing block: B:24:0x0046, code skipped:
            a(new defpackage.bclo(r6, r3, r2));
            r1 = r1 + 1;
     */
    /* JADX WARNING: Missing block: B:25:0x004f, code skipped:
            b(new defpackage.bclu("ByteBuffer modified externally during write", null));
     */
    /* JADX WARNING: Missing block: B:26:0x005a, code skipped:
            return;
     */
    private void onWritevCompleted(java.nio.ByteBuffer[] r7, int[] r8, int[] r9, boolean r10) {
        /*
        r6 = this;
        r0 = r6.c;
        monitor-enter(r0);
        r1 = r6.d();	 Catch:{ all -> 0x005b }
        if (r1 == 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r0);	 Catch:{ all -> 0x005b }
        return;
    L_0x000b:
        r1 = 8;
        r6.f = r1;	 Catch:{ all -> 0x005b }
        r1 = r6.u;	 Catch:{ all -> 0x005b }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x005b }
        if (r1 != 0) goto L_0x001a;
    L_0x0017:
        r6.f();	 Catch:{ all -> 0x005b }
    L_0x001a:
        monitor-exit(r0);	 Catch:{ all -> 0x005b }
        r0 = 0;
        r1 = 0;
    L_0x001d:
        r2 = r7.length;
        if (r1 >= r2) goto L_0x005a;
    L_0x0020:
        r3 = r7[r1];
        r4 = r3.position();
        r5 = r8[r1];
        if (r4 != r5) goto L_0x004f;
    L_0x002a:
        r4 = r3.limit();
        r5 = r9[r1];
        if (r4 == r5) goto L_0x0033;
    L_0x0032:
        goto L_0x004f;
    L_0x0033:
        r4 = r3.limit();
        r3.position(r4);
        r4 = new bclo;
        if (r10 == 0) goto L_0x0045;
    L_0x003e:
        r2 = r2 + -1;
        if (r1 == r2) goto L_0x0043;
    L_0x0042:
        goto L_0x0045;
    L_0x0043:
        r2 = 1;
        goto L_0x0046;
    L_0x0045:
        r2 = 0;
    L_0x0046:
        r4.<init>(r6, r3, r2);
        r6.a(r4);
        r1 = r1 + 1;
        goto L_0x001d;
    L_0x004f:
        r7 = new bclu;
        r8 = 0;
        r9 = "ByteBuffer modified externally during write";
        r7.<init>(r9, r8);
        r6.b(r7);
    L_0x005a:
        return;
    L_0x005b:
        r7 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x005b }
        goto L_0x005f;
    L_0x005e:
        throw r7;
    L_0x005f:
        goto L_0x005e;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetBidirectionalStream.onWritevCompleted(java.nio.ByteBuffer[], int[], int[], boolean):void");
    }

    private void onResponseTrailersReceived(String[] strArr) {
        a(new bclk(this, new bcor(a(strArr))));
    }

    private void onError(int i, int i2, int i3, String str, long j) {
        bcoo bcoo = this.g;
        if (bcoo != null) {
            bcoo.a(j);
        }
        String str2 = "Exception in BidirectionalStream: ";
        if (i == 10 || i == 3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(str);
            b(new bcok(stringBuilder.toString(), i, i2, i3));
            return;
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str2);
        stringBuilder2.append(str);
        b(new bcli(stringBuilder2.toString(), i, i2));
    }

    private void onCanceled() {
        a(new bcln(this));
    }

    private void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15) {
        synchronized (this.c) {
            if (this.w == null) {
                this.w = new bclv(j, j8, j12, j13, z, j14, j15);
                int i = this.e;
                i = i != 7 ? i == 5 ? 2 : 1 : 0;
                this.h.a(new bcon(this.j, this.n, this.w, i, this.g, this.s));
            } else {
                throw new IllegalStateException("Metrics collection should only happen once.");
            }
        }
    }

    public static boolean a(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    private static ArrayList a(String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length >> 1);
        for (int i = 0; i < strArr.length; i += 2) {
            arrayList.add(new SimpleImmutableEntry(strArr[i], strArr[i + 1]));
        }
        return arrayList;
    }

    private final void a(Runnable runnable) {
        try {
            this.i.execute(runnable);
        } catch (RejectedExecutionException e) {
            bchu.c(CronetUrlRequestContext.a, "Exception posting task to executor", e);
            synchronized (this.c) {
                this.f = 6;
                this.e = 6;
                a(false);
            }
        }
    }

    private final void a(boolean z) {
        String str = CronetUrlRequestContext.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("destroyNativeStreamLocked ");
        stringBuilder.append(toString());
        bchu.a(str, stringBuilder.toString(), new Object[0]);
        long j = this.x;
        if (j != 0) {
            nativeDestroy(j, z);
            this.h.e();
            this.x = 0;
        }
    }

    public final void a(bcjd bcjd) {
        this.s = bcjd;
        synchronized (this.c) {
            if (d()) {
                return;
            }
            this.f = 6;
            this.e = 6;
            a(false);
            try {
                this.a.a((bciw) this, this.g, bcjd);
            } catch (Exception e) {
                bchu.c(CronetUrlRequestContext.a, "Exception notifying of failed request", e);
            }
        }
    }

    public final void a(Exception exception) {
        bcjd bclh = new bclh("CalledByNative method has thrown an exception", exception);
        bchu.c(CronetUrlRequestContext.a, "Exception in CalledByNative method", exception);
        a(bclh);
    }

    private final void b(bcjd bcjd) {
        a(new bclm(this, bcjd));
    }
}
