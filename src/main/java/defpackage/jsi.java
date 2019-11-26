package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jsi */
public final class jsi implements vcy, vdc, vdd {
    private static final LayoutParams l = new LayoutParams(0, -2, 1.0f);
    private static final LayoutParams m = new LayoutParams(-2, -2, 0.0f);
    public vqx a;
    public boolean b;
    public avdj c;
    private final akkq d;
    private final aaas e;
    private final acvx f;
    private final Context g;
    private final jse h;
    private final jsh i;
    private final jsc j;
    private final zwj k;
    private boolean n;
    private final OnClickListener o;
    private final ArrayList p = new ArrayList();
    private ViewGroup q;
    private ViewGroup r;
    private TextView s;
    private TextView t;
    private View u;
    private View v;
    private View w;
    private ImageView x;

    public jsi(akkq akkq, aaas aaas, acvx acvx, Context context, vod vod, jse jse, jsh jsh, zwj zwj, jsc jsc) {
        this.d = akkq;
        this.e = aaas;
        this.f = acvx;
        this.g = context;
        this.h = jse;
        this.i = jsh;
        xoe xoe = new xoe(context);
        this.k = zwj;
        this.j = jsc;
        this.o = new jsl(this, vod, aaas);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:142:? A:{SYNTHETIC, RETURN} */
    public final void a(android.view.View r11, defpackage.akor r12) {
        /*
        r10 = this;
        r12 = r10.c;
        if (r12 == 0) goto L_0x0392;
    L_0x0004:
        r12 = r10.q;
        if (r12 == 0) goto L_0x000e;
    L_0x0008:
        r12 = r12.getParent();
        if (r12 == r11) goto L_0x0074;
    L_0x000e:
        r10.b(r11);
        r12 = 2131758715; // 0x7f100e7b float:1.9148402E38 double:1.0532287463E-314;
        r0 = 2131758716; // 0x7f100e7c float:1.9148404E38 double:1.053228747E-314;
        r11 = defpackage.xpr.a(r11, r12, r0);
        r11 = (android.view.ViewGroup) r11;
        r10.q = r11;
        r11 = r10.q;
        r12 = 2131755509; // 0x7f1001f5 float:1.91419E38 double:1.0532271623E-314;
        r11 = r11.findViewById(r12);
        r11 = (android.widget.TextView) r11;
        r10.s = r11;
        r11 = r10.q;
        r12 = 2131755189; // 0x7f1000b5 float:1.914125E38 double:1.053227004E-314;
        r11 = r11.findViewById(r12);
        r11 = (android.widget.TextView) r11;
        r10.t = r11;
        r11 = r10.q;
        r12 = 2131755497; // 0x7f1001e9 float:1.9141875E38 double:1.0532271564E-314;
        r11 = r11.findViewById(r12);
        r10.v = r11;
        r11 = r10.q;
        r12 = 2131757655; // 0x7f100a57 float:1.9146252E38 double:1.0532282226E-314;
        r11 = r11.findViewById(r12);
        r11 = (android.view.ViewGroup) r11;
        r10.r = r11;
        r11 = r10.q;
        r12 = 2131756128; // 0x7f100460 float:1.9143155E38 double:1.053227468E-314;
        r11 = r11.findViewById(r12);
        r10.w = r11;
        r11 = r10.q;
        r12 = 2131757654; // 0x7f100a56 float:1.914625E38 double:1.053228222E-314;
        r11 = r11.findViewById(r12);
        r11 = (android.widget.ImageView) r11;
        r10.x = r11;
        r11 = r10.q;
        r12 = 2131757656; // 0x7f100a58 float:1.9146254E38 double:1.053228223E-314;
        r11 = r11.findViewById(r12);
        r10.u = r11;
    L_0x0074:
        r11 = r10.s;
        r12 = r10.c;
        r12 = r12.h;
        defpackage.xpr.a(r11, r12);
        r11 = r10.t;
        r12 = r10.c;
        r0 = r12.a;
        r1 = 8;
        r0 = r0 & r1;
        r2 = 0;
        if (r0 == 0) goto L_0x0090;
    L_0x0089:
        r12 = r12.g;
        if (r12 != 0) goto L_0x0091;
    L_0x008d:
        r12 = defpackage.arml.f;
        goto L_0x0091;
    L_0x0090:
        r12 = r2;
    L_0x0091:
        r12 = defpackage.ajqy.a(r12);
        defpackage.xpr.a(r11, r12);
        r11 = r10.q;
        r12 = r11.getBackground();
        r0 = r10.c;
        r0 = r0.k;
        r3 = android.graphics.PorterDuff.Mode.SRC;
        r12 = defpackage.xoe.b(r12, r0, r3);
        r11.setBackground(r12);
        r11 = r10.v;
        r12 = r11.getBackground();
        r0 = r10.c;
        r0 = r0.l;
        r3 = android.graphics.PorterDuff.Mode.SRC;
        r12 = defpackage.xoe.b(r12, r0, r3);
        r11.setBackground(r12);
        r11 = r10.c;
        r11 = r11.i;
        if (r11 == 0) goto L_0x00c5;
    L_0x00c4:
        goto L_0x00c7;
    L_0x00c5:
        r11 = defpackage.axak.a;
    L_0x00c7:
        r12 = com.google.protos.youtube.api.innertube.CompanionSponsoredButtonRendererOuterClass.sponsoredButtonRenderer;
        r12 = defpackage.anxl.checkIsLite(r12);
        r11.a(r12);
        r11 = r11.h;
        r12 = r12.d;
        r11 = r11.a(r12);
        if (r11 != 0) goto L_0x0110;
    L_0x00da:
        r3 = r10.j;
        r4 = r10.q;
        r5 = r10.x;
        r11 = r10.c;
        r12 = r11.a;
        r12 = r12 & 512;
        if (r12 == 0) goto L_0x00f6;
    L_0x00e8:
        r11 = r11.m;
        if (r11 != 0) goto L_0x00ee;
    L_0x00ec:
        r11 = defpackage.auvr.c;
    L_0x00ee:
        r11 = r11.b;
        if (r11 != 0) goto L_0x00f4;
    L_0x00f2:
        r11 = defpackage.auvn.l;
    L_0x00f4:
        r6 = r11;
        goto L_0x00f7;
    L_0x00f6:
        r6 = r2;
    L_0x00f7:
        r11 = r10.c;
        r12 = r11.a;
        r12 = r12 & 4096;
        if (r12 == 0) goto L_0x0107;
    L_0x00ff:
        r11 = r11.p;
        if (r11 != 0) goto L_0x0105;
    L_0x0103:
        r11 = defpackage.aqlj.d;
    L_0x0105:
        r7 = r11;
        goto L_0x0108;
    L_0x0107:
        r7 = r2;
    L_0x0108:
        r8 = r10.c;
        r9 = r10.f;
        r3.a(r4, r5, r6, r7, r8, r9);
        goto L_0x0115;
    L_0x0110:
        r11 = r10.x;
        r11.setVisibility(r1);
    L_0x0115:
        r11 = r10.c;
        r11 = r11.b;
        r11 = r11.iterator();
        r12 = 0;
        r0 = 0;
    L_0x011f:
        r1 = r11.hasNext();
        r3 = 2;
        r4 = 1;
        if (r1 == 0) goto L_0x023a;
    L_0x0127:
        r1 = r11.next();
        r1 = (defpackage.avdh) r1;
        r5 = r10.p;
        r5 = r5.size();
        if (r5 != r0) goto L_0x0145;
    L_0x0135:
        r5 = r10.p;
        r6 = new jsk;
        r7 = r10.q;
        r8 = r10.g;
        r9 = r10.d;
        r6.<init>(r7, r8, r9);
        r5.add(r6);
    L_0x0145:
        r5 = r10.p;
        r5 = r5.get(r0);
        r5 = (defpackage.jsk) r5;
        r6 = r10.c;
        r6 = r6.b;
        r6 = r6.size();
        r6 = r6 + -1;
        r7 = r5.a;
        r8 = r5.d;
        r9 = r1.b;
        if (r9 != 0) goto L_0x0161;
    L_0x015f:
        r9 = defpackage.aygk.f;
    L_0x0161:
        r7.a(r8, r9);
        r7 = r1.f;
        if (r7 == 0) goto L_0x01a0;
    L_0x0168:
        r7 = r5.g;
        r8 = r1.a;
        r3 = r3 & r8;
        if (r3 == 0) goto L_0x0176;
    L_0x016f:
        r3 = r1.c;
        if (r3 != 0) goto L_0x0177;
    L_0x0173:
        r3 = defpackage.arml.f;
        goto L_0x0177;
    L_0x0176:
        r3 = r2;
    L_0x0177:
        r3 = defpackage.ajqy.a(r3);
        defpackage.xpr.a(r7, r3);
        r3 = r5.h;
        r7 = r1.a;
        r7 = r7 & 4;
        if (r7 == 0) goto L_0x018d;
    L_0x0186:
        r7 = r1.d;
        if (r7 != 0) goto L_0x018e;
    L_0x018a:
        r7 = defpackage.arml.f;
        goto L_0x018e;
    L_0x018d:
        r7 = r2;
    L_0x018e:
        r7 = defpackage.ajqy.a(r7);
        defpackage.xpr.a(r3, r7);
        r3 = r5.e;
        defpackage.xpr.a(r3, r12);
        r3 = r5.f;
        defpackage.xpr.a(r3, r12);
        goto L_0x01d7;
    L_0x01a0:
        r7 = r5.e;
        r8 = r1.a;
        r3 = r3 & r8;
        if (r3 == 0) goto L_0x01ae;
    L_0x01a7:
        r3 = r1.c;
        if (r3 != 0) goto L_0x01af;
    L_0x01ab:
        r3 = defpackage.arml.f;
        goto L_0x01af;
    L_0x01ae:
        r3 = r2;
    L_0x01af:
        r3 = defpackage.ajqy.a(r3);
        defpackage.xpr.a(r7, r3);
        r3 = r5.f;
        r7 = r1.a;
        r7 = r7 & 4;
        if (r7 == 0) goto L_0x01c5;
    L_0x01be:
        r7 = r1.d;
        if (r7 != 0) goto L_0x01c6;
    L_0x01c2:
        r7 = defpackage.arml.f;
        goto L_0x01c6;
    L_0x01c5:
        r7 = r2;
    L_0x01c6:
        r7 = defpackage.ajqy.a(r7);
        defpackage.xpr.a(r3, r7);
        r3 = r5.g;
        defpackage.xpr.a(r3, r12);
        r3 = r5.h;
        defpackage.xpr.a(r3, r12);
    L_0x01d7:
        r3 = r5.c;
        r3.setVisibility(r12);
        r3 = r5.d;
        r3 = r3.getBackground();
        r3 = r3 instanceof android.graphics.drawable.GradientDrawable;
        if (r3 == 0) goto L_0x01f9;
    L_0x01e6:
        r3 = r5.d;
        r3 = r3.getBackground();
        r3 = (android.graphics.drawable.GradientDrawable) r3;
        r7 = r5.b;
        r4 = defpackage.xss.a(r7, r4);
        r7 = r1.e;
        r3.setStroke(r4, r7);
    L_0x01f9:
        if (r0 == r6) goto L_0x01fc;
    L_0x01fb:
        goto L_0x0208;
    L_0x01fc:
        r1 = r1.f;
        if (r1 != 0) goto L_0x0208;
    L_0x0200:
        r1 = r5.c;
        r3 = m;
        r1.setLayoutParams(r3);
        goto L_0x020f;
    L_0x0208:
        r1 = r5.c;
        r3 = l;
        r1.setLayoutParams(r3);
    L_0x020f:
        r1 = r10.p;
        r1 = r1.get(r0);
        r1 = (defpackage.jsk) r1;
        r1 = r1.c;
        r3 = r1.getParent();
        r4 = r10.r;
        if (r3 != r4) goto L_0x0222;
    L_0x0221:
        goto L_0x0236;
    L_0x0222:
        r3 = r1.getParent();
        if (r3 == 0) goto L_0x0231;
    L_0x0228:
        r3 = r1.getParent();
        r3 = (android.view.ViewGroup) r3;
        r3.removeView(r1);
    L_0x0231:
        r3 = r10.r;
        r3.addView(r1);
    L_0x0236:
        r0 = r0 + 1;
        goto L_0x011f;
    L_0x023a:
        r11 = r10.u;
        r0 = r10.c;
        r1 = r0.a;
        r1 = r1 & 1024;
        if (r1 == 0) goto L_0x0266;
    L_0x0244:
        r0 = r0.n;
        if (r0 != 0) goto L_0x024a;
    L_0x0248:
        r0 = defpackage.axak.a;
    L_0x024a:
        r0 = defpackage.ajzv.a(r0);
        r1 = defpackage.aqeg.class;
        r1 = defpackage.ajzv.b(r0, r1);
        if (r1 == 0) goto L_0x0266;
    L_0x0256:
        r1 = defpackage.aqeg.class;
        r0 = defpackage.ajzv.a(r0, r1);
        r0 = (defpackage.aqeg) r0;
        r1 = r0.e;
        r0 = r0.d;
        if (r1 != r0) goto L_0x0266;
    L_0x0264:
        r0 = 1;
        goto L_0x0267;
    L_0x0266:
        r0 = 0;
    L_0x0267:
        r0 = r0 ^ r4;
        defpackage.xpr.a(r11, r0);
        r11 = r10.q;
        r0 = r10.o;
        r11.setOnClickListener(r0);
        r10.c();
        r11 = r10.c;
        r0 = r11.a;
        r0 = r0 & 1024;
        if (r0 != 0) goto L_0x027e;
    L_0x027d:
        goto L_0x0293;
    L_0x027e:
        r0 = r10.h;
        r1 = r10.q;
        r11 = r11.n;
        if (r11 != 0) goto L_0x0288;
    L_0x0286:
        r11 = defpackage.axak.a;
    L_0x0288:
        r11 = defpackage.ajzv.a(r11);
        r11 = defpackage.ajzv.b(r11);
        r0.a(r1, r11);
    L_0x0293:
        r11 = new vqx;
        r0 = r10.q;
        r11.<init>(r0, r12);
        r10.a = r11;
        r11 = r10.c;
        r11 = r11.e;
        if (r11 != 0) goto L_0x02a4;
    L_0x02a2:
        r11 = defpackage.apxu.d;
    L_0x02a4:
        r0 = com.google.protos.youtube.api.innertube.ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.shoppingDrawerEndpoint;
        r0 = defpackage.anxl.checkIsLite(r0);
        r11.a(r0);
        r11 = r11.h;
        r1 = r0.d;
        r11 = r11.b(r1);
        if (r11 != 0) goto L_0x02ba;
    L_0x02b7:
        r11 = r0.b;
        goto L_0x02be;
    L_0x02ba:
        r11 = r0.a(r11);
    L_0x02be:
        r11 = (com.google.protos.youtube.api.innertube.ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint) r11;
        r11 = r11.b;
        r11 = defpackage.axku.a(r11);
        if (r11 != 0) goto L_0x02c9;
    L_0x02c8:
        goto L_0x02cc;
    L_0x02c9:
        if (r11 != r3) goto L_0x02cc;
    L_0x02cb:
        r12 = 1;
    L_0x02cc:
        r10.n = r12;
        r11 = r10.c;
        r11 = r11.i;
        if (r11 != 0) goto L_0x02d6;
    L_0x02d4:
        r11 = defpackage.axak.a;
    L_0x02d6:
        r12 = com.google.protos.youtube.api.innertube.CompanionSponsoredButtonRendererOuterClass.sponsoredButtonRenderer;
        r12 = defpackage.anxl.checkIsLite(r12);
        r11.a(r12);
        r11 = r11.h;
        r12 = r12.d;
        r11 = r11.a(r12);
        if (r11 != 0) goto L_0x02f1;
    L_0x02e9:
        r11 = r10.i;
        r12 = r10.w;
        r11.a(r12, r2);
        goto L_0x031c;
    L_0x02f1:
        r11 = r10.i;
        r12 = r10.w;
        r0 = r10.c;
        r0 = r0.i;
        if (r0 != 0) goto L_0x02fd;
    L_0x02fb:
        r0 = defpackage.axak.a;
    L_0x02fd:
        r1 = com.google.protos.youtube.api.innertube.CompanionSponsoredButtonRendererOuterClass.sponsoredButtonRenderer;
        r1 = defpackage.anxl.checkIsLite(r1);
        r0.a(r1);
        r0 = r0.h;
        r4 = r1.d;
        r0 = r0.b(r4);
        if (r0 != 0) goto L_0x0313;
    L_0x0310:
        r0 = r1.b;
        goto L_0x0317;
    L_0x0313:
        r0 = r1.a(r0);
    L_0x0317:
        r0 = (defpackage.aqhh) r0;
        r11.a(r12, r0);
    L_0x031c:
        r11 = r10.f;
        r12 = new acvs;
        r0 = r10.c;
        r0 = r0.q;
        r12.<init>(r0);
        r11.a(r12, r2);
        r11 = r10.e;
        r12 = r10.c;
        r0 = r12.d;
        defpackage.aabd.a(r11, r0, r12);
        r11 = r10.c;
        r11 = r11.toBuilder();
        r11 = (defpackage.anxo) r11;
        r11 = (defpackage.avdi) r11;
        r11.copyOnWrite();
        r12 = r11.instance;
        r12 = (defpackage.avdj) r12;
        r0 = defpackage.anxl.emptyProtobufList();
        r12.d = r0;
        r11 = r11.build();
        r11 = (defpackage.anxl) r11;
        r11 = (defpackage.avdj) r11;
        r10.c = r11;
        r11 = r10.c;
        r12 = r11.a;
        r12 = r12 & r3;
        if (r12 != 0) goto L_0x035c;
    L_0x035b:
        goto L_0x0392;
    L_0x035c:
        r12 = r10.e;
        r11 = r11.e;
        if (r11 != 0) goto L_0x0364;
    L_0x0362:
        r11 = defpackage.apxu.d;
    L_0x0364:
        r0 = r10.c;
        r1 = "com.google.android.libraries.youtube.innertube.endpoint.tag";
        r0 = defpackage.amur.a(r1, r0);
        r12.a(r11, r0);
        r11 = r10.c;
        r11 = r11.toBuilder();
        r11 = (defpackage.anxo) r11;
        r11 = (defpackage.avdi) r11;
        r11.copyOnWrite();
        r12 = r11.instance;
        r12 = (defpackage.avdj) r12;
        r12.e = r2;
        r0 = r12.a;
        r0 = r0 & -3;
        r12.a = r0;
        r11 = r11.build();
        r11 = (defpackage.anxl) r11;
        r11 = (defpackage.avdj) r11;
        r10.c = r11;
    L_0x0392:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jsi.a(android.view.View, akor):void");
    }

    public final void a() {
        this.b = true;
        c();
    }

    public final void b() {
        c();
    }

    public final void a(View view) {
        int i = 0;
        this.b = false;
        b(view);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        while (i < size) {
            jsk jsk = (jsk) arrayList.get(i);
            jsk.c.setVisibility(8);
            jsk.e.setVisibility(8);
            jsk.f.setVisibility(8);
            i++;
        }
        this.c = null;
    }

    private final void b(View view) {
        if (view != null) {
            xpr.a(view, (int) R.id.multi_item_companion_card_stub, (int) R.id.multi_item_companion_card).setVisibility(8);
        }
        ViewGroup viewGroup = this.q;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            this.r.removeAllViews();
        }
        vqx vqx = this.a;
        if (vqx != null) {
            vqx.b();
        }
        avdj avdj = this.c;
        if (!(avdj == null || (avdj.a & 1024) == 0)) {
            jse jse = this.h;
            axak axak = avdj.n;
            if (axak == null) {
                axak = axak.a;
            }
            jse.a(ajzv.b(ajzv.a(axak)));
        }
        jsh jsh = this.i;
        if (jsh != null) {
            jsh.a();
        }
    }

    public final boolean a(ajzw ajzw, boolean z) {
        if (!a(ajzw)) {
            return false;
        }
        this.b = z;
        return true;
    }

    public final boolean a(ajzw ajzw) {
        avdj avdj = (avdj) ajzv.a(ajzw, avdj.class);
        if (avdj == null) {
            return false;
        }
        this.c = avdj;
        return true;
    }

    public final boolean a(aaga aaga, aakj aakj) {
        ajxu ajxu = null;
        this.c = null;
        ajxu ajxu2 = aakj.a;
        if (ajxu2 != null) {
            ajxu = ajxu2;
        }
        if (ajxu != null) {
            ajxp ajxp = ajxu.v;
            if (ajxp != null) {
                this.c = ajxp.e;
            }
        }
        return this.c != null;
    }

    public final boolean a(aaga aaga, akcb akcb) {
        this.c = null;
        if (akcb != null) {
            ajtb ajtb = akcb.f;
            if (ajtb != null) {
                this.c = ajtb.f;
            }
        }
        return this.c != null;
    }

    private final void c() {
        ViewGroup viewGroup = this.q;
        if (viewGroup != null && this.c != null) {
            viewGroup.setVisibility(0);
        }
    }

    public final int a(vow vow, boolean z) {
        int a;
        zwj zwj = this.k;
        if (zwj != null && this.n) {
            this.n = false;
            zwj.f();
        }
        avdj avdj = this.c;
        if (!(avdj == null || (avdj.a & 4) == 0)) {
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.c);
            aaas aaas = this.e;
            apxu apxu = this.c.f;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, hashMap);
        }
        if (vow.b == vra.USER_SKIPPED) {
            avdj = this.c;
            if (avdj != null) {
                anxp anxp = avdj.c;
                if (anxp == null) {
                    anxp = apxu.d;
                }
                anxr access$000 = anxl.checkIsLite(ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.shoppingDrawerEndpoint);
                anxp.a(access$000);
                Object b = anxp.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                a = axku.a(((ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint) b).b);
                if (a != 0 && a == 2) {
                    zwj = this.k;
                    if (zwj != null) {
                        zwj.f();
                    }
                }
            }
        }
        this.b = false;
        vra vra = vow.b;
        avdj = this.c;
        int i = 1;
        if (avdj != null) {
            a = aqhe.a(avdj.o);
            if (a != 0) {
                i = a;
            }
        }
        return jst.a(vra, z, i);
    }
}
