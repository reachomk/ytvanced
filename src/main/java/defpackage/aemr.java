package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aemr */
public final class aemr implements ovi {
    public final AtomicReference a = new AtomicReference();
    private final aenq b;
    private final ovi c;
    private final afhi d;
    private final aemu e;
    private final xsc f;
    private final long g;
    private final long h;
    private boolean i;
    private boolean j;
    private ovm k;
    private String l;
    private int m;
    private long n;
    private final long o;
    private String p;
    private long q;
    private long r;
    private long s;

    public aemr(aenq aenq, ovi ovi, afhi afhi, aemu aemu, ScheduledExecutorService scheduledExecutorService, aajj aajj, xsc xsc, aeoj aeoj) {
        arhh arhh;
        long j;
        amqw.a((Object) scheduledExecutorService);
        amqw.a((Object) aajj);
        this.b = (aenq) amqw.a((Object) aenq);
        this.c = (ovi) amqw.a((Object) ovi);
        this.d = (afhi) amqw.a((Object) afhi);
        this.e = aemu;
        this.f = (xsc) amqw.a((Object) xsc);
        this.a.set(aeoj);
        awdg awdg = aajj.c;
        long j2 = 0;
        if ((awdg.a & 2) != 0) {
            arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            j = arhh.ag;
        } else {
            j = 0;
        }
        this.g = j;
        awdg = aajj.c;
        if ((awdg.a & 2) != 0) {
            arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            j2 = arhh.ah;
        }
        this.h = j2;
        this.o = -1;
        if (aemu != null) {
            aemu.a(this);
        }
    }

    public final void a(owt owt) {
        this.c.a(owt);
    }

    public final long a(ovm ovm) {
        String queryParameter;
        ovm ovm2;
        ovm ovm3 = ovm;
        String str = "getOpenableDataSource: Null representation.";
        String str2 = "itag";
        if (ovm3.a.getAuthority().equals("oda")) {
            queryParameter = ovm3.a.getQueryParameter(str2);
            aeoj aeoj = (aeoj) this.a.get();
            if (aeoj != null) {
                try {
                    orc b = aeoj.b(queryParameter);
                    if (b != null) {
                        ovm ovm4 = new ovm(Uri.parse(b.d), ovm3.b, ovm3.c, ovm3.d, ovm3.e, ovm3.f, b.c(), ovm3.h);
                    } else {
                        aepe.a(str);
                        throw new IOException(str);
                    }
                } catch (aeom unused) {
                    String str3 = "getOpenableDataSource: IncompatibleException.";
                    aepe.a(str3);
                    throw new IOException(str3);
                }
            }
            aepe.a("Dummy authority received with null Representation cache (openable).");
            throw new IOException("Dummy authority received with null Representation cache.");
        }
        ovm2 = ovm3;
        this.j = false;
        queryParameter = ovm2.a.getPath();
        if (!(this.b.l == 1 || queryParameter == null || !queryParameter.startsWith("/videoplayback"))) {
            ovm ovm5;
            this.l = ovm2.a.getQueryParameter("id");
            this.k = ovm2;
            this.q = ovm2.e;
            this.r = ovm2.f;
            this.s = this.f.b();
            if (this.l != null) {
                ovm5 = this.k;
                if (ovm5.f != -1) {
                    queryParameter = ovm5.a.getQueryParameter(str2);
                    str2 = this.k.a.getQueryParameter("lmt");
                    if (!(queryParameter == null || str2 == null)) {
                        try {
                            this.m = Integer.parseInt(queryParameter);
                            this.n = Long.parseLong(str2);
                            this.p = aahr.c(this.k.a.getQueryParameter("xtags"));
                        } catch (NumberFormatException unused2) {
                        }
                        this.j = true;
                        return this.r;
                    }
                }
            }
            ovm5 = this.k;
            if (ovm5.b == 3 && ovm5.a.getQueryParameter("live") != null) {
                aenq aenq = this.b;
                aeoa aeoa = (aeoa) aenq.f.get(this.l);
                njk njk = null;
                if (aeoa != null && aeoa.c.h.a() - aeoa.b <= 8000) {
                    njk = aeoa.a;
                }
                if (njk != null) {
                    this.r = 0;
                    afjd afjd = new afjd();
                    long j = njk.c;
                    String[] strArr = new String[]{Long.toString(j)};
                    afjd.a.put("x-head-seqnum", Arrays.asList(strArr));
                    long j2 = njk.d;
                    String[] strArr2 = new String[]{Long.toString(TimeUnit.MICROSECONDS.toMillis(j2 * 1000))};
                    afjd.a.put("x-head-time-millis", Arrays.asList(strArr2));
                    this.d.a(afjd.a);
                    this.j = true;
                    return this.r;
                }
            }
        }
        return b(a(ovm2, ovm2.e, ovm2.f));
    }

