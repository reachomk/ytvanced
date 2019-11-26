package defpackage;

/* renamed from: bdfj */
final class bdfj implements bcvk {
    private final /* synthetic */ bdfo a;

    bdfj(bdfo bdfo) {
        this.a = bdfo;
    }

    /* JADX WARNING: Missing block: B:14:0x001c, code skipped:
            if (r0 == null) goto L_0x005e;
     */
    /* JADX WARNING: Missing block: B:15:0x001e, code skipped:
            r4 = null;
            r5 = 1;
     */
    /* JADX WARNING: Missing block: B:16:0x0021, code skipped:
            if (r4 == null) goto L_0x0037;
     */
    /* JADX WARNING: Missing block: B:18:?, code skipped:
            r4 = r4.iterator();
     */
    /* JADX WARNING: Missing block: B:20:0x002b, code skipped:
            if (r4.hasNext() == false) goto L_0x0037;
     */
    /* JADX WARNING: Missing block: B:21:0x002d, code skipped:
            r8.c(r4.next());
     */
    /* JADX WARNING: Missing block: B:22:0x0035, code skipped:
            r0 = th;
     */
    /* JADX WARNING: Missing block: B:24:0x0037, code skipped:
            if (r5 == null) goto L_0x003c;
     */
    /* JADX WARNING: Missing block: B:25:0x0039, code skipped:
            r8.c(r0);
     */
    /* JADX WARNING: Missing block: B:26:0x003c, code skipped:
            monitor-enter(r8);
     */
    /* JADX WARNING: Missing block: B:28:?, code skipped:
            r4 = r8.c;
            r8.c = null;
     */
    /* JADX WARNING: Missing block: B:29:0x0041, code skipped:
            if (r4 != null) goto L_0x0049;
     */
    /* JADX WARNING: Missing block: B:30:0x0043, code skipped:
            r8.b = false;
     */
    /* JADX WARNING: Missing block: B:32:?, code skipped:
            monitor-exit(r8);
     */
    /* JADX WARNING: Missing block: B:33:0x0047, code skipped:
            r0 = th;
     */
    /* JADX WARNING: Missing block: B:35:?, code skipped:
            monitor-exit(r8);
     */
    /* JADX WARNING: Missing block: B:36:0x004a, code skipped:
            r5 = null;
     */
    /* JADX WARNING: Missing block: B:37:0x004c, code skipped:
            r0 = th;
     */
    /* JADX WARNING: Missing block: B:38:0x004d, code skipped:
            r2 = null;
     */
    /* JADX WARNING: Missing block: B:40:?, code skipped:
            monitor-exit(r8);
     */
    /* JADX WARNING: Missing block: B:42:?, code skipped:
            throw r0;
     */
    /* JADX WARNING: Missing block: B:43:0x0050, code skipped:
            r0 = th;
     */
    /* JADX WARNING: Missing block: B:44:0x0052, code skipped:
            r2 = null;
     */
    /* JADX WARNING: Missing block: B:45:0x0053, code skipped:
            if (r2 == null) goto L_0x0055;
     */
    /* JADX WARNING: Missing block: B:46:0x0055, code skipped:
            monitor-enter(r8);
     */
    /* JADX WARNING: Missing block: B:48:?, code skipped:
            r8.b = false;
     */
    /* JADX WARNING: Missing block: B:54:0x005d, code skipped:
            throw r0;
     */
    /* JADX WARNING: Missing block: B:55:0x005e, code skipped:
            return;
     */
    public final /* synthetic */ void a(java.lang.Object r8) {
        /*
        r7 = this;
        r8 = (defpackage.bdft) r8;
        r0 = r7.a;
        r0 = r0.a;
        monitor-enter(r8);
        r1 = r8.a;	 Catch:{ all -> 0x0061 }
        if (r1 == 0) goto L_0x005f;
    L_0x000b:
        r1 = r8.b;	 Catch:{ all -> 0x0061 }
        if (r1 == 0) goto L_0x0010;
    L_0x000f:
        goto L_0x005f;
    L_0x0010:
        r1 = 0;
        r8.a = r1;	 Catch:{ all -> 0x0061 }
        r2 = 1;
        if (r0 == 0) goto L_0x0018;
    L_0x0016:
        r3 = 1;
        goto L_0x0019;
    L_0x0018:
        r3 = 0;
    L_0x0019:
        r8.b = r3;	 Catch:{ all -> 0x0061 }
        monitor-exit(r8);	 Catch:{ all -> 0x0061 }
        if (r0 == 0) goto L_0x005e;
    L_0x001e:
        r3 = 0;
        r4 = r3;
        r5 = 1;
    L_0x0021:
        if (r4 == 0) goto L_0x0037;
    L_0x0023:
        r4 = r4.iterator();	 Catch:{ all -> 0x0035 }
    L_0x0027:
        r6 = r4.hasNext();	 Catch:{ all -> 0x0035 }
        if (r6 == 0) goto L_0x0037;
    L_0x002d:
        r6 = r4.next();	 Catch:{ all -> 0x0035 }
        r8.c(r6);	 Catch:{ all -> 0x0035 }
        goto L_0x0027;
    L_0x0035:
        r0 = move-exception;
        goto L_0x0052;
    L_0x0037:
        if (r5 == 0) goto L_0x003c;
    L_0x0039:
        r8.c(r0);	 Catch:{ all -> 0x0035 }
    L_0x003c:
        monitor-enter(r8);	 Catch:{ all -> 0x0035 }
        r4 = r8.c;	 Catch:{ all -> 0x004c }
        r8.c = r3;	 Catch:{ all -> 0x004c }
        if (r4 != 0) goto L_0x0049;
    L_0x0043:
        r8.b = r1;	 Catch:{ all -> 0x004c }
        monitor-exit(r8);	 Catch:{ all -> 0x0047 }
        goto L_0x005e;
    L_0x0047:
        r0 = move-exception;
        goto L_0x004e;
    L_0x0049:
        monitor-exit(r8);	 Catch:{ all -> 0x004c }
        r5 = 0;
        goto L_0x0021;
    L_0x004c:
        r0 = move-exception;
        r2 = 0;
    L_0x004e:
        monitor-exit(r8);	 Catch:{ all -> 0x0047 }
        throw r0;	 Catch:{ all -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        goto L_0x0053;
    L_0x0052:
        r2 = 0;
    L_0x0053:
        if (r2 != 0) goto L_0x005d;
    L_0x0055:
        monitor-enter(r8);
        r8.b = r1;	 Catch:{ all -> 0x005a }
        monitor-exit(r8);	 Catch:{ all -> 0x005a }
        goto L_0x005d;
    L_0x005a:
        r0 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x005a }
        throw r0;
    L_0x005d:
        throw r0;
    L_0x005e:
        return;
    L_0x005f:
        monitor-exit(r8);	 Catch:{ all -> 0x0061 }
        return;
    L_0x0061:
        r0 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x0061 }
        goto L_0x0065;
    L_0x0064:
        throw r0;
    L_0x0065:
        goto L_0x0064;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdfj.a(java.lang.Object):void");
    }
}
