package defpackage;

import java.security.Key;

/* renamed from: aivp */
public final class aivp {
    public final aeex a;
    public aivo b;
    public volatile boolean c = false;
    private final amro d;
    private final oww e;
    private final Key f;
    private final Key g;
    private final afhg h;
    private final ovf i;
    private final Object j;
    private final ozb k;
    private final amqp l;
    private final Object m;
    private volatile boolean n = false;
    private final xsc o;
    private long p;
    private long q;

    public aivp(amro amro, oww oww, Key key, Key key2, afhg afhg, ovf ovf, xsc xsc, Object obj, aeex aeex, ozb ozb, amqp amqp) {
        this.d = (amro) amqw.a((Object) amro);
        this.e = oww;
        this.f = key;
        this.g = key2;
        this.h = (afhg) amqw.a((Object) afhg);
        this.i = (ovf) amqw.a((Object) ovf);
        this.o = (xsc) amqw.a((Object) xsc);
        this.j = amqw.a(obj);
        this.a = (aeex) amqw.a((Object) aeex);
        this.k = (ozb) amqw.a((Object) ozb);
        this.l = (amqp) amqw.a((Object) amqp);
        this.m = new Object();
        this.p = -1;
    }

    public final void a(boolean z) {
        synchronized (this.m) {
            this.c = true;
            this.n = z;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0105 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:44|45|(1:47)(1:48)|(1:50)|51|52|53) */
    /* JADX WARNING: Missing block: B:46:0x0109, code skipped:
            if (0 == r10.f) goto L_0x010b;
     */
    /* JADX WARNING: Missing block: B:47:0x010b, code skipped:
            r6 = 1;
     */
    /* JADX WARNING: Missing block: B:48:0x010d, code skipped:
            r6 = null;
     */
    /* JADX WARNING: Missing block: B:49:0x010e, code skipped:
            if (r6 == null) goto L_0x0110;
     */
    /* JADX WARNING: Missing block: B:50:0x0110, code skipped:
            r10 = r10.a(0);
     */
    /* JADX WARNING: Missing block: B:52:?, code skipped:
            r5.a();
     */
    /* JADX WARNING: Missing block: B:53:0x0117, code skipped:
            r9 = r6;
     */
    /* JADX WARNING: Missing block: B:58:?, code skipped:
            r5.a();
     */
    /* JADX WARNING: Missing block: B:62:?, code skipped:
            r1.k.d(-10);
     */
    /* JADX WARNING: Missing block: B:80:0x016f, code skipped:
            return;
     */
    public final void a(defpackage.aahr r17, long r18, long r20, java.lang.String r22, defpackage.oxb r23, defpackage.oxb r24) {
        /*
        r16 = this;
        r1 = r16;
        r0 = r17;
        r2 = r1.j;
        monitor-enter(r2);
        r3 = r0.b;	 Catch:{ all -> 0x0172 }
        r4 = r17.C();	 Catch:{ all -> 0x0172 }
        r6 = r17.b();	 Catch:{ all -> 0x0172 }
        r7 = r17.t();	 Catch:{ all -> 0x0172 }
        r14 = defpackage.aeey.a(r3, r6, r7, r4);	 Catch:{ all -> 0x0172 }
        r3 = android.text.TextUtils.isEmpty(r22);	 Catch:{ all -> 0x0172 }
        if (r3 != 0) goto L_0x0026;
    L_0x001f:
        r3 = r22;
        r3 = r0.a(r3);	 Catch:{ all -> 0x0172 }
        goto L_0x0028;
    L_0x0026:
        r3 = r0.d;	 Catch:{ all -> 0x0172 }
    L_0x0028:
        r9 = r3;
        r3 = new ovm;	 Catch:{ all -> 0x0172 }
        r15 = 16;
        r8 = r3;
        r10 = r18;
        r12 = r20;
        r8.<init>(r9, r10, r12, r14, r15);	 Catch:{ all -> 0x0172 }
        r4 = r1.h;	 Catch:{ all -> 0x0172 }
        r7 = r4.a();	 Catch:{ all -> 0x0172 }
        r4 = r1.d;	 Catch:{ all -> 0x0172 }
        r4 = r4.get();	 Catch:{ all -> 0x0172 }
        r6 = r4;
        r6 = (defpackage.oww) r6;	 Catch:{ all -> 0x0172 }
        if (r6 == 0) goto L_0x0055;
    L_0x0046:
        r4 = new oxc;	 Catch:{ all -> 0x0172 }
        r8 = r16.a();	 Catch:{ all -> 0x0172 }
        r9 = 0;
        r10 = 5;
        r5 = r4;
        r11 = r23;
        r5.<init>(r6, r7, r8, r9, r10, r11);	 Catch:{ all -> 0x0172 }
        r7 = r4;
    L_0x0055:
        r4 = r1.l;	 Catch:{ all -> 0x0172 }
        r4 = r4.a();	 Catch:{ all -> 0x0172 }
        if (r4 == 0) goto L_0x0069;
    L_0x005d:
        r4 = r1.l;	 Catch:{ all -> 0x0172 }
        r4 = r4.b();	 Catch:{ all -> 0x0172 }
        r4 = (defpackage.afhh) r4;	 Catch:{ all -> 0x0172 }
        r7 = r4.a(r7);	 Catch:{ all -> 0x0172 }
    L_0x0069:
        r10 = r7;
        r4 = r1.i;	 Catch:{ all -> 0x0172 }
        r4 = r4.a();	 Catch:{ all -> 0x0172 }
        r5 = r1.g;	 Catch:{ all -> 0x0172 }
        r6 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        if (r5 == 0) goto L_0x0083;
    L_0x0076:
        r7 = new oxv;	 Catch:{ all -> 0x0172 }
        r5 = r5.getEncoded();	 Catch:{ all -> 0x0172 }
        r8 = new byte[r6];	 Catch:{ all -> 0x0172 }
        r7.<init>(r5, r4, r8);	 Catch:{ all -> 0x0172 }
        r12 = r7;
        goto L_0x0084;
    L_0x0083:
        r12 = r4;
    L_0x0084:
        r4 = new oxc;	 Catch:{ all -> 0x0172 }
        r9 = r1.e;	 Catch:{ all -> 0x0172 }
        r11 = r16.a();	 Catch:{ all -> 0x0172 }
        r13 = 5;
        r8 = r4;
        r14 = r24;
        r8.<init>(r9, r10, r11, r12, r13, r14);	 Catch:{ all -> 0x0172 }
        r5 = new owq;	 Catch:{ all -> 0x0172 }
        r7 = r1.k;	 Catch:{ all -> 0x0172 }
        r8 = -10;
        r5.<init>(r4, r7, r8);	 Catch:{ all -> 0x0172 }
        r4 = new byte[r6];	 Catch:{ all -> 0x0172 }
        r7 = 0;
        r10 = r3;
        r9 = 0;
    L_0x00a1:
        if (r9 != 0) goto L_0x0133;
    L_0x00a3:
        r9 = r1.k;	 Catch:{ all -> 0x0172 }
        r9.a(r8);	 Catch:{ all -> 0x0172 }
        r9 = r1.k;	 Catch:{ all -> 0x012a }
        r9.b(r8);	 Catch:{ all -> 0x012a }
        r11 = 0;
        r5.a(r10);	 Catch:{ oze -> 0x0105 }
    L_0x00b2:
        r13 = r1.c;	 Catch:{ oze -> 0x0105 }
        if (r13 != 0) goto L_0x00fe;
    L_0x00b6:
        r13 = r5.a(r4, r7, r6);	 Catch:{ oze -> 0x0105 }
        if (r13 < 0) goto L_0x00fe;
    L_0x00bc:
        r13 = (long) r13;	 Catch:{ oze -> 0x0105 }
        r11 = r11 + r13;
        r13 = r10.e;	 Catch:{ oze -> 0x0105 }
        r13 = r13 + r11;
        r6 = r1.p;	 Catch:{ oze -> 0x0105 }
        r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1));
        if (r15 != 0) goto L_0x00e7;
    L_0x00c7:
        r6 = r1.o;	 Catch:{ oze -> 0x0105 }
        r6 = r6.b();	 Catch:{ oze -> 0x0105 }
        r13 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ oze -> 0x0105 }
        r14 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ oze -> 0x0105 }
        r8 = 30;
        r8 = r13.convert(r8, r14);	 Catch:{ oze -> 0x0105 }
        r13 = r1.q;	 Catch:{ oze -> 0x0105 }
        r6 = r6 - r13;
        r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r13 >= 0) goto L_0x00df;
    L_0x00de:
        goto L_0x00f8;
    L_0x00df:
        r6 = new aiwf;	 Catch:{ oze -> 0x0105 }
        r7 = "Transfer timed out.";
        r6.<init>(r7);	 Catch:{ oze -> 0x0105 }
        throw r6;	 Catch:{ oze -> 0x0105 }
    L_0x00e7:
        r1.p = r13;	 Catch:{ oze -> 0x0105 }
        r6 = r1.o;	 Catch:{ oze -> 0x0105 }
        r6 = r6.b();	 Catch:{ oze -> 0x0105 }
        r1.q = r6;	 Catch:{ oze -> 0x0105 }
        r6 = r1.b;	 Catch:{ oze -> 0x0105 }
        if (r6 == 0) goto L_0x00f8;
    L_0x00f5:
        r6.a(r0, r13);	 Catch:{ oze -> 0x0105 }
    L_0x00f8:
        r6 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r7 = 0;
        r8 = -10;
        goto L_0x00b2;
    L_0x00fe:
        r5.a();	 Catch:{ all -> 0x012a }
        r9 = 1;
        goto L_0x0118;
    L_0x0103:
        r0 = move-exception;
        goto L_0x0126;
    L_0x0105:
        r6 = r10.f;	 Catch:{ all -> 0x0103 }
        r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1));
        if (r8 != 0) goto L_0x010d;
    L_0x010b:
        r6 = 1;
        goto L_0x010e;
    L_0x010d:
        r6 = 0;
    L_0x010e:
        if (r6 != 0) goto L_0x0114;
    L_0x0110:
        r10 = r10.a(r11);	 Catch:{ all -> 0x0103 }
    L_0x0114:
        r5.a();	 Catch:{ all -> 0x012a }
        r9 = r6;
    L_0x0118:
        r6 = r1.k;	 Catch:{ all -> 0x0172 }
        r7 = -10;
        r6.d(r7);	 Catch:{ all -> 0x0172 }
        r6 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r7 = 0;
        r8 = -10;
        goto L_0x00a1;
    L_0x0126:
        r5.a();	 Catch:{ all -> 0x012a }
        throw r0;	 Catch:{ all -> 0x012a }
    L_0x012a:
        r0 = move-exception;
        r3 = r1.k;	 Catch:{ all -> 0x0172 }
        r4 = -10;
        r3.d(r4);	 Catch:{ all -> 0x0172 }
        throw r0;	 Catch:{ all -> 0x0172 }
    L_0x0133:
        r0 = r1.c;	 Catch:{ all -> 0x0172 }
        if (r0 == 0) goto L_0x0170;
    L_0x0137:
        r0 = r1.n;	 Catch:{ all -> 0x0172 }
        if (r0 != 0) goto L_0x013c;
    L_0x013b:
        goto L_0x016e;
    L_0x013c:
        r0 = r1.e;	 Catch:{ all -> 0x0172 }
        r4 = r3.g;	 Catch:{ all -> 0x0172 }
        r0 = r0.a(r4);	 Catch:{ all -> 0x0172 }
        if (r0 == 0) goto L_0x016e;
    L_0x0146:
        r0 = r0.iterator();	 Catch:{ all -> 0x0172 }
    L_0x014a:
        r4 = r0.hasNext();	 Catch:{ all -> 0x0172 }
        if (r4 == 0) goto L_0x016e;
    L_0x0150:
        r4 = r0.next();	 Catch:{ all -> 0x0172 }
        r4 = (defpackage.oxf) r4;	 Catch:{ all -> 0x0172 }
        r5 = r4.b;	 Catch:{ all -> 0x0172 }
        r7 = r3.e;	 Catch:{ all -> 0x0172 }
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 < 0) goto L_0x014a;
    L_0x015e:
        r9 = r4.c;	 Catch:{ all -> 0x0172 }
        r5 = r5 + r9;
        r9 = r3.f;	 Catch:{ all -> 0x0172 }
        r7 = r7 + r9;
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 > 0) goto L_0x014a;
    L_0x0168:
        r5 = r1.e;	 Catch:{ all -> 0x0172 }
        r5.b(r4);	 Catch:{ all -> 0x0172 }
        goto L_0x014a;
    L_0x016e:
        monitor-exit(r2);	 Catch:{ all -> 0x0172 }
        return;
    L_0x0170:
        monitor-exit(r2);	 Catch:{ all -> 0x0172 }
        return;
    L_0x0172:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0172 }
        goto L_0x0176;
    L_0x0175:
        throw r0;
    L_0x0176:
        goto L_0x0175;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aivp.a(aahr, long, long, java.lang.String, oxb, oxb):void");
    }

    private final ovi a() {
        ovw ovw = new ovw();
        Key key = this.f;
        return key != null ? new oxy(key.getEncoded(), ovw) : ovw;
    }
}
