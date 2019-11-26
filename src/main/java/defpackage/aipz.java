package defpackage;

/* renamed from: aipz */
final class aipz implements Runnable {
    private boolean a = false;
    private final /* synthetic */ aipw b;

    aipz(aipw aipw) {
        this.b = aipw;
    }

    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0187  */
    /* JADX WARNING: Missing block: B:73:0x0164, code skipped:
            if (r1.b.h.get() == false) goto L_0x016e;
     */
    /* JADX WARNING: Missing block: B:74:0x0166, code skipped:
            r1.b.f.e();
     */
    /* JADX WARNING: Missing block: B:75:0x016d, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:76:0x016e, code skipped:
            r1.b.f.d();
     */
    /* JADX WARNING: Missing block: B:77:0x0175, code skipped:
            return;
     */
    public final void run() {
        /*
        r22 = this;
        r1 = r22;
        r0 = r1.a;
        if (r0 != 0) goto L_0x01eb;
    L_0x0006:
        r0 = 1;
        r1.a = r0;
        r2 = r1.b;
        r2 = r2.f;
        r2.b();
        r2 = 0;
    L_0x0011:
        r3 = r1.b;	 Catch:{ IOException -> 0x01c4, InterruptedException -> 0x019d, IllegalStateException -> 0x0176 }
        r4 = r3.c;	 Catch:{ IOException -> 0x01c4, InterruptedException -> 0x019d, IllegalStateException -> 0x0176 }
        r4 = r4.length;	 Catch:{ IOException -> 0x01c4, InterruptedException -> 0x019d, IllegalStateException -> 0x0176 }
        if (r2 < r4) goto L_0x001a;
    L_0x0018:
        goto L_0x015c;
    L_0x001a:
        r3 = r3.h;	 Catch:{ IOException -> 0x01c4, InterruptedException -> 0x019d, IllegalStateException -> 0x0176 }
        r3 = r3.get();	 Catch:{ IOException -> 0x01c4, InterruptedException -> 0x019d, IllegalStateException -> 0x0176 }
        if (r3 != 0) goto L_0x015a;
    L_0x0022:
        r3 = r1.b;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r4 = r3.c;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r6 = r4[r2];	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r4 = r3.f;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r4.c();	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        monitor-enter(r3);	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r4 = r3.a;	 Catch:{ all -> 0x014b }
        r4 = r4.a();	 Catch:{ all -> 0x014b }
        r3.g = r4;	 Catch:{ all -> 0x014b }
        monitor-exit(r3);	 Catch:{ all -> 0x014b }
        r4 = r3.g;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        if (r4 != 0) goto L_0x0043;
    L_0x003b:
        r3 = r3.f;	 Catch:{ IOException -> 0x01c4, InterruptedException -> 0x019d, IllegalStateException -> 0x0176 }
        r3.a(r0);	 Catch:{ IOException -> 0x01c4, InterruptedException -> 0x019d, IllegalStateException -> 0x0176 }
        r1 = 1;
        goto L_0x0141;
    L_0x0043:
        r5 = r3.f;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r4.b = r5;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r4 = r5.f();	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r14 = 0;
        if (r4 == 0) goto L_0x0132;
    L_0x004e:
        r5 = r3.g;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r7 = r3.d;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r9 = r3.e;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r4 = r6.G();	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        if (r4 == 0) goto L_0x00cf;
    L_0x005a:
        r4 = r5.a;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r11 = r6.d(r14);	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        defpackage.xak.b();	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r12 = r11.c;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r12 = r12.h;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r13 = "video/webm";
        r12 = r12.startsWith(r13);	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        if (r12 != 0) goto L_0x0075;
    L_0x006f:
        r12 = new ohk;	 Catch:{ IOException -> 0x01c4, InterruptedException -> 0x019d, IllegalStateException -> 0x0176 }
        r12.<init>();	 Catch:{ IOException -> 0x01c4, InterruptedException -> 0x019d, IllegalStateException -> 0x0176 }
        goto L_0x007a;
    L_0x0075:
        r12 = new ogn;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r12.<init>();	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
    L_0x007a:
        r12 = defpackage.aeex.a(r12);	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r13 = r11.f;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r15 = r11.b;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r14 = r11.d;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r13 = r13.a(r15, r14);	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r21 = new ovm;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r14 = r11.d;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r15 = r13.a(r14);	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r0 = r13.a;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r13 = r13.b;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r16 = r13;
        r13 = r11.a;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r18 = r16;
        r14 = r21;
        r16 = r0;
        r20 = r13;
        r14.<init>(r15, r16, r18, r20);	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r0 = new oqo;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r1 = r4.a;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r16 = r1.a();	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r1 = r11.c;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r19 = 0;
        r20 = 0;
        r15 = r0;
        r17 = r21;
        r18 = r1;
        r21 = r12;
        r15.<init>(r16, r17, r18, r19, r20, r21);	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r0.b();	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r0 = r12.b;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r1 = r0 instanceof defpackage.ofj;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        if (r1 != 0) goto L_0x00cb;
    L_0x00c4:
        r0 = "SeekMap is not an instance of ChunkIndex.";
        defpackage.xtl.d(r0);	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r14 = 0;
        goto L_0x00df;
    L_0x00cb:
        r14 = r0;
        r14 = (defpackage.ofj) r14;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        goto L_0x00df;
    L_0x00cf:
        r0 = r6.c();	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r4 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r11 = r6.c;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r11 = r4.toMicros(r11);	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r14 = defpackage.aeex.a(r0, r11);	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
    L_0x00df:
        r0 = r6.c;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r11 = 0;
        r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1));
        if (r4 <= 0) goto L_0x0124;
    L_0x00e7:
        if (r14 == 0) goto L_0x0124;
    L_0x00e9:
        r0 = r0 - r7;
        r0 = java.lang.Math.min(r9, r0);	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1));
        if (r4 != 0) goto L_0x00f4;
    L_0x00f2:
        r9 = r11;
        goto L_0x0102;
    L_0x00f4:
        r4 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r9 = r4.toMicros(r7);	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r4 = r14.a(r9);	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r4 = r4.a;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r9 = r4.c;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
    L_0x0102:
        r4 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r7 = r7 + r0;
        r0 = r4.toMicros(r7);	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r7 = -1;
        r0 = r0 + r7;
        r0 = r14.b(r0);	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r1 = r14.c;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r7 = r1[r0];	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r1 = r14.b;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r0 = r1[r0];	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r0 = (long) r0;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r7 = r7 + r0;
        r0 = r7 - r9;
        r11 = 0;
        r12 = 0;
        r13 = 0;
        r7 = r9;
        r9 = r0;
        r5.a(r6, r7, r9, r11, r12, r13);	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
    L_0x0124:
        r0 = r3.g;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r0 = r0.c;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        if (r0 == 0) goto L_0x0130;
    L_0x012a:
        r0 = r3.h;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r1 = 1;
        r0.set(r1);	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
    L_0x0130:
        r1 = 1;
        goto L_0x0138;
    L_0x0132:
        r0 = r3.h;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r1 = 1;
        r0.set(r1);	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
    L_0x0138:
        monitor-enter(r3);	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
        r0 = r3.g;	 Catch:{ all -> 0x0148 }
        r4 = 0;
        r0.b = r4;	 Catch:{ all -> 0x0148 }
        r3.g = r4;	 Catch:{ all -> 0x0148 }
        monitor-exit(r3);	 Catch:{ all -> 0x0148 }
    L_0x0141:
        r2 = r2 + 1;
        r0 = 1;
        r1 = r22;
        goto L_0x0011;
    L_0x0148:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0148 }
        throw r0;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
    L_0x014b:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x014b }
        throw r0;	 Catch:{ IOException -> 0x0156, InterruptedException -> 0x0152, IllegalStateException -> 0x014e }
    L_0x014e:
        r0 = move-exception;
        r1 = r22;
        goto L_0x0177;
    L_0x0152:
        r0 = move-exception;
        r1 = r22;
        goto L_0x019e;
    L_0x0156:
        r0 = move-exception;
        r1 = r22;
        goto L_0x01c5;
    L_0x015a:
        r1 = r22;
    L_0x015c:
        r0 = r1.b;	 Catch:{ IOException -> 0x01c4, InterruptedException -> 0x019d, IllegalStateException -> 0x0176 }
        r0 = r0.h;	 Catch:{ IOException -> 0x01c4, InterruptedException -> 0x019d, IllegalStateException -> 0x0176 }
        r0 = r0.get();	 Catch:{ IOException -> 0x01c4, InterruptedException -> 0x019d, IllegalStateException -> 0x0176 }
        if (r0 == 0) goto L_0x016e;
    L_0x0166:
        r0 = r1.b;	 Catch:{ IOException -> 0x01c4, InterruptedException -> 0x019d, IllegalStateException -> 0x0176 }
        r0 = r0.f;	 Catch:{ IOException -> 0x01c4, InterruptedException -> 0x019d, IllegalStateException -> 0x0176 }
        r0.e();	 Catch:{ IOException -> 0x01c4, InterruptedException -> 0x019d, IllegalStateException -> 0x0176 }
        return;
    L_0x016e:
        r0 = r1.b;	 Catch:{ IOException -> 0x01c4, InterruptedException -> 0x019d, IllegalStateException -> 0x0176 }
        r0 = r0.f;	 Catch:{ IOException -> 0x01c4, InterruptedException -> 0x019d, IllegalStateException -> 0x0176 }
        r0.d();	 Catch:{ IOException -> 0x01c4, InterruptedException -> 0x019d, IllegalStateException -> 0x0176 }
        return;
    L_0x0176:
        r0 = move-exception;
    L_0x0177:
        r2 = r1.b;
        r2 = r2.b;
        r2 = java.lang.String.valueOf(r2);
        r3 = "Failed to download video (IllegalStateException): ";
        r4 = r2.length();
        if (r4 != 0) goto L_0x018d;
    L_0x0187:
        r2 = new java.lang.String;
        r2.<init>(r3);
        goto L_0x0191;
    L_0x018d:
        r2 = r3.concat(r2);
    L_0x0191:
        defpackage.xtl.a(r2, r0);
        r0 = r1.b;
        r0 = r0.f;
        r2 = 5;
        r0.a(r2);
        return;
    L_0x019d:
        r0 = move-exception;
    L_0x019e:
        r2 = r1.b;
        r2 = r2.b;
        r2 = java.lang.String.valueOf(r2);
        r3 = "Failed to download video (InterruptedException): ";
        r4 = r2.length();
        if (r4 != 0) goto L_0x01b4;
    L_0x01ae:
        r2 = new java.lang.String;
        r2.<init>(r3);
        goto L_0x01b8;
    L_0x01b4:
        r2 = r3.concat(r2);
    L_0x01b8:
        defpackage.xtl.a(r2, r0);
        r0 = r1.b;
        r0 = r0.f;
        r2 = 4;
        r0.a(r2);
        return;
    L_0x01c4:
        r0 = move-exception;
    L_0x01c5:
        r2 = r1.b;
        r2 = r2.b;
        r2 = java.lang.String.valueOf(r2);
        r3 = "Failed to download video (IOException): ";
        r4 = r2.length();
        if (r4 != 0) goto L_0x01db;
    L_0x01d5:
        r2 = new java.lang.String;
        r2.<init>(r3);
        goto L_0x01df;
    L_0x01db:
        r2 = r3.concat(r2);
    L_0x01df:
        defpackage.xtl.a(r2, r0);
        r0 = r1.b;
        r0 = r0.f;
        r2 = 3;
        r0.a(r2);
        return;
    L_0x01eb:
        r0 = new java.lang.IllegalStateException;
        r2 = "Download task has already run";
        r0.<init>(r2);
        goto L_0x01f4;
    L_0x01f3:
        throw r0;
    L_0x01f4:
        goto L_0x01f3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aipz.run():void");
    }
}
