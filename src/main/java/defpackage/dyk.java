package defpackage;

import com.google.protos.youtube.api.innertube.HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
import java.util.Map;

/* renamed from: dyk */
public final class dyk implements aaap {
    private final lud a;

    public dyk(lud lud) {
        this.a = lud;
    }

    public final void a(apxu apxu, Map map) {
        Object b;
        anxr access$000 = anxl.checkIsLite(HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint);
            apxu.a(access$000);
            b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            b = ((HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) b).b;
        } else {
            b = null;
        }
        if (amqu.a((String) b)) {
            b = (String) xsb.a(map, (Object) "engagement_panel_id_key", String.class);
        }
        lui lui = this.a.a;
        if (lui != null && b != null) {
            len g = lui.g();
            b.getClass();
            g.a(new dyj(b));
        }
    }
}
