package defpackage;

import com.google.protos.youtube.api.innertube.OpenAdsWebViewInBrowserCommandOuterClass;
import java.util.Map;

/* renamed from: fxq */
public final class fxq implements aaap {
    private final dwa a;

    public fxq(dwa dwa) {
        this.a = (dwa) amqw.a((Object) dwa);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(OpenAdsWebViewInBrowserCommandOuterClass.openAdsWebViewInBrowserCommand);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(OpenAdsWebViewInBrowserCommandOuterClass.openAdsWebViewInBrowserCommand);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            avtu avtu = (avtu) b;
            dwa dwa = this.a;
            dvz dvz = (dvz) dwa.a.get(avtu.b);
            if (dvz != null) {
                dvz.b();
            }
        }
    }
}
