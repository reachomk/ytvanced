package defpackage;

/* renamed from: aelp */
final class aelp implements Runnable {
    private final aeln a;
    private final xhv b;
    private final boolean c;
    private final int d;
    private int e = 1;

    public aelp(aeln aeln, xhv xhv, boolean z, int i) {
        this.a = (aeln) amqw.a((Object) aeln);
        this.b = (xhv) amqw.a((Object) xhv);
        this.c = z;
        this.d = i;
    }

    /* JADX WARNING: Missing block: B:9:0x000f, code skipped:
            r0 = r13.b.k();
            r2 = 0;
     */
    /* JADX WARNING: Missing block: B:10:0x0018, code skipped:
            if (r13.c == false) goto L_0x0050;
     */
    /* JADX WARNING: Missing block: B:12:0x001c, code skipped:
            if (r0 == r13.e) goto L_0x0050;
     */
    /* JADX WARNING: Missing block: B:13:0x001e, code skipped:
            r13.e = r0;
            r1 = r13.a.h;
            r3 = r1.size();
            r4 = 0;
     */
    /* JADX WARNING: Missing block: B:14:0x0029, code skipped:
            if (r4 >= r3) goto L_0x0045;
     */
    /* JADX WARNING: Missing block: B:15:0x002b, code skipped:
            r5 = (defpackage.aelq) r1.get(r4);
            r5.c = 0;
            r5.d = r5.g.c.b();
            r5.b();
            r4 = r4 + 1;
     */
    /* JADX WARNING: Missing block: B:16:0x0045, code skipped:
            r1 = r13.a;
     */
    /* JADX WARNING: Missing block: B:17:0x0049, code skipped:
            if (r1.f == false) goto L_0x0050;
     */
    /* JADX WARNING: Missing block: B:18:0x004b, code skipped:
            r1.e.b();
     */
    /* JADX WARNING: Missing block: B:20:0x0052, code skipped:
            if (r13.d <= 0) goto L_0x0080;
     */
    /* JADX WARNING: Missing block: B:21:0x0054, code skipped:
            r1 = r13.a.h;
            r3 = r1.size();
            r4 = 0;
     */
    /* JADX WARNING: Missing block: B:22:0x005d, code skipped:
            if (r4 >= r3) goto L_0x0080;
     */
    /* JADX WARNING: Missing block: B:23:0x005f, code skipped:
            r5 = (defpackage.aelq) r1.get(r4);
     */
    /* JADX WARNING: Missing block: B:24:0x0077, code skipped:
            if ((r13.a.c.b() - r5.b) >= ((long) (r13.d * 1000))) goto L_0x007a;
     */
    /* JADX WARNING: Missing block: B:25:0x007a, code skipped:
            r5.b();
     */
    /* JADX WARNING: Missing block: B:26:0x007d, code skipped:
            r4 = r4 + 1;
     */
    /* JADX WARNING: Missing block: B:27:0x0080, code skipped:
            r1 = new java.util.ArrayList();
            r3 = r13.a.h;
            r4 = r3.size();
            r5 = 0;
     */
    /* JADX WARNING: Missing block: B:29:0x008f, code skipped:
            if (r5 >= r4) goto L_0x00bd;
     */
    /* JADX WARNING: Missing block: B:30:0x0091, code skipped:
            r7 = (defpackage.aelq) r3.get(r5);
            r8 = r7.d;
            r10 = r13.a.c;
     */
    /* JADX WARNING: Missing block: B:31:0x009d, code skipped:
            if (r0 == 2) goto L_0x00ba;
     */
    /* JADX WARNING: Missing block: B:33:0x00a8, code skipped:
            if ((r8 - 3000) > r10.b()) goto L_0x00ba;
     */
    /* JADX WARNING: Missing block: B:34:0x00aa, code skipped:
            r1.add(r13.a.d.submit(new defpackage.aels(r7)));
     */
    /* JADX WARNING: Missing block: B:35:0x00ba, code skipped:
            r5 = r5 + 1;
     */
    /* JADX WARNING: Missing block: B:36:0x00bd, code skipped:
            r0 = r1.size();
            r3 = 0;
     */
    /* JADX WARNING: Missing block: B:37:0x00c2, code skipped:
            if (r3 >= r0) goto L_0x00e1;
     */
    /* JADX WARNING: Missing block: B:40:?, code skipped:
            ((java.util.concurrent.Future) r1.get(r3)).get();
     */
    /* JADX WARNING: Missing block: B:41:0x00cf, code skipped:
            defpackage.afpc.a(1, defpackage.afpf.onesie, "InterruptedException when attempting to open Bandaid connection.");
     */
    /* JADX WARNING: Missing block: B:43:0x00d7, code skipped:
            defpackage.afpc.a(1, defpackage.afpf.onesie, "ExecutionException when attempting to open Bandaid connection.");
     */
    /* JADX WARNING: Missing block: B:46:0x00e1, code skipped:
            r3 = 5000;
     */
    /* JADX WARNING: Missing block: B:47:0x00e5, code skipped:
            if (r13.e == 2) goto L_0x0119;
     */
    /* JADX WARNING: Missing block: B:48:0x00e7, code skipped:
            r0 = r13.a.h;
            r1 = r0.size();
            r5 = Long.MAX_VALUE;
     */
    /* JADX WARNING: Missing block: B:49:0x00f4, code skipped:
            if (r2 >= r1) goto L_0x0105;
     */
    /* JADX WARNING: Missing block: B:50:0x00f6, code skipped:
            r5 = java.lang.Math.min(r5, ((defpackage.aelq) r0.get(r2)).d);
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:51:0x0105, code skipped:
            r0 = r5 - r13.a.c.b();
     */
    /* JADX WARNING: Missing block: B:52:0x0111, code skipped:
            if (r13.c == false) goto L_0x0118;
     */
    /* JADX WARNING: Missing block: B:53:0x0113, code skipped:
            r3 = java.lang.Math.min(r0, 5000);
     */
    /* JADX WARNING: Missing block: B:54:0x0118, code skipped:
            r3 = r0;
     */
    /* JADX WARNING: Missing block: B:55:0x0119, code skipped:
            r1 = r13.a;
     */
    /* JADX WARNING: Missing block: B:56:0x011b, code skipped:
            monitor-enter(r1);
     */
    /* JADX WARNING: Missing block: B:58:?, code skipped:
            r0 = r13.a;
     */
    /* JADX WARNING: Missing block: B:59:0x0120, code skipped:
            if (r0.i == false) goto L_0x012b;
     */
    /* JADX WARNING: Missing block: B:60:0x0122, code skipped:
            r0.d.schedule(r13, r3, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARNING: Missing block: B:61:0x0129, code skipped:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:62:0x012a, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:63:0x012b, code skipped:
            r0.l = false;
     */
    /* JADX WARNING: Missing block: B:64:0x012e, code skipped:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:65:0x012f, code skipped:
            return;
     */
    public final void run() {
        /*
        r13 = this;
        r0 = r13.a;
        monitor-enter(r0);
        r1 = r13.a;	 Catch:{ all -> 0x0133 }
        r2 = r1.i;	 Catch:{ all -> 0x0133 }
        if (r2 != 0) goto L_0x000e;
    L_0x0009:
        r1.l = false;	 Catch:{ all -> 0x0133 }
        monitor-exit(r0);	 Catch:{ all -> 0x0133 }
        return;
    L_0x000e:
        monitor-exit(r0);	 Catch:{ all -> 0x0133 }
        r0 = r13.b;
        r0 = r0.k();
        r1 = r13.c;
        r2 = 0;
        if (r1 == 0) goto L_0x0050;
    L_0x001a:
        r1 = r13.e;
        if (r0 == r1) goto L_0x0050;
    L_0x001e:
        r13.e = r0;
        r1 = r13.a;
        r1 = r1.h;
        r3 = r1.size();
        r4 = 0;
    L_0x0029:
        if (r4 >= r3) goto L_0x0045;
    L_0x002b:
        r5 = r1.get(r4);
        r5 = (defpackage.aelq) r5;
        r6 = 0;
        r5.c = r6;
        r6 = r5.g;
        r6 = r6.c;
        r6 = r6.b();
        r5.d = r6;
        r5.b();
        r4 = r4 + 1;
        goto L_0x0029;
    L_0x0045:
        r1 = r13.a;
        r3 = r1.f;
        if (r3 == 0) goto L_0x0050;
    L_0x004b:
        r1 = r1.e;
        r1.b();
    L_0x0050:
        r1 = r13.d;
        if (r1 <= 0) goto L_0x0080;
    L_0x0054:
        r1 = r13.a;
        r1 = r1.h;
        r3 = r1.size();
        r4 = 0;
    L_0x005d:
        if (r4 >= r3) goto L_0x0080;
    L_0x005f:
        r5 = r1.get(r4);
        r5 = (defpackage.aelq) r5;
        r6 = r13.a;
        r6 = r6.c;
        r6 = r6.b();
        r8 = r5.b;
        r6 = r6 - r8;
        r8 = r13.d;
        r8 = r8 * 1000;
        r8 = (long) r8;
        r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r10 >= 0) goto L_0x007a;
    L_0x0079:
        goto L_0x007d;
    L_0x007a:
        r5.b();
    L_0x007d:
        r4 = r4 + 1;
        goto L_0x005d;
    L_0x0080:
        r1 = new java.util.ArrayList;
        r1.<init>();
        r3 = r13.a;
        r3 = r3.h;
        r4 = r3.size();
        r5 = 0;
    L_0x008e:
        r6 = 2;
        if (r5 >= r4) goto L_0x00bd;
    L_0x0091:
        r7 = r3.get(r5);
        r7 = (defpackage.aelq) r7;
        r8 = r7.d;
        r10 = r13.a;
        r10 = r10.c;
        if (r0 == r6) goto L_0x00ba;
    L_0x009f:
        r11 = -3000; // 0xfffffffffffff448 float:NaN double:NaN;
        r8 = r8 + r11;
        r10 = r10.b();
        r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r6 > 0) goto L_0x00ba;
    L_0x00aa:
        r6 = r13.a;
        r6 = r6.d;
        r8 = new aels;
        r8.<init>(r7);
        r6 = r6.submit(r8);
        r1.add(r6);
    L_0x00ba:
        r5 = r5 + 1;
        goto L_0x008e;
    L_0x00bd:
        r0 = r1.size();
        r3 = 0;
    L_0x00c2:
        if (r3 >= r0) goto L_0x00e1;
    L_0x00c4:
        r4 = r1.get(r3);
        r4 = (java.util.concurrent.Future) r4;
        r5 = 1;
        r4.get();	 Catch:{ ExecutionException -> 0x00d7, InterruptedException -> 0x00cf }
        goto L_0x00de;
    L_0x00cf:
        r4 = defpackage.afpf.onesie;
        r7 = "InterruptedException when attempting to open Bandaid connection.";
        defpackage.afpc.a(r5, r4, r7);
        goto L_0x00de;
    L_0x00d7:
        r4 = defpackage.afpf.onesie;
        r7 = "ExecutionException when attempting to open Bandaid connection.";
        defpackage.afpc.a(r5, r4, r7);
    L_0x00de:
        r3 = r3 + 1;
        goto L_0x00c2;
    L_0x00e1:
        r0 = r13.e;
        r3 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        if (r0 == r6) goto L_0x0119;
    L_0x00e7:
        r0 = r13.a;
        r0 = r0.h;
        r1 = r0.size();
        r5 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
    L_0x00f4:
        if (r2 >= r1) goto L_0x0105;
    L_0x00f6:
        r7 = r0.get(r2);
        r7 = (defpackage.aelq) r7;
        r7 = r7.d;
        r5 = java.lang.Math.min(r5, r7);
        r2 = r2 + 1;
        goto L_0x00f4;
    L_0x0105:
        r0 = r13.a;
        r0 = r0.c;
        r0 = r0.b();
        r0 = r5 - r0;
        r2 = r13.c;
        if (r2 == 0) goto L_0x0118;
    L_0x0113:
        r3 = java.lang.Math.min(r0, r3);
        goto L_0x0119;
    L_0x0118:
        r3 = r0;
    L_0x0119:
        r1 = r13.a;
        monitor-enter(r1);
        r0 = r13.a;	 Catch:{ all -> 0x0130 }
        r2 = r0.i;	 Catch:{ all -> 0x0130 }
        if (r2 == 0) goto L_0x012b;
    L_0x0122:
        r0 = r0.d;	 Catch:{ all -> 0x0130 }
        r2 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x0130 }
        r0.schedule(r13, r3, r2);	 Catch:{ all -> 0x0130 }
        monitor-exit(r1);	 Catch:{ all -> 0x0130 }
        return;
    L_0x012b:
        r0.l = false;	 Catch:{ all -> 0x0130 }
        monitor-exit(r1);	 Catch:{ all -> 0x0130 }
        return;
    L_0x0130:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0130 }
        throw r0;
    L_0x0133:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0133 }
        goto L_0x0137;
    L_0x0136:
        throw r1;
    L_0x0137:
        goto L_0x0136;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aelp.run():void");
    }
}
