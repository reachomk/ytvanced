package defpackage;

import com.google.protos.youtube.api.innertube.LikeEndpointOuterClass$LikeEndpoint;
import java.util.concurrent.Callable;

/* renamed from: dyq */
final /* synthetic */ class dyq implements Callable {
    private final dyl a;
    private final apxu b;
    private final Object c;
    private final boolean d;
    private final LikeEndpointOuterClass$LikeEndpoint e;
    private final String f;

    dyq(dyl dyl, apxu apxu, Object obj, boolean z, LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint, String str) {
        this.a = dyl;
        this.b = apxu;
        this.c = obj;
        this.d = z;
        this.e = likeEndpointOuterClass$LikeEndpoint;
        this.f = str;
    }

    public final Object call() {
        return this.a.a(this.b, this.c, this.d, this.e, this.f, null);
    }
}
