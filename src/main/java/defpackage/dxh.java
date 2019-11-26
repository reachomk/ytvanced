package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.AppStoreEndpointOuterClass;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dxh */
public final class dxh implements aaap {
    private final vod a;
    private final dwc b;
    private final Activity c;
    private final vdg d;
    private final aaas e;
    private final wxd f;
    private final exu g;

    public dxh(vod vod, dwc dwc, Activity activity, vdg vdg, aaas aaas, wxd wxd, exu exu) {
        this.a = (vod) amqw.a((Object) vod);
        this.b = (dwc) amqw.a((Object) dwc);
        this.c = (Activity) amqw.a((Object) activity);
        this.d = (vdg) amqw.a((Object) vdg);
        this.e = aaas;
        this.f = wxd;
        this.g = exu;
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        anxp anxp = apxu;
        Map map2 = map;
        vod vod = this.a;
        String str = "com.google.android.libraries.youtube.innertube.endpoint.tag";
        if (vod != null) {
            vod.a(xsb.c(map2, str), aoqh.ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_APP_INSTALL);
        }
        anxr access$000 = anxl.checkIsLite(AppStoreEndpointOuterClass.appStoreEndpoint);
        anxp.a(access$000);
        Object b = anxp.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        aowy aowy = (aowy) obj;
        HashMap hashMap = new HashMap();
        hashMap.put(str, xsb.c(map2, str));
        this.b.a(dwe.a, aowy.h, hashMap);
        wxk.a(this.c, aowy.b, aowy.c, aowy.d, aowy.e, aowy.f, this.d.j(), this.d.h(), this.f, new dxk(anxp, this.e, this.g));
    }
}
