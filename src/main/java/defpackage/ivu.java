package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioRelativeLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: ivu */
public final class ivu extends jxw {
    private final akvp A;
    private final View B;
    private final LinearLayout C;
    private final ViewStub D;
    public final aaas a;
    public apxu b;
    private final akoj c;
    private final FixedAspectRatioFrameLayout d = ((FixedAspectRatioFrameLayout) this.h);
    private final FixedAspectRatioRelativeLayout e = ((FixedAspectRatioRelativeLayout) this.d.findViewById(R.id.hero_image_container));
    private final YouTubeTextView z;

    public ivu(Context context, akkq akkq, aaas aaas, gal gal, ViewGroup viewGroup, akvp akvp) {
        super(context, akkq, new akpn(), LayoutInflater.from(context).inflate(R.layout.watch_card_hero_video, viewGroup, false), aaas, gal, akvp, null, null);
        aaas aaas2 = aaas;
        this.c = new akoj(aaas, this.e);
        this.a = (aaas) amqw.a((Object) aaas);
        this.A = akvp;
        this.z = (YouTubeTextView) this.d.findViewById(R.id.play_all_button);
        this.C = (LinearLayout) this.d.findViewById(R.id.info_container);
        this.B = this.d.findViewById(R.id.gradient);
        this.D = (ViewStub) this.d.findViewById(R.id.watch_card_collage_stub);
    }

    public final View K_() {
        return this.h;
    }

    public final void a(akpb akpb) {
        this.c.a();
        super.a(akpb);
    }

