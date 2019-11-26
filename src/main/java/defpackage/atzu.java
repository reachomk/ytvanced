package defpackage;

import com.google.protos.youtube.api.innertube.LikeEndpointOuterClass$LikeEndpoint;

/* renamed from: atzu */
public final class atzu extends anxo implements anzf {
    private atzu() {
        super(LikeEndpointOuterClass$LikeEndpoint.e);
    }

    public final atzu a(auac auac) {
        copyOnWrite();
        LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint = (LikeEndpointOuterClass$LikeEndpoint) this.instance;
        if (auac != null) {
            likeEndpointOuterClass$LikeEndpoint.a |= 1;
            likeEndpointOuterClass$LikeEndpoint.b = auac.e;
            return this;
        }
        throw new NullPointerException();
    }

    public final atzu a(auag auag) {
        copyOnWrite();
        LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint = (LikeEndpointOuterClass$LikeEndpoint) this.instance;
        likeEndpointOuterClass$LikeEndpoint.c = (auad) ((anxl) auag.build());
        likeEndpointOuterClass$LikeEndpoint.a |= 2;
        return this;
    }

    public /* synthetic */ atzu(byte b) {
        super(LikeEndpointOuterClass$LikeEndpoint.e);
    }
}
