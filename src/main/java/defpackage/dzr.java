package defpackage;

import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import java.util.Map;

/* renamed from: dzr */
public final class dzr implements aaap {
    private final lud a;

    public dzr(lud lud) {
        this.a = lud;
    }

    public final void a(apxu apxu, Map map) {
        lui lui = this.a.a;
        if (lui != null) {
            Object obj;
            len g = lui.g();
            anxr access$000 = anxl.checkIsLite(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) obj;
            if (!(showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint == null || (showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.a & 2) == 0)) {
                arex arex = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.c;
                if (arex == null) {
                    arex = arex.c;
                }
                if (arex.a == 138681066) {
                    arff arff;
                    anze anze = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.c;
                    if (anze == null) {
                        anze = arex.c;
                    }
                    if (anze.a == 138681066) {
                        arff = (arff) anze.b;
                    } else {
                        arff = arff.e;
                    }
                    if (!g.a.a(arff.b)) {
                        g.a((ajun) ajzv.a(anze, ajun.class));
                    }
                }
            }
            String str = (String) xsb.a(map, (Object) "engagement_panel_id_key", String.class);
            lel lel = (lel) xsb.a(map, (Object) "engagement_panel_close_listener_key", lel.class);
            if (str == null) {
                g.b(apxu, lel);
            } else if (str.equals(g.b())) {
                g.a(apxu, lel);
            }
        }
    }
}
