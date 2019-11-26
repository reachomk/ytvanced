package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: adsc */
public final class adsc implements adef {
    public static final String a = xtl.b("MDX.FeedbackFiller");
    private static final long b = TimeUnit.HOURS.toMillis(2);
    private final adqf c;
    private final xsc d;
    private final aebd e;
    private final xhv f;
    private final bcaa g;
    private final Object h;
    private Map i;
    private long j;
    private final adqi k = new adsb(this);

    public adsc(adqf adqf, xsc xsc, aebd aebd, xhv xhv, bcaa bcaa) {
        this.d = xsc;
        this.c = adqf;
        this.h = new Object();
        this.e = aebd;
        this.f = xhv;
        this.g = bcaa;
        this.i = new HashMap();
    }

    public final void a() {
        adqe c = this.c.c();
        if (c != null) {
            a(c);
        }
        this.c.a(this.k);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Missing block: B:7:0x0028, code skipped:
            if ((r8.d.a() - r8.j) >= b) goto L_0x002a;
     */
    public final void a(android.os.Bundle r9, defpackage.adei r10) {
        /*
        r8 = this;
        defpackage.xak.a();
        r0 = new java.util.HashMap;
        r0.<init>();
        r1 = r8.c;
        r1 = r1.c();
        r2 = r8.h;
        monitor-enter(r2);
        if (r1 != 0) goto L_0x002a;
    L_0x0013:
        r3 = r8.i;	 Catch:{ all -> 0x00f1 }
        r3 = r3.isEmpty();	 Catch:{ all -> 0x00f1 }
        if (r3 != 0) goto L_0x002f;
    L_0x001b:
        r3 = r8.d;	 Catch:{ all -> 0x00f1 }
        r3 = r3.a();	 Catch:{ all -> 0x00f1 }
        r5 = r8.j;	 Catch:{ all -> 0x00f1 }
        r3 = r3 - r5;
        r5 = b;	 Catch:{ all -> 0x00f1 }
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 < 0) goto L_0x002f;
    L_0x002a:
        r3 = r8.i;	 Catch:{ all -> 0x00f1 }
        r3.clear();	 Catch:{ all -> 0x00f1 }
    L_0x002f:
        r3 = r8.i;	 Catch:{ all -> 0x00f1 }
        r3 = r3.isEmpty();	 Catch:{ all -> 0x00f1 }
        if (r3 != 0) goto L_0x0054;
    L_0x0037:
        r3 = r8.i;	 Catch:{ all -> 0x00f1 }
        r0.putAll(r3);	 Catch:{ all -> 0x00f1 }
        r3 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x00f1 }
        r4 = r8.d;	 Catch:{ all -> 0x00f1 }
        r4 = r4.a();	 Catch:{ all -> 0x00f1 }
        r6 = r8.j;	 Catch:{ all -> 0x00f1 }
        r4 = r4 - r6;
        r3 = r3.toSeconds(r4);	 Catch:{ all -> 0x00f1 }
        r5 = "mdx_seconds_since_session_cached";
        r3 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x00f1 }
        r0.put(r5, r3);	 Catch:{ all -> 0x00f1 }
    L_0x0054:
        monitor-exit(r2);	 Catch:{ all -> 0x00f1 }
        if (r1 == 0) goto L_0x005a;
    L_0x0057:
        defpackage.adsc.a(r0, r1);
    L_0x005a:
        r2 = defpackage.adiu.t();
        r3 = r8.e;
        r3.a(r2);
        r2 = r2.a();
        r2 = r2.r();
        r3 = 1;
        if (r2 == r3) goto L_0x0083;
    L_0x006e:
        r3 = 2;
        if (r2 == r3) goto L_0x0080;
    L_0x0071:
        r3 = 3;
        if (r2 == r3) goto L_0x007d;
    L_0x0074:
        r3 = 4;
        if (r2 == r3) goto L_0x007a;
    L_0x0077:
        r2 = "unknown";
        goto L_0x0085;
    L_0x007a:
        r2 = "frequent";
        goto L_0x0085;
    L_0x007d:
        r2 = "sometimes";
        goto L_0x0085;
    L_0x0080:
        r2 = "seldom";
        goto L_0x0085;
    L_0x0083:
        r2 = "never";
    L_0x0085:
        r3 = "mdx_caster_category";
        r0.put(r3, r2);
        r2 = r8.f;
        r2 = r2.b();
        if (r2 == 0) goto L_0x009b;
    L_0x0092:
        r2 = r2.getTypeName();
        r3 = "mdx_network_type";
        r0.put(r3, r2);
    L_0x009b:
        r2 = r0.keySet();
        r2 = r2.iterator();
    L_0x00a3:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x00b9;
    L_0x00a9:
        r3 = r2.next();
        r3 = (java.lang.String) r3;
        r4 = r0.get(r3);
        r4 = (java.lang.String) r4;
        r9.putString(r3, r4);
        goto L_0x00a3;
    L_0x00b9:
        r0 = r8.d;
        r2 = r0.a();
        r8.j = r2;
        if (r1 == 0) goto L_0x00ed;
    L_0x00c3:
        r0 = r1 instanceof defpackage.adsu;
        if (r0 == 0) goto L_0x00ed;
    L_0x00c7:
        r0 = r1.h();
        r0 = r0 instanceof defpackage.adil;
        if (r0 == 0) goto L_0x00ed;
    L_0x00cf:
        r0 = new adse;
        r1 = r1.h();
        r1 = (defpackage.adil) r1;
        r1 = r1.a();
        r2 = r8.g;
        r2 = r2.get();
        r2 = (defpackage.adeb) r2;
        r0.<init>(r1, r2, r10, r9);
        r9 = 0;
        r9 = new java.lang.Void[r9];
        r0.execute(r9);
        return;
    L_0x00ed:
        r10.a(r9);
        return;
    L_0x00f1:
        r9 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00f1 }
        goto L_0x00f5;
    L_0x00f4:
        throw r9;
    L_0x00f5:
        goto L_0x00f4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adsc.a(android.os.Bundle, adei):void");
    }

    public final void a(adqe adqe) {
        amqw.a((Object) adqe);
        Map hashMap = new HashMap();
        adsc.a(hashMap, adqe);
        if (!hashMap.isEmpty()) {
            synchronized (this.h) {
                this.i = hashMap;
            }
            this.j = this.d.a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d8  */
    private static void a(java.util.Map r8, defpackage.adqe r9) {
        /*
        r0 = r9 instanceof defpackage.adsu;
        r1 = 0;
        if (r0 == 0) goto L_0x0019;
    L_0x0005:
        r0 = r9;
        r0 = (defpackage.adsu) r0;
        r0 = r0.o;
        if (r0 == 0) goto L_0x0011;
    L_0x000c:
        r0 = r0.h();
        goto L_0x0012;
    L_0x0011:
        r0 = r1;
    L_0x0012:
        r2 = r0 instanceof defpackage.adio;
        if (r2 == 0) goto L_0x0024;
    L_0x0016:
        r0 = (defpackage.adio) r0;
        goto L_0x0025;
    L_0x0019:
        r0 = r9 instanceof defpackage.adro;
        if (r0 == 0) goto L_0x0024;
    L_0x001d:
        r0 = r9.h();
        r0 = (defpackage.adio) r0;
        goto L_0x0025;
    L_0x0024:
        r0 = r1;
    L_0x0025:
        if (r0 == 0) goto L_0x0032;
    L_0x0027:
        r0 = r0.br_();
        r0 = r0.a;
        r2 = "mdx_screen_identifier";
        r8.put(r2, r0);
    L_0x0032:
        r0 = r9.h();
        r0 = r0 instanceof defpackage.adiq;
        r2 = 3;
        r3 = "unknown";
        r4 = 2;
        r5 = 1;
        if (r0 == 0) goto L_0x009f;
    L_0x003f:
        r0 = r9.h();
        r0 = (defpackage.adiq) r0;
        r6 = r0.e();
        r6 = defpackage.xvd.f(r6);
        r7 = "mdx_dial_manufacturer";
        r8.put(r7, r6);
        r6 = r0.f();
        r6 = defpackage.xvd.f(r6);
        r7 = "mdx_dial_model";
        r8.put(r7, r6);
        r6 = r0.n();
        r6 = java.lang.String.valueOf(r6);
        r7 = "mdx_dial_is_wol";
        r8.put(r7, r6);
        r6 = r0.k;
        r6 = r6.b();
        r7 = -1;
        if (r6 == r7) goto L_0x008b;
    L_0x0075:
        if (r6 == 0) goto L_0x0088;
    L_0x0077:
        if (r6 == r5) goto L_0x0085;
    L_0x0079:
        if (r6 == r4) goto L_0x0082;
    L_0x007b:
        if (r6 == r2) goto L_0x007f;
    L_0x007d:
        r6 = r3;
        goto L_0x008d;
    L_0x007f:
        r6 = "hidden";
        goto L_0x008d;
    L_0x0082:
        r6 = "stopped";
        goto L_0x008d;
    L_0x0085:
        r6 = "running";
        goto L_0x008d;
    L_0x0088:
        r6 = "installable";
        goto L_0x008d;
    L_0x008b:
        r6 = "not found";
    L_0x008d:
        r7 = "mdx_dial_app_status";
        r8.put(r7, r6);
        r0 = r0.o();
        r0 = java.lang.String.valueOf(r0);
        r6 = "mdx_dial_is_sleeping";
        r8.put(r6, r0);
    L_0x009f:
        r0 = r9;
        r0 = (defpackage.adtq) r0;
        r0 = r0.P();
        r6 = r0 + -1;
        if (r0 == 0) goto L_0x00d8;
    L_0x00aa:
        if (r6 == r5) goto L_0x00b8;
    L_0x00ac:
        if (r6 == r4) goto L_0x00b5;
    L_0x00ae:
        if (r6 == r2) goto L_0x00b2;
    L_0x00b0:
        r0 = r3;
        goto L_0x00ba;
    L_0x00b2:
        r0 = "cloud";
        goto L_0x00ba;
    L_0x00b5:
        r0 = "dial";
        goto L_0x00ba;
    L_0x00b8:
        r0 = "cast";
    L_0x00ba:
        r1 = "mdx_session_type";
        r8.put(r1, r0);
        r9 = r9.d();
        if (r9 == 0) goto L_0x00d0;
    L_0x00c5:
        if (r9 == r5) goto L_0x00cd;
    L_0x00c7:
        if (r9 == r4) goto L_0x00ca;
    L_0x00c9:
        goto L_0x00d2;
    L_0x00ca:
        r3 = "disconnected";
        goto L_0x00d2;
    L_0x00cd:
        r3 = "connected";
        goto L_0x00d2;
    L_0x00d0:
        r3 = "connecting";
    L_0x00d2:
        r9 = "mdx_session_state";
        r8.put(r9, r3);
        return;
    L_0x00d8:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adsc.a(java.util.Map, adqe):void");
    }
}
