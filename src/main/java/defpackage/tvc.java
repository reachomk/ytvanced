package defpackage;

/* renamed from: tvc */
final class tvc {
    public final ubf a;
    private final twe b;

    tvc(ubf ubf, twe twe) {
        this.a = ubf;
        this.b = twe;
    }

    /* JADX WARNING: Missing block: B:20:?, code skipped:
            r6.close();
     */
    public final defpackage.bces a(java.util.concurrent.Callable r5, defpackage.bccl r6, java.io.File r7) {
        /*
        r4 = this;
        r0 = defpackage.bces.e;
        r0 = r0.createBuilder();
        r0 = (defpackage.bcer) r0;
        r1 = 5;
        r0.a(r1);
        r5 = r5.call();	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r5 = (defpackage.bccq) r5;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r5 = r5.toBuilder();	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r5 = (defpackage.anxo) r5;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r5 = (defpackage.bccp) r5;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r5.copyOnWrite();	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r1 = r5.instance;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r1 = (defpackage.bccq) r1;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        if (r6 == 0) goto L_0x00b4;
    L_0x0023:
        r1.g = r6;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r6 = r1.a;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r6 = r6 | 2;
        r1.a = r6;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r5 = r5.build();	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r5 = (defpackage.anxl) r5;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r5 = (defpackage.bccq) r5;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r6 = r4.b;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r1 = defpackage.bcfe.x;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r1 = r1.createBuilder();	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r1 = (defpackage.bcfd) r1;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r1.copyOnWrite();	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r2 = r1.instance;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r2 = (defpackage.bcfe) r2;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        if (r5 == 0) goto L_0x00ae;
    L_0x0046:
        r2.t = r5;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r5 = r2.a;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r3 = 2097152; // 0x200000 float:2.938736E-39 double:1.0361308E-317;
        r5 = r5 | r3;
        r2.a = r5;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r5 = r1.build();	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r5 = (defpackage.anxl) r5;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r5 = (defpackage.bcfe) r5;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r5 = r6.a(r5);	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r6 = r5.getSerializedSize();	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r6 = r6 / 1024;
        r0.copyOnWrite();	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r1 = r0.instance;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r1 = (defpackage.bces) r1;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r2 = r1.a;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r2 = r2 | 2;
        r1.a = r2;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r1.c = r6;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r1 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        if (r6 > r1) goto L_0x00a1;
    L_0x0074:
        r6 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x008c }
        r6.<init>(r7);	 Catch:{ IOException -> 0x008c }
        r5.writeTo(r6);	 Catch:{ all -> 0x0080 }
        r6.close();	 Catch:{ IOException -> 0x008c }
        goto L_0x00c3;
    L_0x0080:
        r5 = move-exception;
        throw r5;	 Catch:{ all -> 0x0082 }
    L_0x0082:
        r1 = move-exception;
        r6.close();	 Catch:{ all -> 0x0087 }
        goto L_0x008b;
    L_0x0087:
        r6 = move-exception;
        defpackage.ankx.a(r5, r6);	 Catch:{ IOException -> 0x008c }
    L_0x008b:
        throw r1;	 Catch:{ IOException -> 0x008c }
    L_0x008c:
        r5 = move-exception;
        r6 = "HeapDumpProcessor";
        r1 = "Failed to write mini heap dump to file.";
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        defpackage.tyv.a(r6, r1, r5, r2);	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r5 = r7.exists();	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        if (r5 == 0) goto L_0x00c3;
    L_0x009d:
        r7.delete();	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        goto L_0x00c3;
    L_0x00a1:
        r5 = 4;
        r0.a(r5);	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r5 = r0.build();	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r5 = (defpackage.anxl) r5;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r5 = (defpackage.bces) r5;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        return r5;
    L_0x00ae:
        r5 = new java.lang.NullPointerException;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r5.<init>();	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        throw r5;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
    L_0x00b4:
        r5 = new java.lang.NullPointerException;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        r5.<init>();	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
        throw r5;	 Catch:{ OutOfMemoryError -> 0x00bf, Exception -> 0x00ba }
    L_0x00ba:
        r5 = 1;
        r0.a(r5);
        goto L_0x00c3;
    L_0x00bf:
        r5 = 3;
        r0.a(r5);
    L_0x00c3:
        r5 = r0.build();
        r5 = (defpackage.anxl) r5;
        r5 = (defpackage.bces) r5;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tvc.a(java.util.concurrent.Callable, bccl, java.io.File):bces");
    }
}
