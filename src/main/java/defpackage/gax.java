package defpackage;

import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: gax */
public final class gax {
    public final Map a = new HashMap();
    public final WeakHashMap b = new WeakHashMap();

    /* JADX WARNING: Missing block: B:21:0x0065, code skipped:
            if (r4 != null) goto L_0x0067;
     */
    public final void a(int r6, defpackage.apxu r7, boolean r8) {
        /*
        r5 = this;
        defpackage.amqw.a(r7);
        r0 = com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint;
        r0 = defpackage.anxl.checkIsLite(r0);
        r7.a(r0);
        r1 = r7.h;
        r0 = r0.d;
        r0 = r1.a(r0);
        if (r0 == 0) goto L_0x0073;
    L_0x0016:
        r0 = com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint;
        r0 = defpackage.anxl.checkIsLite(r0);
        r7.a(r0);
        r7 = r7.h;
        r1 = r0.d;
        r7 = r7.b(r1);
        if (r7 != 0) goto L_0x002c;
    L_0x0029:
        r7 = r0.b;
        goto L_0x0030;
    L_0x002c:
        r7 = r0.a(r7);
    L_0x0030:
        r7 = (com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint) r7;
        r0 = r5.a;
        monitor-enter(r0);
        r1 = r5.a;	 Catch:{ all -> 0x0070 }
        r2 = r7.c;	 Catch:{ all -> 0x0070 }
        r1 = r1.get(r2);	 Catch:{ all -> 0x0070 }
        r1 = (defpackage.gaw) r1;	 Catch:{ all -> 0x0070 }
        if (r1 != 0) goto L_0x004d;
    L_0x0041:
        r1 = new gaw;	 Catch:{ all -> 0x0070 }
        r1.<init>();	 Catch:{ all -> 0x0070 }
        r2 = r5.a;	 Catch:{ all -> 0x0070 }
        r3 = r7.c;	 Catch:{ all -> 0x0070 }
        r2.put(r3, r1);	 Catch:{ all -> 0x0070 }
    L_0x004d:
        r2 = r7.hashCode();	 Catch:{ all -> 0x0070 }
        r3 = r1.a;	 Catch:{ all -> 0x0070 }
        r3 = r3.get(r6);	 Catch:{ all -> 0x0070 }
        r4 = 0;
        if (r3 != 0) goto L_0x005b;
    L_0x005a:
        goto L_0x005e;
    L_0x005b:
        if (r3 == r2) goto L_0x005e;
    L_0x005d:
        r4 = 1;
    L_0x005e:
        if (r4 == 0) goto L_0x0062;
    L_0x0060:
        r1.b = r7;	 Catch:{ all -> 0x0070 }
    L_0x0062:
        if (r3 != 0) goto L_0x0065;
    L_0x0064:
        goto L_0x0067;
    L_0x0065:
        if (r4 == 0) goto L_0x006e;
    L_0x0067:
        r7 = r1.a;	 Catch:{ all -> 0x0070 }
        r7.put(r6, r2);	 Catch:{ all -> 0x0070 }
        r1.c = r8;	 Catch:{ all -> 0x0070 }
    L_0x006e:
        monitor-exit(r0);	 Catch:{ all -> 0x0070 }
        return;
    L_0x0070:
        r6 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0070 }
        throw r6;
    L_0x0073:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gax.a(int, apxu, boolean):void");
    }

    public final void a(apxu apxu) {
        amqw.a((Object) apxu);
        anxr access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) b;
            synchronized (this.a) {
                gaw gaw = (gaw) this.a.get(reelWatchEndpointOuterClass$ReelWatchEndpoint.c);
                if (gaw == null) {
                    gaw = new gaw();
                    this.a.put(reelWatchEndpointOuterClass$ReelWatchEndpoint.c, gaw);
                }
                gaw.b = reelWatchEndpointOuterClass$ReelWatchEndpoint;
            }
        }
    }

    public final void b(apxu apxu) {
        amqw.a((Object) apxu);
        anxr access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) b;
            synchronized (this.a) {
                gaw gaw = (gaw) this.a.get(reelWatchEndpointOuterClass$ReelWatchEndpoint.c);
                if (gaw == null) {
                    gaw = new gaw();
                    this.a.put(reelWatchEndpointOuterClass$ReelWatchEndpoint.c, gaw);
                }
                gaw.b = reelWatchEndpointOuterClass$ReelWatchEndpoint;
                gaw.c = true;
            }
        }
    }

    public final apxu c(apxu apxu) {
        amqw.a((Object) apxu);
        anxr access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        apxu.a(access$000);
        if (!apxu.h.a(access$000.d)) {
            return apxu;
        }
        Object obj;
        access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) obj;
        ReelWatchEndpointOuterClass$ReelWatchEndpoint a = a(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        if (a == reelWatchEndpointOuterClass$ReelWatchEndpoint) {
            return apxu;
        }
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint, a);
        if ((apxu.a & 1) != 0) {
            apxx.a(apxu.b);
        }
        anxr access$0002 = anxl.checkIsLite(avjd.b);
        apxu.a(access$0002);
        if (apxu.h.a(access$0002.d)) {
            access$0002 = anxl.checkIsLite(avjd.b);
            apxu.a(access$0002);
            Object b2 = apxu.h.b(access$0002.d);
            if (b2 == null) {
                b2 = access$0002.b;
            } else {
                b2 = access$0002.a(b2);
            }
            apxx.a(avjd.b, (avjf) b2);
        }
        return (apxu) ((anxl) apxx.build());
    }

    public final ReelWatchEndpointOuterClass$ReelWatchEndpoint a(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        gaw gaw;
        synchronized (this.a) {
            gaw = (gaw) this.a.get(reelWatchEndpointOuterClass$ReelWatchEndpoint.c);
        }
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint2 = gaw == null ? null : gaw.b;
        if (!(reelWatchEndpointOuterClass$ReelWatchEndpoint2 == null || !reelWatchEndpointOuterClass$ReelWatchEndpoint2.e.isEmpty() || (reelWatchEndpointOuterClass$ReelWatchEndpoint.a & 8) == 0)) {
            awyu awyu = (awyu) ((anxo) reelWatchEndpointOuterClass$ReelWatchEndpoint2.toBuilder());
            String str = reelWatchEndpointOuterClass$ReelWatchEndpoint.e;
            awyu.copyOnWrite();
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint3 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) awyu.instance;
            if (str != null) {
                reelWatchEndpointOuterClass$ReelWatchEndpoint3.a |= 8;
                reelWatchEndpointOuterClass$ReelWatchEndpoint3.e = str;
                reelWatchEndpointOuterClass$ReelWatchEndpoint2 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) ((anxl) awyu.build());
                synchronized (this.a) {
                    gaw.b = reelWatchEndpointOuterClass$ReelWatchEndpoint2;
                    this.a.put(reelWatchEndpointOuterClass$ReelWatchEndpoint.c, gaw);
                }
            } else {
                throw new NullPointerException();
            }
        }
        return reelWatchEndpointOuterClass$ReelWatchEndpoint2 != null ? reelWatchEndpointOuterClass$ReelWatchEndpoint2 : reelWatchEndpointOuterClass$ReelWatchEndpoint;
    }

    public final boolean d(apxu apxu) {
        amqw.a((Object) apxu);
        anxr access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        apxu.a(access$000);
        boolean z = false;
        if (!apxu.h.a(access$000.d)) {
            return false;
        }
        access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) b;
        synchronized (this.a) {
            gaw gaw = (gaw) this.a.get(reelWatchEndpointOuterClass$ReelWatchEndpoint.c);
            if (gaw != null) {
                if (gaw.c) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void a(Object obj, Runnable runnable) {
        this.b.put(obj, runnable);
    }
}
