package defpackage;

import com.google.protos.youtube.api.innertube.ShowSubscriptionNotificationOptionsEndpointOuterClass$ShowSubscriptionNotificationOptionsEndpoint;
import java.util.Map;

/* renamed from: dzw */
public final class dzw implements aaap {
    private final euy a;

    public dzw(euy euy) {
        this.a = (euy) amqw.a((Object) euy);
    }

    public final void a(apxu apxu, Map map) {
        axxl axxl;
        anxr access$000 = anxl.checkIsLite(ShowSubscriptionNotificationOptionsEndpointOuterClass$ShowSubscriptionNotificationOptionsEndpoint.showSubscriptionNotificationOptionsEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        ShowSubscriptionNotificationOptionsEndpointOuterClass$ShowSubscriptionNotificationOptionsEndpoint showSubscriptionNotificationOptionsEndpointOuterClass$ShowSubscriptionNotificationOptionsEndpoint = (ShowSubscriptionNotificationOptionsEndpointOuterClass$ShowSubscriptionNotificationOptionsEndpoint) b;
        axmq axmq = showSubscriptionNotificationOptionsEndpointOuterClass$ShowSubscriptionNotificationOptionsEndpoint.b;
        if (axmq == null) {
            axmq = axmq.c;
        }
        if (axmq.a != 119226798) {
            axxl = null;
        } else {
            axmq axmq2 = showSubscriptionNotificationOptionsEndpointOuterClass$ShowSubscriptionNotificationOptionsEndpoint.b;
            if (axmq2 == null) {
                axmq2 = axmq.c;
            }
            if (axmq2.a == 119226798) {
                axxl = (axxl) axmq2.b;
            } else {
                axxl = axxl.k;
            }
        }
        if (axxl != null) {
            this.a.a(axxl);
        }
    }
}