    public final void a() {
        if (this.i) {
            this.i = false;
            this.c.a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:91:0x0120  */
    /* JADX WARNING: Missing block: B:73:0x00ed, code skipped:
            if (r4.l != 1) goto L_0x00f0;
     */
    /* JADX WARNING: Missing block: B:75:0x00f0, code skipped:
            if (r15 == null) goto L_0x0117;
     */
    /* JADX WARNING: Missing block: B:77:0x00f6, code skipped:
            if (r15.a(r2) == false) goto L_0x0117;
     */
    /* JADX WARNING: Missing block: B:81:?, code skipped:
            r0 = r15.a(r2, r14, r25, r26);
            r4.i.a(r5, r6, r0, r15.a(), 3);
     */
    public final int a(byte[] r25, int r26, int r27) {
        /*
        r24 = this;
        r7 = r24;
        r0 = r7.j;
        if (r0 == 0) goto L_0x0164;
    L_0x0006:
        r0 = r7.k;
        if (r0 == 0) goto L_0x0164;
    L_0x000a:
        r0 = r7.r;
        r2 = 0;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 < 0) goto L_0x0164;
    L_0x0012:
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 == 0) goto L_0x0162;
    L_0x0016:
        r4 = r27;
        r4 = (long) r4;
        r0 = java.lang.Math.min(r4, r0);
        r14 = (int) r0;
        r0 = r7.g;
        r4 = r7.f;
        r4 = r4.b();
        r0 = r0 - r4;
        r4 = r7.s;
        r0 = r0 + r4;
        r4 = r7.g;
        r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r6 > 0) goto L_0x0031;
    L_0x0030:
        goto L_0x0035;
    L_0x0031:
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 <= 0) goto L_0x0133;
    L_0x0035:
        r4 = r7.h;
        r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r6 <= 0) goto L_0x003f;
    L_0x003b:
        r0 = java.lang.Math.min(r4, r0);
    L_0x003f:
        r4 = r7.b;	 Catch:{ InterruptedException -> 0x012c }
        r5 = r7.l;	 Catch:{ InterruptedException -> 0x012c }
        r6 = r7.m;	 Catch:{ InterruptedException -> 0x012c }
        r8 = r7.n;	 Catch:{ InterruptedException -> 0x012c }
        r10 = r7.o;	 Catch:{ InterruptedException -> 0x012c }
        r12 = r7.p;	 Catch:{ InterruptedException -> 0x012c }
        r2 = r7.q;	 Catch:{ InterruptedException -> 0x012c }
        if (r12 != 0) goto L_0x0051;
    L_0x004f:
        r12 = "";
    L_0x0051:
        r22 = r12;
        r12 = r4.g;	 Catch:{ InterruptedException -> 0x012c }
        r12 = r12.contains(r5);	 Catch:{ InterruptedException -> 0x012c }
        if (r12 != 0) goto L_0x0063;
    L_0x005b:
        r12 = r4.e;	 Catch:{ InterruptedException -> 0x012c }
        r5 = r12.get(r5);	 Catch:{ InterruptedException -> 0x012c }
        r5 = (java.lang.String) r5;	 Catch:{ InterruptedException -> 0x012c }
    L_0x0063:
        if (r5 == 0) goto L_0x011c;
    L_0x0065:
        monitor-enter(r4);	 Catch:{ InterruptedException -> 0x012c }
        r13 = new aens;	 Catch:{ all -> 0x0119 }
        r15 = r4.k;	 Catch:{ all -> 0x0119 }
        r23 = r15;
        r15 = r13;
        r16 = r5;
        r17 = r6;
        r18 = r8;
        r20 = r10;
        r15.<init>(r16, r17, r18, r20, r22, r23);	 Catch:{ all -> 0x0119 }
        r8 = r4.h;	 Catch:{ all -> 0x0119 }
        r8 = r8.b();	 Catch:{ all -> 0x0119 }
    L_0x007e:
        r10 = r4.c;	 Catch:{ all -> 0x0119 }
        r10 = r10.get(r13);	 Catch:{ all -> 0x0119 }
        r15 = r10;
        r15 = (defpackage.aeob) r15;	 Catch:{ all -> 0x0119 }
        r10 = 1;
        if (r15 != 0) goto L_0x009b;
    L_0x008a:
        r11 = r4.b;	 Catch:{ all -> 0x0119 }
        r11 = r11.contains(r13);	 Catch:{ all -> 0x0119 }
        if (r11 != 0) goto L_0x009b;
    L_0x0092:
        r11 = r4.d;	 Catch:{ all -> 0x0119 }
        r11 = r11.contains(r13);	 Catch:{ all -> 0x0119 }
        if (r11 != 0) goto L_0x009b;
    L_0x009a:
        goto L_0x00eb;
    L_0x009b:
        if (r15 != 0) goto L_0x009e;
    L_0x009d:
        goto L_0x00a4;
    L_0x009e:
        r11 = r15.a(r2);	 Catch:{ all -> 0x0119 }
        if (r11 != 0) goto L_0x00eb;
    L_0x00a4:
        r11 = r4.l;	 Catch:{ all -> 0x0119 }
        if (r11 == r10) goto L_0x00eb;
    L_0x00a8:
        r12 = 4;
        if (r11 == r12) goto L_0x00eb;
    L_0x00ab:
        r11 = 0;
        r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1));
        if (r10 <= 0) goto L_0x00c4;
    L_0x00b1:
        r10 = r4.h;	 Catch:{ InterruptedException -> 0x00c8 }
        r15 = r10.b();	 Catch:{ InterruptedException -> 0x00c8 }
        r15 = r15 - r8;
        r10 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1));
        if (r10 <= 0) goto L_0x00c2;
    L_0x00bc:
        r11 = r0 - r15;
        r4.wait(r11);	 Catch:{ InterruptedException -> 0x00c8 }
        goto L_0x007e;
    L_0x00c2:
        monitor-exit(r4);	 Catch:{ all -> 0x0119 }
        goto L_0x011c;
    L_0x00c4:
        r4.wait();	 Catch:{ InterruptedException -> 0x00c8 }
        goto L_0x007e;
    L_0x00c8:
        r0 = move-exception;
        r1 = r4.j;	 Catch:{ all -> 0x0119 }
        r1 = r1.b();	 Catch:{ all -> 0x0119 }
        if (r1 != 0) goto L_0x00d2;
    L_0x00d1:
        goto L_0x00e8;
    L_0x00d2:
        r1 = r1.k;	 Catch:{ all -> 0x0119 }
        if (r1 != 0) goto L_0x00d8;
    L_0x00d6:
        r1 = defpackage.auuo.k;	 Catch:{ all -> 0x0119 }
    L_0x00d8:
        r1 = r1.c;	 Catch:{ all -> 0x0119 }
        if (r1 != 0) goto L_0x00de;
    L_0x00dc:
        r1 = defpackage.avtg.k;	 Catch:{ all -> 0x0119 }
    L_0x00de:
        r1 = r1.e;	 Catch:{ all -> 0x0119 }
        if (r1 != 0) goto L_0x00e4;
    L_0x00e2:
        r1 = defpackage.avte.x;	 Catch:{ all -> 0x0119 }
    L_0x00e4:
        r1 = r1.u;	 Catch:{ all -> 0x0119 }
        if (r1 != 0) goto L_0x00ea;
    L_0x00e8:
        monitor-exit(r4);	 Catch:{ all -> 0x0119 }
        goto L_0x011c;
    L_0x00ea:
        throw r0;	 Catch:{ all -> 0x0119 }
    L_0x00eb:
        r0 = r4.l;	 Catch:{ all -> 0x0119 }
        if (r0 != r10) goto L_0x00f0;
    L_0x00ef:
        goto L_0x0117;
    L_0x00f0:
        if (r15 == 0) goto L_0x0117;
    L_0x00f2:
        r0 = r15.a(r2);	 Catch:{ all -> 0x0119 }
        if (r0 == 0) goto L_0x0117;
    L_0x00f8:
        monitor-exit(r4);	 Catch:{ all -> 0x0119 }
        r8 = r15;
        r9 = r2;
        r11 = r14;
        r12 = r25;
        r13 = r26;
        r0 = r8.a(r9, r11, r12, r13);	 Catch:{ InterruptedException -> 0x012c }
        r1 = r4.i;	 Catch:{ InterruptedException -> 0x012c }
        r19 = r15.a();	 Catch:{ InterruptedException -> 0x012c }
        r21 = 3;
        r15 = r1;
        r16 = r5;
        r17 = r6;
        r18 = r0;
        r15.a(r16, r17, r18, r19, r21);	 Catch:{ InterruptedException -> 0x012c }
        goto L_0x011d;
    L_0x0117:
        monitor-exit(r4);	 Catch:{ all -> 0x0119 }
        goto L_0x011c;
    L_0x0119:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0119 }
        throw r0;	 Catch:{ InterruptedException -> 0x012c }
    L_0x011c:
        r0 = 0;
    L_0x011d:
        if (r0 != 0) goto L_0x0120;
    L_0x011f:
        goto L_0x0133;
    L_0x0120:
        r1 = (long) r0;
        r3 = r7.q;
        r3 = r3 + r1;
        r7.q = r3;
        r3 = r7.r;
        r3 = r3 - r1;
        r7.r = r3;
        return r0;
    L_0x012c:
        r0 = move-exception;
        r1 = new java.io.IOException;
        r1.<init>(r0);
        throw r1;
    L_0x0133:
        r0 = r7.k;
        r0 = r0.a;
        r0 = r0.getAuthority();
        r1 = "onesievideobufferonly";
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x015a;
    L_0x0143:
        r0 = r7.e;
        if (r0 == 0) goto L_0x014a;
    L_0x0147:
        r0.b(r7);
    L_0x014a:
        r2 = r7.k;
        r3 = r7.q;
        r5 = r7.r;
        r1 = r24;
        r0 = r1.a(r2, r3, r5);
        r7.b(r0);
        goto L_0x0167;
    L_0x015a:
        r0 = new java.io.IOException;
        r1 = "Giving up on a OnesieVideoBuffer-only request.";
        r0.<init>(r1);
        throw r0;
    L_0x0162:
        r0 = -1;
        return r0;
    L_0x0164:
        r4 = r27;
        r14 = r4;
    L_0x0167:
        r0 = r7.c;
        r1 = r25;
        r2 = r26;
        r0 = r0.a(r1, r2, r14);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aemr.a(byte[], int, int):int");
    }

    public final Uri b() {
        return !this.j ? this.c.b() : this.k.a;
    }

    private final long b(ovm ovm) {
        if (this.i) {
            aepe.a("Upstream DataSource already opened.");
        }
        this.j = false;
        this.i = true;
        return this.c.a(ovm);
    }

    private final ovm a(ovm ovm, long j, long j2) {
        String c;
        ovm ovm2 = ovm;
        Uri uri = ovm2.a;
        String str = ovm2.g;
        if (uri.getAuthority().equals("oda")) {
            str = "itag";
            String a;
            try {
                a = aajy.a(Integer.parseInt(ovm2.a.getQueryParameter(str)), ovm2.a.getQueryParameter("xtags"));
                aeoj aeoj = (aeoj) this.a.get();
                if (aeoj != null) {
                    try {
                        orc c2 = aeoj.c(a);
                        c = c2.c();
                        uri = Uri.parse(c2.d);
                    } catch (aeom unused) {
                        throw new IOException();
                    }
                }
                aepe.a("Dummy authority received with null Representation cache (upstream).");
                throw new IOException();
            } catch (NumberFormatException unused2) {
                a = String.valueOf(ovm2.a.getQueryParameter(str));
                str = "Unexpected NumberFormatException: ";
                if (a.length() == 0) {
                    a = new String(str);
                } else {
                    a = str.concat(a);
                }
                aepe.a(a);
                return ovm2;
            }
        }
        c = str;
        if (ovm2.a == uri && ovm2.e == j && ovm2.d == j && ovm2.f == j2) {
            return ovm2;
        }
        return new ovm(uri, ovm2.b, ovm2.c, j, j, j2, c, ovm2.h);
    }

    public final Map c() {
        return Collections.emptyMap();
    }
}
