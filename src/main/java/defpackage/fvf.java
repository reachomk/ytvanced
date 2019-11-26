package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;

/* renamed from: fvf */
public final class fvf implements aaap, dxi {
    public static final String a = xtl.b("MDX.MdxConnectNavigationCommand");
    public final adgw b;
    public final Context c;
    public final adhn d;
    public final SharedPreferences e;
    public final hct f;
    public final xsc g;
    public final Handler h = new Handler(Looper.getMainLooper());
    public autt i;
    public bcqa j;
    private final adkk k;

    public fvf(adgw adgw, Context context, adhn adhn, SharedPreferences sharedPreferences, hct hct, xsc xsc, adkk adkk) {
        this.b = adgw;
        this.c = context;
        this.d = adhn;
        this.e = sharedPreferences;
        this.f = hct;
        this.g = xsc;
        this.k = adkk;
    }

    /* JADX WARNING: Missing block: B:32:0x0081, code skipped:
            if ((r4.a & 1) != 0) goto L_0x008c;
     */
    public final void a(defpackage.apxu r3, java.util.Map r4) {
        /*
        r2 = this;
        r4 = com.google.protos.youtube.api.innertube.MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.mdxConnectNavigationEndpoint;
        r4 = defpackage.anxl.checkIsLite(r4);
        r3.a(r4);
        r0 = r3.h;
        r4 = r4.d;
        r4 = r0.a(r4);
        if (r4 == 0) goto L_0x00d0;
    L_0x0013:
        r4 = r2.k;
        r4.c();
        r4 = com.google.protos.youtube.api.innertube.MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.mdxConnectNavigationEndpoint;
        r4 = defpackage.anxl.checkIsLite(r4);
        r3.a(r4);
        r0 = r3.h;
        r1 = r4.d;
        r0 = r0.b(r1);
        if (r0 != 0) goto L_0x002e;
    L_0x002b:
        r4 = r4.b;
        goto L_0x0032;
    L_0x002e:
        r4 = r4.a(r0);
    L_0x0032:
        r4 = (com.google.protos.youtube.api.innertube.MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint) r4;
        r0 = r4.a;
        r0 = r0 & 2;
        if (r0 == 0) goto L_0x00c8;
    L_0x003a:
        r4 = r4.b;
        if (r4 != 0) goto L_0x0040;
    L_0x003e:
        r4 = defpackage.autt.i;
    L_0x0040:
        r2.i = r4;
        r4 = r2.i;
        r0 = r4.a;
        r0 = r0 & 2;
        if (r0 == 0) goto L_0x00c0;
    L_0x004a:
        r4 = defpackage.adld.a(r4);
        if (r4 != 0) goto L_0x008c;
    L_0x0050:
        r4 = r2.i;
        r4 = r4.b;
        if (r4 != 0) goto L_0x0058;
    L_0x0056:
        r4 = defpackage.aure.c;
    L_0x0058:
        r0 = r4.a;
        r1 = 1;
        if (r0 != r1) goto L_0x0062;
    L_0x005d:
        r4 = r4.b;
        r4 = (defpackage.aurg) r4;
        goto L_0x0064;
    L_0x0062:
        r4 = defpackage.aurg.e;
    L_0x0064:
        r4 = r4.a;
        r4 = r4 & 2;
        if (r4 != 0) goto L_0x006b;
    L_0x006a:
        goto L_0x0084;
    L_0x006b:
        r4 = r2.i;
        r4 = r4.b;
        if (r4 != 0) goto L_0x0073;
    L_0x0071:
        r4 = defpackage.aure.c;
    L_0x0073:
        r0 = r4.a;
        if (r0 != r1) goto L_0x007c;
    L_0x0077:
        r4 = r4.b;
        r4 = (defpackage.aurg) r4;
        goto L_0x007e;
    L_0x007c:
        r4 = defpackage.aurg.e;
    L_0x007e:
        r4 = r4.a;
        r4 = r4 & r1;
        if (r4 == 0) goto L_0x0084;
    L_0x0083:
        goto L_0x008c;
    L_0x0084:
        r3 = a;
        r4 = "Single screen endpoint did not contain a valid screen to connect to.";
        defpackage.xtl.b(r3, r4);
        return;
    L_0x008c:
        r4 = new bcqa;
        r0 = r2.g;
        r0 = r0.a();
        r4.<init>(r0);
        r2.j = r4;
        r4 = android.os.Looper.myLooper();
        r0 = android.os.Looper.getMainLooper();
        if (r4 != r0) goto L_0x00a9;
    L_0x00a3:
        r4 = r2.b;
        r4.a(r2);
        goto L_0x00b3;
    L_0x00a9:
        r4 = r2.h;
        r0 = new fvi;
        r0.<init>(r2);
        r4.post(r0);
    L_0x00b3:
        r4 = r2.h;
        r0 = new fvh;
        r3 = r3.b;
        r0.<init>(r2, r3);
        r4.post(r0);
        return;
    L_0x00c0:
        r3 = a;
        r4 = "MdxPlaybackDescriptor does not contain a video id.";
        defpackage.xtl.b(r3, r4);
        return;
    L_0x00c8:
        r3 = a;
        r4 = "MdxPlaybackDescriptor not filled";
        defpackage.xtl.b(r3, r4);
        return;
    L_0x00d0:
        r3 = a;
        r4 = "MdxConnectNavigationEndpoint not filled";
        defpackage.xtl.b(r3, r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fvf.a(apxu, java.util.Map):void");
    }
}
