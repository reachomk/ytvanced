package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CompactCompanionExtensionRendererOuterClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: jro */
public final class jro implements vcy, vdc, vdd {
    public final aaas a;
    public final vod b;
    public aowr c;
    private final Context d;
    private final akkq e;
    private final acvx f;
    private final jse g;
    private final jsc h;
    private final epj i;
    private View j;
    private ImageView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private View o;
    private View p;
    private ImageView q;
    private View r;
    private ImageView s;
    private final int t;
    private vqx u;
    private eph v;
    private epn w;
    private jsr x;
    private boolean y;

    public jro(Context context, akkq akkq, aaas aaas, vod vod, acvx acvx, jse jse, jsc jsc, epj epj) {
        this.d = (Context) amqw.a((Object) context);
        this.e = (akkq) amqw.a((Object) akkq);
        this.a = (aaas) amqw.a((Object) aaas);
        this.b = (vod) amqw.a((Object) vod);
        this.f = (acvx) amqw.a((Object) acvx);
        this.g = (jse) amqw.a((Object) jse);
        this.h = (jsc) amqw.a((Object) jsc);
        this.t = (int) context.getResources().getDimension(R.dimen.ad_companion_action_button_margin);
        this.i = (epj) amqw.a((Object) epj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0388  */
    public final void a(android.view.View r12, defpackage.akor r13) {
        /*
        r11 = this;
        r13 = r11.c;
        r0 = 2;
        if (r13 == 0) goto L_0x03ca;
    L_0x0005:
        r13 = r11.j;
        if (r13 == 0) goto L_0x000f;
    L_0x0009:
        r13 = r13.getParent();
        if (r13 == r12) goto L_0x008d;
    L_0x000f:
        r11.b(r12);
        r13 = 2131758711; // 0x7f100e77 float:1.9148394E38 double:1.0532287443E-314;
        r1 = 2131758712; // 0x7f100e78 float:1.9148396E38 double:1.053228745E-314;
        r12 = defpackage.xpr.a(r12, r13, r1);
        r11.j = r12;
        r12 = r11.j;
        r13 = 2131755584; // 0x7f100240 float:1.9142051E38 double:1.0532271994E-314;
        r12 = r12.findViewById(r13);
        r12 = (android.widget.ImageView) r12;
        r11.k = r12;
        r12 = r11.j;
        r13 = 2131755586; // 0x7f100242 float:1.9142055E38 double:1.0532272004E-314;
        r12 = r12.findViewById(r13);
        r12 = (android.widget.TextView) r12;
        r11.l = r12;
        r12 = r11.j;
        r13 = 2131755588; // 0x7f100244 float:1.914206E38 double:1.0532272014E-314;
        r12 = r12.findViewById(r13);
        r12 = (android.widget.ImageView) r12;
        r11.q = r12;
        r12 = r11.j;
        r13 = 2131755587; // 0x7f100243 float:1.9142057E38 double:1.053227201E-314;
        r12 = r12.findViewById(r13);
        r11.r = r12;
        r12 = r11.j;
        r13 = 2131755589; // 0x7f100245 float:1.9142062E38 double:1.053227202E-314;
        r12 = r12.findViewById(r13);
        r12 = (android.widget.TextView) r12;
        r11.n = r12;
        r12 = r11.j;
        r13 = 2131755516; // 0x7f1001fc float:1.9141913E38 double:1.053227166E-314;
        r12 = r12.findViewById(r13);
        r11.o = r12;
        r12 = r11.j;
        r13 = 2131755526; // 0x7f100206 float:1.9141934E38 double:1.0532271707E-314;
        r12 = r12.findViewById(r13);
        r12 = (android.widget.TextView) r12;
        r11.m = r12;
        r12 = r11.j;
        r13 = 2131755081; // 0x7f100049 float:1.9141031E38 double:1.053226951E-314;
        r12 = r12.findViewById(r13);
        r12 = (android.widget.ImageView) r12;
        r11.s = r12;
        r12 = r11.j;
        r13 = 2131755515; // 0x7f1001fb float:1.9141911E38 double:1.0532271653E-314;
        r12 = r12.findViewById(r13);
        r11.p = r12;
    L_0x008d:
        r12 = r11.c;
        r13 = r12.a;
        r13 = r13 & 8192;
        r1 = 1;
        r2 = 0;
        if (r13 == 0) goto L_0x00a5;
    L_0x0097:
        r12 = r12.o;
        if (r12 != 0) goto L_0x009d;
    L_0x009b:
        r12 = defpackage.auvr.c;
    L_0x009d:
        r12 = r12.a;
        r12 = r12 & r1;
        if (r12 != 0) goto L_0x00a3;
    L_0x00a2:
        goto L_0x00a5;
    L_0x00a3:
        r12 = 1;
        goto L_0x00a6;
    L_0x00a5:
        r12 = 0;
    L_0x00a6:
        r13 = 0;
        if (r12 != 0) goto L_0x00aa;
    L_0x00a9:
        goto L_0x00dc;
    L_0x00aa:
        r3 = r11.c;
        r3 = r3.o;
        if (r3 != 0) goto L_0x00b2;
    L_0x00b0:
        r3 = defpackage.auvr.c;
    L_0x00b2:
        r3 = r3.b;
        if (r3 != 0) goto L_0x00b8;
    L_0x00b6:
        r3 = defpackage.auvn.l;
    L_0x00b8:
        r7 = r3;
        r4 = r11.h;
        r3 = r11.j;
        r5 = r3.getRootView();
        r6 = r11.s;
        r3 = r11.c;
        r8 = r3.a;
        r9 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r8 = r8 & r9;
        if (r8 == 0) goto L_0x00d4;
    L_0x00cc:
        r3 = r3.s;
        if (r3 != 0) goto L_0x00d2;
    L_0x00d0:
        r3 = defpackage.aqlj.d;
    L_0x00d2:
        r8 = r3;
        goto L_0x00d5;
    L_0x00d4:
        r8 = r13;
    L_0x00d5:
        r9 = r11.c;
        r10 = defpackage.acvx.g;
        r4.a(r5, r6, r7, r8, r9, r10);
    L_0x00dc:
        r3 = r11.s;
        r4 = 8;
        if (r12 != 0) goto L_0x00e5;
    L_0x00e2:
        r5 = 8;
        goto L_0x00e6;
    L_0x00e5:
        r5 = 0;
    L_0x00e6:
        r3.setVisibility(r5);
        r3 = r11.o;
        r3 = r3.getLayoutParams();
        r3 = (android.view.ViewGroup.MarginLayoutParams) r3;
        if (r12 != 0) goto L_0x00f6;
    L_0x00f3:
        r12 = r11.t;
        goto L_0x00f7;
    L_0x00f6:
        r12 = 0;
    L_0x00f7:
        r3.rightMargin = r12;
        r12 = r11.o;
        r12.setLayoutParams(r3);
        r12 = r11.l;
        r3 = r11.c;
        r5 = r3.a;
        r5 = r5 & r1;
        if (r5 == 0) goto L_0x010e;
    L_0x0107:
        r3 = r3.b;
        if (r3 != 0) goto L_0x010f;
    L_0x010b:
        r3 = defpackage.arml.f;
        goto L_0x010f;
    L_0x010e:
        r3 = r13;
    L_0x010f:
        r3 = defpackage.ajqy.a(r3);
        r12.setText(r3);
        r12 = r11.c;
        r3 = r12.a;
        r0 = r0 & r3;
        if (r0 == 0) goto L_0x0146;
    L_0x011d:
        r12 = r12.c;
        if (r12 == 0) goto L_0x0122;
    L_0x0121:
        goto L_0x0124;
    L_0x0122:
        r12 = defpackage.axak.a;
    L_0x0124:
        r0 = com.google.protos.youtube.api.innertube.AdClickCommandRendererOuterClass.adClickCommandRenderer;
        r0 = defpackage.anxl.checkIsLite(r0);
        r12.a(r0);
        r12 = r12.h;
        r3 = r0.d;
        r12 = r12.b(r3);
        if (r12 != 0) goto L_0x013a;
    L_0x0137:
        r12 = r0.b;
        goto L_0x013e;
    L_0x013a:
        r12 = r0.a(r12);
    L_0x013e:
        r12 = (defpackage.aogq) r12;
        r0 = r11.l;
        r11.a(r0, r12);
        goto L_0x014b;
    L_0x0146:
        r12 = r11.l;
        r12.setClickable(r2);
    L_0x014b:
        r12 = r11.e;
        r0 = r11.k;
        r3 = r11.c;
        r3 = r3.f;
        if (r3 != 0) goto L_0x0157;
    L_0x0155:
        r3 = defpackage.aygk.f;
    L_0x0157:
        r5 = defpackage.akko.h;
        r12.a(r0, r3, r5);
        r12 = r11.c;
        r0 = r12.a;
        r0 = r0 & 32;
        if (r0 == 0) goto L_0x018d;
    L_0x0164:
        r12 = r12.g;
        if (r12 == 0) goto L_0x0169;
    L_0x0168:
        goto L_0x016b;
    L_0x0169:
        r12 = defpackage.axak.a;
    L_0x016b:
        r0 = com.google.protos.youtube.api.innertube.AdClickCommandRendererOuterClass.adClickCommandRenderer;
        r0 = defpackage.anxl.checkIsLite(r0);
        r12.a(r0);
        r12 = r12.h;
        r3 = r0.d;
        r12 = r12.b(r3);
        if (r12 != 0) goto L_0x0181;
    L_0x017e:
        r12 = r0.b;
        goto L_0x0185;
    L_0x0181:
        r12 = r0.a(r12);
    L_0x0185:
        r12 = (defpackage.aogq) r12;
        r0 = r11.k;
        r11.a(r0, r12);
        goto L_0x0192;
    L_0x018d:
        r12 = r11.k;
        r12.setClickable(r2);
    L_0x0192:
        r12 = new vqx;
        r0 = r11.j;
        r12.<init>(r0, r2);
        r11.u = r12;
        r12 = r11.i;
        r0 = r11.o;
        r12 = r12.a(r13, r0);
        r11.v = r12;
        r12 = new epn;
        r0 = r11.p;
        r3 = r11.e;
        r12.<init>(r0, r3, r13);
        r11.w = r12;
        r12 = new jsr;
        r0 = r11.j;
        r12.<init>(r0);
        r11.x = r12;
        r12 = r11.c;
        r12 = r12.m;
        if (r12 != 0) goto L_0x01c1;
    L_0x01bf:
        r12 = defpackage.axak.a;
    L_0x01c1:
        r0 = com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass.adCtaButtonRenderer;
        r0 = defpackage.anxl.checkIsLite(r0);
        r12.a(r0);
        r12 = r12.h;
        r0 = r0.d;
        r12 = r12.a(r0);
        if (r12 == 0) goto L_0x01f9;
    L_0x01d4:
        r12 = r11.c;
        r12 = r12.m;
        if (r12 != 0) goto L_0x01dc;
    L_0x01da:
        r12 = defpackage.axak.a;
    L_0x01dc:
        r0 = com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass.adCtaButtonRenderer;
        r0 = defpackage.anxl.checkIsLite(r0);
        r12.a(r0);
        r12 = r12.h;
        r3 = r0.d;
        r12 = r12.b(r3);
        if (r12 != 0) goto L_0x01f2;
    L_0x01ef:
        r12 = r0.b;
        goto L_0x01f6;
    L_0x01f2:
        r12 = r0.a(r12);
    L_0x01f6:
        r12 = (defpackage.aohe) r12;
        goto L_0x01fa;
    L_0x01f9:
        r12 = r13;
    L_0x01fa:
        r0 = r11.c;
        r3 = r0.a;
        r3 = r3 & 256;
        if (r3 != 0) goto L_0x0204;
    L_0x0202:
        r0 = r13;
        goto L_0x020a;
    L_0x0204:
        r0 = r0.j;
        if (r0 != 0) goto L_0x020a;
    L_0x0208:
        r0 = defpackage.arml.f;
    L_0x020a:
        r0 = defpackage.ajqy.a(r0);
        if (r12 == 0) goto L_0x0222;
    L_0x0210:
        r0 = r11.v;
        r3 = new jrn;
        r3.<init>(r11);
        r0.a(r3);
        r0 = r11.v;
        r3 = r11.f;
        r0.a(r12, r3);
        goto L_0x0254;
    L_0x0222:
        r12 = android.text.TextUtils.isEmpty(r0);
        if (r12 != 0) goto L_0x024a;
    L_0x0228:
        r12 = r11.o;
        r3 = new jrs;
        r5 = r11.c;
        r6 = r5.k;
        if (r6 != 0) goto L_0x0234;
    L_0x0232:
        r6 = defpackage.apxu.d;
    L_0x0234:
        r3.<init>(r11, r5, r6);
        r12.setOnClickListener(r3);
        r12 = r11.m;
        r12.setText(r0);
        r12 = r11.o;
        r12.setVisibility(r2);
        r12 = r11.m;
        r12.setVisibility(r2);
        goto L_0x0254;
    L_0x024a:
        r12 = r11.v;
        r12.a();
        r12 = r11.o;
        r12.setVisibility(r4);
    L_0x0254:
        r12 = r11.c;
        r12 = r12.n;
        if (r12 != 0) goto L_0x025c;
    L_0x025a:
        r12 = defpackage.axak.a;
    L_0x025c:
        r0 = com.google.protos.youtube.api.innertube.AdThumbnailDetailsButtonRendererOuterClass.adThumbnailDetailsButtonRenderer;
        r0 = defpackage.anxl.checkIsLite(r0);
        r12.a(r0);
        r12 = r12.h;
        r0 = r0.d;
        r12 = r12.a(r0);
        if (r12 == 0) goto L_0x0294;
    L_0x026f:
        r12 = r11.c;
        r12 = r12.n;
        if (r12 != 0) goto L_0x0277;
    L_0x0275:
        r12 = defpackage.axak.a;
    L_0x0277:
        r0 = com.google.protos.youtube.api.innertube.AdThumbnailDetailsButtonRendererOuterClass.adThumbnailDetailsButtonRenderer;
        r0 = defpackage.anxl.checkIsLite(r0);
        r12.a(r0);
        r12 = r12.h;
        r3 = r0.d;
        r12 = r12.b(r3);
        if (r12 != 0) goto L_0x028d;
    L_0x028a:
        r12 = r0.b;
        goto L_0x0291;
    L_0x028d:
        r12 = r0.a(r12);
    L_0x0291:
        r12 = (defpackage.aokt) r12;
        goto L_0x0295;
    L_0x0294:
        r12 = r13;
    L_0x0295:
        if (r12 == 0) goto L_0x02ab;
    L_0x0297:
        r0 = r11.w;
        r3 = new jrq;
        r3.<init>(r11);
        r0.a(r3);
        r0 = r11.w;
        r3 = r11.f;
        r5 = r11.a;
        r0.a(r12, r3, r5);
        goto L_0x02b0;
    L_0x02ab:
        r12 = r11.w;
        r12.a();
    L_0x02b0:
        r12 = r11.c;
        if (r12 != 0) goto L_0x02b5;
    L_0x02b4:
        goto L_0x0302;
    L_0x02b5:
        r0 = r12.a;
        r3 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r0 = r0 & r3;
        if (r0 == 0) goto L_0x0302;
    L_0x02bc:
        r0 = r11.g;
        r3 = r11.j;
        r12 = r12.v;
        if (r12 == 0) goto L_0x02c5;
    L_0x02c4:
        goto L_0x02c7;
    L_0x02c5:
        r12 = defpackage.axak.a;
    L_0x02c7:
        r5 = com.google.protos.youtube.api.innertube.CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer;
        r5 = defpackage.anxl.checkIsLite(r5);
        r12.a(r5);
        r12 = r12.h;
        r5 = r5.d;
        r12 = r12.a(r5);
        if (r12 != 0) goto L_0x02dc;
    L_0x02da:
        r12 = r13;
        goto L_0x02ff;
    L_0x02dc:
        r12 = r11.c;
        r12 = r12.v;
        if (r12 == 0) goto L_0x02e3;
    L_0x02e2:
        goto L_0x02e5;
    L_0x02e3:
        r12 = defpackage.axak.a;
    L_0x02e5:
        r5 = com.google.protos.youtube.api.innertube.CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer;
        r5 = defpackage.anxl.checkIsLite(r5);
        r12.a(r5);
        r12 = r12.h;
        r6 = r5.d;
        r12 = r12.b(r6);
        if (r12 != 0) goto L_0x02fb;
    L_0x02f8:
        r12 = r5.b;
        goto L_0x02ff;
    L_0x02fb:
        r12 = r5.a(r12);
    L_0x02ff:
        r0.a(r3, r12);
    L_0x0302:
        r12 = r11.n;
        r0 = r11.c;
        r3 = r0.a;
        r3 = r3 & 4;
        if (r3 == 0) goto L_0x0313;
    L_0x030c:
        r0 = r0.d;
        if (r0 != 0) goto L_0x0314;
    L_0x0310:
        r0 = defpackage.arml.f;
        goto L_0x0314;
    L_0x0313:
        r0 = r13;
    L_0x0314:
        r0 = defpackage.ajqy.a(r0);
        r12.setText(r0);
        r12 = r11.x;
        r0 = r11.c;
        r3 = r0.h;
        r0 = r0.i;
        r0 = defpackage.awui.a(r0);
        if (r0 == 0) goto L_0x032a;
    L_0x0329:
        goto L_0x032b;
    L_0x032a:
        r0 = 1;
    L_0x032b:
        r12.a(r3, r0);
        r12 = r11.q;
        r12.setVisibility(r4);
        r12 = r11.c;
        r0 = r12.a;
        r0 = r0 & r4;
        if (r0 == 0) goto L_0x0363;
    L_0x033a:
        r12 = r12.e;
        if (r12 == 0) goto L_0x033f;
    L_0x033e:
        goto L_0x0341;
    L_0x033f:
        r12 = defpackage.axak.a;
    L_0x0341:
        r0 = com.google.protos.youtube.api.innertube.AdClickCommandRendererOuterClass.adClickCommandRenderer;
        r0 = defpackage.anxl.checkIsLite(r0);
        r12.a(r0);
        r12 = r12.h;
        r3 = r0.d;
        r12 = r12.b(r3);
        if (r12 != 0) goto L_0x0357;
    L_0x0354:
        r12 = r0.b;
        goto L_0x035b;
    L_0x0357:
        r12 = r0.a(r12);
    L_0x035b:
        r12 = (defpackage.aogq) r12;
        r0 = r11.r;
        r11.a(r0, r12);
        goto L_0x0368;
    L_0x0363:
        r12 = r11.r;
        r12.setClickable(r2);
    L_0x0368:
        r12 = r11.j;
        r0 = new jrp;
        r0.<init>(r11);
        r12.setOnClickListener(r0);
        r12 = r11.j;
        r0 = r11.c;
        r0 = r0.a;
        r0 = r0 & 1024;
        if (r0 == 0) goto L_0x037d;
    L_0x037c:
        goto L_0x037e;
    L_0x037d:
        r1 = 0;
    L_0x037e:
        r12.setClickable(r1);
        r12 = r11.c;
        r12 = r12.t;
        if (r12 != 0) goto L_0x0388;
    L_0x0387:
        goto L_0x038d;
    L_0x0388:
        r0 = r11.j;
        r0.setBackgroundColor(r12);
    L_0x038d:
        r12 = r11.j;
        r12.setVisibility(r2);
        r12 = r11.f;
        r0 = r11.c;
        r0 = r0.u;
        r0 = r0.d();
        r12.a(r0, r13);
        r12 = r11.a;
        r13 = r11.c;
        r0 = r13.p;
        defpackage.aabd.a(r12, r0, r13);
        r12 = r11.c;
        r12 = r12.toBuilder();
        r12 = (defpackage.anxo) r12;
        r12 = (defpackage.aowt) r12;
        r12.copyOnWrite();
        r13 = r12.instance;
        r13 = (defpackage.aowr) r13;
        r0 = defpackage.anxl.emptyProtobufList();
        r13.p = r0;
        r12 = r12.build();
        r12 = (defpackage.anxl) r12;
        r12 = (defpackage.aowr) r12;
        r11.c = r12;
        return;
    L_0x03ca:
        r12 = defpackage.afpf.ad;
        r13 = "AppPromo Companion Card presented with missing ad renderer.";
        defpackage.afpc.a(r0, r12, r13);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jro.a(android.view.View, akor):void");
    }

    public final boolean a(ajzw ajzw, boolean z) {
        if (!a(ajzw)) {
            return false;
        }
        this.y = true;
        return true;
    }

    public final boolean a(ajzw ajzw) {
        aowr aowr = (aowr) ajzv.a(ajzw, aowr.class);
        if (aowr == null) {
            return false;
        }
        this.c = aowr;
        return true;
    }

    public final boolean a(aaga aaga, aakj aakj) {
        ajxu ajxu = null;
        this.c = null;
        if (aakj != null) {
            ajxu = aakj.a;
        }
        if (ajxu != null) {
            ajxp ajxp = ajxu.v;
            if (ajxp != null) {
                this.c = ajxp.b;
            }
        }
        return this.c != null;
    }

    public final boolean a(aaga aaga, akcb akcb) {
        this.c = null;
        ajtb ajtb = akcb.f;
        if (ajtb != null) {
            this.c = ajtb.b;
        }
        return this.c != null;
    }

    public final void a() {
        this.y = true;
        c();
    }

    public final void a(View view) {
        this.y = false;
        b(view);
        this.j = null;
    }

    private final void b(View view) {
        if (view != null) {
            xpr.a(view, (int) R.id.app_promotion_companion_card_stub, (int) R.id.app_promotion_companion_card).setVisibility(8);
        }
        if (this.j != null) {
            Object obj = null;
            this.k.setImageDrawable(null);
            this.q.setVisibility(4);
            this.q.setImageDrawable(null);
            this.e.a(this.k);
            this.j.setVisibility(8);
            this.j.setBackgroundColor(xwe.a(this.d, R.attr.adBackground1, 0));
            this.u.b();
            aowr aowr = this.c;
            if (!(aowr == null || (aowr.a & 1048576) == 0)) {
                jse jse = this.g;
                anxp anxp = aowr.v;
                if (anxp == null) {
                    anxp = axak.a;
                }
                anxr access$000 = anxl.checkIsLite(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer);
                anxp.a(access$000);
                if (anxp.h.a(access$000.d)) {
                    anxp = this.c.v;
                    if (anxp == null) {
                        anxp = axak.a;
                    }
                    anxr access$0002 = anxl.checkIsLite(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer);
                    anxp.a(access$0002);
                    Object b = anxp.h.b(access$0002.d);
                    if (b == null) {
                        obj = access$0002.b;
                    } else {
                        obj = access$0002.a(b);
                    }
                }
                jse.a(obj);
            }
            eph eph = this.v;
            if (eph != null) {
                eph.a();
            }
            jsr jsr = this.x;
            if (jsr != null) {
                jsr.a();
            }
            epn epn = this.w;
            if (epn != null) {
                epn.a();
            }
        }
    }

    public final void b() {
        c();
    }

    public final void a(Object obj, List list) {
        if (obj != null && !this.b.a(obj)) {
            aabd.a(this.a, list, a(obj));
        }
    }

    public final Map a(Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        hashMap.put("MacrosConverters.CustomConvertersKey", new aftl[]{this.u});
        return hashMap;
    }

    private final void c() {
        if (this.y && this.c != null) {
            View view = this.j;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    private final void a(View view, aogq aogq) {
        List arrayList = new ArrayList();
        arrayList.addAll(aogq.c);
        if ((aogq.a & 1) != 0) {
            Object obj = aogq.b;
            if (obj == null) {
                obj = apxu.d;
            }
            arrayList.add(obj);
        }
        view.setOnClickListener(new jrs(this, (Object) aogq, arrayList));
        view.setClickable(true);
        this.f.a(aogq.d.d(), null);
    }

    public final int a(vow vow, boolean z) {
        aaas aaas = this.a;
        aowr aowr = this.c;
        apxu apxu = null;
        if (!(aowr == null || (aowr.a & 16384) == 0)) {
            apxu = aowr.q;
            if (apxu == null) {
                apxu = apxu.d;
            }
        }
        jst.a(aaas, aowr, apxu, this.w);
        vra vra = vow.b;
        aowr aowr2 = this.c;
        int i = 1;
        if (aowr2 != null) {
            int a = aqhe.a(aowr2.r);
            if (a != 0) {
                i = a;
            }
        }
        return jst.a(vra, z, i);
    }
}