    private final void a(View view, int i, aygk aygk) {
        ImageView imageView = (ImageView) view.findViewById(i);
        this.g.a(imageView, aygk);
        imageView.setVisibility(!aklb.a(aygk) ? 8 : 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:151:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:151:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:151:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0298  */
    public final /* synthetic */ void a_(defpackage.akor r18, java.lang.Object r19) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = r19;
        r2 = (defpackage.azia) r2;
        r3 = r2.c;
        if (r3 != 0) goto L_0x000e;
    L_0x000c:
        r3 = defpackage.apxu.d;
    L_0x000e:
        r0.b = r3;
        r3 = r0.c;
        r4 = r1.a;
        r5 = r0.b;
        r6 = r18.b();
        r3.a(r4, r5, r6);
        r1 = r1.a;
        r3 = r2.n;
        r3 = r3.d();
        r4 = 0;
        r1.a(r3, r4);
        r1 = r0.f;
        r1 = r1.getResources();
        r3 = 2131689500; // 0x7f0f001c float:1.9008017E38 double:1.0531945496E-314;
        r5 = 1;
        r6 = r1.getFraction(r3, r5, r5);
        r7 = r0.u;
        r8 = r2.m;
        if (r8 != 0) goto L_0x003f;
    L_0x003d:
        r8 = defpackage.aodx.c;
    L_0x003f:
        r9 = r2.a;
        r9 = r9 & 512;
        if (r9 == 0) goto L_0x004c;
    L_0x0045:
        r9 = r2.l;
        if (r9 != 0) goto L_0x004d;
    L_0x0049:
        r9 = defpackage.azgw.c;
        goto L_0x004d;
    L_0x004c:
        r9 = r4;
    L_0x004d:
        r10 = r0.d;
        r11 = 2131758663; // 0x7f100e47 float:1.9148296E38 double:1.0532287206E-314;
        r10 = r10.findViewById(r11);
        r12 = 2131758669; // 0x7f100e4d float:1.9148309E38 double:1.0532287236E-314;
        r13 = 2131758668; // 0x7f100e4c float:1.9148307E38 double:1.053228723E-314;
        r14 = 2131758667; // 0x7f100e4b float:1.9148304E38 double:1.0532287226E-314;
        r15 = 8;
        if (r10 == 0) goto L_0x007e;
    L_0x0063:
        r10 = r0.d;
        r10 = r10.findViewById(r14);
        r10.setVisibility(r15);
        r10 = r0.d;
        r10 = r10.findViewById(r13);
        r10.setVisibility(r15);
        r10 = r0.d;
        r10 = r10.findViewById(r12);
        r10.setVisibility(r15);
    L_0x007e:
        r10 = r0.d;
        r4 = 0;
        r10.setBackgroundColor(r4);
        if (r9 != 0) goto L_0x00aa;
    L_0x0086:
        r1 = r2.a;
        r1 = r1 & r5;
        if (r1 == 0) goto L_0x0092;
    L_0x008b:
        r1 = r2.b;
        if (r1 != 0) goto L_0x0093;
    L_0x008f:
        r1 = defpackage.aygk.f;
        goto L_0x0093;
    L_0x0092:
        r1 = 0;
    L_0x0093:
        r0.a(r1);
        r1 = r2.a;
        r1 = r1 & r5;
        if (r1 != 0) goto L_0x009c;
    L_0x009b:
        goto L_0x00fd;
    L_0x009c:
        r1 = r2.b;
        if (r1 != 0) goto L_0x00a2;
    L_0x00a0:
        r1 = defpackage.aygk.f;
    L_0x00a2:
        r1 = r1.d;
        if (r1 != 0) goto L_0x00a8;
    L_0x00a6:
        r1 = defpackage.aodx.c;
    L_0x00a8:
        r8 = r1;
        goto L_0x00fd;
    L_0x00aa:
        r10 = r9.a;
        r4 = 155492686; // 0x944a14e float:2.3668487E-33 double:7.68235943E-316;
        if (r10 == r4) goto L_0x00ff;
    L_0x00b1:
        r4 = 155483823; // 0x9447eaf float:2.3652208E-33 double:7.68192154E-316;
        if (r10 != r4) goto L_0x00fd;
    L_0x00b6:
        r4 = r9.b;
        r4 = (defpackage.azha) r4;
        r9 = r0.d;
        r10 = r4.b;
        if (r10 != 0) goto L_0x00c2;
    L_0x00c0:
        r10 = defpackage.aygk.f;
    L_0x00c2:
        r11 = 2131755472; // 0x7f1001d0 float:1.9141824E38 double:1.053227144E-314;
        r0.a(r9, r11, r10);
        r4 = r4.c;
        r4 = defpackage.azgg.a(r4);
        if (r4 != 0) goto L_0x00d1;
    L_0x00d0:
        goto L_0x00d4;
    L_0x00d1:
        r9 = 3;
        if (r4 == r9) goto L_0x00d6;
    L_0x00d4:
        r1 = r6;
        goto L_0x00f7;
    L_0x00d6:
        r4 = 2131689478; // 0x7f0f0006 float:1.9007973E38 double:1.0531945387E-314;
        r6 = r1.getFraction(r4, r5, r5);
        r4 = r0.f;
        r4 = defpackage.xss.b(r4);
        if (r4 == 0) goto L_0x00d4;
    L_0x00e5:
        r1 = r1.getFraction(r3, r5, r5);
        r3 = r0.d;
        r4 = r0.f;
        r9 = 2131559571; // 0x7f0d0493 float:1.874449E38 double:1.053130356E-314;
        r4 = defpackage.ra.c(r4, r9);
        r3.setBackgroundColor(r4);
    L_0x00f7:
        r16 = r6;
        r6 = r1;
        r1 = r16;
        goto L_0x0144;
    L_0x00fd:
        r1 = r6;
        goto L_0x0144;
    L_0x00ff:
        r1 = r0.d;
        r1 = r1.findViewById(r11);
        if (r1 != 0) goto L_0x010c;
    L_0x0107:
        r1 = r0.D;
        r1.inflate();
    L_0x010c:
        r1 = r9.a;
        if (r1 != r4) goto L_0x0115;
    L_0x0110:
        r1 = r9.b;
        r1 = (defpackage.azgu) r1;
        goto L_0x0117;
    L_0x0115:
        r1 = defpackage.azgu.e;
    L_0x0117:
        r3 = r0.d;
        r4 = r1.b;
        if (r4 != 0) goto L_0x011f;
    L_0x011d:
        r4 = defpackage.aygk.f;
    L_0x011f:
        r0.a(r3, r14, r4);
        r3 = r0.d;
        r4 = r1.c;
        if (r4 != 0) goto L_0x012a;
    L_0x0128:
        r4 = defpackage.aygk.f;
    L_0x012a:
        r0.a(r3, r13, r4);
        r3 = r0.d;
        r1 = r1.d;
        if (r1 != 0) goto L_0x0135;
    L_0x0133:
        r1 = defpackage.aygk.f;
    L_0x0135:
        r0.a(r3, r12, r1);
        r1 = r0.d;
        r7 = r1.findViewById(r11);
        r1 = r0.u;
        r1.setVisibility(r15);
        goto L_0x00fd;
    L_0x0144:
        r3 = r0.d;
        r3.a = r6;
        r3 = r0.e;
        r3.a = r1;
        if (r8 != 0) goto L_0x0150;
    L_0x014e:
        r4 = 0;
        goto L_0x015d;
    L_0x0150:
        r1 = r8.a;
        r1 = r1 & r5;
        if (r1 == 0) goto L_0x014e;
    L_0x0155:
        r1 = r8.b;
        if (r1 != 0) goto L_0x015b;
    L_0x0159:
        r1 = defpackage.aodv.c;
    L_0x015b:
        r4 = r1.b;
    L_0x015d:
        if (r4 != 0) goto L_0x0160;
    L_0x015f:
        goto L_0x0165;
    L_0x0160:
        if (r7 == 0) goto L_0x0165;
    L_0x0162:
        r7.setContentDescription(r4);
    L_0x0165:
        r1 = r2.j;
        if (r1 != 0) goto L_0x016b;
    L_0x0169:
        r1 = defpackage.azgs.c;
    L_0x016b:
        r1 = r1.a;
        r3 = 154950953; // 0x93c5d29 float:2.267348E-33 double:7.65559427E-316;
        if (r1 == r3) goto L_0x0174;
    L_0x0172:
        r4 = 0;
        goto L_0x0186;
    L_0x0174:
        r1 = r2.j;
        if (r1 != 0) goto L_0x017a;
    L_0x0178:
        r1 = defpackage.azgs.c;
    L_0x017a:
        r4 = r1.a;
        if (r4 != r3) goto L_0x0184;
    L_0x017e:
        r1 = r1.b;
        r4 = r1;
        r4 = (defpackage.azgq) r4;
        goto L_0x0186;
    L_0x0184:
        r4 = defpackage.azgq.e;
    L_0x0186:
        if (r4 != 0) goto L_0x01c3;
    L_0x0188:
        r1 = r0.z;
        r1.setVisibility(r15);
        r1 = r0.B;
        r3 = 0;
        r1.setVisibility(r3);
        r1 = r0.C;
        r1.setVisibility(r3);
        r1 = r2.a;
        r1 = r1 & 4;
        if (r1 == 0) goto L_0x01a5;
    L_0x019e:
        r4 = r2.d;
        if (r4 != 0) goto L_0x01a6;
    L_0x01a2:
        r4 = defpackage.arml.f;
        goto L_0x01a6;
    L_0x01a5:
        r4 = 0;
    L_0x01a6:
        r1 = defpackage.ajqy.a(r4);
        r0.a(r1);
        r1 = r2.a;
        r1 = r1 & r15;
        if (r1 == 0) goto L_0x01b9;
    L_0x01b2:
        r4 = r2.e;
        if (r4 != 0) goto L_0x01ba;
    L_0x01b6:
        r4 = defpackage.arml.f;
        goto L_0x01ba;
    L_0x01b9:
        r4 = 0;
    L_0x01ba:
        r1 = defpackage.ajqy.a(r4);
        r0.b(r1);
        goto L_0x025a;
    L_0x01c3:
        r1 = r0.B;
        r1.setVisibility(r15);
        r1 = r0.C;
        r1.setVisibility(r15);
        r1 = r4.b;
        if (r1 != 0) goto L_0x01d3;
    L_0x01d1:
        r1 = defpackage.arml.f;
    L_0x01d3:
        r1 = defpackage.ajqy.a(r1);
        r3 = 2;
        if (r1 == 0) goto L_0x0211;
    L_0x01da:
        r6 = r4.a;
        r6 = r6 & r3;
        if (r6 != 0) goto L_0x01e0;
    L_0x01df:
        goto L_0x0211;
    L_0x01e0:
        r6 = r0.z;
        r7 = 0;
        r6.setVisibility(r7);
        r6 = r0.z;
        r7 = r0.A;
        r8 = r4.c;
        if (r8 != 0) goto L_0x01f0;
    L_0x01ee:
        r8 = defpackage.arwf.c;
    L_0x01f0:
        r8 = r8.b;
        r8 = defpackage.arwh.a(r8);
        if (r8 != 0) goto L_0x01fa;
    L_0x01f8:
        r8 = defpackage.arwh.UNKNOWN;
    L_0x01fa:
        r7 = r7.a(r8);
        r8 = 0;
        r6.setCompoundDrawablesRelativeWithIntrinsicBounds(r7, r8, r8, r8);
        r6 = r0.z;
        r6.setText(r1);
        r1 = r0.z;
        r6 = new ivx;
        r6.<init>(r0);
        r1.setOnClickListener(r6);
    L_0x0211:
        r1 = r4.d;
        r1 = defpackage.azge.a(r1);
        if (r1 == 0) goto L_0x021a;
    L_0x0219:
        goto L_0x021b;
    L_0x021a:
        r1 = 1;
    L_0x021b:
        r1 = r1 + -1;
        if (r1 == r3) goto L_0x023d;
    L_0x021f:
        r1 = r0.z;
        r3 = r0.f;
        r4 = 2130772257; // 0x7f010121 float:1.7147627E38 double:1.0527413713E-314;
        r6 = 0;
        r3 = defpackage.xwe.a(r3, r4, r6);
        r1.setBackgroundColor(r3);
        r1 = r0.z;
        r3 = r0.f;
        r4 = 2130772311; // 0x7f010157 float:1.7147737E38 double:1.052741398E-314;
        r3 = defpackage.xwe.a(r3, r4, r6);
        r1.setTextColor(r3);
        goto L_0x025a;
    L_0x023d:
        r6 = 0;
        r1 = r0.z;
        r3 = r0.f;
        r4 = 2130772290; // 0x7f010142 float:1.7147694E38 double:1.0527413876E-314;
        r3 = defpackage.xwe.a(r3, r4, r6);
        r1.setBackgroundColor(r3);
        r1 = r0.z;
        r3 = r0.f;
        r4 = 2130772300; // 0x7f01014c float:1.7147715E38 double:1.0527413925E-314;
        r3 = defpackage.xwe.a(r3, r4, r6);
        r1.setTextColor(r3);
    L_0x025a:
        r1 = r2.a;
        r1 = r1 & 16;
        if (r1 == 0) goto L_0x0267;
    L_0x0260:
        r4 = r2.f;
        if (r4 != 0) goto L_0x0268;
    L_0x0264:
        r4 = defpackage.arml.f;
        goto L_0x0268;
    L_0x0267:
        r4 = 0;
    L_0x0268:
        r1 = defpackage.ajqy.a(r4);
        r3 = r2.a;
        r3 = r3 & 16;
        if (r3 == 0) goto L_0x0279;
    L_0x0272:
        r4 = r2.f;
        if (r4 != 0) goto L_0x027a;
    L_0x0276:
        r4 = defpackage.arml.f;
        goto L_0x027a;
    L_0x0279:
        r4 = 0;
    L_0x027a:
        r3 = defpackage.ajqy.b(r4);
        r4 = r2.i;
        r6 = 0;
        r6 = new defpackage.ayfu[r6];
        r4 = r4.toArray(r6);
        r4 = (defpackage.ayfu[]) r4;
        r6 = 0;
        r0.a(r1, r3, r4, r6);
        r1 = r2.h;
        if (r1 != 0) goto L_0x0293;
    L_0x0291:
        r1 = defpackage.apdx.g;
    L_0x0293:
        r1 = r1.a;
        r1 = r1 & r5;
        if (r1 == 0) goto L_0x02a7;
    L_0x0298:
        r1 = r2.h;
        if (r1 != 0) goto L_0x029e;
    L_0x029c:
        r1 = defpackage.apdx.g;
    L_0x029e:
        r1 = r1.b;
        if (r1 != 0) goto L_0x02a4;
    L_0x02a2:
        r1 = defpackage.aped.g;
    L_0x02a4:
        r0.a(r1);
    L_0x02a7:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivu.a_(akor, java.lang.Object):void");
    }
}
