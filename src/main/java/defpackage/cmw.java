package defpackage;

import com.facebook.litho.ComponentTree;

/* renamed from: cmw */
public final class cmw implements Runnable {
    private final /* synthetic */ ComponentTree a;

    public cmw(ComponentTree componentTree) {
        this.a = componentTree;
    }

    /* JADX WARNING: Missing block: B:10:0x0011, code skipped:
            r0 = r0.h;
            r3 = r0.d;
     */
    /* JADX WARNING: Missing block: B:11:0x0015, code skipped:
            if (r3 == null) goto L_0x001e;
     */
    /* JADX WARNING: Missing block: B:12:0x0017, code skipped:
            defpackage.cpt.a(r0, r3, r3.d());
     */
    /* JADX WARNING: Missing block: B:13:0x001e, code skipped:
            r0 = defpackage.cno.d();
     */
    /* JADX WARNING: Missing block: B:14:0x0022, code skipped:
            if (r0 == false) goto L_0x0042;
     */
    /* JADX WARNING: Missing block: B:15:0x0024, code skipped:
            r4 = java.lang.String.valueOf(r2.c.b());
            r5 = "preAllocateMountContent:";
     */
    /* JADX WARNING: Missing block: B:16:0x0034, code skipped:
            if (r4.length() != 0) goto L_0x003c;
     */
    /* JADX WARNING: Missing block: B:17:0x0036, code skipped:
            r4 = new java.lang.String(r5);
     */
    /* JADX WARNING: Missing block: B:18:0x003c, code skipped:
            r5.concat(r4);
     */
    /* JADX WARNING: Missing block: B:19:0x003f, code skipped:
            defpackage.cno.a();
     */
    /* JADX WARNING: Missing block: B:20:0x0042, code skipped:
            r4 = r2.d;
     */
    /* JADX WARNING: Missing block: B:21:0x0044, code skipped:
            if (r4 == null) goto L_0x009e;
     */
    /* JADX WARNING: Missing block: B:23:0x004a, code skipped:
            if (r4.isEmpty() != false) goto L_0x009e;
     */
    /* JADX WARNING: Missing block: B:24:0x004c, code skipped:
            r4 = r2.d.size();
            r5 = 0;
     */
    /* JADX WARNING: Missing block: B:25:0x0053, code skipped:
            if (r5 >= r4) goto L_0x009e;
     */
    /* JADX WARNING: Missing block: B:26:0x0055, code skipped:
            r6 = ((defpackage.cpd) r2.d.get(r5)).d;
     */
    /* JADX WARNING: Missing block: B:27:0x005f, code skipped:
            if (r1 == false) goto L_0x0065;
     */
    /* JADX WARNING: Missing block: B:28:0x0061, code skipped:
            r6.x();
     */
    /* JADX WARNING: Missing block: B:30:0x0069, code skipped:
            if (defpackage.cma.e(r6) == false) goto L_0x009b;
     */
    /* JADX WARNING: Missing block: B:31:0x006b, code skipped:
            if (r0 == false) goto L_0x0089;
     */
    /* JADX WARNING: Missing block: B:32:0x006d, code skipped:
            r7 = java.lang.String.valueOf(r6.b());
            r8 = "preAllocateMountContent:";
     */
    /* JADX WARNING: Missing block: B:33:0x007b, code skipped:
            if (r7.length() != 0) goto L_0x0083;
     */
    /* JADX WARNING: Missing block: B:34:0x007d, code skipped:
            r7 = new java.lang.String(r8);
     */
    /* JADX WARNING: Missing block: B:35:0x0083, code skipped:
            r8.concat(r7);
     */
    /* JADX WARNING: Missing block: B:36:0x0086, code skipped:
            defpackage.cno.a();
     */
    /* JADX WARNING: Missing block: B:37:0x0089, code skipped:
            r7 = r2.b.b;
            r8 = defpackage.cnk.a(r7, r6);
     */
    /* JADX WARNING: Missing block: B:38:0x0091, code skipped:
            if (r8 == null) goto L_0x0096;
     */
    /* JADX WARNING: Missing block: B:39:0x0093, code skipped:
            r8.b(r7, r6);
     */
    /* JADX WARNING: Missing block: B:40:0x0096, code skipped:
            if (r0 == false) goto L_0x009b;
     */
    /* JADX WARNING: Missing block: B:41:0x0098, code skipped:
            defpackage.cno.c();
     */
    /* JADX WARNING: Missing block: B:42:0x009b, code skipped:
            r5 = r5 + 1;
     */
    /* JADX WARNING: Missing block: B:43:0x009e, code skipped:
            if (r0 == false) goto L_0x00a3;
     */
    /* JADX WARNING: Missing block: B:44:0x00a0, code skipped:
            defpackage.cno.c();
     */
    /* JADX WARNING: Missing block: B:45:0x00a3, code skipped:
            if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Missing block: B:46:0x00a5, code skipped:
            r3.e();
     */
    /* JADX WARNING: Missing block: B:59:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:61:?, code skipped:
            return;
     */
    public final void run() {
        /*
        r10 = this;
        r0 = r10.a;
        r1 = r0.e;
        monitor-enter(r0);
        r2 = r0.w;	 Catch:{ all -> 0x00a9 }
        if (r2 != 0) goto L_0x0010;
    L_0x0009:
        r2 = r0.x;	 Catch:{ all -> 0x00a9 }
        if (r2 != 0) goto L_0x0010;
    L_0x000d:
        monitor-exit(r0);	 Catch:{ all -> 0x00a9 }
        goto L_0x00a8;
    L_0x0010:
        monitor-exit(r0);	 Catch:{ all -> 0x00a9 }
        r0 = r0.h;
        r3 = r0.d;
        if (r3 == 0) goto L_0x001e;
    L_0x0017:
        r4 = r3.d();
        defpackage.cpt.a(r0, r3, r4);
    L_0x001e:
        r0 = defpackage.cno.d();
        if (r0 == 0) goto L_0x0042;
    L_0x0024:
        r4 = r2.c;
        r4 = r4.b();
        r4 = java.lang.String.valueOf(r4);
        r5 = "preAllocateMountContent:";
        r6 = r4.length();
        if (r6 != 0) goto L_0x003c;
    L_0x0036:
        r4 = new java.lang.String;
        r4.<init>(r5);
        goto L_0x003f;
    L_0x003c:
        r5.concat(r4);
    L_0x003f:
        defpackage.cno.a();
    L_0x0042:
        r4 = r2.d;
        if (r4 == 0) goto L_0x009e;
    L_0x0046:
        r4 = r4.isEmpty();
        if (r4 != 0) goto L_0x009e;
    L_0x004c:
        r4 = r2.d;
        r4 = r4.size();
        r5 = 0;
    L_0x0053:
        if (r5 >= r4) goto L_0x009e;
    L_0x0055:
        r6 = r2.d;
        r6 = r6.get(r5);
        r6 = (defpackage.cpd) r6;
        r6 = r6.d;
        if (r1 == 0) goto L_0x0065;
    L_0x0061:
        r6.x();
        goto L_0x009b;
    L_0x0065:
        r7 = defpackage.cma.e(r6);
        if (r7 == 0) goto L_0x009b;
    L_0x006b:
        if (r0 == 0) goto L_0x0089;
    L_0x006d:
        r7 = r6.b();
        r7 = java.lang.String.valueOf(r7);
        r8 = "preAllocateMountContent:";
        r9 = r7.length();
        if (r9 != 0) goto L_0x0083;
    L_0x007d:
        r7 = new java.lang.String;
        r7.<init>(r8);
        goto L_0x0086;
    L_0x0083:
        r8.concat(r7);
    L_0x0086:
        defpackage.cno.a();
    L_0x0089:
        r7 = r2.b;
        r7 = r7.b;
        r8 = defpackage.cnk.a(r7, r6);
        if (r8 == 0) goto L_0x0096;
    L_0x0093:
        r8.b(r7, r6);
    L_0x0096:
        if (r0 == 0) goto L_0x009b;
    L_0x0098:
        defpackage.cno.c();
    L_0x009b:
        r5 = r5 + 1;
        goto L_0x0053;
    L_0x009e:
        if (r0 == 0) goto L_0x00a3;
    L_0x00a0:
        defpackage.cno.c();
    L_0x00a3:
        if (r3 == 0) goto L_0x00a8;
    L_0x00a5:
        r3.e();
    L_0x00a8:
        return;
    L_0x00a9:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00a9 }
        goto L_0x00ad;
    L_0x00ac:
        throw r1;
    L_0x00ad:
        goto L_0x00ac;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmw.run():void");
    }
}
