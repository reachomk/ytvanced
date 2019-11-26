package defpackage;

/* renamed from: afen */
final class afen extends aetz {
    public final aeuy a;
    private boolean b;
    private final /* synthetic */ afdy c;

    afen(afdy afdy, aeuy aeuy) {
        this.c = afdy;
        super(aeuy);
        this.a = aeuy;
    }

    public final void c() {
        this.b = false;
        this.a.c();
    }

    public final void d() {
        this.b = false;
        this.a.d();
    }

    public final void a(long j) {
        this.b = false;
        this.a.a(j);
    }

    public final void b(long j) {
        this.b = false;
        this.a.b(j);
    }

    public final void g() {
        this.b = false;
        this.a.g();
    }

    public final void h() {
        this.b = false;
        this.a.h();
    }

    public final void f() {
        this.b = false;
        this.a.f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:182:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x038f  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x043f  */
    /* JADX WARNING: Missing block: B:225:0x0537, code skipped:
            if ((!r0.b.f.isEmpty() ? android.net.Uri.parse(r0.b.f) : null) != null) goto L_0x0539;
     */
    public final void a(defpackage.afif r26) {
        /*
        r25 = this;
        r0 = r25;
        r7 = r26;
        r1 = r0.c;
        r1 = r1.c;
        r1 = r1.a();
        r1 = r1.s;
        if (r1 != 0) goto L_0x0011;
    L_0x0010:
        goto L_0x0060;
    L_0x0011:
        r1 = r0.b;
        if (r1 == 0) goto L_0x0060;
    L_0x0015:
        r1 = r26.d();
        if (r1 == 0) goto L_0x0060;
    L_0x001b:
        r1 = r0.a;
        r2 = r26.a();
        r3 = r7.c;
        r3 = defpackage.afht.a(r3);
        r4 = java.lang.String.valueOf(r2);
        r4 = r4.length();
        r5 = java.lang.String.valueOf(r3);
        r5 = r5.length();
        r6 = new java.lang.StringBuilder;
        r4 = r4 + 18;
        r4 = r4 + r5;
        r6.<init>(r4);
        r4 = "e.";
        r6.append(r4);
        r6.append(r2);
        r2 = ";action.ignored;";
        r6.append(r2);
        r6.append(r3);
        r2 = r6.toString();
        r3 = new afif;
        r4 = r7.b;
        r6 = "qoe.ignored";
        r3.<init>(r6, r4, r2);
        r1.a(r3);
        return;
    L_0x0060:
        r1 = 0;
        r0.b = r1;
        r8 = r0.c;
        r2 = r8.g;
        if (r2 == 0) goto L_0x0615;
    L_0x0069:
        r2 = r0.a;
        r3 = r8.e;
        if (r2 != r3) goto L_0x0615;
    L_0x006f:
        r2 = r26.d();
        if (r2 != 0) goto L_0x007a;
    L_0x0075:
        r8.z = r7;
        r2 = r7;
        goto L_0x0618;
    L_0x007a:
        r2 = r8.i;
        r3 = r26.a();
        r4 = "android.hfrdroppedframes";
        r3 = r4.equals(r3);
        r4 = 1;
        if (r3 == 0) goto L_0x0161;
    L_0x0089:
        r2 = r2.ax();
        if (r2 <= 0) goto L_0x0161;
    L_0x008f:
        r2 = r8.s;
        if (r2 == 0) goto L_0x0095;
    L_0x0093:
        goto L_0x0161;
    L_0x0095:
        r8.s = r4;
        r2 = r8.i;
        r3 = r2.c;
        r3 = r3.b;
        r3 = r3 & 8192;
        if (r3 != 0) goto L_0x00a3;
    L_0x00a1:
        r1 = r2;
        goto L_0x00f4;
    L_0x00a3:
        r2 = r2.aE();
        r2 = r2.toBuilder();
        r2 = (defpackage.anxo) r2;
        r2 = (defpackage.awdf) r2;
        r3 = r2.instance;
        r3 = (defpackage.awdg) r3;
        r3 = r3.D;
        if (r3 != 0) goto L_0x00b9;
    L_0x00b7:
        r3 = defpackage.axbf.n;
    L_0x00b9:
        r3 = r3.toBuilder();
        r3 = (defpackage.anxo) r3;
        r3 = (defpackage.axbe) r3;
        r3.copyOnWrite();
        r4 = r3.instance;
        r4 = (defpackage.axbf) r4;
        r5 = r4.a;
        r5 = r5 | 256;
        r4.a = r5;
        r4.j = r1;
        r2.copyOnWrite();
        r1 = r2.instance;
        r1 = (defpackage.awdg) r1;
        r3 = r3.build();
        r3 = (defpackage.anxl) r3;
        r3 = (defpackage.axbf) r3;
        r1.D = r3;
        r3 = r1.b;
        r3 = r3 | 8192;
        r1.b = r3;
        r1 = new aajj;
        r2 = r2.build();
        r2 = (defpackage.anxl) r2;
        r2 = (defpackage.awdg) r2;
        r1.<init>(r2);
    L_0x00f4:
        r2 = r8.g;
        r3 = r2.b;
        r3 = r3.toBuilder();
        r3 = (defpackage.anxo) r3;
        r3 = (defpackage.ateq) r3;
        r3.e();
        r4 = r2.b;
        r4 = r4.d;
        r4 = r4.iterator();
    L_0x010b:
        r5 = r4.hasNext();
        if (r5 == 0) goto L_0x0129;
    L_0x0111:
        r5 = r4.next();
        r5 = (defpackage.arlv) r5;
        r6 = r5.e;
        r6 = defpackage.aaja.a(r6);
        if (r6 == 0) goto L_0x0125;
    L_0x011f:
        r6 = defpackage.aahr.a(r5);
        if (r6 != 0) goto L_0x010b;
    L_0x0125:
        r3.b(r5);
        goto L_0x010b;
    L_0x0129:
        r4 = new aajs;
        r3 = r3.build();
        r3 = (defpackage.anxl) r3;
        r10 = r3;
        r10 = (defpackage.aten) r10;
        r11 = r2.c;
        r12 = r2.d;
        r14 = r2.e;
        r3 = r2.f;
        r5 = r2.g;
        r6 = r2.h;
        r9 = r2.i;
        r0 = r2.j;
        r2 = r2.k;
        r19 = r9;
        r9 = r4;
        r16 = r3;
        r17 = r5;
        r18 = r6;
        r20 = r0;
        r21 = r2;
        r9.<init>(r10, r11, r12, r14, r16, r17, r18, r19, r20, r21);
        r0 = new afea;
        r0.<init>(r8, r1, r7, r4);
        r1 = r8.e;
        r8.a(r0, r1, r7);
        return;
    L_0x0161:
        r0 = r26.a();
        r2 = "gl";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0185;
    L_0x016d:
        r0 = r8.r;
        if (r0 == 0) goto L_0x0172;
    L_0x0171:
        goto L_0x0185;
    L_0x0172:
        r8.r = r4;
        r0 = r8.i;
        r0.e = r4;
        r1 = r8.g;
        r2 = new afef;
        r2.<init>(r8, r0, r7, r1);
        r0 = r8.e;
        r8.a(r2, r0, r7);
        return;
    L_0x0185:
        r0 = r8.i;
        r2 = r8.o;
        if (r2 != 0) goto L_0x01bc;
    L_0x018b:
        r2 = r8.m;
        r3 = r0.c;
        r5 = r3.b;
        r5 = r5 & 8192;
        if (r5 == 0) goto L_0x019e;
    L_0x0195:
        r3 = r3.D;
        if (r3 != 0) goto L_0x019b;
    L_0x0199:
        r3 = defpackage.axbf.n;
    L_0x019b:
        r3 = r3.c;
        goto L_0x019f;
    L_0x019e:
        r3 = 0;
    L_0x019f:
        if (r2 < r3) goto L_0x01a2;
    L_0x01a1:
        goto L_0x01bc;
    L_0x01a2:
        r0 = defpackage.afdy.a(r0, r7);
        if (r0 == 0) goto L_0x01bc;
    L_0x01a8:
        r0 = r8.m;
        r0 = r0 + r4;
        r8.m = r0;
        r0 = r8.i;
        r1 = r8.g;
        r2 = new afee;
        r2.<init>(r8, r0, r7, r1);
        r0 = r8.e;
        r8.a(r2, r0, r7);
        return;
    L_0x01bc:
        r0 = r8.i;
        r2 = r8.j;
        if (r2 == 0) goto L_0x01f7;
    L_0x01c2:
        r2 = r8.o;
        if (r2 != 0) goto L_0x01f7;
    L_0x01c6:
        r2 = r8.n;
        r3 = r0.c;
        r5 = r3.b;
        r5 = r5 & 8192;
        if (r5 == 0) goto L_0x01d9;
    L_0x01d0:
        r3 = r3.D;
        if (r3 != 0) goto L_0x01d6;
    L_0x01d4:
        r3 = defpackage.axbf.n;
    L_0x01d6:
        r3 = r3.d;
        goto L_0x01da;
    L_0x01d9:
        r3 = 0;
    L_0x01da:
        if (r2 < r3) goto L_0x01dd;
    L_0x01dc:
        goto L_0x01f7;
    L_0x01dd:
        r0 = defpackage.afdy.a(r0, r7);
        if (r0 == 0) goto L_0x01f7;
    L_0x01e3:
        r0 = r8.n;
        r0 = r0 + r4;
        r8.n = r0;
        r0 = r8.i;
        r1 = r8.g;
        r2 = new afeh;
        r2.<init>(r8, r0, r7, r1);
        r0 = r8.e;
        r8.a(r2, r0, r7);
        return;
    L_0x01f7:
        r0 = r8.i;
        r0 = r0.c;
        r2 = r0.b;
        r2 = r2 & 8192;
        r3 = -1;
        if (r2 == 0) goto L_0x024d;
    L_0x0202:
        r0 = r0.D;
        if (r0 != 0) goto L_0x0208;
    L_0x0206:
        r0 = defpackage.axbf.n;
    L_0x0208:
        r0 = r0.g;
        if (r0 == 0) goto L_0x024d;
    L_0x020c:
        r0 = r8.p;
        if (r0 == 0) goto L_0x0211;
    L_0x0210:
        goto L_0x024d;
    L_0x0211:
        r0 = r7.a;
        r2 = r0.hashCode();
        r5 = 83706931; // 0x4fd4433 float:5.9542645E-36 double:4.1356719E-316;
        if (r2 == r5) goto L_0x022c;
    L_0x021c:
        r5 = 697384568; // 0x29913e78 float:6.45013E-14 double:3.44553757E-315;
        if (r2 == r5) goto L_0x0222;
    L_0x0221:
        goto L_0x0236;
    L_0x0222:
        r2 = "player.fatalexception";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0236;
    L_0x022a:
        r0 = 1;
        goto L_0x0237;
    L_0x022c:
        r2 = "fmt.unparseable";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0236;
    L_0x0234:
        r0 = 0;
        goto L_0x0237;
    L_0x0236:
        r0 = -1;
    L_0x0237:
        if (r0 == 0) goto L_0x023c;
    L_0x0239:
        if (r0 == r4) goto L_0x023c;
    L_0x023b:
        goto L_0x024d;
    L_0x023c:
        r8.p = r4;
        r0 = r8.i;
        r1 = r8.g;
        r2 = new afeg;
        r2.<init>(r8, r0, r7, r1);
        r0 = r8.e;
        r8.a(r2, r0, r7);
        return;
    L_0x024d:
        r0 = r7 instanceof defpackage.afjl;
        if (r0 != 0) goto L_0x0600;
    L_0x0251:
        r0 = r8.i;
        r0 = r0.aw();
        if (r0 == 0) goto L_0x0275;
    L_0x0259:
        r0 = r26.a();
        r2 = "qoe.livewindow";
        r0 = r2.equals(r0);
        if (r0 != 0) goto L_0x0266;
    L_0x0265:
        goto L_0x0275;
    L_0x0266:
        r0 = r8.i;
        r1 = r8.g;
        r2 = new afei;
        r2.<init>(r8, r0, r7, r1);
        r0 = r8.e;
        r8.a(r2, r0, r7);
        return;
    L_0x0275:
        r0 = r8.i;
        r0 = r0.c;
        r2 = r0.b;
        r2 = r2 & 8192;
        if (r2 == 0) goto L_0x0331;
    L_0x027f:
        r0 = r0.D;
        if (r0 != 0) goto L_0x0285;
    L_0x0283:
        r0 = defpackage.axbf.n;
    L_0x0285:
        r0 = r0.k;
        if (r0 == 0) goto L_0x0331;
    L_0x0289:
        r0 = r8.A;
        if (r0 != 0) goto L_0x028f;
    L_0x028d:
        goto L_0x0331;
    L_0x028f:
        r0 = r0.b;
        if (r0 == 0) goto L_0x0331;
    L_0x0293:
        r5 = r0.c();
        r9 = 0;
        r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
        if (r2 > 0) goto L_0x0331;
    L_0x029d:
        r2 = defpackage.aahv.o();
        r0 = r0.b();
        r0 = java.lang.Integer.valueOf(r0);
        r0 = r2.contains(r0);
        if (r0 == 0) goto L_0x0331;
    L_0x02af:
        r0 = r26.e();
        if (r0 == 0) goto L_0x0331;
    L_0x02b5:
        r0 = r8.o;
        if (r0 != 0) goto L_0x0331;
    L_0x02b9:
        r0 = r8.t;
        if (r0 != 0) goto L_0x0331;
    L_0x02bd:
        r0 = r8.b;
        r0 = r0.c();
        if (r0 == 0) goto L_0x0331;
    L_0x02c5:
        r8.t = r4;
        r0 = r8.i;
        r1 = r8.g;
        r2 = r1.b;
        r2 = r2.toBuilder();
        r2 = (defpackage.anxo) r2;
        r2 = (defpackage.ateq) r2;
        r2.c();
        r3 = r1.b;
        r3 = r3.c;
        r3 = r3.iterator();
    L_0x02e0:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x02f6;
    L_0x02e6:
        r4 = r3.next();
        r4 = (defpackage.arlv) r4;
        r5 = r4.o;
        r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
        if (r11 <= 0) goto L_0x02e0;
    L_0x02f2:
        r2.a(r4);
        goto L_0x02e0;
    L_0x02f6:
        r3 = new aajs;
        r2 = r2.build();
        r2 = (defpackage.anxl) r2;
        r13 = r2;
        r13 = (defpackage.aten) r13;
        r14 = r1.c;
        r4 = r1.d;
        r9 = r1.e;
        r2 = r1.f;
        r6 = r1.g;
        r11 = r1.h;
        r15 = r1.i;
        r12 = r1.j;
        r1 = r1.k;
        r23 = r12;
        r12 = r3;
        r22 = r15;
        r15 = r4;
        r17 = r9;
        r19 = r2;
        r20 = r6;
        r21 = r11;
        r24 = r1;
        r12.<init>(r13, r14, r15, r17, r19, r20, r21, r22, r23, r24);
        r1 = new afel;
        r1.<init>(r8, r0, r7, r3);
        r0 = r8.e;
        r8.a(r1, r0, r7);
        return;
    L_0x0331:
        r0 = r8.i;
        r2 = r0.T();
        if (r2 == 0) goto L_0x04a1;
    L_0x0339:
        r0 = r0.U();
        if (r0 != 0) goto L_0x04a1;
    L_0x033f:
        r0 = r8.q;
        if (r0 == 0) goto L_0x0345;
    L_0x0343:
        goto L_0x04a1;
    L_0x0345:
        r0 = r7.a;
        r2 = r0.hashCode();
        r5 = -665462704; // 0xffffffffd855d850 float:-9.4050013E14 double:NaN;
        if (r2 == r5) goto L_0x0360;
    L_0x0350:
        r5 = 506615561; // 0x1e325709 float:9.44124E-21 double:2.503013443E-315;
        if (r2 == r5) goto L_0x0356;
    L_0x0355:
        goto L_0x0369;
    L_0x0356:
        r2 = "keyerror";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0369;
    L_0x035e:
        r3 = 0;
        goto L_0x0369;
    L_0x0360:
        r2 = "unavailable";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0369;
    L_0x0368:
        r3 = 1;
    L_0x0369:
        if (r3 == 0) goto L_0x036f;
    L_0x036b:
        if (r3 == r4) goto L_0x036f;
    L_0x036d:
        goto L_0x04a1;
    L_0x036f:
        r0 = r26.b();
        if (r0 == 0) goto L_0x04a1;
    L_0x0375:
        r0 = r8.i;
        r0 = r0.c;
        r2 = r0.b;
        r2 = r2 & 8192;
        if (r2 == 0) goto L_0x038c;
    L_0x037f:
        r0 = r0.D;
        if (r0 != 0) goto L_0x0385;
    L_0x0383:
        r0 = defpackage.axbf.n;
    L_0x0385:
        r0 = r0.i;
        if (r0 != 0) goto L_0x038a;
    L_0x0389:
        goto L_0x038c;
    L_0x038a:
        r0 = 1;
        goto L_0x038d;
    L_0x038c:
        r0 = 0;
    L_0x038d:
        if (r0 != 0) goto L_0x0392;
    L_0x038f:
        r2 = "drmsd";
        goto L_0x0394;
    L_0x0392:
        r2 = "drml3enforced";
    L_0x0394:
        r5 = r2;
        if (r0 != 0) goto L_0x03dc;
    L_0x0397:
        r0 = r8.i;
        r2 = r0.c;
        r2 = r2.a;
        r2 = r2 & 2;
        if (r2 == 0) goto L_0x0421;
    L_0x03a1:
        r0 = r0.aE();
        r0 = r0.toBuilder();
        r0 = (defpackage.anxo) r0;
        r0 = (defpackage.awdf) r0;
        r2 = r0.a();
        r2 = r2.toBuilder();
        r2 = (defpackage.anxo) r2;
        r2 = (defpackage.arhj) r2;
        r2.copyOnWrite();
        r3 = r2.instance;
        r3 = (defpackage.arhh) r3;
        r6 = r3.b;
        r6 = r6 | 4;
        r3.b = r6;
        r3.C = r1;
        r2.a();
        r0.a(r2);
        r1 = new aajj;
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.awdg) r0;
        r1.<init>(r0);
        goto L_0x041f;
    L_0x03dc:
        r0 = r8.i;
        r1 = r0.c;
        r1 = r1.a;
        r1 = r1 & 2;
        if (r1 == 0) goto L_0x0421;
    L_0x03e6:
        r0 = r0.aE();
        r0 = r0.toBuilder();
        r0 = (defpackage.anxo) r0;
        r0 = (defpackage.awdf) r0;
        r1 = r0.a();
        r1 = r1.toBuilder();
        r1 = (defpackage.anxo) r1;
        r1 = (defpackage.arhj) r1;
        r1.copyOnWrite();
        r2 = r1.instance;
        r2 = (defpackage.arhh) r2;
        r3 = r2.e;
        r3 = r3 | r4;
        r2.e = r3;
        r2.bd = r4;
        r1.a();
        r0.a(r1);
        r1 = new aajj;
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.awdg) r0;
        r1.<init>(r0);
    L_0x041f:
        r3 = r1;
        goto L_0x0422;
    L_0x0421:
        r3 = r0;
    L_0x0422:
        r0 = r8.g;
        r1 = r0.b;
        r1 = r1.toBuilder();
        r1 = (defpackage.anxo) r1;
        r1 = (defpackage.ateq) r1;
        r1.e();
        r2 = r0.b;
        r2 = r2.d;
        r2 = r2.iterator();
    L_0x0439:
        r6 = r2.hasNext();
        if (r6 == 0) goto L_0x045e;
    L_0x043f:
        r6 = r2.next();
        r6 = (defpackage.arlv) r6;
        r9 = r6.e;
        r9 = defpackage.aaja.a(r9);
        if (r9 != 0) goto L_0x044e;
    L_0x044d:
        goto L_0x045a;
    L_0x044e:
        r9 = r6.i;
        r10 = r6.j;
        r9 = defpackage.aahr.a(r9, r10);
        r10 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
        if (r9 > r10) goto L_0x0439;
    L_0x045a:
        r1.b(r6);
        goto L_0x0439;
    L_0x045e:
        r6 = new aajs;
        r1 = r1.build();
        r1 = (defpackage.anxl) r1;
        r12 = r1;
        r12 = (defpackage.aten) r12;
        r13 = r0.c;
        r14 = r0.d;
        r1 = r0.e;
        r9 = r0.f;
        r10 = r0.g;
        r11 = r0.h;
        r4 = r0.i;
        r7 = r0.j;
        r0 = r0.k;
        r20 = r11;
        r11 = r6;
        r16 = r1;
        r18 = r9;
        r19 = r10;
        r21 = r4;
        r22 = r7;
        r23 = r0;
        r11.<init>(r12, r13, r14, r16, r18, r19, r20, r21, r22, r23);
        r0 = 1;
        r8.q = r0;
        r0 = new afek;
        r1 = r0;
        r2 = r8;
        r4 = r26;
        r1.<init>(r2, r3, r4, r5, r6);
        r1 = r8.e;
        r2 = r26;
        r8.a(r0, r1, r2);
        return;
    L_0x04a1:
        r2 = r7;
        r0 = r8.i;
        r3 = r8.u;
        r0 = r0.c;
        r4 = r0.b;
        r4 = r4 & 8192;
        if (r4 == 0) goto L_0x04b6;
    L_0x04ae:
        r0 = r0.D;
        if (r0 != 0) goto L_0x04b4;
    L_0x04b2:
        r0 = defpackage.axbf.n;
    L_0x04b4:
        r1 = r0.l;
    L_0x04b6:
        if (r3 >= r1) goto L_0x04e8;
    L_0x04b8:
        r0 = r26.e();
        if (r0 == 0) goto L_0x04e8;
    L_0x04be:
        r0 = r8.z;
        if (r0 == 0) goto L_0x04e8;
    L_0x04c2:
        r0 = r0.a();
        r1 = "net.unavailable";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x04e8;
    L_0x04ce:
        r0 = r8.j;
        if (r0 != 0) goto L_0x04d3;
    L_0x04d2:
        goto L_0x04e8;
    L_0x04d3:
        r0 = r8.u;
        r1 = 1;
        r0 = r0 + r1;
        r8.u = r0;
        r0 = r8.i;
        r1 = r8.g;
        r3 = new afed;
        r3.<init>(r8, r0, r2, r1);
        r0 = r8.e;
        r8.a(r3, r0, r2);
        return;
    L_0x04e8:
        r0 = r8.i;
        r0 = r0.c;
        r1 = r0.b;
        r1 = r1 & 8192;
        if (r1 == 0) goto L_0x05d6;
    L_0x04f2:
        r0 = r0.D;
        if (r0 != 0) goto L_0x04f8;
    L_0x04f6:
        r0 = defpackage.axbf.n;
    L_0x04f8:
        r0 = r0.e;
        if (r0 != 0) goto L_0x04fe;
    L_0x04fc:
        goto L_0x05d6;
    L_0x04fe:
        r0 = r8.o;
        if (r0 != 0) goto L_0x05d6;
    L_0x0502:
        r0 = r26.e();
        if (r0 != 0) goto L_0x05d6;
    L_0x0508:
        r0 = r8.h();
        r1 = r8.g;
        r3 = r8.i;
        r0 = r0.a(r1, r3);
        r0 = r0 & 4;
        if (r0 == 0) goto L_0x05d6;
    L_0x0518:
        r0 = r8.g;
        r0 = r0.l();
        r1 = 0;
        if (r0 != 0) goto L_0x0539;
    L_0x0521:
        r0 = r8.g;
        r3 = r0.b;
        r3 = r3.f;
        r3 = r3.isEmpty();
        if (r3 != 0) goto L_0x0536;
    L_0x052d:
        r0 = r0.b;
        r0 = r0.f;
        r0 = android.net.Uri.parse(r0);
        goto L_0x0537;
    L_0x0536:
        r0 = r1;
    L_0x0537:
        if (r0 == 0) goto L_0x05d6;
    L_0x0539:
        r0 = r8.g;
        r0 = r0.n();
        if (r0 != 0) goto L_0x05d6;
    L_0x0541:
        r0 = r8.j;
        if (r0 == 0) goto L_0x05d6;
    L_0x0545:
        r8.y = r2;
        r0 = 1;
        r8.o = r0;
        r0 = r8.i;
        r0 = r0.aE();
        r0 = r0.toBuilder();
        r0 = (defpackage.anxo) r0;
        r0 = (defpackage.awdf) r0;
        r0.copyOnWrite();
        r3 = r0.instance;
        r3 = (defpackage.awdg) r3;
        r3.d = r1;
        r1 = r3.a;
        r1 = r1 & -3;
        r3.a = r1;
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.awdg) r0;
        r1 = new aajj;
        r1.<init>(r0);
        r0 = r8.i;
        r0 = r0.c;
        r3 = r0.b;
        r3 = r3 & 8192;
        if (r3 == 0) goto L_0x05c9;
    L_0x057e:
        r0 = r0.D;
        if (r0 != 0) goto L_0x0584;
    L_0x0582:
        r0 = defpackage.axbf.n;
    L_0x0584:
        r0 = r0.f;
        if (r0 != 0) goto L_0x0589;
    L_0x0588:
        goto L_0x05c9;
    L_0x0589:
        r0 = r8.g;
        r3 = new aajs;
        r4 = r0.b;
        r4 = r4.toBuilder();
        r4 = (defpackage.anxo) r4;
        r4 = (defpackage.ateq) r4;
        r4.e();
        r5 = "";
        r4.a(r5);
        r4 = r4.build();
        r4 = (defpackage.anxl) r4;
        r10 = r4;
        r10 = (defpackage.aten) r10;
        r11 = r0.c;
        r12 = r0.d;
        r14 = r0.e;
        r16 = r0.a();
        r17 = 0;
        r18 = 0;
        r4 = r0.f;
        r5 = r0.g;
        r0 = r0.h;
        r9 = r3;
        r19 = r4;
        r20 = r5;
        r21 = r0;
        r22 = r1;
        r9.<init>(r10, r11, r12, r14, r16, r17, r18, r19, r20, r21, r22);
        goto L_0x05cb;
    L_0x05c9:
        r3 = r8.g;
    L_0x05cb:
        r0 = new afec;
        r0.<init>(r8, r1, r2, r3);
        r1 = r8.e;
        r8.a(r0, r1, r2);
        return;
    L_0x05d6:
        r0 = r26.d();
        if (r0 == 0) goto L_0x0616;
    L_0x05dc:
        r0 = r8.o;
        if (r0 == 0) goto L_0x05fc;
    L_0x05e0:
        r0 = r8.y;
        r0 = defpackage.amqw.a(r0);
        r0 = (defpackage.afif) r0;
        r1 = r8.e;
        r3 = "progressivefail";
        r2 = defpackage.afdy.a(r2, r3);
        r1.a(r2);
        r8.y();
        r1 = r8.e;
        r1.a(r0);
        return;
    L_0x05fc:
        r8.y();
        goto L_0x0616;
    L_0x0600:
        r2 = r7;
        r0 = r8.c;
        r1 = 1;
        r0.f = r1;
        r0 = r8.i;
        r1 = r8.g;
        r3 = new afej;
        r3.<init>(r8, r0, r2, r1);
        r0 = r8.e;
        r8.a(r3, r0, r2);
        return;
    L_0x0615:
        r2 = r7;
    L_0x0616:
        r0 = r25;
    L_0x0618:
        r1 = r0.a;
        r1.a(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afen.a(afif):void");
    }

    public final void a(int i) {
        this.c.d.post(new afem(this, i));
    }

    public final void b() {
        afdy afdy = this.c;
        if (afdy.g == null || this.a != afdy.e || afdy.x()) {
            this.a.b();
        }
    }

    public final void a() {
        afdy afdy = this.c;
        if (afdy.g == null || this.a != afdy.e || afdy.x()) {
            this.a.a();
        }
    }

    public final void e() {
        this.b = true;
        afdy afdy = this.c;
        if (afdy.g == null || this.a != afdy.e || afdy.i.ay() || !afdy.w || afdy.x) {
            this.a.e();
        } else {
            afdy.x = true;
        }
    }

    public final void a(aetv aetv) {
        afdy afdy = this.c;
        if (afdy.g != null && this.a == afdy.e) {
            afdy.A = aetv;
        }
        this.a.a(aetv);
    }

    public final void i() {
        this.b = false;
        this.c.g = null;
        this.a.i();
    }
}
