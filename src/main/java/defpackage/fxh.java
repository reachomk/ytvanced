package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;

/* renamed from: fxh */
public final class fxh implements aaap, wxe {
    private final wxd a;
    private final aaas b;
    private final PackageManager c;
    private final vod d;
    private final dwc e;

    public fxh(vod vod, dwc dwc, wxd wxd, aaas aaas, Context context) {
        this.d = (vod) amqw.a((Object) vod);
        this.e = (dwc) amqw.a((Object) dwc);
        this.a = (wxd) amqw.a((Object) wxd);
        this.b = (aaas) amqw.a((Object) aaas);
        this.c = (PackageManager) amqw.a(context.getPackageManager());
    }

    public final boolean a(int i, int i2, Intent intent) {
        return i == 908;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b4  */
    public final void a(defpackage.apxu r6, java.util.Map r7) {
        /*
        r5 = this;
        r0 = com.google.protos.youtube.api.innertube.AppDeepLinkEndpointOuterClass.appDeepLinkEndpoint;
        r0 = defpackage.anxl.checkIsLite(r0);
        r6.a(r0);
        r1 = r6.h;
        r0 = r0.d;
        r0 = r1.a(r0);
        if (r0 == 0) goto L_0x00bf;
    L_0x0013:
        r0 = com.google.protos.youtube.api.innertube.AppDeepLinkEndpointOuterClass.appDeepLinkEndpoint;
        r0 = defpackage.anxl.checkIsLite(r0);
        r6.a(r0);
        r6 = r6.h;
        r1 = r0.d;
        r6 = r6.b(r1);
        if (r6 != 0) goto L_0x0029;
    L_0x0026:
        r6 = r0.b;
        goto L_0x002d;
    L_0x0029:
        r6 = r0.a(r6);
    L_0x002d:
        r6 = (defpackage.aowi) r6;
        r0 = r5.d;
        r1 = "com.google.android.libraries.youtube.innertube.endpoint.tag";
        r2 = defpackage.xsb.c(r7, r1);
        r3 = defpackage.aoqh.ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_APP_DEEP_LINK;
        r0.a(r2, r3);
        r0 = new java.util.HashMap;
        r0.<init>();
        r2 = defpackage.xsb.c(r7, r1);
        r0.put(r1, r2);
        r1 = r5.e;
        r2 = defpackage.dwe.a;
        r3 = r6.f;
        r1.a(r2, r3, r0);
        r0 = r6.a;
        r0 = r0 & 2;
        r1 = 0;
        if (r0 == 0) goto L_0x005f;
    L_0x0058:
        r0 = r6.c;
        r0 = android.net.Uri.parse(r0);
        goto L_0x0060;
    L_0x005f:
        r0 = r1;
    L_0x0060:
        r2 = r6.b;
        r2 = defpackage.amqu.a(r2);
        r3 = 0;
        if (r2 == 0) goto L_0x006a;
    L_0x0069:
        goto L_0x007c;
    L_0x006a:
        if (r0 == 0) goto L_0x007c;
    L_0x006c:
        r2 = r5.c;	 Catch:{ NameNotFoundException -> 0x0074 }
        r4 = r6.b;	 Catch:{ NameNotFoundException -> 0x0074 }
        r1 = r2.getApplicationInfo(r4, r3);	 Catch:{ NameNotFoundException -> 0x0074 }
    L_0x0074:
        if (r1 == 0) goto L_0x007c;
    L_0x0076:
        r1 = r1.enabled;
        if (r1 != 0) goto L_0x007b;
    L_0x007a:
        goto L_0x007c;
    L_0x007b:
        r3 = 1;
    L_0x007c:
        r1 = r3 ^ 1;
        if (r3 == 0) goto L_0x00ab;
    L_0x0080:
        r2 = new android.content.Intent;
        r3 = "android.intent.action.VIEW";
        r2.<init>(r3, r0);
        r0 = r6.b;
        r2.setPackage(r0);
        r0 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r2.addFlags(r0);
        r0 = r5.c;
        r3 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r0 = r0.resolveActivity(r2, r3);
        if (r0 == 0) goto L_0x00a3;
    L_0x009b:
        r0 = r5.a;
        r3 = 908; // 0x38c float:1.272E-42 double:4.486E-321;
        r0.a(r2, r3, r5);
        goto L_0x00ab;
    L_0x00a3:
        r0 = r5.b;
        r1 = r6.e;
        r0.a(r1, r7);
        goto L_0x00ae;
    L_0x00ab:
        if (r1 != 0) goto L_0x00ae;
    L_0x00ad:
        goto L_0x00bf;
    L_0x00ae:
        r0 = r6.a;
        r0 = r0 & 8;
        if (r0 == 0) goto L_0x00bf;
    L_0x00b4:
        r0 = r5.b;
        r6 = r6.d;
        if (r6 != 0) goto L_0x00bc;
    L_0x00ba:
        r6 = defpackage.apxu.d;
    L_0x00bc:
        r0.a(r6, r7);
    L_0x00bf:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxh.a(apxu, java.util.Map):void");
    }
}
