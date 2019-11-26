package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import android.util.Pair;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: alrc */
final class alrc {
    public static final Charset a = Charset.forName("UTF-8");
    public final alsc b;
    public final Executor c;
    public final ScheduledExecutorService d;
    public final xhf e;
    public final Uri f;
    public final afsa g;
    public final alte h;
    public final alqb i;
    public final acum j;
    public final xsc k;
    public final xci l;
    public volatile int m = 3;
    private int n = 0;
    private alrh o;

    public alrc(alsc alsc, Executor executor, ScheduledExecutorService scheduledExecutorService, xhf xhf, afsa afsa, alqb alqb, acum acum, xsc xsc, xci xci, alte alte) {
        this.b = alsc;
        this.c = executor;
        this.d = scheduledExecutorService;
        this.e = xhf;
        this.g = afsa;
        this.i = alqb;
        this.j = acum;
        this.k = xsc;
        this.l = xci;
        this.h = (alte) amqw.a((Object) alte);
        this.f = alrc.a(new Builder().scheme("https").encodedAuthority(alte.b).appendEncodedPath("v1/cache/").build(), alsc.n);
    }

    public static Uri a(Uri uri, List list) {
        xvo a = xvo.a(uri);
        for (Pair pair : list) {
            a.a((String) pair.first, (String) pair.second, ",:");
        }
        return a.a();
    }

    public final boolean a() {
        return this.m == 3;
    }

    public final boolean b() {
        return this.m == 7;
    }

    public final boolean c() {
        return this.b.m && this.h.d;
    }

    /* JADX WARNING: Missing block: B:52:0x009c, code skipped:
            return;
     */
    public final synchronized void a(int r12, defpackage.bqn r13) {
        /*
        r11 = this;
        monitor-enter(r11);
        r0 = r11.m;	 Catch:{ all -> 0x009f }
        r1 = 6;
        r2 = 3;
        r3 = 5;
        r4 = 1;
        if (r12 == 0) goto L_0x0033;
    L_0x0009:
        if (r12 == r4) goto L_0x000f;
    L_0x000b:
        r12 = 2;
        r11.m = r12;	 Catch:{ all -> 0x009f }
        goto L_0x0038;
    L_0x000f:
        r12 = r13.b;	 Catch:{ all -> 0x009f }
        if (r12 == 0) goto L_0x001e;
    L_0x0013:
        r12 = r12.a;	 Catch:{ all -> 0x009f }
        r5 = 503; // 0x1f7 float:7.05E-43 double:2.485E-321;
        if (r12 == r5) goto L_0x001a;
    L_0x0019:
        goto L_0x001e;
    L_0x001a:
        r12 = 7;
        r11.m = r12;	 Catch:{ all -> 0x009f }
        goto L_0x0038;
    L_0x001e:
        r12 = r11.n;	 Catch:{ all -> 0x009f }
        r12 = r12 + r4;
        r11.n = r12;	 Catch:{ all -> 0x009f }
        r5 = r11.b;	 Catch:{ all -> 0x009f }
        r5 = r5.k;	 Catch:{ all -> 0x009f }
        if (r12 <= r5) goto L_0x0038;
    L_0x0029:
        r12 = r13 instanceof defpackage.bqo;	 Catch:{ all -> 0x009f }
        if (r12 != 0) goto L_0x002f;
    L_0x002d:
        r12 = 6;
        goto L_0x0030;
    L_0x002f:
        r12 = 5;
    L_0x0030:
        r11.m = r12;	 Catch:{ all -> 0x009f }
        goto L_0x0038;
    L_0x0033:
        r12 = 0;
        r11.n = r12;	 Catch:{ all -> 0x009f }
        r11.m = r2;	 Catch:{ all -> 0x009f }
    L_0x0038:
        r12 = r11.m;	 Catch:{ all -> 0x009f }
        r13 = r12 + -2;
        if (r12 == 0) goto L_0x009d;
    L_0x003e:
        if (r13 == 0) goto L_0x0098;
    L_0x0040:
        if (r13 == r4) goto L_0x0098;
    L_0x0042:
        if (r13 == r2) goto L_0x006a;
    L_0x0044:
        r12 = 4;
        if (r13 == r12) goto L_0x006a;
    L_0x0047:
        if (r13 == r3) goto L_0x004a;
    L_0x0049:
        goto L_0x009b;
    L_0x004a:
        r12 = r11.m;	 Catch:{ all -> 0x009f }
        if (r0 == r12) goto L_0x0063;
    L_0x004e:
        r11.d();	 Catch:{ all -> 0x009f }
        r12 = new alrh;	 Catch:{ all -> 0x009f }
        r13 = r11.b;	 Catch:{ all -> 0x009f }
        r4 = r13.l;	 Catch:{ all -> 0x009f }
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r6 = -1;
        r7 = 1;
        r1 = r12;
        r2 = r11;
        r3 = r4;
        r1.<init>(r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x009f }
        r11.o = r12;	 Catch:{ all -> 0x009f }
    L_0x0063:
        r12 = r11.o;	 Catch:{ all -> 0x009f }
        r12.b();	 Catch:{ all -> 0x009f }
        monitor-exit(r11);
        return;
    L_0x006a:
        r12 = r11.b;	 Catch:{ all -> 0x009f }
        r12 = r12.h;	 Catch:{ all -> 0x009f }
        if (r12 == 0) goto L_0x0093;
    L_0x0070:
        if (r0 != r3) goto L_0x0073;
    L_0x0072:
        goto L_0x008c;
    L_0x0073:
        if (r0 == r1) goto L_0x008c;
    L_0x0075:
        r11.d();	 Catch:{ all -> 0x009f }
        r12 = new alrh;	 Catch:{ all -> 0x009f }
        r13 = r11.b;	 Catch:{ all -> 0x009f }
        r6 = r13.f;	 Catch:{ all -> 0x009f }
        r7 = r13.c;	 Catch:{ all -> 0x009f }
        r8 = r13.e;	 Catch:{ all -> 0x009f }
        r9 = r13.d;	 Catch:{ all -> 0x009f }
        r10 = 0;
        r4 = r12;
        r5 = r11;
        r4.<init>(r5, r6, r7, r8, r9, r10);	 Catch:{ all -> 0x009f }
        r11.o = r12;	 Catch:{ all -> 0x009f }
    L_0x008c:
        r12 = r11.o;	 Catch:{ all -> 0x009f }
        r12.b();	 Catch:{ all -> 0x009f }
        monitor-exit(r11);
        return;
    L_0x0093:
        r11.d();	 Catch:{ all -> 0x009f }
        monitor-exit(r11);
        return;
    L_0x0098:
        r11.d();	 Catch:{ all -> 0x009f }
    L_0x009b:
        monitor-exit(r11);
        return;
    L_0x009d:
        r12 = 0;
        throw r12;	 Catch:{ all -> 0x009f }
    L_0x009f:
        r12 = move-exception;
        monitor-exit(r11);
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alrc.a(int, bqn):void");
    }

    private final void d() {
        alrh alrh = this.o;
        if (alrh != null) {
            alrh.a();
            this.o = null;
        }
    }

    public final String toString() {
        Locale locale = Locale.US;
        r1 = new Object[3];
        alte alte = this.h;
        r1[0] = alte.c;
        r1[1] = alte.b;
        r1[2] = Boolean.valueOf(alte.d);
        return String.format(locale, "SC Service [id=%s, fqdn=%s, uiEnabled=%s]", r1);
    }
}
