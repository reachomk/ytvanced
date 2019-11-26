package defpackage;

import com.google.protos.youtube.api.innertube.HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;

/* renamed from: artm */
public final class artm extends anxo implements anzf {
    private artm() {
        super(HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c);
    }

    public final artm a(String str) {
        copyOnWrite();
        HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) this.instance;
        if (str != null) {
            hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.a |= 1;
            hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public /* synthetic */ artm(byte b) {
        super(HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c);
    }
}
