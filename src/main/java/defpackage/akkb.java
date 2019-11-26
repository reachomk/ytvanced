package defpackage;

import android.net.Uri;

/* renamed from: akkb */
public final class akkb extends afmf implements akkl {
    private final afsk f;
    private final afsk g;
    private final afsk h;
    private final wyi i;
    private final akkg j;
    private final bcaa k;
    private final aort l;
    private final bcaa m;
    private final boolean n;

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01a3  */
    public akkb(java.util.concurrent.Executor r10, android.content.Context r11, defpackage.xgq r12, defpackage.bcaa r13, java.io.File r14, defpackage.xsc r15, defpackage.akke r16, defpackage.aort r17, defpackage.akkg r18, defpackage.bcaa r19, defpackage.bcaa r20) {
        /*
        r9 = this;
        r0 = r9;
        r1 = r16;
        r2 = 0;
        if (r14 == 0) goto L_0x000f;
    L_0x0006:
        r3 = r14.getAbsolutePath();
        r4 = r12;
        r5 = r15;
        r6 = r3;
        r3 = r10;
        goto L_0x0013;
    L_0x000f:
        r3 = r10;
        r4 = r12;
        r5 = r15;
        r6 = r2;
    L_0x0013:
        r9.<init>(r10, r12, r6, r15);
        r3 = r13;
        r0.k = r3;
        r3 = r17;
        r0.l = r3;
        r3 = r19;
        r0.m = r3;
        r3 = r0.l;
        r3 = r3.n;
        r4 = 0;
        if (r3 != 0) goto L_0x0029;
    L_0x0028:
        goto L_0x003d;
    L_0x0029:
        r3 = r20.get();
        r3 = (defpackage.alxv) r3;
        r5 = r0.l;
        r5 = r5.p;
        r6 = "streamz_default_image_client";
        r3 = r3.a(r5, r6);
        if (r3 != 0) goto L_0x003c;
    L_0x003b:
        goto L_0x003d;
    L_0x003c:
        r4 = 1;
    L_0x003d:
        r0.n = r4;
        r3 = r0.c;
        if (r3 == 0) goto L_0x008a;
    L_0x0043:
        r2 = defpackage.afme.a;
        r3 = "Cache path cannot be null";
        defpackage.amqw.a(r2, r3);
        r3 = defpackage.afme.a;
        r3 = r3.equals(r2);
        if (r3 == 0) goto L_0x005f;
    L_0x0052:
        r2 = r0.c;
        r2 = defpackage.wyw.a(r2);
        r3 = r0.a;
        r2 = r2.a(r3);
        goto L_0x0087;
    L_0x005f:
        r3 = r0.c;
        r3 = android.net.Uri.parse(r3);
        r3 = r3.buildUpon();
        r2 = r2.name();
        r2 = r2.toLowerCase();
        r2 = r3.appendPath(r2);
        r2 = r2.build();
        r2 = r2.toString();
        r2 = defpackage.wyw.a(r2);
        r3 = r0.a;
        r2 = r2.a(r3);
    L_0x0087:
        r0.i = r2;
        goto L_0x008c;
    L_0x008a:
        r0.i = r2;
    L_0x008c:
        if (r18 != 0) goto L_0x0098;
    L_0x008e:
        r2 = new akkd;
        r3 = r1.c;
        r1 = r1.d;
        r2.<init>(r3, r1);
        goto L_0x009a;
    L_0x0098:
        r2 = r18;
    L_0x009a:
        r0.j = r2;
        r1 = r0.i;
        r2 = r0.j;
        r2 = r2.b();
        if (r1 == 0) goto L_0x00fd;
    L_0x00a6:
        r3 = r0.b;
        if (r3 == 0) goto L_0x00fd;
    L_0x00aa:
        r4 = r0.l;
        r4 = r4.o;
        if (r4 != 0) goto L_0x00c1;
    L_0x00b0:
        r4 = r0.d;
        r5 = new afnr;
        r6 = new afno;
        r6.<init>();
        r5.<init>(r3, r6);
        r3 = r9.a(r4, r5);
        goto L_0x00df;
    L_0x00c1:
        r3 = new afsf;
        r4 = r0.k;
        r4 = r4.get();
        r4 = (defpackage.xhf) r4;
        r5 = new afnk;
        r6 = new afnu;
        r7 = r0.b;
        r8 = new afnv;
        r8.<init>();
        r6.<init>(r7, r8);
        r5.<init>(r6);
        r3.<init>(r4, r5);
    L_0x00df:
        r4 = r0.n;
        if (r4 == 0) goto L_0x00f4;
    L_0x00e3:
        r4 = new aklc;
        r5 = r0.m;
        r4.<init>(r3, r5);
        r3 = new akkz;
        r5 = r0.b;
        r6 = r0.m;
        r3.<init>(r1, r4, r5, r6);
        goto L_0x013b;
    L_0x00f4:
        r4 = new afrz;
        r5 = r0.b;
        r4.<init>(r1, r3, r5);
        r3 = r4;
        goto L_0x013b;
    L_0x00fd:
        r3 = r0.l;
        r3 = r3.o;
        if (r3 != 0) goto L_0x010f;
    L_0x0103:
        r3 = r0.d;
        r4 = new afno;
        r4.<init>();
        r3 = r9.a(r3, r4);
        goto L_0x0126;
    L_0x010f:
        r3 = new afsf;
        r4 = r0.k;
        r4 = r4.get();
        r4 = (defpackage.xhf) r4;
        r5 = new afnk;
        r6 = new afnv;
        r6.<init>();
        r5.<init>(r6);
        r3.<init>(r4, r5);
    L_0x0126:
        r4 = r0.n;
        if (r4 == 0) goto L_0x0132;
    L_0x012a:
        r4 = new aklc;
        r5 = r0.m;
        r4.<init>(r3, r5);
        r3 = r4;
    L_0x0132:
        if (r1 == 0) goto L_0x013b;
    L_0x0134:
        r4 = 604800000; // 0x240c8400 float:3.046947E-17 double:2.988109026E-315;
        r3 = r9.b(r1, r3, r4);
    L_0x013b:
        r1 = new afrl;
        r4 = r11.getContentResolver();
        r1.<init>(r4, r3);
        r3 = new afrr;
        r4 = r11.getContentResolver();
        r3.<init>(r4, r1);
        r1 = new afsb;
        r1.<init>(r3);
        r3 = 7200000; // 0x6ddd00 float:1.0089349E-38 double:3.5572727E-317;
        r1 = r9.b(r2, r1, r3);
        r0.f = r1;
        r1 = r0.f;
        r1 = r9.a(r1);
        r0.g = r1;
        r1 = r0.j;
        r1 = r1.a();
        r2 = new akjz;
        r2.<init>();
        r5 = r0.f;
        r6 = r0.a;
        defpackage.amqw.a(r2);
        defpackage.amqw.a(r2);
        r7 = new afrq;
        r7.<init>(r5, r2, r6);
        r2 = r9.a(r7);
        r5 = r0.n;
        if (r5 == 0) goto L_0x0199;
    L_0x0185:
        r3 = new akkx;
        r4 = r0.b;
        r5 = 7200000; // 0x6ddd00 float:1.0089349E-38 double:3.5572727E-317;
        r7 = r0.m;
        r10 = r3;
        r11 = r1;
        r12 = r2;
        r13 = r4;
        r14 = r5;
        r16 = r7;
        r10.<init>(r11, r12, r13, r14, r16);
        goto L_0x019d;
    L_0x0199:
        r3 = r9.a(r1, r2, r3);
    L_0x019d:
        r1 = r0.l;
        r1 = r1.r;
        if (r1 == 0) goto L_0x01a9;
    L_0x01a3:
        r1 = new afrs;
        r1.<init>(r3);
        goto L_0x01aa;
    L_0x01a9:
        r1 = r3;
    L_0x01aa:
        r0.h = r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkb.<init>(java.util.concurrent.Executor, android.content.Context, xgq, bcaa, java.io.File, xsc, akke, aort, akkg, bcaa, bcaa):void");
    }

    public final void a(Uri uri, wxg wxg) {
        this.h.a(uri, wxg);
    }

    public final void b(Uri uri, wxg wxg) {
        this.g.a(uri, wxg);
    }

    public final void a() {
        this.j.c();
    }

    private final afsk b(wyi wyi, afsk afsk, long j) {
        if (!this.n) {
            return a(wyi, afsk, j);
        }
        return new akkx(wyi, afsk, this.b, j, this.m);
    }
}
