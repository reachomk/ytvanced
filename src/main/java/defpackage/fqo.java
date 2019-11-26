package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;

/* renamed from: fqo */
public final class fqo extends ybo {
    public eif Z;
    public View a;
    private aaas aC;
    private ejc aD;
    private ftc aE;
    private boolean aF;
    public zeb aa;
    public bcaa ab;
    public dvc ac;
    public fsl ad;
    public fsx ae;
    public fqt af;
    public Rect b;
    public int[] c;

    public final void d(Bundle bundle) {
        super.d(bundle);
        this.aD = new fqr(this);
        this.Z.a(this.aD);
    }

    public final void X_() {
        super.X_();
        this.Z.b(this.aD);
        this.Z.b(this.aE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0416  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x048d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x048b  */
    public final android.view.View a(android.view.LayoutInflater r56, android.view.ViewGroup r57, android.os.Bundle r58) {
        /*
        r55 = this;
        r0 = r55;
        r1 = r55.p();
        r1 = defpackage.xse.a(r1);
        r1 = (defpackage.fqs) r1;
        r1.a(r0);
        r1 = r0.j;
        if (r1 != 0) goto L_0x0014;
    L_0x0013:
        goto L_0x0023;
    L_0x0014:
        r2 = "ID";
        r1 = r1.getString(r2);
        if (r1 == 0) goto L_0x0023;
    L_0x001c:
        r1 = r0.j;
        r1 = r1.getString(r2);
        goto L_0x0025;
    L_0x0023:
        r1 = "";
    L_0x0025:
        r0.aA = r1;
        r1 = r0.ak;
        r2 = defpackage.ybo.class;
        r1.a(r0, r2);
        r1 = 2131034435; // 0x7f050143 float:1.7679387E38 double:1.0528709044E-314;
        r2 = 0;
        r3 = r56;
        r4 = r57;
        r1 = r3.inflate(r1, r4, r2);
        r0.ap = r1;
        r1 = r0.ap;
        r3 = 2131756249; // 0x7f1004d9 float:1.91434E38 double:1.053227528E-314;
        r1 = r1.findViewById(r3);
        r0.as = r1;
        r1 = r0.ap;
        r3 = 2131756255; // 0x7f1004df float:1.9143412E38 double:1.053227531E-314;
        r1 = r1.findViewById(r3);
        r0.at = r1;
        r1 = new yfh;
        r4 = r0.ai;
        r5 = r0.aj;
        r6 = new ybn;
        r6.<init>(r0);
        r7 = new ybq;
        r7.<init>(r0);
        r8 = r0.ap;
        r9 = r0.aA;
        r10 = new ybp;
        r10.<init>(r0);
        r11 = r0.al;
        r12 = r0.an;
        r3 = r1;
        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12);
        r0.av = r1;
        r1 = r0.am;
        r3 = new ybw;
        r4 = new ybs;
        r4.<init>(r0);
        r5 = r0.ap;
        r6 = 2131755944; // 0x7f1003a8 float:1.9142782E38 double:1.0532273772E-314;
        r5 = r5.findViewById(r6);
        r5 = (android.view.ViewGroup) r5;
        r3.<init>(r4, r5);
        r4 = new zcq;
        r5 = 1;
        r3 = defpackage.zcs.a(r3, r5);
        r3 = (defpackage.zcp) r3;
        r6 = r1.a;
        r6 = r6.get();
        r6 = (defpackage.aaas) r6;
        r7 = 2;
        r6 = defpackage.zcs.a(r6, r7);
        r6 = (defpackage.aaas) r6;
        r8 = r1.b;
        r8 = r8.get();
        r8 = (defpackage.zay) r8;
        r9 = 3;
        r8 = defpackage.zcs.a(r8, r9);
        r8 = (defpackage.zay) r8;
        r1 = r1.c;
        r1 = r1.get();
        r1 = (android.content.Context) r1;
        r10 = 4;
        r1 = defpackage.zcs.a(r1, r10);
        r1 = (android.content.Context) r1;
        r4.<init>(r3, r6, r8, r1);
        r0.az = r4;
        r1 = r0.ao;
        r3 = r0.ap;
        r4 = 2131756246; // 0x7f1004d6 float:1.9143394E38 double:1.0532275265E-314;
        r3 = r3.findViewById(r4);
        r4 = new xyv;
        r6 = r1.a;
        r6 = r6.get();
        r6 = (defpackage.acvx) r6;
        r6 = defpackage.xyz.a(r6, r5);
        r12 = r6;
        r12 = (defpackage.acvx) r12;
        r6 = r1.b;
        r6 = r6.get();
        r6 = (defpackage.aaas) r6;
        r6 = defpackage.xyz.a(r6, r7);
        r13 = r6;
        r13 = (defpackage.aaas) r13;
        r1 = r1.c;
        r1 = r1.get();
        r1 = (defpackage.alpa) r1;
        r1 = defpackage.xyz.a(r1, r9);
        r14 = r1;
        r14 = (defpackage.alpa) r14;
        r1 = defpackage.xyz.a(r3, r10);
        r15 = r1;
        r15 = (android.view.View) r15;
        r1 = 5;
        r3 = defpackage.xyz.a(r0, r1);
        r16 = r3;
        r16 = (defpackage.xyo) r16;
        r3 = 6;
        r6 = defpackage.xyz.a(r0, r3);
        r17 = r6;
        r17 = (defpackage.xza) r17;
        r11 = r4;
        r11.<init>(r12, r13, r14, r15, r16, r17);
        r0.ay = r4;
        r4 = r0.ap;
        r6 = 2131756247; // 0x7f1004d7 float:1.9143396E38 double:1.053227527E-314;
        r6 = r4.findViewById(r6);
        r6 = (android.view.ViewStub) r6;
        r8 = 2131034445; // 0x7f05014d float:1.7679408E38 double:1.0528709094E-314;
        r6.setLayoutResource(r8);
        r6.inflate();
        r6 = 2131756248; // 0x7f1004d8 float:1.9143398E38 double:1.0532275274E-314;
        r4 = r4.findViewById(r6);
        r4 = (android.support.v7.widget.RecyclerView) r4;
        r4.setScrollContainer(r5);
        r0.aq = r4;
        r4 = r0.j;
        r6 = "NAV_ENDPOINT";
        r4 = r4.getByteArray(r6);
        r4 = defpackage.aaax.b(r4);
        r6 = r0.az;
        r8 = r0.ay;
        r11 = r0.ad;
        r12 = r0.ag;
        r13 = r0.av;
        r15 = new fsj;
        r14 = r15;
        r2 = r11.a;
        r2 = r2.get();
        r2 = (android.content.Context) r2;
        r2 = defpackage.fsl.a(r2, r5);
        r2 = (android.content.Context) r2;
        r5 = r15;
        r15 = r2;
        r2 = r11.b;
        r2 = r2.get();
        r2 = (defpackage.xsc) r2;
        r2 = defpackage.fsl.a(r2, r7);
        r16 = r2;
        r16 = (defpackage.xsc) r16;
        r2 = r11.c;
        r2 = r2.get();
        r2 = (defpackage.xzm) r2;
        r2 = defpackage.fsl.a(r2, r9);
        r17 = r2;
        r17 = (defpackage.xzm) r17;
        r2 = r11.d;
        r2 = r2.get();
        r2 = (defpackage.afxb) r2;
        r2 = defpackage.fsl.a(r2, r10);
        r18 = r2;
        r18 = (defpackage.afxb) r18;
        r2 = r11.e;
        r2 = r2.get();
        r2 = (defpackage.xci) r2;
        r1 = defpackage.fsl.a(r2, r1);
        r19 = r1;
        r19 = (defpackage.xci) r19;
        r1 = r11.f;
        r1 = r1.get();
        r1 = (defpackage.akkq) r1;
        r1 = defpackage.fsl.a(r1, r3);
        r20 = r1;
        r20 = (defpackage.akkq) r20;
        r1 = r11.g;
        r1 = r1.get();
        r1 = (defpackage.eid) r1;
        r2 = 7;
        r1 = defpackage.fsl.a(r1, r2);
        r21 = r1;
        r21 = (defpackage.eid) r21;
        r1 = r11.h;
        r1 = r1.get();
        r1 = (defpackage.elv) r1;
        r2 = 8;
        r1 = defpackage.fsl.a(r1, r2);
        r22 = r1;
        r22 = (defpackage.elv) r22;
        r1 = r11.i;
        r1 = r1.get();
        r1 = (defpackage.ffw) r1;
        r3 = 9;
        r1 = defpackage.fsl.a(r1, r3);
        r23 = r1;
        r23 = (defpackage.ffw) r23;
        r1 = r11.j;
        r1 = r1.get();
        r1 = (defpackage.gal) r1;
        r3 = 10;
        r1 = defpackage.fsl.a(r1, r3);
        r24 = r1;
        r24 = (defpackage.gal) r24;
        r1 = r11.k;
        r1 = r1.get();
        r1 = (defpackage.hdd) r1;
        r3 = 11;
        r1 = defpackage.fsl.a(r1, r3);
        r25 = r1;
        r25 = (defpackage.hdd) r25;
        r1 = r11.l;
        r1 = r1.get();
        r1 = (defpackage.xpw) r1;
        r3 = 12;
        r1 = defpackage.fsl.a(r1, r3);
        r26 = r1;
        r26 = (defpackage.xpw) r26;
        r1 = r11.m;
        r1 = r1.get();
        r1 = (defpackage.xoi) r1;
        r3 = 13;
        r1 = defpackage.fsl.a(r1, r3);
        r27 = r1;
        r27 = (defpackage.xoi) r27;
        r1 = r11.n;
        r1 = r1.get();
        r1 = (defpackage.akpe) r1;
        r3 = 14;
        r1 = defpackage.fsl.a(r1, r3);
        r28 = r1;
        r28 = (defpackage.akpe) r28;
        r1 = r11.o;
        r1 = r1.get();
        r1 = (defpackage.yfg) r1;
        r3 = 15;
        r1 = defpackage.fsl.a(r1, r3);
        r29 = r1;
        r29 = (defpackage.yfg) r29;
        r1 = r11.p;
        r1 = r1.get();
        r1 = (defpackage.aaas) r1;
        r3 = 16;
        r1 = defpackage.fsl.a(r1, r3);
        r30 = r1;
        r30 = (defpackage.aaas) r30;
        r1 = r11.q;
        r1 = r1.get();
        r1 = (defpackage.ycu) r1;
        r3 = 17;
        r1 = defpackage.fsl.a(r1, r3);
        r31 = r1;
        r31 = (defpackage.ycu) r31;
        r1 = r11.r;
        r1 = r1.get();
        r1 = (defpackage.jvf) r1;
        r3 = 18;
        r1 = defpackage.fsl.a(r1, r3);
        r32 = r1;
        r32 = (defpackage.jvf) r32;
        r1 = r11.s;
        r1 = r1.get();
        r1 = (defpackage.fgc) r1;
        r3 = 19;
        r1 = defpackage.fsl.a(r1, r3);
        r33 = r1;
        r33 = (defpackage.fgc) r33;
        r1 = r11.t;
        r1 = r1.get();
        r1 = (defpackage.fsc) r1;
        r3 = 20;
        r1 = defpackage.fsl.a(r1, r3);
        r34 = r1;
        r34 = (defpackage.fsc) r34;
        r1 = r11.u;
        r1 = r1.get();
        r1 = (defpackage.akmx) r1;
        r3 = 21;
        r1 = defpackage.fsl.a(r1, r3);
        r35 = r1;
        r35 = (defpackage.akmx) r35;
        r1 = r11.v;
        r1 = r1.get();
        r1 = (defpackage.jtw) r1;
        r3 = 22;
        r1 = defpackage.fsl.a(r1, r3);
        r36 = r1;
        r36 = (defpackage.jtw) r36;
        r1 = r11.w;
        r1 = r1.get();
        r1 = (defpackage.aizy) r1;
        r3 = 23;
        r1 = defpackage.fsl.a(r1, r3);
        r37 = r1;
        r37 = (defpackage.aizy) r37;
        r1 = r11.x;
        r1 = r1.get();
        r1 = (defpackage.xwr) r1;
        r3 = 24;
        r1 = defpackage.fsl.a(r1, r3);
        r38 = r1;
        r38 = (defpackage.xwr) r38;
        r1 = r11.y;
        r1 = r1.get();
        r1 = (defpackage.zbe) r1;
        r3 = 25;
        r1 = defpackage.fsl.a(r1, r3);
        r39 = r1;
        r39 = (defpackage.zbe) r39;
        r1 = r11.z;
        r1 = r1.get();
        r1 = (defpackage.eif) r1;
        r3 = 26;
        r1 = defpackage.fsl.a(r1, r3);
        r40 = r1;
        r40 = (defpackage.eif) r40;
        r1 = r11.A;
        r1 = r1.get();
        r1 = (defpackage.lwc) r1;
        r3 = 27;
        r1 = defpackage.fsl.a(r1, r3);
        r41 = r1;
        r41 = (defpackage.lwc) r41;
        r1 = r11.B;
        r1 = r1.get();
        r1 = (com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerLayout) r1;
        r3 = 28;
        r1 = defpackage.fsl.a(r1, r3);
        r42 = r1;
        r42 = (com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerLayout) r42;
        r1 = r11.C;
        r1 = r1.get();
        r1 = (defpackage.allb) r1;
        r3 = 29;
        r1 = defpackage.fsl.a(r1, r3);
        r43 = r1;
        r43 = (defpackage.allb) r43;
        r1 = r11.D;
        r1 = r1.get();
        r1 = (defpackage.xzn) r1;
        r3 = 30;
        r1 = defpackage.fsl.a(r1, r3);
        r44 = r1;
        r44 = (defpackage.xzn) r44;
        r1 = r11.E;
        r1 = r1.get();
        r1 = (android.os.Handler) r1;
        r3 = 31;
        r1 = defpackage.fsl.a(r1, r3);
        r45 = r1;
        r45 = (android.os.Handler) r45;
        r1 = r11.F;
        r1 = r1.get();
        r1 = (defpackage.afve) r1;
        r3 = 32;
        r1 = defpackage.fsl.a(r1, r3);
        r46 = r1;
        r46 = (defpackage.afve) r46;
        r1 = r11.G;
        r1 = r1.get();
        r1 = (defpackage.zaz) r1;
        r3 = 33;
        r1 = defpackage.fsl.a(r1, r3);
        r47 = r1;
        r47 = (defpackage.zaz) r47;
        r1 = r11.H;
        r1 = r1.get();
        r1 = (defpackage.fsu) r1;
        r3 = 34;
        r1 = defpackage.fsl.a(r1, r3);
        r48 = r1;
        r48 = (defpackage.fsu) r48;
        r1 = 35;
        r1 = defpackage.fsl.a(r12, r1);
        r49 = r1;
        r49 = (defpackage.acvx) r49;
        r1 = 36;
        r1 = defpackage.fsl.a(r4, r1);
        r50 = r1;
        r50 = (defpackage.apxu) r50;
        r1 = 37;
        r1 = defpackage.fsl.a(r13, r1);
        r51 = r1;
        r51 = (defpackage.yfh) r51;
        r1 = 38;
        r1 = defpackage.fsl.a(r0, r1);
        r52 = r1;
        r52 = (defpackage.xyb) r52;
        r1 = 39;
        r1 = defpackage.fsl.a(r6, r1);
        r53 = r1;
        r53 = (defpackage.zcq) r53;
        r1 = 40;
        r1 = defpackage.fsl.a(r8, r1);
        r54 = r1;
        r54 = (defpackage.xyv) r54;
        r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54);
        r1 = new ftc;
        r3 = r0.aq;
        r3 = r3.n;
        r3 = (defpackage.ans) r3;
        r1.<init>(r5, r3);
        r0.aE = r1;
        r1 = r0.aq;
        r3 = r0.aE;
        r1.a(r3);
        r1 = r0.Z;
        r3 = r0.aE;
        r1.a(r3);
        r0.au = r5;
        r1 = r0.ap;
        r3 = new xzs;
        r4 = r0.aC;
        if (r4 != 0) goto L_0x0424;
    L_0x0416:
        r4 = r0.ab;
        r4 = r4.get();
        r4 = (defpackage.aaas) r4;
        r4 = defpackage.ftm.b(r4);
        r0.aC = r4;
    L_0x0424:
        r4 = r0.aC;
        r3.<init>(r4);
        r0.aw = r3;
        r3 = 2131755461; // 0x7f1001c5 float:1.9141802E38 double:1.0532271386E-314;
        r1 = r1.findViewById(r3);
        r1 = (android.widget.ImageView) r1;
        r3 = new ybr;
        r3.<init>(r0);
        r1.setOnClickListener(r3);
        r1 = r0.j;
        if (r1 == 0) goto L_0x0448;
    L_0x0440:
        r3 = "CONVERSATION_PARAM_TAG";
        r1 = r1.getString(r3);
        r0.aB = r1;
    L_0x0448:
        r1 = r0.ap;
        r3 = r0.au;
        r3 = (defpackage.fsj) r3;
        r4 = r3.a;
        r3 = r3.b;
        r4.c(r3);
        r3 = 2131756254; // 0x7f1004de float:1.914341E38 double:1.0532275304E-314;
        r3 = r1.findViewById(r3);
        r0.a = r3;
        r3 = 2131756252; // 0x7f1004dc float:1.9143406E38 double:1.0532275294E-314;
        r3 = r1.findViewById(r3);
        r3 = (com.google.android.libraries.youtube.conversation.ui.StickyPlayerContainer) r3;
        r4 = r0.a;
        if (r4 == 0) goto L_0x047f;
    L_0x046b:
        if (r3 == 0) goto L_0x047f;
    L_0x046d:
        r5 = new fqv;
        r6 = r0.af;
        r5.<init>(r6);
        r4.addOnLayoutChangeListener(r5);
        r4 = new fqq;
        r4.<init>(r0, r3);
        defpackage.xpu.a(r3, r4);
    L_0x047f:
        r4 = r0.au;
        r4 = (defpackage.fsj) r4;
        r4 = r4.b;
        r5 = r4.h;
        r6 = r5.b;
        if (r6 != 0) goto L_0x048d;
    L_0x048b:
        r6 = 1;
        goto L_0x048e;
    L_0x048d:
        r6 = 0;
    L_0x048e:
        r7 = "StickyPlayerContainer view can only be set once.";
        defpackage.amqw.b(r6, r7);
        r6 = defpackage.amqw.a(r3);
        r6 = (com.google.android.libraries.youtube.conversation.ui.StickyPlayerContainer) r6;
        r5.b = r6;
        r6 = r5.b;
        r7 = r5.a;
        r7 = r7.a;
        r8 = -1;
        r9 = -2;
        r6.addView(r7, r8, r9);
        r6 = r5.b;
        r6.setVisibility(r2);
        r2 = r5.b;
        r2.d = r5;
        r3.c = r4;
        r2 = r0.ae;
        r2.a();
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqo.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void i() {
        super.i();
        this.ae.b();
    }

    public final void B() {
        View view = this.a;
        if (view != null && view.getHeight() > 0) {
            this.af.c(this.a.getHeight());
        }
        super.B();
        fso fso = ((fsj) this.au).b;
        String.format("CAVC.onResume", new Object[0]);
        fso.k = true;
        fso.o = 1;
        fso.f.a(fso);
        fso.c.c.add(fso);
        fso.g.c = true;
        fso.e.b();
    }

    public final void ad_() {
        super.ad_();
        this.af.c(0);
        fso fso = ((fsj) this.au).b;
        String.format("CAVC.onPause", new Object[0]);
        fso.f.b(fso);
        fso.c.c.remove(fso);
        fsk fsk = fso.l;
        if (fsk == null || fso.n != 3) {
            ygg ygg = fso.j;
            if (ygg != null && fso.n == 5) {
                fso.d.a((ycs) ygg.d(), false);
                fso.c(1);
                fso.a.a(null, true);
                fso.h.c();
                fso.h.d();
                fso.j = null;
            }
        } else {
            fso.d.b(fsk.a);
            fso.c(1);
            fso.l = null;
        }
        fso.e.b();
        fso.k = false;
    }

    public final void W_() {
        super.W_();
        this.aF = true;
    }

    public final void N_() {
        super.N_();
        this.ae.a(false);
        this.aF = false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void f() {
        ezt ezt = (ezt) p();
        if (ezt != null && ezt.c() != null) {
            ((ezt) p()).c().b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0099  */
    public final defpackage.aqje W() {
        /*
        r5 = this;
        r0 = r5.j;
        r1 = 0;
        if (r0 == 0) goto L_0x00b6;
    L_0x0005:
        r2 = "NAV_ENDPOINT";
        r0 = r0.getByteArray(r2);
        if (r0 == 0) goto L_0x0096;
    L_0x000d:
        r2 = defpackage.anxa.c();	 Catch:{ anyg -> 0x0096 }
        r3 = defpackage.apxu.d;	 Catch:{ anyg -> 0x0096 }
        r0 = defpackage.anxl.parseFrom(r3, r0, r2);	 Catch:{ anyg -> 0x0096 }
        r0 = (defpackage.apxu) r0;	 Catch:{ anyg -> 0x0096 }
        r2 = com.google.protos.youtube.api.innertube.ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.conversationWithReplyEndpoint;
        r2 = defpackage.anxl.checkIsLite(r2);
        r0.a(r2);
        r3 = r0.h;
        r2 = r2.d;
        r2 = r3.a(r2);
        if (r2 != 0) goto L_0x002d;
    L_0x002c:
        goto L_0x0058;
    L_0x002d:
        r2 = com.google.protos.youtube.api.innertube.ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.conversationWithReplyEndpoint;
        r2 = defpackage.anxl.checkIsLite(r2);
        r0.a(r2);
        r3 = r0.h;
        r4 = r2.d;
        r3 = r3.b(r4);
        if (r3 != 0) goto L_0x0043;
    L_0x0040:
        r2 = r2.b;
        goto L_0x0047;
    L_0x0043:
        r2 = r2.a(r3);
    L_0x0047:
        r2 = (com.google.protos.youtube.api.innertube.ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint) r2;
        r3 = r2.a;
        r3 = r3 & 16;
        if (r3 == 0) goto L_0x0058;
    L_0x004f:
        r0 = r2.f;
        if (r0 != 0) goto L_0x0055;
    L_0x0053:
        r0 = defpackage.aqtc.c;
    L_0x0055:
        r0 = r0.b;
        goto L_0x0097;
    L_0x0058:
        r2 = com.google.protos.youtube.api.innertube.SharedConversationEndpointOuterClass$SharedConversationEndpoint.sharedConversationEndpoint;
        r2 = defpackage.anxl.checkIsLite(r2);
        r0.a(r2);
        r3 = r0.h;
        r2 = r2.d;
        r2 = r3.a(r2);
        if (r2 == 0) goto L_0x0096;
    L_0x006b:
        r2 = com.google.protos.youtube.api.innertube.SharedConversationEndpointOuterClass$SharedConversationEndpoint.sharedConversationEndpoint;
        r2 = defpackage.anxl.checkIsLite(r2);
        r0.a(r2);
        r0 = r0.h;
        r3 = r2.d;
        r0 = r0.b(r3);
        if (r0 != 0) goto L_0x0081;
    L_0x007e:
        r0 = r2.b;
        goto L_0x0085;
    L_0x0081:
        r0 = r2.a(r0);
    L_0x0085:
        r0 = (com.google.protos.youtube.api.innertube.SharedConversationEndpointOuterClass$SharedConversationEndpoint) r0;
        r2 = r0.a;
        r2 = r2 & 16;
        if (r2 == 0) goto L_0x0096;
    L_0x008d:
        r0 = r0.f;
        if (r0 != 0) goto L_0x0093;
    L_0x0091:
        r0 = defpackage.aqtc.c;
    L_0x0093:
        r0 = r0.b;
        goto L_0x0097;
    L_0x0096:
        r0 = r1;
    L_0x0097:
        if (r0 == 0) goto L_0x00b6;
    L_0x0099:
        r0 = android.net.Uri.parse(r0);
        r2 = r5.aa;
        r0 = r2.a(r0);
        r2 = r0 instanceof defpackage.aqjc;
        if (r2 == 0) goto L_0x00b6;
    L_0x00a7:
        r0 = (defpackage.aqjc) r0;
        r2 = r0.a;
        r2 = r2 & 1;
        if (r2 == 0) goto L_0x00b6;
    L_0x00af:
        r0 = r0.b;
        if (r0 != 0) goto L_0x00b5;
    L_0x00b3:
        r0 = defpackage.aqje.a;
    L_0x00b5:
        return r0;
    L_0x00b6:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqo.W():aqje");
    }

    public final void a(aats aats) {
        this.as.setVisibility(8);
        boolean z = false;
        this.aq.setLayoutParams(new LayoutParams(-1, 0, 1.0f));
        this.at.setContentDescription(Integer.toString(this.au.u));
        xzs xzs = this.aw;
        if (aats.b == null && aats.e() != null) {
            aats.b = aats.e();
        } else if (aats.b == null && aats.f() != null) {
            aats.b = aats.f();
        }
        xzs.b = aats.b;
        ((ezt) p()).c().b();
        if (this.aF) {
            fsx fsx = this.ae;
            if (this.au.u == 2) {
                z = true;
            }
            fsx.a(z);
        }
    }

    public final String X() {
        ajts ajts = this.au.l;
        if (ajts == null) {
            return null;
        }
        return ajqy.a(ajts.a).toString();
    }

    public final boolean Y() {
        xxp xxp = this.au;
        if (xxp != null) {
            ajts ajts = xxp.l;
            if (ajts != null) {
                return ajts.h;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean Z() {
        return this.ac.aH_();
    }
}
