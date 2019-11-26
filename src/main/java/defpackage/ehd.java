package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ehd */
public final class ehd implements aaap {
    private final vod a;
    private final dwc b;
    private final Context c;
    private final ehf d;
    private final xbg e;

    ehd(Context context, vod vod, dwc dwc, egv egv, xbg xbg) {
        egv.getClass();
        this(context, vod, dwc, new ehg(egv), xbg);
    }

    public ehd(Context context, vod vod, ehf ehf) {
        this(context, vod, null, ehf, null);
    }

    private ehd(Context context, vod vod, dwc dwc, ehf ehf, xbg xbg) {
        this.c = (Context) amqw.a((Object) context);
        this.a = vod;
        this.b = dwc;
        this.d = (ehf) amqw.a((Object) ehf);
        this.e = xbg;
    }

    public final void a(apxu apxu, Map map) {
        vod vod = this.a;
        String str = "com.google.android.libraries.youtube.innertube.endpoint.tag";
        if (vod != null) {
            vod.a(xsb.c(map, str), aoqh.ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_URL);
        }
        if (this.b != null) {
            Object obj;
            HashMap hashMap = new HashMap();
            hashMap.put(str, xsb.c(map, str));
            dwc dwc = this.b;
            dwe dwe = dwe.a;
            anxr access$000 = anxl.checkIsLite(UrlEndpointOuterClass.urlEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            dwc.a(dwe, ((ayvl) obj).c, hashMap);
        }
        ehf ehf = this.d;
        anxr access$0002 = anxl.checkIsLite(UrlEndpointOuterClass.urlEndpoint);
        apxu.a(access$0002);
        Object b2 = apxu.h.b(access$0002.d);
        if (b2 == null) {
            b2 = access$0002.b;
        } else {
            b2 = access$0002.a(b2);
        }
        Uri a = ehf.a(((ayvl) b2).b, map);
        Intent intent = new Intent("android.intent.action.VIEW", a);
        if (this.c.getPackageManager().queryIntentActivities(intent, 128).size() <= 0) {
            xpr.a(this.c, (int) R.string.error_link_cannot_be_opened, 0);
            return;
        }
        intent = ajqy.a(this.c, intent);
        if (intent.getPackage() == null) {
            xbg xbg = this.e;
            if (xbg != null) {
                Context context = this.c;
                if ((context instanceof Activity) && xbg.a((Activity) context, a)) {
                    return;
                }
            }
        }
        wxk.a(this.c, intent, a);
        this.c.startActivity(intent.setFlags(268435456));
    }
}
