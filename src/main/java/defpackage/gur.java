package defpackage;

/* renamed from: gur */
final class gur {
    private boolean a;
    private int b = -1;
    private final /* synthetic */ gub c;

    public final synchronized void a() {
        this.a = true;
        this.b = -1;
    }

    public final synchronized void b() {
        this.b = -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0134  */
    /* JADX WARNING: Missing block: B:235:0x0535, code skipped:
            return;
     */
    public final synchronized void a(defpackage.aaff r17, int r18, boolean r19, boolean r20, boolean r21) {
        /*
        r16 = this;
        r1 = r16;
        r0 = r17;
        r2 = r18;
        monitor-enter(r16);
        r3 = r1.a;	 Catch:{ all -> 0x0536 }
        if (r3 != 0) goto L_0x0534;
    L_0x000b:
        r3 = r1.b;	 Catch:{ all -> 0x0536 }
        if (r2 < r3) goto L_0x0534;
    L_0x000f:
        r1.b = r2;	 Catch:{ all -> 0x0536 }
        r2 = r1.c;	 Catch:{ all -> 0x0536 }
        r3 = r21;
        r2.a(r0, r3);	 Catch:{ all -> 0x0536 }
        r2 = 0;
        r3 = 0;
        if (r19 != 0) goto L_0x001e;
    L_0x001c:
        goto L_0x013d;
    L_0x001e:
        r4 = r1.c;	 Catch:{ all -> 0x0536 }
        r4.aw();	 Catch:{ all -> 0x0536 }
        r4 = r1.c;	 Catch:{ all -> 0x0536 }
        r5 = r17.b();	 Catch:{ all -> 0x0536 }
        r4.as = r5;	 Catch:{ all -> 0x0536 }
        r4 = r1.c;	 Catch:{ all -> 0x0536 }
        r5 = r4.bM;	 Catch:{ all -> 0x0536 }
        r4 = r4.t();	 Catch:{ all -> 0x0536 }
        r6 = r0.a;	 Catch:{ all -> 0x0536 }
        r7 = r6.d;	 Catch:{ all -> 0x0536 }
        if (r7 != 0) goto L_0x003a;
    L_0x0039:
        goto L_0x0042;
    L_0x003a:
        r8 = r7.length;	 Catch:{ all -> 0x0536 }
        if (r8 <= 0) goto L_0x0042;
    L_0x003d:
        r4.a(r7);	 Catch:{ all -> 0x0536 }
        goto L_0x011e;
    L_0x0042:
        r7 = r5.a;	 Catch:{ all -> 0x0536 }
        r7 = r7.a(r6);	 Catch:{ all -> 0x0536 }
        if (r7 == 0) goto L_0x011e;
    L_0x004a:
        r7 = r6.a;	 Catch:{ all -> 0x0536 }
        r7 = r7.b;	 Catch:{ all -> 0x0536 }
        r7 = r7.a;	 Catch:{ all -> 0x0536 }
        r7 = r7[r3];	 Catch:{ all -> 0x0536 }
        r7 = r7.b;	 Catch:{ all -> 0x0536 }
        r8 = r7.d;	 Catch:{ all -> 0x0536 }
        r8 = r8.a;	 Catch:{ all -> 0x0536 }
        r9 = r5.a;	 Catch:{ all -> 0x0536 }
        r10 = r9.a(r6);	 Catch:{ all -> 0x0536 }
        defpackage.amqw.a(r10);	 Catch:{ all -> 0x0536 }
        r9 = r9.b(r4, r6);	 Catch:{ all -> 0x0536 }
        r4.a(r9, r2);	 Catch:{ all -> 0x0536 }
        r9 = r6.c;	 Catch:{ all -> 0x0536 }
        if (r9 != 0) goto L_0x006d;
    L_0x006c:
        goto L_0x00ad;
    L_0x006d:
        r10 = r9.a;	 Catch:{ all -> 0x0536 }
        if (r10 != 0) goto L_0x00a0;
    L_0x0071:
        r10 = r9.b;	 Catch:{ all -> 0x0536 }
        if (r10 != 0) goto L_0x00a0;
    L_0x0075:
        r10 = r9.c;	 Catch:{ all -> 0x0536 }
        if (r10 != 0) goto L_0x00a0;
    L_0x0079:
        r10 = r9.d;	 Catch:{ all -> 0x0536 }
        if (r10 != 0) goto L_0x00a0;
    L_0x007d:
        r10 = r9.f;	 Catch:{ all -> 0x0536 }
        if (r10 != 0) goto L_0x00a0;
    L_0x0081:
        r10 = r9.e;	 Catch:{ all -> 0x0536 }
        if (r10 != 0) goto L_0x00a0;
    L_0x0085:
        r10 = r9.g;	 Catch:{ all -> 0x0536 }
        if (r10 != 0) goto L_0x00a0;
    L_0x0089:
        r10 = r9.h;	 Catch:{ all -> 0x0536 }
        if (r10 != 0) goto L_0x00a0;
    L_0x008d:
        r10 = r9.i;	 Catch:{ all -> 0x0536 }
        if (r10 != 0) goto L_0x00a0;
    L_0x0091:
        r10 = r9.j;	 Catch:{ all -> 0x0536 }
        if (r10 != 0) goto L_0x00a0;
    L_0x0095:
        r10 = r9.k;	 Catch:{ all -> 0x0536 }
        if (r10 != 0) goto L_0x00a0;
    L_0x0099:
        r9 = r9.l;	 Catch:{ all -> 0x0536 }
        if (r9 == 0) goto L_0x009f;
    L_0x009d:
        r10 = r9;
        goto L_0x00a0;
    L_0x009f:
        r10 = r2;
    L_0x00a0:
        r9 = r5.a;	 Catch:{ all -> 0x0536 }
        r9 = r9.a(r10);	 Catch:{ all -> 0x0536 }
        if (r9 == 0) goto L_0x00ad;
    L_0x00a8:
        r9 = r5.a;	 Catch:{ all -> 0x0536 }
        r9.a(r4, r10, r6);	 Catch:{ all -> 0x0536 }
    L_0x00ad:
        r9 = r5.a;	 Catch:{ all -> 0x0536 }
        r9 = r9.a(r7);	 Catch:{ all -> 0x0536 }
        if (r9 == 0) goto L_0x00ba;
    L_0x00b5:
        r9 = r5.a;	 Catch:{ all -> 0x0536 }
        r9.a(r4, r7, r6);	 Catch:{ all -> 0x0536 }
    L_0x00ba:
        r9 = r5.a;	 Catch:{ all -> 0x0536 }
        r9 = r9.a(r8);	 Catch:{ all -> 0x0536 }
        if (r9 == 0) goto L_0x00c7;
    L_0x00c2:
        r9 = r5.a;	 Catch:{ all -> 0x0536 }
        r9.a(r4, r8, r7);	 Catch:{ all -> 0x0536 }
    L_0x00c7:
        r7 = r8.b;	 Catch:{ all -> 0x0536 }
        r9 = r7.length;	 Catch:{ all -> 0x0536 }
        r10 = 0;
    L_0x00cb:
        if (r10 >= r9) goto L_0x0119;
    L_0x00cd:
        r11 = r7[r10];	 Catch:{ all -> 0x0536 }
        r11 = defpackage.aafm.a(r11);	 Catch:{ all -> 0x0536 }
        r12 = r5.a;	 Catch:{ all -> 0x0536 }
        r12 = r12.a(r11);	 Catch:{ all -> 0x0536 }
        if (r12 == 0) goto L_0x00e0;
    L_0x00db:
        r12 = r5.a;	 Catch:{ all -> 0x0536 }
        r12.a(r4, r11, r8);	 Catch:{ all -> 0x0536 }
    L_0x00e0:
        r12 = r11 instanceof defpackage.ajyf;	 Catch:{ all -> 0x0536 }
        if (r12 == 0) goto L_0x0114;
    L_0x00e4:
        r12 = r11;
        r12 = (defpackage.ajyf) r12;	 Catch:{ all -> 0x0536 }
        r13 = r12.b;	 Catch:{ all -> 0x0536 }
        r14 = r13.length;	 Catch:{ all -> 0x0536 }
        r15 = 0;
    L_0x00eb:
        if (r15 < r14) goto L_0x00ee;
    L_0x00ed:
        goto L_0x0114;
    L_0x00ee:
        r2 = r13[r15];	 Catch:{ all -> 0x0536 }
        if (r2 != 0) goto L_0x00f4;
    L_0x00f2:
        r3 = 0;
        goto L_0x0101;
    L_0x00f4:
        r3 = r2.b;	 Catch:{ all -> 0x0536 }
        if (r3 != 0) goto L_0x0101;
    L_0x00f8:
        r3 = r2.c;	 Catch:{ all -> 0x0536 }
        if (r3 != 0) goto L_0x0101;
    L_0x00fc:
        r2 = r2.d;	 Catch:{ all -> 0x0536 }
        if (r2 == 0) goto L_0x00f2;
    L_0x0100:
        r3 = r2;
    L_0x0101:
        r2 = r5.a;	 Catch:{ all -> 0x0536 }
        r2 = r2.a(r11);	 Catch:{ all -> 0x0536 }
        if (r2 != 0) goto L_0x010a;
    L_0x0109:
        goto L_0x010f;
    L_0x010a:
        r2 = r5.a;	 Catch:{ all -> 0x0536 }
        r2.a(r4, r3, r12);	 Catch:{ all -> 0x0536 }
    L_0x010f:
        r15 = r15 + 1;
        r2 = 0;
        r3 = 0;
        goto L_0x00eb;
    L_0x0114:
        r10 = r10 + 1;
        r2 = 0;
        r3 = 0;
        goto L_0x00cb;
    L_0x0119:
        r2 = r5.a;	 Catch:{ all -> 0x0536 }
        r2.a(r4, r6);	 Catch:{ all -> 0x0536 }
    L_0x011e:
        r2 = r1.c;	 Catch:{ all -> 0x0536 }
        r2 = r2.bm;	 Catch:{ all -> 0x0536 }
        r2 = r2.a;	 Catch:{ all -> 0x0536 }
        r3 = new eew;	 Catch:{ all -> 0x0536 }
        r3.<init>();	 Catch:{ all -> 0x0536 }
        r2.d(r3);	 Catch:{ all -> 0x0536 }
        r2 = r1.c;	 Catch:{ all -> 0x0536 }
        r2 = r2.aE();	 Catch:{ all -> 0x0536 }
        if (r2 == 0) goto L_0x013d;
    L_0x0134:
        r2 = r1.c;	 Catch:{ all -> 0x0536 }
        r2 = r2.bS;	 Catch:{ all -> 0x0536 }
        r3 = "br_r";
        r2.a(r3);	 Catch:{ all -> 0x0536 }
    L_0x013d:
        r2 = r1.c;	 Catch:{ all -> 0x0536 }
        r3 = 0;
        r2.f(r3);	 Catch:{ all -> 0x0536 }
        r2 = r17.e();	 Catch:{ all -> 0x0536 }
        r3 = -1;
        r4 = 1;
        if (r2 == 0) goto L_0x016c;
    L_0x014b:
        r2 = r1.c;	 Catch:{ all -> 0x0536 }
        r2 = r2.ai;	 Catch:{ all -> 0x0536 }
        r5 = r2.a;	 Catch:{ all -> 0x0536 }
        r5 = r5.getResources();	 Catch:{ all -> 0x0536 }
        r6 = 2131952946; // 0x7f130532 float:1.954235E38 double:1.053324709E-314;
        r5 = r5.getText(r6);	 Catch:{ all -> 0x0536 }
        r6 = r2.b;	 Catch:{ all -> 0x0536 }
        defpackage.amqw.a(r6);	 Catch:{ all -> 0x0536 }
        r6 = r2.b;	 Catch:{ all -> 0x0536 }
        r6.a(r5);	 Catch:{ all -> 0x0536 }
        r5 = 4;
        r2.a(r5);	 Catch:{ all -> 0x0536 }
        goto L_0x034e;
    L_0x016c:
        r2 = r1.c;	 Catch:{ all -> 0x0536 }
        r2.am = r0;	 Catch:{ all -> 0x0536 }
        r5 = r2.a(r0);	 Catch:{ all -> 0x0536 }
        r2.a(r5);	 Catch:{ all -> 0x0536 }
        r2 = r1.c;	 Catch:{ all -> 0x0536 }
        r2.ay();	 Catch:{ all -> 0x0536 }
        r5 = r1.c;	 Catch:{ all -> 0x0536 }
        r2 = r5.ax();	 Catch:{ all -> 0x0536 }
        if (r2 != 0) goto L_0x0189;
    L_0x0184:
        r5.aD();	 Catch:{ all -> 0x0536 }
        goto L_0x02df;
    L_0x0189:
        r6 = r2 instanceof defpackage.arvx;	 Catch:{ all -> 0x0536 }
        if (r6 == 0) goto L_0x0192;
    L_0x018d:
        r5.aD();	 Catch:{ all -> 0x0536 }
        goto L_0x02df;
    L_0x0192:
        r6 = r2 instanceof defpackage.ajrw;	 Catch:{ all -> 0x0536 }
        if (r6 == 0) goto L_0x022e;
    L_0x0196:
        r2 = (defpackage.ajrw) r2;	 Catch:{ all -> 0x0536 }
        r6 = r2.m;	 Catch:{ all -> 0x0536 }
        if (r6 != 0) goto L_0x019d;
    L_0x019c:
        goto L_0x01e3;
    L_0x019d:
        r7 = r6.a;	 Catch:{ all -> 0x0536 }
        r8 = 66439850; // 0x3f5caaa float:1.4446335E-36 double:3.28256474E-316;
        if (r7 != r8) goto L_0x01e3;
    L_0x01a4:
        r6 = r6.b;	 Catch:{ all -> 0x0536 }
        r6 = (defpackage.auvn) r6;	 Catch:{ all -> 0x0536 }
        r6 = r6.b;	 Catch:{ all -> 0x0536 }
        r6 = r6.size();	 Catch:{ all -> 0x0536 }
        if (r6 <= 0) goto L_0x01e3;
    L_0x01b0:
        r6 = r2.m;	 Catch:{ all -> 0x0536 }
        r7 = r6.a;	 Catch:{ all -> 0x0536 }
        if (r7 != r8) goto L_0x01bb;
    L_0x01b6:
        r6 = r6.b;	 Catch:{ all -> 0x0536 }
        r6 = (defpackage.auvn) r6;	 Catch:{ all -> 0x0536 }
        goto L_0x01bd;
    L_0x01bb:
        r6 = defpackage.auvn.l;	 Catch:{ all -> 0x0536 }
    L_0x01bd:
        r6 = r6.b;	 Catch:{ all -> 0x0536 }
        r7 = 0;
        r6 = r6.get(r7);	 Catch:{ all -> 0x0536 }
        r6 = (defpackage.auvj) r6;	 Catch:{ all -> 0x0536 }
        r6 = r6.a;	 Catch:{ all -> 0x0536 }
        r6 = r6 & r4;
        if (r6 == 0) goto L_0x01e3;
    L_0x01cb:
        r6 = r5.ax;	 Catch:{ all -> 0x0536 }
        if (r6 != 0) goto L_0x01e3;
    L_0x01cf:
        r6 = r5.bb;	 Catch:{ all -> 0x0536 }
        r7 = r2.m;	 Catch:{ all -> 0x0536 }
        r9 = r7.a;	 Catch:{ all -> 0x0536 }
        if (r9 != r8) goto L_0x01dc;
    L_0x01d7:
        r7 = r7.b;	 Catch:{ all -> 0x0536 }
        r7 = (defpackage.auvn) r7;	 Catch:{ all -> 0x0536 }
        goto L_0x01de;
    L_0x01dc:
        r7 = defpackage.auvn.l;	 Catch:{ all -> 0x0536 }
    L_0x01de:
        r6.a(r7);	 Catch:{ all -> 0x0536 }
        r5.ax = r4;	 Catch:{ all -> 0x0536 }
    L_0x01e3:
        r6 = r2.l;	 Catch:{ all -> 0x0536 }
        if (r6 != 0) goto L_0x01e8;
    L_0x01e7:
        goto L_0x0201;
    L_0x01e8:
        r7 = r6.a;	 Catch:{ all -> 0x0536 }
        r8 = 131084815; // 0x7d0320f float:3.1325783E-34 double:6.4764504E-316;
        if (r7 != r8) goto L_0x0201;
    L_0x01ef:
        r2 = r6.b;	 Catch:{ all -> 0x0536 }
        r2 = (defpackage.atzm) r2;	 Catch:{ all -> 0x0536 }
        r10 = r2.d;	 Catch:{ all -> 0x0536 }
        r7 = r2.e;	 Catch:{ all -> 0x0536 }
        r8 = r2.b;	 Catch:{ all -> 0x0536 }
        r9 = r2.c;	 Catch:{ all -> 0x0536 }
        r6 = r10;
        r5.a(r6, r7, r8, r9, r10);	 Catch:{ all -> 0x0536 }
        goto L_0x02df;
    L_0x0201:
        r6 = r2.g;	 Catch:{ all -> 0x0536 }
        r6 = defpackage.aklb.a(r6);	 Catch:{ all -> 0x0536 }
        if (r6 == 0) goto L_0x0229;
    L_0x0209:
        r6 = r5.av;	 Catch:{ all -> 0x0536 }
        if (r6 != 0) goto L_0x0214;
    L_0x020d:
        r6 = new guv;	 Catch:{ all -> 0x0536 }
        r6.<init>(r5);	 Catch:{ all -> 0x0536 }
        r5.av = r6;	 Catch:{ all -> 0x0536 }
    L_0x0214:
        r6 = r5.aB;	 Catch:{ all -> 0x0536 }
        r2 = r2.g;	 Catch:{ all -> 0x0536 }
        r2 = defpackage.aklb.d(r2);	 Catch:{ all -> 0x0536 }
        r7 = r5.a;	 Catch:{ all -> 0x0536 }
        r5 = r5.av;	 Catch:{ all -> 0x0536 }
        r5 = defpackage.wxc.a(r7, r5);	 Catch:{ all -> 0x0536 }
        r6.b(r2, r5);	 Catch:{ all -> 0x0536 }
        goto L_0x02df;
    L_0x0229:
        r5.aC();	 Catch:{ all -> 0x0536 }
        goto L_0x02df;
    L_0x022e:
        r6 = r2 instanceof defpackage.ajxx;	 Catch:{ all -> 0x0536 }
        if (r6 == 0) goto L_0x024b;
    L_0x0232:
        r2 = (defpackage.ajxx) r2;	 Catch:{ all -> 0x0536 }
        r2 = r2.y;	 Catch:{ all -> 0x0536 }
        if (r2 != 0) goto L_0x023d;
    L_0x0238:
        r5.aD();	 Catch:{ all -> 0x0536 }
        goto L_0x02df;
    L_0x023d:
        r10 = r2.d;	 Catch:{ all -> 0x0536 }
        r7 = r2.e;	 Catch:{ all -> 0x0536 }
        r8 = r2.b;	 Catch:{ all -> 0x0536 }
        r9 = r2.c;	 Catch:{ all -> 0x0536 }
        r6 = r10;
        r5.a(r6, r7, r8, r9, r10);	 Catch:{ all -> 0x0536 }
        goto L_0x02df;
    L_0x024b:
        r6 = r2 instanceof defpackage.ayix;	 Catch:{ all -> 0x0536 }
        if (r6 == 0) goto L_0x026b;
    L_0x024f:
        r2 = (defpackage.ayix) r2;	 Catch:{ all -> 0x0536 }
        r6 = r5.aB();	 Catch:{ all -> 0x0536 }
        if (r6 == 0) goto L_0x025d;
    L_0x0257:
        r6 = 0;
        r5.d(r6);	 Catch:{ all -> 0x0536 }
        goto L_0x02df;
    L_0x025d:
        r10 = r2.e;	 Catch:{ all -> 0x0536 }
        r7 = r2.f;	 Catch:{ all -> 0x0536 }
        r8 = r2.c;	 Catch:{ all -> 0x0536 }
        r9 = r2.d;	 Catch:{ all -> 0x0536 }
        r6 = r10;
        r5.a(r6, r7, r8, r9, r10);	 Catch:{ all -> 0x0536 }
        goto L_0x02df;
    L_0x026b:
        r6 = r2 instanceof defpackage.azcw;	 Catch:{ all -> 0x0536 }
        if (r6 != 0) goto L_0x02b1;
    L_0x026f:
        r2 = r2 instanceof defpackage.aqvl;	 Catch:{ all -> 0x0536 }
        if (r2 != 0) goto L_0x0277;
    L_0x0273:
        r5.aD();	 Catch:{ all -> 0x0536 }
        goto L_0x02df;
    L_0x0277:
        r2 = r5.aB();	 Catch:{ all -> 0x0536 }
        if (r2 == 0) goto L_0x0281;
    L_0x027d:
        r5.d(r4);	 Catch:{ all -> 0x0536 }
        goto L_0x02df;
    L_0x0281:
        r2 = r5.ag;	 Catch:{ all -> 0x0536 }
        r6 = 2131558606; // 0x7f0d00ce float:1.8742533E38 double:1.0531298793E-314;
        r2 = r2.getColor(r6);	 Catch:{ all -> 0x0536 }
        r7 = r5.ag;	 Catch:{ all -> 0x0536 }
        r8 = 2131559402; // 0x7f0d03ea float:1.8744147E38 double:1.0531302726E-314;
        r7 = r7.getColor(r8);	 Catch:{ all -> 0x0536 }
        r8 = r5.ag;	 Catch:{ all -> 0x0536 }
        r9 = 2131559398; // 0x7f0d03e6 float:1.8744139E38 double:1.0531302706E-314;
        r8 = r8.getColor(r9);	 Catch:{ all -> 0x0536 }
        r9 = r5.ag;	 Catch:{ all -> 0x0536 }
        r10 = 2131559405; // 0x7f0d03ed float:1.8744153E38 double:1.053130274E-314;
        r9 = r9.getColor(r10);	 Catch:{ all -> 0x0536 }
        r10 = r5.ag;	 Catch:{ all -> 0x0536 }
        r10 = r10.getColor(r6);	 Catch:{ all -> 0x0536 }
        r11 = 1;
        r6 = r2;
        r5.a(r6, r7, r8, r9, r10, r11);	 Catch:{ all -> 0x0536 }
        goto L_0x02df;
    L_0x02b1:
        r2 = r5.ag;	 Catch:{ all -> 0x0536 }
        r6 = 2131559549; // 0x7f0d047d float:1.8744445E38 double:1.053130345E-314;
        r2 = r2.getColor(r6);	 Catch:{ all -> 0x0536 }
        r7 = r5.ag;	 Catch:{ all -> 0x0536 }
        r7 = r7.getColor(r6);	 Catch:{ all -> 0x0536 }
        r6 = r5.ag;	 Catch:{ all -> 0x0536 }
        r8 = 2131559547; // 0x7f0d047b float:1.8744441E38 double:1.053130344E-314;
        r8 = r6.getColor(r8);	 Catch:{ all -> 0x0536 }
        r6 = r5.ag;	 Catch:{ all -> 0x0536 }
        r9 = 2131559582; // 0x7f0d049e float:1.8744512E38 double:1.0531303615E-314;
        r9 = r6.getColor(r9);	 Catch:{ all -> 0x0536 }
        r6 = r5.ag;	 Catch:{ all -> 0x0536 }
        r10 = 2131559548; // 0x7f0d047c float:1.8744443E38 double:1.0531303447E-314;
        r10 = r6.getColor(r10);	 Catch:{ all -> 0x0536 }
        r6 = r2;
        r5.a(r6, r7, r8, r9, r10);	 Catch:{ all -> 0x0536 }
    L_0x02df:
        r2 = r1.c;	 Catch:{ all -> 0x0536 }
        r5 = r17.d();	 Catch:{ all -> 0x0536 }
        r6 = r1.c;	 Catch:{ all -> 0x0536 }
        r6 = r6.ax();	 Catch:{ all -> 0x0536 }
        r7 = 0;
        r2.a(r5, r7, r6, r3);	 Catch:{ all -> 0x0536 }
        r2 = r1.c;	 Catch:{ all -> 0x0536 }
        r2.ar();	 Catch:{ all -> 0x0536 }
        r2 = r1.c;	 Catch:{ all -> 0x0536 }
        r5 = 0;
        r2.i(r5);	 Catch:{ all -> 0x0536 }
        r2 = r1.c;	 Catch:{ all -> 0x0536 }
        r2 = r2.ai;	 Catch:{ all -> 0x0536 }
        r2.c();	 Catch:{ all -> 0x0536 }
        r2 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ all -> 0x0536 }
        r5 = r0.a;	 Catch:{ all -> 0x0536 }
        r5 = defpackage.akcm.a(r5);	 Catch:{ all -> 0x0536 }
        r5 = r5.e;	 Catch:{ all -> 0x0536 }
        r5 = (long) r5;	 Catch:{ all -> 0x0536 }
        r5 = r2.toMillis(r5);	 Catch:{ all -> 0x0536 }
        r2 = r1.c;	 Catch:{ all -> 0x0536 }
        r2 = r2.bk;	 Catch:{ all -> 0x0536 }
        r2 = defpackage.foh.t(r2);	 Catch:{ all -> 0x0536 }
        if (r2 == 0) goto L_0x0329;
    L_0x031a:
        r2 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ all -> 0x0536 }
        r5 = r1.c;	 Catch:{ all -> 0x0536 }
        r5 = r5.bk;	 Catch:{ all -> 0x0536 }
        r5 = defpackage.foh.t(r5);	 Catch:{ all -> 0x0536 }
        r5 = (long) r5;	 Catch:{ all -> 0x0536 }
        r5 = r2.toMillis(r5);	 Catch:{ all -> 0x0536 }
    L_0x0329:
        r2 = r1.c;	 Catch:{ all -> 0x0536 }
        r7 = r2.aD;	 Catch:{ all -> 0x0536 }
        r7 = r7.b();	 Catch:{ all -> 0x0536 }
        r5 = r5 + r7;
        r2.ar = r5;	 Catch:{ all -> 0x0536 }
        r2 = r1.c;	 Catch:{ all -> 0x0536 }
        r5 = r0.a;	 Catch:{ all -> 0x0536 }
        r5 = r5.k;	 Catch:{ all -> 0x0536 }
        r2.bU = r5;	 Catch:{ all -> 0x0536 }
        r2 = r2.bT;	 Catch:{ all -> 0x0536 }
        r2.set(r4);	 Catch:{ all -> 0x0536 }
        r2 = r1.c;	 Catch:{ all -> 0x0536 }
        r5 = r2.ar;	 Catch:{ all -> 0x0536 }
        r7 = 0;
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 <= 0) goto L_0x034e;
    L_0x034b:
        r2.as();	 Catch:{ all -> 0x0536 }
    L_0x034e:
        if (r19 != 0) goto L_0x0352;
    L_0x0350:
        goto L_0x044b;
    L_0x0352:
        r2 = r17.e();	 Catch:{ all -> 0x0536 }
        if (r2 != 0) goto L_0x044b;
    L_0x0358:
        r2 = r1.c;	 Catch:{ all -> 0x0536 }
        r2.at();	 Catch:{ all -> 0x0536 }
        r5 = r2.au();	 Catch:{ all -> 0x0536 }
        if (r5 == 0) goto L_0x0425;
    L_0x0363:
        r6 = r2.bk;	 Catch:{ all -> 0x0536 }
        r6 = r6.a();	 Catch:{ all -> 0x0536 }
        if (r6 != 0) goto L_0x036c;
    L_0x036b:
        goto L_0x03b0;
    L_0x036c:
        r6 = r6.i;	 Catch:{ all -> 0x0536 }
        if (r6 != 0) goto L_0x0372;
    L_0x0370:
        r6 = defpackage.auya.J;	 Catch:{ all -> 0x0536 }
    L_0x0372:
        r6 = r6.r;	 Catch:{ all -> 0x0536 }
        if (r6 != 0) goto L_0x0378;
    L_0x0376:
        r6 = defpackage.aosh.n;	 Catch:{ all -> 0x0536 }
    L_0x0378:
        r6 = r6.j;	 Catch:{ all -> 0x0536 }
        if (r6 == 0) goto L_0x03b0;
    L_0x037c:
        r6 = new ebs;	 Catch:{ all -> 0x0536 }
        r7 = r2.aF;	 Catch:{ all -> 0x0536 }
        r8 = r2.aB;	 Catch:{ all -> 0x0536 }
        r9 = r2.aj;	 Catch:{ all -> 0x0536 }
        r5 = r5.o;	 Catch:{ all -> 0x0536 }
        r6.<init>(r7, r8, r9, r5);	 Catch:{ all -> 0x0536 }
        r2.ae = r6;	 Catch:{ all -> 0x0536 }
        r5 = r2.ae;	 Catch:{ all -> 0x0536 }
        r6 = r5.b;	 Catch:{ all -> 0x0536 }
        r6 = r6.e();	 Catch:{ all -> 0x0536 }
        r6.addOnGlobalLayoutListener(r5);	 Catch:{ all -> 0x0536 }
        r6 = r5.b;	 Catch:{ all -> 0x0536 }
        r6.a(r5);	 Catch:{ all -> 0x0536 }
        r6 = r5.c;	 Catch:{ all -> 0x0536 }
        r7 = r5.d;	 Catch:{ all -> 0x0536 }
        r6.a(r7);	 Catch:{ all -> 0x0536 }
        r6 = r5.a;	 Catch:{ all -> 0x0536 }
        r6.a(r5);	 Catch:{ all -> 0x0536 }
        r5.e = r4;	 Catch:{ all -> 0x0536 }
        r6 = new java.util.HashSet;	 Catch:{ all -> 0x0536 }
        r6.<init>();	 Catch:{ all -> 0x0536 }
        r5.f = r6;	 Catch:{ all -> 0x0536 }
    L_0x03b0:
        r5 = r2.bk;	 Catch:{ all -> 0x0536 }
        r5 = r5.a();	 Catch:{ all -> 0x0536 }
        if (r5 == 0) goto L_0x0425;
    L_0x03b8:
        r5 = r5.e;	 Catch:{ all -> 0x0536 }
        if (r5 != 0) goto L_0x03be;
    L_0x03bc:
        r5 = defpackage.aulu.bw;	 Catch:{ all -> 0x0536 }
    L_0x03be:
        r5 = r5.w;	 Catch:{ all -> 0x0536 }
        if (r5 != 0) goto L_0x03c3;
    L_0x03c2:
        goto L_0x0425;
    L_0x03c3:
        r5 = r2.bk;	 Catch:{ all -> 0x0536 }
        r5 = r5.a();	 Catch:{ all -> 0x0536 }
        if (r5 == 0) goto L_0x03db;
    L_0x03cb:
        r6 = r5.a;	 Catch:{ all -> 0x0536 }
        r6 = r6 & 16;
        if (r6 == 0) goto L_0x03db;
    L_0x03d1:
        r5 = r5.e;	 Catch:{ all -> 0x0536 }
        if (r5 != 0) goto L_0x03d7;
    L_0x03d5:
        r5 = defpackage.aulu.bw;	 Catch:{ all -> 0x0536 }
    L_0x03d7:
        r5 = r5.x;	 Catch:{ all -> 0x0536 }
        r11 = r5;
        goto L_0x03dc;
    L_0x03db:
        r11 = 0;
    L_0x03dc:
        r5 = r2.bk;	 Catch:{ all -> 0x0536 }
        r5 = r5.a();	 Catch:{ all -> 0x0536 }
        if (r5 == 0) goto L_0x03f4;
    L_0x03e4:
        r6 = r5.a;	 Catch:{ all -> 0x0536 }
        r6 = r6 & 16;
        if (r6 == 0) goto L_0x03f4;
    L_0x03ea:
        r5 = r5.e;	 Catch:{ all -> 0x0536 }
        if (r5 != 0) goto L_0x03f0;
    L_0x03ee:
        r5 = defpackage.aulu.bw;	 Catch:{ all -> 0x0536 }
    L_0x03f0:
        r5 = r5.y;	 Catch:{ all -> 0x0536 }
        r12 = r5;
        goto L_0x03f5;
    L_0x03f4:
        r12 = 0;
    L_0x03f5:
        r5 = r2.aq();	 Catch:{ all -> 0x0536 }
        r5 = defpackage.aapu.a(r5);	 Catch:{ all -> 0x0536 }
        r6 = "FEexplore";
        r5 = defpackage.amqq.a(r5, r6);	 Catch:{ all -> 0x0536 }
        if (r5 != 0) goto L_0x0411;
    L_0x0405:
        r5 = r2.av();	 Catch:{ all -> 0x0536 }
        if (r5 != 0) goto L_0x040e;
    L_0x040b:
        r8 = 0;
        r10 = 0;
        goto L_0x0419;
    L_0x040e:
        r8 = 0;
        r10 = 1;
        goto L_0x0419;
    L_0x0411:
        r4 = new akzh;	 Catch:{ all -> 0x0536 }
        r4.<init>();	 Catch:{ all -> 0x0536 }
        r5 = 3;
        r8 = r4;
        r10 = 3;
    L_0x0419:
        r6 = r2.aF;	 Catch:{ all -> 0x0536 }
        r7 = r2.aB;	 Catch:{ all -> 0x0536 }
        r9 = r2.aj;	 Catch:{ all -> 0x0536 }
        r4 = defpackage.edl.a(r6, r7, r8, r9, r10, r11, r12);	 Catch:{ all -> 0x0536 }
        r2.af = r4;	 Catch:{ all -> 0x0536 }
    L_0x0425:
        r2 = r1.c;	 Catch:{ all -> 0x0536 }
        r2 = r2.bm;	 Catch:{ all -> 0x0536 }
        r2 = r2.a;	 Catch:{ all -> 0x0536 }
        r4 = new ees;	 Catch:{ all -> 0x0536 }
        r4.<init>();	 Catch:{ all -> 0x0536 }
        r2.d(r4);	 Catch:{ all -> 0x0536 }
        r2 = r1.c;	 Catch:{ all -> 0x0536 }
        r2 = r2.aE();	 Catch:{ all -> 0x0536 }
        if (r2 == 0) goto L_0x0444;
    L_0x043b:
        r2 = r1.c;	 Catch:{ all -> 0x0536 }
        r2 = r2.bS;	 Catch:{ all -> 0x0536 }
        r4 = "ol";
        r2.a(r4);	 Catch:{ all -> 0x0536 }
    L_0x0444:
        r2 = r1.c;	 Catch:{ all -> 0x0536 }
        r2 = r2.bd;	 Catch:{ all -> 0x0536 }
        r2.a();	 Catch:{ all -> 0x0536 }
    L_0x044b:
        r0 = r0.a;	 Catch:{ all -> 0x0536 }
        r2 = r1.c;	 Catch:{ all -> 0x0536 }
        r2 = r2.bK;	 Catch:{ all -> 0x0536 }
        r4 = r0.l;	 Catch:{ all -> 0x0536 }
        r2.b(r4);	 Catch:{ all -> 0x0536 }
        r2 = r1.c;	 Catch:{ all -> 0x0536 }
        r2 = r2.bR;	 Catch:{ all -> 0x0536 }
        r2.a(r0);	 Catch:{ all -> 0x0536 }
        r2 = r1.c;	 Catch:{ all -> 0x0536 }
        r2 = r2.bj;	 Catch:{ all -> 0x0536 }
        r4 = r2.e;	 Catch:{ all -> 0x0536 }
        if (r4 == 0) goto L_0x046b;
    L_0x0465:
        r4 = r4.isShowing();	 Catch:{ all -> 0x0536 }
        if (r4 != 0) goto L_0x051b;
    L_0x046b:
        r4 = r2.c;	 Catch:{ all -> 0x0536 }
        r4 = r4.a();	 Catch:{ all -> 0x0536 }
        if (r4 == 0) goto L_0x051b;
    L_0x0473:
        r5 = r4.a;	 Catch:{ all -> 0x0536 }
        r5 = r5 & 16;
        if (r5 == 0) goto L_0x051b;
    L_0x0479:
        r4 = r4.e;	 Catch:{ all -> 0x0536 }
        if (r4 != 0) goto L_0x047f;
    L_0x047d:
        r4 = defpackage.aulu.bw;	 Catch:{ all -> 0x0536 }
    L_0x047f:
        r4 = r4.u;	 Catch:{ all -> 0x0536 }
        if (r4 != 0) goto L_0x0485;
    L_0x0483:
        goto L_0x051b;
    L_0x0485:
        r4 = r2.b;	 Catch:{ all -> 0x0536 }
        r5 = "has_responded_location_permission_dialog";
        r6 = 0;
        r4 = r4.getBoolean(r5, r6);	 Catch:{ all -> 0x0536 }
        if (r4 != 0) goto L_0x051b;
    L_0x0490:
        r4 = r2.d;	 Catch:{ all -> 0x0536 }
        r4 = r4.t();	 Catch:{ all -> 0x0536 }
        r5 = defpackage.acwc.LOCATION_ACCESS_PERMISSION_DIALOG;	 Catch:{ all -> 0x0536 }
        r6 = 0;
        r4.b(r5, r6);	 Catch:{ all -> 0x0536 }
        r5 = defpackage.acwc.LOCATION_ACCESS_PERMISSION_ALLOW_BUTTON;	 Catch:{ all -> 0x0536 }
        r4.b(r5, r6);	 Catch:{ all -> 0x0536 }
        r5 = defpackage.acwc.LOCATION_ACCESS_PERMISSION_DENY_BUTTON;	 Catch:{ all -> 0x0536 }
        r4.b(r5, r6);	 Catch:{ all -> 0x0536 }
        r4 = r2.a;	 Catch:{ all -> 0x0536 }
        r4 = android.view.LayoutInflater.from(r4);	 Catch:{ all -> 0x0536 }
        r5 = 2131034889; // 0x7f050309 float:1.7680308E38 double:1.0528711287E-314;
        r7 = 0;
        r4 = r4.inflate(r5, r6, r7);	 Catch:{ all -> 0x0536 }
        r5 = 2131755715; // 0x7f1002c3 float:1.9142317E38 double:1.053227264E-314;
        r5 = r4.findViewById(r5);	 Catch:{ all -> 0x0536 }
        r6 = new guy;	 Catch:{ all -> 0x0536 }
        r6.<init>(r2);	 Catch:{ all -> 0x0536 }
        r5.setOnClickListener(r6);	 Catch:{ all -> 0x0536 }
        r5 = new aeg;	 Catch:{ all -> 0x0536 }
        r6 = r2.a;	 Catch:{ all -> 0x0536 }
        r7 = 2132017569; // 0x7f1401a1 float:1.967342E38 double:1.053356637E-314;
        r5.<init>(r6, r7);	 Catch:{ all -> 0x0536 }
        r6 = 2131953114; // 0x7f1305da float:1.954269E38 double:1.053324792E-314;
        r5.a(r6);	 Catch:{ all -> 0x0536 }
        r6 = 2131953113; // 0x7f1305d9 float:1.9542688E38 double:1.0533247917E-314;
        r5.b(r6);	 Catch:{ all -> 0x0536 }
        r6 = 2131953111; // 0x7f1305d7 float:1.9542684E38 double:1.0533247907E-314;
        r7 = 0;
        r5.a(r6, r7);	 Catch:{ all -> 0x0536 }
        r6 = 2131953112; // 0x7f1305d8 float:1.9542686E38 double:1.053324791E-314;
        r5.b(r6, r7);	 Catch:{ all -> 0x0536 }
        r5.a(r4);	 Catch:{ all -> 0x0536 }
        r4 = 0;
        r5.a(r4);	 Catch:{ all -> 0x0536 }
        r4 = r5.a();	 Catch:{ all -> 0x0536 }
        r2.e = r4;	 Catch:{ all -> 0x0536 }
        r4 = r2.e;	 Catch:{ all -> 0x0536 }
        r4.show();	 Catch:{ all -> 0x0536 }
        r4 = r2.e;	 Catch:{ all -> 0x0536 }
        r3 = r4.a(r3);	 Catch:{ all -> 0x0536 }
        defpackage.guz.a(r3);	 Catch:{ all -> 0x0536 }
        r4 = new gvb;	 Catch:{ all -> 0x0536 }
        r4.<init>(r2);	 Catch:{ all -> 0x0536 }
        r3.setOnClickListener(r4);	 Catch:{ all -> 0x0536 }
        r3 = r2.e;	 Catch:{ all -> 0x0536 }
        r4 = -2;
        r3 = r3.a(r4);	 Catch:{ all -> 0x0536 }
        defpackage.guz.a(r3);	 Catch:{ all -> 0x0536 }
        r4 = new gva;	 Catch:{ all -> 0x0536 }
        r4.<init>(r2);	 Catch:{ all -> 0x0536 }
        r3.setOnClickListener(r4);	 Catch:{ all -> 0x0536 }
    L_0x051b:
        r2 = r1.c;	 Catch:{ all -> 0x0536 }
        r2.a(r0);	 Catch:{ all -> 0x0536 }
        r2 = r1.c;	 Catch:{ all -> 0x0536 }
        r0 = defpackage.akcm.a(r0);	 Catch:{ all -> 0x0536 }
        r0 = defpackage.gwa.a(r0);	 Catch:{ all -> 0x0536 }
        r2.ao = r0;	 Catch:{ all -> 0x0536 }
        r0 = r1.c;	 Catch:{ all -> 0x0536 }
        r2 = r20;
        r0.aq = r2;	 Catch:{ all -> 0x0536 }
        monitor-exit(r16);
        return;
    L_0x0534:
        monitor-exit(r16);
        return;
    L_0x0536:
        r0 = move-exception;
        monitor-exit(r16);
        goto L_0x053a;
    L_0x0539:
        throw r0;
    L_0x053a:
        goto L_0x0539;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gur.a(aaff, int, boolean, boolean, boolean):void");
    }

    /* synthetic */ gur(gub gub) {
        this.c = gub;
    }
}
