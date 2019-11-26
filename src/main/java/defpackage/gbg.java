package defpackage;

import com.google.protos.youtube.api.innertube.ReelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint;
import java.util.Map;

/* renamed from: gbg */
public final class gbg implements aaap {
    private final nt a;

    public gbg(nt ntVar) {
        this.a = ntVar;
    }

    public final void a(apxu apxu, Map map) {
        if (this.a == null) {
            xtl.c("fragmentManager is null");
            return;
        }
        anxr access$000 = anxl.checkIsLite(ReelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint.reelCreationMetadataEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(ReelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint.reelCreationMetadataEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            ReelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint reelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint = (ReelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint) b;
            if ((reelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint.a & 1) != 0) {
                axak axak = reelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint.b;
                if (axak == null) {
                    axak = axak.a;
                }
                awww awww = (awww) ajzv.a(ajzv.a(axak), awww.class);
                if (awww != null) {
                    String str = (String) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", String.class);
                    gej gej = (gej) xsb.a(map, (Object) "callback_key", gej.class);
                    nf a = gei.a(awww, str, null);
                    a.a(gej);
                    this.a.a().a(a, "reel_playlist_creation").a();
                }
            }
        }
    }
}
