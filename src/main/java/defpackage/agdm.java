package defpackage;

/* renamed from: agdm */
final /* synthetic */ class agdm implements Runnable {
    private final agdj a;
    private final ahjc b;
    private final avoa c;

    agdm(agdj agdj, ahjc ahjc, avoa avoa) {
        this.a = agdj;
        this.b = ahjc;
        this.c = avoa;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0091  */
    public final void run() {
        /*
        r15 = this;
        r0 = r15.a;
        r1 = r15.b;
        r2 = r15.c;
        r3 = r1.e;
        r4 = android.text.TextUtils.isEmpty(r3);
        if (r4 != 0) goto L_0x0207;
    L_0x000e:
        r4 = r0.c;
        r4 = r4.get();
        r4 = (defpackage.agwc) r4;
        r4 = r4.b();
        r5 = r4.k();
        r5 = r5.a(r3);
        if (r5 == 0) goto L_0x0207;
    L_0x0024:
        r5 = r5.u();
        r6 = defpackage.agqs.PLAYABLE;
        if (r5 == r6) goto L_0x002e;
    L_0x002c:
        goto L_0x0207;
    L_0x002e:
        r5 = r1.f;
        r5 = android.text.TextUtils.isEmpty(r5);
        r6 = 4;
        r7 = 3;
        r8 = 2;
        r9 = 1;
        if (r5 == 0) goto L_0x003c;
    L_0x003a:
        r5 = 1;
        goto L_0x007c;
    L_0x003c:
        r5 = r1.f;
        r10 = "offline.fmt.noneavailable";
        r10 = r5.contains(r10);
        if (r10 != 0) goto L_0x007b;
    L_0x0046:
        r10 = "fmt.noneavailable";
        r10 = r5.startsWith(r10);
        if (r10 != 0) goto L_0x0079;
    L_0x004e:
        r10 = "net.retryexhausted";
        r10 = r5.contains(r10);
        if (r10 != 0) goto L_0x0077;
    L_0x0056:
        r10 = "net.closed";
        r10 = r5.contains(r10);
        if (r10 != 0) goto L_0x0077;
    L_0x005e:
        r10 = "net.read";
        r10 = r5.contains(r10);
        if (r10 != 0) goto L_0x0077;
    L_0x0066:
        r10 = "net.read.timeout";
        r10 = r5.contains(r10);
        if (r10 != 0) goto L_0x0077;
    L_0x006e:
        r10 = "net.timeout";
        r5 = r5.contains(r10);
        if (r5 != 0) goto L_0x0077;
    L_0x0076:
        goto L_0x003a;
    L_0x0077:
        r5 = 2;
        goto L_0x007c;
    L_0x0079:
        r5 = 4;
        goto L_0x007c;
    L_0x007b:
        r5 = 3;
    L_0x007c:
        r10 = r2.v;
        if (r10 != 0) goto L_0x0081;
    L_0x0080:
        goto L_0x008d;
    L_0x0081:
        if (r5 != r7) goto L_0x008d;
    L_0x0083:
        r0 = r4.h();
        r1 = defpackage.agqf.STREAM_CORRUPT;
        r0.a(r3, r1);
        return;
    L_0x008d:
        r2 = r2.t;
        if (r2 == 0) goto L_0x0207;
    L_0x0091:
        r2 = r4.p();
        r10 = 0;
        r2 = r2.a(r3, r10);
        if (r2 == 0) goto L_0x0207;
    L_0x009c:
        r11 = defpackage.avoh.i;
        r11 = r11.createBuilder();
        r11 = (defpackage.avok) r11;
        r12 = r1.e;
        r11.copyOnWrite();
        r13 = r11.instance;
        r13 = (defpackage.avoh) r13;
        if (r12 == 0) goto L_0x0201;
    L_0x00af:
        r14 = r13.a;
        r14 = r14 | r9;
        r13.a = r14;
        r13.b = r12;
        r1 = r1.b;
        if (r1 != 0) goto L_0x00bb;
    L_0x00ba:
        goto L_0x00ca;
    L_0x00bb:
        r11.copyOnWrite();
        r12 = r11.instance;
        r12 = (defpackage.avoh) r12;
        r13 = r12.a;
        r13 = r13 | 128;
        r12.a = r13;
        r12.g = r1;
    L_0x00ca:
        r1 = r0.b;
        r1 = r1.get();
        r1 = (defpackage.aizy) r1;
        r1 = r1.y();
        r11.copyOnWrite();
        r12 = r11.instance;
        r12 = (defpackage.avoh) r12;
        r13 = r12.a;
        r13 = r13 | 256;
        r12.a = r13;
        r12.h = r1;
        r1 = r5 + -1;
        if (r1 == r9) goto L_0x00f9;
    L_0x00e9:
        if (r1 == r8) goto L_0x00f5;
    L_0x00eb:
        if (r1 == r7) goto L_0x00f1;
    L_0x00ed:
        r11.a(r9);
        goto L_0x00fc;
    L_0x00f1:
        r11.a(r6);
        goto L_0x00fc;
    L_0x00f5:
        r11.a(r8);
        goto L_0x00fc;
    L_0x00f9:
        r11.a(r7);
    L_0x00fc:
        r1 = r2.a;
        if (r1 != 0) goto L_0x0101;
    L_0x0100:
        goto L_0x0113;
    L_0x0101:
        r1 = r1.r();
        r11.copyOnWrite();
        r12 = r11.instance;
        r12 = (defpackage.avoh) r12;
        r13 = r12.a;
        r13 = r13 | r8;
        r12.a = r13;
        r12.c = r1;
    L_0x0113:
        r1 = r2.b;
        if (r1 != 0) goto L_0x0118;
    L_0x0117:
        goto L_0x012a;
    L_0x0118:
        r1 = r1.r();
        r11.copyOnWrite();
        r12 = r11.instance;
        r12 = (defpackage.avoh) r12;
        r13 = r12.a;
        r6 = r6 | r13;
        r12.a = r6;
        r12.d = r1;
    L_0x012a:
        r1 = r2.h;
        r11.copyOnWrite();
        r6 = r11.instance;
        r6 = (defpackage.avoh) r6;
        r12 = r6.a;
        r12 = r12 | 16;
        r6.a = r12;
        r6.e = r1;
        r1 = r0.e;
        r1 = r1.get();
        r1 = (defpackage.agps) r1;
        r6 = r11.build();
        r6 = (defpackage.anxl) r6;
        r6 = (defpackage.avoh) r6;
        r1.a(r6);
        r1 = r2.b;
        r6 = "Stream verification failed on playback exception for video %s and itag %d";
        r11 = 0;
        if (r1 != 0) goto L_0x0157;
    L_0x0155:
        r1 = 0;
        goto L_0x019b;
    L_0x0157:
        r12 = r1.u();
        if (r12 == 0) goto L_0x0155;
    L_0x015d:
        r10 = r0.d;
        r10 = r10.get();
        r10 = (defpackage.agwp) r10;
        r10 = r10.a(r1);
        if (r10 == 0) goto L_0x019a;
    L_0x016b:
        r12 = r10.a();
        if (r12 == 0) goto L_0x0172;
    L_0x0171:
        goto L_0x019a;
    L_0x0172:
        r2 = r10.e;
        r0.a(r9, r2, r5);
        r0 = defpackage.afpf.offline;
        r2 = java.util.Locale.US;
        r5 = new java.lang.Object[r8];
        r5[r11] = r3;
        r1 = r1.r();
        r1 = java.lang.Integer.valueOf(r1);
        r5[r9] = r1;
        r1 = java.lang.String.format(r2, r6, r5);
        defpackage.afpc.a(r9, r0, r1);
        r0 = r4.h();
        r1 = defpackage.agqf.STREAM_CORRUPT;
        r0.a(r3, r1);
        return;
    L_0x019a:
        r1 = 1;
    L_0x019b:
        r2 = r2.a;
        if (r2 != 0) goto L_0x01a0;
    L_0x019f:
        goto L_0x01e4;
    L_0x01a0:
        r12 = r2.u();
        if (r12 == 0) goto L_0x01e4;
    L_0x01a6:
        r1 = r0.d;
        r1 = r1.get();
        r1 = (defpackage.agwp) r1;
        r10 = r1.a(r2);
        if (r10 == 0) goto L_0x01e3;
    L_0x01b4:
        r1 = r10.a();
        if (r1 == 0) goto L_0x01bb;
    L_0x01ba:
        goto L_0x01e3;
    L_0x01bb:
        r1 = r10.e;
        r0.a(r8, r1, r5);
        r0 = defpackage.afpf.offline;
        r1 = java.util.Locale.US;
        r5 = new java.lang.Object[r8];
        r5[r11] = r3;
        r2 = r2.r();
        r2 = java.lang.Integer.valueOf(r2);
        r5[r9] = r2;
        r1 = java.lang.String.format(r1, r6, r5);
        defpackage.afpc.a(r9, r0, r1);
        r0 = r4.h();
        r1 = defpackage.agqf.STREAM_CORRUPT;
        r0.a(r3, r1);
        return;
    L_0x01e3:
        r1 = 1;
    L_0x01e4:
        if (r1 == 0) goto L_0x0207;
    L_0x01e6:
        if (r10 == 0) goto L_0x01eb;
    L_0x01e8:
        r1 = r10.e;
        goto L_0x01ec;
    L_0x01eb:
        r1 = 1;
    L_0x01ec:
        r0.a(r7, r1, r5);
        r0 = defpackage.afpf.offline;
        r1 = java.util.Locale.US;
        r2 = new java.lang.Object[r9];
        r2[r11] = r3;
        r3 = "Stream verification succeeded on playback exception for video %s";
        r1 = java.lang.String.format(r1, r3, r2);
        defpackage.afpc.a(r9, r0, r1);
        goto L_0x0207;
    L_0x0201:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        throw r0;
    L_0x0207:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agdm.run():void");
    }
}
