package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: kvn */
public final class kvn implements akot {
    private final eza a;
    private final View b;
    private final kvk c;
    private final kvk d;
    private final kvk e;
    private kvk f;

    protected kvn(Context context, akkq akkq, aaas aaas, akvp akvp, akvo akvo, vmn vmn, tpu tpu, vod vod, dwk dwk, ViewGroup viewGroup) {
        this.b = LayoutInflater.from(context).inflate(R.layout.promoted_text_banner_wrapper, viewGroup, false);
        this.c = new kvk(context, akkq, aaas, akvp, akvo, vmn, tpu, vod, dwk, this.b, R.id.promoted_text_banner_layout_one_stub, R.id.title_icon);
        this.d = new kvk(context, akkq, aaas, akvp, akvo, vmn, tpu, vod, dwk, this.b, R.id.promoted_text_banner_layout_two_stub, R.id.byline_icon);
        this.e = new kvk(context, akkq, aaas, akvp, akvo, vmn, tpu, vod, dwk, this.b, R.id.promoted_text_banner_layout_three_stub, R.id.icon);
        this.a = krl.a(context);
        this.b.setBackground(this.a);
    }

    public final View K_() {
        return this.b;
    }

    public final void a(akpb akpb) {
        kvk kvk = this.f;
        if (kvk != null) {
            kvk.m.a();
            this.f = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x01ae  */
    public final /* synthetic */ void a_(defpackage.akor r29, java.lang.Object r30) {
        /*
        r28 = this;
        r0 = r28;
        r1 = r29;
        r15 = r30;
        r15 = (defpackage.ajzf) r15;
        defpackage.amqw.a(r15);
        r2 = 0;
        r0.f = r2;
        r3 = r15.j;
        if (r3 != 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0048;
    L_0x0013:
        r3 = r3.b;
        r3 = defpackage.awsq.a(r3);
        if (r3 == 0) goto L_0x0024;
    L_0x001b:
        r4 = 2;
        if (r3 == r4) goto L_0x001f;
    L_0x001e:
        goto L_0x0024;
    L_0x001f:
        r3 = r0.c;
        r0.f = r3;
        goto L_0x0048;
    L_0x0024:
        r3 = r15.j;
        r3 = r3.b;
        r3 = defpackage.awsq.a(r3);
        if (r3 == 0) goto L_0x0037;
    L_0x002e:
        r4 = 3;
        if (r3 == r4) goto L_0x0032;
    L_0x0031:
        goto L_0x0037;
    L_0x0032:
        r3 = r0.d;
        r0.f = r3;
        goto L_0x0048;
    L_0x0037:
        r3 = r15.j;
        r3 = r3.b;
        r3 = defpackage.awsq.a(r3);
        if (r3 == 0) goto L_0x0048;
    L_0x0041:
        r4 = 4;
        if (r3 != r4) goto L_0x0048;
    L_0x0044:
        r3 = r0.e;
        r0.f = r3;
    L_0x0048:
        r14 = r0.f;
        r13 = 8;
        if (r14 != 0) goto L_0x0054;
    L_0x004e:
        r1 = r0.b;
        r1.setVisibility(r13);
        return;
    L_0x0054:
        r3 = r14.n;
        if (r3 != 0) goto L_0x0100;
    L_0x0058:
        r3 = r14.a;
        r3 = r3.inflate();
        r14.n = r3;
        r3 = r14.n;
        r4 = 2131757889; // 0x7f100b41 float:1.9146727E38 double:1.053228338E-314;
        r3 = r3.findViewById(r4);
        r14.o = r3;
        r3 = r14.n;
        r4 = 2131757890; // 0x7f100b42 float:1.9146729E38 double:1.0532283387E-314;
        r3 = r3.findViewById(r4);
        r14.p = r3;
        r3 = r14.o;
        r4 = 2131755189; // 0x7f1000b5 float:1.914125E38 double:1.053227004E-314;
        r3 = r3.findViewById(r4);
        r3 = (android.widget.TextView) r3;
        r14.q = r3;
        r3 = r14.o;
        r4 = 2131755476; // 0x7f1001d4 float:1.9141832E38 double:1.053227146E-314;
        r3 = r3.findViewById(r4);
        r3 = (android.widget.TextView) r3;
        r14.r = r3;
        r3 = r14.o;
        r4 = 2131755474; // 0x7f1001d2 float:1.9141828E38 double:1.053227145E-314;
        r3 = r3.findViewById(r4);
        r3 = (android.widget.TextView) r3;
        r14.s = r3;
        r3 = r14.o;
        r4 = 2131755472; // 0x7f1001d0 float:1.9141824E38 double:1.053227144E-314;
        r3 = r3.findViewById(r4);
        r3 = (android.widget.ImageView) r3;
        r14.t = r3;
        r3 = r14.o;
        r4 = r14.l;
        r3 = r3.findViewById(r4);
        r3 = (android.widget.ImageView) r3;
        r14.u = r3;
        r3 = r14.o;
        r4 = 2131755081; // 0x7f100049 float:1.9141031E38 double:1.053226951E-314;
        r3 = r3.findViewById(r4);
        r14.v = r3;
        r3 = r14.o;
        defpackage.xpr.a(r3, r2);
        r3 = r14.v;
        r3.setBackground(r2);
        r2 = new kvp;
        r3 = r14.b;
        r4 = r14.d;
        r5 = r14.i;
        r6 = r14.g;
        r7 = r14.h;
        r8 = r14.j;
        r9 = r14.n;
        r10 = r14.o;
        r11 = r14.p;
        r12 = r14.v;
        r13 = r14.k;
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
        r27 = r13;
        r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27);
        r14.m = r2;
    L_0x0100:
        r2 = r14.m;
        r3 = r1.a;
        r5 = r15.n;
        r6 = r15.g;
        r7 = r15.f;
        r8 = r15.l;
        r10 = r15.k;
        r13 = r15.m;
        r12 = r15.i;
        r4 = r15;
        r16 = r12;
        r12 = r15;
        r0 = 8;
        r0 = r14;
        r14 = r16;
        r2.a(r3, r4, r5, r6, r7, r8, r10, r12, r13, r14);
        r2 = r0.q;
        r3 = r15.a;
        r3 = defpackage.ajqy.a(r3);
        defpackage.xpr.a(r2, r3);
        r2 = r0.r;
        r3 = r15.b;
        r3 = defpackage.ajqy.a(r3);
        defpackage.xpr.a(r2, r3);
        r2 = r0.s;
        r3 = r15.c;
        r3 = defpackage.ajqy.a(r3);
        defpackage.xpr.a(r2, r3);
        r2 = r0.t;
        r7 = 0;
        if (r2 == 0) goto L_0x015a;
    L_0x0144:
        r3 = r15.e;
        if (r3 == 0) goto L_0x015a;
    L_0x0148:
        r4 = r0.c;
        r4.a(r2, r3);
        r2 = r0.t;
        r2.setVisibility(r7);
        r2 = r0.u;
        r3 = 8;
        r2.setVisibility(r3);
        goto L_0x018e;
    L_0x015a:
        r3 = r15.d;
        if (r3 == 0) goto L_0x0182;
    L_0x015e:
        r2 = r0.u;
        r4 = r0.e;
        r3 = r3.b;
        r3 = defpackage.arwh.a(r3);
        if (r3 != 0) goto L_0x016c;
    L_0x016a:
        r3 = defpackage.arwh.UNKNOWN;
    L_0x016c:
        r3 = r4.a(r3);
        r2.setImageResource(r3);
        r2 = r0.t;
        r3 = 8;
        if (r2 == 0) goto L_0x017c;
    L_0x0179:
        r2.setVisibility(r3);
    L_0x017c:
        r2 = r0.u;
        r2.setVisibility(r7);
        goto L_0x018e;
    L_0x0182:
        r3 = 8;
        if (r2 == 0) goto L_0x0189;
    L_0x0186:
        r2.setVisibility(r3);
    L_0x0189:
        r2 = r0.u;
        r2.setVisibility(r3);
    L_0x018e:
        r2 = r15.h;
        if (r2 != 0) goto L_0x0193;
    L_0x0192:
        goto L_0x01c0;
    L_0x0193:
        r2 = r2.a;
        r2 = r2 & 1;
        if (r2 == 0) goto L_0x01c0;
    L_0x0199:
        r2 = r0.v;
        r2.setVisibility(r7);
        r2 = r0.f;
        r3 = r0.n;
        r3 = r3.getRootView();
        r4 = r0.v;
        r5 = r15.h;
        r5 = r5.b;
        if (r5 != 0) goto L_0x01b0;
    L_0x01ae:
        r5 = defpackage.auvn.l;
    L_0x01b0:
        r6 = r1.a;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r15;
        r1.a(r2, r3, r4, r5, r6);
        r0 = r0.v;
        r0.setClickable(r7);
        goto L_0x01c7;
    L_0x01c0:
        r0 = r0.v;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x01c7:
        r0 = r28;
        r1 = r0.b;
        r1.setVisibility(r7);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kvn.a_(akor, java.lang.Object):void");
    }
}
