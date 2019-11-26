package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: amfl */
public final /* synthetic */ class amfl implements Runnable {
    private final amfj a;
    private final AtomicReference b;

    public amfl(amfj amfj, AtomicReference atomicReference) {
        this.a = amfj;
        this.b = atomicReference;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:81:0x0155=Splitter:B:81:0x0155, B:74:0x013a=Splitter:B:74:0x013a} */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0162 A:{Splitter:B:1:0x0006, ExcHandler: IOException (r0_9 'e' java.lang.Exception)} */
    /* JADX WARNING: Missing block: B:88:0x0162, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:89:0x0163, code skipped:
            r2.set(defpackage.amfq.a(r0));
     */
    /* JADX WARNING: Missing block: B:90:0x016a, code skipped:
            return;
     */
    public final void run() {
        /*
        r17 = this;
        r1 = r17;
        r0 = r1.a;
        r2 = r1.b;
        r3 = r0.a;	 Catch:{ InterruptedException -> 0x016b, IOException -> 0x0162 }
        r4 = r3.a;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r5 = new bcgt;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r5.<init>();	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r6 = -1;
        r5.a = r6;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r5.b = r6;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r6 = r4.getTrackCount();	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r8 = 0;
    L_0x0019:
        if (r8 >= r6) goto L_0x004f;
    L_0x001b:
        r9 = r4.getTrackFormat(r8);	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r10 = "mime";
        r9 = r9.getString(r10);	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r10 = r5.a;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        if (r10 >= 0) goto L_0x0034;
    L_0x0029:
        r10 = "video/";
        r10 = r9.startsWith(r10);	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        if (r10 == 0) goto L_0x0034;
    L_0x0031:
        r5.a = r8;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        goto L_0x0042;
    L_0x0034:
        r10 = r5.b;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        if (r10 >= 0) goto L_0x0042;
    L_0x0038:
        r10 = "audio/";
        r9 = r9.startsWith(r10);	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        if (r9 == 0) goto L_0x0042;
    L_0x0040:
        r5.b = r8;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
    L_0x0042:
        r9 = r5.a;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        if (r9 >= 0) goto L_0x0047;
    L_0x0046:
        goto L_0x004c;
    L_0x0047:
        r9 = r5.b;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        if (r9 < 0) goto L_0x004c;
    L_0x004b:
        goto L_0x004f;
    L_0x004c:
        r8 = r8 + 1;
        goto L_0x0019;
    L_0x004f:
        r4 = r5.a;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        if (r4 < 0) goto L_0x0155;
    L_0x0053:
        r4 = r5.b;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        if (r4 < 0) goto L_0x0155;
    L_0x0057:
        r4 = new bcgz;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r6 = r3.g;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r4.<init>(r6);	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r6 = new bchg;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r8 = r3.a;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r9 = r5.a;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r10 = r3.c;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r6.<init>(r8, r9, r10, r4);	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r3.e = r6;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r6 = r3.e;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r6.a();	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r6 = new bcha;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r8 = r3.a;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r9 = r5.b;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r10 = defpackage.bchb.AUDIO;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r6.<init>(r8, r9, r4, r10);	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r3.f = r6;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r4 = r3.a;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r6 = r5.a;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r4.selectTrack(r6);	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r4 = r3.a;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r5 = r5.b;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r4.selectTrack(r5);	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r4 = r3.b;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r8 = 0;
        r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r6 > 0) goto L_0x009c;
    L_0x0093:
        r4 = r3.d;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        if (r4 == 0) goto L_0x009c;
    L_0x0097:
        r5 = -4616189618054758400; // 0xbff0000000000000 float:0.0 double:-1.0;
        r4.a(r5);	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
    L_0x009c:
        r4 = r8;
    L_0x009d:
        r6 = r3.h;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        if (r6 != 0) goto L_0x0131;
    L_0x00a1:
        r6 = r3.e;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r6 = r6.d();	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        if (r6 == 0) goto L_0x00b1;
    L_0x00a9:
        r6 = r3.f;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r6 = r6.d();	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        if (r6 != 0) goto L_0x0131;
    L_0x00b1:
        r6 = r3.e;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r6 = r6.b();	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r10 = 1;
        if (r6 != 0) goto L_0x00c4;
    L_0x00ba:
        r6 = r3.f;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r6 = r6.b();	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        if (r6 == 0) goto L_0x00c3;
    L_0x00c2:
        goto L_0x00c4;
    L_0x00c3:
        r10 = 0;
    L_0x00c4:
        r11 = 1;
        r4 = r4 + r11;
        r11 = r3.b;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r13 = 10;
        r6 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1));
        if (r6 <= 0) goto L_0x0122;
    L_0x00cf:
        r11 = r4 % r13;
        r6 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1));
        if (r6 != 0) goto L_0x0122;
    L_0x00d5:
        r6 = r3.e;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r6 = r6.d();	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r11 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        if (r6 != 0) goto L_0x00f5;
    L_0x00df:
        r6 = r3.e;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r8 = r6.c();	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r8 = (double) r8;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r13 = r3.b;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r13 = (double) r13;
        java.lang.Double.isNaN(r8);
        java.lang.Double.isNaN(r13);
        r8 = r8 / r13;
        r8 = java.lang.Math.min(r11, r8);	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        goto L_0x00f6;
    L_0x00f5:
        r8 = r11;
    L_0x00f6:
        r6 = r3.f;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r6 = r6.d();	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        if (r6 != 0) goto L_0x0115;
    L_0x00fe:
        r6 = r3.f;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r13 = r6.c();	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r13 = (double) r13;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r15 = r8;
        r7 = r3.b;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r7 = (double) r7;
        java.lang.Double.isNaN(r13);
        java.lang.Double.isNaN(r7);
        r13 = r13 / r7;
        r11 = java.lang.Math.min(r11, r13);	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        goto L_0x0116;
    L_0x0115:
        r15 = r8;
    L_0x0116:
        r8 = r15 + r11;
        r11 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r8 = r8 / r11;
        r7 = r3.d;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        if (r7 == 0) goto L_0x0122;
    L_0x011f:
        r7.a(r8);	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
    L_0x0122:
        if (r10 != 0) goto L_0x012d;
    L_0x0124:
        r7 = r3.h;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        if (r7 != 0) goto L_0x012d;
    L_0x0128:
        r7 = 10;
        java.lang.Thread.sleep(r7);	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
    L_0x012d:
        r8 = 0;
        goto L_0x009d;
    L_0x0131:
        r4 = r3.h;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        if (r4 != 0) goto L_0x013a;
    L_0x0135:
        r4 = r3.g;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r4.b();	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
    L_0x013a:
        r3.b();	 Catch:{ InterruptedException -> 0x016b, IOException -> 0x0162 }
        r0 = r0.a;	 Catch:{ InterruptedException -> 0x016b, IOException -> 0x0162 }
        r0 = r0.h;	 Catch:{ InterruptedException -> 0x016b, IOException -> 0x0162 }
        if (r0 == 0) goto L_0x014c;
    L_0x0143:
        r0 = 2;
        r0 = defpackage.amfq.a(r0);	 Catch:{ InterruptedException -> 0x016b, IOException -> 0x0162 }
        r2.set(r0);	 Catch:{ InterruptedException -> 0x016b, IOException -> 0x0162 }
        return;
    L_0x014c:
        r0 = 0;
        r0 = defpackage.amfq.a(r0);	 Catch:{ InterruptedException -> 0x016b, IOException -> 0x0162 }
        r2.set(r0);	 Catch:{ InterruptedException -> 0x016b, IOException -> 0x0162 }
        return;
    L_0x0155:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        r4 = "extractor does not contain video and/or audio tracks.";
        r0.<init>(r4);	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
        throw r0;	 Catch:{ InterruptedException -> 0x015d, IOException -> 0x0162 }
    L_0x015d:
        r0 = move-exception;
        r3.b();	 Catch:{ InterruptedException -> 0x016b, IOException -> 0x0162 }
        throw r0;	 Catch:{ InterruptedException -> 0x016b, IOException -> 0x0162 }
    L_0x0162:
        r0 = move-exception;
        r0 = defpackage.amfq.a(r0);
        r2.set(r0);
        return;
    L_0x016b:
        r0 = 3;
        r0 = defpackage.amfq.a(r0);
        r2.set(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amfl.run():void");
    }
}
