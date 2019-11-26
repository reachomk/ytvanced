package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;

/* renamed from: alvo */
public final class alvo extends alvp {
    private final bcaa a;
    private final xsc b;
    private final xci c;
    private final xhv d;
    private final xry e;
    private final PowerManager f;
    private final Object g = new Object();
    private final Object h = new Object();
    private final alvs i = new alvt();
    private aoqx j;
    private alvs k = this.i;
    private alvq l;
    private alvr m;
    private boolean n;
    private long o;
    private final bcaa p;

    public alvo(Context context, bcaa bcaa, xsc xsc, xci xci, xhv xhv, xry xry, bcaa bcaa2) {
        this.a = bcaa;
        this.b = xsc;
        this.c = xci;
        this.d = xhv;
        this.e = xry;
        this.p = bcaa2;
        if (VERSION.SDK_INT >= 21) {
            this.f = (PowerManager) context.getSystemService("power");
        } else {
            this.f = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARNING: Missing block: B:47:0x0090, code skipped:
            return;
     */
    public final void a(defpackage.aydm r6) {
        /*
        r5 = this;
        r0 = r5.h;
        monitor-enter(r0);
        r1 = r5.i;	 Catch:{ all -> 0x0095 }
        r5.k = r1;	 Catch:{ all -> 0x0095 }
        r1 = 0;
        if (r6 != 0) goto L_0x000c;
    L_0x000a:
        goto L_0x0091;
    L_0x000c:
        r2 = r6.a;	 Catch:{ all -> 0x0095 }
        r2 = r2 & 512;
        if (r2 == 0) goto L_0x0091;
    L_0x0012:
        r2 = r6.g;	 Catch:{ all -> 0x0095 }
        if (r2 != 0) goto L_0x0018;
    L_0x0016:
        r2 = defpackage.ayda.e;	 Catch:{ all -> 0x0095 }
    L_0x0018:
        r2 = r2.b;	 Catch:{ all -> 0x0095 }
        if (r2 == 0) goto L_0x0091;
    L_0x001c:
        r2 = r5.p;	 Catch:{ all -> 0x0095 }
        r2 = r2.get();	 Catch:{ all -> 0x0095 }
        r2 = (defpackage.alxv) r2;	 Catch:{ all -> 0x0095 }
        r3 = r6.g;	 Catch:{ all -> 0x0095 }
        if (r3 != 0) goto L_0x002a;
    L_0x0028:
        r3 = defpackage.ayda.e;	 Catch:{ all -> 0x0095 }
    L_0x002a:
        r3 = r3.c;	 Catch:{ all -> 0x0095 }
        r4 = "batteryCapturerSamplingCounter";
        r2 = r2.a(r3, r4);	 Catch:{ all -> 0x0095 }
        if (r2 == 0) goto L_0x0091;
    L_0x0034:
        r2 = 1;
        r5.n = r2;	 Catch:{ all -> 0x0095 }
        r2 = new alvq;	 Catch:{ all -> 0x0095 }
        r2.<init>(r1);	 Catch:{ all -> 0x0095 }
        r5.l = r2;	 Catch:{ all -> 0x0095 }
        r1 = r6.g;	 Catch:{ all -> 0x0095 }
        if (r1 != 0) goto L_0x0044;
    L_0x0042:
        r1 = defpackage.ayda.e;	 Catch:{ all -> 0x0095 }
    L_0x0044:
        r1 = r1.a;	 Catch:{ all -> 0x0095 }
        r1 = r1 & 4;
        if (r1 == 0) goto L_0x0073;
    L_0x004a:
        r1 = r6.g;	 Catch:{ all -> 0x0095 }
        if (r1 != 0) goto L_0x0050;
    L_0x004e:
        r1 = defpackage.ayda.e;	 Catch:{ all -> 0x0095 }
    L_0x0050:
        r1 = r1.d;	 Catch:{ all -> 0x0095 }
        if (r1 != 0) goto L_0x0056;
    L_0x0054:
        r1 = defpackage.aycy.e;	 Catch:{ all -> 0x0095 }
    L_0x0056:
        r1 = r1.b;	 Catch:{ all -> 0x0095 }
        if (r1 != 0) goto L_0x005b;
    L_0x005a:
        goto L_0x0073;
    L_0x005b:
        r1 = new alvr;	 Catch:{ all -> 0x0095 }
        r2 = r5.a;	 Catch:{ all -> 0x0095 }
        r6 = r6.g;	 Catch:{ all -> 0x0095 }
        if (r6 != 0) goto L_0x0065;
    L_0x0063:
        r6 = defpackage.ayda.e;	 Catch:{ all -> 0x0095 }
    L_0x0065:
        r6 = r6.d;	 Catch:{ all -> 0x0095 }
        if (r6 != 0) goto L_0x006b;
    L_0x0069:
        r6 = defpackage.aycy.e;	 Catch:{ all -> 0x0095 }
    L_0x006b:
        r3 = r5.b;	 Catch:{ all -> 0x0095 }
        r1.<init>(r2, r6, r3);	 Catch:{ all -> 0x0095 }
        r5.m = r1;	 Catch:{ all -> 0x0095 }
        goto L_0x0076;
    L_0x0073:
        r6 = 0;
        r5.m = r6;	 Catch:{ all -> 0x0095 }
    L_0x0076:
        r6 = r5.a;	 Catch:{ all -> 0x0095 }
        r6 = r6.get();	 Catch:{ all -> 0x0095 }
        r6 = (defpackage.alwe) r6;	 Catch:{ all -> 0x0095 }
        r6 = r6.b();	 Catch:{ all -> 0x0095 }
        if (r6 == 0) goto L_0x0089;
    L_0x0084:
        r6 = r5.l;	 Catch:{ all -> 0x0095 }
        r5.k = r6;	 Catch:{ all -> 0x0095 }
        goto L_0x008f;
    L_0x0089:
        r6 = r5.m;	 Catch:{ all -> 0x0095 }
        if (r6 == 0) goto L_0x008f;
    L_0x008d:
        r5.k = r6;	 Catch:{ all -> 0x0095 }
    L_0x008f:
        monitor-exit(r0);	 Catch:{ all -> 0x0095 }
        return;
    L_0x0091:
        r5.n = r1;	 Catch:{ all -> 0x0095 }
        monitor-exit(r0);	 Catch:{ all -> 0x0095 }
        return;
    L_0x0095:
        r6 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0095 }
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alvo.a(aydm):void");
    }

    public final boolean a() {
        return this.n;
    }

    public final boolean a(Context context, aycm aycm) {
        boolean z = false;
        if (!f()) {
            return false;
        }
        long b = this.b.b();
        aoqx a = a(context, e());
        synchronized (this.g) {
            aoqx aoqx = this.j;
            if (aoqx != null) {
                aoqy aoqy = (aoqy) aoqv.e.createBuilder();
                aoqy.copyOnWrite();
                aoqv aoqv = (aoqv) aoqy.instance;
                aoqv.c = aoqx;
                aoqv.a |= 2;
                aoqy.copyOnWrite();
                aoqv aoqv2 = (aoqv) aoqy.instance;
                if (a != null) {
                    aoqv2.d = a;
                    aoqv2.a |= 4;
                    long j = b - this.o;
                    aoqy.copyOnWrite();
                    aoqv2 = (aoqv) aoqy.instance;
                    aoqv2.a |= 1;
                    aoqv2.b = j;
                    aycm.copyOnWrite();
                    aycn aycn = (aycn) aycm.instance;
                    aycn.h = (aoqv) ((anxl) aoqy.build());
                    aycn.a |= 256;
                    z = true;
                } else {
                    throw new NullPointerException();
                }
            }
            this.j = a;
            this.o = b;
        }
        return z;
    }

    private final float e() {
        float a = this.e.a();
        return a != -1.0f ? a * 1000000.0f : -1.0f;
    }

    private final aoqx a(Context context, float f) {
        aora aora = (aora) aoqx.h.createBuilder();
        aora.copyOnWrite();
        aoqx aoqx = (aoqx) aora.instance;
        aoqx.a |= 1;
        aoqx.b = (int) f;
        int i = ((alwe) this.a.get()).p;
        aora.copyOnWrite();
        aoqx = (aoqx) aora.instance;
        if (i != 0) {
            aoqx.a |= 32;
            aoqx.g = i - 1;
            i = this.d.m();
            aora.copyOnWrite();
            aoqx = (aoqx) aora.instance;
            if (i != 0) {
                aoqx.a |= 2;
                aoqx.c = i - 1;
                i = 3;
                try {
                    int i2 = System.getInt(context.getContentResolver(), "screen_brightness");
                    int i3 = System.getInt(context.getContentResolver(), "screen_brightness_mode");
                    aora.a(i2);
                    aora.b(i3 == 1 ? 2 : 3);
                } catch (SettingNotFoundException unused) {
                    aora.a(-1);
                    aora.b(1);
                }
                PowerManager powerManager = this.f;
                if (powerManager != null) {
                    if (powerManager.isPowerSaveMode()) {
                        i = 2;
                    }
                    aora.c(i);
                } else {
                    aora.c(1);
                }
                return (aoqx) ((anxl) aora.build());
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    public final void b() {
        synchronized (this.h) {
            alvq alvq = this.l;
            if (alvq != null) {
                this.k = alvq;
            } else {
                this.k = this.i;
            }
        }
        g();
    }

    public final void c() {
        synchronized (this.h) {
            alvr alvr = this.m;
            if (alvr == null) {
                this.k = this.i;
            } else {
                alvr.b = alvr.a.b();
                this.k = this.m;
            }
        }
        g();
    }

    public final void d() {
        if (f()) {
            this.c.d(new alwj());
        }
    }

    /* JADX WARNING: Missing block: B:12:0x0022, code skipped:
            if (((defpackage.alwe) r6.a.get()).o != 2) goto L_0x0059;
     */
    /* JADX WARNING: Missing block: B:13:0x0024, code skipped:
            r0 = e();
     */
    /* JADX WARNING: Missing block: B:14:0x002c, code skipped:
            if (r0 != -1.0f) goto L_0x0032;
     */
    /* JADX WARNING: Missing block: B:15:0x002e, code skipped:
            g();
     */
    /* JADX WARNING: Missing block: B:16:0x0031, code skipped:
            return false;
     */
    /* JADX WARNING: Missing block: B:17:0x0032, code skipped:
            r2 = r6.g;
     */
    /* JADX WARNING: Missing block: B:18:0x0034, code skipped:
            monitor-enter(r2);
     */
    /* JADX WARNING: Missing block: B:20:?, code skipped:
            r3 = r6.j;
     */
    /* JADX WARNING: Missing block: B:21:0x0038, code skipped:
            if (r3 != null) goto L_0x003c;
     */
    /* JADX WARNING: Missing block: B:22:0x003a, code skipped:
            monitor-exit(r2);
     */
    /* JADX WARNING: Missing block: B:23:0x003b, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:24:0x003c, code skipped:
            r3 = ((float) r3.b) - r0;
            r0 = r6.h;
     */
    /* JADX WARNING: Missing block: B:25:0x0042, code skipped:
            monitor-enter(r0);
     */
    /* JADX WARNING: Missing block: B:27:?, code skipped:
            r5 = r6.k.b();
     */
    /* JADX WARNING: Missing block: B:28:0x0049, code skipped:
            monitor-exit(r0);
     */
    /* JADX WARNING: Missing block: B:30:0x004d, code skipped:
            if (r3 < ((float) r5)) goto L_0x0051;
     */
    /* JADX WARNING: Missing block: B:32:?, code skipped:
            monitor-exit(r2);
     */
    /* JADX WARNING: Missing block: B:33:0x0050, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:34:0x0051, code skipped:
            monitor-exit(r2);
     */
    /* JADX WARNING: Missing block: B:35:0x0052, code skipped:
            return false;
     */
    /* JADX WARNING: Missing block: B:44:0x0059, code skipped:
            g();
     */
    /* JADX WARNING: Missing block: B:45:0x005c, code skipped:
            return false;
     */
    private final boolean f() {
        /*
        r6 = this;
        r0 = r6.n;
        r1 = 0;
        if (r0 == 0) goto L_0x0060;
    L_0x0005:
        r0 = r6.h;
        monitor-enter(r0);
        r2 = r6.k;	 Catch:{ all -> 0x005d }
        r2 = r2.a();	 Catch:{ all -> 0x005d }
        if (r2 != 0) goto L_0x0016;
    L_0x0010:
        r2 = r6.i;	 Catch:{ all -> 0x005d }
        r6.k = r2;	 Catch:{ all -> 0x005d }
        monitor-exit(r0);	 Catch:{ all -> 0x005d }
        return r1;
    L_0x0016:
        monitor-exit(r0);	 Catch:{ all -> 0x005d }
        r0 = r6.a;
        r0 = r0.get();
        r0 = (defpackage.alwe) r0;
        r0 = r0.o;
        r2 = 2;
        if (r0 != r2) goto L_0x0059;
    L_0x0024:
        r0 = r6.e();
        r2 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x0032;
    L_0x002e:
        r6.g();
        return r1;
    L_0x0032:
        r2 = r6.g;
        monitor-enter(r2);
        r3 = r6.j;	 Catch:{ all -> 0x0056 }
        r4 = 1;
        if (r3 != 0) goto L_0x003c;
    L_0x003a:
        monitor-exit(r2);	 Catch:{ all -> 0x0056 }
        return r4;
    L_0x003c:
        r3 = r3.b;	 Catch:{ all -> 0x0056 }
        r3 = (float) r3;	 Catch:{ all -> 0x0056 }
        r3 = r3 - r0;
        r0 = r6.h;	 Catch:{ all -> 0x0056 }
        monitor-enter(r0);	 Catch:{ all -> 0x0056 }
        r5 = r6.k;	 Catch:{ all -> 0x0053 }
        r5 = r5.b();	 Catch:{ all -> 0x0053 }
        monitor-exit(r0);	 Catch:{ all -> 0x0053 }
        r0 = (float) r5;
        r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x0051;
    L_0x004f:
        monitor-exit(r2);	 Catch:{ all -> 0x0056 }
        return r4;
    L_0x0051:
        monitor-exit(r2);	 Catch:{ all -> 0x0056 }
        return r1;
    L_0x0053:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0053 }
        throw r1;	 Catch:{ all -> 0x0056 }
    L_0x0056:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0056 }
        throw r0;
    L_0x0059:
        r6.g();
        return r1;
    L_0x005d:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x005d }
        throw r1;
    L_0x0060:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alvo.f():boolean");
    }

    private final void g() {
        synchronized (this.g) {
            this.j = null;
        }
    }
}
