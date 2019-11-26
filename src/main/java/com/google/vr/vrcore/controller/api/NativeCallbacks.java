package com.google.vr.vrcore.controller.api;

import com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks;
import defpackage.baib;
import defpackage.baif;
import defpackage.baig;
import defpackage.baik;
import defpackage.baio;
import defpackage.bajc;

public final class NativeCallbacks implements Callbacks {
    private final long a;
    private boolean b;

    public NativeCallbacks(long j) {
        this.a = j;
    }

    private final native void handleAccelEvent(long j, int i, long j2, float f, float f2, float f3);

    private final native void handleBatteryEvent(long j, int i, long j2, boolean z, int i2);

    private final native void handleButtonEvent(long j, int i, long j2, int i2, boolean z);

    private final native void handleControllerRecentered(long j, int i, long j2, float f, float f2, float f3, float f4);

    private final native void handleGyroEvent(long j, int i, long j2, float f, float f2, float f3);

    private final native void handleOrientationEvent(long j, int i, long j2, float f, float f2, float f3, float f4);

    private final native void handlePositionEvent(long j, int i, long j2, float f, float f2, float f3);

    private final native void handleServiceConnected(long j, int i);

    private final native void handleServiceDisconnected(long j);

    private final native void handleServiceFailed(long j);

    private final native void handleServiceInitFailed(long j, int i);

    private final native void handleServiceUnavailable(long j);

    private final native void handleStateChanged(long j, int i, int i2);

    private final native void handleTouchEvent(long j, int i, long j2, int i2, float f, float f2);

    private final native void handleTrackingStatusEvent(long j, int i, long j2, int i2);

    public final synchronized void close() {
        this.b = true;
    }

    public final synchronized void onControllerStateChanged(int i, int i2) {
        if (!this.b) {
            handleStateChanged(this.a, i, i2);
        }
    }

    public final synchronized void onControllerEventPacket(baig baig) {
        if (!this.b) {
            a(baig);
        }
    }

