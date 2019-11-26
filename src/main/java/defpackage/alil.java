package defpackage;

import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint;
import java.util.Map;

/* renamed from: alil */
final class alil implements afsw {
    private final /* synthetic */ SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint a;
    private final /* synthetic */ Map b;
    private final /* synthetic */ alij c;

    alil(alij alij, SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint, Map map) {
        this.c = alij;
        this.a = sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint;
        this.b = map;
    }

    public final void a(bqn bqn) {
        xpr.a(this.c.a, (int) R.string.error_publishing_private_video, 0);
    }
}
