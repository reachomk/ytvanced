package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CompactCompanionExtensionRendererOuterClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jst */
public final class jst implements vcy, vdc, vdd {
    public final aaas a;
    public final vod b;
    public vqx c;
    public aqha d;
    private final akkq e;
    private final acvx f;
    private final jse g;
    private final akvp h;
    private final Context i;
    private final jsc j;
    private final epj k;
    private jsx l;
    private View m;
    private TextView n;
    private TextView o;
    private ViewGroup p;
    private ImageView q;
    private boolean r;
    private ImageView s;
    private View t;
    private epn u;

    public jst(akkq akkq, aaas aaas, vod vod, acvx acvx, jse jse, akvp akvp, Context context, jsc jsc, epj epj) {
        this.a = (aaas) amqw.a((Object) aaas);
        this.b = (vod) amqw.a((Object) vod);
        this.e = (akkq) amqw.a((Object) akkq);
        this.h = (akvp) amqw.a((Object) akvp);
        this.f = (acvx) amqw.a((Object) acvx);
        this.g = (jse) amqw.a((Object) jse);
        this.i = (Context) amqw.a((Object) context);
        this.j = (jsc) amqw.a((Object) jsc);
        this.k = (epj) amqw.a((Object) epj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:153:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0347  */
    public final void a(android.view.View r9, defpackage.akor r10) {
        /*
        r8 = this;
        r10 = r8.d;
        if (r10 == 0) goto L_0x0395;
    L_0x0004:
        r10 = r8.m;
        if (r10 == 0) goto L_0x000e;
    L_0x0008:
        r10 = r10.getParent();
        if (r10 == r9) goto L_0x005e;
    L_0x000e:
        r8.b(r9);
        r10 = 2131758709; // 0x7f100e75 float:1.914839E38 double:1.0532287433E-314;
        r0 = 2131758710; // 0x7f100e76 float:1.9148392E38 double:1.053228744E-314;
        r9 = defpackage.xpr.a(r9, r10, r0);
        r8.m = r9;
        r9 = r8.m;
        r10 = 2131755472; // 0x7f1001d0 float:1.9141824E38 double:1.053227144E-314;
        r9 = r9.findViewById(r10);
        r9 = (android.widget.ImageView) r9;
        r8.s = r9;
        r9 = r8.m;
        r10 = 2131755189; // 0x7f1000b5 float:1.914125E38 double:1.053227004E-314;
        r9 = r9.findViewById(r10);
        r9 = (android.widget.TextView) r9;
        r8.n = r9;
        r9 = r8.m;
        r10 = 2131755519; // 0x7f1001ff float:1.914192E38 double:1.0532271673E-314;
        r9 = r9.findViewById(r10);
        r9 = (android.widget.TextView) r9;
        r8.o = r9;
        r9 = r8.m;
        r10 = 2131755516; // 0x7f1001fc float:1.9141913E38 double:1.053227166E-314;
        r9 = r9.findViewById(r10);
        r9 = (android.view.ViewGroup) r9;
        r8.p = r9;
        r9 = r8.m;
        r10 = 2131755081; // 0x7f100049 float:1.9141031E38 double:1.053226951E-314;
        r9 = r9.findViewById(r10);
        r9 = (android.widget.ImageView) r9;
        r8.q = r9;
    L_0x005e:
        r0 = r8.j;
        r9 = r8.m;
        r1 = r9.getRootView();
        r2 = r8.q;
        r9 = r8.d;
        r9 = r9.i;
        if (r9 != 0) goto L_0x0070;
    L_0x006e:
        r9 = defpackage.auvr.c;
    L_0x0070:
        r9 = r9.a;
        r10 = 1;
        r9 = r9 & r10;
        r7 = 0;
        if (r9 != 0) goto L_0x0079;
    L_0x0077:
        r3 = r7;
        goto L_0x0088;
    L_0x0079:
        r9 = r8.d;
        r9 = r9.i;
        if (r9 != 0) goto L_0x0081;
    L_0x007f:
        r9 = defpackage.auvr.c;
    L_0x0081:
        r9 = r9.b;
        if (r9 != 0) goto L_0x0087;
    L_0x0085:
        r9 = defpackage.auvn.l;
    L_0x0087:
        r3 = r9;
    L_0x0088:
        r9 = r8.d;
        r4 = r9.a;
        r5 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r4 = r4 & r5;
        if (r4 == 0) goto L_0x0099;
    L_0x0091:
        r9 = r9.p;
        if (r9 != 0) goto L_0x0097;
    L_0x0095:
        r9 = defpackage.aqlj.d;
    L_0x0097:
        r4 = r9;
        goto L_0x009a;
    L_0x0099:
        r4 = r7;
    L_0x009a:
        r5 = r8.d;
        r6 = defpackage.acvx.g;
        r0.a(r1, r2, r3, r4, r5, r6);
        r9 = r8.e;
        r0 = r8.s;
        r1 = r8.d;
        r2 = r1.a;
        r2 = r2 & 32;
        if (r2 == 0) goto L_0x00b4;
    L_0x00ad:
        r1 = r1.f;
        if (r1 != 0) goto L_0x00b5;
    L_0x00b1:
        r1 = defpackage.aygk.f;
        goto L_0x00b5;
    L_0x00b4:
        r1 = r7;
    L_0x00b5:
        r2 = defpackage.akko.h;
        r9.a(r0, r1, r2);
        r9 = r8.d;
        r0 = r9.a;
        r0 = r0 & 64;
        r1 = 0;
        if (r0 == 0) goto L_0x00ec;
    L_0x00c3:
        r0 = r8.s;
        r9 = r9.g;
        if (r9 == 0) goto L_0x00ca;
    L_0x00c9:
        goto L_0x00cc;
    L_0x00ca:
        r9 = defpackage.axak.a;
    L_0x00cc:
        r2 = com.google.protos.youtube.api.innertube.AdClickCommandRendererOuterClass.adClickCommandRenderer;
        r2 = defpackage.anxl.checkIsLite(r2);
        r9.a(r2);
        r9 = r9.h;
        r3 = r2.d;
        r9 = r9.b(r3);
        if (r9 != 0) goto L_0x00e2;
    L_0x00df:
        r9 = r2.b;
        goto L_0x00e6;
    L_0x00e2:
        r9 = r2.a(r9);
    L_0x00e6:
        r9 = (defpackage.aogq) r9;
        r8.a(r0, r9);
        goto L_0x00f1;
    L_0x00ec:
        r9 = r8.s;
        r9.setClickable(r1);
    L_0x00f1:
        r9 = r8.n;
        r0 = r8.d;
        r0 = r0.b;
        if (r0 != 0) goto L_0x00fb;
    L_0x00f9:
        r0 = defpackage.arml.f;
    L_0x00fb:
        r0 = defpackage.ajqy.a(r0);
        r9.setText(r0);
        r9 = r8.d;
        r0 = r9.a;
        r0 = r0 & 4;
        if (r0 == 0) goto L_0x0133;
    L_0x010a:
        r0 = r8.n;
        r9 = r9.c;
        if (r9 == 0) goto L_0x0111;
    L_0x0110:
        goto L_0x0113;
    L_0x0111:
        r9 = defpackage.axak.a;
    L_0x0113:
        r2 = com.google.protos.youtube.api.innertube.AdClickCommandRendererOuterClass.adClickCommandRenderer;
        r2 = defpackage.anxl.checkIsLite(r2);
        r9.a(r2);
        r9 = r9.h;
        r3 = r2.d;
        r9 = r9.b(r3);
        if (r9 != 0) goto L_0x0129;
    L_0x0126:
        r9 = r2.b;
        goto L_0x012d;
    L_0x0129:
        r9 = r2.a(r9);
    L_0x012d:
        r9 = (defpackage.aogq) r9;
        r8.a(r0, r9);
        goto L_0x0138;
    L_0x0133:
        r9 = r8.n;
        r9.setClickable(r1);
    L_0x0138:
        r9 = r8.o;
        r0 = r8.d;
        r0 = r0.d;
        if (r0 != 0) goto L_0x0142;
    L_0x0140:
        r0 = defpackage.arml.f;
    L_0x0142:
        r0 = defpackage.ajqy.a(r0);
        r9.setText(r0);
        r9 = r8.d;
        r0 = r9.a;
        r0 = r0 & 16;
        if (r0 == 0) goto L_0x017a;
    L_0x0151:
        r0 = r8.o;
        r9 = r9.e;
        if (r9 == 0) goto L_0x0158;
    L_0x0157:
        goto L_0x015a;
    L_0x0158:
        r9 = defpackage.axak.a;
    L_0x015a:
        r2 = com.google.protos.youtube.api.innertube.AdClickCommandRendererOuterClass.adClickCommandRenderer;
        r2 = defpackage.anxl.checkIsLite(r2);
        r9.a(r2);
        r9 = r9.h;
        r3 = r2.d;
        r9 = r9.b(r3);
        if (r9 != 0) goto L_0x0170;
    L_0x016d:
        r9 = r2.b;
        goto L_0x0174;
    L_0x0170:
        r9 = r2.a(r9);
    L_0x0174:
        r9 = (defpackage.aogq) r9;
        r8.a(r0, r9);
        goto L_0x017f;
    L_0x017a:
        r9 = r8.o;
        r9.setClickable(r1);
    L_0x017f:
        r9 = new vqx;
        r0 = r8.m;
        r9.<init>(r0, r1);
        r8.c = r9;
        r9 = new jsx;
        r0 = r8.a;
        r2 = r8.c;
        r3 = r8.p;
        r4 = r8.k;
        r9.<init>(r0, r2, r3, r4);
        r8.l = r9;
        r9 = r8.m;
        r0 = 2131755515; // 0x7f1001fb float:1.9141911E38 double:1.0532271653E-314;
        r9 = r9.findViewById(r0);
        r8.t = r9;
        r9 = new epn;
        r0 = r8.t;
        r2 = r8.e;
        r9.<init>(r0, r2, r7);
        r8.u = r9;
        r9 = r8.d;
        r9 = r9.n;
        if (r9 != 0) goto L_0x01b5;
    L_0x01b3:
        r9 = defpackage.axak.a;
    L_0x01b5:
        r0 = com.google.protos.youtube.api.innertube.CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer;
        r0 = defpackage.anxl.checkIsLite(r0);
        r9.a(r0);
        r9 = r9.h;
        r0 = r0.d;
        r9 = r9.a(r0);
        if (r9 != 0) goto L_0x01c9;
    L_0x01c8:
        goto L_0x01f2;
    L_0x01c9:
        r9 = r8.g;
        r0 = r8.m;
        r2 = r8.d;
        r2 = r2.n;
        if (r2 != 0) goto L_0x01d5;
    L_0x01d3:
        r2 = defpackage.axak.a;
    L_0x01d5:
        r3 = com.google.protos.youtube.api.innertube.CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer;
        r3 = defpackage.anxl.checkIsLite(r3);
        r2.a(r3);
        r2 = r2.h;
        r4 = r3.d;
        r2 = r2.b(r4);
        if (r2 != 0) goto L_0x01eb;
    L_0x01e8:
        r2 = r3.b;
        goto L_0x01ef;
    L_0x01eb:
        r2 = r3.a(r2);
    L_0x01ef:
        r9.a(r0, r2);
    L_0x01f2:
        r9 = r8.l;
        r0 = r8.d;
        r2 = r8.h;
        r3 = r8.f;
        if (r0 == 0) goto L_0x021c;
    L_0x01fc:
        r4 = r0.j;
        if (r4 != 0) goto L_0x0202;
    L_0x0200:
        r4 = defpackage.aqgy.c;
    L_0x0202:
        r4 = r4.a;
        r5 = 65153809; // 0x3e22b11 float:1.3292974E-36 double:3.21902587E-316;
        if (r4 == r5) goto L_0x020a;
    L_0x0209:
        goto L_0x021c;
    L_0x020a:
        r4 = r0.j;
        if (r4 != 0) goto L_0x0210;
    L_0x020e:
        r4 = defpackage.aqgy.c;
    L_0x0210:
        r6 = r4.a;
        if (r6 != r5) goto L_0x0219;
    L_0x0214:
        r4 = r4.b;
        r4 = (defpackage.aphg) r4;
        goto L_0x021d;
    L_0x0219:
        r4 = defpackage.aphg.s;
        goto L_0x021d;
    L_0x021c:
        r4 = r7;
    L_0x021d:
        r9.f = r4;
        if (r0 == 0) goto L_0x0241;
    L_0x0221:
        r4 = r0.j;
        if (r4 != 0) goto L_0x0227;
    L_0x0225:
        r4 = defpackage.aqgy.c;
    L_0x0227:
        r4 = r4.a;
        r5 = 157534306; // 0x963c862 float:2.741835E-33 double:7.78322886E-316;
        if (r4 == r5) goto L_0x022f;
    L_0x022e:
        goto L_0x0241;
    L_0x022f:
        r0 = r0.j;
        if (r0 != 0) goto L_0x0235;
    L_0x0233:
        r0 = defpackage.aqgy.c;
    L_0x0235:
        r4 = r0.a;
        if (r4 != r5) goto L_0x023e;
    L_0x0239:
        r0 = r0.b;
        r0 = (defpackage.aohe) r0;
        goto L_0x0242;
    L_0x023e:
        r0 = defpackage.aohe.m;
        goto L_0x0242;
    L_0x0241:
        r0 = r7;
    L_0x0242:
        r9.g = r0;
        r0 = r9.f;
        if (r0 != 0) goto L_0x0268;
    L_0x0248:
        r10 = r9.g;
        if (r10 == 0) goto L_0x025f;
    L_0x024c:
        r10 = r9.d;
        r0 = new jsz;
        r0.<init>(r9);
        r10.a(r0);
        r10 = r9.d;
        r9 = r9.g;
        r10.a(r9, r3);
        goto L_0x02e5;
    L_0x025f:
        r9 = r9.a;
        r10 = 8;
        r9.setVisibility(r10);
        goto L_0x02e5;
    L_0x0268:
        r4 = r0.a;
        r4 = r4 & 128;
        if (r4 == 0) goto L_0x0275;
    L_0x026e:
        r0 = r0.g;
        if (r0 != 0) goto L_0x0276;
    L_0x0272:
        r0 = defpackage.arml.f;
        goto L_0x0276;
    L_0x0275:
        r0 = r7;
    L_0x0276:
        r0 = defpackage.ajqy.a(r0);
        r4 = android.text.TextUtils.isEmpty(r0);
        if (r4 != 0) goto L_0x0288;
    L_0x0280:
        r2 = r9.b;
        r2.setText(r0);
        r0 = 1;
    L_0x0286:
        r2 = 0;
        goto L_0x02b2;
    L_0x0288:
        r0 = r9.f;
        r4 = r0.a;
        r4 = r4 & 16;
        if (r4 == 0) goto L_0x02b0;
    L_0x0290:
        if (r2 == 0) goto L_0x02b0;
    L_0x0292:
        r0 = r0.e;
        if (r0 != 0) goto L_0x0298;
    L_0x0296:
        r0 = defpackage.arwf.c;
    L_0x0298:
        r0 = r0.b;
        r0 = defpackage.arwh.a(r0);
        if (r0 != 0) goto L_0x02a2;
    L_0x02a0:
        r0 = defpackage.arwh.UNKNOWN;
    L_0x02a2:
        r0 = r2.a(r0);
        if (r0 == 0) goto L_0x02b0;
    L_0x02a8:
        r2 = r9.c;
        r2.setImageResource(r0);
        r0 = 0;
        r2 = 1;
        goto L_0x02b2;
    L_0x02b0:
        r0 = 0;
        goto L_0x0286;
    L_0x02b2:
        r4 = r9.a;
        if (r0 == 0) goto L_0x02b7;
    L_0x02b6:
        goto L_0x02bb;
    L_0x02b7:
        if (r2 == 0) goto L_0x02ba;
    L_0x02b9:
        goto L_0x02bb;
    L_0x02ba:
        r10 = 0;
    L_0x02bb:
        defpackage.xpr.a(r4, r10);
        r10 = r9.c;
        defpackage.xpr.a(r10, r2);
        r10 = r9.b;
        defpackage.xpr.a(r10, r0);
        if (r2 == 0) goto L_0x02cb;
    L_0x02ca:
        goto L_0x02cd;
    L_0x02cb:
        if (r0 == 0) goto L_0x02db;
    L_0x02cd:
        r10 = r9.f;
        if (r10 != 0) goto L_0x02d2;
    L_0x02d1:
        goto L_0x02db;
    L_0x02d2:
        r10 = r10.r;
        r10 = r10.d();
        r3.a(r10, r7);
    L_0x02db:
        r10 = r9.a;
        r0 = new jsw;
        r0.<init>(r9);
        r10.setOnClickListener(r0);
    L_0x02e5:
        r9 = r8.d;
        r9 = r9.k;
        if (r9 != 0) goto L_0x02ed;
    L_0x02eb:
        r9 = defpackage.axak.a;
    L_0x02ed:
        r10 = com.google.protos.youtube.api.innertube.AdThumbnailDetailsButtonRendererOuterClass.adThumbnailDetailsButtonRenderer;
        r10 = defpackage.anxl.checkIsLite(r10);
        r9.a(r10);
        r9 = r9.h;
        r10 = r10.d;
        r9 = r9.a(r10);
        if (r9 != 0) goto L_0x0306;
    L_0x0300:
        r9 = r8.u;
        r9.a();
        goto L_0x033d;
    L_0x0306:
        r9 = r8.d;
        r9 = r9.k;
        if (r9 != 0) goto L_0x030e;
    L_0x030c:
        r9 = defpackage.axak.a;
    L_0x030e:
        r10 = com.google.protos.youtube.api.innertube.AdThumbnailDetailsButtonRendererOuterClass.adThumbnailDetailsButtonRenderer;
        r10 = defpackage.anxl.checkIsLite(r10);
        r9.a(r10);
        r9 = r9.h;
        r0 = r10.d;
        r9 = r9.b(r0);
        if (r9 != 0) goto L_0x0324;
    L_0x0321:
        r9 = r10.b;
        goto L_0x0328;
    L_0x0324:
        r9 = r10.a(r9);
    L_0x0328:
        r9 = (defpackage.aokt) r9;
        r10 = r8.u;
        r0 = new jss;
        r0.<init>(r8);
        r10.a(r0);
        r10 = r8.u;
        r0 = r8.f;
        r2 = r8.a;
        r10.a(r9, r0, r2);
    L_0x033d:
        r9 = r8.d;
        r10 = r9.a;
        r0 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r10 = r10 & r0;
        if (r10 != 0) goto L_0x0347;
    L_0x0346:
        goto L_0x034e;
    L_0x0347:
        r10 = r8.m;
        r9 = r9.q;
        r10.setBackgroundColor(r9);
    L_0x034e:
        r9 = r8.m;
        r10 = new jsu;
        r10.<init>(r8);
        r9.setOnClickListener(r10);
        r9 = r8.m;
        r9.setVisibility(r1);
        r9 = r8.f;
        r10 = r8.d;
        r10 = r10.r;
        r10 = r10.d();
        r9.a(r10, r7);
        r9 = r8.a;
        r10 = r8.d;
        r0 = r10.l;
        defpackage.aabd.a(r9, r0, r10);
        r9 = r8.d;
        r9 = r9.toBuilder();
        r9 = (defpackage.anxo) r9;
        r9 = (defpackage.aqgz) r9;
        r9.copyOnWrite();
        r10 = r9.instance;
        r10 = (defpackage.aqha) r10;
        r0 = defpackage.anxl.emptyProtobufList();
        r10.l = r0;
        r9 = r9.build();
        r9 = (defpackage.anxl) r9;
        r9 = (defpackage.aqha) r9;
        r8.d = r9;
        return;
    L_0x0395:
        r9 = 2;
        r10 = defpackage.afpf.ad;
        r0 = "TrueView Companion Card presented with missing ad renderer.";
        defpackage.afpc.a(r9, r10, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jst.a(android.view.View, akor):void");
    }

    public final boolean a(ajzw ajzw, boolean z) {
        if (!a(ajzw)) {
            return false;
        }
        this.r = true;
        return true;
    }

    public final boolean a(ajzw ajzw) {
        aqha aqha = (aqha) ajzv.a(ajzw, aqha.class);
        if (aqha == null) {
            return false;
        }
        this.d = aqha;
        return true;
    }

    public final boolean a(aaga aaga, aakj aakj) {
        ajxu ajxu = null;
        this.d = null;
        if (aakj != null) {
            ajxu = aakj.a;
        }
        if (ajxu != null) {
            ajxp ajxp = ajxu.v;
            if (ajxp != null) {
                this.d = ajxp.a;
            }
        }
        return this.d != null;
    }

    public final boolean a(aaga aaga, akcb akcb) {
        if (!(aaga == null || TextUtils.isEmpty(aaga.d()))) {
            ajtb ajtb = akcb.f;
            this.d = ajtb != null ? ajtb.a : null;
            if (this.d != null) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        this.r = true;
        c();
    }

    public final void b() {
        c();
    }

    public final void a(View view) {
        b(view);
        this.r = false;
        this.d = null;
        this.m = null;
    }

    private final void b(View view) {
        if (view != null) {
            xpr.a(view, (int) R.id.ad_companion_card_stub, (int) R.id.ad_companion_card).setVisibility(8);
        }
        if (this.m != null) {
            this.e.a(this.s);
            this.m.setVisibility(8);
            this.m.setBackgroundColor(xwe.a(this.i, R.attr.adBackground1, 0));
        }
        vqx vqx = this.c;
        if (vqx != null) {
            vqx.b();
        }
        aqha aqha = this.d;
        if (aqha != null) {
            anxp anxp = aqha.n;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                jse jse = this.g;
                anxp anxp2 = this.d.n;
                if (anxp2 == null) {
                    anxp2 = axak.a;
                }
                anxr access$0002 = anxl.checkIsLite(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer);
                anxp2.a(access$0002);
                Object b = anxp2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                jse.a(b);
            }
        }
        jsx jsx = this.l;
        if (jsx != null) {
            jsx.a.setOnClickListener(null);
            jsx.a.setVisibility(8);
            jsx.d.a();
            jsx.f = null;
            jsx.g = null;
        }
        epn epn = this.u;
        if (epn != null) {
            epn.a();
        }
    }

    private final void a(View view, aogq aogq) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(aogq.c);
        if ((aogq.a & 1) != 0) {
            Object obj = aogq.b;
            if (obj == null) {
                obj = apxu.d;
            }
            arrayList.add(obj);
        }
        view.setOnClickListener(new jsv(this, aogq, arrayList));
        view.setClickable(true);
        this.f.a(aogq.d.d(), null);
    }

    private final void c() {
        if (this.r && this.d != null) {
            View view = this.m;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public final Map a(Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        hashMap.put("MacrosConverters.CustomConvertersKey", new aftl[]{this.c});
        return hashMap;
    }

    public static void a(aaas aaas, Object obj, apxu apxu, epi epi) {
        if (apxu != null) {
            Map hashMap = new HashMap();
            if (obj != null) {
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
            }
            hashMap.put("hint_anchor_tag", epi != null ? epi.a : null);
            aaas.a(apxu, hashMap);
        }
    }

    public final int a(vow vow, boolean z) {
        aaas aaas = this.a;
        aqha aqha = this.d;
        apxu apxu = null;
        if (!(aqha == null || (aqha.a & 8192) == 0)) {
            apxu = aqha.m;
            if (apxu == null) {
                apxu = apxu.d;
            }
        }
        jst.a(aaas, aqha, apxu, this.u);
        vra vra = vow.b;
        aqha aqha2 = this.d;
        int i = 1;
        if (aqha2 != null) {
            int a = aqhe.a(aqha2.o);
            if (a != 0) {
                i = a;
            }
        }
        return jst.a(vra, z, i);
    }

    public static int a(vra vra, boolean z, int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            return vra != vra.USER_SKIPPED ? 1 : 2;
        } else {
            if (i2 == 2) {
                return 2;
            }
            if (i2 == 3) {
                return 1;
            }
            if (i2 != 4) {
                return i2 != 5 ? (vra != vra.USER_SKIPPED || z) ? 1 : 2 : vra != vra.USER_SKIPPED ? 3 : 1;
            } else {
                return 3;
            }
        }
    }
}
