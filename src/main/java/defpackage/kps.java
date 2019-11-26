package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: kps */
public final class kps implements akot {
    private final eza a;
    private final View b;
    private final kpt c;
    private final kpt d;
    private kpt e;

    protected kps(Context context, akkq akkq, aaas aaas, akvo akvo, vmn vmn, tpu tpu, vod vod, dwk dwk, ViewGroup viewGroup) {
        this.b = LayoutInflater.from(context).inflate(R.layout.promoted_app_install_wrapper, viewGroup, false);
        this.c = new kpt(context, akkq, aaas, akvo, vmn, tpu, vod, dwk, this.b, R.id.promoted_app_install_new_line_layout_stub);
        this.d = new kpt(context, akkq, aaas, akvo, vmn, tpu, vod, dwk, this.b, R.id.promoted_app_install_right_align_layout_stub);
        this.a = krl.a(context);
        this.b.setBackground(this.a);
    }

    public final View K_() {
        return this.b;
    }

    public final void a(akpb akpb) {
        kpt kpt = this.e;
        if (kpt != null) {
            kpt.o.a();
            this.e = null;
        }
    }

    /* JADX WARNING: Missing block: B:81:0x0268, code skipped:
            if (r4 != 0) goto L_0x026c;
     */
    public final /* synthetic */ void a_(defpackage.akor r29, java.lang.Object r30) {
        /*
        r28 = this;
        r0 = r28;
        r1 = r29;
        r15 = r30;
        r15 = (defpackage.ajyk) r15;
        defpackage.amqw.a(r15);
        r14 = 0;
        r0.e = r14;
        r2 = r15.n;
        if (r2 != 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0035;
    L_0x0013:
        r2 = r2.b;
        r2 = defpackage.awpe.a(r2);
        if (r2 == 0) goto L_0x0024;
    L_0x001b:
        r3 = 3;
        if (r2 == r3) goto L_0x001f;
    L_0x001e:
        goto L_0x0024;
    L_0x001f:
        r2 = r0.c;
        r0.e = r2;
        goto L_0x0035;
    L_0x0024:
        r2 = r15.n;
        r2 = r2.b;
        r2 = defpackage.awpe.a(r2);
        if (r2 == 0) goto L_0x0035;
    L_0x002e:
        r3 = 2;
        if (r2 != r3) goto L_0x0035;
    L_0x0031:
        r2 = r0.d;
        r0.e = r2;
    L_0x0035:
        r13 = r0.e;
        if (r13 == 0) goto L_0x02e2;
    L_0x0039:
        r2 = r13.p;
        if (r2 != 0) goto L_0x010d;
    L_0x003d:
        r2 = r13.d;
        r2 = r2.inflate();
        r13.p = r2;
        r2 = r13.p;
        r3 = 2131757889; // 0x7f100b41 float:1.9146727E38 double:1.053228338E-314;
        r2 = r2.findViewById(r3);
        r13.q = r2;
        r2 = r13.p;
        r3 = 2131757890; // 0x7f100b42 float:1.9146729E38 double:1.0532283387E-314;
        r2 = r2.findViewById(r3);
        r13.r = r2;
        r2 = r13.q;
        r3 = 2131755472; // 0x7f1001d0 float:1.9141824E38 double:1.053227144E-314;
        r2 = r2.findViewById(r3);
        r2 = (android.widget.ImageView) r2;
        r13.z = r2;
        r2 = r13.q;
        r3 = 2131755081; // 0x7f100049 float:1.9141031E38 double:1.053226951E-314;
        r2 = r2.findViewById(r3);
        r13.A = r2;
        r2 = r13.q;
        r3 = 2131756160; // 0x7f100480 float:1.914322E38 double:1.053227484E-314;
        r2 = r2.findViewById(r3);
        r2 = (android.widget.TextView) r2;
        r13.s = r2;
        r2 = r13.q;
        r3 = 2131755189; // 0x7f1000b5 float:1.914125E38 double:1.053227004E-314;
        r2 = r2.findViewById(r3);
        r2 = (android.widget.TextView) r2;
        r13.t = r2;
        r2 = r13.q;
        r3 = 2131756728; // 0x7f1006b8 float:1.9144372E38 double:1.0532277646E-314;
        r2 = r2.findViewById(r3);
        r2 = (android.widget.TextView) r2;
        r13.u = r2;
        r2 = r13.q;
        r3 = 2131756968; // 0x7f1007a8 float:1.9144858E38 double:1.053227883E-314;
        r2 = r2.findViewById(r3);
        r2 = (android.widget.RatingBar) r2;
        r13.v = r2;
        r2 = r13.q;
        r3 = 2131755474; // 0x7f1001d2 float:1.9141828E38 double:1.053227145E-314;
        r2 = r2.findViewById(r3);
        r2 = (android.widget.TextView) r2;
        r13.w = r2;
        r2 = r13.q;
        r3 = 2131755519; // 0x7f1001ff float:1.914192E38 double:1.0532271673E-314;
        r2 = r2.findViewById(r3);
        r2 = (android.widget.TextView) r2;
        r13.x = r2;
        r2 = r13.q;
        r3 = 2131756733; // 0x7f1006bd float:1.9144382E38 double:1.053227767E-314;
        r2 = r2.findViewById(r3);
        r2 = (android.widget.TextView) r2;
        r13.y = r2;
        r2 = r13.q;
        defpackage.xpr.a(r2, r14);
        r2 = r13.A;
        r2.setBackground(r14);
        r2 = new kvp;
        r3 = r13.e;
        r4 = r13.g;
        r5 = r13.k;
        r6 = r13.i;
        r7 = r13.j;
        r8 = r13.l;
        r9 = r13.p;
        r10 = r13.q;
        r11 = r13.r;
        r12 = r13.A;
        r14 = r13.m;
        r16 = r2;
        r17 = r3;
        r18 = r4;
        r19 = r5;
        r20 = r6;
        r21 = r7;
        r22 = r8;
        r23 = r9;
        r24 = r10;
        r25 = r11;
        r26 = r12;
        r27 = r14;
        r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27);
        r13.o = r2;
    L_0x010d:
        r2 = r13.o;
        r3 = r1.a;
        r5 = r15.p;
        r6 = r15.g;
        r7 = r15.f;
        r8 = r15.m;
        r10 = r15.l;
        r14 = r15.o;
        r12 = r15.k;
        r4 = r15;
        r16 = r12;
        r0 = 8;
        r12 = r15;
        r0 = r13;
        r13 = r14;
        r1 = 0;
        r14 = r16;
        r2.a(r3, r4, r5, r6, r7, r8, r10, r12, r13, r14);
        r2 = r15.a;
        r7 = 0;
        if (r2 == 0) goto L_0x013f;
    L_0x0132:
        r3 = r0.f;
        r4 = r0.z;
        r3.a(r4, r2);
        r2 = r0.z;
        r2.setVisibility(r7);
        goto L_0x0146;
    L_0x013f:
        r2 = r0.z;
        r3 = 8;
        r2.setVisibility(r3);
    L_0x0146:
        r2 = r15.n;
        r3 = 1;
        if (r2 != 0) goto L_0x014c;
    L_0x014b:
        goto L_0x0174;
    L_0x014c:
        r4 = r2.c;
        r8 = 0;
        r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r2 <= 0) goto L_0x0156;
    L_0x0154:
        r2 = (int) r4;
        goto L_0x0158;
    L_0x0156:
        r2 = 40;
    L_0x0158:
        r2 = (float) r2;
        r4 = r0.n;
        r4 = r4.getDisplayMetrics();
        r2 = android.util.TypedValue.applyDimension(r3, r2, r4);
        r2 = (int) r2;
        r4 = r0.z;
        r4 = r4.getLayoutParams();
        r4.height = r2;
        r4 = r0.z;
        r4 = r4.getLayoutParams();
        r4.width = r2;
    L_0x0174:
        r2 = r15.j;
        if (r2 != 0) goto L_0x0179;
    L_0x0178:
        goto L_0x0186;
    L_0x0179:
        r2 = r2.a;
        r2 = r2 & r3;
        if (r2 == 0) goto L_0x0186;
    L_0x017e:
        r2 = r0.s;
        r2.setVisibility(r7);
        r4 = 8;
        goto L_0x018d;
    L_0x0186:
        r2 = r0.s;
        r4 = 8;
        r2.setVisibility(r4);
    L_0x018d:
        r2 = r15.b;
        if (r2 == 0) goto L_0x01a0;
    L_0x0191:
        r5 = r0.t;
        r2 = defpackage.ajqy.a(r2);
        r5.setText(r2);
        r2 = r0.t;
        r2.setVisibility(r7);
        goto L_0x01a5;
    L_0x01a0:
        r2 = r0.t;
        r2.setVisibility(r4);
    L_0x01a5:
        r2 = r15.c;
        r5 = 0;
        r5 = java.lang.Float.compare(r2, r5);
        if (r5 > 0) goto L_0x01bb;
    L_0x01ae:
        r2 = r0.u;
        if (r2 == 0) goto L_0x01b5;
    L_0x01b2:
        r2.setVisibility(r4);
    L_0x01b5:
        r2 = r0.v;
        r2.setVisibility(r4);
        goto L_0x01ea;
    L_0x01bb:
        r4 = 1084227584; // 0x40a00000 float:5.0 double:5.356796015E-315;
        r5 = java.lang.Float.compare(r2, r4);
        if (r5 > 0) goto L_0x01c4;
    L_0x01c3:
        goto L_0x01c6;
    L_0x01c4:
        r2 = 1084227584; // 0x40a00000 float:5.0 double:5.356796015E-315;
    L_0x01c6:
        r4 = r0.u;
        if (r4 == 0) goto L_0x01e0;
    L_0x01ca:
        r4.setVisibility(r7);
        r4 = r0.u;
        r5 = new java.lang.Object[r3];
        r6 = java.lang.Float.valueOf(r2);
        r5[r7] = r6;
        r6 = "%1.1f";
        r5 = java.lang.String.format(r6, r5);
        r4.setText(r5);
    L_0x01e0:
        r4 = r0.v;
        r4.setVisibility(r7);
        r4 = r0.v;
        r4.setRating(r2);
    L_0x01ea:
        r2 = r15.d;
        if (r2 == 0) goto L_0x01ff;
    L_0x01ee:
        r4 = r0.w;
        r2 = defpackage.ajqy.a(r2);
        r4.setText(r2);
        r2 = r0.w;
        r2.setVisibility(r7);
        r4 = 8;
        goto L_0x0206;
    L_0x01ff:
        r2 = r0.w;
        r4 = 8;
        r2.setVisibility(r4);
    L_0x0206:
        r2 = r15.e;
        if (r2 == 0) goto L_0x0219;
    L_0x020a:
        r5 = r0.x;
        r2 = defpackage.ajqy.a(r2);
        r5.setText(r2);
        r2 = r0.x;
        r2.setVisibility(r7);
        goto L_0x021e;
    L_0x0219:
        r2 = r0.x;
        r2.setVisibility(r4);
    L_0x021e:
        r2 = r15.h;
        if (r2 != 0) goto L_0x0224;
    L_0x0222:
        goto L_0x029b;
    L_0x0224:
        r4 = r2.a;
        r4 = r4 & r3;
        if (r4 == 0) goto L_0x029b;
    L_0x0229:
        r4 = r0.y;
        r2 = r2.b;
        if (r2 != 0) goto L_0x0231;
    L_0x022f:
        r2 = defpackage.aphg.s;
    L_0x0231:
        r2 = r2.a;
        r2 = r2 & 128;
        if (r2 != 0) goto L_0x0239;
    L_0x0237:
        r14 = r1;
        goto L_0x0247;
    L_0x0239:
        r2 = r15.h;
        r2 = r2.b;
        if (r2 != 0) goto L_0x0241;
    L_0x023f:
        r2 = defpackage.aphg.s;
    L_0x0241:
        r14 = r2.g;
        if (r14 != 0) goto L_0x0247;
    L_0x0245:
        r14 = defpackage.arml.f;
    L_0x0247:
        r2 = defpackage.ajqy.a(r14);
        r4.setText(r2);
        r2 = r0.y;
        r4 = r15.h;
        r4 = r4.b;
        if (r4 != 0) goto L_0x0258;
    L_0x0256:
        r4 = defpackage.aphg.s;
    L_0x0258:
        r5 = r4.b;
        if (r5 != r3) goto L_0x026b;
    L_0x025c:
        r4 = r4.c;
        r4 = (java.lang.Integer) r4;
        r4 = r4.intValue();
        r4 = defpackage.aphh.a(r4);
        if (r4 == 0) goto L_0x026b;
    L_0x026a:
        goto L_0x026c;
    L_0x026b:
        r4 = 1;
    L_0x026c:
        r5 = r4 + -1;
        if (r4 == 0) goto L_0x029a;
    L_0x0270:
        r4 = 13;
        if (r5 == r4) goto L_0x028c;
    L_0x0274:
        r1 = r0.b;
        r2.setTextColor(r1);
        r1 = r0.B;
        if (r1 != 0) goto L_0x0286;
    L_0x027d:
        r1 = new android.graphics.drawable.ColorDrawable;
        r4 = r0.c;
        r1.<init>(r4);
        r0.B = r1;
    L_0x0286:
        r1 = r0.B;
        r2.setBackground(r1);
        goto L_0x0294;
    L_0x028c:
        r4 = r0.a;
        r2.setTextColor(r4);
        r2.setBackground(r1);
    L_0x0294:
        r1 = r0.y;
        r1.setVisibility(r7);
        goto L_0x02a2;
    L_0x029a:
        throw r1;
    L_0x029b:
        r1 = r0.y;
        r2 = 8;
        r1.setVisibility(r2);
    L_0x02a2:
        r1 = r15.i;
        if (r1 != 0) goto L_0x02a7;
    L_0x02a6:
        goto L_0x02d3;
    L_0x02a7:
        r1 = r1.a;
        r1 = r1 & r3;
        if (r1 == 0) goto L_0x02d3;
    L_0x02ac:
        r1 = r0.h;
        r2 = r0.p;
        r2 = r2.getRootView();
        r3 = r0.A;
        r4 = r15.i;
        r4 = r4.b;
        if (r4 != 0) goto L_0x02be;
    L_0x02bc:
        r4 = defpackage.auvn.l;
    L_0x02be:
        r5 = r4;
        r4 = r29;
        r6 = r4.a;
        r4 = r5;
        r5 = r15;
        r1.a(r2, r3, r4, r5, r6);
        r1 = r0.A;
        r1.setClickable(r7);
        r0 = r0.A;
        r0.setVisibility(r7);
        goto L_0x02da;
    L_0x02d3:
        r0 = r0.A;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x02da:
        r0 = r28;
        r1 = r0.b;
        r1.setVisibility(r7);
        return;
    L_0x02e2:
        r1 = 8;
        r2 = r0.b;
        r2.setVisibility(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kps.a_(akor, java.lang.Object):void");
    }
}
