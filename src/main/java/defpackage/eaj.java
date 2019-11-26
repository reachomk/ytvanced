package defpackage;

import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.google.protos.youtube.api.innertube.WebviewEndpointOuterClass$WebviewEndpoint;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: eaj */
public final class eaj implements aaap {
    public final Context a;
    private final afpo b;
    private final afpu c;
    private final ScheduledExecutorService d;

    public eaj(Context context, afpo afpo, afpu afpu, ScheduledExecutorService scheduledExecutorService) {
        this.a = context;
        AccountManager.get(context);
        this.b = afpo;
        this.c = afpu;
        this.d = scheduledExecutorService;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(WebviewEndpointOuterClass$WebviewEndpoint.webviewEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        WebviewEndpointOuterClass$WebviewEndpoint webviewEndpointOuterClass$WebviewEndpoint = (WebviewEndpointOuterClass$WebviewEndpoint) b;
        if (webviewEndpointOuterClass$WebviewEndpoint.d) {
            String str = webviewEndpointOuterClass$WebviewEndpoint.b;
            xvd.a(str);
            this.d.execute(new afpr((Activity) this.a, this.b.a(this.c.c()), str, new eam(this)));
            return;
        }
        fom.a(this.a, Uri.parse(webviewEndpointOuterClass$WebviewEndpoint.b));
    }
}
