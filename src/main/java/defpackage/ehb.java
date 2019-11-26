package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.google.android.youtube.R;
import java.util.List;
import java.util.Map;

/* renamed from: ehb */
public final class ehb implements aaas {
    private final vod a;
    private final Activity b;
    private final xci c;
    private final xhv d;
    private final aaan e;
    private final bcaa f;
    private final xpa g;
    private ehd h;

    public ehb(vod vod, Activity activity, xci xci, xhv xhv, bcaa bcaa, aaan aaan, xpa xpa) {
        this.a = vod;
        this.b = (Activity) amqw.a((Object) activity);
        this.c = (xci) amqw.a((Object) xci);
        this.d = (xhv) amqw.a((Object) xhv);
        this.f = (bcaa) amqw.a((Object) bcaa);
        this.e = (aaan) amqw.a((Object) aaan);
        this.g = (xpa) amqw.a((Object) xpa);
    }

    public final void a(List list, Object obj) {
        aaav.a((aaas) this, list, obj);
    }

    public final void a(List list, Map map) {
        aaav.a((aaas) this, list, map);
    }

    public final void a(apxu[] apxuArr, Object obj) {
        aaav.a((aaas) this, apxuArr, obj);
    }

    public final void a(apxu[] apxuArr, Map map) {
        aaav.a((aaas) this, apxuArr, map);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00bc */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Missing block: B:28:?, code skipped:
            r5.e.a(r6).a(r6, r7);
     */
    /* JADX WARNING: Missing block: B:29:0x00c5, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:30:0x00c6, code skipped:
            r6 = move-exception;
     */
    /* JADX WARNING: Missing block: B:31:0x00c7, code skipped:
            defpackage.xpr.a(r5.b, r6.getMessage(), 1);
     */
    public final void a(defpackage.apxu r6, java.util.Map r7) {
        /*
        r5 = this;
        if (r6 == 0) goto L_0x00d1;
    L_0x0002:
        r0 = com.google.protos.youtube.api.innertube.UrlEndpointOuterClass.urlEndpoint;	 Catch:{ aabf -> 0x00bc }
        r0 = defpackage.anxl.checkIsLite(r0);	 Catch:{ aabf -> 0x00bc }
        r6.a(r0);	 Catch:{ aabf -> 0x00bc }
        r1 = r6.h;	 Catch:{ aabf -> 0x00bc }
        r0 = r0.d;	 Catch:{ aabf -> 0x00bc }
        r0 = r1.a(r0);	 Catch:{ aabf -> 0x00bc }
        r1 = 0;
        if (r0 == 0) goto L_0x002b;
    L_0x0016:
        r0 = r5.h;	 Catch:{ aabf -> 0x00bc }
        if (r0 != 0) goto L_0x0027;
    L_0x001a:
        r0 = new ehd;	 Catch:{ aabf -> 0x00bc }
        r1 = r5.b;	 Catch:{ aabf -> 0x00bc }
        r2 = r5.a;	 Catch:{ aabf -> 0x00bc }
        r3 = defpackage.ehe.a;	 Catch:{ aabf -> 0x00bc }
        r0.<init>(r1, r2, r3);	 Catch:{ aabf -> 0x00bc }
        r5.h = r0;	 Catch:{ aabf -> 0x00bc }
    L_0x0027:
        r1 = r5.h;	 Catch:{ aabf -> 0x00bc }
        goto L_0x00ab;
    L_0x002b:
        r0 = r5.d;	 Catch:{ aabf -> 0x00bc }
        r0 = r0.c();	 Catch:{ aabf -> 0x00bc }
        if (r0 != 0) goto L_0x0039;
    L_0x0033:
        r0 = r5.g;	 Catch:{ aabf -> 0x00bc }
        r0.a();	 Catch:{ aabf -> 0x00bc }
        goto L_0x00ab;
    L_0x0039:
        r0 = com.google.protos.youtube.api.innertube.ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.channelCreationFormEndpoint;	 Catch:{ aabf -> 0x00bc }
        r0 = defpackage.anxl.checkIsLite(r0);	 Catch:{ aabf -> 0x00bc }
        r6.a(r0);	 Catch:{ aabf -> 0x00bc }
        r2 = r6.h;	 Catch:{ aabf -> 0x00bc }
        r0 = r0.d;	 Catch:{ aabf -> 0x00bc }
        r0 = r2.a(r0);	 Catch:{ aabf -> 0x00bc }
        if (r0 != 0) goto L_0x00a2;
    L_0x004c:
        r0 = com.google.protos.youtube.api.innertube.AuthorizedUrlEndpointOuterClass.authorizedUrlEndpoint;	 Catch:{ aabf -> 0x00bc }
        r0 = defpackage.anxl.checkIsLite(r0);	 Catch:{ aabf -> 0x00bc }
        r6.a(r0);	 Catch:{ aabf -> 0x00bc }
        r2 = r6.h;	 Catch:{ aabf -> 0x00bc }
        r0 = r0.d;	 Catch:{ aabf -> 0x00bc }
        r0 = r2.a(r0);	 Catch:{ aabf -> 0x00bc }
        if (r0 == 0) goto L_0x009a;
    L_0x005f:
        r0 = com.google.protos.youtube.api.innertube.AuthorizedUrlEndpointOuterClass.authorizedUrlEndpoint;	 Catch:{ aabf -> 0x00bc }
        r0 = defpackage.anxl.checkIsLite(r0);	 Catch:{ aabf -> 0x00bc }
        r6.a(r0);	 Catch:{ aabf -> 0x00bc }
        r2 = r6.h;	 Catch:{ aabf -> 0x00bc }
        r3 = r0.d;	 Catch:{ aabf -> 0x00bc }
        r2 = r2.b(r3);	 Catch:{ aabf -> 0x00bc }
        if (r2 != 0) goto L_0x0075;
    L_0x0072:
        r0 = r0.b;	 Catch:{ aabf -> 0x00bc }
        goto L_0x0079;
    L_0x0075:
        r0 = r0.a(r2);	 Catch:{ aabf -> 0x00bc }
    L_0x0079:
        r0 = (defpackage.aoyr) r0;	 Catch:{ aabf -> 0x00bc }
        r0 = r0.b;	 Catch:{ aabf -> 0x00bc }
        r0 = defpackage.xvt.d(r0);	 Catch:{ aabf -> 0x00bc }
        r2 = r5.b;	 Catch:{ aabf -> 0x00bc }
        r3 = new android.content.Intent;	 Catch:{ aabf -> 0x00bc }
        r4 = "android.intent.action.VIEW";
        r3.<init>(r4, r0);	 Catch:{ aabf -> 0x00bc }
        r0 = defpackage.ajqy.a(r2, r3);	 Catch:{ aabf -> 0x00bc }
        r2 = r5.b;	 Catch:{ aabf -> 0x00bc }
        r3 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0 = r0.setFlags(r3);	 Catch:{ aabf -> 0x00bc }
        defpackage.ehb.a(r2, r0);	 Catch:{ aabf -> 0x00bc }
        goto L_0x00ab;
    L_0x009a:
        r0 = new aabf;	 Catch:{ aabf -> 0x00bc }
        r1 = "Unknown NavigationData encountered";
        r0.<init>(r1);	 Catch:{ aabf -> 0x00bc }
        throw r0;	 Catch:{ aabf -> 0x00bc }
    L_0x00a2:
        r0 = r5.f;	 Catch:{ aabf -> 0x00bc }
        r0 = r0.get();	 Catch:{ aabf -> 0x00bc }
        r1 = r0;
        r1 = (defpackage.aaap) r1;	 Catch:{ aabf -> 0x00bc }
    L_0x00ab:
        if (r1 != 0) goto L_0x00ae;
    L_0x00ad:
        goto L_0x00bb;
    L_0x00ae:
        r1.a(r6, r7);	 Catch:{ aabf -> 0x00bc }
        r0 = r5.c;	 Catch:{ aabf -> 0x00bc }
        r1 = new efd;	 Catch:{ aabf -> 0x00bc }
        r1.<init>();	 Catch:{ aabf -> 0x00bc }
        r0.d(r1);	 Catch:{ aabf -> 0x00bc }
    L_0x00bb:
        return;
    L_0x00bc:
        r0 = r5.e;	 Catch:{ aabf -> 0x00c6 }
        r0 = r0.a(r6);	 Catch:{ aabf -> 0x00c6 }
        r0.a(r6, r7);	 Catch:{ aabf -> 0x00c6 }
        return;
    L_0x00c6:
        r6 = move-exception;
        r7 = r5.b;
        r6 = r6.getMessage();
        r0 = 1;
        defpackage.xpr.a(r7, r6, r0);
    L_0x00d1:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehb.a(apxu, java.util.Map):void");
    }

    private static void a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, R.string.url_resolver_failed, 1).show();
        }
    }
}
