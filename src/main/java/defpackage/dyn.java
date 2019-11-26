package defpackage;

import com.google.protos.youtube.api.innertube.LikeEndpointOuterClass$LikeEndpoint;

/* renamed from: dyn */
final /* synthetic */ class dyn implements bbnv {
    private final dyl a;
    private final apxu b;
    private final Object c;
    private final boolean d;
    private final LikeEndpointOuterClass$LikeEndpoint e;
    private final String f;

    dyn(dyl dyl, apxu apxu, Object obj, boolean z, LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint, String str) {
        this.a = dyl;
        this.b = apxu;
        this.c = obj;
        this.d = z;
        this.e = likeEndpointOuterClass$LikeEndpoint;
        this.f = str;
    }

    public final Object a(Object obj) {
        dyl dyl = this.a;
        apxu apxu = this.b;
        Object obj2 = this.c;
        boolean z = this.d;
        LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint = this.e;
        String str = this.f;
        xtl.a("Could not read Entity from the store: ", (Throwable) obj);
        return dyl.a(apxu, obj2, z, likeEndpointOuterClass$LikeEndpoint, str, null);
    }
}
