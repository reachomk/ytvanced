package defpackage;

import com.google.protos.youtube.api.innertube.ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint;
import java.util.Map;

/* renamed from: dzu */
public final class dzu implements aaap {
    private final euy a;

    public dzu(euy euy) {
        this.a = (euy) amqw.a((Object) euy);
    }

    public final void a(apxu apxu, Map map) {
        axxl axxl;
        anxr access$000 = anxl.checkIsLite(ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint.showModifyChannelNotificationOptionsEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint showModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint = (ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint) b;
        axlx axlx = showModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint.b;
        if (axlx == null) {
            axlx = axlx.c;
        }
        if (axlx.a != 119226798) {
            axxl = null;
        } else {
            axlx axlx2 = showModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint.b;
            if (axlx2 == null) {
                axlx2 = axlx.c;
            }
            if (axlx2.a == 119226798) {
                axxl = (axxl) axlx2.b;
            } else {
                axxl = axxl.k;
            }
        }
        if (axxl != null) {
            this.a.a(axxl);
        }
    }
}
