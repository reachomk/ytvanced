package defpackage;

import com.google.protos.youtube.api.innertube.ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint;
import java.util.Map;

/* renamed from: euq */
final class euq implements afsw {
    private final apxu a;
    private final eun b;
    private final Map c;
    private final afxm d;
    private final /* synthetic */ eum e;

    euq(eum eum, apxu apxu, eun eun, Map map, afxm afxm) {
        this.e = eum;
        this.a = apxu;
        this.b = eun;
        this.c = map;
        this.d = afxm;
    }

    public final void a(bqn bqn) {
        xtl.a("Error rating", (Throwable) bqn);
        this.e.b.c(bqn);
        apxu apxu = this.a;
        anxr access$000 = anxl.checkIsLite(ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.modifyChannelNotificationPreferenceEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint = (ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint) b;
        if (modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.g.size() > 0) {
            this.e.a.a(modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.g, this.d);
        }
        this.b.a();
    }
}
