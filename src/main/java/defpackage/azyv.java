package defpackage;

import java.util.concurrent.Callable;

/* renamed from: azyv */
final class azyv implements Callable {
    private final /* synthetic */ azys a;

    azyv(azys azys) {
        this.a = azys;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0056 */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing block: B:32:?, code skipped:
            r0 = r0.b();
     */
    public final /* synthetic */ java.lang.Object call() {
        /*
        r14 = this;
        r0 = r14.a;	 Catch:{ azzj -> 0x00c3 }
        monitor-enter(r0);	 Catch:{ azzj -> 0x00c3 }
        r1 = r0.e;	 Catch:{ all -> 0x00c0 }
        if (r1 == 0) goto L_0x000a;
    L_0x0007:
        r1.a();	 Catch:{ all -> 0x00c0 }
    L_0x000a:
        monitor-exit(r0);	 Catch:{ all -> 0x00c0 }
        r0.d();	 Catch:{ azzj -> 0x00c3 }
        r1 = r0.a;	 Catch:{ FileNotFoundException -> 0x00b7, IOException -> 0x0094 }
        r1 = r1.getOutputStream();	 Catch:{ FileNotFoundException -> 0x00b7, IOException -> 0x0094 }
        r2 = r0.a;	 Catch:{ FileNotFoundException -> 0x00b7, IOException -> 0x0094 }
        r2.connect();	 Catch:{ FileNotFoundException -> 0x00b7, IOException -> 0x0094 }
        r2 = r0.b;	 Catch:{ azzj -> 0x00c3 }
        if (r2 != 0) goto L_0x0023;
    L_0x001d:
        r0 = r0.b();	 Catch:{ azzj -> 0x00c3 }
        goto L_0x0099;
    L_0x0023:
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ azzj -> 0x00c3 }
        r4 = 0;
        r5 = r2;
    L_0x0029:
        r2 = 0;
    L_0x002a:
        r3 = r0.c();	 Catch:{ azzj -> 0x00c3 }
        if (r3 == 0) goto L_0x008f;
    L_0x0030:
        r0.d();	 Catch:{ azzj -> 0x00c3 }
        r3 = 0;
    L_0x0034:
        r7 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        if (r3 >= r7) goto L_0x0064;
    L_0x0038:
        r8 = r0.c();	 Catch:{ azzj -> 0x00c3 }
        if (r8 == 0) goto L_0x0064;
    L_0x003e:
        r8 = r0.b;	 Catch:{ IOException -> 0x005b }
        r9 = r0.c;	 Catch:{ IOException -> 0x005b }
        r7 = r7 - r3;
        r7 = r8.a(r9, r3, r7);	 Catch:{ IOException -> 0x005b }
        r8 = r0.d;	 Catch:{ IOException -> 0x005b }
        r10 = (long) r7;	 Catch:{ IOException -> 0x005b }
        r8 = r8 + r10;
        r0.d = r8;	 Catch:{ IOException -> 0x005b }
        r3 = r3 + r7;
        r8 = r0.c;	 Catch:{ IOException -> 0x0056 }
        r9 = r3 - r7;
        r1.write(r8, r9, r7);	 Catch:{ IOException -> 0x0056 }
        goto L_0x0034;
    L_0x0056:
        r0 = r0.b();	 Catch:{ azzj -> 0x00c3 }
        goto L_0x0099;
    L_0x005b:
        r0 = move-exception;
        r1 = new azzj;	 Catch:{ azzj -> 0x00c3 }
        r2 = defpackage.azzi.REQUEST_BODY_READ_ERROR;	 Catch:{ azzj -> 0x00c3 }
        r1.<init>(r2, r0);	 Catch:{ azzj -> 0x00c3 }
        throw r1;	 Catch:{ azzj -> 0x00c3 }
    L_0x0064:
        r2 = r2 + r3;
        r3 = r0.f;	 Catch:{ azzj -> 0x00c3 }
        if (r2 < r3) goto L_0x002a;
    L_0x0069:
        r3 = r0.g;	 Catch:{ azzj -> 0x00c3 }
        r7 = 1;
        if (r3 > 0) goto L_0x006f;
    L_0x006e:
        goto L_0x007f;
    L_0x006f:
        r8 = java.lang.System.currentTimeMillis();	 Catch:{ azzj -> 0x00c3 }
        r10 = r8 - r5;
        r3 = r0.g;	 Catch:{ azzj -> 0x00c3 }
        r12 = (long) r3;	 Catch:{ azzj -> 0x00c3 }
        r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r3 >= 0) goto L_0x007e;
    L_0x007c:
        r7 = 0;
        goto L_0x007f;
    L_0x007e:
        r5 = r8;
    L_0x007f:
        if (r7 != 0) goto L_0x0082;
    L_0x0081:
        goto L_0x002a;
    L_0x0082:
        monitor-enter(r0);	 Catch:{ azzj -> 0x00c3 }
        r2 = r0.e;	 Catch:{ all -> 0x008c }
        if (r2 == 0) goto L_0x008a;
    L_0x0087:
        r2.a(r0);	 Catch:{ all -> 0x008c }
    L_0x008a:
        monitor-exit(r0);	 Catch:{ all -> 0x008c }
        goto L_0x0029;
    L_0x008c:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x008c }
        throw r1;	 Catch:{ azzj -> 0x00c3 }
    L_0x008f:
        r0 = r0.b();	 Catch:{ azzj -> 0x00c3 }
        goto L_0x0099;
    L_0x0094:
        r1 = move-exception;
        r0 = r0.b();	 Catch:{ azzj -> 0x00af }
    L_0x0099:
        r1 = r14.a;	 Catch:{ azzj -> 0x00c3 }
        monitor-enter(r1);	 Catch:{ azzj -> 0x00c3 }
        r2 = r14.a;	 Catch:{ all -> 0x00ac }
        r3 = r2.e;	 Catch:{ all -> 0x00ac }
        if (r3 == 0) goto L_0x00a5;
    L_0x00a2:
        r3.b(r2);	 Catch:{ all -> 0x00ac }
    L_0x00a5:
        monitor-exit(r1);	 Catch:{ all -> 0x00ac }
        r1 = new azzl;	 Catch:{ azzj -> 0x00c3 }
        r1.<init>(r0);	 Catch:{ azzj -> 0x00c3 }
        goto L_0x00d6;
    L_0x00ac:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00ac }
        throw r0;	 Catch:{ azzj -> 0x00c3 }
    L_0x00af:
        r0 = new azzj;	 Catch:{ azzj -> 0x00c3 }
        r2 = defpackage.azzi.CONNECTION_ERROR;	 Catch:{ azzj -> 0x00c3 }
        r0.<init>(r2, r1);	 Catch:{ azzj -> 0x00c3 }
        throw r0;	 Catch:{ azzj -> 0x00c3 }
    L_0x00b7:
        r0 = move-exception;
        r1 = new azzj;	 Catch:{ azzj -> 0x00c3 }
        r2 = defpackage.azzi.BAD_URL;	 Catch:{ azzj -> 0x00c3 }
        r1.<init>(r2, r0);	 Catch:{ azzj -> 0x00c3 }
        throw r1;	 Catch:{ azzj -> 0x00c3 }
    L_0x00c0:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00c0 }
        throw r1;	 Catch:{ azzj -> 0x00c3 }
    L_0x00c3:
        r0 = move-exception;
        r1 = r14.a;
        monitor-enter(r1);
        r2 = r14.a;	 Catch:{ all -> 0x00d7 }
        r3 = r2.e;	 Catch:{ all -> 0x00d7 }
        if (r3 == 0) goto L_0x00d0;
    L_0x00cd:
        r3.c(r2);	 Catch:{ all -> 0x00d7 }
    L_0x00d0:
        monitor-exit(r1);	 Catch:{ all -> 0x00d7 }
        r1 = new azzl;
        r1.<init>(r0);
    L_0x00d6:
        return r1;
    L_0x00d7:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00d7 }
        goto L_0x00db;
    L_0x00da:
        throw r0;
    L_0x00db:
        goto L_0x00da;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azyv.call():java.lang.Object");
    }
}
