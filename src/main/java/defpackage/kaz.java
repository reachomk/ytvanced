package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/* renamed from: kaz */
public final class kaz extends ilg {
    private final akou h;
    private final hrg i;
    private final akoj j;
    private hrc k;

    public kaz(Context context, akkq akkq, flu flu, aaas aaas, akvo akvo, akvp akvp, hrg hrg, hmc hmc) {
        super(context, akkq, akvo, akvp, hmc);
        this.h = flu;
        this.i = hrg;
        flu.a(this.c);
        this.j = new akoj(aaas, (akou) flu);
    }

    public final View K_() {
        return this.h.a();
    }

    public final void a(akpb akpb) {
        super.a(akpb);
        this.j.a();
        hrc hrc = this.k;
        if (hrc != null) {
            hrc.b();
            hrc.c.b(hrc);
            hrc.f.b(hrc.l);
            hrc.g.getViewTreeObserver().removeOnGlobalLayoutListener(hrc.k);
            xpr.a(hrc.h, false);
            xpr.a(hrc.i, true);
            hrc.j.setTextColor(hrc.m);
            TextView textView = hrc.j;
            textView.setTypeface(textView.getTypeface(), 0);
            xpr.a(hrc.j, false);
            akou akou = hrc.o;
            if (akou != null) {
                akou.a(hrc.e);
            }
            hrc.n = null;
            hrc.o = null;
            hrc.p = null;
            hrc.q = null;
            hrc.r = null;
            this.k = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:91:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0249  */
    public final /* synthetic */ void a_(defpackage.akor r23, java.lang.Object r24) {
        /*
        r22 = this;
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r2 = (defpackage.aqfs) r2;
        r3 = r0.j;
        r4 = r1.a;
        r5 = r2.a;
        r5 = r5 & 256;
        r6 = 0;
        if (r5 == 0) goto L_0x001a;
    L_0x0013:
        r5 = r2.l;
        if (r5 != 0) goto L_0x001b;
    L_0x0017:
        r5 = defpackage.apxu.d;
        goto L_0x001b;
    L_0x001a:
        r5 = r6;
    L_0x001b:
        r7 = r23.b();
        r3.a(r4, r5, r7);
        r3 = r1.a;
        r4 = r2.n;
        r4 = r4.d();
        r3.a(r4, r6);
        r3 = r0.e;
        r3 = r3.getLayoutParams();
        if (r3 == 0) goto L_0x0045;
    L_0x0035:
        r4 = r0.a;
        r4 = r4.getResources();
        r5 = 2131625503; // 0x7f0e061f float:1.8878216E38 double:1.053162931E-314;
        r4 = r4.getDimension(r5);
        r4 = (int) r4;
        r3.width = r4;
    L_0x0045:
        r3 = r2.a;
        r4 = 8;
        r3 = r3 & r4;
        if (r3 == 0) goto L_0x0053;
    L_0x004c:
        r3 = r2.f;
        if (r3 != 0) goto L_0x0054;
    L_0x0050:
        r3 = defpackage.arml.f;
        goto L_0x0054;
    L_0x0053:
        r3 = r6;
    L_0x0054:
        r3 = defpackage.ajqy.a(r3);
        r0.a(r3);
        r3 = r2.a;
        r3 = r3 & 16;
        if (r3 == 0) goto L_0x0068;
    L_0x0061:
        r3 = r2.g;
        if (r3 != 0) goto L_0x0069;
    L_0x0065:
        r3 = defpackage.arml.f;
        goto L_0x0069;
    L_0x0068:
        r3 = r6;
    L_0x0069:
        r3 = defpackage.ajqy.a(r3);
        r0.b(r3);
        r3 = r2.a;
        r3 = r3 & 64;
        if (r3 == 0) goto L_0x007d;
    L_0x0076:
        r3 = r2.j;
        if (r3 != 0) goto L_0x007e;
    L_0x007a:
        r3 = defpackage.arml.f;
        goto L_0x007e;
    L_0x007d:
        r3 = r6;
    L_0x007e:
        r3 = defpackage.ajqy.a(r3);
        r0.c(r3);
        r3 = r2.a;
        r5 = 2;
        r3 = r3 & r5;
        if (r3 == 0) goto L_0x0092;
    L_0x008b:
        r3 = r2.c;
        if (r3 != 0) goto L_0x0093;
    L_0x008f:
        r3 = defpackage.awkv.d;
        goto L_0x0093;
    L_0x0092:
        r3 = r6;
    L_0x0093:
        r7 = r2.e;
        if (r7 != 0) goto L_0x0099;
    L_0x0097:
        r7 = defpackage.aygk.f;
    L_0x0099:
        r0.a(r3, r7);
        r3 = r2.d;
        r3 = r3.size();
        r7 = 1;
        if (r3 <= 0) goto L_0x00bb;
    L_0x00a5:
        r3 = r2.d;
        r3 = r3.size();
        if (r3 != r7) goto L_0x00b5;
    L_0x00ad:
        r3 = r2.d;
        r3 = defpackage.ipo.b(r3);
        if (r3 != 0) goto L_0x00bb;
    L_0x00b5:
        r3 = r2.d;
        r0.b(r3);
        goto L_0x00e2;
    L_0x00bb:
        r3 = r2.a;
        r3 = r3 & 128;
        if (r3 == 0) goto L_0x00c8;
    L_0x00c1:
        r3 = r2.k;
        if (r3 != 0) goto L_0x00c9;
    L_0x00c5:
        r3 = defpackage.arml.f;
        goto L_0x00c9;
    L_0x00c8:
        r3 = r6;
    L_0x00c9:
        r3 = defpackage.ajqy.a(r3);
        r8 = r2.a;
        r8 = r8 & 64;
        if (r8 == 0) goto L_0x00da;
    L_0x00d3:
        r8 = r2.j;
        if (r8 != 0) goto L_0x00db;
    L_0x00d7:
        r8 = defpackage.arml.f;
        goto L_0x00db;
    L_0x00da:
        r8 = r6;
    L_0x00db:
        r8 = defpackage.ajqy.a(r8);
        r0.a(r3, r8);
    L_0x00e2:
        r3 = r0.h;
        r3 = r3.a();
        r8 = r2.q;
        if (r8 != 0) goto L_0x00ee;
    L_0x00ec:
        r8 = defpackage.auvr.c;
    L_0x00ee:
        r9 = r1.a;
        r0.a(r3, r8, r2, r9);
        r3 = r0.k;
        if (r3 == 0) goto L_0x00f9;
    L_0x00f7:
        goto L_0x01b0;
    L_0x00f9:
        r3 = r2.u;
        if (r3 != 0) goto L_0x00ff;
    L_0x00fd:
        r3 = defpackage.awhh.c;
    L_0x00ff:
        r3 = r3.b;
        r3 = r3.isEmpty();
        if (r3 != 0) goto L_0x0224;
    L_0x0107:
        r3 = r0.i;
        r8 = r22.K_();
        r9 = r0.j;
        r15 = new hrc;
        r10 = r3.a;
        r10 = r10.get();
        r10 = (android.content.Context) r10;
        r10 = defpackage.hrg.a(r10, r7);
        r11 = r10;
        r11 = (android.content.Context) r11;
        r10 = r3.b;
        r10 = r10.get();
        r10 = (defpackage.eki) r10;
        r5 = defpackage.hrg.a(r10, r5);
        r12 = r5;
        r12 = (defpackage.eki) r12;
        r13 = r3.c;
        r5 = r3.d;
        r5 = r5.get();
        r5 = (defpackage.hmj) r5;
        r10 = 4;
        r5 = defpackage.hrg.a(r5, r10);
        r14 = r5;
        r14 = (defpackage.hmj) r14;
        r5 = r3.e;
        r5 = r5.get();
        r5 = (defpackage.xci) r5;
        r10 = 5;
        r5 = defpackage.hrg.a(r5, r10);
        r5 = (defpackage.xci) r5;
        r10 = r3.f;
        r10 = r10.get();
        r10 = (defpackage.akop) r10;
        r6 = 6;
        r6 = defpackage.hrg.a(r10, r6);
        r16 = r6;
        r16 = (defpackage.akop) r16;
        r6 = r3.g;
        r6 = r6.get();
        r6 = (defpackage.hpd) r6;
        r10 = 7;
        r6 = defpackage.hrg.a(r6, r10);
        r17 = r6;
        r17 = (defpackage.hpd) r17;
        r6 = r3.h;
        r6 = r6.get();
        r6 = (defpackage.zyw) r6;
        r4 = defpackage.hrg.a(r6, r4);
        r18 = r4;
        r18 = (defpackage.zyw) r18;
        r3 = r3.i;
        r3 = r3.get();
        r3 = (defpackage.hng) r3;
        r4 = 9;
        r3 = defpackage.hrg.a(r3, r4);
        r19 = r3;
        r19 = (defpackage.hng) r19;
        r3 = 10;
        r3 = defpackage.hrg.a(r8, r3);
        r20 = r3;
        r20 = (android.view.View) r20;
        r3 = 11;
        r3 = defpackage.hrg.a(r9, r3);
        r21 = r3;
        r21 = (defpackage.akoj) r21;
        r10 = r15;
        r3 = r15;
        r15 = r5;
        r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
        r0.k = r3;
    L_0x01b0:
        r3 = r0.k;
        r4 = r0.h;
        r5 = r2.u;
        if (r5 != 0) goto L_0x01ba;
    L_0x01b8:
        r5 = defpackage.awhh.c;
    L_0x01ba:
        r5 = r5.b;
        r5 = r5.isEmpty();
        if (r5 != 0) goto L_0x0224;
    L_0x01c2:
        r5 = r3.b;
        r6 = r2.u;
        if (r6 != 0) goto L_0x01ca;
    L_0x01c8:
        r6 = defpackage.awhh.c;
    L_0x01ca:
        r6 = r6.b;
        r5 = r5.a(r6);
        if (r5 == 0) goto L_0x0224;
    L_0x01d2:
        r5 = "sectionListController";
        r5 = r1.a(r5);
        r5 = r5 instanceof defpackage.hsf;
        if (r5 == 0) goto L_0x0224;
    L_0x01dc:
        r3.n = r1;
        r3.o = r4;
        r3.p = r2;
        r5 = r2.u;
        if (r5 != 0) goto L_0x01e8;
    L_0x01e6:
        r5 = defpackage.awhh.c;
    L_0x01e8:
        r5 = r5.b;
        r3.q = r5;
        r5 = r3.d;
        r6 = new hre;
        r6.<init>(r3);
        r4 = r5.a(r4, r6);
        r3.r = r4;
        r4 = r3.r;
        r5 = r1.a;
        r6 = r2.a;
        r6 = r6 & 256;
        if (r6 == 0) goto L_0x020a;
    L_0x0203:
        r6 = r2.l;
        if (r6 != 0) goto L_0x020b;
    L_0x0207:
        r6 = defpackage.apxu.d;
        goto L_0x020b;
    L_0x020a:
        r6 = 0;
    L_0x020b:
        r8 = r23.b();
        r4.a(r5, r6, r8);
        r3.a();
        r4 = r3.c;
        r4.a(r3);
        r4 = r3.f;
        r3 = r3.l;
        r4.a(r3);
        defpackage.hkq.a(r1, r2);
    L_0x0224:
        r3 = r2.u;
        if (r3 != 0) goto L_0x022a;
    L_0x0228:
        r3 = defpackage.awhh.c;
    L_0x022a:
        r3 = r3.a;
        r3 = r3 & r7;
        if (r3 != 0) goto L_0x0230;
    L_0x022f:
        goto L_0x025b;
    L_0x0230:
        r3 = r2.d;
        r3 = defpackage.ipo.b(r3);
        if (r3 == 0) goto L_0x025b;
    L_0x0238:
        r2 = r2.u;
        if (r2 != 0) goto L_0x023e;
    L_0x023c:
        r2 = defpackage.awhh.c;
    L_0x023e:
        r2 = r2.b;
        r3 = "PlaylistPresenterConstants.PLAYLIST_ID";
        r1.a(r3, r2);
        r2 = r0.f;
        if (r2 == 0) goto L_0x025b;
    L_0x0249:
        r3 = r0.g;
        if (r3 != 0) goto L_0x0256;
    L_0x024d:
        r3 = r0.b;
        r4 = 0;
        r2 = r3.a(r2, r4);
        r0.g = r2;
    L_0x0256:
        r2 = r0.g;
        r2.a(r1);
    L_0x025b:
        r2 = r0.h;
        r2.a(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kaz.a_(akor, java.lang.Object):void");
    }
}
