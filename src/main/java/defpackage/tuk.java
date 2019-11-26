package defpackage;

import java.io.File;

/* renamed from: tuk */
final class tuk implements Runnable {
    private final File a;
    private final bcax b;
    private final Float c;
    private final Long d;
    private final Long e;
    private final /* synthetic */ tul f;

    tuk(tul tul, File file, bcax bcax, Float f, Long l, Long l2) {
        this.f = tul;
        this.a = file;
        this.b = bcax;
        this.c = f;
        this.d = l;
        this.e = l2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0120 A:{Catch:{ IOException -> 0x0124 }} */
    public final void run() {
        /*
        r13 = this;
        r0 = r13.f;
        r0 = r0.d;
        r1 = 0;
        r0.set(r1);
        android.os.Debug.stopMethodTracing();
        r0 = r13.f;
        r0 = r0.k;
        r2 = r0.a();
        r0 = java.lang.Long.valueOf(r2);
        r2 = r0.longValue();
        r4 = r13.d;
        r4 = r4.longValue();
        r6 = r13.f;
        r7 = r6.i;
        r7 = (long) r7;
        r4 = r4 + r7;
        r7 = 1;
        r8 = "CpuProfilingService";
        r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r9 >= 0) goto L_0x0209;
    L_0x002e:
        r2 = r6.a;
        r3 = r6.j;
        r4 = 0;
        r2 = r2.registerReceiver(r4, r3);
        r3 = r13.b;
        r3 = r3.toBuilder();
        r3 = (defpackage.anxo) r3;
        r3 = (defpackage.bcba) r3;
        r5 = r13.f;
        r5 = r5.a(r2);
        r3.copyOnWrite();
        r6 = r3.instance;
        r6 = (defpackage.bcax) r6;
        if (r5 == 0) goto L_0x0203;
    L_0x0050:
        r6.c = r5;
        r5 = r6.a;
        r5 = r5 | 2;
        r6.a = r5;
        r5 = r13.c;
        r5 = r5.floatValue();
        r2 = defpackage.tul.b(r2);
        r3.copyOnWrite();
        r6 = r3.instance;
        r6 = (defpackage.bcax) r6;
        r9 = r6.a;
        r9 = r9 | 4;
        r6.a = r9;
        r5 = r5 - r2;
        r6.d = r5;
        r2 = r3.build();
        r2 = (defpackage.anxl) r2;
        r2 = (defpackage.bcax) r2;
        r3 = defpackage.bcav.i;
        r3 = r3.createBuilder();
        r3 = (defpackage.bcay) r3;
        r3.copyOnWrite();
        r5 = r3.instance;
        r5 = (defpackage.bcav) r5;
        if (r2 == 0) goto L_0x01fd;
    L_0x008b:
        r5.c = r2;
        r2 = r5.a;
        r2 = r2 | 2;
        r5.a = r2;
        r2 = r13.a;
        if (r2 == 0) goto L_0x0148;
    L_0x0097:
        r2 = r2.exists();
        if (r2 == 0) goto L_0x0148;
    L_0x009d:
        r2 = r13.a;	 Catch:{ IOException -> 0x0124 }
        r5 = r13.f;	 Catch:{ IOException -> 0x0124 }
        r5 = r5.e;	 Catch:{ IOException -> 0x0124 }
        r9 = r2.length();	 Catch:{ all -> 0x011d }
        r11 = 0;
        r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r6 <= 0) goto L_0x00cf;
    L_0x00ad:
        r5 = (long) r5;	 Catch:{ all -> 0x011d }
        r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1));
        if (r11 > 0) goto L_0x00cf;
    L_0x00b2:
        r5 = (int) r9;	 Catch:{ all -> 0x011d }
        r6 = new byte[r5];	 Catch:{ all -> 0x011d }
        r9 = new java.io.FileInputStream;	 Catch:{ all -> 0x011d }
        r9.<init>(r2);	 Catch:{ all -> 0x011d }
        r2 = 0;
    L_0x00bb:
        if (r2 >= r5) goto L_0x00c5;
    L_0x00bd:
        r4 = r5 - r2;
        r4 = r9.read(r6, r2, r4);	 Catch:{ all -> 0x00cc }
        r2 = r2 + r4;
        goto L_0x00bb;
    L_0x00c5:
        r9.close();	 Catch:{ all -> 0x00cc }
        r9.close();	 Catch:{ IOException -> 0x0124 }
        goto L_0x00d1;
    L_0x00cc:
        r2 = move-exception;
        r4 = r9;
        goto L_0x011e;
    L_0x00cf:
        r6 = new byte[r1];	 Catch:{ IOException -> 0x0124 }
    L_0x00d1:
        r2 = new java.util.zip.Deflater;	 Catch:{ IOException -> 0x0124 }
        r4 = 9;
        r2.<init>(r4);	 Catch:{ IOException -> 0x0124 }
        r2.setInput(r6);	 Catch:{ IOException -> 0x0124 }
        r4 = new java.io.ByteArrayOutputStream;	 Catch:{ IOException -> 0x0124 }
        r5 = r6.length;	 Catch:{ IOException -> 0x0124 }
        r4.<init>(r5);	 Catch:{ IOException -> 0x0124 }
        r2.finish();	 Catch:{ IOException -> 0x0124 }
        r5 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r5 = new byte[r5];	 Catch:{ IOException -> 0x0124 }
    L_0x00e8:
        r6 = r2.finished();	 Catch:{ IOException -> 0x0124 }
        if (r6 != 0) goto L_0x00f6;
    L_0x00ee:
        r6 = r2.deflate(r5);	 Catch:{ IOException -> 0x0124 }
        r4.write(r5, r1, r6);	 Catch:{ IOException -> 0x0124 }
        goto L_0x00e8;
    L_0x00f6:
        r4.close();	 Catch:{ IOException -> 0x0124 }
        r2 = r4.toByteArray();	 Catch:{ IOException -> 0x0124 }
        r2 = defpackage.anvu.a(r2);	 Catch:{ IOException -> 0x0124 }
        r3.copyOnWrite();	 Catch:{ IOException -> 0x0124 }
        r4 = r3.instance;	 Catch:{ IOException -> 0x0124 }
        r4 = (defpackage.bcav) r4;	 Catch:{ IOException -> 0x0124 }
        if (r2 == 0) goto L_0x0117;
    L_0x010a:
        r5 = r4.a;	 Catch:{ IOException -> 0x0124 }
        r5 = r5 | r7;
        r4.a = r5;	 Catch:{ IOException -> 0x0124 }
        r4.b = r2;	 Catch:{ IOException -> 0x0124 }
        r2 = r13.f;	 Catch:{ IOException -> 0x0124 }
        r2.i();	 Catch:{ IOException -> 0x0124 }
        goto L_0x014f;
    L_0x0117:
        r2 = new java.lang.NullPointerException;	 Catch:{ IOException -> 0x0124 }
        r2.<init>();	 Catch:{ IOException -> 0x0124 }
        throw r2;	 Catch:{ IOException -> 0x0124 }
    L_0x011d:
        r2 = move-exception;
    L_0x011e:
        if (r4 == 0) goto L_0x0123;
    L_0x0120:
        r4.close();	 Catch:{ IOException -> 0x0124 }
    L_0x0123:
        throw r2;	 Catch:{ IOException -> 0x0124 }
    L_0x0124:
        r2 = move-exception;
        r4 = r13.a;
        r4 = java.lang.String.valueOf(r4);
        r5 = r4.length();
        r6 = new java.lang.StringBuilder;
        r5 = r5 + 20;
        r6.<init>(r5);
        r5 = "Unable to read file ";
        r6.append(r5);
        r6.append(r4);
        r4 = r6.toString();
        r1 = new java.lang.Object[r1];
        defpackage.tyv.c(r8, r4, r2, r1);
        goto L_0x014f;
    L_0x0148:
        r1 = new java.lang.Object[r1];
        r2 = "Missing trace file";
        defpackage.tyv.e(r8, r2, r1);
    L_0x014f:
        r1 = r13.f;
        r1 = r1.h;
        r3.copyOnWrite();
        r4 = r3.instance;
        r4 = (defpackage.bcav) r4;
        r5 = r4.a;
        r5 = r5 | 4;
        r4.a = r5;
        r4.d = r1;
        r1 = r13.f;
        r1 = r1.f;
        r3.copyOnWrite();
        r2 = r3.instance;
        r2 = (defpackage.bcav) r2;
        r4 = r2.a;
        r4 = r4 | 32;
        r2.a = r4;
        r2.g = r1;
        r1 = r0.longValue();
        r4 = r13.e;
        r4 = r4.longValue();
        r1 = r1 - r4;
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
        if (r6 >= 0) goto L_0x0197;
    L_0x0187:
        r0 = r0.longValue();
        r2 = r13.e;
        r4 = r2.longValue();
        r0 = r0 - r4;
        r1 = (int) r0;
        r3.a(r1);
        goto L_0x019b;
    L_0x0197:
        r0 = -1;
        r3.a(r0);
    L_0x019b:
        r0 = r13.f;
        r0 = r0.g;
        r3.copyOnWrite();
        r1 = r3.instance;
        r1 = (defpackage.bcav) r1;
        r2 = r1.a;
        r2 = r2 | 8;
        r1.a = r2;
        r1.e = r0;
        r0 = r13.f;
        r0 = r0.e;
        r3.copyOnWrite();
        r1 = r3.instance;
        r1 = (defpackage.bcav) r1;
        r2 = r1.a;
        r2 = r2 | 64;
        r1.a = r2;
        r1.h = r0;
        r0 = r1.b;
        r0 = r0.b();
        if (r0 > 0) goto L_0x01ca;
    L_0x01c9:
        goto L_0x01f7;
    L_0x01ca:
        r0 = defpackage.bcfe.x;
        r0 = r0.createBuilder();
        r0 = (defpackage.bcfd) r0;
        r0.copyOnWrite();
        r1 = r0.instance;
        r1 = (defpackage.bcfe) r1;
        r2 = r3.build();
        r2 = (defpackage.anxl) r2;
        r2 = (defpackage.bcav) r2;
        r1.r = r2;
        r2 = r1.a;
        r3 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r2 = r2 | r3;
        r1.a = r2;
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.bcfe) r0;
        r1 = r13.f;
        r1.a(r0);
    L_0x01f7:
        r0 = r13.f;
        r0.g();
        return;
    L_0x01fd:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        throw r0;
    L_0x0203:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        throw r0;
    L_0x0209:
        r6.g();
        r2 = new java.lang.Long[r7];
        r3 = r0.longValue();
        r0 = r13.d;
        r5 = r0.longValue();
        r3 = r3 - r5;
        r0 = java.lang.Long.valueOf(r3);
        r2[r1] = r0;
        r0 = "Missed sample window by %d ms";
        defpackage.tyv.d(r8, r0, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tuk.run():void");
    }
}
