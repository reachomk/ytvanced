package defpackage;

/* renamed from: oyq */
public final class oyq {
    private final String[] a;
    private boolean b;
    private boolean c;

    public oyq(String... strArr) {
        this.a = strArr;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x001d */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:15|16|(1:18)(1:19)|20) */
    /* JADX WARNING: Missing block: B:16:?, code skipped:
            r0 = java.lang.String.valueOf(java.util.Arrays.toString(r5.a));
            r1 = "Failed to load ";
     */
    /* JADX WARNING: Missing block: B:17:0x002d, code skipped:
            if (r0.length() == 0) goto L_0x002f;
     */
    /* JADX WARNING: Missing block: B:18:0x002f, code skipped:
            r0 = new java.lang.String(r1);
     */
    /* JADX WARNING: Missing block: B:19:0x0035, code skipped:
            r0 = r1.concat(r0);
     */
    /* JADX WARNING: Missing block: B:20:0x0039, code skipped:
            defpackage.oyp.a("LibraryLoader", r0);
     */
    public final synchronized boolean a() {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.b;	 Catch:{ all -> 0x0042 }
        if (r0 == 0) goto L_0x0009;
    L_0x0005:
        r0 = r5.c;	 Catch:{ all -> 0x0042 }
        monitor-exit(r5);
        return r0;
    L_0x0009:
        r0 = 1;
        r5.b = r0;	 Catch:{ all -> 0x0042 }
        r1 = r5.a;	 Catch:{ UnsatisfiedLinkError -> 0x001d }
        r2 = r1.length;	 Catch:{ UnsatisfiedLinkError -> 0x001d }
        r3 = 0;
    L_0x0010:
        if (r3 >= r2) goto L_0x001a;
    L_0x0012:
        r4 = r1[r3];	 Catch:{ UnsatisfiedLinkError -> 0x001d }
        java.lang.System.loadLibrary(r4);	 Catch:{ UnsatisfiedLinkError -> 0x001d }
        r3 = r3 + 1;
        goto L_0x0010;
    L_0x001a:
        r5.c = r0;	 Catch:{ UnsatisfiedLinkError -> 0x001d }
        goto L_0x003e;
    L_0x001d:
        r0 = r5.a;	 Catch:{ all -> 0x0042 }
        r0 = java.util.Arrays.toString(r0);	 Catch:{ all -> 0x0042 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0042 }
        r1 = "Failed to load ";
        r2 = r0.length();	 Catch:{ all -> 0x0042 }
        if (r2 != 0) goto L_0x0035;
    L_0x002f:
        r0 = new java.lang.String;	 Catch:{ all -> 0x0042 }
        r0.<init>(r1);	 Catch:{ all -> 0x0042 }
        goto L_0x0039;
    L_0x0035:
        r0 = r1.concat(r0);	 Catch:{ all -> 0x0042 }
    L_0x0039:
        r1 = "LibraryLoader";
        defpackage.oyp.a(r1, r0);	 Catch:{ all -> 0x0042 }
    L_0x003e:
        r0 = r5.c;	 Catch:{ all -> 0x0042 }
        monitor-exit(r5);
        return r0;
    L_0x0042:
        r0 = move-exception;
        monitor-exit(r5);
        goto L_0x0046;
    L_0x0045:
        throw r0;
    L_0x0046:
        goto L_0x0045;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oyq.a():boolean");
    }
}