    /* JADX WARNING: Missing block: B:23:0x0050, code skipped:
            return;
     */
    public final synchronized void onControllerEventPacket2(defpackage.baii r13) {
        /*
        r12 = this;
        monitor-enter(r12);
        r0 = r12.b;	 Catch:{ all -> 0x006e }
        if (r0 != 0) goto L_0x006c;
    L_0x0005:
        r12.a(r13);	 Catch:{ all -> 0x006e }
        r0 = 0;
        r1 = 0;
    L_0x000a:
        r2 = r12.b;	 Catch:{ all -> 0x006e }
        if (r2 != 0) goto L_0x0032;
    L_0x000e:
        r2 = r13.n;	 Catch:{ all -> 0x006e }
        if (r1 < r2) goto L_0x0013;
    L_0x0012:
        goto L_0x0032;
    L_0x0013:
        if (r1 >= r2) goto L_0x002c;
    L_0x0015:
        r2 = r13.o;	 Catch:{ all -> 0x006e }
        r2 = r2[r1];	 Catch:{ all -> 0x006e }
        r4 = r12.a;	 Catch:{ all -> 0x006e }
        r6 = r2.e;	 Catch:{ all -> 0x006e }
        r7 = r2.d;	 Catch:{ all -> 0x006e }
        r9 = r2.a;	 Catch:{ all -> 0x006e }
        r10 = r2.b;	 Catch:{ all -> 0x006e }
        r11 = r2.c;	 Catch:{ all -> 0x006e }
        r3 = r12;
        r3.handlePositionEvent(r4, r6, r7, r9, r10, r11);	 Catch:{ all -> 0x006e }
        r1 = r1 + 1;
        goto L_0x000a;
    L_0x002c:
        r13 = new java.lang.IndexOutOfBoundsException;	 Catch:{ all -> 0x006e }
        r13.<init>();	 Catch:{ all -> 0x006e }
        throw r13;	 Catch:{ all -> 0x006e }
    L_0x0032:
        r1 = r12.b;	 Catch:{ all -> 0x006e }
        if (r1 == 0) goto L_0x0037;
    L_0x0036:
        goto L_0x004f;
    L_0x0037:
        r1 = r13.s;	 Catch:{ all -> 0x006e }
        if (r0 < r1) goto L_0x0051;
    L_0x003b:
        r0 = r13.p;	 Catch:{ all -> 0x006e }
        if (r0 == 0) goto L_0x004f;
    L_0x003f:
        r13 = r13.q;	 Catch:{ all -> 0x006e }
        r1 = r12.a;	 Catch:{ all -> 0x006e }
        r3 = r13.e;	 Catch:{ all -> 0x006e }
        r4 = r13.d;	 Catch:{ all -> 0x006e }
        r6 = r13.b;	 Catch:{ all -> 0x006e }
        r7 = r13.a;	 Catch:{ all -> 0x006e }
        r0 = r12;
        r0.handleBatteryEvent(r1, r3, r4, r6, r7);	 Catch:{ all -> 0x006e }
    L_0x004f:
        monitor-exit(r12);
        return;
    L_0x0051:
        if (r0 >= r1) goto L_0x0066;
    L_0x0053:
        r1 = r13.t;	 Catch:{ all -> 0x006e }
        r1 = r1[r0];	 Catch:{ all -> 0x006e }
        r3 = r12.a;	 Catch:{ all -> 0x006e }
        r5 = r1.e;	 Catch:{ all -> 0x006e }
        r6 = r1.d;	 Catch:{ all -> 0x006e }
        r8 = r1.a;	 Catch:{ all -> 0x006e }
        r2 = r12;
        r2.handleTrackingStatusEvent(r3, r5, r6, r8);	 Catch:{ all -> 0x006e }
        r0 = r0 + 1;
        goto L_0x0032;
    L_0x0066:
        r13 = new java.lang.IndexOutOfBoundsException;	 Catch:{ all -> 0x006e }
        r13.<init>();	 Catch:{ all -> 0x006e }
        throw r13;	 Catch:{ all -> 0x006e }
    L_0x006c:
        monitor-exit(r12);
        return;
    L_0x006e:
        r13 = move-exception;
        monitor-exit(r12);
        goto L_0x0072;
    L_0x0071:
        throw r13;
    L_0x0072:
        goto L_0x0071;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.vr.vrcore.controller.api.NativeCallbacks.onControllerEventPacket2(baii):void");
    }

    private final void a(baig baig) {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (!this.b) {
            i = baig.c;
            if (i3 >= i) {
                break;
            } else if (i3 < i) {
                baib baib = baig.d[i3];
                handleAccelEvent(this.a, baib.e, baib.d, baib.a, baib.b, baib.c);
                i3++;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        i3 = 0;
        while (!this.b && i3 < baig.e) {
            baif b = baig.b(i3);
            handleButtonEvent(this.a, b.e, b.d, b.a, b.b);
            i3++;
        }
        i3 = 0;
        while (!this.b) {
            i = baig.f;
            if (i3 >= i) {
                break;
            } else if (i3 < i) {
                baik baik = baig.g[i3];
                handleGyroEvent(this.a, baik.e, baik.d, baik.a, baik.b, baik.c);
                i3++;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        i3 = 0;
        while (!this.b) {
            i = baig.h;
            if (i3 >= i) {
                break;
            } else if (i3 < i) {
                baio baio = baig.i[i3];
                handleOrientationEvent(this.a, baio.e, baio.d, baio.a, baio.b, baio.c, baio.f);
                i3++;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        while (!this.b) {
            i3 = baig.j;
            if (i2 >= i3) {
                return;
            }
            if (i2 < i3) {
                bajc bajc = baig.k[i2];
                handleTouchEvent(this.a, bajc.e, bajc.d, bajc.a, bajc.b, bajc.c);
                i2++;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    public final synchronized void onControllerRecentered(baio baio) {
        if (!this.b) {
            handleControllerRecentered(this.a, baio.e, baio.d, baio.a, baio.b, baio.c, baio.f);
        }
    }

    public final synchronized void onServiceConnected(int i) {
        if (!this.b) {
            handleServiceConnected(this.a, 1);
        }
    }

    public final synchronized void onServiceDisconnected() {
        if (!this.b) {
            handleServiceDisconnected(this.a);
        }
    }

    public final synchronized void onServiceFailed() {
        if (!this.b) {
            handleServiceFailed(this.a);
        }
    }

    public final synchronized void onServiceUnavailable() {
        if (!this.b) {
            handleServiceUnavailable(this.a);
        }
    }

    public final synchronized void onServiceInitFailed(int i) {
        if (!this.b) {
            handleServiceInitFailed(this.a, i);
        }
    }
}
