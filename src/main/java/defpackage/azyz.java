package defpackage;

import java.util.concurrent.Callable;

/* renamed from: azyz */
final class azyz implements Callable {
    private final /* synthetic */ azyw a;

    azyz(azyw azyw) {
        this.a = azyw;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0109 A:{Catch:{ azzj -> 0x0126, all -> 0x0117 }} */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0103 A:{Catch:{ azzj -> 0x0126, all -> 0x0117 }} */
    public final /* synthetic */ java.lang.Object call() {
        /*
        r10 = this;
        r0 = r10.a;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        monitor-enter(r0);	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r1 = r0.j;	 Catch:{ all -> 0x0114 }
        if (r1 == 0) goto L_0x000a;
    L_0x0007:
        r1.a();	 Catch:{ all -> 0x0114 }
    L_0x000a:
        monitor-exit(r0);	 Catch:{ all -> 0x0114 }
        r0.b();	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r1 = new java.util.Random;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r1.<init>();	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r2 = new java.lang.StringBuilder;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r2.<init>();	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r3 = 0;
    L_0x0019:
        r4 = 70;
        if (r3 >= r4) goto L_0x002e;
    L_0x001d:
        r4 = defpackage.azyw.a;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r5 = defpackage.azyw.a;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r5 = r5.length;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r5 = r1.nextInt(r5);	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r4 = r4[r5];	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r2.append(r4);	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r3 = r3 + 1;
        goto L_0x0019;
    L_0x002e:
        r7 = r2.toString();	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r4 = new azyn;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r4.<init>();	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r8 = new azyn;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r8.<init>();	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r1 = r0.d;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r1 = r1.a();	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r1 = r1.iterator();	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
    L_0x0046:
        r2 = r1.hasNext();	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        if (r2 == 0) goto L_0x0072;
    L_0x004c:
        r2 = r1.next();	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r2 = (java.lang.String) r2;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r3 = r2.toLowerCase();	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r5 = "content-";
        r3 = r3.startsWith(r5);	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        if (r3 == 0) goto L_0x0068;
    L_0x005e:
        r3 = r0.d;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r3 = r3.b(r2);	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r4.a(r2, r3);	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        goto L_0x0046;
    L_0x0068:
        r3 = r0.d;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r3 = r3.b(r2);	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r8.a(r2, r3);	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        goto L_0x0046;
    L_0x0072:
        r9 = new azyx;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r3 = r0.e;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r5 = r0.f;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r6 = r0.h;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r1 = r9;
        r2 = r7;
        r1.<init>(r2, r3, r4, r5, r6);	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r1 = "X-Goog-Upload-Protocol";
        r2 = "multipart";
        r8.a(r1, r2);	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r1 = java.lang.String.valueOf(r7);	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r2 = "multipart/related; boundary=";
        r3 = r1.length();	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        if (r3 != 0) goto L_0x0098;
    L_0x0092:
        r1 = new java.lang.String;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r1.<init>(r2);	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        goto L_0x009c;
    L_0x0098:
        r1 = r2.concat(r1);	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
    L_0x009c:
        r2 = "Content-Type";
        r8.a(r2, r1);	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r1 = r0.g;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r2 = r0.b;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r3 = r0.c;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r1 = r1.a(r2, r3, r8, r9);	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r2 = r0.j;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        if (r2 == 0) goto L_0x00c3;
    L_0x00af:
        monitor-enter(r0);	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r2 = new azyy;	 Catch:{ all -> 0x00c0 }
        r3 = r0.j;	 Catch:{ all -> 0x00c0 }
        r2.<init>(r0, r3);	 Catch:{ all -> 0x00c0 }
        r3 = r0.k;	 Catch:{ all -> 0x00c0 }
        r4 = r0.l;	 Catch:{ all -> 0x00c0 }
        r1.a(r2, r3, r4);	 Catch:{ all -> 0x00c0 }
        monitor-exit(r0);	 Catch:{ all -> 0x00c0 }
        goto L_0x00c3;
    L_0x00c0:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00c0 }
        throw r1;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
    L_0x00c3:
        monitor-enter(r0);	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r0.i = r1;	 Catch:{ all -> 0x0111 }
        r1 = r1.a();	 Catch:{ all -> 0x0111 }
        monitor-exit(r0);	 Catch:{ all -> 0x0111 }
        r1 = r1.get();	 Catch:{ InterruptedException -> 0x00f0, ExecutionException -> 0x00ee }
        r1 = (defpackage.azzl) r1;	 Catch:{ InterruptedException -> 0x00f0, ExecutionException -> 0x00ee }
        r2 = r1.a();	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        if (r2 != 0) goto L_0x00d8;
    L_0x00d7:
        goto L_0x00e3;
    L_0x00d8:
        r2 = r1.a;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r2 = r2.a;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r3 = defpackage.azzi.CANCELED;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        if (r2 != r3) goto L_0x00eb;
    L_0x00e0:
        r0.b();	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
    L_0x00e3:
        r0 = r1.b;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r1 = new azzl;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r1.<init>(r0);	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        goto L_0x012c;
    L_0x00eb:
        r0 = r1.a;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        throw r0;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
    L_0x00ee:
        r0 = move-exception;
        goto L_0x00f1;
    L_0x00f0:
        r0 = move-exception;
    L_0x00f1:
        r1 = new java.lang.RuntimeException;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r0 = r0.getMessage();	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r2 = "Unexpected error occurred: ";
        r3 = r0.length();	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        if (r3 != 0) goto L_0x0109;
    L_0x0103:
        r0 = new java.lang.String;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        r0.<init>(r2);	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        goto L_0x010d;
    L_0x0109:
        r0 = r2.concat(r0);	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
    L_0x010d:
        r1.<init>(r0);	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
        throw r1;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
    L_0x0111:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0111 }
        throw r1;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
    L_0x0114:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0114 }
        throw r1;	 Catch:{ azzj -> 0x0126, all -> 0x0117 }
    L_0x0117:
        r0 = move-exception;
        r1 = new azzj;
        r2 = defpackage.azzi.UNKNOWN;
        r1.<init>(r2, r0);
        r0 = new azzl;
        r0.<init>(r1);
        r1 = r0;
        goto L_0x012c;
    L_0x0126:
        r0 = move-exception;
        r1 = new azzl;
        r1.<init>(r0);
    L_0x012c:
        r0 = r10.a;
        monitor-enter(r0);
        r2 = r10.a;	 Catch:{ all -> 0x014c }
        r2 = r2.j;	 Catch:{ all -> 0x014c }
        if (r2 == 0) goto L_0x014a;
    L_0x0135:
        r2 = r1.b();	 Catch:{ all -> 0x014c }
        if (r2 == 0) goto L_0x0143;
    L_0x013b:
        r2 = r10.a;	 Catch:{ all -> 0x014c }
        r3 = r2.j;	 Catch:{ all -> 0x014c }
        r3.b(r2);	 Catch:{ all -> 0x014c }
        goto L_0x014a;
    L_0x0143:
        r2 = r10.a;	 Catch:{ all -> 0x014c }
        r3 = r2.j;	 Catch:{ all -> 0x014c }
        r3.c(r2);	 Catch:{ all -> 0x014c }
    L_0x014a:
        monitor-exit(r0);	 Catch:{ all -> 0x014c }
        return r1;
    L_0x014c:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x014c }
        goto L_0x0150;
    L_0x014f:
        throw r1;
    L_0x0150:
        goto L_0x014f;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azyz.call():java.lang.Object");
    }
}
